package com.bytedance.platform.godzilla.p860a.p862b.p866b.p867a;

import android.os.Build;
import android.os.IBinder;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b;
import com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20261c;
import com.bytedance.platform.godzilla.p872b.C20312d;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.godzilla.a.b.b.a.b */
public class C20266b extends AbstractC20261c {

    /* renamed from: com.bytedance.platform.godzilla.a.b.b.a.b$a */
    static final class C20267a extends AbstractC20260b {
        C20267a() {
        }

        @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
        /* renamed from: a */
        public Object mo68542a(Object obj, Method method, Object[] objArr) {
            Logger.m74099c("IMountServiceProxy", "IsUserKeyUnlocked method is called.");
            return null;
        }

        @Override // com.bytedance.platform.godzilla.p860a.p862b.p863a.p864a.AbstractC20260b
        /* renamed from: a */
        public Object mo68543a(Object obj, Method method, Object[] objArr, Object obj2) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (stackTraceElement.getMethodName().contains("getSharedPreferences")) {
                    Logger.m74099c("IMountServiceProxy", "IsUserKeyUnlocked method is called，hint getSharedPreferences，return true。");
                    return true;
                }
            }
            return super.mo68543a(obj, method, objArr, obj2);
        }
    }

    static {
        m73958a("isUserKeyUnlocked", new C20267a());
    }

    /* renamed from: b */
    public void mo68553b() {
        Class<?> cls;
        C20264a aVar = new C20264a("mount", this);
        aVar.mo68552b();
        try {
            if (Build.VERSION.SDK_INT > 25) {
                cls = Class.forName("android.os.storage.IStorageManager$Stub");
            } else {
                cls = Class.forName("android.os.storage.IMountService$Stub");
            }
            mo68546a(C20312d.m74079a(cls, "asInterface", IBinder.class).invoke(null, aVar.mo68545a()));
        } catch (Exception e) {
            Logger.m74095a("IMountServiceProxy", "Hook proxy MountService Failed!!!");
            e.printStackTrace();
        }
    }
}
