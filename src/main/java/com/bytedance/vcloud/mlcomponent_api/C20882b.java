package com.bytedance.vcloud.mlcomponent_api;

import android.util.Log;

/* renamed from: com.bytedance.vcloud.mlcomponent_api.b */
public class C20882b {

    /* renamed from: a */
    public static int f51122a = 112;

    /* renamed from: a */
    public static void m76024a(String str, String str2) {
        if (((f51122a >> 6) & 1) == 1) {
            Log.e("MLComponentLog", String.format("<%s>%s", str, str2));
        }
    }
}
