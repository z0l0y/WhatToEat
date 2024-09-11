package com.zoloy.whattoeat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoloy.whattoeat.entity.UserInfo;
import com.zoloy.whattoeat.mapper.UserInfoMapper;
import com.zoloy.whattoeat.service.IUserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
