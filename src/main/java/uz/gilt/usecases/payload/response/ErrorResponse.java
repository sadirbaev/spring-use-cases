package uz.gilt.usecases.payload.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private String timestamp;
    private int status;
    private int code = 0;
    private String error;
    private String message;
    private String path;

    public ErrorResponse(HttpStatus httpStatus, String message, String path) {
        this.timestamp = new Date().toString();
        this.error = httpStatus.getReasonPhrase();
        this.status = httpStatus.value();
        this.message = message;
        this.path = path;
    }
}