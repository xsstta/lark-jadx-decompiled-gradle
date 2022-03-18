package com.bytedance.ee.lark.oryxgadget.host.stub;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.ee.lark.oryxgadget.host.OryxActivityBase;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class OryxHostActivityStub03 extends OryxActivityBase {
    /* renamed from: a */
    public Context mo48761a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo48762a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo48763a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m53250a(this, context);
    }

    /* renamed from: b */
    public void mo48764b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo48765c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m53248a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m53252c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m53249a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m53251b(this);
    }

    /* renamed from: a */
    public static Resources m53249a(OryxHostActivityStub03 oryxHostActivityStub03) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxHostActivityStub03);
        }
        return oryxHostActivityStub03.mo48762a();
    }

    /* renamed from: c */
    public static AssetManager m53252c(OryxHostActivityStub03 oryxHostActivityStub03) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxHostActivityStub03);
        }
        return oryxHostActivityStub03.mo48765c();
    }

    /* renamed from: b */
    public static void m53251b(OryxHostActivityStub03 oryxHostActivityStub03) {
        oryxHostActivityStub03.mo48764b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OryxHostActivityStub03 oryxHostActivityStub032 = oryxHostActivityStub03;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    oryxHostActivityStub032.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m53250a(OryxHostActivityStub03 oryxHostActivityStub03, Context context) {
        oryxHostActivityStub03.mo48763a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxHostActivityStub03);
        }
    }

    /* renamed from: a */
    public static Context m53248a(OryxHostActivityStub03 oryxHostActivityStub03, Configuration configuration) {
        Context a = oryxHostActivityStub03.mo48761a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
