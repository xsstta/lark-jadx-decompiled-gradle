package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
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
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class EditSignatureActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43566b f110509b;

    /* renamed from: c */
    private EditSignatureView.AbstractC43547a f110510c = new EditSignatureView.AbstractC43547a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureActivity.C435431 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.EditSignatureView.AbstractC43547a
        /* renamed from: a */
        public void mo155458a(EditSignatureView editSignatureView) {
            ButterKnife.bind(editSignatureView, EditSignatureActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155452a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155453a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172831a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172829a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155455f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155456g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172833c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172830a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172832b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107415r;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C43566b bVar = this.f110509b;
        if (bVar != null) {
            bVar.mo155555b();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43566b bVar = this.f110509b;
        if (bVar != null) {
            bVar.destroy();
            this.f110509b = null;
        }
    }

    /* renamed from: h */
    private void m172834h() {
        C43566b bVar = new C43566b(new C43565a(this.f110274a), new EditSignatureView(this, this.f110510c));
        this.f110509b = bVar;
        bVar.create();
    }

    /* renamed from: a */
    public static Resources m172830a(EditSignatureActivity editSignatureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editSignatureActivity);
        }
        return editSignatureActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172833c(EditSignatureActivity editSignatureActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editSignatureActivity);
        }
        return editSignatureActivity.mo155456g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg_body));
        setContentView(R.layout.mail_signature_edit_activity);
        m172834h();
    }

    /* renamed from: b */
    public static void m172832b(EditSignatureActivity editSignatureActivity) {
        editSignatureActivity.mo155455f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EditSignatureActivity editSignatureActivity2 = editSignatureActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    editSignatureActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172831a(EditSignatureActivity editSignatureActivity, Context context) {
        editSignatureActivity.mo155453a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editSignatureActivity);
        }
    }

    /* renamed from: a */
    public static Context m172829a(EditSignatureActivity editSignatureActivity, Configuration configuration) {
        Context a = editSignatureActivity.mo155452a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
