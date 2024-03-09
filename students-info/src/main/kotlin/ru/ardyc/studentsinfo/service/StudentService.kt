package ru.ardyc.studentsinfo.service

import ru.ardyc.studentsinfo.dto.CreateStudentRequest
import ru.ardyc.studentsinfo.model.Course
import ru.ardyc.studentsinfo.model.Student
import ru.ardyc.studentsinfo.model.StudentMark

interface StudentService {

    fun registerStudent(createStudentRequest: CreateStudentRequest): Student

    fun registerStudentOnCourse(student: Student, course: Course): Student

    fun expelStudent(student: Student): Student

    fun addMark(student: Student, course: Course, mark: Int)

    fun getStudentMarks(student: Student): List<StudentMark>
}
