package com.bookMoment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookMoment.dto.MainDTO;
import com.bookMoment.mapper.MainMapper;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	MainMapper mainMapper;

	@Override
	public List<MainDTO> test() {
		return mainMapper.mainTest();
	}
	

}
