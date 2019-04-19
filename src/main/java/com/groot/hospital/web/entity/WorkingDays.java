package com.groot.hospital.web.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 每月每人各班次工作天数表
 * </p>
 *
 * @author groot
 * @since 2019-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkingDays implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 责任7-5
     */
    private Integer duty75;

    /**
     * 责任
     */
    private Integer duty;

    /**
     * 8-8责
     */
    private Integer duty88;

    /**
     * 值
     */
    private Integer watch;

    /**
     * 8-8值
     */
    private Integer watch88;

    /**
     * 药
     */
    private Integer medicine;

    /**
     * 8-8药
     */
    private Integer medicine88;

    /**
     * 监
     */
    private Integer custody;

    /**
     * 监8-8白
     */
    private Integer custodyDaytime88;

    /**
     * 夜8-8
     */
    private Integer night88;

    /**
     * 帮班
     */
    private Integer assist;

    /**
     * 监8-8夜
     */
    private Integer custodyNight88;

    /**
     * 辅8-8
     */
    private Integer complement88;

    /**
     * 辅7-5
     */
    private Integer complement75;

    /**
     * 护士
     */
    private Integer nurse;

    /**
     * 月份
     */
    private String month;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
