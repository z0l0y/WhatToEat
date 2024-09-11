package com.zoloy.whattoeat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoloy.whattoeat.dto.Result;
import com.zoloy.whattoeat.entity.Shop;

public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
