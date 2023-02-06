package uz.gilt.usecases.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {
    private String token;
    private String username;
    private List<String> roles = new ArrayList<>();
}
