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
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class EntSignatureActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43571d f110537b;

    /* renamed from: c */
    private final EntSignatureView.AbstractC43556a f110538c = new EntSignatureView.AbstractC43556a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureActivity.C435501 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.EntSignatureView.AbstractC43556a
        /* renamed from: a */
        public void mo155498a(EntSignatureView entSignatureView) {
            ButterKnife.bind(entSignatureView, EntSignatureActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155492a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155493a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172879a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172877a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155495f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155496g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172881c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172878a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172880b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107416s;
    }

    /* renamed from: h */
    private void m172882h() {
        C43571d dVar = new C43571d(new C43568c(this.f110274a), new EntSignatureView(this, this.f110538c));
        this.f110537b = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public static Resources m172878a(EntSignatureActivity entSignatureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(entSignatureActivity);
        }
        return entSignatureActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172881c(EntSignatureActivity entSignatureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(entSignatureActivity);
        }
        return entSignatureActivity.mo155496g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_ent_signature_activity);
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_body));
        C42330c.m169080g();
        m172882h();
    }

    /* renamed from: b */
    public static void m172880b(EntSignatureActivity entSignatureActivity) {
        entSignatureActivity.mo155495f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EntSignatureActivity entSignatureActivity2 = entSignatureActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    entSignatureActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172879a(EntSignatureActivity entSignatureActivity, Context context) {
        entSignatureActivity.mo155493a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(entSignatureActivity);
        }
    }

    /* renamed from: a */
    public static Context m172877a(EntSignatureActivity entSignatureActivity, Configuration configuration) {
        Context a = entSignatureActivity.mo155492a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 0 && intent != null) {
            this.f110537b.mo155566a((EntSignatureUsage) intent.getSerializableExtra("currentId"));
        }
    }
}
