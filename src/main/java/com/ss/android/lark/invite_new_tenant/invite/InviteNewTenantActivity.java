package com.ss.android.lark.invite_new_tenant.invite;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.invite.all.InviteAllActivity;
import com.ss.android.lark.invite_new_tenant.invite.single.InviteSingleActivity;
import com.ss.android.lark.invite_new_tenant.rule.InviteActivityRuleActivity;
import com.ss.android.lark.invite_new_tenant.statistics.StatisticsManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class InviteNewTenantActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private View f102945a;

    /* renamed from: b */
    private View f102946b;

    /* renamed from: c */
    private CommonTitleBar f102947c;

    /* renamed from: a */
    public Context mo146649a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146650a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146651a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160458a(this, context);
    }

    /* renamed from: b */
    public void mo146653b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146654c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160456a(this, configuration);
    }

    public AssetManager getAssets() {
        return m160460c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160457a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160459b(this);
    }

    /* renamed from: a */
    public static Resources m160457a(InviteNewTenantActivity inviteNewTenantActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteNewTenantActivity);
        }
        return inviteNewTenantActivity.mo146650a();
    }

    /* renamed from: c */
    public static AssetManager m160460c(InviteNewTenantActivity inviteNewTenantActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteNewTenantActivity);
        }
        return inviteNewTenantActivity.mo146654c();
    }

    /* renamed from: b */
    public static void m160459b(InviteNewTenantActivity inviteNewTenantActivity) {
        inviteNewTenantActivity.mo146653b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteNewTenantActivity inviteNewTenantActivity2 = inviteNewTenantActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteNewTenantActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.activity_invite_new_tenant);
        this.f102945a = findViewById(R.id.invite_all_layout);
        this.f102946b = findViewById(R.id.invite_person_layout);
        this.f102947c = (CommonTitleBar) findViewById(R.id.title_bar);
        if (getIntent().getBooleanExtra("KEY_SHOW_RULE", true)) {
            this.f102947c.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this, R.string.Lark_UserGrowth_InviteTenantRule)) {
                /* class com.ss.android.lark.invite_new_tenant.invite.InviteNewTenantActivity.C405391 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    InviteNewTenantActivity.this.mo146652a(InviteActivityRuleActivity.class);
                }
            });
        }
        if (getIntent().getBooleanExtra("KEY_ENABLE_GIFT", true)) {
            i = R.string.Lark_UserGrowth_InviteTenantWithReward;
        } else {
            i = R.string.Lark_UserGrowth_InviteTenantWithoutReward;
        }
        String mustacheFormat = UIHelper.mustacheFormat(i);
        CommonTitleBar commonTitleBar = this.f102947c;
        if (mustacheFormat == null) {
            mustacheFormat = "";
        }
        commonTitleBar.setTitle(mustacheFormat);
        this.f102945a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.InviteNewTenantActivity.C405402 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                InviteNewTenantActivity.this.mo146652a(InviteAllActivity.class);
                StatisticsManager.m160654a("invite_tenant_click_target");
            }
        });
        this.f102946b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.InviteNewTenantActivity.C405413 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                Intent intent = new Intent(InviteNewTenantActivity.this, InviteSingleActivity.class);
                intent.putExtra("KEY_ENABLE_MOBILE", !C40531a.m160431a().mo143859b());
                InviteNewTenantActivity.this.startActivity(intent);
                StatisticsManager.m160654a("invite_tenant_click_nontarget");
            }
        });
    }

    /* renamed from: a */
    public void mo146652a(Class cls) {
        startActivity(new Intent(this, cls));
    }

    /* renamed from: a */
    public static void m160458a(InviteNewTenantActivity inviteNewTenantActivity, Context context) {
        inviteNewTenantActivity.mo146651a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteNewTenantActivity);
        }
    }

    /* renamed from: a */
    public static Context m160456a(InviteNewTenantActivity inviteNewTenantActivity, Configuration configuration) {
        Context a = inviteNewTenantActivity.mo146649a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
