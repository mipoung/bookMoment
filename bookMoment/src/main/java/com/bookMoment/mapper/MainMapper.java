package com.bookMoment.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bookMoment.dto.MainDTO;


@Mapper
public interface MainMapper {

	List<MainDTO> mainTest();

}
