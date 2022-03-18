package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyView;
import com.ss.android.lark.mail.impl.utils.ActivityDependency;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AutoReplyActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    private C43492b f110413b;

    /* renamed from: c */
    private AutoReplyView.AbstractC43479a f110414c = new AutoReplyView.AbstractC43479a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyActivity.C434751 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyView.AbstractC43479a
        /* renamed from: a */
        public void mo155309a(AutoReplyView autoReplyView) {
            ButterKnife.bind(autoReplyView, AutoReplyActivity.this);
        }
    };

    /* renamed from: d */
    private ActivityDependency f110415d = new ActivityDependency() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AutoReplyActivity.C434762 */

        @Override // com.ss.android.lark.mail.impl.utils.ActivityDependency
        /* renamed from: a */
        public void mo150551a(Fragment fragment) {
            AutoReplyActivity.this.getSupportFragmentManager().beginTransaction().show(fragment).commitAllowingStateLoss();
            AutoReplyActivity.this.getSupportFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.mail.impl.utils.ActivityDependency
        /* renamed from: b */
        public void mo150553b(Fragment fragment) {
            AutoReplyActivity.this.getSupportFragmentManager().beginTransaction().hide(fragment).commitAllowingStateLoss();
            AutoReplyActivity.this.getSupportFragmentManager().executePendingTransactions();
        }

        @Override // com.ss.android.lark.mail.impl.utils.ActivityDependency
        /* renamed from: a */
        public void mo150552a(Fragment fragment, int i) {
            AutoReplyActivity.this.getSupportFragmentManager().beginTransaction().add(i, fragment, (String) null).commitAllowingStateLoss();
            AutoReplyActivity.this.getSupportFragmentManager().executePendingTransactions();
        }
    };

    /* renamed from: a */
    public Context mo155303a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155304a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172567a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172565a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155306f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155307g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172569c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172566a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172568b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107417t;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f110413b.mo155352b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43492b bVar = this.f110413b;
        if (bVar != null) {
            bVar.destroy();
            this.f110413b = null;
        }
    }

    /* renamed from: h */
    private void m172570h() {
        C43492b bVar = new C43492b(new C43491a(this.f110274a), new AutoReplyView(this, this.f110414c, this.f110415d));
        this.f110413b = bVar;
        bVar.create();
    }

    /* renamed from: a */
    public static Resources m172566a(AutoReplyActivity autoReplyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoReplyActivity);
        }
        return autoReplyActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172569c(AutoReplyActivity autoReplyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoReplyActivity);
        }
        return autoReplyActivity.mo155307g();
    }

    /* renamed from: b */
    public static void m172568b(AutoReplyActivity autoReplyActivity) {
        autoReplyActivity.mo155306f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AutoReplyActivity autoReplyActivity2 = autoReplyActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    autoReplyActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            str = bundle.getString("AUTO_REPLY_SOURCE", C42187a.C42191c.f107429F);
        } else {
            str = getIntent().getStringExtra("AUTO_REPLY_SOURCE");
        }
        C42187a.m168543i(str);
        setContentView(R.layout.mail_setting_auto_reply_activity);
        m172570h();
    }

    /* renamed from: a */
    public static void m172567a(AutoReplyActivity autoReplyActivity, Context context) {
        autoReplyActivity.mo155304a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(autoReplyActivity);
        }
    }

    /* renamed from: a */
    public static Context m172565a(AutoReplyActivity autoReplyActivity, Configuration configuration) {
        Context a = autoReplyActivity.mo155303a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
