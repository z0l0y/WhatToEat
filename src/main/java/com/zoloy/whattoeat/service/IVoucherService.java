package com.zoloy.whattoeat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoloy.whattoeat.dto.Result;
import com.zoloy.whattoeat.entity.Voucher;

public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
