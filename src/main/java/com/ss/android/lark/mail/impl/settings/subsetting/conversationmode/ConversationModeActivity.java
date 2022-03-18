package com.ss.android.lark.mail.impl.settings.subsetting.conversationmode;

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
import com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.ConversationModeView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ConversationModeActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43511b f110474b;

    /* renamed from: c */
    private ConversationModeView.AbstractC43509a f110475c = new ConversationModeView.AbstractC43509a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.ConversationModeActivity.C435081 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.ConversationModeView.AbstractC43509a
        /* renamed from: a */
        public void mo155380a(ConversationModeView conversationModeView) {
            ButterKnife.bind(conversationModeView, ConversationModeActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155374a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155375a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172723a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172721a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155377f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155378g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172725c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172722a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172724b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107397G;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f110474b.mo155389b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43511b bVar = this.f110474b;
        if (bVar != null) {
            bVar.destroy();
            this.f110474b = null;
        }
    }

    /* renamed from: h */
    private void m172726h() {
        C43511b bVar = new C43511b(new C43510a(), new ConversationModeView(this, this.f110475c));
        this.f110474b = bVar;
        bVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_conversation_mode_activity);
        m172726h();
    }

    /* renamed from: a */
    public static Resources m172722a(ConversationModeActivity conversationModeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(conversationModeActivity);
        }
        return conversationModeActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172725c(ConversationModeActivity conversationModeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(conversationModeActivity);
        }
        return conversationModeActivity.mo155378g();
    }

    /* renamed from: b */
    public static void m172724b(ConversationModeActivity conversationModeActivity) {
        conversationModeActivity.mo155377f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ConversationModeActivity conversationModeActivity2 = conversationModeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    conversationModeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172723a(ConversationModeActivity conversationModeActivity, Context context) {
        conversationModeActivity.mo155375a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(conversationModeActivity);
        }
    }

    /* renamed from: a */
    public static Context m172721a(ConversationModeActivity conversationModeActivity, Configuration configuration) {
        Context a = conversationModeActivity.mo155374a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
