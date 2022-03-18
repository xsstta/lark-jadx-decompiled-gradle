package com.ss.android.lark.mail.impl.settings.subsetting.replylanguage;

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
import com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ReplyLanguageActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43540c f110499b;

    /* renamed from: c */
    private ReplyLanguageView.AbstractC43534a f110500c = new ReplyLanguageView.AbstractC43534a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageActivity.C435321 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView.AbstractC43534a
        /* renamed from: a */
        public void mo155429a(ReplyLanguageView replyLanguageView) {
            ButterKnife.bind(replyLanguageView, ReplyLanguageActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155423a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155424a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172801a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172799a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155426f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155427g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172803c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172800a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172802b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107418u;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f110499b.mo155439b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43540c cVar = this.f110499b;
        if (cVar != null) {
            cVar.destroy();
            this.f110499b = null;
        }
    }

    /* renamed from: h */
    private void m172804h() {
        C43540c cVar = new C43540c(new C43539b(), new ReplyLanguageView(this, this.f110500c));
        this.f110499b = cVar;
        cVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_reply_language_activity);
        m172804h();
    }

    /* renamed from: a */
    public static Resources m172800a(ReplyLanguageActivity replyLanguageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(replyLanguageActivity);
        }
        return replyLanguageActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172803c(ReplyLanguageActivity replyLanguageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(replyLanguageActivity);
        }
        return replyLanguageActivity.mo155427g();
    }

    /* renamed from: b */
    public static void m172802b(ReplyLanguageActivity replyLanguageActivity) {
        replyLanguageActivity.mo155426f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ReplyLanguageActivity replyLanguageActivity2 = replyLanguageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    replyLanguageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172801a(ReplyLanguageActivity replyLanguageActivity, Context context) {
        replyLanguageActivity.mo155424a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(replyLanguageActivity);
        }
    }

    /* renamed from: a */
    public static Context m172799a(ReplyLanguageActivity replyLanguageActivity, Configuration configuration) {
        Context a = replyLanguageActivity.mo155423a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
