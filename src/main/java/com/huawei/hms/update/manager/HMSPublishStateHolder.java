package com.huawei.hms.update.manager;

public class HMSPublishStateHolder {
    public static final int NOT_CHECKED = 0;
    public static final int NOT_PUBLISHED_YET = 2;
    public static final int PUBLISHED = 1;

    /* renamed from: a */
    public static int f58934a;

    /* renamed from: b */
    public static final Object f58935b = new Object();

    public static int getPublishState() {
        int i;
        synchronized (f58935b) {
            i = f58934a;
        }
        return i;
    }

    public static void setPublishState(int i) {
        synchronized (f58935b) {
            f58934a = i;
        }
    }
}
