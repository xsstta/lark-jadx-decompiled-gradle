package com.larksuite.framework.utils;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.larksuite.framework.utils.h */
public final class C26278h {

    /* renamed from: a */
    private static Boolean f64900a;

    /* renamed from: b */
    private static Boolean f64901b;

    /* renamed from: a */
    public static boolean m95144a() {
        String str;
        boolean z;
        Boolean bool = f64900a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            str = Arrays.toString(Build.SUPPORTED_ABIS);
        } else {
            str = Build.CPU_ABI;
        }
        if (TextUtils.isEmpty(str) || !str.contains("64")) {
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f64900a = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    public static boolean m95145a(Context context) {
        boolean z;
        Boolean bool = f64901b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            f64901b = Boolean.valueOf(Process.is64Bit());
        } else {
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (TextUtils.isEmpty(str) || !str.endsWith("arm64")) {
                z = false;
            } else {
                z = true;
            }
            f64901b = Boolean.valueOf(z);
        }
        return f64901b.booleanValue();
    }
}
