package com.heltonbustos.ejemploviewmodelmvvmapi03.repository.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NoticiasAPIService {

    @GET("news?access_key=6fa41be714b8cd55eb571b7a5dd6440b&countries=cl")
    fun obtenerNoticias(@Query("languajes") languajes: String): Call<Noticias>

}