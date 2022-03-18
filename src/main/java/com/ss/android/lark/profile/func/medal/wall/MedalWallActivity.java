package com.ss.android.lark.profile.func.medal.wall;

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
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalWallActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "medalWallFragment", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallFragment;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MedalWallActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private MedalWallFragment f129817a;

    /* renamed from: a */
    public Context mo179307a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179308a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179309a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m203123a(this, context);
    }

    /* renamed from: b */
    public void mo179310b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179311c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m203121a(this, configuration);
    }

    public AssetManager getAssets() {
        return m203125c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m203122a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m203124b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        MedalWallFragment cVar = this.f129817a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalWallFragment");
        }
        cVar.mo179336g();
    }

    /* renamed from: d */
    private final void m203126d() {
        MedalWallFragment cVar = new MedalWallFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        cVar.setArguments(intent.getExtras());
        this.f129817a = cVar;
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        MedalWallFragment cVar2 = this.f129817a;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalWallFragment");
        }
        beginTransaction.add(16908290, cVar2, "MedalWallFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m203126d();
    }

    /* renamed from: a */
    public static Resources m203122a(MedalWallActivity medalWallActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(medalWallActivity);
        }
        return medalWallActivity.mo179308a();
    }

    /* renamed from: c */
    public static AssetManager m203125c(MedalWallActivity medalWallActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(medalWallActivity);
        }
        return medalWallActivity.mo179311c();
    }

    /* renamed from: b */
    public static void m203124b(MedalWallActivity medalWallActivity) {
        medalWallActivity.mo179310b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MedalWallActivity medalWallActivity2 = medalWallActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    medalWallActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m203123a(MedalWallActivity medalWallActivity, Context context) {
        medalWallActivity.mo179309a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(medalWallActivity);
        }
    }

    /* renamed from: a */
    public static Context m203121a(MedalWallActivity medalWallActivity, Configuration configuration) {
        Context a = medalWallActivity.mo179307a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
