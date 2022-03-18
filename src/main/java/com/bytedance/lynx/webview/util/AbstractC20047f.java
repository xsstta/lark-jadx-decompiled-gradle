package com.bytedance.lynx.webview.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.lynx.webview.util.f */
public abstract class AbstractC20047f {
    /* renamed from: a */
    public static Map<String, Method> m73157a(Class<?> cls, String str) {
        Method method;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls2 == null) {
                return new HashMap();
            }
            Method[] methods = cls.getMethods();
            for (Method method2 : methods) {
                try {
                    String name = method2.getName();
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if (parameterTypes.length == 0) {
                        method = cls2.getMethod(name, new Class[0]);
                    } else if (parameterTypes.length == 1) {
                        method = cls2.getMethod(name, parameterTypes[0]);
                    } else if (parameterTypes.length == 2) {
                        method = cls2.getMethod(name, parameterTypes[0], parameterTypes[1]);
                    } else if (parameterTypes.length == 3) {
                        method = cls2.getMethod(name, parameterTypes[0], parameterTypes[1], parameterTypes[2]);
                    } else if (parameterTypes.length == 4) {
                        method = cls2.getMethod(name, parameterTypes[0], parameterTypes[1], parameterTypes[2], parameterTypes[3]);
                    } else if (parameterTypes.length == 5) {
                        method = cls2.getMethod(name, parameterTypes[0], parameterTypes[1], parameterTypes[2], parameterTypes[3], parameterTypes[4]);
                    } else if (parameterTypes.length == 6) {
                        method = cls2.getMethod(name, parameterTypes[0], parameterTypes[1], parameterTypes[2], parameterTypes[3], parameterTypes[4], parameterTypes[5]);
                    } else if (parameterTypes.length == 7) {
                        method = cls2.getMethod(name, parameterTypes[0], parameterTypes[1], parameterTypes[2], parameterTypes[3], parameterTypes[4], parameterTypes[5], parameterTypes[6]);
                    } else {
                        method = null;
                    }
                    if (method != null) {
                        if (hashMap.containsKey(method2.getName())) {
                            C20048g.m73161a("TT_WEBVIEW", "暂不支持重载: " + cls.getName() + "::" + method2.getName());
                        }
                        hashMap.put(method2.getName(), method);
                    }
                } catch (Exception unused) {
                    C20048g.m73161a("TT_WEBVIEW", str + " NoSuchMethodException: " + method2.getName());
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            C20048g.m73161a("TT_WEBVIEW", "Initializing the " + cls.getName() + " nameToMethod map takes " + (currentTimeMillis2 - currentTimeMillis) + " milliseconds");
            return hashMap;
        } catch (Exception e) {
            C20048g.m73161a(e.toString());
        }
    }
}
