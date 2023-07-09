package com.example.its.domain.isuue

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface IssueRepository {
    @Select("SELECT * FROM issues")
    fun findAll(): List<IssueEntity>

    @Insert("INSERT into issues (summary,description) values (#{summary}, #{description})")
    fun insert(summary: String?, description: String?)

    @Select("SELECT * FROM issues where id = #{issueId}")
    fun findById(issueId: Long): IssueEntity
}