package uz.gilt.usecases.service;

import uz.gilt.usecases.payload.request.SignInRequest;
import uz.gilt.usecases.payload.response.JwtResponse;

public interface AuthService {
    JwtResponse signIn(SignInRequest request);
}
