package com.ss.android.lark.floating.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.lark.floating.LKUIFloat;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.widget.appfloat.AppFloatManager;
import com.ss.android.lark.floating.widget.appfloat.FloatManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u000bJ#\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/floating/utils/AppStateHandler;", "", "()V", "dependency", "Lcom/ss/android/lark/floating/LKUIFloat$IFloatDependency;", "mIsForeground", "", "observer", "com/ss/android/lark/floating/utils/AppStateHandler$observer$1", "Lcom/ss/android/lark/floating/utils/AppStateHandler$observer$1;", "checkHide", "", "checkShow", "topActivityName", "", "initLifeCycle", "application", "Landroid/app/Application;", "isForeground", "registerAppStateHandler", "setVisible", "isShow", "tag", "(ZLjava/lang/String;)Lkotlin/Unit;", "unRegisterAppStateHandler", "AppStateObserver", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.d.a */
public final class AppStateHandler {

    /* renamed from: a */
    public static final AppStateHandler f98493a = new AppStateHandler();

    /* renamed from: b */
    private static LKUIFloat.IFloatDependency f98494b;

    /* renamed from: c */
    private static boolean f98495c;

    /* renamed from: d */
    private static C38341c f98496d = new C38341c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/floating/utils/AppStateHandler$AppStateObserver;", "", "onAppStateChange", "", "isForeground", "", "topActivityName", "", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.d.a$a */
    public interface AppStateObserver {
        /* renamed from: a */
        void mo140256a(boolean z, String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/floating/utils/AppStateHandler$initLifeCycle$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.d.a$b */
    public static final class C38340b implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        C38340b() {
        }

        public void onActivityPaused(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            AppStateHandler.f98493a.mo140254b();
        }

        public void onActivityResumed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            AppStateHandler.f98493a.mo140253a(activity.getClass().getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/floating/utils/AppStateHandler$observer$1", "Lcom/ss/android/lark/floating/utils/AppStateHandler$AppStateObserver;", "onAppStateChange", "", "isForeground", "", "topActivityName", "", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.floating.d.a$c */
    public static final class C38341c implements AppStateObserver {
        C38341c() {
        }

        @Override // com.ss.android.lark.floating.utils.AppStateHandler.AppStateObserver
        /* renamed from: a */
        public void mo140256a(boolean z, String str) {
            AppStateHandler aVar = AppStateHandler.f98493a;
            AppStateHandler.f98495c = z;
            if (z) {
                AppStateHandler.f98493a.mo140253a(str);
            } else {
                AppStateHandler.f98493a.mo140254b();
            }
        }
    }

    private AppStateHandler() {
    }

    /* renamed from: c */
    public final boolean mo140255c() {
        return f98495c;
    }

    /* renamed from: a */
    public final void mo140251a() {
        LKUIFloat.IFloatDependency cVar = f98494b;
        if (cVar != null) {
            cVar.mo102717a(f98496d);
        }
    }

    static {
        boolean z;
        LKUIFloat.IFloatDependency a = LKUIFloat.f98419d.mo140142a();
        f98494b = a;
        if (a != null) {
            z = a.mo102718b();
        } else {
            z = false;
        }
        f98495c = z;
    }

    /* renamed from: b */
    public final void mo140254b() {
        boolean z;
        if (!mo140255c()) {
            for (Map.Entry<String, AppFloatManager> entry : FloatManager.f98554a.mo140327a().entrySet()) {
                String key = entry.getKey();
                FloatConfig h = entry.getValue().mo140314h();
                AppStateHandler aVar = f98493a;
                if (h.mo140204j() == ShowPattern.FOREGROUND || !h.mo140171E()) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.m150950a(z, key);
            }
        }
    }

    /* renamed from: a */
    public final void mo140252a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        application.registerActivityLifecycleCallbacks(new C38340b());
    }

    /* renamed from: a */
    public final void mo140253a(String str) {
        if (str != null) {
            for (Map.Entry<String, AppFloatManager> entry : FloatManager.f98554a.mo140327a().entrySet()) {
                String key = entry.getKey();
                FloatConfig h = entry.getValue().mo140314h();
                if (h.mo140204j() == ShowPattern.BACKGROUND) {
                    f98493a.m150950a(false, key);
                } else if (h.mo140171E()) {
                    f98493a.m150950a(!h.mo140169C().contains(str), key);
                }
            }
        }
    }

    /* renamed from: a */
    private final Unit m150950a(boolean z, String str) {
        return FloatManager.m151014a(FloatManager.f98554a, z, str, false, 4, null);
    }
}
