package com.ss.android.lark.guide.biz.onboarding.tour.page.teamname;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.biz.onboarding.PageOpener;
import com.ss.android.lark.guide.biz.onboarding.tour.page.UpdateTeamStack;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "from", "", "hitFrom", "stepInfoString", "createCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "finishActivity", "", "getFragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openAddTeamMemberPage", "CallbackDefault", "CallbackForInAppUpdate", "CallbackForUpdateDialog", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingTeamNameActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f99278a = new Companion(null);

    /* renamed from: b */
    private String f99279b;

    /* renamed from: c */
    private String f99280c;

    /* renamed from: d */
    private String f99281d;

    /* renamed from: a */
    public Context mo141486a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo141488a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m152412a(this, context);
    }

    /* renamed from: c */
    public Resources mo141490c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m152409a(this, configuration);
    }

    /* renamed from: d */
    public void mo141492d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo141493e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m152414c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m152410a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m152413b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity$Companion;", "", "()V", "HIT_FROM", "", "STEP_INFO", "TAG", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$d */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity$CallbackForInAppUpdate;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$b */
    public final class CallbackForInAppUpdate implements IGetDataCallback<String> {
        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$b$a */
        public static final class RunnableC38624a implements Runnable {

            /* renamed from: a */
            public static final RunnableC38624a f99284a = new RunnableC38624a();

            RunnableC38624a() {
            }

            public final void run() {
                UpdateTeamStack.f99189a.mo141389a().mo141385a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CallbackForInAppUpdate() {
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            SettingTeamNameActivity.this.mo141487a();
            SettingTeamNameActivity settingTeamNameActivity = SettingTeamNameActivity.this;
            LKUIToast.show(settingTeamNameActivity, UIUtils.getString(settingTeamNameActivity, R.string.Lark_Passportweb_CreateSucTeam));
            SettingTeamNameActivity.this.mo141489b();
            UICallbackExecutor.post(RunnableC38624a.f99284a);
        }
    }

    /* renamed from: b */
    public final void mo141489b() {
        if (UIUtils.isActivityRunning(this)) {
            finish();
        }
    }

    /* renamed from: f */
    private final Fragment m152415f() {
        String str;
        String str2;
        String stringExtra;
        Intent intent = getIntent();
        String str3 = null;
        if (intent != null) {
            str = intent.getStringExtra("hit_from");
        } else {
            str = null;
        }
        this.f99279b = str;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            str2 = intent2.getStringExtra("stepinfo_string");
        } else {
            str2 = null;
        }
        this.f99281d = str2;
        Intent intent3 = getIntent();
        if (intent3 == null || (stringExtra = intent3.getStringExtra("from")) == null) {
            Log.m165383e(this.TAG, "from is null, please set it");
            return null;
        }
        this.f99280c = stringExtra;
        if (Intrinsics.areEqual(stringExtra, "in_app_upgrade") || Intrinsics.areEqual(this.f99280c, "banner")) {
            str3 = UIUtils.getString(this, R.string.Lark_Guide_ChooseNext);
        }
        AbstractC38549a a = C38548a.m152027a();
        String str4 = this.f99280c;
        return a.mo141244a(str4, this.f99279b, str3, this.f99281d, m152411a(str4));
    }

    /* renamed from: a */
    public final void mo141487a() {
        AbstractC38549a a = C38548a.m152027a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
        if (a.mo141259i().mo141270b("onboarding.guide.addmember.v2.enable")) {
            AbstractC38549a a2 = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "GuideModule.getDependency()");
            if (!a2.mo141253c()) {
                C38548a.m152027a().mo141248a((Context) this, "upgrade");
                return;
            }
        }
        PageOpener.f99148a.mo141348b(this, "in_app_upgrade", this.f99279b);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity$CallbackDefault;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$a */
    public final class CallbackDefault implements IGetDataCallback<String> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CallbackDefault() {
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            SettingTeamNameActivity.this.mo141489b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            SettingTeamNameActivity.this.mo141489b();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity$CallbackForUpdateDialog;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/teamname/SettingTeamNameActivity;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "tenantInfo", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$c */
    public final class CallbackForUpdateDialog implements IGetDataCallback<String> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CallbackForUpdateDialog() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            SettingTeamNameActivity.this.mo141489b();
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Integer num;
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            AbstractC38549a.AbstractC38554e j = a.mo141260j();
            Intrinsics.checkExpressionValueIsNotNull(j, "GuideModule.getDependency().loginDependency");
            TenantInfo a2 = j.mo141273a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "GuideModule.getDependenc…oginDependency.tenantInfo");
            if (a2 != null) {
                num = Integer.valueOf(a2.getTenantTag());
            } else {
                num = null;
            }
            if (num.intValue() == 0) {
                SettingTeamNameActivity.this.mo141489b();
            }
        }
    }

    /* renamed from: a */
    public static Resources m152410a(SettingTeamNameActivity settingTeamNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(settingTeamNameActivity);
        }
        return settingTeamNameActivity.mo141490c();
    }

    /* renamed from: c */
    public static AssetManager m152414c(SettingTeamNameActivity settingTeamNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(settingTeamNameActivity);
        }
        return settingTeamNameActivity.mo141493e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment f = m152415f();
        if (f != null) {
            getSupportFragmentManager().beginTransaction().replace(16908290, f).commitAllowingStateLoss();
        } else {
            mo141489b();
        }
    }

    /* renamed from: b */
    public static void m152413b(SettingTeamNameActivity settingTeamNameActivity) {
        settingTeamNameActivity.mo141492d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SettingTeamNameActivity settingTeamNameActivity2 = settingTeamNameActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    settingTeamNameActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return new com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity.CallbackForInAppUpdate(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r2.equals("banner") != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r2.equals("in_app_upgrade") != false) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.larksuite.framework.callback.IGetDataCallback<java.lang.String> m152411a(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0003
            goto L_0x0044
        L_0x0003:
            int r0 = r2.hashCode()
            switch(r0) {
                case -1784218242: goto L_0x0034;
                case -1565334044: goto L_0x0024;
                case -1396342996: goto L_0x001b;
                case -295610031: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0044
        L_0x000b:
            java.lang.String r0 = "update_bot"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$a r2 = new com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$a
            r2.<init>()
            com.larksuite.framework.callback.IGetDataCallback r2 = (com.larksuite.framework.callback.IGetDataCallback) r2
            goto L_0x004b
        L_0x001b:
            java.lang.String r0 = "banner"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x002c
        L_0x0024:
            java.lang.String r0 = "in_app_upgrade"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
        L_0x002c:
            com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$b r2 = new com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$b
            r2.<init>()
            com.larksuite.framework.callback.IGetDataCallback r2 = (com.larksuite.framework.callback.IGetDataCallback) r2
            goto L_0x004b
        L_0x0034:
            java.lang.String r0 = "update_dialog"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$c r2 = new com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$c
            r2.<init>()
            com.larksuite.framework.callback.IGetDataCallback r2 = (com.larksuite.framework.callback.IGetDataCallback) r2
            goto L_0x004b
        L_0x0044:
            com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$a r2 = new com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity$a
            r2.<init>()
            com.larksuite.framework.callback.IGetDataCallback r2 = (com.larksuite.framework.callback.IGetDataCallback) r2
        L_0x004b:
            return r2
            switch-data {-1784218242->0x0034, -1565334044->0x0024, -1396342996->0x001b, -295610031->0x000b, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.biz.onboarding.tour.page.teamname.SettingTeamNameActivity.m152411a(java.lang.String):com.larksuite.framework.callback.IGetDataCallback");
    }

    /* renamed from: a */
    public static void m152412a(SettingTeamNameActivity settingTeamNameActivity, Context context) {
        settingTeamNameActivity.mo141488a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(settingTeamNameActivity);
        }
    }

    /* renamed from: a */
    public static Context m152409a(SettingTeamNameActivity settingTeamNameActivity, Configuration configuration) {
        Context a = settingTeamNameActivity.mo141486a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
