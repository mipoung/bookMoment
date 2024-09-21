package com.bookMoment.service;

import java.util.List;

import com.bookMoment.dto.UserDTO;

public interface UserService {

	List<UserDTO> selectAllUserInfo();

}
