package com.ss.android.lark.ug.dyflow.steps.invite;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.dyflow.common.BaseFlowAct;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.steps.StepsUtils;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/invite/InviteLoadingActivity;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate2", "savedInstanceState", "Landroid/os/Bundle;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteLoadingActivity extends BaseFlowAct {
    /* renamed from: a */
    public Context mo194997a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo194998a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m222908a(this, context);
    }

    /* renamed from: b */
    public Resources mo194999b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo195000c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m222906a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo195002d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m222910c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m222907a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m222909b(this);
    }

    /* renamed from: a */
    public static Resources m222907a(InviteLoadingActivity inviteLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteLoadingActivity);
        }
        return inviteLoadingActivity.mo194999b();
    }

    /* renamed from: c */
    public static AssetManager m222910c(InviteLoadingActivity inviteLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteLoadingActivity);
        }
        return inviteLoadingActivity.mo195002d();
    }

    /* renamed from: b */
    public static void m222909b(InviteLoadingActivity inviteLoadingActivity) {
        inviteLoadingActivity.mo195000c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteLoadingActivity inviteLoadingActivity2 = inviteLoadingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteLoadingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowAct
    /* renamed from: a */
    public void mo194722a(Bundle bundle) {
        FlowStepData a = mo194720a();
        if (a != null) {
            StepsUtils.f141524a.mo194968a(this, a.mo194841e("invite_next"));
        }
    }

    /* renamed from: a */
    public static void m222908a(InviteLoadingActivity inviteLoadingActivity, Context context) {
        inviteLoadingActivity.mo194998a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteLoadingActivity);
        }
    }

    /* renamed from: a */
    public static Context m222906a(InviteLoadingActivity inviteLoadingActivity, Configuration configuration) {
        Context a = inviteLoadingActivity.mo194997a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BaseFlowAct.m222605a(this, "invite_next", false, 2, null);
        finish();
    }
}
