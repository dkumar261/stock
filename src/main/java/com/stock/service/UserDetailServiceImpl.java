package com.stock.service;

import javax.annotation.Resource;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.stock.domain.UserDetail;
import com.stock.model.UserDetailModel;
import com.stock.repository.UserRepository;
import com.stock.util.EncryptionUtils;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Resource
	private UserRepository userRepository;

	@Resource
	private ModelMapper modelMapper;

	@Override
	public String createUser(UserDetailModel userDetailModel) {

		UserDetail userDetail = modelMapper.map(userDetailModel, UserDetail.class);
		if(!StringUtils.isEmpty(userDetail.getPassword())) {
			userDetail.setPassword(EncryptionUtils.getEncryptedPassword(userDetail.getPassword()));
		}
		return null;
	}
}
