package com.ss.android.lark.setting.service.usersetting.appearance;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.C0264f;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.IUiModeService;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.common.statistics.DisplayAppearanceSettingHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.LarkContext;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u001a\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001dJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\fH\u0002J\u000e\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0007J\u0010\u0010(\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010)\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0010\u0010,\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010-\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010.\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u0018\u0010/\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0006\u00101\u001a\u00020\u001dJ\u0006\u00102\u001a\u00020\u001dJ\u0010\u00103\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u00103\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00182\b\b\u0002\u00105\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/UiModeService;", "Lcom/ss/android/lark/biz/core/api/IUiModeService;", "()V", "SP_KEY_NIGHT_MODE", "", "TAG", "osNightMode", "", "uiModeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/biz/core/api/IUiModeService$UiModeChangeListener;", "addUiModeChangeListener", "", "listener", "applyMode", "context", "Landroid/content/Context;", "mode", "applyUserSetMode", "dayNightToString", "dayNightMode", "getCurrentMode", "getModeFromConfiguration", "config", "Landroid/content/res/Configuration;", "getModeFromContext", "getUserSetNightMode", "initUiMode", "isNightModeEnable", "", "killProcess", "killAll", "notifyListeners", "registerActivityLifecycleCallbacks", "registerSystemConfigurationChangeListener", "registerUiModeChangeListener", "removeUiModeChangeListener", "restoreAppContextConfiguration", "sendClickAppearanceSetting", "beforeMode", "sendOsNightModeHitPoint", "sendUserNightModeHitPoint", "appMode", "uploadType", "sendUserNightModeHitPointByInit", "sendUserNightModeHitPointBySetting", "setMode", "setNightModeToConfiguration", "setUserSetNightMode", "supportDarkMode", "supportFollowSystem", "updateAppContextConfiguration", "appConfig", "wrapResources", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.d */
public final class UiModeService implements IUiModeService {

    /* renamed from: b */
    public static final UiModeService f135042b = new UiModeService();

    /* renamed from: c */
    private static final CopyOnWriteArrayList<IUiModeService.UiModeChangeListener> f135043c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static int f135044d = 2;

    /* renamed from: b */
    public final String mo186692b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "light" : "night" : "follow_system";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/setting/service/usersetting/appearance/UiModeService$registerActivityLifecycleCallbacks$2", "Lcom/ss/android/lark/setting/service/usersetting/appearance/SimpleActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResumed", "onActivityStarted", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.d$b */
    public static final class C54652b extends SimpleActivityLifecycleCallbacks {
        C54652b() {
        }

        @Override // com.ss.android.lark.setting.service.usersetting.appearance.SimpleActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            C54651a.INSTANCE.invoke(activity, "onActivityResumed");
        }

