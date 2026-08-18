package repositorio

import enumeradores.Cor
import enumeradores.Formato
import enumeradores.Material
import produto.CaixaDaAgua
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import kotlin.use

class JPA(

    val user: String = "postgres",
    val senha: String = "postgres",
    val url: String = "jdbc:postgresql://localhost:5432/caixaDaAgua",
) {

    private fun conectar(): Connection =
        DriverManager.getConnection(url, user, senha)


    fun salvar(caixa: CaixaDaAgua): Int? {
        val sql = """
                INSERT INTO caixa_da_agua (
                marca, modelo, cor, material, formato, preco, altura, largura, profundidade )
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                RETURNING id
            """.trimIndent()

        try {
            conectar().use { conexao ->
                conexao.prepareStatement(sql).use { comando ->
                    comando.setString(1, caixa.marca)
                    comando.setString(2, caixa.modelo)
                    comando.setInt(3, caixa.cor.ordinal)
                    comando.setInt(4, caixa.material.ordinal)
                    comando.setInt(5, caixa.formato.ordinal)
                    comando.setBigDecimal(6, caixa.preco)
                    comando.setDouble(7, caixa.altura)
                    comando.setDouble(8, caixa.largura)
                    comando.setDouble(9, caixa.profundidade)

                    comando.executeQuery().use { resultado ->
                        if (resultado.next()) return resultado.getInt("id")
                    }
                }
            }
        } catch (e: SQLException) {
            println("Erro ao salvar: ${e.message}")
        }

        return null
    }

    fun listar(): List<CaixaDaAgua> {

        val caixas = mutableListOf<CaixaDaAgua>()
        val sql = """
            SELECT id, marca, modelo, cor, material, formato, preco, altura, largura, profundidade
            FROM caixa_da_agua
            ORDER BY id
            """.trimIndent()

        try {
            conectar().use { conexao ->
                conexao.prepareStatement(sql).use { comando ->
                    comando.executeQuery().use { resultado ->
                        while (resultado.next()) {
                            caixas += CaixaDaAgua(
                                id = resultado.getInt("id"),
                                marca = resultado.getString("marca"),
                                modelo = resultado.getString("modelo"),
                                cor = Cor.entries[resultado.getInt("cor")],
                                material = Material.entries[resultado.getInt("material")],
                                formato = Formato.entries[resultado.getInt("formato")],
                                preco = resultado.getBigDecimal("preco"),
                                altura = resultado.getDouble("altura"),
                                largura = resultado.getDouble("largura"),
                                profundidade = resultado.getDouble("profundidade")
                            )
                        }
                    }
                }
            }
        } catch (e: SQLException) {
            println("Erro ao listar: ${e.message}")
        }

        return caixas
    }

    fun remover() {}
}