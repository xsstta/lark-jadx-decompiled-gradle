package com.ss.video.rtc.base.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.regex.Pattern;
import me.ele.lancet.base.annotations.Skip;

public class NetworkUtils {
    private static BroadcastReceiver sBroadcastReceiver;
    private static NetworkTypeInterceptor sNetworkTypeInterceptor;

    public interface NetworkTypeInterceptor {
        NetworkType getNetworkType();
    }

    public enum NetworkType {
        UNKNOWN(-1),
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6);
        
        final int nativeInt;

        public int getValue() {
            return this.nativeInt;
        }

        public boolean isAvailable() {
            if (this != NONE) {
                return true;
            }
            return false;
        }

        private NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.video.rtc.base.utils.NetworkUtils$1 */
    public static /* synthetic */ class C655581 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.video.rtc.base.utils.NetworkUtils.C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType = r0
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.video.rtc.base.utils.NetworkUtils.C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.video.rtc.base.utils.NetworkUtils$NetworkType r1 = com.ss.video.rtc.base.utils.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.base.utils.NetworkUtils.C655581.<clinit>():void");
        }
    }

    public static void setNetworkTypeInterceptor(NetworkTypeInterceptor networkTypeInterceptor) {
        sNetworkTypeInterceptor = networkTypeInterceptor;
    }

    public static boolean isIpv4(String str) {
        return Pattern.matches("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5]).(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$", str);
    }

    public static boolean isIpv6(String str) {
        return Pattern.matches("^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$", str);
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(getNetworkType(context));
    }

    public static void unregisterReceiver(Context context) {
        BroadcastReceiver broadcastReceiver = sBroadcastReceiver;
        if (broadcastReceiver != null && context != null) {
            context.unregisterReceiver(broadcastReceiver);
            sBroadcastReceiver = null;
        }
    }

    public static boolean is2G(Context context) {
        NetworkType networkType = getNetworkType(context);
        if (networkType == NetworkType.MOBILE || networkType == NetworkType.MOBILE_2G) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getNetworkAccessType(NetworkType networkType) {
        String str;
        try {
            switch (C655581.$SwitchMap$com$ss$video$rtc$base$utils$NetworkUtils$NetworkType[networkType.ordinal()]) {
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
                    str = "5g";
                    break;
                case 6:
                    str = "mobile";
                    break;
                default:
                    return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return false;
            }
            NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
            if (networkTypeInterceptor == null || networkTypeInterceptor.getNetworkType() == NetworkType.NONE) {
                if (1 == activeNetworkInfo.getType()) {
                    return true;
                }
                return false;
            } else if (sNetworkTypeInterceptor.getNetworkType() == NetworkType.WIFI) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static void registerReceiver(Context context) {
        if (sBroadcastReceiver == null && context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            sBroadcastReceiver = new NetworkConnectChangeReceiver();
            INVOKEVIRTUAL_com_ss_video_rtc_base_utils_NetworkUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context.getApplicationContext(), sBroadcastReceiver, intentFilter);
        }
    }

    public static int INVOKEVIRTUAL_com_ss_video_rtc_base_utils_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType(TelephonyManager telephonyManager) {
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

    public static NetworkType getNetworkType(Context context) {
        NetworkTypeInterceptor networkTypeInterceptor = sNetworkTypeInterceptor;
        if (networkTypeInterceptor != null && networkTypeInterceptor.getNetworkType() != NetworkType.NONE) {
            return sNetworkTypeInterceptor.getNetworkType();
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
                    switch (INVOKEVIRTUAL_com_ss_video_rtc_base_utils_NetworkUtils_com_ss_android_lark_integrator_telephony_TelephonyManagerLancetHook_getNetworkType((TelephonyManager) context.getSystemService("phone"))) {
                        case 0:
                            return NetworkType.UNKNOWN;
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
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
                        case 17:
                            return NetworkType.MOBILE_3G;
                        case 13:
                        case 18:
                            return NetworkType.MOBILE_4G;
                        case 19:
                        default:
                            return NetworkType.UNKNOWN;
                        case 20:
                            return NetworkType.MOBILE_5G;
                    }
                }
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.UNKNOWN;
        }
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<Pair<String, String>> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Pair<String, String> pair : list) {
            String encode = encode((String) pair.first, str);
            String str3 = (String) pair.second;
            if (str3 != null) {
                str2 = encode(str3, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb.append(encode);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(str2);
        }
        return sb.toString();
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

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_video_rtc_base_utils_NetworkUtils_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
