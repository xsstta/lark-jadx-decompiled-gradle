package com.ss.android.lark.guide.biz.onboarding.tour.page.member;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.biz.onboarding.tour.page.member.AddTeamMemberPresenter;
import com.ss.android.lark.guide.biz.onboarding.tour.page.member.IAddTeamMemberContract;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.common.C57396d;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000eH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "from", "", "from$annotations", "hitFrom", "presenter", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "PresenterDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddTeamMemberActivity extends BaseFragmentActivity {

    /* renamed from: c */
    public static final Companion f99237c = new Companion(null);

    /* renamed from: a */
    public String f99238a = "unknown";

    /* renamed from: b */
    public String f99239b;

    /* renamed from: d */
    private AddTeamMemberPresenter f99240d;

    /* renamed from: a */
    public Context mo141440a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo141441a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo141442a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m152350a(this, context);
    }

    /* renamed from: b */
    public void mo141443b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo141444c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m152348a(this, configuration);
    }

    public AssetManager getAssets() {
        return m152352c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m152349a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m152351b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberActivity$Companion;", "", "()V", "HIT_FROM", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.AddTeamMemberActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberActivity$PresenterDependency;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberPresenter$IPresenterDependency;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/member/AddTeamMemberActivity;)V", "attachToParent", "", "view", "Landroid/view/View;", "getFrom", "", "getHitFrom", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.member.AddTeamMemberActivity$b */
    private final class PresenterDependency implements AddTeamMemberPresenter.IPresenterDependency {
        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.AddTeamMemberPresenter.IPresenterDependency
        /* renamed from: a */
        public String mo141447a() {
            return AddTeamMemberActivity.this.f99238a;
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.AddTeamMemberPresenter.IPresenterDependency
        /* renamed from: b */
        public String mo141449b() {
            return AddTeamMemberActivity.this.f99239b;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterDependency() {
        }

        @Override // com.ss.android.lark.guide.biz.onboarding.tour.page.member.AddTeamMemberPresenter.IPresenterDependency
        /* renamed from: a */
        public void mo141448a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            AddTeamMemberActivity.this.setContentView(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        AddTeamMemberPresenter bVar = this.f99240d;
        if (bVar != null) {
            bVar.destroy();
        }
        C57396d.m222525a((Activity) this);
    }

    /* renamed from: a */
    public static Resources m152349a(AddTeamMemberActivity addTeamMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addTeamMemberActivity);
        }
        return addTeamMemberActivity.mo141441a();
    }

    /* renamed from: c */
    public static AssetManager m152352c(AddTeamMemberActivity addTeamMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addTeamMemberActivity);
        }
        return addTeamMemberActivity.mo141444c();
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AddTeamMemberPresenter bVar = this.f99240d;
        if (bVar == null || !bVar.mo141460a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: b */
    public static void m152351b(AddTeamMemberActivity addTeamMemberActivity) {
        addTeamMemberActivity.mo141443b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddTeamMemberActivity addTeamMemberActivity2 = addTeamMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addTeamMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("from")) == null) {
            str = "unknown";
        }
        this.f99238a = str;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            str2 = intent2.getStringExtra("hit_from");
        } else {
            str2 = null;
        }
        this.f99239b = str2;
        IAddTeamMemberContract.IAddTeamMemberModel a = AddTeamMemberModel.f99242a.mo141454a(this.f99238a);
        if (a != null) {
            AddTeamMemberPresenter bVar = new AddTeamMemberPresenter(this, a, new AddTeamMemberView(this), new PresenterDependency());
            bVar.create();
            this.f99240d = bVar;
            return;
        }
        finish();
    }

    /* renamed from: a */
    public static void m152350a(AddTeamMemberActivity addTeamMemberActivity, Context context) {
        addTeamMemberActivity.mo141442a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addTeamMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m152348a(AddTeamMemberActivity addTeamMemberActivity, Configuration configuration) {
        Context a = addTeamMemberActivity.mo141440a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AddTeamMemberPresenter bVar = this.f99240d;
        if (bVar != null) {
            bVar.mo141459a(i, i2, intent);
        }
    }
}
