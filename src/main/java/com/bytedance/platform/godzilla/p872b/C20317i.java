package com.bytedance.platform.godzilla.p872b;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.bytedance.platform.godzilla.b.i */
public final class C20317i {

    /* renamed from: a */
    private static final CharSequence f49589a = "amigo";

    /* renamed from: a */
    public static boolean m74091a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m74092b() {
        if (TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f49589a)) {
            return false;
        }
        return true;
    }
}
