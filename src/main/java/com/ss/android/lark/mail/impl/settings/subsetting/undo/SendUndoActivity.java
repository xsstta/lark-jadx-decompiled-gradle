package com.ss.android.lark.mail.impl.settings.subsetting.undo;

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
import com.ss.android.lark.mail.impl.settings.subsetting.undo.SendUndoView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SendUndoActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43623c f110655b;

    /* renamed from: c */
    private SendUndoView.AbstractC43615a f110656c = new SendUndoView.AbstractC43615a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.undo.SendUndoActivity.C436131 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.undo.SendUndoView.AbstractC43615a
        /* renamed from: a */
        public void mo155630a(SendUndoView sendUndoView) {
            ButterKnife.bind(sendUndoView, SendUndoActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155624a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155625a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m173086a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m173084a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155627f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155628g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m173088c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m173085a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m173087b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107417t;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f110655b.mo155647b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43623c cVar = this.f110655b;
        if (cVar != null) {
            cVar.destroy();
            this.f110655b = null;
        }
    }

    /* renamed from: h */
    private void m173089h() {
        C43623c cVar = new C43623c(new C43622b(), new SendUndoView(this, this.f110656c));
        this.f110655b = cVar;
        cVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_send_undo_activity);
        m173089h();
    }

    /* renamed from: a */
    public static Resources m173085a(SendUndoActivity sendUndoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendUndoActivity);
        }
        return sendUndoActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m173088c(SendUndoActivity sendUndoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendUndoActivity);
        }
        return sendUndoActivity.mo155628g();
    }

    /* renamed from: b */
    public static void m173087b(SendUndoActivity sendUndoActivity) {
        sendUndoActivity.mo155627f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SendUndoActivity sendUndoActivity2 = sendUndoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sendUndoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m173086a(SendUndoActivity sendUndoActivity, Context context) {
        sendUndoActivity.mo155625a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendUndoActivity);
        }
    }

    /* renamed from: a */
    public static Context m173084a(SendUndoActivity sendUndoActivity, Configuration configuration) {
        Context a = sendUndoActivity.mo155624a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
