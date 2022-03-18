package com.ss.android.lark.qrcode.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class QRScanResultDefaultActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo180892a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo180893a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo180894a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m205022a(this, context);
    }

    /* renamed from: b */
    public void mo180895b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo180896c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m205018a(this, configuration);
    }

    public AssetManager getAssets() {
        return m205024c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m205019a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m205023b(this);
    }

    /* renamed from: d */
    private void m205025d() {
        String stringExtra = getIntent().getStringExtra("KEY_SCAN_RESULT");
        ((CommonTitleBar) findViewById(R.id.title_bar)).setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.qrcode.ui.$$Lambda$QRScanResultDefaultActivity$Rpo4KJIRPsNLm6vZ6T04IXvZ9M */

            public final void onClick(View view) {
                QRScanResultDefaultActivity.m270919lambda$Rpo4KJIRPsNLm6vZ6T04IXvZ9M(QRScanResultDefaultActivity.this, view);
            }
        });
        ((TextView) findViewById(R.id.qrcode_result_default_view)).setText(stringExtra);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205021a(View view) {
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_qrcode_scan_result_default);
        m205025d();
    }

    /* renamed from: a */
    public static Resources m205019a(QRScanResultDefaultActivity qRScanResultDefaultActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(qRScanResultDefaultActivity);
        }
        return qRScanResultDefaultActivity.mo180893a();
    }

    /* renamed from: c */
    public static AssetManager m205024c(QRScanResultDefaultActivity qRScanResultDefaultActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(qRScanResultDefaultActivity);
        }
        return qRScanResultDefaultActivity.mo180896c();
    }

    /* renamed from: b */
    public static void m205023b(QRScanResultDefaultActivity qRScanResultDefaultActivity) {
        qRScanResultDefaultActivity.mo180895b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            QRScanResultDefaultActivity qRScanResultDefaultActivity2 = qRScanResultDefaultActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    qRScanResultDefaultActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m205022a(QRScanResultDefaultActivity qRScanResultDefaultActivity, Context context) {
        qRScanResultDefaultActivity.mo180894a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(qRScanResultDefaultActivity);
        }
    }

    /* renamed from: a */
    public static Context m205018a(QRScanResultDefaultActivity qRScanResultDefaultActivity, Configuration configuration) {
        Context a = qRScanResultDefaultActivity.mo180892a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m205020a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, QRScanResultDefaultActivity.class);
        intent.putExtra("KEY_SCAN_RESULT", str);
        context.startActivity(intent);
        if (z && (context instanceof Activity)) {
            ((Activity) context).finish();
        }
    }
}
