package ru.ardyc.studentsinfo.dto

import ru.ardyc.studentsinfo.model.Course
import ru.ardyc.studentsinfo.model.Student

class StudentMarkResponse(
    var id: Long? = null,
    var student: Student,
    var course: Course,
    var mark: Int
)
