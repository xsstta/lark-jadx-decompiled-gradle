package com.ss.android.lark.screen.p2581a.p2582a;

import android.app.Application;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.screen.a.a.d */
public final class C53226d {

    /* renamed from: a */
    private final AtomicBoolean f131560a = new AtomicBoolean();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.screen.a.a.d$a */
    public static class C53227a {

        /* renamed from: a */
        public static final C53226d f131561a = new C53226d();
    }

    /* renamed from: a */
    public static C53226d m205872a() {
        return C53227a.f131561a;
    }

    /* renamed from: a */
    public void mo181686a(Application application) {
        if (application == null) {
            Log.m165383e("ScreenshotManager", "failed to init. application is null.");
        }
        if (this.f131560a.get()) {
            Log.m165389i("ScreenshotManager", "already init.");
            return;
        }
        this.f131560a.set(true);
        application.registerActivityLifecycleCallbacks(new C53223a());
    }
}
