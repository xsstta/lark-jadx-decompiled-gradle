package com.larksuite.component.blockit.hashtag.add;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/larksuite/component/blockit/hashtag/add/AddHashTagFragment;", "mIsAdd", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupFragment", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddHashTagActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private AddHashTagFragment f59519a;

    /* renamed from: b */
    private boolean f59520b = true;

    /* renamed from: a */
    public Context mo86439a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo86440a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo86441a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m87952a(this, context);
    }

    /* renamed from: b */
    public void mo86442b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo86443c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m87950a(this, configuration);
    }

    public AssetManager getAssets() {
        return m87954c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m87951a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m87953b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        AddHashTagFragment aVar = this.f59519a;
        if (aVar == null || !aVar.mo86446a()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f59519a = null;
        super.onDestroy();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (!this.f59520b) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        ActivityAnimationManager.AnimationConfig enterAnimationConfig = super.getEnterAnimationConfig();
        Intrinsics.checkExpressionValueIsNotNull(enterAnimationConfig, "super.getEnterAnimationConfig()");
        return enterAnimationConfig;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (this.f59520b) {
            return super.getExitAnimationConfig();
        }
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: d */
    private final void m87955d() {
        AddHashTagFragment aVar = new AddHashTagFragment();
        this.f59519a = aVar;
        if (aVar != null) {
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            aVar.setArguments(intent.getExtras());
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.add(16908290, aVar, (String) null);
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public static Resources m87951a(AddHashTagActivity addHashTagActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addHashTagActivity);
        }
        return addHashTagActivity.mo86440a();
    }

    /* renamed from: c */
    public static AssetManager m87954c(AddHashTagActivity addHashTagActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addHashTagActivity);
        }
        return addHashTagActivity.mo86443c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        boolean z = true;
        if (extras != null) {
            z = extras.getBoolean("extra.is.add.hash.tag", true);
        }
        this.f59520b = z;
        super.onCreate(bundle);
        m87955d();
    }

    /* renamed from: b */
    public static void m87953b(AddHashTagActivity addHashTagActivity) {
        addHashTagActivity.mo86442b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddHashTagActivity addHashTagActivity2 = addHashTagActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addHashTagActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m87952a(AddHashTagActivity addHashTagActivity, Context context) {
        addHashTagActivity.mo86441a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addHashTagActivity);
        }
    }

    /* renamed from: a */
    public static Context m87950a(AddHashTagActivity addHashTagActivity, Configuration configuration) {
        Context a = addHashTagActivity.mo86439a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AddHashTagFragment aVar = this.f59519a;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
