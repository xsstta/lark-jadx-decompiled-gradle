package com.lynx.tasm.utils;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.utils.a */
public class C26944a {

    /* renamed from: a */
    private static boolean f66895a;

    /* renamed from: b */
    private static boolean f66896b;

    /* renamed from: c */
    private static Typeface f66897c;

    /* renamed from: d */
    private static boolean f66898d;

    /* renamed from: c */
    public static boolean m97906c() {
        return "HUAWEI".equals(Build.MANUFACTURER);
    }

    /* renamed from: a */
    public static synchronized boolean m97904a() {
        boolean z;
        synchronized (C26944a.class) {
            if (!f66895a) {
                try {
                    if (Class.forName("miui.os.Build") != null) {
                        f66896b = true;
                    }
                } catch (Exception unused) {
                }
                f66895a = true;
            }
            z = f66896b;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized Typeface m97905b() {
        synchronized (C26944a.class) {
            if (!m97904a()) {
                return null;
            }
            if (f66898d) {
                return f66897c;
            }
            try {
                TextPaint paint = new TextView(LynxEnv.m96123e().mo94110o()).getPaint();
                if (paint != null) {
                    f66897c = paint.getTypeface();
                }
            } catch (Exception unused) {
                LLog.m96429e(LynxKitALogDelegate.f38587a, "get default typeface failed");
            }
            f66898d = true;
            return f66897c;
        }
    }
}
