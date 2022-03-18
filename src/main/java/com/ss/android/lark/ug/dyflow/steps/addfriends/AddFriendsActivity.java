package com.ss.android.lark.ug.dyflow.steps.addfriends;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.dyflow.common.BaseFlowAct;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\"\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/addfriends/AddFriendsActivity;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "()V", "hasShowFragment", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "handlePermissionResult", "", "isGranted", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate2", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "openRecContactAddFragment", "triggerNext", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddFriendsActivity extends BaseFlowAct {

    /* renamed from: b */
    public static final Companion f141527b = new Companion(null);

    /* renamed from: c */
    private boolean f141528c;

    /* renamed from: a */
    public Context mo194975a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo194976a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.ug.dyflow.common.BaseFlowAct
    /* renamed from: a */
    public void mo194722a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m222867a(this, context);
    }

    /* renamed from: c */
    public Resources mo194979c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m222865a(this, configuration);
    }

    /* renamed from: d */
    public void mo194981d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo194982e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m222869c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m222866a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m222868b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/addfriends/AddFriendsActivity$Companion;", "", "()V", "CONTACT_REC_TAG", "", "TAG", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.addfriends.AddFriendsActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    /* renamed from: b */
    public final void mo194978b() {
        finish();
        mo194723a("add_friends_skip", true);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        boolean z;
        super.onStart();
        if (!this.f141528c) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo194977a(true);
            } else {
                new C51331a(this).mo176924c("android.permission.READ_CONTACTS").subscribe(new C57447b(this));
            }
        }
    }

    /* renamed from: f */
    private final void m222870f() {
        String str;
        FlowStepData a = mo194720a();
        String str2 = null;
        if (a != null) {
            str = a.mo194838d("add_friends_title");
        } else {
            str = null;
        }
        FlowStepData a2 = mo194720a();
        if (a2 != null) {
            str2 = a2.mo194841e("add_friends_skip");
        }
        Fragment a3 = C57345a.m222261a().mo194661a(str, str2, new View$OnClickListenerC57448c(this), new View$OnClickListenerC57449d(this));
        if (a3 == null) {
            mo194978b();
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(16908290, a3, "contact_rec_tag").commitAllowingStateLoss();
        this.f141528c = true;
        OnboardingHitPoint.f99379a.mo141622f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.addfriends.AddFriendsActivity$c */
    public static final class View$OnClickListenerC57448c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFriendsActivity f141530a;

        View$OnClickListenerC57448c(AddFriendsActivity addFriendsActivity) {
            this.f141530a = addFriendsActivity;
        }

        public final void onClick(View view) {
            this.f141530a.mo194978b();
            OnboardingHitPoint.f99379a.mo141626g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.addfriends.AddFriendsActivity$d */
    public static final class View$OnClickListenerC57449d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFriendsActivity f141531a;

        View$OnClickListenerC57449d(AddFriendsActivity addFriendsActivity) {
            this.f141531a = addFriendsActivity;
        }

        public final void onClick(View view) {
            this.f141531a.mo194978b();
            OnboardingHitPoint.f99379a.mo141629h();
        }
    }

    /* renamed from: a */
    public static Resources m222866a(AddFriendsActivity addFriendsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addFriendsActivity);
        }
        return addFriendsActivity.mo194979c();
    }

    /* renamed from: c */
    public static AssetManager m222869c(AddFriendsActivity addFriendsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addFriendsActivity);
        }
        return addFriendsActivity.mo194982e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.addfriends.AddFriendsActivity$b */
    static final class C57447b<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddFriendsActivity f141529a;

        C57447b(AddFriendsActivity addFriendsActivity) {
            this.f141529a = addFriendsActivity;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            OnboardingHitPoint.f99379a.mo141610c();
            UGApm.AddFriends.f141197a.mo194470a();
            AddFriendsActivity addFriendsActivity = this.f141529a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            addFriendsActivity.mo194977a(bool.booleanValue());
            if (bool.booleanValue()) {
                OnboardingHitPoint.f99379a.mo141614d();
                UGApm.AddFriends.f141197a.mo194471b();
                return;
            }
            OnboardingHitPoint.f99379a.mo141618e();
            UGApm.AddFriends.f141197a.mo194472c();
        }
    }

    /* renamed from: b */
    public static void m222868b(AddFriendsActivity addFriendsActivity) {
        addFriendsActivity.mo194981d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddFriendsActivity addFriendsActivity2 = addFriendsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addFriendsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo194977a(boolean z) {
        if (z) {
            try {
                m222870f();
            } catch (Exception unused) {
                mo194978b();
            }
        } else {
            mo194978b();
        }
    }

    /* renamed from: a */
    public static void m222867a(AddFriendsActivity addFriendsActivity, Context context) {
        addFriendsActivity.mo194976a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addFriendsActivity);
        }
    }

    /* renamed from: a */
    public static Context m222865a(AddFriendsActivity addFriendsActivity, Configuration configuration) {
        Context a = addFriendsActivity.mo194975a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("contact_rec_tag");
        if (findFragmentByTag != null) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }
}
