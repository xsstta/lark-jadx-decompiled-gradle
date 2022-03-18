package com.bytedance.platform.godzilla.p860a.p869c;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.platform.godzilla.common.C20324d;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p872b.C20309a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.a.c.c */
public class C20278c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Field f49559a;

    /* renamed from: b */
    public Field f49560b;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: com.bytedance.platform.godzilla.a.c.c$a */
    private static class C20280a implements Handler.Callback {

        /* renamed from: a */
        private Handler f49563a;

        C20280a(Handler handler) {
            this.f49563a = handler;
        }

        public boolean handleMessage(Message message) {
            try {
                Logger.m74095a("ViewRootImplHandlerHook", "Handle message " + message);
                this.f49563a.handleMessage(message);
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public void mo68557a(Application application) {
        try {
            Field a = C20324d.m74109a(View.class, "mAttachInfo");
            this.f49559a = a;
            if (a != null) {
                a.setAccessible(true);
                application.registerActivityLifecycleCallbacks(this);
                Logger.m74095a("ViewRootImplHandlerHook", "Hook success ");
            }
        } catch (Throwable unused) {
        }
    }

    public void onActivityStarted(Activity activity) {
        Logger.m74095a("ViewRootImplHandlerHook", "onActivityStarted！");
        if (this.f49559a != null) {
            try {
                final View decorView = activity.getWindow().getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.platform.godzilla.p860a.p869c.C20278c.View$OnAttachStateChangeListenerC202791 */

                    public void onViewDetachedFromWindow(View view) {
                    }

                    public void onViewAttachedToWindow(View view) {
                        try {
                            Object obj = C20278c.this.f49559a.get(decorView);
                            if (C20278c.this.f49560b == null) {
                                C20278c.this.f49560b = C20309a.m74066a(obj.getClass(), "mHandler");
                            }
                            Handler handler = (Handler) C20278c.this.f49560b.get(obj);
                            Field a = C20309a.m74066a((Class<?>) Handler.class, "mCallback");
                            Handler.Callback callback = (Handler.Callback) a.get(handler);
                            if (callback == null || !callback.getClass().getName().equals(C20280a.class.getName())) {
                                a.set(handler, new C20280a(handler));
                                Logger.m74095a("ViewRootImplHandlerHook", "Prevent handler in ViewRootImpl successful.");
                                return;
                            }
                            Logger.m74095a("ViewRootImplHandlerHook", "Already replaced，not need to do it.");
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
