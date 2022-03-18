package com.ss.android.lark.ug.feat.add_friends;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.common.BackToHomeUtils;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\"\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\fH\u0014J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/feat/add_friends/AddRecFriendsActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "hasShowFragment", "", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "handlePermissionResult", "", "isGranted", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onStart", "openRecContactAddFragment", "triggerNext", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddRecFriendsActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f141681a = new Companion(null);

    /* renamed from: b */
    private boolean f141682b;

    /* renamed from: a */
    public Context mo195170a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo195172a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m223184a(this, context);
    }

    /* renamed from: b */
    public Resources mo195174b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo195175c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m223182a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo195177d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m223186c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m223183a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m223185b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/feat/add_friends/AddRecFriendsActivity$Companion;", "", "()V", "CONTACT_REC_TAG", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.feat.add_friends.AddRecFriendsActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo195171a() {
        finish();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    /* renamed from: e */
    private final void m223187e() {
        Fragment a = C57345a.m222261a().mo194661a(null, null, new View$OnClickListenerC57501c(this), new View$OnClickListenerC57502d(this));
        if (a == null) {
            mo195171a();
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(16908290, a, "contact_rec_tag").commitAllowingStateLoss();
        this.f141682b = true;
        OnboardingHitPoint.f99379a.mo141622f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStart() {
        boolean z;
        super.onStart();
        if (!this.f141682b) {
            if (ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo195173a(true);
            } else {
                new C51331a(this).mo176924c("android.permission.READ_CONTACTS").subscribe(new C57500b(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.feat.add_friends.AddRecFriendsActivity$c */
    public static final class View$OnClickListenerC57501c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddRecFriendsActivity f141684a;

        View$OnClickListenerC57501c(AddRecFriendsActivity addRecFriendsActivity) {
            this.f141684a = addRecFriendsActivity;
        }

        public final void onClick(View view) {
            this.f141684a.mo195171a();
            OnboardingHitPoint.f99379a.mo141626g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.feat.add_friends.AddRecFriendsActivity$d */
    public static final class View$OnClickListenerC57502d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddRecFriendsActivity f141685a;

        View$OnClickListenerC57502d(AddRecFriendsActivity addRecFriendsActivity) {
            this.f141685a = addRecFriendsActivity;
        }

        public final void onClick(View view) {
            this.f141685a.mo195171a();
            OnboardingHitPoint.f99379a.mo141629h();
        }
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (BackToHomeUtils.f141336a.mo194683a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: a */
    public static Resources m223183a(AddRecFriendsActivity addRecFriendsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addRecFriendsActivity);
        }
        return addRecFriendsActivity.mo195174b();
    }

    /* renamed from: c */
    public static AssetManager m223186c(AddRecFriendsActivity addRecFriendsActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addRecFriendsActivity);
        }
        return addRecFriendsActivity.mo195177d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.feat.add_friends.AddRecFriendsActivity$b */
    static final class C57500b<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AddRecFriendsActivity f141683a;

        C57500b(AddRecFriendsActivity addRecFriendsActivity) {
            this.f141683a = addRecFriendsActivity;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            OnboardingHitPoint.f99379a.mo141610c();
            UGApm.AddFriends.f141197a.mo194470a();
            AddRecFriendsActivity addRecFriendsActivity = this.f141683a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            addRecFriendsActivity.mo195173a(bool.booleanValue());
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
    public static void m223185b(AddRecFriendsActivity addRecFriendsActivity) {
        addRecFriendsActivity.mo195175c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddRecFriendsActivity addRecFriendsActivity2 = addRecFriendsActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addRecFriendsActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo195173a(boolean z) {
        if (z) {
            try {
                m223187e();
            } catch (Exception unused) {
                mo195171a();
            }
        } else {
            mo195171a();
        }
    }

    /* renamed from: a */
    public static void m223184a(AddRecFriendsActivity addRecFriendsActivity, Context context) {
        addRecFriendsActivity.mo195172a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addRecFriendsActivity);
        }
    }

    /* renamed from: a */
    public static Context m223182a(AddRecFriendsActivity addRecFriendsActivity, Configuration configuration) {
        Context a = addRecFriendsActivity.mo195170a(configuration);
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
