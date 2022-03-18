package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import com.bytedance.push.interfaze.AbstractC20446i;
import com.bytedance.push.interfaze.AbstractC20451n;
import com.ss.android.message.AppProvider;
import com.ss.android.pushmanager.setting.C59971b;

/* renamed from: com.bytedance.push.b */
public class C20384b {

    /* renamed from: a */
    private static AbstractC20446i f49769a = new C20401e();

    /* renamed from: a */
    public static AbstractC20446i m74260a() {
        return f49769a;
    }

    /* renamed from: a */
    public static AbstractC20451n m74261a(Context context) {
        AppProvider.initApp((Application) context.getApplicationContext());
        return C59971b.m232728b();
    }
}
