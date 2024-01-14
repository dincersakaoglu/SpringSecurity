package com.dangercode.jwt.auth.dto;

public record AuthRequest (
        String username,
        String password
){
}
