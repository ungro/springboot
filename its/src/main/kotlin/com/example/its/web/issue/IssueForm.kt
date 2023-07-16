package com.example.its.web.issue

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import kotlin.math.max

data class IssueForm(
    @field:NotBlank
    @field:Size(max=256)
    val summary: String?,

    @field:NotBlank
    @field:Size(max=256)
    val description: String?
)
