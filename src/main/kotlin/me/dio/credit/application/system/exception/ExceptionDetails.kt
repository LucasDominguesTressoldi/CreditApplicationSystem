package me.dio.credit.application.system.exception

import java.time.LocalDateTime

class ExceptionDetails(
    val title: String,
    val timestamp: LocalDateTime,
    val status: Int,
    val exception: String,
    val details: MutableMap<String, String?>
) {
}