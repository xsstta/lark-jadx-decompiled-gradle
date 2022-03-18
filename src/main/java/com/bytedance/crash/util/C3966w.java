package com.bytedance.crash.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.bytedance.crash.util.w */
public final class C3966w {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.w$1 */
    public static /* synthetic */ class C39671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12069a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.crash.upload.CrashUploader$NetworkType[] r0 = com.bytedance.crash.upload.CrashUploader.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.crash.util.C3966w.C39671.f12069a = r0
                com.bytedance.crash.upload.CrashUploader$NetworkType r1 = com.bytedance.crash.upload.CrashUploader.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.crash.util.C3966w.C39671.f12069a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.crash.upload.CrashUploader$NetworkType r1 = com.bytedance.crash.upload.CrashUploader.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.crash.util.C3966w.C39671.f12069a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.crash.upload.CrashUploader$NetworkType r1 = com.bytedance.crash.upload.CrashUploader.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.crash.util.C3966w.C39671.f12069a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.crash.upload.CrashUploader$NetworkType r1 = com.bytedance.crash.upload.CrashUploader.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.crash.util.C3966w.C39671.f12069a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.crash.upload.CrashUploader$NetworkType r1 = com.bytedance.crash.upload.CrashUploader.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.crash.util.C3966w.C39671.f12069a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.crash.upload.CrashUploader$NetworkType r1 = com.bytedance.crash.upload.CrashUploader.NetworkType.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.C3966w.C39671.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m16526a(Context context) {
        return m16527a(m16529c(context));
    }

    /* renamed from: b */
    public static boolean m16528b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static String m16527a(CrashUploader.NetworkType networkType) {
        String str;
        try {
            switch (C39671.f12069a[networkType.ordinal()]) {
                case 1:
                    str = "wifi";
                    break;
                case 2:
                    str = "2g";
                    break;
                case 3:
                    str = "3g";
                    break;
                case 4:
                    str = "4g";
                    break;
                case 5:
                    str = "mobile";
                    break;
                case 6:
                    str = "5g";
                    break;
                default:
                    return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static int m16525a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 24) {
            return telephonyManager.getNetworkType();
        }
        try {
            C39400a.m155625a().mo143243a(LarkContext.getApplication());
            C39400a.m155625a().mo143245b(LarkContext.getApplication());
            if (C39400a.m155625a().mo143244b() != -1) {
                return C39400a.m155625a().mo143244b();
            }
            int networkType = telephonyManager.getNetworkType();
            C39400a.m155625a().mo143242a(networkType);
            Log.m165389i("TelephonyManagerLancetHook", "get network type from system");
            return networkType;
        } catch (Throwable th) {
            Log.m165386e("TelephonyManagerLancetHook", th);
            return telephonyManager.getNetworkType();
        }
    }

    /* renamed from: c */
    private static CrashUploader.NetworkType m16529c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return CrashUploader.NetworkType.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return CrashUploader.NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return CrashUploader.NetworkType.MOBILE;
                    }
                    int a = m16525a((TelephonyManager) context.getSystemService("phone"));
                    if (a != 3) {
                        if (a == 20) {
                            return CrashUploader.NetworkType.MOBILE_5G;
                        }
                        if (!(a == 5 || a == 6)) {
                            switch (a) {
                                case 8:
                                case 9:
                                case 10:
                                    break;
                                default:
                                    switch (a) {
                                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                        case 14:
                                        case 15:
                                            break;
                                        case 13:
                                            return CrashUploader.NetworkType.MOBILE_4G;
                                        default:
                                            return CrashUploader.NetworkType.MOBILE;
                                    }
                            }
                        }
                    }
                    return CrashUploader.NetworkType.MOBILE_3G;
                }
            }
            return CrashUploader.NetworkType.NONE;
        } catch (Throwable unused) {
            return CrashUploader.NetworkType.MOBILE;
        }
    }
}
