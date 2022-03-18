package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import com.bytedance.framwork.core.sdklib.util.C14158d;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.h */
public class C14178h {

    /* renamed from: a */
    private static String f37281a;

    /* renamed from: a */
    public static String m57269a(Context context) {
        if (f37281a == null) {
            String replace = C14158d.m57245a(context).replace(context.getPackageName(), "p").replace(":", "_");
            f37281a = replace;
            f37281a = replace.replace(".", "_");
        }
        return f37281a;
    }
}
