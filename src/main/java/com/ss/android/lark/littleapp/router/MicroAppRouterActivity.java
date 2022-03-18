package com.ss.android.lark.littleapp.router;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.littleapp.service.p2132a.C41437d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MicroAppRouterActivity extends AppCompatActivity {

    /* renamed from: a */
    private ILittleAppService f105295a = C41437d.m164411e();

    /* renamed from: a */
    public Context mo149134a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo149135a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo149136a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m164202a(this, context);
    }

    /* renamed from: b */
    public void mo149137b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo149138c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m164199a(this, configuration);
    }

    public AssetManager getAssets() {
        return m164204c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m164200a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m164203b(this);
    }

    /* renamed from: a */
    public static Resources m164200a(MicroAppRouterActivity microAppRouterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(microAppRouterActivity);
        }
        return microAppRouterActivity.mo149135a();
    }

    /* renamed from: c */
    public static AssetManager m164204c(MicroAppRouterActivity microAppRouterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(microAppRouterActivity);
        }
        return microAppRouterActivity.mo149138c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = CommonCode.StatusCode.API_CLIENT_EXPIRED;
        if (intent != null) {
            str = intent.getStringExtra("url");
            i = intent.getIntExtra("extra_scene", CommonCode.StatusCode.API_CLIENT_EXPIRED);
        } else {
            str = null;
        }
        m164201a(this, str, i);
        finish();
    }

    /* renamed from: b */
    public static void m164203b(MicroAppRouterActivity microAppRouterActivity) {
        microAppRouterActivity.mo149137b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MicroAppRouterActivity microAppRouterActivity2 = microAppRouterActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    microAppRouterActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m164202a(MicroAppRouterActivity microAppRouterActivity, Context context) {
        microAppRouterActivity.mo149136a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(microAppRouterActivity);
        }
    }

    /* renamed from: a */
    public static Context m164199a(MicroAppRouterActivity microAppRouterActivity, Configuration configuration) {
        Context a = microAppRouterActivity.mo149134a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m164201a(Context context, String str, int i) {
        if (context == null || TextUtils.isEmpty(str)) {
            Log.m165379d("MicroAppRouterActivity", "context or url is empty");
        }
        if (!this.f105295a.mo149179b(str)) {
            Log.m165383e("MicroAppRouterActivity", "url is invalid:" + str);
        }
        this.f105295a.mo149151a(context, str, i);
    }
}
