package com.bytedance.ee.bear.list.share;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class ShareMoreActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo33756a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo33757a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo33758a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m36444a(this, context);
    }

    /* renamed from: b */
    public void mo33759b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo33760c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m36442a(this, configuration);
    }

    public AssetManager getAssets() {
        return m36446c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m36443a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m36445b(this);
    }

    /* renamed from: a */
    public static Resources m36443a(ShareMoreActivity shareMoreActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareMoreActivity);
        }
        return shareMoreActivity.mo33757a();
    }

    /* renamed from: c */
    public static AssetManager m36446c(ShareMoreActivity shareMoreActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareMoreActivity);
        }
        return shareMoreActivity.mo33760c();
    }

    /* renamed from: b */
    public static void m36445b(ShareMoreActivity shareMoreActivity) {
        shareMoreActivity.mo33759b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareMoreActivity shareMoreActivity2 = shareMoreActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareMoreActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        Class cls;
        super.mo16851a(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("show_history_folders", false);
        C13479a.m54764b("ShareMoreActivity", "onDoCreate()...showHistoryFolders = " + booleanExtra);
        if (booleanExtra) {
            cls = C8723b.class;
        } else {
            cls = C8709aa.class;
        }
        getSupportFragmentManager().beginTransaction().replace(16908290, Fragment.instantiate(this, cls.getName())).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m36444a(ShareMoreActivity shareMoreActivity, Context context) {
        shareMoreActivity.mo33758a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareMoreActivity);
        }
    }

    /* renamed from: a */
    public static Context m36442a(ShareMoreActivity shareMoreActivity, Configuration configuration) {
        Context a = shareMoreActivity.mo33756a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
