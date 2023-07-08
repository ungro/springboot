package com.example.its.web.issue

import com.example.its.domain.isuue.IssueEntity
import com.example.its.domain.isuue.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/issues")
class IssueController(
    @Autowired
    private val issueService: IssueService

) {
    @GetMapping
    fun showList(model: Model): String {
        model.addAttribute("issueList", issueService.findAll())
        return "issues/list"
    }

    @GetMapping("/creationForm")
    fun register(@ModelAttribute form: IssueForm): String {
        return "issues/creationForm"
    }

    @PostMapping
    fun create(model: Model, form: IssueForm): String {
        return showList(model)
    }
}