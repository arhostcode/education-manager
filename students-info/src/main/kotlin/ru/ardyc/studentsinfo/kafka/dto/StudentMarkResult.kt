package ru.ardyc.studentsinfo.kafka.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class StudentMarkResult(
    @JsonProperty("student_id") val studentId: Long,
    @JsonProperty("course_id") val courseId: Long,
    val mark: Int
)