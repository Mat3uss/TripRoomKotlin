package br.senai.sp.jandira.triproom.repositorio

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.triproom.model.Categoria

class CategoriaRepositorio {
    @Composable
    fun listarTodasAsCategorias(): List<Categoria> {
        val montain = Categoria(
            id = 1,
            nome = "Montain",
            icone = Icons.Default.Landscape
        )
        val snow = Categoria(
            id = 2,
            nome = "Snow",
            icone = Icons.Default.Snowboarding
        )
        val beach = Categoria(
            id = 3,
            nome = "Beach",
            icone = Icons.Default.BeachAccess
        )

        return listOf(montain,snow, beach)
    }
}