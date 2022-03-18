package com.huawei.hms.locationSdk;

/* renamed from: com.huawei.hms.locationSdk.u */
public class C23670u extends C23676y {

    /* renamed from: b */
    private static volatile C23670u f58430b;

    /* renamed from: c */
    private static final byte[] f58431c = new byte[0];

    /* renamed from: b */
    public static C23670u m86102b() {
        if (f58430b == null) {
            synchronized (f58431c) {
                if (f58430b == null) {
                    f58430b = new C23670u();
                }
            }
        }
        return f58430b;
    }
}
