package com.groot.hospital.common.log.service;

import com.groot.hospital.common.log.entity.SysLogBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SysLogService {

//    private static final Logger logger = LoggerFactory
//            .getLogger(SysLogService.class);
    public boolean save(SysLogBO sysLogBO){
        // 这里就不做具体实现了
        log.info(sysLogBO.getParams());
        return true;
    }
}
