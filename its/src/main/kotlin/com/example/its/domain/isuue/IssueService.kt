package com.example.its.domain.isuue

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(
    private val issueRepository: IssueRepository
) {
    fun findAll(): List<IssueEntity> {
        return issueRepository.findAll()
    }

    @Transactional
    fun create(summary: String?, description: String?) {
        issueRepository.insert(summary, description)
    }

    fun findById(issueId: Long): IssueEntity {
        return issueRepository.findById(issueId)
    }

    @Transactional
    fun deleteIssue(issueId: Long) {
        return issueRepository.deleteIssue(issueId)
    }
}