package com.ss.android.vc.lark.rvc;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.p034e.p035a.C0978a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.AbstractC25833d;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.p3083e.C60755i;

public class RvcActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private AbstractC25833d f153226a;

    /* renamed from: b */
    private BroadcastReceiver f153227b;

    /* renamed from: a */
    public Context mo211521a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo211522a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo211523a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m237919a(this, context);
    }

    /* renamed from: b */
    public void mo211524b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo211525c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m237915a(this, configuration);
    }

    public AssetManager getAssets() {
        return m237921c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m237916a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m237920b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        if (this.f153227b != null) {
            C0978a.m4782a(getApplicationContext()).mo4990a(this.f153227b);
        }
        RvcManager.f153240a.mo211554c();
    }

    /* renamed from: a */
    public static Resources m237916a(RvcActivity rvcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(rvcActivity);
        }
        return rvcActivity.mo211522a();
    }

    /* renamed from: c */
    public static AssetManager m237921c(RvcActivity rvcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(rvcActivity);
        }
        return rvcActivity.mo211525c();
    }

    /* renamed from: b */
    public static void m237920b(RvcActivity rvcActivity) {
        rvcActivity.mo211524b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RvcActivity rvcActivity2 = rvcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    rvcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private Bundle m237917a(Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras;
        }
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(5380);
        C60755i.m236087a(this);
        setContentView(R.layout.vc_activity_rvc);
        Bundle a = m237917a(getIntent());
        C25822b.m93352b().mo91901a(a, RvcJSProtocol.m237941b());
        this.f153226a = AbstractC25833d.CC.m93461a(this, a);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f153226a.mo67297i()).commitAllowingStateLoss();
        this.f153227b = new BroadcastReceiver() {
            /* class com.ss.android.vc.lark.rvc.RvcActivity.C611771 */

            public void onReceive(Context context, Intent intent) {
                RvcActivity.this.finish();
            }
        };
        C0978a.m4782a(getApplicationContext()).mo4991a(this.f153227b, new IntentFilter("com.ss.android.vc.lark.rvc.open_float_window"));
    }

    /* renamed from: a */
    public static void m237919a(RvcActivity rvcActivity, Context context) {
        rvcActivity.mo211523a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(rvcActivity);
        }
    }

    /* renamed from: a */
    public static Context m237915a(RvcActivity rvcActivity, Configuration configuration) {
        Context a = rvcActivity.mo211521a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m237918a(Context context, String str) {
        RvcManager.f153240a.mo211551a(str);
        Intent intent = new Intent(context, RvcActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("showTitleBar", false);
        bundle.putBoolean("isShowLoading", false);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
