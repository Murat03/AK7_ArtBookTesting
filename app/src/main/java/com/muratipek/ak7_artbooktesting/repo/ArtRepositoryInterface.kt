package com.muratipek.ak7_artbooktesting.repo

import androidx.lifecycle.LiveData
import com.muratipek.ak7_artbooktesting.model.Art
import com.muratipek.ak7_artbooktesting.model.ImageResponse
import com.muratipek.ak7_artbooktesting.util.Resource

interface ArtRepositoryInterface {
    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}