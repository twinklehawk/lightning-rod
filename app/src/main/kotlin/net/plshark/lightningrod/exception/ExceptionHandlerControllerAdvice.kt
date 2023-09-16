package net.plshark.lightningrod.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@ControllerAdvice
class ExceptionHandlerControllerAdvice : ResponseEntityExceptionHandler() {

    @ExceptionHandler(BadRequestException::class)
    fun handleBadRequestException(
        ex: BadRequestException,
        exchange: ServerWebExchange,
    ): Mono<ResponseEntity<Any>> {
        val status = HttpStatus.BAD_REQUEST
        val detail = createProblemDetail(
            ex,
            status,
            ex.message ?: "Invalid request",
            null,
            null,
            exchange
        )
        return createResponseEntity(detail, null, status, exchange)
    }
}
