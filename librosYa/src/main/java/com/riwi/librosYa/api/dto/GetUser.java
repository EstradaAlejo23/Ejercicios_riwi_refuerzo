package com.riwi.librosYa.api.dto;

import com.riwi.librosYa.util.enums.RoleUser;

public class GetUser {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private RoleUser role;
}
