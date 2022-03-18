package com.ss.android.lark.ug.dyflow.steps.inviteguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.common.C57396d;
import com.ss.android.lark.ug.dyflow.common.BaseFlowAct;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.InviteGuideModel;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.InviteGuidePresenter;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.InviteGuideView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/InviteGuideActivity;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "()V", "hitFrom", "", "presenter", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter;", "onCreate2", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "PresenterDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteGuideActivity extends BaseFlowAct {

    /* renamed from: c */
    public static final Companion f141547c = new Companion(null);

    /* renamed from: b */
    public String f141548b;

    /* renamed from: d */
    private InviteGuidePresenter f141549d;

    /* renamed from: a */
    public Context mo195004a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo195005a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m222921a(this, context);
    }

    /* renamed from: b */
    public Resources mo195006b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo195007c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m222919a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo195009d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m222923c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m222920a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m222922b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/InviteGuideActivity$Companion;", "", "()V", "HIT_FROM", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.InviteGuideActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/InviteGuideActivity$PresenterDependency;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct$DefaultFlowStepResDependency;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/mvp/InviteGuidePresenter$IPresenterDependency;", "(Lcom/ss/android/lark/ug/dyflow/steps/inviteguide/InviteGuideActivity;)V", "getHitFrom", "", "trustedEmailDomain", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.inviteguide.InviteGuideActivity$b */
    private final class PresenterDependency extends BaseFlowAct.DefaultFlowStepResDependency implements InviteGuidePresenter.IPresenterDependency {
        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.InviteGuidePresenter.IPresenterDependency
        /* renamed from: a */
        public String mo195011a() {
            return InviteGuideActivity.this.f141548b;
        }

        @Override // com.ss.android.lark.ug.dyflow.steps.inviteguide.mvp.InviteGuidePresenter.IPresenterDependency
        /* renamed from: b */
        public String mo195012b() {
            return InviteGuideActivity.this.mo194721a("trusted_mail_domain");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterDependency() {
            super();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        InviteGuidePresenter cVar = this.f141549d;
        if (cVar != null) {
            cVar.destroy();
        }
        C57396d.m222525a((Activity) this);
    }

    /* renamed from: a */
    public static Resources m222920a(InviteGuideActivity inviteGuideActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteGuideActivity);
        }
        return inviteGuideActivity.mo195006b();
    }

    /* renamed from: c */
    public static AssetManager m222923c(InviteGuideActivity inviteGuideActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteGuideActivity);
        }
        return inviteGuideActivity.mo195009d();
    }

    /* renamed from: b */
    public static void m222922b(InviteGuideActivity inviteGuideActivity) {
        inviteGuideActivity.mo195007c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteGuideActivity inviteGuideActivity2 = inviteGuideActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteGuideActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowAct
    /* renamed from: a */
    public void mo194722a(Bundle bundle) {
        String str;
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("hit_from");
        } else {
            str = null;
        }
        this.f141548b = str;
        InviteGuideModel bVar = new InviteGuideModel();
        InviteGuideView dVar = new InviteGuideView(this);
        InviteGuidePresenter cVar = new InviteGuidePresenter(this, new PresenterDependency(), bVar, dVar);
        cVar.create();
        setContentView(dVar);
        this.f141549d = cVar;
    }

    /* renamed from: a */
    public static void m222921a(InviteGuideActivity inviteGuideActivity, Context context) {
        inviteGuideActivity.mo195005a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteGuideActivity);
        }
    }

    /* renamed from: a */
    public static Context m222919a(InviteGuideActivity inviteGuideActivity, Configuration configuration) {
        Context a = inviteGuideActivity.mo195004a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
