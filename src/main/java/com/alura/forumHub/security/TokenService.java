//package com.alura.forumHub.security;
//
//
//import org.springframework.stereotype.Service;
//import java.util.Date;
//
//@Service
//public class TokenService {
//
//    private static final String SECRET_KEY = "secret-key";
//
//    public String gerarToken(String username) {
//        return JWT.create()
//                .withSubject(username)
//                .withExpiresAt(new Date(System.currentTimeMillis() + 3600000)) // 1 hora
//                .sign(Algorithm.HMAC256(SECRET_KEY));
//    }
//}
