package com.groot.hospital.web.vo;

/**
 * 错误类型
 * <p>
 * Copyright: Copyright (c) 2018 zteits
 *
 * @ClassName: ErrorType.java
 * @Description:
 * @version: v1.0.0
 * @author: groot
 * @date: 2018年10月20日 13:42
 */
public enum ErrorType implements ErrorCode {

    AUTH_NOT_EXISTS("2000", "账号不存在"),
    AUTH_PASS_ERROR("2001", "账号密码不匹配"),
    AUTH_IMG_CODE_ERROR("2002", "验证码错误"),
    AUTH_TOKEN_NOT_EXISTS("2003", "授权令牌不存在或已失效"),
    AUTH_TOKEN_ILLEGAL("2004", "授权令牌不合法"),
    AUTH_NO_RIGHT("2005", "没有权限，请联系管理员授权"),
    AUTH_EXPIRE("2006", "账号过期，请联系管理员"),
    AUTH_STATE_ILLEGALITY("2009","账号状态异常"),

    AUTH_TOKEN_EXPIRED("3001", "token过期"),
    AUTH_TOKEN_ERROR("3002", "token验证失败"),

    SC_UNAUTHORIZED("401", "token过期"),
    AUTH_ERROR("401", "认证校验异常"),

    SYSTEM_ERROR("1000", "系统错误"),
    APP_ERROR("1001", "应用错误"),
    BIZ_ERROR("1002", "业务错误:%s"),
    PARAM_NULL("1003", "入参不能为空:[%s]"),
    OBJECT_NOT_EXISTS("1004", "对象不存在:[%s]"),
    OBJECT_BELONG_ERROR("1005", "对象归属错误:[%s]"),
    RESOURCE_NOT_EXISTS("1006", "访问的资源不存在"),
    PARAM_NOT_VALID("1007", "参数校验失败:%s"),

    DUBBO_RPC_ERROR("911", "Dubbo服务异常，请联系管理员"),

    CODE_REPEAT("5001", "编号重复:[%s]"),

    UPLOAD_ERROR("6001", "附件上传错误:%s"),

    DB_DUPLICATE_KEY("4001", "数据库中已存在该记录"),

    BIZ_SUCCESS("8888", "成功");

    private String code;
    private String msg;

    private ErrorType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

}
