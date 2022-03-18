package com.ss.android.lark.multitask.tasklist;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.C1034f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u001a\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bindFragmentToActivity", "Landroidx/fragment/app/FragmentActivity;", "fragmentClass", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultitaskListActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo169255a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169256a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169257a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m190886a(this, context);
    }

    /* renamed from: b */
    public void mo169259b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169260c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m190884a(this, configuration);
    }

    public AssetManager getAssets() {
        return m190888c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m190885a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m190887b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(R.anim.fade_in, R.anim.fade_out);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo169258a(this, MultitaskListFragment.class);
    }

    /* renamed from: a */
    public static Resources m190885a(MultitaskListActivity multitaskListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(multitaskListActivity);
        }
        return multitaskListActivity.mo169256a();
    }

    /* renamed from: c */
    public static AssetManager m190888c(MultitaskListActivity multitaskListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(multitaskListActivity);
        }
        return multitaskListActivity.mo169260c();
    }

    /* renamed from: b */
    public static void m190887b(MultitaskListActivity multitaskListActivity) {
        multitaskListActivity.mo169259b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MultitaskListActivity multitaskListActivity2 = multitaskListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    multitaskListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m190886a(MultitaskListActivity multitaskListActivity, Context context) {
        multitaskListActivity.mo169257a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(multitaskListActivity);
        }
    }

    /* renamed from: a */
    public static Context m190884a(MultitaskListActivity multitaskListActivity, Configuration configuration) {
        Context a = multitaskListActivity.mo169255a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo169258a(FragmentActivity fragmentActivity, Class<? extends Fragment> cls) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$bindFragmentToActivity");
        Intrinsics.checkParameterIsNotNull(cls, "fragmentClass");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        C1034f fragmentFactory = supportFragmentManager.getFragmentFactory();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            Intrinsics.throwNpe();
        }
        Fragment instantiate = fragmentFactory.instantiate(classLoader, cls.getName());
        Intrinsics.checkExpressionValueIsNotNull(instantiate, "supportFragmentManager.f…er!!, fragmentClass.name)");
        fragmentActivity.getSupportFragmentManager().beginTransaction().add(16908290, instantiate, (String) null).commit();
    }
}
