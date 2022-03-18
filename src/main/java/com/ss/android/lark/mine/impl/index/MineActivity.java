package com.ss.android.lark.mine.impl.index;

import android.content.Context;
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
import com.ss.android.lark.mine.impl.index.v2.MineFragment2;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MineActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo160759a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo160760a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo160761a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m181018a(this, context);
    }

    /* renamed from: b */
    public void mo160762b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo160763c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m181016a(this, configuration);
    }

    public AssetManager getAssets() {
        return m181020c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m181017a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m181019b(this);
    }

    /* renamed from: a */
    public static Resources m181017a(MineActivity mineActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineActivity);
        }
        return mineActivity.mo160760a();
    }

    /* renamed from: c */
    public static AssetManager m181020c(MineActivity mineActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineActivity);
        }
        return mineActivity.mo160763c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mine);
        MineFragment2 cVar = new MineFragment2();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.mine_entry_container, cVar);
        beginTransaction.commit();
    }

    /* renamed from: b */
    public static void m181019b(MineActivity mineActivity) {
        mineActivity.mo160762b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MineActivity mineActivity2 = mineActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mineActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m181018a(MineActivity mineActivity, Context context) {
        mineActivity.mo160761a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mineActivity);
        }
    }

    /* renamed from: a */
    public static Context m181016a(MineActivity mineActivity, Configuration configuration) {
        Context a = mineActivity.mo160759a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
