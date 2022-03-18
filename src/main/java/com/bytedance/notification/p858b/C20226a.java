package com.bytedance.notification.p858b;

import android.content.Context;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.notification.b.a */
public class C20226a {

    /* renamed from: a */
    private static float f49487a;

    /* renamed from: a */
    public static int m73855a(Context context, float f) {
        if (f49487a == BitmapDescriptorFactory.HUE_RED) {
            f49487a = context.getResources().getDisplayMetrics().density;
        }
        C20227b.m73856a("DpUtils", "dp2px: mScale is " + f49487a);
        return (int) ((f * f49487a) + 0.5f);
    }
}
