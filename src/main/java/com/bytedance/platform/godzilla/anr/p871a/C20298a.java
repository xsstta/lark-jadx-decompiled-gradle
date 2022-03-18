package com.bytedance.platform.godzilla.anr.p871a;

import android.app.Application;
import com.bytedance.platform.godzilla.common.C20320a;
import com.bytedance.platform.godzilla.common.Logger;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.anr.a.a */
public class C20298a {
    /* renamed from: a */
    public boolean mo68574a(Application application) {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            declaredField.set(C20320a.m74101a(), application);
            return true;
        } catch (Exception unused) {
            Logger.m74095a("HookActivityThreadSetInitialApplication", "WebView hook fix ANR fail.");
            return false;
        }
    }
}
