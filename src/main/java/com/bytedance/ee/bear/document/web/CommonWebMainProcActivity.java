package com.bytedance.ee.bear.document.web;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/document/web/CommonWebMainProcActivity;", "Lcom/bytedance/ee/bear/document/web/CommonWebActivity;", "()V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommonWebMainProcActivity extends CommonWebActivity {
    /* renamed from: a */
    public Context mo25283a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo25284a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m25211a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m25209a(this, configuration);
    }

    public AssetManager getAssets() {
        return m25213c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m25210a(this);
    }

    /* renamed from: i */
    public Resources mo25287i() {
        return super.getResources();
    }

    /* renamed from: j */
    public void mo25288j() {
        super.onStop();
    }

    /* renamed from: k */
    public AssetManager mo25289k() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m25212b(this);
    }

    /* renamed from: a */
    public static Resources m25210a(CommonWebMainProcActivity commonWebMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(commonWebMainProcActivity);
        }
        return commonWebMainProcActivity.mo25287i();
    }

    /* renamed from: c */
    public static AssetManager m25213c(CommonWebMainProcActivity commonWebMainProcActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(commonWebMainProcActivity);
        }
        return commonWebMainProcActivity.mo25289k();
    }

    /* renamed from: b */
    public static void m25212b(CommonWebMainProcActivity commonWebMainProcActivity) {
        commonWebMainProcActivity.mo25288j();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CommonWebMainProcActivity commonWebMainProcActivity2 = commonWebMainProcActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    commonWebMainProcActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m25211a(CommonWebMainProcActivity commonWebMainProcActivity, Context context) {
        commonWebMainProcActivity.mo25284a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(commonWebMainProcActivity);
        }
    }

    /* renamed from: a */
    public static Context m25209a(CommonWebMainProcActivity commonWebMainProcActivity, Configuration configuration) {
        Context a = commonWebMainProcActivity.mo25283a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
