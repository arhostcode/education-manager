package ru.ardyc.studentsinfo.service.impl

import org.springframework.stereotype.Service
import ru.ardyc.studentsinfo.dto.CreateStudentRequest
import ru.ardyc.studentsinfo.dto.StudentResponse
import ru.ardyc.studentsinfo.model.Course
import ru.ardyc.studentsinfo.model.Student
import ru.ardyc.studentsinfo.model.StudentMark
import ru.ardyc.studentsinfo.repository.StudentRepository
import ru.ardyc.studentsinfo.service.StudentService

@Service
class DefaultStudentService(private val studentRepository: StudentRepository) : StudentService {
    override fun registerStudent(createStudentRequest: CreateStudentRequest): Student {
        val student = Student(name = createStudentRequest.name)
            .run { studentRepository.save(this) }
        return student
    }

    override fun registerStudentOnCourse(student: Student, course: Course): Student {
        TODO("Not yet implemented")
    }

    override fun expelStudent(student: Student): Student {
        TODO("Not yet implemented")
    }

    override fun addMark(student: Student, course: Course, mark: Int) {
        TODO("Not yet implemented")
    }

    override fun getStudentMarks(student: Student): List<StudentMark> {
        TODO("Not yet implemented")
    }

    override fun getStudent(id: Long): StudentResponse {
        return StudentResponse(id = id, name = "some name", courses = mutableListOf(), marks = mutableListOf())
    }
}