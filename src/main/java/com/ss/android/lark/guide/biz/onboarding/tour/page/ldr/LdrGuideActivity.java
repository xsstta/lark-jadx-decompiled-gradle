package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrActConfig;", "()V", "hideBack", "", "teamName", "", "getTeamName", "()Ljava/lang/String;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "parseParams", "setupFragment", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LdrGuideActivity extends BaseFragmentActivity implements LdrActConfig {

    /* renamed from: a */
    public static final Companion f99190a = new Companion(null);

    /* renamed from: b */
    private boolean f99191b;

    @JvmStatic
    /* renamed from: a */
    public static final void m152275a(Context context, boolean z, String str) {
        f99190a.mo141399a(context, z, str);
    }

    /* renamed from: a */
    public Context mo141390a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo141391a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m152276a(this, context);
    }

    /* renamed from: c */
    public Resources mo141394c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m152273a(this, configuration);
    }

    /* renamed from: d */
    public void mo141396d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo141397e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m152278c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m152274a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m152277b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideActivity$Companion;", "", "()V", "KEY_HIDE_BACK", "", "KEY_TEAM_NAME", "start", "", "context", "Landroid/content/Context;", "hideBack", "", "teamName", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo141399a(Context context, boolean z, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent(context, LdrGuideActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("hide_back", z);
            intent.putExtra("team_name", str);
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (!this.f99191b) {
            super.onBackPressed();
        }
    }

    /* renamed from: f */
    private final void m152279f() {
        this.f99191b = getIntent().getBooleanExtra("hide_back", false);
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrActConfig
    /* renamed from: b */
    public String mo141393b() {
        return getIntent().getStringExtra("team_name");
    }

    /* renamed from: g */
    private final void m152280g() {
        LdrGuideFragment dVar = new LdrGuideFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, dVar, "ldr_guide_fragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrActConfig
    /* renamed from: a */
    public boolean mo141392a() {
        return this.f99191b;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m152279f();
        m152280g();
    }

    /* renamed from: a */
    public static Resources m152274a(LdrGuideActivity ldrGuideActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(ldrGuideActivity);
        }
        return ldrGuideActivity.mo141394c();
    }

    /* renamed from: c */
    public static AssetManager m152278c(LdrGuideActivity ldrGuideActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(ldrGuideActivity);
        }
        return ldrGuideActivity.mo141397e();
    }

    /* renamed from: b */
    public static void m152277b(LdrGuideActivity ldrGuideActivity) {
        ldrGuideActivity.mo141396d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LdrGuideActivity ldrGuideActivity2 = ldrGuideActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    ldrGuideActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m152276a(LdrGuideActivity ldrGuideActivity, Context context) {
        ldrGuideActivity.mo141391a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(ldrGuideActivity);
        }
    }

    /* renamed from: a */
    public static Context m152273a(LdrGuideActivity ldrGuideActivity, Configuration configuration) {
        Context a = ldrGuideActivity.mo141390a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
