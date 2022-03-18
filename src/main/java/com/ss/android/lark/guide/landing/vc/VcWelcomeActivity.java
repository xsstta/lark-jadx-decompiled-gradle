package com.ss.android.lark.guide.landing.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.landing.general.C38630a;
import com.ss.android.lark.guide.landing.vc.p1929a.C38653a;
import com.ss.android.lark.guide.landing.vc.p1930b.AbstractC38658b;
import com.ss.android.lark.guide.landing.vc.p1930b.C38654a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class VcWelcomeActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private static Bitmap f99354a;

    /* renamed from: b */
    private Bitmap f99355b;

    /* renamed from: a */
    public Context mo141570a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo141571a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo141572a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m152516a(this, context);
    }

    /* renamed from: b */
    public void mo141573b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo141574c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m152512a(this, configuration);
    }

    public AssetManager getAssets() {
        return m152519c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m152513a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m152518b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.guide.landing.vc.VcWelcomeActivity$a */
    public class C38652a implements AbstractC38658b {
        @Override // com.ss.android.lark.guide.landing.vc.p1930b.AbstractC38658b
        /* renamed from: a */
        public void mo141577a() {
            m152526c();
        }

        @Override // com.ss.android.lark.guide.landing.vc.p1930b.AbstractC38658b
        /* renamed from: b */
        public void mo141578b() {
            m152527d();
        }

        /* renamed from: c */
        private void m152526c() {
            C38548a.m152027a().mo141247a(VcWelcomeActivity.this);
        }

        /* renamed from: d */
        private void m152527d() {
            C38630a.m152457a((Context) VcWelcomeActivity.this);
            VcWelcomeActivity.this.finish();
        }

        private C38652a() {
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f99355b = null;
    }

    /* renamed from: d */
    private void m152520d() {
        setDarkTextStatusBar(getResources().getColor(R.color.lkui_transparent));
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024 | DynamicModule.f58006b);
    }

    /* renamed from: a */
    public static Resources m152513a(VcWelcomeActivity vcWelcomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcWelcomeActivity);
        }
        return vcWelcomeActivity.mo141571a();
    }

    /* renamed from: c */
    public static AssetManager m152519c(VcWelcomeActivity vcWelcomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcWelcomeActivity);
        }
        return vcWelcomeActivity.mo141574c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m152520d();
        if (this.f99355b == null) {
            this.f99355b = f99354a;
            f99354a = null;
        }
        m152517a(m152514a(this.f99355b));
    }

    /* renamed from: b */
    public static void m152518b(VcWelcomeActivity vcWelcomeActivity) {
        vcWelcomeActivity.mo141573b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VcWelcomeActivity vcWelcomeActivity2 = vcWelcomeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    vcWelcomeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private C38653a m152514a(Bitmap bitmap) {
        C38653a aVar = new C38653a();
        aVar.f99357a = bitmap;
        aVar.f99359c = R.drawable.illustration_initialization_function_vc;
        aVar.f99360d = UIUtils.getString(this, R.string.Lark_UserGrowth_TitleVCTouristEndPage);
        aVar.f99361e = UIUtils.getString(this, R.string.Lark_UserGrowth_DescVCTouristEndPage);
        aVar.f99362f = UIUtils.getString(this, R.string.Lark_UserGrowth_ButtonVCTouristEndPage);
        return aVar;
    }

    /* renamed from: a */
    private void m152517a(C38653a aVar) {
        getSupportFragmentManager().beginTransaction().replace(16908290, C38654a.m152530a(aVar, new C38652a())).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m152516a(VcWelcomeActivity vcWelcomeActivity, Context context) {
        vcWelcomeActivity.mo141572a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcWelcomeActivity);
        }
    }

    /* renamed from: a */
    public static Context m152512a(VcWelcomeActivity vcWelcomeActivity, Configuration configuration) {
        Context a = vcWelcomeActivity.mo141570a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m152515a(Context context, Bitmap bitmap) {
        Intent intent = new Intent(context, VcWelcomeActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        f99354a = bitmap;
        context.startActivity(intent);
    }
}
