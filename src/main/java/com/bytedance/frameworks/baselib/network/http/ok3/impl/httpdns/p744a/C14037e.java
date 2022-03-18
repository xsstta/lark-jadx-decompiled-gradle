package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a.e */
public class C14037e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f36783a;

    /* renamed from: c */
    private static WeakHandler f36784c = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14037e.C140381 */

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
        }
    });

    /* renamed from: b */
    public AbstractC14040a f36785b;

    /* renamed from: d */
    private Runnable f36786d = new Runnable() {
        /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14037e.RunnableC140392 */

        public void run() {
            if (C14037e.f36783a) {
                C14037e.f36783a = false;
                if (C14037e.this.f36785b != null) {
                    C14037e.this.f36785b.mo51627b();
                }
            }
        }
    };

    /* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a.e$a */
    public interface AbstractC14040a {
        /* renamed from: a */
        void mo51625a();

        /* renamed from: b */
        void mo51627b();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public C14037e() {
        if (m56823a() != null) {
            f36783a = true;
        }
    }

    /* renamed from: a */
    private static Activity m56823a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map == null) {
                return null;
            }
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo51676a(AbstractC14040a aVar) {
        this.f36785b = aVar;
    }

    public void onActivityPaused(Activity activity) {
        if (f36783a) {
            f36784c.postDelayed(this.f36786d, 30000);
        }
    }

    public void onActivityResumed(Activity activity) {
        if (!f36783a) {
            f36783a = true;
            AbstractC14040a aVar = this.f36785b;
            if (aVar != null) {
                aVar.mo51625a();
            }
        }
        f36784c.removeCallbacks(this.f36786d);
    }
}
