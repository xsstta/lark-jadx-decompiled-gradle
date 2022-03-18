package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class EditAutoReplyMultiProcessActivity extends EditAutoReplyActivity {
    /* renamed from: a */
    public Context mo155321a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155322a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172607a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172605a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155324f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155325g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172609c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172606a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172608b(this);
    }

    /* renamed from: a */
    public static Resources m172606a(EditAutoReplyMultiProcessActivity editAutoReplyMultiProcessActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAutoReplyMultiProcessActivity);
        }
        return editAutoReplyMultiProcessActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172609c(EditAutoReplyMultiProcessActivity editAutoReplyMultiProcessActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAutoReplyMultiProcessActivity);
        }
        return editAutoReplyMultiProcessActivity.mo155325g();
    }

    /* renamed from: b */
    public static void m172608b(EditAutoReplyMultiProcessActivity editAutoReplyMultiProcessActivity) {
        editAutoReplyMultiProcessActivity.mo155324f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EditAutoReplyMultiProcessActivity editAutoReplyMultiProcessActivity2 = editAutoReplyMultiProcessActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    editAutoReplyMultiProcessActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172607a(EditAutoReplyMultiProcessActivity editAutoReplyMultiProcessActivity, Context context) {
        editAutoReplyMultiProcessActivity.mo155322a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAutoReplyMultiProcessActivity);
        }
    }

    /* renamed from: a */
    public static Context m172605a(EditAutoReplyMultiProcessActivity editAutoReplyMultiProcessActivity, Configuration configuration) {
        Context a = editAutoReplyMultiProcessActivity.mo155321a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
