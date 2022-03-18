package com.ss.android.lark.mail.impl.message.framework.tabcontainer;

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

public class MulProMessageListTabActivity extends MessageListTabActivity {
    /* renamed from: a */
    public Context mo154017a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo154018a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m170950a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m170948a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo154020f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo154021g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m170952c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m170949a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.message.framework.tabcontainer.MessageListTabActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m170951b(this);
    }

    /* renamed from: a */
    public static Resources m170949a(MulProMessageListTabActivity mulProMessageListTabActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProMessageListTabActivity);
        }
        return mulProMessageListTabActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m170952c(MulProMessageListTabActivity mulProMessageListTabActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProMessageListTabActivity);
        }
        return mulProMessageListTabActivity.mo154021g();
    }

    /* renamed from: b */
    public static void m170951b(MulProMessageListTabActivity mulProMessageListTabActivity) {
        mulProMessageListTabActivity.mo154020f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MulProMessageListTabActivity mulProMessageListTabActivity2 = mulProMessageListTabActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mulProMessageListTabActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m170950a(MulProMessageListTabActivity mulProMessageListTabActivity, Context context) {
        mulProMessageListTabActivity.mo154018a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProMessageListTabActivity);
        }
    }

    /* renamed from: a */
    public static Context m170948a(MulProMessageListTabActivity mulProMessageListTabActivity, Configuration configuration) {
        Context a = mulProMessageListTabActivity.mo154017a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
