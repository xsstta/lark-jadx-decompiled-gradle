package com.bytedance.push.utils;

import android.os.SystemProperties;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.utils.h */
public class C20558h {

    /* renamed from: a */
    private Object f50133a;

    C20558h() {
    }

    /* renamed from: a */
    private Object m74874a() {
        if (this.f50133a == null) {
            synchronized (C20554e.class) {
                if (this.f50133a == null) {
                    try {
                        this.f50133a = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return this.f50133a;
    }

    /* renamed from: a */
    public String mo69199a(String str) throws IllegalArgumentException {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                Object a = m74874a();
                return (String) a.getClass().getMethod("get", String.class).invoke(a, str);
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Throwable unused) {
                return "";
            }
        }
    }
}
