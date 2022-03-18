package com.ss.lark.android.passport.biz.feature.country;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.lark.android.passport.biz.feature.country.AbstractC64744h;

public class CountrySelectActivity extends BaseActivity {

    /* renamed from: h */
    private final C64720c f163208h = C64720c.m254225a();

    /* renamed from: i */
    private int f163209i;

    /* renamed from: j */
    private int f163210j = 0;

    /* renamed from: a */
    public Context mo223531a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo170967a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo170968a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m254178a(this, context);
    }

    /* renamed from: b */
    public void mo170969b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo170970c() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public boolean cA_() {
        return false;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m254176a(this, configuration);
    }

    public AssetManager getAssets() {
        return m254180c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m254177a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m254179b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    public void onBackPressed() {
        mo223532a((CountryBean) null);
    }

    /* renamed from: w */
    private void m254181w() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f163209i = intent.getIntExtra("extra_key_from", 0);
            this.f163210j = intent.getIntExtra("extra_key_exits_anim", 0);
            String str = this.f123053d;
            Log.m165389i(str, "from = " + this.f163209i);
            return;
        }
        Log.m165383e(this.f123053d, "init data intent == null");
    }

    /* renamed from: a */
    public static Resources m254177a(CountrySelectActivity countrySelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(countrySelectActivity);
        }
        return countrySelectActivity.mo170967a();
    }

    /* renamed from: c */
    public static AssetManager m254180c(CountrySelectActivity countrySelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(countrySelectActivity);
        }
        return countrySelectActivity.mo170970c();
    }

    /* renamed from: b */
    public static void m254179b(CountrySelectActivity countrySelectActivity) {
        countrySelectActivity.mo170969b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CountrySelectActivity countrySelectActivity2 = countrySelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    countrySelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m254181w();
        this.f163208h.mo223574a(new AbstractC64744h.AbstractC64745a() {
            /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectActivity.C647041 */

            @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64745a
            public void onCountrySelect(CountryBean countryBean) {
                CountrySelectActivity.this.mo223532a(countryBean);
            }
        });
        this.f163208h.mo223575a(new AbstractC64744h.AbstractC64746b() {
            /* class com.ss.lark.android.passport.biz.feature.country.CountrySelectActivity.C647052 */

            @Override // com.ss.lark.android.passport.biz.feature.country.AbstractC64744h.AbstractC64746b
            public void onPageClose() {
                CountrySelectActivity.this.mo223532a((CountryBean) null);
            }
        });
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.f163208h.isAdded()) {
            beginTransaction.show(this.f163208h);
            return;
        }
        beginTransaction.add(16908290, this.f163208h, "CountrySelectFragment");
        beginTransaction.commit();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x001c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.ss.lark.android.passport.biz.feature.country.CountrySelectActivity] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.lark.passport.signinsdk_api.country.CountryBean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo223532a(com.ss.android.lark.passport.signinsdk_api.country.CountryBean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isFinishing()
            if (r0 == 0) goto L_0x000e
            java.lang.String r5 = r4.f123053d
            java.lang.String r0 = "finish()...isFinishing"
            com.ss.android.lark.log.Log.m165389i(r5, r0)
            return
        L_0x000e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L_0x002c
            int r2 = r4.f163209i
            r3 = 2
            if (r2 != r3) goto L_0x001c
            r1 = 1
        L_0x001c:
            if (r1 == 0) goto L_0x0022
            java.lang.String r5 = r5.getCode()
        L_0x0022:
            java.lang.String r1 = "data"
            r0.putExtra(r1, r5)
            r5 = -1
            r4.setResult(r5, r0)
            goto L_0x002f
        L_0x002c:
            r4.setResult(r1, r0)
        L_0x002f:
            r4.finish()
            int r5 = r4.f163210j
            if (r5 == 0) goto L_0x003c
            r0 = 2130772232(0x7f010108, float:1.7147577E38)
            r4.overridePendingTransition(r0, r5)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.country.CountrySelectActivity.mo223532a(com.ss.android.lark.passport.signinsdk_api.country.CountryBean):void");
    }

    /* renamed from: a */
    public static void m254178a(CountrySelectActivity countrySelectActivity, Context context) {
        countrySelectActivity.mo170968a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(countrySelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m254176a(CountrySelectActivity countrySelectActivity, Configuration configuration) {
        Context a = countrySelectActivity.mo223531a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
