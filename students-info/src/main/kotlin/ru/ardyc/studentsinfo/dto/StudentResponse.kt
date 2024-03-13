package ru.ardyc.studentsinfo.dto

data class StudentResponse(
    var id: Long? = null,
    var name: String,
    var courses: MutableList<CourseResponse> = mutableListOf(),
    var marks: MutableList<StudentMarkResponse> = mutableListOf()
)