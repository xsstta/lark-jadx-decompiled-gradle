package com.ss.android.lark.create.groupchat.impl.f2f;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/F2FCreateGroupActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class F2FCreateGroupActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo133839a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo133840a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo133841a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m142845a(this, context);
    }

    /* renamed from: b */
    public void mo133842b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo133843c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m142843a(this, configuration);
    }

    public AssetManager getAssets() {
        return m142847c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m142844a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m142846b(this);
    }

    /* renamed from: d */
    private final void m142848d() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        F2FCreateGroupFragment aVar = new F2FCreateGroupFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        beginTransaction.add(16908290, aVar).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m142848d();
    }

    /* renamed from: a */
    public static Resources m142844a(F2FCreateGroupActivity f2FCreateGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(f2FCreateGroupActivity);
        }
        return f2FCreateGroupActivity.mo133840a();
    }

    /* renamed from: c */
    public static AssetManager m142847c(F2FCreateGroupActivity f2FCreateGroupActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(f2FCreateGroupActivity);
        }
        return f2FCreateGroupActivity.mo133843c();
    }

    /* renamed from: b */
    public static void m142846b(F2FCreateGroupActivity f2FCreateGroupActivity) {
        f2FCreateGroupActivity.mo133842b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            F2FCreateGroupActivity f2FCreateGroupActivity2 = f2FCreateGroupActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    f2FCreateGroupActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m142845a(F2FCreateGroupActivity f2FCreateGroupActivity, Context context) {
        f2FCreateGroupActivity.mo133841a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(f2FCreateGroupActivity);
        }
    }

    /* renamed from: a */
    public static Context m142843a(F2FCreateGroupActivity f2FCreateGroupActivity, Configuration configuration) {
        Context a = f2FCreateGroupActivity.mo133839a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
