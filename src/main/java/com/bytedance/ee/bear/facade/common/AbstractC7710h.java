package com.bytedance.ee.bear.facade.common;

import android.app.Activity;

/* renamed from: com.bytedance.ee.bear.facade.common.h */
public interface AbstractC7710h {
    /* renamed from: a */
    <T> T mo17222a(Class<T> cls);

    /* renamed from: com.bytedance.ee.bear.facade.common.h$a */
    public static class C7711a {
        /* renamed from: a */
        public static <T> T m30833a(Activity activity, Class<T> cls) {
            if (activity instanceof AbstractC7710h) {
                return (T) ((AbstractC7710h) activity).mo17222a(cls);
            }
            return null;
        }
    }
}
