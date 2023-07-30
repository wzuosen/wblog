package cn.wzs.wblog.common.base;

import lombok.Data;

/**
 * 基础分页参数类
 */
@Data
public class BasePage {

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 页数据量
     */
    private Integer pageSize;
}
