package com.heltonbustos.ejemploviewmodelmvvmapi03.repository.interactor

import com.heltonbustos.ejemploviewmodelmvvmapi03.repository.retrofit.Noticias
import com.heltonbustos.ejemploviewmodelmvvmapi03.repository.retrofit.NoticiasAPIService
import com.heltonbustos.ejemploviewmodelmvvmapi03.repository.retrofit.RestEngine
import retrofit2.Call

class NoticiasInteractor {

    fun traerRespuesta(languages: String): Noticias?{
        val llamada: NoticiasAPIService =
            RestEngine.getRestEngine().create(NoticiasAPIService::class.java)
        val resultado: Call<Noticias> = llamada.obtenerNoticias(languages)
        val p: Noticias? = resultado.execute().body()

        return p
    }

}