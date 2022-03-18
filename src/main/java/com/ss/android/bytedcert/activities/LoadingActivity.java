package com.ss.android.bytedcert.activities;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.callback.AbstractC28335f;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1305c.C28325d;
import com.ss.android.bytedcert.utils.C28432b;
import com.ss.android.bytedcert.utils.C28435d;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;

public class LoadingActivity extends AppCompatActivity {

    /* renamed from: a */
    C28325d f71092a;

    /* renamed from: a */
    public Context mo100866a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo100867a() {
    }

    /* renamed from: a */
    public void mo100868a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103844a(this, context);
    }

    /* renamed from: b */
    public Resources mo100869b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo100870c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103842a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo100872d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m103846c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103843a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103845b(this);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        super.onBackPressed();
        this.f71092a.mo100922b();
        finish();
        m103847e();
    }

    /* renamed from: e */
    private void m103847e() {
        HashMap hashMap = new HashMap();
        hashMap.put("back_position", "load_model");
        C28432b.m104208a("return_previous_page", hashMap);
    }

    /* renamed from: a */
    public static Resources m103843a(LoadingActivity loadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(loadingActivity);
        }
        return loadingActivity.mo100869b();
    }

    /* renamed from: c */
    public static AssetManager m103846c(LoadingActivity loadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(loadingActivity);
        }
        return loadingActivity.mo100872d();
    }

    /* renamed from: b */
    public static void m103845b(LoadingActivity loadingActivity) {
        loadingActivity.mo100870c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LoadingActivity loadingActivity2 = loadingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    loadingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.byted_activity_loading);
        C28441g.m104237a((Activity) this, -1);
        C28325d a = C28325d.m103926a(this, getApplication().getString(R.string.byted_loading_text));
        this.f71092a = a;
        a.mo100921a();
        this.f71092a.mo100925c().setCancelable(false);
        C28435d.m104222a(this, new AbstractC28335f() {
            /* class com.ss.android.bytedcert.activities.LoadingActivity.C283051 */

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: a */
            public void mo100837a() {
                LoadingActivity.this.mo100867a();
            }

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: b */
            public void mo100838b() {
                LoadingActivity.this.finish();
                BytedCertManager.getInstance().getFaceLiveCallback().onFaceLiveFinish(new BDResponse(C28317a.C28318a.f71147k));
            }
        });
    }

    /* renamed from: a */
    public static void m103844a(LoadingActivity loadingActivity, Context context) {
        loadingActivity.mo100868a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(loadingActivity);
        }
    }

    /* renamed from: a */
    public static Context m103842a(LoadingActivity loadingActivity, Configuration configuration) {
        Context a = loadingActivity.mo100866a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
