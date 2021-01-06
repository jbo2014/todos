package com.bam.todos.exception;

import com.bam.todos.model.JResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UnifiedExceptionHandler<T> {
//    @ResponseStatus(HttpStatus.OK)
//    public JResult UnifiedExceptionHandler(){
//        return new JResult(true, CodeAndMsg.SUCCESS, null);
//    }
//
//    @ResponseStatus(HttpStatus.OK)
//    public JResult sendSuccessResponse(T data) {
//        return new CallResultMsg(true, CodeAndMsg.SUCCESS, data);
//    }
//
//    @ExceptionHandler(UserDefinedException.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public CallResultMsg sendErrorResponse_UserDefined(Exception exception){
//        return new CallResultMsg(false, ((UserDefinedException)exception).getException(), null);
//    }
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public CallResultMsg sendErrorResponse_System(Exception exception){
//        if (exception instanceof UserDefinedException) {
//            return this.sendErrorResponse_UserDefined(exception);
//        }
//
//        return new CallResultMsg(false, CodeAndMsg.UNKNOWEXCEPTION, null);
//    }
}
