package com.ss.texturerender;

import android.text.TextUtils;

public class TextureRenderHelper {
    public static Class<?> getClzUsingPluginLoader(int i, String str) throws Exception {
        if (i < 0 || TextUtils.isEmpty(str)) {
            throw new Exception("pluginName or/and className is empty");
        }
        ClassLoader classLoader = TextureRenderConfig.getClassLoader(i);
        if (classLoader == null) {
            return Class.forName(str);
        }
        return Class.forName(str, true, classLoader);
    }
}
