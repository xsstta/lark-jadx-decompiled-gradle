package com.huawei.hms.locationSdk;

/* renamed from: com.huawei.hms.locationSdk.w */
public class C23674w extends C23676y {

    /* renamed from: b */
    private static volatile C23674w f58439b;

    /* renamed from: c */
    private static final byte[] f58440c = new byte[0];

    /* renamed from: b */
    public static C23674w m86117b() {
        if (f58439b == null) {
            synchronized (f58440c) {
                if (f58439b == null) {
                    f58439b = new C23674w();
                }
            }
        }
        return f58439b;
    }
}
