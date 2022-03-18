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

public class MiniappTabHostStackActivity9 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234696a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234697a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234698a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262920a(this, context);
    }

    /* renamed from: b */
    public void mo234699b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234700c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262918a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262922c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262919a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262921b(this);
    }

    /* renamed from: a */
    public static Resources m262919a(MiniappTabHostStackActivity9 miniappTabHostStackActivity9) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity9);
        }
        return miniappTabHostStackActivity9.mo234697a();
    }

    /* renamed from: c */
    public static AssetManager m262922c(MiniappTabHostStackActivity9 miniappTabHostStackActivity9) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity9);
        }
        return miniappTabHostStackActivity9.mo234700c();
    }

    /* renamed from: b */
    public static void m262921b(MiniappTabHostStackActivity9 miniappTabHostStackActivity9) {
        miniappTabHostStackActivity9.mo234699b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabHostStackActivity9 miniappTabHostStackActivity92 = miniappTabHostStackActivity9;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabHostStackActivity92.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262920a(MiniappTabHostStackActivity9 miniappTabHostStackActivity9, Context context) {
        miniappTabHostStackActivity9.mo234698a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity9);
        }
    }

    /* renamed from: a */
    public static Context m262918a(MiniappTabHostStackActivity9 miniappTabHostStackActivity9, Configuration configuration) {
        Context a = miniappTabHostStackActivity9.mo234696a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
