package ru.ardyc.studentsinfo.model

import jakarta.persistence.*

@Entity
data class StudentMark(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    var student: Student,
    @ManyToOne(fetch = FetchType.LAZY)
    var course: Course,
    var mark: Int
)