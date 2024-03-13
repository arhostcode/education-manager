package ru.ardyc.studentsinfo.model

import jakarta.persistence.*

@Entity
data class Course(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    @ManyToMany(fetch = FetchType.LAZY)
    var students: MutableList<Student>,
    @OneToMany(fetch = FetchType.LAZY)
    var marks: MutableList<StudentMark>
)
