package com.amirhusseinsoori.grpckotlin.data.mapper

import com.amirhusseinsoori.grpckotlin.domain.entity.DomainMoviesItem
import io.grpc.movienode.VideoListXModel


fun VideoListXModel.moviesItemMapToDomain(): DomainMoviesItem {
    return DomainMoviesItem(
        Description = description ?: "",
        ID = id ?: 0,
        Name = name ?: "",
        Picture = picture ?: "",
        Views = views ?: 0
    )
}
fun List<VideoListXModel> .moviesMapToDomain(): List<DomainMoviesItem> {
    return map { it.moviesItemMapToDomain() }
}