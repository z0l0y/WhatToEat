package com.zoloy.whattoeat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoloy.whattoeat.dto.Result;
import com.zoloy.whattoeat.entity.Follow;


public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
