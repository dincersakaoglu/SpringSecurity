package com.dangercode.basic.auth.dto;

import com.dangercode.basic.auth.model.Role;
import lombok.Builder;

import java.util.Set;

/*
@Builder
public record CreateUserRequest (
        String name,
        String username,
        String password,
        Set<Role> authorities
){
}
 */

public class CreateUserRequest {

    private String name;
    private String username;
    private String password;
    private Set<Role> authorities;

    private CreateUserRequest() {
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getAuthorities() {
        return authorities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private CreateUserRequest request = new CreateUserRequest();

        private Builder() {
        }

        public Builder name(String name) {
            request.name = name;
            return this;
        }

        public Builder username(String username) {
            request.username = username;
            return this;
        }

        public Builder password(String password) {
            request.password = password;
            return this;
        }

        public Builder authorities(Set<Role> authorities) {
            request.authorities = authorities;
            return this;
        }

        public CreateUserRequest build() {
            return request;
        }
    }
}

