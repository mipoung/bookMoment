package com.bookMoment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bookMoment.dto.UserDTO;

@Mapper
public interface UserMapper {

	List<UserDTO> selectAllUserInfo();

}
