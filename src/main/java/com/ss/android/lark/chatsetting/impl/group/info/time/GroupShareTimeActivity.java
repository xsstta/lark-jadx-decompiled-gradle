package com.ss.android.lark.chatsetting.impl.group.info.time;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeFragment;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupShareTimeActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private GroupShareTimeFragment f89498a;

    /* renamed from: a */
    public Context mo128031a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128032a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128033a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134759a(this, context);
    }

    /* renamed from: b */
    public void mo128034b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128035c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134757a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134761c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134758a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134760b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        GroupShareTimeFragment cVar = this.f89498a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        cVar.mo128055a();
    }

    /* renamed from: d */
    private final void m134762d() {
        GroupShareTimeFragment cVar = new GroupShareTimeFragment();
        this.f89498a = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        cVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        GroupShareTimeFragment cVar2 = this.f89498a;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        beginTransaction.add(16908290, cVar2, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m134762d();
    }

    /* renamed from: a */
    public static Resources m134758a(GroupShareTimeActivity groupShareTimeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupShareTimeActivity);
        }
        return groupShareTimeActivity.mo128032a();
    }

    /* renamed from: c */
    public static AssetManager m134761c(GroupShareTimeActivity groupShareTimeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupShareTimeActivity);
        }
        return groupShareTimeActivity.mo128035c();
    }

    /* renamed from: b */
    public static void m134760b(GroupShareTimeActivity groupShareTimeActivity) {
        groupShareTimeActivity.mo128034b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupShareTimeActivity groupShareTimeActivity2 = groupShareTimeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupShareTimeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m134759a(GroupShareTimeActivity groupShareTimeActivity, Context context) {
        groupShareTimeActivity.mo128033a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupShareTimeActivity);
        }
    }

    /* renamed from: a */
    public static Context m134757a(GroupShareTimeActivity groupShareTimeActivity, Configuration configuration) {
        Context a = groupShareTimeActivity.mo128031a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
