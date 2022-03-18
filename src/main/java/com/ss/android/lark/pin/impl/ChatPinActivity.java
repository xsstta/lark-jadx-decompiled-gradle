package com.ss.android.lark.pin.impl;

import android.content.Context;
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

public class ChatPinActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo177323a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo177324a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo177325a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m199723a(this, context);
    }

    /* renamed from: b */
    public void mo177326b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo177327c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m199721a(this, configuration);
    }

    public AssetManager getAssets() {
        return m199726c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m199722a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m199725b(this);
    }

    /* renamed from: d */
    private void m199727d() {
        C51499c cVar = new C51499c();
        cVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(16908290, cVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m199722a(ChatPinActivity chatPinActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatPinActivity);
        }
        return chatPinActivity.mo177324a();
    }

    /* renamed from: c */
    public static AssetManager m199726c(ChatPinActivity chatPinActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatPinActivity);
        }
        return chatPinActivity.mo177327c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m199724a(getIntent().getExtras())) {
            finish();
        } else {
            m199727d();
        }
    }

    /* renamed from: b */
    public static void m199725b(ChatPinActivity chatPinActivity) {
        chatPinActivity.mo177326b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatPinActivity chatPinActivity2 = chatPinActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatPinActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m199724a(Bundle bundle) {
        if (bundle != null) {
            return true;
        }
        Log.m165383e("ChatPinActivity", "enter pin failed ，bundle is null ！！！！");
        return false;
    }

    /* renamed from: a */
    public static void m199723a(ChatPinActivity chatPinActivity, Context context) {
        chatPinActivity.mo177325a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatPinActivity);
        }
    }

    /* renamed from: a */
    public static Context m199721a(ChatPinActivity chatPinActivity, Configuration configuration) {
        Context a = chatPinActivity.mo177323a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
