package com.muratipek.ak7_artbooktesting.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*
import com.muratipek.ak7_artbooktesting.model.Art

@Dao
interface ArtDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArt(art: Art)

    @Delete
    suspend fun deleteArt(art: Art)

    @Query("SELECT * FROM arts")
    fun observeArts():  LiveData<List<Art>>
}