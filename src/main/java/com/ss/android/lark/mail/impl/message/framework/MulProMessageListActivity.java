package com.ss.android.lark.mail.impl.message.framework;

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

public class MulProMessageListActivity extends MessageListActivity {
    /* renamed from: a */
    public Context mo153997a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo153998a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m170924a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m170922a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo154000d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo150716e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo154001f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m170926c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m170923a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.message.framework.MessageListActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m170925b(this);
    }

    /* renamed from: a */
    public static Resources m170923a(MulProMessageListActivity mulProMessageListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProMessageListActivity);
        }
        return mulProMessageListActivity.mo154000d();
    }

    /* renamed from: c */
    public static AssetManager m170926c(MulProMessageListActivity mulProMessageListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProMessageListActivity);
        }
        return mulProMessageListActivity.mo154001f();
    }

    /* renamed from: b */
    public static void m170925b(MulProMessageListActivity mulProMessageListActivity) {
        mulProMessageListActivity.mo150716e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MulProMessageListActivity mulProMessageListActivity2 = mulProMessageListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mulProMessageListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m170924a(MulProMessageListActivity mulProMessageListActivity, Context context) {
        mulProMessageListActivity.mo153998a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mulProMessageListActivity);
        }
    }

    /* renamed from: a */
    public static Context m170922a(MulProMessageListActivity mulProMessageListActivity, Configuration configuration) {
        Context a = mulProMessageListActivity.mo153997a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
