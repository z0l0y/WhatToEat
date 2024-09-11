package com.zoloy.whattoeat.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoloy.whattoeat.entity.BlogComments;
import com.zoloy.whattoeat.mapper.BlogCommentsMapper;
import com.zoloy.whattoeat.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
