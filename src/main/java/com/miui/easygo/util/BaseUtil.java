package com.miui.easygo.util;

class BaseUtil {
    BaseUtil() {
    }

    public static boolean isNullOrEmpty(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == null || strArr[i].isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
