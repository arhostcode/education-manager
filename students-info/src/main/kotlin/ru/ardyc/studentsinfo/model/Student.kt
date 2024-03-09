package ru.ardyc.studentsinfo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Student(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    val name: String
//    @ManyToMany val courses: MutableList<Course> = mutableListOf(),
//    val marks: MutableList<StudentMark> = mutableListOf()
)

