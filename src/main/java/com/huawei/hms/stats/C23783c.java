package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* renamed from: com.huawei.hms.stats.c */
public class C23783c {

    /* renamed from: a */
    public static final Object f58922a = new Object();

    /* renamed from: b */
    public static boolean f58923b;

    /* renamed from: c */
    public static boolean f58924c;

    /* renamed from: a */
    public static boolean m86959a() {
        boolean z;
        synchronized (f58922a) {
            if (!f58923b) {
                boolean z2 = false;
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    HMSLog.m86966i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                    z = false;
                }
                try {
                    Class.forName("com.huawei.hms.hatool.HmsHiAnalyticsUtils");
                    z2 = true;
                } catch (ClassNotFoundException unused2) {
                    HMSLog.m86966i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HmsHiAnalyticsUtils.");
                }
                if (z && !z2) {
                    f58924c = true;
                }
                f58923b = true;
                HMSLog.m86966i("HianalyticsExist", "hianalytics exist: " + f58924c);
            }
        }
        return f58924c;
    }
}
