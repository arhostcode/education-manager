package ru.ardyc.studentsinfo.model

data class Course(val id: Long, val name: String, val students: MutableList<Student>)
