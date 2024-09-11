package com.zoloy.whattoeat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoloy.whattoeat.dto.Result;
import com.zoloy.whattoeat.entity.Blog;


public interface IBlogService extends IService<Blog> {

    Result queryHotBlog(Integer current);

    Result queryBlogById(Long id);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);

}
