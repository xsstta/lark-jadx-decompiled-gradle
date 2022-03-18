package com.huawei.hms.hatool;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import java.lang.reflect.InvocationTargetException;

public class z0 extends AbstractC23601f {
    /* renamed from: c */
    public static String m86000c() {
        String str;
        String str2 = "";
        try {
            String str3 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            try {
                C23625y.m85977c("hmsSdk", "getUDID success");
                return str3;
            } catch (ClassNotFoundException unused) {
                str2 = str3;
            } catch (AndroidRuntimeException unused2) {
                str2 = str3;
                str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
                C23625y.m85982f("hmsSdk", str);
                return str2;
            } catch (NoSuchMethodException unused3) {
                str2 = str3;
                str = "getUDID method invoke failed : NoSuchMethodException";
                C23625y.m85982f("hmsSdk", str);
                return str2;
            } catch (IllegalAccessException unused4) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal AccessException";
                C23625y.m85982f("hmsSdk", str);
                return str2;
            } catch (IllegalArgumentException unused5) {
                str2 = str3;
                str = "getUDID method invoke failed : Illegal ArgumentException";
                C23625y.m85982f("hmsSdk", str);
                return str2;
            } catch (InvocationTargetException unused6) {
                str2 = str3;
                str = "getUDID method invoke failed : InvocationTargetException";
                C23625y.m85982f("hmsSdk", str);
                return str2;
            }
        } catch (ClassNotFoundException unused7) {
            str = "getUDID method invoke failed";
            C23625y.m85982f("hmsSdk", str);
            return str2;
        } catch (AndroidRuntimeException unused8) {
            str = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
            C23625y.m85982f("hmsSdk", str);
            return str2;
        } catch (NoSuchMethodException unused9) {
            str = "getUDID method invoke failed : NoSuchMethodException";
            C23625y.m85982f("hmsSdk", str);
            return str2;
        } catch (IllegalAccessException unused10) {
            str = "getUDID method invoke failed : Illegal AccessException";
            C23625y.m85982f("hmsSdk", str);
            return str2;
        } catch (IllegalArgumentException unused11) {
            str = "getUDID method invoke failed : Illegal ArgumentException";
            C23625y.m85982f("hmsSdk", str);
            return str2;
        } catch (InvocationTargetException unused12) {
            str = "getUDID method invoke failed : InvocationTargetException";
            C23625y.m85982f("hmsSdk", str);
            return str2;
        }
    }

    /* renamed from: e */
    public static Pair<String, String> m86001e(Context context) {
        if (p0.m85878a(context, "android.permission.READ_PHONE_STATE")) {
            C23625y.m85982f("hmsSdk", "getMccAndMnc() Pair value is empty");
            return new Pair<>("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return new Pair<>("", "");
        }
        if (telephonyManager.getSimState() != 5) {
            return new Pair<>("", "");
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, "null")) ? new Pair<>("", "") : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>("", "");
    }

    /* renamed from: f */
    public static String m86002f(Context context) {
        if (p0.m85878a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getDeviceId() : "";
        } catch (SecurityException unused) {
            C23625y.m85974b("hmsSdk", "getDeviceID Incorrect permissions!");
            return "";
        }
    }

    /* renamed from: g */
    public static String m86003g(Context context) {
        C23625y.m85971a("hmsSdk", "getSerial : is executed.");
        if (context == null || p0.m85878a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            return Build.VERSION.SDK_INT >= 26 ? Build.getSerial() : "";
        } catch (SecurityException unused) {
            C23625y.m85982f("hmsSdk", "getSerial() Incorrect permissions!");
            return "";
        }
    }

    /* renamed from: h */
    public static String m86004h(Context context) {
        String str = Build.SERIAL;
        return (TextUtils.isEmpty(str) || str.equalsIgnoreCase("unknown")) ? m86003g(context) : str;
    }
}
