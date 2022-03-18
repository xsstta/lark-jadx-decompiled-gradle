package com.ss.android.lark.mail.impl.client;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.client.MigrationView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MigrationActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    private C41898e f106208a;

    /* renamed from: b */
    private MigrationView.AbstractC41877b f106209b = new MigrationView.AbstractC41877b() {
        /* class com.ss.android.lark.mail.impl.client.MigrationActivity.C418731 */

        @Override // com.ss.android.lark.mail.impl.client.MigrationView.AbstractC41877b
        /* renamed from: a */
        public void mo150451a(MigrationView migrationView) {
            ButterKnife.bind(migrationView, MigrationActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo150443a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo150445a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m166311a(this, context);
    }

    /* renamed from: b */
    public Resources mo150446b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo150447c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m166309a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo150449d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m166313c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m166310a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m166312b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107420w;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C41898e eVar = this.f106208a;
        if (eVar != null) {
            eVar.destroy();
            this.f106208a = null;
        }
    }

    /* renamed from: e */
    private void m166314e() {
        C41898e eVar = new C41898e(new C41896d(), new MigrationView(this, this.f106209b));
        this.f106208a = eVar;
        eVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_migration_detail_activity);
        m166314e();
    }

    /* renamed from: a */
    public static Resources m166310a(MigrationActivity migrationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(migrationActivity);
        }
        return migrationActivity.mo150446b();
    }

    /* renamed from: c */
    public static AssetManager m166313c(MigrationActivity migrationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(migrationActivity);
        }
        return migrationActivity.mo150449d();
    }

    /* renamed from: b */
    public static void m166312b(MigrationActivity migrationActivity) {
        migrationActivity.mo150447c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MigrationActivity migrationActivity2 = migrationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    migrationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m166311a(MigrationActivity migrationActivity, Context context) {
        migrationActivity.mo150445a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(migrationActivity);
        }
    }

    /* renamed from: a */
    public static Context m166309a(MigrationActivity migrationActivity, Configuration configuration) {
        Context a = migrationActivity.mo150443a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
