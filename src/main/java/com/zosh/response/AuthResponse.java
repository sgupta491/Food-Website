package com.zosh.response;


import com.zosh.domain.USER_ROLE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;

}
