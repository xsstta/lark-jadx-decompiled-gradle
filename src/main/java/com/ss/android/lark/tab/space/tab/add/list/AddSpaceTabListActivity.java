package com.ss.android.lark.tab.space.tab.add.list;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceTabListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "fragment", "Lcom/ss/android/lark/tab/space/tab/add/list/AddSpaceTabListFragment;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceTabListActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private AddSpaceTabListFragment f136562a;

    /* renamed from: a */
    public Context mo188594a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo188595a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo188596a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m214618a(this, context);
    }

    /* renamed from: b */
    public void mo188597b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo188598c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m214616a(this, configuration);
    }

    public AssetManager getAssets() {
        return m214620c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m214617a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m214619b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: a */
    public static Resources m214617a(AddSpaceTabListActivity addSpaceTabListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addSpaceTabListActivity);
        }
        return addSpaceTabListActivity.mo188595a();
    }

    /* renamed from: c */
    public static AssetManager m214620c(AddSpaceTabListActivity addSpaceTabListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addSpaceTabListActivity);
        }
        return addSpaceTabListActivity.mo188598c();
    }

    /* renamed from: b */
    public static void m214619b(AddSpaceTabListActivity addSpaceTabListActivity) {
        addSpaceTabListActivity.mo188597b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddSpaceTabListActivity addSpaceTabListActivity2 = addSpaceTabListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addSpaceTabListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AddSpaceTabListFragment cVar = new AddSpaceTabListFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        cVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().replace(16908290, cVar).commitAllowingStateLoss();
        this.f136562a = cVar;
    }

    /* renamed from: a */
    public static void m214618a(AddSpaceTabListActivity addSpaceTabListActivity, Context context) {
        addSpaceTabListActivity.mo188596a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addSpaceTabListActivity);
        }
    }

    /* renamed from: a */
    public static Context m214616a(AddSpaceTabListActivity addSpaceTabListActivity, Configuration configuration) {
        Context a = addSpaceTabListActivity.mo188594a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
