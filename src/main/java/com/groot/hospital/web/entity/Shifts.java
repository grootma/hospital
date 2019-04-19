package com.groot.hospital.web.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * shifts 班制
 * </p>
 * @author groot
 * @since 2019-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Shifts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 班制名称
     */
    private String name;

    /**
     * 班次系数
     */
    private BigDecimal coefficient;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
