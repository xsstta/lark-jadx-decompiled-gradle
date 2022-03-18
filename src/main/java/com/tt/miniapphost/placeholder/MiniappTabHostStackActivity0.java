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

public class MiniappTabHostStackActivity0 extends MiniappHostBase {
    /* renamed from: a */
    public Context mo234642a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo234643a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo234644a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m262830a(this, context);
    }

    /* renamed from: b */
    public void mo234645b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo234646c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m262828a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m262832c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m262829a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m262831b(this);
    }

    /* renamed from: a */
    public static Resources m262829a(MiniappTabHostStackActivity0 miniappTabHostStackActivity0) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity0);
        }
        return miniappTabHostStackActivity0.mo234643a();
    }

    /* renamed from: c */
    public static AssetManager m262832c(MiniappTabHostStackActivity0 miniappTabHostStackActivity0) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity0);
        }
        return miniappTabHostStackActivity0.mo234646c();
    }

    /* renamed from: b */
    public static void m262831b(MiniappTabHostStackActivity0 miniappTabHostStackActivity0) {
        miniappTabHostStackActivity0.mo234645b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MiniappTabHostStackActivity0 miniappTabHostStackActivity02 = miniappTabHostStackActivity0;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    miniappTabHostStackActivity02.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m262830a(MiniappTabHostStackActivity0 miniappTabHostStackActivity0, Context context) {
        miniappTabHostStackActivity0.mo234644a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(miniappTabHostStackActivity0);
        }
    }

    /* renamed from: a */
    public static Context m262828a(MiniappTabHostStackActivity0 miniappTabHostStackActivity0, Configuration configuration) {
        Context a = miniappTabHostStackActivity0.mo234642a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
