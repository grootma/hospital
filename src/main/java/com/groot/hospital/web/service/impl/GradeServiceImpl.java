package com.groot.hospital.web.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.groot.hospital.web.entity.Grade;
import com.groot.hospital.web.mapper.GradeMapper;
import com.groot.hospital.web.service.IGradeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 等级N1 N2 N3 服务实现类
 * </p>
 *
 * @author groot
 * @since 2019-04-16
 */
@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements IGradeService {

}
