package com.ss.android.lark.mail.impl.message.send.state;

import android.content.Context;
import android.content.Intent;
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
import com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SendStatusDetailActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    public static String f109501a = "key_message_id";

    /* renamed from: b */
    private C43028d f109502b;

    /* renamed from: c */
    private SendStatusDetailView.AbstractC43018a f109503c = new SendStatusDetailView.AbstractC43018a() {
        /* class com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailActivity.C430121 */

        @Override // com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView.AbstractC43018a
        /* renamed from: a */
        public void mo154183a(SendStatusDetailView sendStatusDetailView) {
            ButterKnife.bind(sendStatusDetailView, SendStatusDetailActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo154177a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo154178a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m171139a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m171136a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo154180d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo150716e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo154181f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m171141c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m171137a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m171140b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107422y;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43028d dVar = this.f109502b;
        if (dVar != null) {
            dVar.destroy();
            this.f109502b = null;
        }
    }

    /* renamed from: a */
    public static Resources m171137a(SendStatusDetailActivity sendStatusDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendStatusDetailActivity);
        }
        return sendStatusDetailActivity.mo154180d();
    }

    /* renamed from: c */
    public static AssetManager m171141c(SendStatusDetailActivity sendStatusDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendStatusDetailActivity);
        }
        return sendStatusDetailActivity.mo154181f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_send_status_detail_activity);
        m171138a(getIntent());
    }

    /* renamed from: b */
    public static void m171140b(SendStatusDetailActivity sendStatusDetailActivity) {
        sendStatusDetailActivity.mo150716e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SendStatusDetailActivity sendStatusDetailActivity2 = sendStatusDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    sendStatusDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m171138a(Intent intent) {
        String stringExtra = intent.getStringExtra(f109501a);
        if (stringExtra == null) {
            finish();
            return;
        }
        C43028d dVar = new C43028d(new C43026c(stringExtra), new SendStatusDetailView(this, this.f109503c));
        this.f109502b = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public static void m171139a(SendStatusDetailActivity sendStatusDetailActivity, Context context) {
        sendStatusDetailActivity.mo154178a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(sendStatusDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m171136a(SendStatusDetailActivity sendStatusDetailActivity, Configuration configuration) {
        Context a = sendStatusDetailActivity.mo154177a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
