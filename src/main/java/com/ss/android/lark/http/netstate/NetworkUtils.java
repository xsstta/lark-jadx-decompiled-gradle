package com.ss.android.lark.http.netstate;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;

public class NetworkUtils {

    /* renamed from: a */
    private static volatile boolean f99696a = true;

    /* renamed from: b */
    private static AbstractC38768a f99697b;

    /* renamed from: com.ss.android.lark.http.netstate.NetworkUtils$a */
    public interface AbstractC38768a {
        /* renamed from: a */
        NetworkType mo142125a();
    }

    public enum NetworkType {
        NONE(0, "unvailable"),
        MOBILE(1, "mobile"),
        MOBILE_2G(2, "mobile_2g"),
        MOBILE_3G(3, "mobile_3g"),
        WIFI(4, "wifi"),
        MOBILE_4G(5, "mobile_4g"),
        UNKNOWN(6, "unknown");
        
        final int nativeInt;
        private final String nativeName;

        public String getNativeName() {
            return this.nativeName;
        }

        public int getValue() {
            return this.nativeInt;
        }

        private NetworkType(int i, String str) {
            this.nativeInt = i;
            this.nativeName = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.http.netstate.NetworkUtils$1 */
    public static /* synthetic */ class C387671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f99698a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.http.netstate.NetworkUtils.C387671.f99698a = r0
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.C387671.f99698a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.C387671.f99698a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.C387671.f99698a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.C387671.f99698a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.http.netstate.NetworkUtils.C387671.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m153067a(Context context) {
        NetworkType d = m153071d(context);
        if (d == null) {
            d = NetworkType.NONE;
        }
        return d.getNativeName();
    }

    /* renamed from: e */
    public static String m153072e(Context context) {
        return m153068a(m153071d(context));
    }

    /* renamed from: f */
    public static WifiInfo m153073f(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
    }

    /* renamed from: g */
    public static boolean m153074g(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).isWifiEnabled();
    }

    /* renamed from: c */
    public static boolean m153070c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m153075h(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m153068a(NetworkType networkType) {
        String str;
        try {
            int i = C387671.f99698a[networkType.ordinal()];
            if (i == 1) {
                str = "wifi";
            } else if (i == 2) {
                str = "2g";
            } else if (i == 3) {
                str = "3g";
            } else if (i == 4) {
                str = "4g";
            } else if (i != 5) {
                return "";
            } else {
                str = "mobile";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m153069b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            AbstractC38768a aVar = f99697b;
            if (aVar == null || aVar.mo142125a() == NetworkType.NONE) {
                if (1 == activeNetworkInfo.getType()) {
                    return true;
                }
                return false;
            } else if (f99697b.mo142125a() == NetworkType.WIFI) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m153066a(TelephonyManager telephonyManager) {
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

    /* renamed from: d */
    public static NetworkType m153071d(Context context) {
        AbstractC38768a aVar = f99697b;
        if (aVar != null && aVar.mo142125a() != NetworkType.NONE) {
            return f99697b.mo142125a();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkType.MOBILE;
                    }
                    switch (m153066a((TelephonyManager) context.getSystemService("phone"))) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return NetworkType.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                        case 14:
                        case 15:
                            return NetworkType.MOBILE_3G;
                        case 13:
                            return NetworkType.MOBILE_4G;
                        default:
                            return NetworkType.MOBILE;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable th) {
            android.util.Log.e("network", th.getMessage());
            return NetworkType.MOBILE;
        }
    }

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private CompressType(int i) {
            this.nativeInt = i;
        }
    }
}
