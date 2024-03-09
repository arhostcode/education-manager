package ru.ardyc.studentsinfo.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import ru.ardyc.studentsinfo.kafka.dto.StudentMarkResult

@Component
class KafkaConsumer {
    @KafkaListener(topics = ["main-students"], groupId = "main")
    fun listenStudentMark(message: StudentMarkResult) {
        println("Received Message: $message")
    }
}