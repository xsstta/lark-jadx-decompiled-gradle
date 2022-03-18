package com.ss.android.lark.invite_new_tenant.rule;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.invite_new_tenant.rule.C40620a;
import com.ss.android.lark.invite_new_tenant.rule.InviteRuleView;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class InviteActivityRuleActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private BasePresenter<C40620a.AbstractC40621a, C40620a.AbstractC40622b, C40620a.AbstractC40622b.AbstractC40623a> f103044a;

    /* renamed from: b */
    private InviteRuleView.AbstractC40619a f103045b = new InviteRuleView.AbstractC40619a() {
        /* class com.ss.android.lark.invite_new_tenant.rule.InviteActivityRuleActivity.C406181 */

        @Override // com.ss.android.lark.invite_new_tenant.rule.InviteRuleView.AbstractC40619a
        /* renamed from: a */
        public void mo146751a(InviteRuleView inviteRuleView) {
            ButterKnife.bind(inviteRuleView, InviteActivityRuleActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo146744a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146745a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146746a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160631a(this, context);
    }

    /* renamed from: b */
    public void mo146747b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146748c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160629a(this, configuration);
    }

    public AssetManager getAssets() {
        return m160633c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160630a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160632b(this);
    }

    /* renamed from: d */
    private void m160634d() {
        C40626c cVar = new C40626c(new C40625b(), new InviteRuleView(this, this.f103045b));
        this.f103044a = cVar;
        cVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        BasePresenter<C40620a.AbstractC40621a, C40620a.AbstractC40622b, C40620a.AbstractC40622b.AbstractC40623a> basePresenter = this.f103044a;
        if (basePresenter != null) {
            basePresenter.destroy();
            this.f103044a = null;
        }
        super.onDestroy();
        StatisticsManager.m160654a("invite_tenant_rule_close");
    }

    /* renamed from: a */
    public static Resources m160630a(InviteActivityRuleActivity inviteActivityRuleActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteActivityRuleActivity);
        }
        return inviteActivityRuleActivity.mo146745a();
    }

    /* renamed from: c */
    public static AssetManager m160633c(InviteActivityRuleActivity inviteActivityRuleActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteActivityRuleActivity);
        }
        return inviteActivityRuleActivity.mo146748c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_invite_rule);
        m160634d();
        StatisticsManager.m160654a("invite_tenant_rule_open");
    }

    /* renamed from: b */
    public static void m160632b(InviteActivityRuleActivity inviteActivityRuleActivity) {
        inviteActivityRuleActivity.mo146747b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteActivityRuleActivity inviteActivityRuleActivity2 = inviteActivityRuleActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteActivityRuleActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m160631a(InviteActivityRuleActivity inviteActivityRuleActivity, Context context) {
        inviteActivityRuleActivity.mo146746a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteActivityRuleActivity);
        }
    }

    /* renamed from: a */
    public static Context m160629a(InviteActivityRuleActivity inviteActivityRuleActivity, Configuration configuration) {
        Context a = inviteActivityRuleActivity.mo146744a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
