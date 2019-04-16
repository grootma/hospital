package com.groot.hospital.common.utils;


import com.groot.hospital.web.vo.BizResult;
import com.groot.hospital.web.vo.ErrorCode;
import com.groot.hospital.web.vo.ErrorType;
import com.groot.hospital.web.vo.ResultVO;

/**
 * 统一返回数据工具类
 * @ClassName: ResultUtil.java
 * @Description:
 * @version: v1.0.0
 * @author: groot
 * @date: 2018年09月12日 17:52
 */
public class ResultUtil {

    public static <T> ResultVO<T> success() {
        return new ResultVO<>(ErrorType.BIZ_SUCCESS);
    }

    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> result = success();
        result.setData(data);
        return result;
    }

    public static <T> ResultVO<T> success(BizResult<T> bizResult) {
        ResultVO<T> result = new ResultVO<>();
        if (bizResult == null) {
            result = error(ErrorType.BIZ_ERROR);
        } else {
            result.setCode(bizResult.getErrorCode().getCode());
            result.setMsg(bizResult.getErrorMsg());
            result.setData(bizResult.getData());
        }
        return result;
    }

    public static <T> ResultVO<T> error(ErrorCode errorCode) {
        return new ResultVO<>(errorCode);
    }

    public static <T> ResultVO<T> error(ErrorCode errorCode, String msg) {
        return new ResultVO<>(errorCode, msg);
    }

    public static <T> ResultVO<T> error(String msg) {
        return new ResultVO<>(ErrorType.BIZ_ERROR, msg);
    }

//    public static <T> ResultVO<T> error(ErrorCode.java errorCode, Throwable t) {
//        ResultVO<T> result = new ResultVO<>(errorCode);
//        result.setTrace(ExceptionUtil.getTrace(t));
//        return result;
//    }
//
//    public static <T> ResultVO<T> error(ErrorCode.java errorCode, String msg,
//                                        Throwable t) {
//        ResultVO<T> result = new ResultVO<>(errorCode, msg);
//        result.setTrace(ExceptionUtil.getTrace(t));
//        return result;
//    }

}
