package com.ss.android.lark.chatthread;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;

public class ChatThreadActivity extends AbstractActivityC35133f {

    /* renamed from: a */
    private BaseFragment f90532a;

    /* renamed from: a */
    public Context mo129315a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo129317a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m136796a(this, context);
    }

    /* renamed from: b */
    public Resources mo129318b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo129319c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m136794a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo129321d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m136798c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m136795a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m136797b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        TextLayoutBuilder.m226861b();
    }

    /* renamed from: i */
    private void m136800i() {
        if (getIntent().getExtras() == null) {
            Log.m165382e("ChatThread bundle param is null");
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        BaseFragment baseFragment = this.f90532a;
        if (!(baseFragment instanceof ChatThreadFragment) || !((ChatThreadFragment) baseFragment).mo129327a()) {
            super.onBackPressed();
        }
    }

    /* renamed from: h */
    private void m136799h() {
        ChatThreadFragment bVar = new ChatThreadFragment();
        this.f90532a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f90532a, ChatThreadFragment.class.getName());
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo129316a() {
        setDarkTextStatusBar(getResources().getColor(R.color.lkui_N700));
        getWindow().setFlags(8192, 8192);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m136800i();
        m136799h();
    }

    /* renamed from: a */
    public static Resources m136795a(ChatThreadActivity chatThreadActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatThreadActivity);
        }
        return chatThreadActivity.mo129318b();
    }

    /* renamed from: c */
    public static AssetManager m136798c(ChatThreadActivity chatThreadActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatThreadActivity);
        }
        return chatThreadActivity.mo129321d();
    }

    /* renamed from: b */
    public static void m136797b(ChatThreadActivity chatThreadActivity) {
        chatThreadActivity.mo129319c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatThreadActivity chatThreadActivity2 = chatThreadActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatThreadActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m136796a(ChatThreadActivity chatThreadActivity, Context context) {
        chatThreadActivity.mo129317a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatThreadActivity);
        }
    }

    /* renamed from: a */
    public static Context m136794a(ChatThreadActivity chatThreadActivity, Configuration configuration) {
        Context a = chatThreadActivity.mo129315a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(ChatThreadFragment.class.getName());
        if (findFragmentByTag != null) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }
}
