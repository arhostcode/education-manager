package ru.ardyc.studentsinfo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.ardyc.studentsinfo.model.Student

@Repository
interface StudentRepository : CrudRepository<Student, Long> {

    fun findByName(name: String): Student


}