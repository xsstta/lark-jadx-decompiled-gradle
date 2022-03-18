package com.ss.android.lark.mail.impl.settings.subsetting.accountdetail;

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
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AccountDetailSettingView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AccountDetailSettingActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43462b f110384b;

    /* renamed from: c */
    private AccountDetailSettingView.AbstractC43458a f110385c = new AccountDetailSettingView.AbstractC43458a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AccountDetailSettingActivity.C434571 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.accountdetail.AccountDetailSettingView.AbstractC43458a
        /* renamed from: a */
        public void mo155272a(AccountDetailSettingView accountDetailSettingView) {
            ButterKnife.bind(accountDetailSettingView, AccountDetailSettingActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155266a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155267a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172530a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172528a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155269f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155270g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172532c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172529a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172531b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107412o;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43462b bVar = this.f110384b;
        if (bVar != null) {
            bVar.destroy();
            this.f110384b = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        C43462b bVar = this.f110384b;
        if (bVar != null) {
            bVar.mo155287b();
        }
    }

    /* renamed from: h */
    private void m172533h() {
        C43462b bVar = new C43462b(this, new C43459a(getIntent().getStringExtra("key_mail_account_id")), new AccountDetailSettingView(this, this.f110385c));
        this.f110384b = bVar;
        bVar.create();
    }

    /* renamed from: a */
    public static Resources m172529a(AccountDetailSettingActivity accountDetailSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(accountDetailSettingActivity);
        }
        return accountDetailSettingActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172532c(AccountDetailSettingActivity accountDetailSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(accountDetailSettingActivity);
        }
        return accountDetailSettingActivity.mo155270g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_account_detail_activity);
        m172533h();
        C42187a.m168555m("email_settings_open");
    }

    /* renamed from: b */
    public static void m172531b(AccountDetailSettingActivity accountDetailSettingActivity) {
        accountDetailSettingActivity.mo155269f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AccountDetailSettingActivity accountDetailSettingActivity2 = accountDetailSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    accountDetailSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172530a(AccountDetailSettingActivity accountDetailSettingActivity, Context context) {
        accountDetailSettingActivity.mo155267a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(accountDetailSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m172528a(AccountDetailSettingActivity accountDetailSettingActivity, Configuration configuration) {
        Context a = accountDetailSettingActivity.mo155266a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
