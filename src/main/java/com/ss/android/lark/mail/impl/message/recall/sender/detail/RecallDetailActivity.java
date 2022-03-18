package com.ss.android.lark.mail.impl.message.recall.sender.detail;

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
import com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class RecallDetailActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    public static String f109466a = "key_message_id";

    /* renamed from: b */
    private C43007e f109467b;

    /* renamed from: c */
    private RecallDetailView.AbstractC42996a f109468c = new RecallDetailView.AbstractC42996a() {
        /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailActivity.C429911 */

        @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView.AbstractC42996a
        /* renamed from: a */
        public void mo154153a(RecallDetailView recallDetailView) {
            ButterKnife.bind(recallDetailView, RecallDetailActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo154147a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo154148a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m171099a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m171096a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo154150d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo150716e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo154151f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m171101c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m171097a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m171100b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107421x;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43007e eVar = this.f109467b;
        if (eVar != null) {
            eVar.destroy();
            this.f109467b = null;
        }
    }

    /* renamed from: a */
    public static Resources m171097a(RecallDetailActivity recallDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recallDetailActivity);
        }
        return recallDetailActivity.mo154150d();
    }

    /* renamed from: c */
    public static AssetManager m171101c(RecallDetailActivity recallDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recallDetailActivity);
        }
        return recallDetailActivity.mo154151f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_recall_detail_activity);
        m171098a(getIntent());
    }

    /* renamed from: b */
    public static void m171100b(RecallDetailActivity recallDetailActivity) {
        recallDetailActivity.mo150716e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RecallDetailActivity recallDetailActivity2 = recallDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    recallDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m171098a(Intent intent) {
        String stringExtra = intent.getStringExtra(f109466a);
        if (stringExtra == null) {
            finish();
            return;
        }
        C43007e eVar = new C43007e(new C43005d(stringExtra), new RecallDetailView(this, this.f109468c));
        this.f109467b = eVar;
        eVar.create();
    }

    /* renamed from: a */
    public static void m171099a(RecallDetailActivity recallDetailActivity, Context context) {
        recallDetailActivity.mo154148a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recallDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m171096a(RecallDetailActivity recallDetailActivity, Configuration configuration) {
        Context a = recallDetailActivity.mo154147a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
