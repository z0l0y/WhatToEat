package com.zoloy.whattoeat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zoloy.whattoeat.entity.ShopType;
import com.zoloy.whattoeat.mapper.ShopTypeMapper;
import com.zoloy.whattoeat.service.IShopTypeService;
import org.springframework.stereotype.Service;

@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

}
