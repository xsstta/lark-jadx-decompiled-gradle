package com.ss.android.vc.meeting.module.livestream.activity;

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
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.p3077b.C60700b;

public class RealAuthenticationActivity extends LiveAuthBaseActivity {

    /* renamed from: b */
    private C62046e f155842b;

    /* renamed from: a */
    public Context mo214733a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo214734a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m242375a(this, context);
    }

    /* renamed from: b */
    public Resources mo214735b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo214736c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m242372a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo214738d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m242377c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m242373a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m242376b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        this.f155842b.destroy();
        super.onDestroy();
    }

    /* renamed from: g */
    private void m242378g() {
        String str;
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("auth.key.from.url", false);
            str = intent.getStringExtra("auth.key.meeting.id");
            C60700b.m235851b("RealAuthenticationActivity", "[initDataAndMVP]", "<LiveAuth> fromUrl=" + z + " , meetingId=" + str);
        } else {
            str = null;
        }
        C62046e eVar = new C62046e(new C62031b(str, z), new C62034c(this));
        this.f155842b = eVar;
        eVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity
    /* renamed from: a */
    public void mo214702a() {
        this.f155840f = new BroadcastReceiver() {
            /* class com.ss.android.vc.meeting.module.livestream.activity.RealAuthenticationActivity.C620251 */

            public void onReceive(Context context, Intent intent) {
                RealAuthenticationActivity.this.finish();
            }
        };
        this.f155839e.mo4991a(this.f155840f, new IntentFilter("action.RealAuthenticationActivity.finish"));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.meeting.module.livestream.activity.LiveAuthBaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.live_auth_activity_real_name);
        m242378g();
    }

    /* renamed from: a */
    public static Resources m242373a(RealAuthenticationActivity realAuthenticationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realAuthenticationActivity);
        }
        return realAuthenticationActivity.mo214735b();
    }

    /* renamed from: c */
    public static AssetManager m242377c(RealAuthenticationActivity realAuthenticationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realAuthenticationActivity);
        }
        return realAuthenticationActivity.mo214738d();
    }

    /* renamed from: b */
    public static void m242376b(RealAuthenticationActivity realAuthenticationActivity) {
        realAuthenticationActivity.mo214736c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RealAuthenticationActivity realAuthenticationActivity2 = realAuthenticationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    realAuthenticationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m242375a(RealAuthenticationActivity realAuthenticationActivity, Context context) {
        realAuthenticationActivity.mo214734a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(realAuthenticationActivity);
        }
    }

    /* renamed from: a */
    public static Context m242372a(RealAuthenticationActivity realAuthenticationActivity, Configuration configuration) {
        Context a = realAuthenticationActivity.mo214733a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m242374a(Context context, String str, boolean z) {
        if (context != null) {
            C60700b.m235851b("RealAuthenticationActivity", "[startMe]", "[gotoAuthPage] startActivity");
            Intent intent = new Intent(context, RealAuthenticationActivity.class);
            intent.putExtra("auth.key.from.url", z);
            intent.putExtra("auth.key.meeting.id", str);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}
