package cn.wzs.wblog.common.utils;

public class StringUtils {

    public static boolean isNotEmpty(String str) {
        return str != null && str.length() == 0;
    }

    public static boolean isEmpty(String str) {
        return !isNotEmpty(str);
    }

    public static boolean isNotBlank(String str) {
        if (isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlank(String str) {
        return !isNotBlank(str);
    }
}
