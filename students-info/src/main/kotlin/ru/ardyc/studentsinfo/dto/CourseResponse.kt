package ru.ardyc.studentsinfo.dto

import ru.ardyc.studentsinfo.model.Student
import ru.ardyc.studentsinfo.model.StudentMark

class CourseResponse(
    var id: Long? = null,
    var name: String,
    var students: MutableList<Student>,
    var marks: MutableList<StudentMark>
)
