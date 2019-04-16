package com.groot.hospital.common.log.entity;


import lombok.Data;

@Data
public class SysLogBO {

    private String className;

    private String methodName;

    private String params;

    private Long exeuTime;

    private String remark;

    private String createDate;
}
