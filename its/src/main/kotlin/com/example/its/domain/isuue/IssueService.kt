package com.example.its.domain.isuue

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IssueService(
    @Autowired
    val issueRepository: IssueRepository
) {

    fun findAll() : List<IssueEntity>{
        return  issueRepository.findAll()
    }
}