package com.example.its.domain.isuue

import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface IssueRepository {
    @Select(
        """
        SELECT * FROM issues
        """
    )
    fun findAll(): List<IssueEntity>
}