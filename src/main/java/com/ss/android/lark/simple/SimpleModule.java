package com.ss.android.lark.simple;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.simple.service.ISimpleModeService;
import com.ss.android.lark.simple.service.SimpleModeService;
import com.ss.android.lark.simple.switcher.SimpleModeSwitcher;
import com.ss.android.lark.simple.ui.ISimpleMainLauncher;
import com.ss.android.lark.simple.ui.SimpleMainLauncher;
import com.ss.android.lark.simple.ui.popup.SimplePopupWindowUtils;
import com.ss.android.lark.simple.web.SimpleModeUrlParam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\n\u001d\u001e\u001f !\"#$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0017J4\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000e2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c¨\u0006'"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule;", "", "simpleDependency", "Lcom/ss/android/lark/simple/SimpleModule$ISimpleModuleDependency;", "(Lcom/ss/android/lark/simple/SimpleModule$ISimpleModuleDependency;)V", "checkSimpleMode", "", "context", "Landroid/app/Activity;", "mode", "", "getFeatureGatingMap", "", "", "", "getSimpleMainLauncher", "Lcom/ss/android/lark/simple/ui/ISimpleMainLauncher;", "getSimpleModeService", "Lcom/ss/android/lark/simple/service/ISimpleModeService;", "isSimpleModeOn", "Landroid/content/Context;", "showSimplePopupWindow", "view", "Landroid/view/View;", "switchToMode", "activity", "forceSwitch", "callback", "Lkotlin/Function1;", "Companion", "IBrowserDependency", "IDocDependency", "IFeatureGatingDependency", "IGuideDependency", "ILoginDependency", "IMainDependency", "ISettingDependency", "ISimpleModuleDependency", "IWsChannelDependency", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.simple.a */
public final class SimpleModule {

    /* renamed from: a */
    public static ISimpleModuleDependency f135401a;

    /* renamed from: b */
    public static final Companion f135402b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "", "getWebViewFragment", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "urlParams", "Lcom/ss/android/lark/simple/web/SimpleModeUrlParam;", "url", "", "syncSession", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$b */
    public interface IBrowserDependency {
        /* renamed from: a */
        Fragment mo187079a(Context context, SimpleModeUrlParam aVar, String str);

        /* renamed from: a */
        void mo187080a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$IDocDependency;", "", "stopDocKeepAliveService", "", "context", "Landroid/content/Context;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$c */
    public interface IDocDependency {
        /* renamed from: a */
        void mo187081a(Context context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$IFeatureGatingDependency;", "", "isFeatureEnable", "", "key", "", "default", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$d */
    public interface IFeatureGatingDependency {
        /* renamed from: a */
        boolean mo187082a(String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$IGuideDependency;", "", "checkToShow", "", "guideKey", "", "completeGuide", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$e */
    public interface IGuideDependency {
        /* renamed from: a */
        boolean mo187083a(String str);

        /* renamed from: b */
        void mo187084b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$ILoginDependency;", "", "getDeviceId", "", "getSession", "isLogin", "", "isToCAccount", "logout", "", "activity", "Landroid/app/Activity;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$f */
    public interface ILoginDependency {
        /* renamed from: a */
        void mo187085a(Activity activity, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        boolean mo187086a();

        /* renamed from: b */
        boolean mo187087b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$IMainDependency;", "", "getLaunchMainIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$g */
    public interface IMainDependency {
        /* renamed from: a */
        Intent mo187088a(Context context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$ISettingDependency;", "", "startLanguageAndTranslateActivity", "", "context", "Landroid/app/Activity;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$h */
    public interface ISettingDependency {
        /* renamed from: a */
        void mo187089a(Activity activity);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$ISimpleModuleDependency;", "", "getBrowserDependency", "Lcom/ss/android/lark/simple/SimpleModule$IBrowserDependency;", "getDocDependency", "Lcom/ss/android/lark/simple/SimpleModule$IDocDependency;", "getFeatureGatingDependency", "Lcom/ss/android/lark/simple/SimpleModule$IFeatureGatingDependency;", "getGuideDependency", "Lcom/ss/android/lark/simple/SimpleModule$IGuideDependency;", "getLoginDependency", "Lcom/ss/android/lark/simple/SimpleModule$ILoginDependency;", "getMainDependency", "Lcom/ss/android/lark/simple/SimpleModule$IMainDependency;", "getSettingDependency", "Lcom/ss/android/lark/simple/SimpleModule$ISettingDependency;", "getSimpleModeLoadUrl", "", "getWsChannelDependency", "Lcom/ss/android/lark/simple/SimpleModule$IWsChannelDependency;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$i */
    public interface ISimpleModuleDependency {
        /* renamed from: a */
        ILoginDependency mo187090a();

        /* renamed from: b */
        IBrowserDependency mo187091b();

        /* renamed from: c */
        IMainDependency mo187092c();

        /* renamed from: d */
        IFeatureGatingDependency mo187093d();

        /* renamed from: e */
        ISettingDependency mo187094e();

        /* renamed from: f */
        IGuideDependency mo187095f();

        /* renamed from: g */
        IWsChannelDependency mo187096g();

        /* renamed from: h */
        IDocDependency mo187097h();

        /* renamed from: i */
        String mo187098i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$IWsChannelDependency;", "", "stopWsChannelLaunchService", "", "context", "Landroid/content/Context;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$j */
    public interface IWsChannelDependency {
        /* renamed from: a */
        void mo187099a(Context context);
    }

    @JvmStatic
    /* renamed from: c */
    public static final ISimpleModuleDependency m212716c() {
        return f135402b.mo187078a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/simple/SimpleModule$Companion;", "", "()V", "LOAD_URL_PATH", "", "sDependency", "Lcom/ss/android/lark/simple/SimpleModule$ISimpleModuleDependency;", "getDependency", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ISimpleModuleDependency mo187078a() {
            return SimpleModule.f135401a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ISimpleModeService mo187072a() {
        return SimpleModeService.f135451c.mo187138a();
    }

    /* renamed from: b */
    public final ISimpleMainLauncher mo187077b() {
        return new SimpleMainLauncher();
    }

    public SimpleModule(ISimpleModuleDependency iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "simpleDependency");
        f135401a = iVar;
    }

    /* renamed from: a */
    public final boolean mo187076a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (SimpleModeService.f135451c.mo187138a().mo187130a(context) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo187073a(Activity activity, int i) {
        if (SimpleModeService.f135451c.mo187138a().mo187134a()) {
            SimpleModeSwitcher.m212745a(activity, i);
        }
    }

    /* renamed from: a */
    public final void mo187075a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (SimpleModeService.f135451c.mo187138a().mo187135b()) {
            SimplePopupWindowUtils.m212842a(activity, view);
        }
    }

    /* renamed from: a */
    public final void mo187074a(Activity activity, int i, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        SimpleModeSwitcher.m212747a(activity, i, z, function1);
    }
}
