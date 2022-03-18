package com.ss.android.lark.invite_new_tenant.invite.single;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.invite_new_tenant.invite.single.email.C40589b;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40610d;
import com.ss.android.lark.invite_new_tenant.rule.InviteActivityRuleActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class InviteSingleActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private FragmentManager f102997a;

    /* renamed from: b */
    private CommonTitleBar f102998b;

    /* renamed from: a */
    public Context mo146698a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146699a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146700a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160546a(this, context);
    }

    /* renamed from: b */
    public void mo146701b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146702c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160544a(this, configuration);
    }

    public AssetManager getAssets() {
        return m160548c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160545a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160547b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        KeyboardUtils.hideKeyboard(this);
        super.finish();
    }

    /* renamed from: a */
    public static Resources m160545a(InviteSingleActivity inviteSingleActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteSingleActivity);
        }
        return inviteSingleActivity.mo146699a();
    }

    /* renamed from: c */
    public static AssetManager m160548c(InviteSingleActivity inviteSingleActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteSingleActivity);
        }
        return inviteSingleActivity.mo146702c();
    }

    /* renamed from: b */
    public static void m160547b(InviteSingleActivity inviteSingleActivity) {
        inviteSingleActivity.mo146701b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteSingleActivity inviteSingleActivity2 = inviteSingleActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteSingleActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView(R.layout.activity_invite_single);
        this.f102998b = (CommonTitleBar) findViewById(R.id.invite_to_person_title_bar);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f102997a = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (getIntent().getBooleanExtra("KEY_ENABLE_MOBILE", true)) {
            fragment = C40610d.m160615b();
        } else {
            fragment = C40589b.m160571b();
        }
        beginTransaction.add(R.id.invite_to_person_container, fragment);
        beginTransaction.commitAllowingStateLoss();
        if (getIntent().getBooleanExtra("KEY_SHOW_RULE", false)) {
            this.f102998b.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this, R.string.Lark_UserGrowth_InviteTenantRule)) {
                /* class com.ss.android.lark.invite_new_tenant.invite.single.InviteSingleActivity.C405791 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    InviteSingleActivity.this.startActivity(new Intent(InviteSingleActivity.this, InviteActivityRuleActivity.class));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m160546a(InviteSingleActivity inviteSingleActivity, Context context) {
        inviteSingleActivity.mo146700a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteSingleActivity);
        }
    }

    /* renamed from: a */
    public static Context m160544a(InviteSingleActivity inviteSingleActivity, Configuration configuration) {
        Context a = inviteSingleActivity.mo146698a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
