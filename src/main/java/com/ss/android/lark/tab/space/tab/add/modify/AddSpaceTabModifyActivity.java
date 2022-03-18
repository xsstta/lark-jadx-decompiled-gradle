package com.ss.android.lark.tab.space.tab.add.modify;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "fragment", "Lcom/ss/android/lark/tab/space/tab/add/modify/AddSpaceTabModifyFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddSpaceTabModifyActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private AddSpaceTabModifyFragment f136594a;

    /* renamed from: a */
    public Context mo188673a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo188674a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo188675a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m214660a(this, context);
    }

    /* renamed from: b */
    public void mo188676b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo188677c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m214658a(this, configuration);
    }

    public AssetManager getAssets() {
        return m214662c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m214659a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m214661b(this);
    }

    /* renamed from: a */
    public static Resources m214659a(AddSpaceTabModifyActivity addSpaceTabModifyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addSpaceTabModifyActivity);
        }
        return addSpaceTabModifyActivity.mo188674a();
    }

    /* renamed from: c */
    public static AssetManager m214662c(AddSpaceTabModifyActivity addSpaceTabModifyActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addSpaceTabModifyActivity);
        }
        return addSpaceTabModifyActivity.mo188677c();
    }

    /* renamed from: b */
    public static void m214661b(AddSpaceTabModifyActivity addSpaceTabModifyActivity) {
        addSpaceTabModifyActivity.mo188676b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddSpaceTabModifyActivity addSpaceTabModifyActivity2 = addSpaceTabModifyActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addSpaceTabModifyActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AddSpaceTabModifyFragment bVar = new AddSpaceTabModifyFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        bVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().replace(16908290, bVar).commitAllowingStateLoss();
        this.f136594a = bVar;
    }

    /* renamed from: a */
    public static void m214660a(AddSpaceTabModifyActivity addSpaceTabModifyActivity, Context context) {
        addSpaceTabModifyActivity.mo188675a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addSpaceTabModifyActivity);
        }
    }

    /* renamed from: a */
    public static Context m214658a(AddSpaceTabModifyActivity addSpaceTabModifyActivity, Configuration configuration) {
        Context a = addSpaceTabModifyActivity.mo188673a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
