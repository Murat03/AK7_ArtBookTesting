package com.muratipek.ak7_artbooktesting.model

data class ImageResponse (
    val hits: List<ImageResult>,
    val total : Int,
    val totalHits : Int
        )