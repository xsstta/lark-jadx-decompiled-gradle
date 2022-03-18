package com.tt.miniapphost.placeholder;

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
import com.tt.miniapphost.MiniappHostBase;

public class MiniappTabHostStackActivity2 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234654a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234655a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234656a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262850a(this, context);
    }

    /* renamed from: b */
    public void mo234657b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234658c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262848a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262852c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262849a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262851b(this);
    }

    /* renamed from: a */
    public static Resources m262849a(MiniappTabHostStackActivity2 miniappTabHostStackActivity2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity2);
        }
        return miniappTabHostStackActivity2.mo234655a();
    }

    /* renamed from: c */
    public static AssetManager m262852c(MiniappTabHostStackActivity2 miniappTabHostStackActivity2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity2);
        }
        return miniappTabHostStackActivity2.mo234658c();
    }

    /* renamed from: b */
    public static void m262851b(MiniappTabHostStackActivity2 miniappTabHostStackActivity2) {
        miniappTabHostStackActivity2.mo234657b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabHostStackActivity2 miniappTabHostStackActivity22 = miniappTabHostStackActivity2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabHostStackActivity22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262850a(MiniappTabHostStackActivity2 miniappTabHostStackActivity2, Context context) {
        miniappTabHostStackActivity2.mo234656a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity2);
        }
    }

    /* renamed from: a */
    public static Context m262848a(MiniappTabHostStackActivity2 miniappTabHostStackActivity2, Configuration configuration) {
        Context a = miniappTabHostStackActivity2.mo234654a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
