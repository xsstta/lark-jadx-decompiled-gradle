package com.ss.android.lark.search.impl.func.chatinside;

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
import com.ss.android.lark.searchcommon.reporter.ChatInSideContext;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ChatInsideSearchActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C53409b f132001a;

    /* renamed from: a */
    public Context mo182415a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182416a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182417a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m206789a(this, context);
    }

    /* renamed from: b */
    public void mo182418b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182419c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m206787a(this, configuration);
    }

    public AssetManager getAssets() {
        return m206792c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m206788a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m206791b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        ChatInSideContext.m208823e();
    }

    /* renamed from: d */
    private void m206793d() {
        C53409b bVar = new C53409b();
        this.f132001a = bVar;
        bVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f132001a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m206788a(ChatInsideSearchActivity chatInsideSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatInsideSearchActivity);
        }
        return chatInsideSearchActivity.mo182416a();
    }

    /* renamed from: c */
    public static AssetManager m206792c(ChatInsideSearchActivity chatInsideSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatInsideSearchActivity);
        }
        return chatInsideSearchActivity.mo182419c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m206790a(getIntent().getExtras())) {
            finish();
        } else {
            m206793d();
        }
    }

    /* renamed from: b */
    public static void m206791b(ChatInsideSearchActivity chatInsideSearchActivity) {
        chatInsideSearchActivity.mo182418b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatInsideSearchActivity chatInsideSearchActivity2 = chatInsideSearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatInsideSearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m206790a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("extra.chat.id")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m206789a(ChatInsideSearchActivity chatInsideSearchActivity, Context context) {
        chatInsideSearchActivity.mo182417a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatInsideSearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m206787a(ChatInsideSearchActivity chatInsideSearchActivity, Configuration configuration) {
        Context a = chatInsideSearchActivity.mo182415a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f132001a.onActivityResult(i, i2, intent);
    }
}
