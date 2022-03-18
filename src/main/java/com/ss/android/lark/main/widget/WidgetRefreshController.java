package com.ss.android.lark.main.widget;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.widget.calendar.CalendarMediumWidgetProvider;
import com.ss.android.lark.main.widget.calendar.CalendarSmallWidgetProvider;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.time.format.common.LocaleUtil;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/lark/main/widget/WidgetRefreshController;", "", "()V", "foregroundActivityCount", "", "getForegroundActivityCount", "()I", "setForegroundActivityCount", "(I)V", "hasRegistered", "", "isAppBackground", "()Z", "setAppBackground", "(Z)V", "sp", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "setSp", "(Landroid/content/SharedPreferences;)V", "enableMediumWidget", "enableSmallWidget", "enterBackground", "", "activity", "Landroid/app/Activity;", "init", "appContext", "Landroid/app/Application;", "updateUserCache", "cleanCache", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.widget.b */
public final class WidgetRefreshController {

    /* renamed from: a */
    public static SharedPreferences f112909a;

    /* renamed from: b */
    public static final WidgetRefreshController f112910b = new WidgetRefreshController();

    /* renamed from: c */
    private static boolean f112911c;

    /* renamed from: d */
    private static int f112912d;

    /* renamed from: e */
    private static boolean f112913e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/main/widget/WidgetRefreshController$init$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.b$a */
    public static final class C44536a implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

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

        C44536a() {
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            WidgetRefreshController bVar = WidgetRefreshController.f112910b;
            bVar.mo158007a(bVar.mo158006a() + 1);
            if (bVar.mo158006a() == 1) {
                WidgetRefreshController.f112910b.mo158010a(false);
            }
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            WidgetRefreshController bVar = WidgetRefreshController.f112910b;
            bVar.mo158007a(bVar.mo158006a() - 1);
            if (bVar.mo158006a() <= 0) {
                WidgetRefreshController.f112910b.mo158010a(true);
                WidgetRefreshController.f112910b.mo158008a(activity);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/main/widget/WidgetRefreshController$init$2", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ISwitchTenantListener;", "onBeginChange", "", "onEndChange", "isSuccess", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.b$b */
    public static final class C44537b implements AbstractC49404s {
        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s
        /* renamed from: a */
        public void mo144512a() {
        }

        C44537b() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s
        /* renamed from: a */
        public void mo144513a(boolean z) {
            WidgetRefreshController.f112910b.mo158011b(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/main/widget/WidgetRefreshController$init$3", "Lcom/ss/android/lark/main/dependency/IMainModuleDependency$ILoginDependency$ILoginCallback;", "onLogin", "", "onLogout", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.b$c */
    public static final class C44538c implements AbstractC44136a.AbstractC44160o.AbstractC44162b {
        C44538c() {
        }

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o.AbstractC44162b
        /* renamed from: a */
        public void mo157134a() {
            WidgetRefreshController.f112910b.mo158011b(false);
        }

        @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44160o.AbstractC44162b
        /* renamed from: b */
        public void mo157135b() {
            WidgetRefreshController.f112910b.mo158011b(true);
        }
    }

    private WidgetRefreshController() {
    }

    /* renamed from: a */
    public final int mo158006a() {
        return f112912d;
    }

    /* renamed from: b */
    private final boolean m176707b() {
        SharedPreferences sharedPreferences = f112909a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sp");
        }
        return sharedPreferences.getBoolean("widget_enable_medium_calendar_widget", false);
    }

    /* renamed from: c */
    private final boolean m176708c() {
        SharedPreferences sharedPreferences = f112909a;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sp");
        }
        return sharedPreferences.getBoolean("sp_enable_small_calendar_widget", false);
    }

    /* renamed from: a */
    public final void mo158007a(int i) {
        f112912d = i;
    }

    /* renamed from: a */
    public final void mo158010a(boolean z) {
        f112913e = z;
    }

    /* renamed from: a */
    public final void mo158008a(Activity activity) {
        if (m176708c() || m176707b()) {
            Activity activity2 = activity;
            Intent intent = new Intent(activity2, CalendarSmallWidgetProvider.class);
            intent.setAction("com.ss.android.lark.action.APPWIDGET_UPDATE");
            activity.sendBroadcast(intent);
            Intent intent2 = new Intent(activity2, CalendarMediumWidgetProvider.class);
            intent2.setAction("com.ss.android.lark.action.APPWIDGET_UPDATE");
            activity.sendBroadcast(intent2);
            return;
        }
        Log.m165389i("WidgetProcess", "enter background, but widget disable");
    }

    /* renamed from: a */
    public final void mo158009a(Application application) {
        String str;
        Intrinsics.checkParameterIsNotNull(application, "appContext");
        if (!f112911c) {
            f112911c = true;
            SharedPreferences sharedPreferences = application.getSharedPreferences("lark_widget_provider_info", 0);
            Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "appContext.getSharedPref…ME, Context.MODE_PRIVATE)");
            f112909a = sharedPreferences;
            application.registerActivityLifecycleCallbacks(new C44536a());
            mo158011b(false);
            try {
                PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                Intrinsics.checkExpressionValueIsNotNull(packageInfo, "appContext.packageManage…ppContext.packageName, 0)");
                str = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "1.0.0";
            }
            C57744a.m224104a().putString("widget_provider_version", str);
            C44134a.m174959a().mo133220a(new C44537b());
            AbstractC44136a a = C44134a.m174959a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
            a.mo133257m().mo133346a(new C44538c());
        }
    }

    /* renamed from: b */
    public final void mo158011b(boolean z) {
        if (z) {
            C57744a.m224104a().putString("widget_provider_user_session", "");
            return;
        }
        C57744a a = C57744a.m224104a();
        AbstractC44136a a2 = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MainModule.getDependency()");
        AbstractC44136a.AbstractC44137a g = a2.mo133251g();
        Intrinsics.checkExpressionValueIsNotNull(g, "MainModule.getDependency().accountDependency");
        a.putString("widget_provider_user_session", g.mo133321c());
        C57744a.m224104a().putString("widget_provider_domain", C44134a.m174959a().mo133208a(DomainSettings.Alias.API));
        C57744a a3 = C57744a.m224104a();
        AbstractC44136a a4 = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MainModule.getDependency()");
        a3.putString("widget_provider_did", a4.mo133268x());
        Locale a5 = LocaleUtil.f139148a.mo191617a(Locale.getDefault());
        if (a5 == null) {
            a5 = Locale.getDefault();
        }
        C57744a a6 = C57744a.m224104a();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkExpressionValueIsNotNull(a5, "locale");
        sb.append(a5.getLanguage());
        sb.append('_');
        sb.append(a5.getCountry());
        a6.putString("widget_provider_locale", sb.toString());
        C57744a a7 = C57744a.m224104a();
        AbstractC44136a a8 = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a8, "MainModule.getDependency()");
        a7.putString("widget_provider_applink_pre", a8.mo133267w());
    }
}
