package com.ss.android.lark.language.service.watch;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.language.service.watch.LocaleWatchDogLogger;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.log.LogLevel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDog;", "", "()V", "Companion", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.language.service.b.a */
public final class LocaleWatchDog {

    /* renamed from: a */
    public static final Companion f104871a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m163104a(String str, Context context, Locale locale, Locale locale2) {
        f104871a.mo148311a(str, context, locale, locale2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J.\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/language/service/watch/LocaleWatchDog$Companion;", "", "()V", "TAG", "", "initialize", "", "application", "Landroid/app/Application;", "watchEvent", "scene", "context", "Landroid/content/Context;", "newLocale", "Ljava/util/Locale;", "originLocale", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.language.service.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/language/service/watch/LocaleWatchDog$Companion$initialize$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.language.service.b.a$a$a */
        public static final class C41119a implements Application.ActivityLifecycleCallbacks {

            /* renamed from: a */
            final /* synthetic */ Application f104872a;

            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivityPaused(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivityResumed(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                Intrinsics.checkParameterIsNotNull(bundle, "outState");
            }

            C41119a(Application application) {
                this.f104872a = application;
            }

            public void onActivityStarted(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                LocaleWatchDogLogger.f104874a.mo148321a("activity_start", activity, this.f104872a).mo148337a(LogLevel.DEBUG);
            }

            public void onActivityStopped(Activity activity) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                LocaleWatchDogLogger.f104874a.mo148321a("activity_stop", activity, this.f104872a).mo148337a(LogLevel.DEBUG);
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkParameterIsNotNull(activity, "activity");
                LocaleWatchDogLogger.f104874a.mo148321a("activity_create", activity, this.f104872a).mo148336a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/language/service/watch/LocaleWatchDog$Companion$initialize$2", "Landroid/content/ComponentCallbacks;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "base_language_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.language.service.b.a$a$b */
        public static final class ComponentCallbacksC41120b implements ComponentCallbacks {

            /* renamed from: a */
            final /* synthetic */ Application f104873a;

            public void onLowMemory() {
            }

            ComponentCallbacksC41120b(Application application) {
                this.f104873a = application;
            }

            public void onConfigurationChanged(Configuration configuration) {
                Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
                LocaleWatchDogLogger.f104874a.mo148322a("application_configure_change", this.f104873a).mo148336a();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo148310a(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "application");
            LocaleWatchDogLogger.f104874a.mo148322a("application_init", application).mo148336a();
            application.registerActivityLifecycleCallbacks(new C41119a(application));
            application.registerComponentCallbacks(new ComponentCallbacksC41120b(application));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo148311a(String str, Context context, Locale locale, Locale locale2) {
            Intrinsics.checkParameterIsNotNull(str, "scene");
            try {
                LocaleWatchDogLogger.WatchChangeParam.Builder b = new LocaleWatchDogLogger.WatchChangeParam.Builder().mo148330b(str);
                if (context != null) {
                    String a = C26252ad.m94992a(context);
                    Intrinsics.checkExpressionValueIsNotNull(a, "ProcessUtil.getProcessName(context)");
                    b.mo148327a(a);
                }
                if (!(locale == null || locale2 == null)) {
                    b.mo148328a(locale2);
                    b.mo148331b(locale);
                }
                b.mo148335e().mo148324a();
            } catch (Exception e) {
                Log.m165383e("LocaleWatchDog", "error: " + e.getMessage());
            }
        }
    }
}
