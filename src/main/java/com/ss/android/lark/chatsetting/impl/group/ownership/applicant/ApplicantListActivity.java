package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ApplicantListActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f89542a = new Companion(null);

    /* renamed from: a */
    public Context mo128074a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128075a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128076a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134817a(this, context);
    }

    /* renamed from: b */
    public void mo128077b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128078c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134815a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134819c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134816a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134818b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListActivity$Companion;", "", "()V", "KEY_PARAMS_CHAT_ID", "", "KEY_PARAMS_IS_THREAD", "TAG", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static Resources m134816a(ApplicantListActivity applicantListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applicantListActivity);
        }
        return applicantListActivity.mo128075a();
    }

    /* renamed from: c */
    public static AssetManager m134819c(ApplicantListActivity applicantListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applicantListActivity);
        }
        return applicantListActivity.mo128078c();
    }

    /* renamed from: b */
    public static void m134818b(ApplicantListActivity applicantListActivity) {
        applicantListActivity.mo128077b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ApplicantListActivity applicantListActivity2 = applicantListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    applicantListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        if (TextUtils.isEmpty(getIntent().getStringExtra("key_params_chat_id"))) {
            finish();
            return;
        }
        ApplicantListFragment cVar = new ApplicantListFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        cVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, cVar, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m134817a(ApplicantListActivity applicantListActivity, Context context) {
        applicantListActivity.mo128076a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(applicantListActivity);
        }
    }

    /* renamed from: a */
    public static Context m134815a(ApplicantListActivity applicantListActivity, Configuration configuration) {
        Context a = applicantListActivity.mo128074a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
