package com.ss.android.vc.common.widget.globaldialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vcxp.C63801c;

public class PopupDialogActivity extends BaseActivity {

    /* renamed from: b */
    private TextView f152363b;

    /* renamed from: c */
    private TextView f152364c;

    /* renamed from: d */
    private TextView f152365d;

    /* renamed from: e */
    private TextView f152366e;

    /* renamed from: a */
    public Context mo208674a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo208675a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo208676a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.vc.common.base.BaseActivity
    public void attachBaseContext(Context context) {
        m236558a(this, context);
    }

    /* renamed from: b */
    public void mo208677b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo208678c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m236556a(this, configuration);
    }

    public AssetManager getAssets() {
        return m236560c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m236557a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m236559b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        C60862a.m236568b();
    }

    public void finish() {
        try {
            if (C60773o.m236120a((Activity) this)) {
                super.finish();
                overridePendingTransition(R.anim.vc_activity_fade_in, R.anim.activity_fade_out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m236561d() {
        if (C60862a.m236567a().mo208690e() != null) {
            this.f152363b.setText(C60862a.m236567a().mo208690e());
        }
        if (C60862a.m236567a().mo208691f() != null) {
            this.f152364c.setText(C60862a.m236567a().mo208691f());
        }
        if (C60862a.m236567a().mo208688c() != null) {
            this.f152365d.setText(C60862a.m236567a().mo208688c());
        }
        if (C60862a.m236567a().mo208689d() != null) {
            this.f152366e.setText(C60862a.m236567a().mo208689d());
        }
        this.f152363b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.common.widget.globaldialog.PopupDialogActivity.View$OnClickListenerC608601 */

            public void onClick(View view) {
                PopupDialogActivity.this.finish();
                if (C60862a.m236567a().mo208692g() != null) {
                    C60862a.m236567a().mo208692g().mo208693a();
                }
            }
        });
        this.f152364c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.common.widget.globaldialog.PopupDialogActivity.View$OnClickListenerC608612 */

            public void onClick(View view) {
                PopupDialogActivity.this.finish();
                if (C60862a.m236567a().mo208692g() != null) {
                    C60862a.m236567a().mo208692g().mo208694b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m236561d();
    }

    /* renamed from: a */
    public static Resources m236557a(PopupDialogActivity popupDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(popupDialogActivity);
        }
        return popupDialogActivity.mo208675a();
    }

    /* renamed from: c */
    public static AssetManager m236560c(PopupDialogActivity popupDialogActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(popupDialogActivity);
        }
        return popupDialogActivity.mo208678c();
    }

    /* renamed from: b */
    public static void m236559b(PopupDialogActivity popupDialogActivity) {
        popupDialogActivity.mo208677b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PopupDialogActivity popupDialogActivity2 = popupDialogActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    popupDialogActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        if (!C63801c.m250499a(this, bundle)) {
            finish();
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.layout_pop_dialog);
        overridePendingTransition(R.anim.vc_activity_fade_in, R.anim.activity_fade_out);
        this.f152363b = (TextView) findViewById(R.id.popup_dialog_start);
        this.f152364c = (TextView) findViewById(R.id.popup_dialog_cancel);
        this.f152365d = (TextView) findViewById(R.id.popup_dialog_title);
        this.f152366e = (TextView) findViewById(R.id.popup_dialog_prompt);
        m236561d();
    }

    /* renamed from: a */
    public static void m236558a(PopupDialogActivity popupDialogActivity, Context context) {
        popupDialogActivity.mo208676a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(popupDialogActivity);
        }
    }

    /* renamed from: a */
    public static Context m236556a(PopupDialogActivity popupDialogActivity, Configuration configuration) {
        Context a = popupDialogActivity.mo208674a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
