package com.example.its.web.issue

import com.example.its.domain.isuue.IssueEntity
import com.example.its.domain.isuue.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/issues")
class IssueController(
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
    fun create(model: Model, @Validated form: IssueForm, result: BindingResult): String {

        if (result.hasErrors()) {
            return register(form)
        }

        issueService.create(form.summary, form.description)
        return "redirect:/issues"
    }

    @GetMapping("/{issueId}")
    fun showDetail(@PathVariable("issueId") issueId: Long, model: Model): String {

        model.addAttribute("issues", issueService.findById(issueId))
        return "issues/detail"
    }
}