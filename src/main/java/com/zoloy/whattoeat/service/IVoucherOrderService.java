package com.zoloy.whattoeat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoloy.whattoeat.dto.Result;
import com.zoloy.whattoeat.entity.VoucherOrder;

public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
}
