package com.ss.android.lark.main.router;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.statistics.MainHitPointHelper;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57858o;

public class RouterActivity extends AppCompatActivity {
    /* renamed from: a */
    public Context mo157946a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo157947a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo157948a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m176534a(this, context);
    }

    /* renamed from: b */
    public void mo157949b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo157950c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m176531a(this, configuration);
    }

    public AssetManager getAssets() {
        return m176537c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m176532a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m176535b(this);
    }

    /* renamed from: e */
    private void m176539e() {
        Uri data = getIntent().getData();
        if (data != null && "/verify".equals(data.getPath())) {
            C44508c.m176553a(data.getQueryParameter("qr_code"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        if (!C44134a.m174959a().mo133198R()) {
            super.onDestroy();
        } else {
            super.onDestroy();
        }
    }

    /* renamed from: d */
    private void m176538d() {
        Uri data = getIntent().getData();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("internal", false);
        m176533a(getIntent());
        if (!C44508c.m176555a(this, data, booleanExtra, extras) && !C44508c.m176559a(this, getIntent().getAction(), getIntent().getExtras(), booleanExtra)) {
            Log.m165383e("RouterActivity", "uriRoute:" + data);
            C57858o.m224559a(MainActivity.class).mo196050a(335544320).mo196064a(this);
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: b */
    private boolean m176536b(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getIntExtra("checkParamsValidity", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Resources m176532a(RouterActivity routerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(routerActivity);
        }
        return routerActivity.mo157947a();
    }

    /* renamed from: c */
    public static AssetManager m176537c(RouterActivity routerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(routerActivity);
        }
        return routerActivity.mo157950c();
    }

    /* renamed from: b */
    public static void m176535b(RouterActivity routerActivity) {
        routerActivity.mo157949b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RouterActivity routerActivity2 = routerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    routerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m176533a(Intent intent) {
        String stringExtra = intent.getStringExtra("product_line");
        if ("calendar".equals(stringExtra)) {
            MainHitPointHelper.m176668a(stringExtra, intent.getStringExtra("size"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        if (!m176536b(getIntent())) {
            getIntent().replaceExtras((Bundle) null);
            Log.m165397w("RouterActivity", "checkParamsValidity: true");
        }
        super.onCreate(bundle);
        AbstractC44136a a = C44134a.m174959a();
        if (!a.mo133198R()) {
            a.mo133241c(this, getIntent());
            finish();
        } else if (a.mo133199S()) {
            a.mo133234b(this, getIntent());
            finish();
        } else if (a.mo133259o().mo133357a((Context) this)) {
            a.mo133259o().mo133358b(this);
            finish();
        } else {
            m176539e();
            m176538d();
        }
    }

    /* renamed from: a */
    public static void m176534a(RouterActivity routerActivity, Context context) {
        routerActivity.mo157948a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(routerActivity);
        }
    }

    /* renamed from: a */
    public static Context m176531a(RouterActivity routerActivity, Configuration configuration) {
        Context a = routerActivity.mo157946a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
