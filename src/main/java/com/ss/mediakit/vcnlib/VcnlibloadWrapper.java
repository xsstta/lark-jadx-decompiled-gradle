package com.ss.mediakit.vcnlib;

import android.util.Log;
import com.C1711a;

public class VcnlibloadWrapper {
    private static boolean isVcnload;
    private static boolean isVcnverifyLiteload;
    private static boolean isVcnverifyload;

    public static boolean tryLoadVcnlib() {
        synchronized (VcnlibloadWrapper.class) {
            boolean z = true;
            if (isVcnload) {
                return true;
            }
            try {
                C1711a.m7628a("vcn");
            } catch (UnsatisfiedLinkError e) {
                Log.e("vcn", "Can't load vcn library: " + e);
                z = false;
            }
            isVcnload = z;
            return z;
        }
    }

    public static boolean tryLoadVcnverifyLitelib() {
        synchronized (VcnlibloadWrapper.class) {
            boolean z = true;
            if (isVcnverifyLiteload) {
                return true;
            }
            try {
                C1711a.m7628a("vcnverifylite");
                Log.e("vcn", "load vcnverifylite suc");
                CustomVerify.init();
            } catch (UnsatisfiedLinkError e) {
                Log.e("vcn", "Can't load vcnverifylite library: " + e);
                z = false;
            }
            isVcnverifyLiteload = z;
            return z;
        }
    }

    public static boolean tryLoadVcnverifylib() {
        boolean z;
        synchronized (VcnlibloadWrapper.class) {
            boolean z2 = true;
            if (isVcnverifyload) {
                return true;
            }
            try {
                C1711a.m7628a("vcnverify");
                z = true;
            } catch (UnsatisfiedLinkError e) {
                Log.e("vcn", "Can't load vcnverify library: " + e);
                z = false;
            }
            isVcnverifyload = z;
            if (!z && !tryLoadVcnverifyLitelib()) {
                z2 = false;
            }
            return z2;
        }
    }
}
