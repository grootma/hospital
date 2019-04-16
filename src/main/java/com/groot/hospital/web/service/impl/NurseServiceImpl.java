package com.groot.hospital.web.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.groot.hospital.web.entity.Nurse;
import com.groot.hospital.web.mapper.NurseMapper;
import com.groot.hospital.web.service.INurseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 护士 服务实现类
 * </p>
 *
 * @author groot
 * @since 2019-04-16
 */
@Service
public class NurseServiceImpl extends ServiceImpl<NurseMapper, Nurse> implements INurseService {

}
