package com.ss.android.bytedcert.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.bytedcert.callback.AbstractC28335f;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.utils.C28435d;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FaceLivePreActivity extends AppCompatActivity {

    /* renamed from: a */
    boolean f71061a;

    /* renamed from: b */
    private boolean f71062b;

    /* renamed from: c */
    private boolean f71063c;

    /* renamed from: a */
    public Context mo100828a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo100830a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m103797a(this, context);
    }

    /* renamed from: b */
    public Resources mo100832b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo100833c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m103795a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo100835d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m103799c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m103796a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m103798b(this);
    }

    /* renamed from: e */
    private void m103800e() {
        C28435d.m104222a(this, new AbstractC28335f() {
            /* class com.ss.android.bytedcert.activities.FaceLivePreActivity.C282951 */

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: a */
            public void mo100837a() {
                FaceLivePreActivity.this.mo100829a();
            }

            @Override // com.ss.android.bytedcert.callback.AbstractC28335f
            /* renamed from: b */
            public void mo100838b() {
                FaceLivePreActivity.this.finish();
                BDResponse bDResponse = new BDResponse(C28317a.C28318a.f71147k);
                BytedCertManager.getInstance().reportFaceLiveTime(bDResponse);
                BytedCertManager.getInstance().resetStatus();
                BytedCertManager.getInstance().getFaceLiveCallback().onFaceLiveFinish(bDResponse);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        if (this.f71062b) {
            this.f71062b = false;
            m103800e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100829a() {
        Intent intent = new Intent(this, FaceLiveSDKActivity.class);
        intent.putExtra("already_has_permission", this.f71063c);
        startActivity(intent);
        this.f71061a = true;
        finish();
    }

    /* renamed from: a */
    public static Resources m103796a(FaceLivePreActivity faceLivePreActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceLivePreActivity);
        }
        return faceLivePreActivity.mo100832b();
    }

    /* renamed from: c */
    public static AssetManager m103799c(FaceLivePreActivity faceLivePreActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceLivePreActivity);
        }
        return faceLivePreActivity.mo100835d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new LinearLayout(this));
        this.f71063c = C28435d.m104224a(this);
        C28441g.m104238a("#ffffffff", this);
        m103800e();
    }

    /* renamed from: b */
    public static void m103798b(FaceLivePreActivity faceLivePreActivity) {
        faceLivePreActivity.mo100833c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FaceLivePreActivity faceLivePreActivity2 = faceLivePreActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    faceLivePreActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo100831a(boolean z) {
        this.f71062b = z;
    }

    /* renamed from: a */
    public static void m103797a(FaceLivePreActivity faceLivePreActivity, Context context) {
        faceLivePreActivity.mo100830a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(faceLivePreActivity);
        }
    }

    /* renamed from: a */
    public static Context m103795a(FaceLivePreActivity faceLivePreActivity, Configuration configuration) {
        Context a = faceLivePreActivity.mo100828a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C28435d.m104221a(this, i, strArr, iArr);
    }
}
