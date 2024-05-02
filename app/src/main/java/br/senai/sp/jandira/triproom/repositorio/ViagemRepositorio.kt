package br.senai.sp.jandira.triproom.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {
    @Composable
    fun listarTodasAsViagens(): List <Viagem> {

        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
            dataChegada = LocalDate.of(2019,2 ,18),
            dataPartida = LocalDate.of(2019,2 ,21),
            imagem = painterResource(id = R.drawable.london)
        )
        val porto = Viagem(
            id = 2,
            destino = "Porto",
            descricao = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
            dataChegada = LocalDate.of(2024,10 ,7),
            dataPartida = LocalDate.of(2024,10 ,29),
            imagem = painterResource(id = R.drawable.porto)
        )


        return listOf(londres, porto)
    }
}