        @Override // com.ss.android.lark.setting.service.usersetting.appearance.SimpleActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            C54651a.INSTANCE.invoke(activity, "onActivityStarted");
        }

        @Override // com.ss.android.lark.setting.service.usersetting.appearance.SimpleActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            C54651a.INSTANCE.invoke(activity, "onActivityCreated");
        }
    }

    private UiModeService() {
    }

    @Override // com.ss.android.lark.biz.core.api.IUiModeService
    /* renamed from: a */
    public void mo105601a(IUiModeService.UiModeChangeListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        f135043c.add(bVar);
    }

    @Override // com.ss.android.lark.biz.core.api.IUiModeService
    /* renamed from: a */
    public boolean mo105602a() {
        return C37239a.m146648b().mo136951a("lark.core.dark_mode_android_overall") && DarkModeCompatibilityList.f135039a.mo186678a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e4, code lost:
        if (kotlin.text.StringsKt.startsWith$default(r8, r3 + ':', false, 2, (java.lang.Object) null) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x003c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo186691a(android.content.Context r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.setting.service.usersetting.appearance.UiModeService.mo186691a(android.content.Context, boolean):void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.d$d */
    public static final class C54654d extends Lambda implements Function0<Unit> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54654d(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UiModeService.f135042b.mo186698d(this.$context);
        }
    }

    /* renamed from: b */
    public final boolean mo186694b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo186699e() {
        return C57744a.m224104a().getInt("night_mode", 0);
    }

    /* renamed from: d */
    public int mo186697d() {
        int l = AppCompatDelegate.m732l();
        if (l != 1) {
            if (l == 2) {
                return 1;
            }
            if (mo186694b()) {
                return 0;
            }
        }
        return 2;
    }

    /* renamed from: f */
    private final void m212151f() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "appContext");
        if (mo186695c(application) != f135044d) {
            Log.m165389i("UiModeManager", "restore mode " + mo186692b(f135044d) + " to app configuration");
            int i = f135044d;
            Resources resources = application.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "appContext.resources");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration, "appContext.resources.configuration");
            m212143a(i, configuration);
            AppResourcesCompat aVar = AppResourcesCompat.f135037a;
            Resources resources2 = application.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources2, "appContext.resources");
            Configuration configuration2 = resources2.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration2, "appContext.resources.configuration");
            aVar.mo186675a(application, configuration2);
            C0264f.m966a(application.getResources());
        }
    }

    /* renamed from: c */
    public final boolean mo186696c() {
        if (Build.VERSION.SDK_INT < 24 || !DarkModeCompatibilityList.f135039a.mo186678a()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/setting/service/usersetting/appearance/UiModeService$registerSystemConfigurationChangeListener$1", "Landroid/content/ComponentCallbacks;", "onConfigurationChanged", "", "osConfig", "Landroid/content/res/Configuration;", "onLowMemory", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.d$c */
    public static final class ComponentCallbacksC54653c implements ComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ Context f135045a;

        public void onLowMemory() {
        }

        ComponentCallbacksC54653c(Context context) {
            this.f135045a = context;
        }

        public void onConfigurationChanged(Configuration configuration) {
            int i;
            Intrinsics.checkParameterIsNotNull(configuration, "osConfig");
            UiModeService dVar = UiModeService.f135042b;
            if (UDUiModeUtils.m93320a(configuration)) {
                i = 1;
            } else {
                i = 2;
            }
            UiModeService.f135044d = i;
            StringBuilder sb = new StringBuilder();
            sb.append("onConfigurationChanged, new os mode: ");
            UiModeService dVar2 = UiModeService.f135042b;
            UiModeService dVar3 = UiModeService.f135042b;
            sb.append(dVar2.mo186692b(UiModeService.f135044d));
            Log.m165389i("UiModeManager", sb.toString());
            UiModeService dVar4 = UiModeService.f135042b;
            Context context = this.f135045a;
            Intrinsics.checkExpressionValueIsNotNull(context, "appContext");
            UiModeService.m212147a(dVar4, context, configuration, false, 4, null);
        }
    }

    /* renamed from: a */
    private final int m212141a(Configuration configuration) {
        if (UDUiModeUtils.m93320a(configuration)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: c */
    private final void m212149c(int i) {
        C57744a.m224104a().putInt("night_mode", i);
    }

    /* renamed from: g */
    private final void m212153g(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.registerComponentCallbacks(new ComponentCallbacksC54653c(applicationContext));
    }

    /* renamed from: i */
    private final void m212155i(Context context) {
        DisplayAppearanceSettingHitPoint.m210250a(UDUiModeUtils.m93319a(context), mo186694b());
    }

    /* renamed from: j */
    private final void m212156j(Context context) {
        m212144a(context, mo186699e(), "open");
    }

    /* renamed from: f */
    private final void m212152f(Context context) {
        if (!C26252ad.m94993b(context)) {
            UiModeChangeBroadcastReceiver.f135035a.mo186670a(context, new C54654d(context));
        }
    }

    /* renamed from: h */
    private final void m212154h(Context context) {
        C54651a aVar = C54651a.INSTANCE;
        if (context != null) {
            ((Application) context).registerActivityLifecycleCallbacks(new C54652b());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }

    /* renamed from: e */
    public final void mo186700e(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        m212144a(context, mo186697d(), "user");
    }

    /* renamed from: c */
    public final int mo186695c(Context context) {
        if (UDUiModeUtils.m93319a(context)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: d */
    public final void mo186698d(Context context) {
        int e = mo186699e();
        Log.m165389i("UiModeManager", "apply user set night mode: " + mo186692b(e));
        m212148b(context, e);
    }

    /* renamed from: b */
    public final void mo186693b(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "appContext");
        Resources resources = applicationContext.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "appContext.resources");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkExpressionValueIsNotNull(configuration, "appContext.resources.configuration");
        m212145a(applicationContext, configuration, true);
    }

    /* renamed from: a */
    public final void mo186688a(int i) {
        boolean z;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? i == 1 : f135044d == 1) {
            z2 = true;
        }
        DisplayAppearanceSettingHitPoint.m210251a(z, z2, mo186697d());
    }

    /* renamed from: a */
    public void mo186689a(Context context) {
        int i;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (UDUiModeUtils.m93319a(context)) {
            i = 1;
        } else {
            i = 2;
        }
        f135044d = i;
        m212155i(context);
        m212156j(context);
        m212153g(context);
        m212154h(context);
        if (mo105602a()) {
            Log.m165389i("UiModeManager", "night mode enabled.");
            mo186698d(context);
            m212152f(context);
            return;
        }
        Log.m165389i("UiModeManager", "night mode not enabled.");
        m212148b(context, 2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"checkAndUpdateUiMode", "", "activity", "Landroid/app/Activity;", "tag", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.d$a */
    public static final class C54651a extends Lambda implements Function2<Activity, String, Unit> {
        public static final C54651a INSTANCE = new C54651a();

        C54651a() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Activity activity, String str) {
            invoke(activity, str);
            return Unit.INSTANCE;
        }

        public final void invoke(Activity activity, String str) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            int d = UiModeService.f135042b.mo186697d();
            if (d != 0) {
                int c = UiModeService.f135042b.mo186695c(activity);
                UiModeService dVar = UiModeService.f135042b;
                Application application = activity.getApplication();
                Intrinsics.checkExpressionValueIsNotNull(application, "activity.application");
                int c2 = dVar.mo186695c(application);
                if (c != c2) {
                    Log.m165397w("UiModeManager", str + " activityMode != applicationMode, " + "modeShouldBe = " + UiModeService.f135042b.mo186692b(d) + ' ' + "activityMode = " + UiModeService.f135042b.mo186692b(c) + ' ' + "applicationMode = " + UiModeService.f135042b.mo186692b(c2));
                    UiModeService dVar2 = UiModeService.f135042b;
                    Application application2 = activity.getApplication();
                    Intrinsics.checkExpressionValueIsNotNull(application2, "activity.application");
                    dVar2.mo186693b(application2);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m212143a(int i, Configuration configuration) {
        int i2;
        int i3 = configuration.uiMode & -49;
        if (i == 2) {
            i2 = 16;
        } else {
            i2 = 32;
        }
        configuration.uiMode = i2 | i3;
    }

    /* renamed from: b */
    private final void m212148b(Context context, int i) {
        if (i == 0) {
            m212151f();
            AppCompatDelegate.m731e(-1);
        } else if (i == 1) {
            AppCompatDelegate.m731e(2);
        } else if (i == 2) {
            AppCompatDelegate.m731e(1);
        } else {
            return;
        }
        mo186693b(context);
    }

    /* renamed from: c */
    private final void m212150c(Context context, int i) {
        Iterator<IUiModeService.UiModeChangeListener> it = f135043c.iterator();
        while (it.hasNext()) {
            it.next().onNightModeChange(i);
        }
        UiModeChangeBroadcastReceiver.f135035a.mo186673c(context);
    }

    /* renamed from: a */
    public final void mo186690a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (i != mo186697d()) {
            m212149c(i);
            m212150c(context, i);
        }
    }

    /* renamed from: a */
    private final void m212144a(Context context, int i, String str) {
        boolean z;
        int i2 = f135044d;
        boolean z2 = false;
        if (i == 0) {
            z = UDUiModeUtils.m93319a(context);
        } else if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 1) {
            z2 = true;
        }
        DisplayAppearanceSettingHitPoint.m210252a(z, z2, i, str);
    }

    /* renamed from: a */
    private final void m212145a(Context context, Configuration configuration, boolean z) {
        Context applicationContext = context.getApplicationContext();
        if (z) {
            AppResourcesCompat aVar = AppResourcesCompat.f135037a;
            if (applicationContext != null) {
                aVar.mo186674a((Application) applicationContext);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
            }
        }
        int d = mo186697d();
        int a = m212141a(configuration);
        Log.m165389i("UiModeManager", "updateAppContextConfiguration, currentMode: " + mo186692b(d) + ',' + " application mode: " + mo186692b(a) + " current os mode: " + mo186692b(f135044d));
        if (d != 0 && d != a) {
            Log.m165389i("UiModeManager", "set mode " + mo186692b(d) + " to app configuration");
            m212143a(d, configuration);
            AppResourcesCompat aVar2 = AppResourcesCompat.f135037a;
            if (applicationContext != null) {
                Application application = (Application) applicationContext;
                aVar2.mo186675a(application, configuration);
                Log.m165389i("UiModeManager", "application mode is set to " + mo186692b(mo186695c(applicationContext)));
                C0264f.m966a(application.getResources());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m212147a(UiModeService dVar, Context context, Configuration configuration, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        dVar.m212145a(context, configuration, z);
    }
}
