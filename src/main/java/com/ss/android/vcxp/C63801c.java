package com.ss.android.vcxp;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vcxp.annotation.XProcess;

/* renamed from: com.ss.android.vcxp.c */
public class C63801c {
    /* renamed from: a */
    public static boolean m250498a() {
        if (!C63791b.m250468b() || XProcess.VC.value().equals(C26252ad.m94994c(ar.m236694a()))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m250501b() {
        if (!C63791b.m250468b() || !XProcess.VC.value().equals(C26252ad.m94994c(ar.m236694a()))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m250502c() {
        if (!C63791b.m250468b() || XProcess.Main.value().equals(C26252ad.m94994c(ar.m236694a()))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m250503d() {
        if (!C63791b.m250468b() || !XProcess.Main.value().equals(C26252ad.m94994c(ar.m236694a()))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m250500a(String str) {
        XProcess xProcess;
        if (str.equals("main")) {
            str = XProcess.Main.value();
        }
        if (C63791b.m250468b()) {
            xProcess = XProcess.VC;
        } else {
            xProcess = XProcess.Main;
        }
        return str.equals(xProcess.value());
    }

    /* renamed from: a */
    public static boolean m250499a(Activity activity, Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        String c = C26252ad.m94994c(activity);
        if (c.equals("main")) {
            c = XProcess.Main.value();
        }
        if (C63791b.m250468b()) {
            return c.equals(XProcess.VC.value());
        }
        return c.equals(XProcess.Main.value());
    }
}
