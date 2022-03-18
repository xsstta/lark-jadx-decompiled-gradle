package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.EntSignatureUsage;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SelectEntSignatureActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43591k f110566b;

    /* renamed from: c */
    private final SelectEntSignatureView.AbstractC43560a f110567c = new SelectEntSignatureView.AbstractC43560a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureActivity.C435571 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.SelectEntSignatureView.AbstractC43560a
        /* renamed from: a */
        public void mo155527a(SelectEntSignatureView selectEntSignatureView) {
            ButterKnife.bind(selectEntSignatureView, SelectEntSignatureActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155521a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155522a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172932a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172930a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155524f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155525g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172934c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172931a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172933b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107416s;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43591k kVar = this.f110566b;
        if (kVar != null) {
            kVar.destroy();
            this.f110566b = null;
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        EntSignatureUsage b = this.f110566b.mo155598b();
        if (b == null) {
            setResult(0);
        } else {
            Intent intent = new Intent();
            intent.putExtra("currentId", b);
            setResult(-1, intent);
        }
        super.finish();
    }

    /* renamed from: h */
    private void m172935h() {
        C43590j jVar = new C43590j(this.f110274a);
        SelectEntSignatureView selectEntSignatureView = new SelectEntSignatureView(this, this.f110567c);
        Intent intent = getIntent();
        if (intent != null) {
            jVar.f110612a = intent.getBooleanExtra("isNew", false);
            jVar.mo155593a(intent.getStringExtra("address"));
            jVar.mo155595b(intent.getStringExtra("fixedId"));
            jVar.mo155596c(intent.getStringExtra("currentId"));
            jVar.mo155594a(intent.getParcelableArrayListExtra("signatureList"));
        }
        C43591k kVar = new C43591k(jVar, selectEntSignatureView);
        this.f110566b = kVar;
        kVar.create();
    }

    /* renamed from: a */
    public static Resources m172931a(SelectEntSignatureActivity selectEntSignatureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectEntSignatureActivity);
        }
        return selectEntSignatureActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172934c(SelectEntSignatureActivity selectEntSignatureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectEntSignatureActivity);
        }
        return selectEntSignatureActivity.mo155525g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_ent_signature_select_activity);
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_body));
        m172935h();
    }

    /* renamed from: b */
    public static void m172933b(SelectEntSignatureActivity selectEntSignatureActivity) {
        selectEntSignatureActivity.mo155524f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SelectEntSignatureActivity selectEntSignatureActivity2 = selectEntSignatureActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    selectEntSignatureActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172932a(SelectEntSignatureActivity selectEntSignatureActivity, Context context) {
        selectEntSignatureActivity.mo155522a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectEntSignatureActivity);
        }
    }

    /* renamed from: a */
    public static Context m172930a(SelectEntSignatureActivity selectEntSignatureActivity, Configuration configuration) {
        Context a = selectEntSignatureActivity.mo155521a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
