package com.beyond.ordersystem.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberPasswordResetDto {
    private String email;
    private String asIsPassword;
    private String toBePassword;
}
