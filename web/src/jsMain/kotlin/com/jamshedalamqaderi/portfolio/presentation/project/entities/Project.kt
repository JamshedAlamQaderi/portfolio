package com.jamshedalamqaderi.portfolio.presentation.project.entities

sealed class Project {
    data class Tags(val tags: List<String>) : Project()
    data class Name(val value: String) : Project()
    data class Banner(val url: String) : Project()
    data class Screenshots(val urls: List<String>) : Project()
    data class SectionHeader(val text: String) : Project()
    data class SectionBody(val text: String) : Project()
    data class Link(val placeholder: String, val url: String) : Project()
}
