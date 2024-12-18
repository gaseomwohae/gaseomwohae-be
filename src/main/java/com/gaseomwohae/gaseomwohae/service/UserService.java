package com.gaseomwohae.gaseomwohae.service;

import com.gaseomwohae.gaseomwohae.dto.user.GetUserInfoResponseDto;
import com.gaseomwohae.gaseomwohae.dto.user.SignUpRequestDto;

public interface UserService {
	public void signUp(SignUpRequestDto signUpRequestDto);

	public GetUserInfoResponseDto getUserInfo(Long userId);
}
