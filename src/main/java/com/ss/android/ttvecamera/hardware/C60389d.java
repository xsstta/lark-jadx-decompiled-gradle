package com.ss.android.ttvecamera.hardware;

import android.os.Build;
import com.ss.android.ttvecamera.C60427s;

/* renamed from: com.ss.android.ttvecamera.hardware.d */
public class C60389d {

    /* renamed from: a */
    public static final int[] f150944a = {2, 0, 1, 3};

    /* renamed from: b */
    public static final int[] f150945b = {1, 2, 0, 3};

    /* renamed from: b */
    public static boolean m234630b() {
        if (!Build.HARDWARE.toLowerCase().matches("mt[0-9]*")) {
            return false;
        }
        C60427s.m234842b("TECameraHardware2", "MTK Platform.");
        return true;
    }

    /* renamed from: c */
    public static boolean m234631c() {
        String lowerCase = Build.BRAND.toLowerCase();
        if (lowerCase.equals("huawei") || lowerCase.equals("honor")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m234632d() {
        if (Build.BRAND.toLowerCase().equals("samsung")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m234629a() {
        String lowerCase = Build.HARDWARE.toLowerCase();
        if (!lowerCase.equals("qcom") && !lowerCase.matches("msm[0-9]*")) {
            return false;
        }
        C60427s.m234842b("TECameraHardware2", "QCOM Platform.");
        return true;
    }
}
