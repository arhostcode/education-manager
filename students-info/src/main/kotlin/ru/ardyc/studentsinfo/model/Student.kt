package ru.ardyc.studentsinfo.model

import jakarta.persistence.*

@Entity
data class Student(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    @ManyToMany(fetch = FetchType.LAZY)
    var courses: MutableList<Course> = mutableListOf(),
    @OneToMany(fetch = FetchType.LAZY)
    var marks: MutableList<StudentMark> = mutableListOf()
)

