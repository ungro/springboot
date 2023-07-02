package com.example.its.domain.isuue

import org.apache.ibatis.annotations.Mapper

data class IssueEntity(
    val id: Long,
    val summary: String,
    val description: String
)