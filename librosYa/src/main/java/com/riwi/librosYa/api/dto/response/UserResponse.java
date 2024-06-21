package com.riwi.librosYa.api.dto.response;

import com.riwi.librosYa.util.enums.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String userName;
    private String email;
    private String fullName;
    private RoleUser role;
}
