package com.example.peliculas.domain.models

import com.example.peliculas.data.datasource.onject_modules.Repository
import javax.inject.Inject

class DaoPeliculas @Inject constructor(): PeliculasRepository {
    companion object {
        val myDao: DaoPeliculas by lazy {
            DaoPeliculas()
        }
    }
    fun getDataPelis(): List<Peliculas> = Repository.listaPelis
    override fun obtenerPeliculas(): List<Peliculas> {
      return getDataPelis()
    }
}
