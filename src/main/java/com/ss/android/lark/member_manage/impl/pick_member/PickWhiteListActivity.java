package com.ss.android.lark.member_manage.impl.pick_member;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PickWhiteListActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f114302a = new Companion(null);

    /* renamed from: a */
    public Context mo159652a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159653a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159654a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179147a(this, context);
    }

    /* renamed from: b */
    public void mo159655b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159656c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179145a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179149c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179146a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179148b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListActivity$Companion;", "", "()V", "SELECTED_REQUEST_CODE", "", "TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.PickWhiteListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static Resources m179146a(PickWhiteListActivity pickWhiteListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickWhiteListActivity);
        }
        return pickWhiteListActivity.mo159653a();
    }

    /* renamed from: c */
    public static AssetManager m179149c(PickWhiteListActivity pickWhiteListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickWhiteListActivity);
        }
        return pickWhiteListActivity.mo159656c();
    }

    /* renamed from: b */
    public static void m179148b(PickWhiteListActivity pickWhiteListActivity) {
        pickWhiteListActivity.mo159655b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PickWhiteListActivity pickWhiteListActivity2 = pickWhiteListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pickWhiteListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        PickWhiteListFragment cVar = new PickWhiteListFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        cVar.setArguments(intent.getExtras());
        beginTransaction.add(16908290, cVar, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m179147a(PickWhiteListActivity pickWhiteListActivity, Context context) {
        pickWhiteListActivity.mo159654a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickWhiteListActivity);
        }
    }

    /* renamed from: a */
    public static Context m179145a(PickWhiteListActivity pickWhiteListActivity, Configuration configuration) {
        Context a = pickWhiteListActivity.mo159652a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
