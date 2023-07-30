package cn.wzs.wblog.common.base;

import cn.wzs.wblog.common.enums.ResponseCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 基础响应值
 *
 * @param <T> 泛型类型
 */
@Data
public class BaseResult<T> implements Serializable {

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 响应数据
     */
    private T data;


    public static <T> BaseResult<T> createSuccess() {
        return createSuccess(null, ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getDescription());
    }

    public static <T> BaseResult<T> createSuccess(T data) {
        return createSuccess(data, ResponseCodeEnum.SUCCESS.getCode(), null);
    }

    public static <T> BaseResult<T> createSuccess(T data, Integer code) {
        return createSuccess(data, code, null);
    }

    public static <T> BaseResult<T> createError() {
        return createError(null, ResponseCodeEnum.ERROR.getCode(), ResponseCodeEnum.ERROR.getDescription());
    }

    public static <T> BaseResult<T> createError(String msg) {
        return createError(null, ResponseCodeEnum.ERROR.getCode(), msg);
    }

    public static <T> BaseResult<T> createError(Integer code, String msg) {
        return createError(null, code, msg);
    }

    public static <T> BaseResult<T> createSuccess(T data, Integer code, String msg) {
        BaseResult<T> result = new BaseResult<>();
        result.setData(data);
        result.setSuccess(Boolean.TRUE);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


    public static <T> BaseResult<T> createError(T data, Integer code, String msg) {
        BaseResult<T> result = new BaseResult<>();
        result.setData(data);
        result.setSuccess(Boolean.FALSE);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
