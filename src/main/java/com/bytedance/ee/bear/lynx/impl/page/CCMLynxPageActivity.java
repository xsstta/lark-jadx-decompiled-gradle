package com.bytedance.ee.bear.lynx.impl.page;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/page/CCMLynxPageActivity;", "Lcom/bytedance/ee/bear/lynx/impl/page/AbsLynxPageActivity;", "()V", "onHideError", "", "errorContainer", "Landroid/view/ViewGroup;", "onHideLoading", "loadingContainer", "onShowError", "onShowLoading", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CCMLynxPageActivity extends AbsLynxPageActivity {
    /* renamed from: a */
    public Context mo33957a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo33958a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.lynx.impl.page.AbsLynxPageActivity
    /* renamed from: a */
    public void mo33954a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "loadingContainer");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m37078a(this, context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.lynx.impl.page.AbsLynxPageActivity
    /* renamed from: b */
    public void mo33956b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "loadingContainer");
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m37076a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo33960d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo33961e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo33962f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m37080c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m37077a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m37079b(this);
    }

    /* renamed from: a */
    public static Resources m37077a(CCMLynxPageActivity cCMLynxPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cCMLynxPageActivity);
        }
        return cCMLynxPageActivity.mo33960d();
    }

    /* renamed from: c */
    public static AssetManager m37080c(CCMLynxPageActivity cCMLynxPageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cCMLynxPageActivity);
        }
        return cCMLynxPageActivity.mo33962f();
    }

    /* renamed from: b */
    public static void m37079b(CCMLynxPageActivity cCMLynxPageActivity) {
        cCMLynxPageActivity.mo33961e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CCMLynxPageActivity cCMLynxPageActivity2 = cCMLynxPageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    cCMLynxPageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m37078a(CCMLynxPageActivity cCMLynxPageActivity, Context context) {
        cCMLynxPageActivity.mo33958a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cCMLynxPageActivity);
        }
    }

    /* renamed from: a */
    public static Context m37076a(CCMLynxPageActivity cCMLynxPageActivity, Configuration configuration) {
        Context a = cCMLynxPageActivity.mo33957a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
