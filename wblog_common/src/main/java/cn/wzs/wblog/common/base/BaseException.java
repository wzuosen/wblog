package cn.wzs.wblog.common.base;

/**
 * 基础异常类
 */
public class BaseException extends Exception{

    public BaseException(String description){
        super(description);
    }

    public BaseException(Throwable throwable){
        super(throwable);
    }
}
