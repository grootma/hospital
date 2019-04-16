package com.groot.hospital.web.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.groot.hospital.web.entity.Shifts;
import com.groot.hospital.web.mapper.ShiftsMapper;
import com.groot.hospital.web.service.IShiftsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * shifts 班制 服务实现类
 * </p>
 *
 * @author groot
 * @since 2019-04-16
 */
@Service
public class ShiftsServiceImpl extends ServiceImpl<ShiftsMapper, Shifts> implements IShiftsService {

}
