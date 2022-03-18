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

public class OryxHostActivityStub04 extends OryxActivityBase {
    /* renamed from: a */
    public Context mo48767a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo48768a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo48769a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m53260a(this, context);
    }

    /* renamed from: b */
    public void mo48770b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo48771c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m53258a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m53262c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m53259a(this);
    }

    @Override // com.tt.miniapphost.MiniappHostBase
    public boolean isInHostStack() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m53261b(this);
    }

    /* renamed from: a */
    public static Resources m53259a(OryxHostActivityStub04 oryxHostActivityStub04) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxHostActivityStub04);
        }
        return oryxHostActivityStub04.mo48768a();
    }

    /* renamed from: c */
    public static AssetManager m53262c(OryxHostActivityStub04 oryxHostActivityStub04) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxHostActivityStub04);
        }
        return oryxHostActivityStub04.mo48771c();
    }

    /* renamed from: b */
    public static void m53261b(OryxHostActivityStub04 oryxHostActivityStub04) {
        oryxHostActivityStub04.mo48770b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OryxHostActivityStub04 oryxHostActivityStub042 = oryxHostActivityStub04;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    oryxHostActivityStub042.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m53260a(OryxHostActivityStub04 oryxHostActivityStub04, Context context) {
        oryxHostActivityStub04.mo48769a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxHostActivityStub04);
        }
    }

    /* renamed from: a */
    public static Context m53258a(OryxHostActivityStub04 oryxHostActivityStub04, Configuration configuration) {
        Context a = oryxHostActivityStub04.mo48767a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
