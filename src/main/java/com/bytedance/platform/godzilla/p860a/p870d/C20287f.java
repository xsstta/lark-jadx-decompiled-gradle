package com.bytedance.platform.godzilla.p860a.p870d;

import android.os.Build;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p872b.C20317i;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.platform.godzilla.a.d.f */
public class C20287f extends AbstractC20331c {

    /* renamed from: a */
    private static Set<Integer> f49565a;

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "StopActivityNPEPlugin";
    }

    static {
        HashSet hashSet = new HashSet();
        f49565a = hashSet;
        hashSet.add(23);
        f49565a.add(24);
        f49565a.add(25);
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        if (!f49565a.contains(Integer.valueOf(Build.VERSION.SDK_INT))) {
            return false;
        }
        if (!Build.MODEL.startsWith("GIONEE") && !Build.MODEL.startsWith("Funtouch") && !Build.MODEL.startsWith("coloros_V3.0") && !C20317i.m74092b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        if (th instanceof NullPointerException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleStopActivity".equals(stackTraceElement.getMethodName())) {
                    Logger.m74095a(mo68532b(), "Hint StopActivityNPE case ,fix it.");
                    return true;
                }
            }
        }
        return false;
    }
}
