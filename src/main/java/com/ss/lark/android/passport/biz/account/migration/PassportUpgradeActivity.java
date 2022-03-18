package com.ss.lark.android.passport.biz.account.migration;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.air.AirActivity;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49127k;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49145aa;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0014J\b\u0010\u0010\u001a\u00020\bH\u0014J\b\u0010\u0011\u001a\u00020\bH\u0014J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/PassportUpgradeActivity;", "Lcom/larksuite/component/air/AirActivity;", "()V", "loadingView", "Lcom/larksuite/component/ui/loading/LKUILoadingView;", "mNeedKillProcess", "", "initUpgradeHelper", "", "killOtherProcesses", "launchMainWindow", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "upgradeFailed", "upgradeSuccess", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PassportUpgradeActivity extends AirActivity {

    /* renamed from: b */
    public static final Companion f162542b = new Companion(null);

    /* renamed from: a */
    public boolean f162543a;

    /* renamed from: c */
    private LKUILoadingView f162544c;

    /* renamed from: d */
    private HashMap f162545d;

    /* renamed from: a */
    public Context mo222775a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public View mo222776a(int i) {
        if (this.f162545d == null) {
            this.f162545d = new HashMap();
        }
        View view = (View) this.f162545d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f162545d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo222778a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m252867a(this, context);
    }

    /* renamed from: c */
    public Resources mo222780c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m252865a(this, configuration);
    }

    /* renamed from: d */
    public void mo222782d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo222783e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m252869c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m252866a(this);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m252868b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/migration/PassportUpgradeActivity$Companion;", "", "()V", "KEY_PASSPORT_UPGRADE", "", "LAUNCH_DELAY", "", "TAG", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.PassportUpgradeActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.PassportUpgradeActivity$b */
    public static final class C64317b extends Lambda implements Function0<Unit> {
        final /* synthetic */ PassportUpgradeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64317b(PassportUpgradeActivity passportUpgradeActivity) {
            super(0);
            this.this$0 = passportUpgradeActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo222777a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.PassportUpgradeActivity$c */
    public static final class C64318c extends Lambda implements Function0<Unit> {
        final /* synthetic */ PassportUpgradeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64318c(PassportUpgradeActivity passportUpgradeActivity) {
            super(0);
            this.this$0 = passportUpgradeActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo222779b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.PassportUpgradeActivity$d */
    public static final class C64319d extends Lambda implements Function0<Unit> {
        final /* synthetic */ PassportUpgradeActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64319d(PassportUpgradeActivity passportUpgradeActivity) {
            super(0);
            this.this$0 = passportUpgradeActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo222779b();
        }
    }

    /* renamed from: g */
    private final void m252871g() {
        m252872h();
        C49148ac.m193807a(new RunnableC64320e(this), 300);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        LKUILoadingView lKUILoadingView = this.f162544c;
        if (lKUILoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        }
        lKUILoadingView.cancelAnimation();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        LKUILoadingView lKUILoadingView = this.f162544c;
        if (lKUILoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        }
        lKUILoadingView.playAnimation();
    }

    /* renamed from: b */
    public final void mo222779b() {
        UDToast.show(this, (int) R.string.Lark_Passport_InitializeDataFailedToast);
        ServiceFinder.m193744a().removeAllUsers();
        SessionUpgradeChecker.m252937e();
        m252871g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        SessionUpgradeHelper.f162547a.mo222793d();
        if (this.f162543a) {
            Process.killProcess(Process.myPid());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.migration.PassportUpgradeActivity$e */
    public static final class RunnableC64320e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassportUpgradeActivity f162546a;

        RunnableC64320e(PassportUpgradeActivity passportUpgradeActivity) {
            this.f162546a = passportUpgradeActivity;
        }

        public final void run() {
            User user;
            Intent intent = this.f162546a.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            Bundle extras = intent.getExtras();
            Bundle bundle = new Bundle();
            if (extras != null) {
                bundle.putAll(extras);
            }
            bundle.putBoolean("key_passport_upgrade", true);
            AbstractC49127k g = ServiceFinder.m193752g();
            PassportUpgradeActivity passportUpgradeActivity = this.f162546a;
            IUserService e = ServiceFinder.m193750e();
            if (e != null) {
                user = e.mo171597e();
            } else {
                user = null;
            }
            g.launchMainWindow(passportUpgradeActivity, user, bundle);
            this.f162546a.finish();
            this.f162546a.f162543a = true;
        }
    }

    /* renamed from: f */
    private final void m252870f() {
        SessionUpgradeHelper.f162547a.mo222788a(new C64317b(this));
        SessionUpgradeHelper.f162547a.mo222790b(new C64318c(this));
        SessionUpgradeHelper.f162547a.mo222792c(new C64319d(this));
    }

    /* renamed from: h */
    private final void m252872h() {
        Object obj;
        Object systemService = getSystemService("activity");
        List list = null;
        if (!(systemService instanceof ActivityManager)) {
            systemService = null;
        }
        ActivityManager activityManager = (ActivityManager) systemService;
        if (activityManager != null) {
            try {
                Result.Companion aVar = Result.Companion;
                PassportUpgradeActivity passportUpgradeActivity = this;
                obj = Result.m271569constructorimpl(activityManager.getRunningAppProcesses());
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
            }
            if (!Result.m271575isFailureimpl(obj)) {
                list = obj;
            }
            List list2 = list;
            if (list2 != null) {
                String a = C49224w.m194051a(this);
                ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!Intrinsics.areEqual(((ActivityManager.RunningAppProcessInfo) obj2).processName, a)) {
                        arrayList.add(obj2);
                    }
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
                    PassportLog.f123351c.mo171474a().mo171465b("PassportUpgradeActivity", "kill process: " + runningAppProcessInfo.processName);
                    Process.killProcess(runningAppProcessInfo.pid);
                }
                return;
            }
            PassportLog.f123351c.mo171474a().mo171471d("PassportUpgradeActivity", "processes not found");
            return;
        }
        PassportLog.f123351c.mo171474a().mo171471d("PassportUpgradeActivity", "activity manager not found!!!");
    }

    /* renamed from: a */
    public final void mo222777a() {
        SessionUpgradeChecker.m252937e();
        m252871g();
    }

    /* renamed from: a */
    public static Resources m252866a(PassportUpgradeActivity passportUpgradeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(passportUpgradeActivity);
        }
        return passportUpgradeActivity.mo222780c();
    }

    /* renamed from: c */
    public static AssetManager m252869c(PassportUpgradeActivity passportUpgradeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(passportUpgradeActivity);
        }
        return passportUpgradeActivity.mo222783e();
    }

    /* renamed from: b */
    public static void m252868b(PassportUpgradeActivity passportUpgradeActivity) {
        passportUpgradeActivity.mo222782d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PassportUpgradeActivity passportUpgradeActivity2 = passportUpgradeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    passportUpgradeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        C49145aa.m193795a((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_passport_upgrade_5_2);
        LKUILoadingView lKUILoadingView = (LKUILoadingView) mo222776a(R.id.passport_session_upgrade_top_loading);
        Intrinsics.checkExpressionValueIsNotNull(lKUILoadingView, "passport_session_upgrade_top_loading");
        this.f162544c = lKUILoadingView;
        m252870f();
        SessionUpgradeHelper.f162547a.mo222794e();
    }

    /* renamed from: a */
    public static void m252867a(PassportUpgradeActivity passportUpgradeActivity, Context context) {
        passportUpgradeActivity.mo222778a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(passportUpgradeActivity);
        }
    }

    /* renamed from: a */
    public static Context m252865a(PassportUpgradeActivity passportUpgradeActivity, Configuration configuration) {
        Context a = passportUpgradeActivity.mo222775a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
