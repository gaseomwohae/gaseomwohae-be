package com.gaseomwohae.gaseomwohae.util.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

	INVALID_CREDENTIALS(401, "Invalid email or password"),
	UNAUTHORIZED(401, "Unauthorized access"),
	TOKEN_EXPIRED(401, "토큰이 만료되었습니다"),
	INVALID_TOKEN(403, "유효하지 않은 토큰입니다"),

	RESOURCE_NOT_FOUND(404, "Resource not found"),

	INVALID_INPUT(400, "Invalid input"),
	INTERNAL_SERVER_ERROR(500, "Internal server error"),

	DUPLICATE_EMAIL(400, "Duplicate email");

	private final Integer code;
	private final String message;
}
