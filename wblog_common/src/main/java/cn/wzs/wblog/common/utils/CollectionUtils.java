package cn.wzs.wblog.common.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection<?> collection) {
        return !isNotEmpty(collection);
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return collection != null && collection.size() > 0;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return !isNotEmpty(map);
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return map != null && map.size() > 0;
    }
}
