package com.bytedance.ee.bear.debug.net;

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
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/debug/net/RequestActivityP0;", "Lcom/bytedance/ee/bear/debug/net/RequestActivity;", "()V", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RequestActivityP0 extends RequestActivity {
    /* renamed from: a */
    public Context mo21316a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo21317a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo21318a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m21680a(this, context);
    }

    /* renamed from: b */
    public void mo21319b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo21320c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m21678a(this, configuration);
    }

    public AssetManager getAssets() {
        return m21682c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m21679a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m21681b(this);
    }

    /* renamed from: a */
    public static Resources m21679a(RequestActivityP0 requestActivityP0) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(requestActivityP0);
        }
        return requestActivityP0.mo21317a();
    }

    /* renamed from: c */
    public static AssetManager m21682c(RequestActivityP0 requestActivityP0) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(requestActivityP0);
        }
        return requestActivityP0.mo21320c();
    }

    /* renamed from: b */
    public static void m21681b(RequestActivityP0 requestActivityP0) {
        requestActivityP0.mo21319b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RequestActivityP0 requestActivityP02 = requestActivityP0;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    requestActivityP02.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m21680a(RequestActivityP0 requestActivityP0, Context context) {
        requestActivityP0.mo21318a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(requestActivityP0);
        }
    }

    /* renamed from: a */
    public static Context m21678a(RequestActivityP0 requestActivityP0, Configuration configuration) {
        Context a = requestActivityP0.mo21316a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
