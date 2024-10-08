## 项目简介

**一个以用户点评为主要内容的本地生活服务平台。**

实现了**登录注册，点赞排行，发布博客，好友关注，优惠卷秒杀，用户签到**等功能。

用户在登录之后，可以给别人的帖子点赞，关注别人，也可以查询附近商户，抢优惠卷，在体验完对应商户的美食之后可以发表对于该商户的评价贴。同时还实现了用户的签到功能，增加了用户的粘性和活跃度。

## 写这个项目的目的

当时写本项目主要是用来练一下手，属于以前写的早期项目了。

其实项目本身有很多可以优化的地方：

- 比如可以构建多级缓存，加一层**本地缓存Caffeine**
- 可以加一层**数据校验层Validation**，不允许不合法数据污染数据库
- 用户头像可以改用**OSS云存储**
- 部分自己写的不好的工具可以用**Hutool替换**
- 对于发表的评论可以用**sensitive-word做敏感词检测**
- 秒杀部分可以加上**MQ异步处理**
- 缓存穿透部分可以采用**布隆过滤**实现
- 部分代码可以考虑使用**设计模式**优化一下

之后有时间了可能会把这个仓库的代码优化扩展一下。

## 怎样使用这个项目

直接clone就行了，记得改一下配置就行

```git
git clone git@github.com:z0l0y/WhatToEat.git
```

