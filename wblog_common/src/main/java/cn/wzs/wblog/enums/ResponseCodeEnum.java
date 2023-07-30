package cn.wzs.wblog.enums;

/**
 * 响应码
 */
public enum ResponseCodeEnum {

    SUCCESS(200, "成功"),

    ERROR(500, "失败")
    ;

    ResponseCodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    private final Integer code;
    private final String description;

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
