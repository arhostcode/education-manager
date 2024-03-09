package ru.ardyc.studentsinfo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentsInfoApplication

fun main(args: Array<String>) {
    runApplication<StudentsInfoApplication>(*args)
}
