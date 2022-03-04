package com.amirhusseinsoori.domain.repository

import com.amirhusseinsoori.domain.entity.DomainMoviesItem
import com.amirhusseinsoori.domain.exception.GrpcResult
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    fun getAllMovies(): Flow<GrpcResult<List<DomainMoviesItem>>>
}