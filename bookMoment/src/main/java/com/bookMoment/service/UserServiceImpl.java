package com.bookMoment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMoment.dto.UserDTO;
import com.bookMoment.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	// 의존성 주입
	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserDTO> selectAllUserInfo() {
		return userMapper.selectAllUserInfo();
	}
	

}
