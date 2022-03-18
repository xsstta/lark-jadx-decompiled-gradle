package com.bytedance.platform.godzilla.p860a.p862b.p866b;

import android.app.Instrumentation;
import android.os.Looper;
import com.bytedance.platform.godzilla.common.C20320a;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p865b.AbstractC20262a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.a.b.b.a */
public class InstrumentationC20263a extends Instrumentation {

    /* renamed from: a */
    private static List<AbstractC20262a> f49549a = new ArrayList();

    /* renamed from: b */
    private static boolean f49550b;

    /* renamed from: a */
    public static void m73967a() {
        if (!f49550b) {
            try {
                Object a = C20320a.m74101a();
                Field declaredField = a.getClass().getDeclaredField("mInstrumentation");
                declaredField.setAccessible(true);
                if (!(declaredField.get(a) instanceof InstrumentationC20263a)) {
                    declaredField.set(a, new InstrumentationC20263a());
                    Logger.m74099c("InstrumentationWrapper", "Fix success.");
                    f49550b = true;
                }
            } catch (Exception e) {
                Logger.m74099c("InstrumentationWrapper", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m73968a(AbstractC20262a aVar) {
        if (Logger.m74097a() && Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("register only in UI thread.");
        } else if (aVar != null && aVar.mo68549a() && !f49549a.contains(aVar)) {
            f49549a.add(aVar);
        }
    }

    public boolean onException(Object obj, Throwable th) {
        for (AbstractC20262a aVar : f49549a) {
            if (aVar.mo68550a(obj, th)) {
                return true;
            }
        }
        return super.onException(obj, th);
    }
}
