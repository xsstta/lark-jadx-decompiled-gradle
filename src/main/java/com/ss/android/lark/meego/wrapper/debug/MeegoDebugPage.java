package com.ss.android.lark.meego.wrapper.debug;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.wrapper.p2250e.C44866a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MeegoDebugPage extends BaseFragmentActivity {

    /* renamed from: a */
    private EditText f113638a;

    /* renamed from: b */
    private EditText f113639b;

    /* renamed from: c */
    private EditText f113640c;

    /* renamed from: d */
    private TextView f113641d;

    /* renamed from: a */
    public Context mo158744a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo158745a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m177864a(this, context);
    }

    /* renamed from: b */
    public void mo158746b() {
        super.onStop();
    }

    /* renamed from: b */
    public void mo158747b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public AssetManager mo158748c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m177860a(this, configuration);
    }

    public AssetManager getAssets() {
        return m177866c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m177861a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m177865b(this);
    }

    /* renamed from: f */
    private String m177869f() {
        return C44866a.m177888c();
    }

    /* renamed from: d */
    private void m177867d() {
        this.f113638a.setText(C44864a.m177875e().mo158753b());
        this.f113639b.setText(C44864a.m177875e().mo158755c());
        this.f113640c.setText(C44864a.m177875e().mo158757d());
        this.f113641d.setText(m177869f());
    }

    /* renamed from: e */
    private void m177868e() {
        C44864a.m177875e().mo158752a(this.f113638a.getText().toString());
        C44864a.m177875e().mo158754b(this.f113639b.getText().toString());
        C44864a.m177875e().mo158756c(this.f113640c.getText().toString());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m177863a(View view) {
        m177868e();
        finish();
    }

    /* renamed from: a */
    public static void m177862a(Context context) {
        Intent intent = new Intent(context, MeegoDebugPage.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static Resources m177861a(MeegoDebugPage meegoDebugPage) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meegoDebugPage);
        }
        return meegoDebugPage.mo158745a();
    }

    /* renamed from: c */
    public static AssetManager m177866c(MeegoDebugPage meegoDebugPage) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meegoDebugPage);
        }
        return meegoDebugPage.mo158748c();
    }

    /* renamed from: b */
    public static void m177865b(MeegoDebugPage meegoDebugPage) {
        meegoDebugPage.mo158746b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MeegoDebugPage meegoDebugPage2 = meegoDebugPage;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    meegoDebugPage2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_debug_meego);
        this.f113638a = (EditText) findViewById(R.id.net_proxy_edit);
        this.f113639b = (EditText) findViewById(R.id.use_ppe_edit);
        this.f113640c = (EditText) findViewById(R.id.tt_env_edit);
        Button button = (Button) findViewById(R.id.confirm);
        this.f113641d = (TextView) findViewById(R.id.plugin_version_code);
        ((TextView) findViewById(R.id.title)).setText("Meego Debug");
        ((TextView) findViewById(R.id.net_proxy_title)).setText("NetProxy:");
        ((TextView) findViewById(R.id.use_ppe_title)).setText("x-use-ppe:");
        ((TextView) findViewById(R.id.tt_env_title)).setText("x-tt-env:");
        button.setText("Confirm");
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.meego.wrapper.debug.$$Lambda$MeegoDebugPage$8kaw1KmFYp94kn0L0IwQMMfjEzc */

            public final void onClick(View view) {
                MeegoDebugPage.this.m177863a((MeegoDebugPage) view);
            }
        });
        ((TextView) findViewById(R.id.info_title)).setText("Meego Info");
        ((TextView) findViewById(R.id.plugin_name)).setText("PluginVersion:");
        m177867d();
    }

    /* renamed from: a */
    public static Context m177860a(MeegoDebugPage meegoDebugPage, Configuration configuration) {
        Context a = meegoDebugPage.mo158744a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m177864a(MeegoDebugPage meegoDebugPage, Context context) {
        meegoDebugPage.mo158747b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(meegoDebugPage);
        }
    }
}
