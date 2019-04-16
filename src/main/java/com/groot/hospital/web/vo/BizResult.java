package com.groot.hospital.web.vo;


/**
 * 统一返回结果集
 *
 * @author groot
 * @version 2017-11-29 10:37:59
 */
public class BizResult<T> extends ResultBean<ErrorCode, T> {

    private static final long serialVersionUID = 1L;

    public BizResult() {
        super();
    }

    public BizResult(ErrorType errorType) {
        super(errorType);
    }

    public BizResult(T data) {
        super(true, ErrorType.BIZ_SUCCESS, ErrorType.BIZ_SUCCESS.getMsg(), data);
    }
}
