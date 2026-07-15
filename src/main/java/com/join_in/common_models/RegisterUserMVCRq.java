package com.join_in.common_models;

public record RegisterUserMVCRq(
        String firstName,
        String lastName,
        String email,
        String password
) {
}