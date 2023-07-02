package com.example.its.web.issue

import com.example.its.domain.isuue.IssueEntity
import com.example.its.domain.isuue.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IssueController (
    @Autowired
    private val issueService: IssueService

        ) {
    @GetMapping("/issues")
    fun showList(model:Model): String {
        model.addAttribute("issueList", issueService.findAll())
        return "issues/list"
    }
}