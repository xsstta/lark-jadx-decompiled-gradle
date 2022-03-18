package com.ss.android.lark.mine.impl.info.edit_name;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/MineUpdateNameActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MineUpdateNameActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo160953a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo160954a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo160955a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m181348a(this, context);
    }

    /* renamed from: b */
    public void mo160956b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo160957c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m181346a(this, configuration);
    }

    public AssetManager getAssets() {
        return m181350c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m181347a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m181349b(this);
    }

    /* renamed from: d */
    private final void m181351d() {
        C45765a aVar = new C45765a();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mine_update_name);
        m181351d();
    }

    /* renamed from: a */
    public static Resources m181347a(MineUpdateNameActivity mineUpdateNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineUpdateNameActivity);
        }
        return mineUpdateNameActivity.mo160954a();
    }

    /* renamed from: c */
    public static AssetManager m181350c(MineUpdateNameActivity mineUpdateNameActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineUpdateNameActivity);
        }
        return mineUpdateNameActivity.mo160957c();
    }

    /* renamed from: b */
    public static void m181349b(MineUpdateNameActivity mineUpdateNameActivity) {
        mineUpdateNameActivity.mo160956b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MineUpdateNameActivity mineUpdateNameActivity2 = mineUpdateNameActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mineUpdateNameActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m181348a(MineUpdateNameActivity mineUpdateNameActivity, Context context) {
        mineUpdateNameActivity.mo160955a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineUpdateNameActivity);
        }
    }

    /* renamed from: a */
    public static Context m181346a(MineUpdateNameActivity mineUpdateNameActivity, Configuration configuration) {
        Context a = mineUpdateNameActivity.mo160953a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
