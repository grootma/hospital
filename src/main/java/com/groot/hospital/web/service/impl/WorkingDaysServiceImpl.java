package com.groot.hospital.web.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.groot.hospital.web.entity.WorkingDays;
import com.groot.hospital.web.mapper.WorkingDaysMapper;
import com.groot.hospital.web.service.IWorkingDaysService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 每月每人各班次工作天数表 服务实现类
 * </p>
 *
 * @author groot
 * @since 2019-04-19
 */
@Service
public class WorkingDaysServiceImpl extends ServiceImpl<WorkingDaysMapper, WorkingDays> implements IWorkingDaysService {

}
