package com.ss.android.lark.thirdshare.container.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.container.impl.LarkShareContainerFragment;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.aj;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LarkShareContainerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f137497a = new Companion(null);

    /* renamed from: a */
    public Context mo189955a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189956a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189957a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215927a(this, context);
    }

    /* renamed from: b */
    public void mo189958b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189959c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215925a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215929c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215926a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215928b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.LarkShareContainerActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo189962a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            context.startActivity(new Intent(aj.m224263a(), LarkShareContainerActivity.class));
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    private final void m215930d() {
        LarkShareContainerFragment.Companion aVar = LarkShareContainerFragment.f137498b;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        LarkShareContainerFragment a = aVar.mo189966a(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, a, "LarkShareContainerFragment");
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m215930d();
    }

    /* renamed from: a */
    public static Resources m215926a(LarkShareContainerActivity larkShareContainerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkShareContainerActivity);
        }
        return larkShareContainerActivity.mo189956a();
    }

    /* renamed from: c */
    public static AssetManager m215929c(LarkShareContainerActivity larkShareContainerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkShareContainerActivity);
        }
        return larkShareContainerActivity.mo189959c();
    }

    /* renamed from: b */
    public static void m215928b(LarkShareContainerActivity larkShareContainerActivity) {
        larkShareContainerActivity.mo189958b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LarkShareContainerActivity larkShareContainerActivity2 = larkShareContainerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    larkShareContainerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m215927a(LarkShareContainerActivity larkShareContainerActivity, Context context) {
        larkShareContainerActivity.mo189957a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkShareContainerActivity);
        }
    }

    /* renamed from: a */
    public static Context m215925a(LarkShareContainerActivity larkShareContainerActivity, Configuration configuration) {
        Context a = larkShareContainerActivity.mo189955a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
