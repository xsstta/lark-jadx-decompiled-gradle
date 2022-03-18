package com.ss.android.lark.mail.impl.settings.mainpage;

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
import com.ss.android.lark.mail.impl.settings.mainpage.MailSettingView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class MailSettingActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43445c f110342b;

    /* renamed from: c */
    private MailSettingView.AbstractC43436a f110343c = new MailSettingView.AbstractC43436a() {
        /* class com.ss.android.lark.mail.impl.settings.mainpage.MailSettingActivity.C434341 */

        @Override // com.ss.android.lark.mail.impl.settings.mainpage.MailSettingView.AbstractC43436a
        /* renamed from: a */
        public void mo155239a(MailSettingView mailSettingView) {
            ButterKnife.bind(mailSettingView, MailSettingActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155233a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155234a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172467a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172465a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155236f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155237g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172469c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172466a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172468b(this);
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
        C43445c cVar = this.f110342b;
        if (cVar != null) {
            cVar.destroy();
            this.f110342b = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        C43445c cVar = this.f110342b;
        if (cVar != null) {
            cVar.mo155258b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        C43445c cVar = this.f110342b;
        if (cVar != null) {
            cVar.mo155256a();
        }
    }

    /* renamed from: h */
    private void m172470h() {
        C43445c cVar = new C43445c(this, new C43442b(), new MailSettingView(this, this.f110343c));
        this.f110342b = cVar;
        cVar.create();
    }

    /* renamed from: a */
    public static Resources m172466a(MailSettingActivity mailSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mailSettingActivity);
        }
        return mailSettingActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172469c(MailSettingActivity mailSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mailSettingActivity);
        }
        return mailSettingActivity.mo155237g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_general_activity);
        m172470h();
        C42187a.m168555m("email_settings_open");
    }

    /* renamed from: b */
    public static void m172468b(MailSettingActivity mailSettingActivity) {
        mailSettingActivity.mo155236f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MailSettingActivity mailSettingActivity2 = mailSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mailSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172467a(MailSettingActivity mailSettingActivity, Context context) {
        mailSettingActivity.mo155234a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mailSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m172465a(MailSettingActivity mailSettingActivity, Configuration configuration) {
        Context a = mailSettingActivity.mo155233a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
