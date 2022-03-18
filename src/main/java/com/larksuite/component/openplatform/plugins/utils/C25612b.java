package com.larksuite.component.openplatform.plugins.utils;

import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.component.openplatform.plugins.utils.b */
public class C25612b {
    /* renamed from: a */
    public static Class<?> m91381a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Log.m165397w("PluginUtils", "cls not found!! classPath:" + str);
            return null;
        }
    }
}
