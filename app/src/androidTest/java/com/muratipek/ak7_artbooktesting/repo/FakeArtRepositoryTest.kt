package com.muratipek.ak7_artbooktesting.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.muratipek.ak7_artbooktesting.model.Art
import com.muratipek.ak7_artbooktesting.model.ImageResponse
import com.muratipek.ak7_artbooktesting.util.Resource

class FakeArtRepositoryTest: ArtRepositoryInterface {
    private val arts = mutableListOf<Art>()
    private val artsLiveData = MutableLiveData<List<Art>>(arts)

    override suspend fun insertArt(art: Art) {
        arts.add(art)
    }

    override suspend fun deleteArt(art: Art) {
        arts.remove(art)
    }

    override fun getArt(): LiveData<List<Art>> {
        return artsLiveData
    }

    override suspend fun searchImage(imageString: String): Resource<ImageResponse> {
        return Resource.success(ImageResponse(listOf(),0,0))
    }
}