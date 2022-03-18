package com.ss.android.vc.meeting.module.xiaomivoip;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;

public class XiaoMiVoipLaunchActivity extends BaseActivity {

    /* renamed from: b */
    public volatile boolean f160308b;

    /* renamed from: a */
    public Context mo219556a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo219558a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m248680a(this, context);
    }

    /* renamed from: b */
    public Resources mo219559b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo219560c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m248678a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo219562d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m248682c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m248679a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m248681b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        if (!this.f160308b) {
            return;
        }
        if (VCAppLifeCycle.m236253a().mo208388d()) {
            C60700b.m235851b("XiaoMiVoipLaunchActivity", "[onStart]", "finish");
            finish();
            return;
        }
        C60700b.m235851b("XiaoMiVoipLaunchActivity", "[onStart2]", "launchMainWindow");
        mo219557a();
    }

    /* renamed from: a */
    public void mo219557a() {
        VideoChatModuleDependency.getMainDependency().launchMainWindow(this);
        finish();
    }

    /* renamed from: a */
    public static Resources m248679a(XiaoMiVoipLaunchActivity xiaoMiVoipLaunchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xiaoMiVoipLaunchActivity);
        }
        return xiaoMiVoipLaunchActivity.mo219559b();
    }

    /* renamed from: c */
    public static AssetManager m248682c(XiaoMiVoipLaunchActivity xiaoMiVoipLaunchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xiaoMiVoipLaunchActivity);
        }
        return xiaoMiVoipLaunchActivity.mo219562d();
    }

    /* renamed from: b */
    public static void m248681b(XiaoMiVoipLaunchActivity xiaoMiVoipLaunchActivity) {
        xiaoMiVoipLaunchActivity.mo219560c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            XiaoMiVoipLaunchActivity xiaoMiVoipLaunchActivity2 = xiaoMiVoipLaunchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    xiaoMiVoipLaunchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("id");
        String stringExtra2 = getIntent().getStringExtra("action");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            C60700b.m235851b("XiaoMiVoipLaunchActivity", "[onCreate]", "meetingId or action is null, return");
            mo219557a();
            return;
        }
        C63460a.m248690a().mo219565a(this, stringExtra, new AbstractC63598b<Boolean>() {
            /* class com.ss.android.vc.meeting.module.xiaomivoip.XiaoMiVoipLaunchActivity.C634591 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C60700b.m235851b("XiaoMiVoipLaunchActivity", "[acceptVideoChat]", "success");
                XiaoMiVoipLaunchActivity.this.f160308b = true;
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                if (XiaoMiVoipLaunchActivity.this.isFinishing() || XiaoMiVoipLaunchActivity.this.isDestroyed()) {
                    C60700b.m235851b("XiaoMiVoipLaunchActivity", "[acceptVideoChat3]", "fail, nothing");
                    return;
                }
                C60700b.m235851b("XiaoMiVoipLaunchActivity", "[acceptVideoChat2]", "fail, launch mainActivity");
                XiaoMiVoipLaunchActivity.this.mo219557a();
            }
        });
    }

    /* renamed from: a */
    public static void m248680a(XiaoMiVoipLaunchActivity xiaoMiVoipLaunchActivity, Context context) {
        xiaoMiVoipLaunchActivity.mo219558a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(xiaoMiVoipLaunchActivity);
        }
    }

    /* renamed from: a */
    public static Context m248678a(XiaoMiVoipLaunchActivity xiaoMiVoipLaunchActivity, Configuration configuration) {
        Context a = xiaoMiVoipLaunchActivity.mo219556a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
