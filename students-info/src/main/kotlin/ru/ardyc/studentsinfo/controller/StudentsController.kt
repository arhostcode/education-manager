package ru.ardyc.studentsinfo.controller

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import ru.ardyc.studentsinfo.dto.StudentResponse
import ru.ardyc.studentsinfo.service.StudentService

@Controller
class StudentsController(val studentService: StudentService) {

    @QueryMapping
    fun studentById(@Argument id: Long): StudentResponse {
        return studentService.getStudent(id)
    }

}