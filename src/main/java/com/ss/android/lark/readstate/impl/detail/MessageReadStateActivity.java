package com.ss.android.lark.readstate.impl.detail;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MessageReadStateActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo181397a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo181398a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo181399a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m205557a(this, context);
    }

    /* renamed from: b */
    public void mo181400b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo181401c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m205555a(this, configuration);
    }

    public AssetManager getAssets() {
        return m205559c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m205556a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m205558b(this);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m205556a(MessageReadStateActivity messageReadStateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(messageReadStateActivity);
        }
        return messageReadStateActivity.mo181398a();
    }

    /* renamed from: c */
    public static AssetManager m205559c(MessageReadStateActivity messageReadStateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(messageReadStateActivity);
        }
        return messageReadStateActivity.mo181401c();
    }

    /* renamed from: b */
    public static void m205558b(MessageReadStateActivity messageReadStateActivity) {
        messageReadStateActivity.mo181400b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MessageReadStateActivity messageReadStateActivity2 = messageReadStateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    messageReadStateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(null);
        if (getIntent().getExtras() == null) {
            Log.m165382e("Init data is null");
            finish();
            return;
        }
        C53115b bVar = new C53115b();
        bVar.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, bVar, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m205557a(MessageReadStateActivity messageReadStateActivity, Context context) {
        messageReadStateActivity.mo181399a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(messageReadStateActivity);
        }
    }

    /* renamed from: a */
    public static Context m205555a(MessageReadStateActivity messageReadStateActivity, Configuration configuration) {
        Context a = messageReadStateActivity.mo181397a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
