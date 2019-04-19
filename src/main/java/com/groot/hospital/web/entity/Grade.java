package com.groot.hospital.web.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 等级N1 N2 N3
 * </p>
 *
 * @author groot
 * @since 2019-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Grade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 等级名称
     */
    private String name;

    /**
     * 等级系数
     */
    private BigDecimal coefficient;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
