package com.tt.miniapp.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.C66205j;
import com.tt.miniapp.manager.p3302a.C66377a;
import com.tt.miniapp.util.C67031e;
import com.tt.miniapp.view.AppbrandSwitch;
import com.tt.miniapp.view.swipeback.SwipeBackActivity;
import com.tt.miniapphost.util.C67590h;

public class ProjectSettingsActivity extends SwipeBackActivity {

    /* renamed from: a */
    private View f168497a;

    /* renamed from: b */
    private LinearLayout f168498b;

    /* renamed from: a */
    public Context mo232574a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo232575a() {
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m260556a(this, context);
    }

    /* renamed from: b */
    public void mo232576b(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public void mo232577c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m260552a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo232579d() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m260558c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m260554a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m260557b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.microapp_i_slide_in_no, R.anim.microapp_i_slide_out_right);
    }

    /* renamed from: e */
    private void m260559e() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(getResources().getColor(R.color.microapp_m_status_bar_color));
        }
        LayoutInflater from = LayoutInflater.from(this);
        this.f168497a = findViewById(R.id.microapp_m_settings_scroll);
        this.f168498b = (LinearLayout) findViewById(R.id.microapp_m_layout_project_settings);
        if (C67031e.m261247a()) {
            m260555a(from);
        }
        C66205j jVar = new C66205j(this, new C66205j.C66206a().mo231551a(true));
        jVar.mo231547a(true);
        jVar.mo231549b(true);
    }

    /* renamed from: f */
    private void m260560f() {
        ((ImageView) findViewById(R.id.microapp_m_page_close)).setImageResource(R.drawable.microapp_m_lefterbackicon_titlebar_light);
        C67590h.m263074a(this, findViewById(R.id.microapp_m_titleBar_content));
        findViewById(R.id.microapp_m_titlebar_capsule).setVisibility(8);
        findViewById(R.id.microapp_m_titleBar_content).setBackgroundColor(-1);
        findViewById(R.id.microapp_m_page_close).setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.settings.ProjectSettingsActivity.View$OnClickListenerC667472 */

            public void onClick(View view) {
                ProjectSettingsActivity.this.finish();
            }
        });
        C67590h.m263079a(findViewById(R.id.microapp_m_titlebar_layout), 8);
        ((TextView) findViewById(R.id.microapp_m_page_title)).setText(getString(R.string.microapp_m_debug_mode));
    }

    /* renamed from: a */
    public static Intent m260553a(Context context) {
        return new Intent(context, ProjectSettingsActivity.class);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.microapp_m_activity_project_settings);
        m260560f();
        m260559e();
    }

    /* renamed from: a */
    public static Resources m260554a(ProjectSettingsActivity projectSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(projectSettingsActivity);
        }
        return projectSettingsActivity.mo232575a();
    }

    /* renamed from: c */
    public static AssetManager m260558c(ProjectSettingsActivity projectSettingsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(projectSettingsActivity);
        }
        return projectSettingsActivity.mo232579d();
    }

    /* renamed from: b */
    public static void m260557b(ProjectSettingsActivity projectSettingsActivity) {
        projectSettingsActivity.mo232577c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ProjectSettingsActivity projectSettingsActivity2 = projectSettingsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    projectSettingsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m260555a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.microapp_m_layout_permmsion_item, (ViewGroup) this.f168498b, false);
        ((TextView) inflate.findViewById(R.id.microapp_m_name)).setText(getString(R.string.microapp_m_tip_localtest_jssdk_upgrade_info));
        AppbrandSwitch appbrandSwitch = (AppbrandSwitch) inflate.findViewById(R.id.microapp_m_permission_switch);
        appbrandSwitch.setTag(1);
        appbrandSwitch.setChecked(C66377a.m259536c(this));
        appbrandSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.tt.miniapp.settings.ProjectSettingsActivity.C667461 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C66377a.m259533a(ProjectSettingsActivity.this, z);
            }
        });
        this.f168498b.addView(inflate);
    }

    /* renamed from: a */
    public static void m260556a(ProjectSettingsActivity projectSettingsActivity, Context context) {
        projectSettingsActivity.mo232576b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(projectSettingsActivity);
        }
    }

    /* renamed from: a */
    public static Context m260552a(ProjectSettingsActivity projectSettingsActivity, Configuration configuration) {
        Context a = projectSettingsActivity.mo232574a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
