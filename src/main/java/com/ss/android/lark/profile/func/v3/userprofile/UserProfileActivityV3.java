package com.ss.android.lark.profile.func.v3.userprofile;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.core.os.C0796b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileActivityV3;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "bindFragmentToThis", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
@AndroidEntryPoint
public final class UserProfileActivityV3 extends Hilt_UserProfileActivityV3 {

    /* renamed from: a */
    public static final Companion f130357a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final Bundle m204078a(UserCustomStatus userCustomStatus) {
        return f130357a.mo179959a(userCustomStatus);
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m204081a(Bundle bundle) {
        return f130357a.mo179960a(bundle);
    }

    /* renamed from: a */
    public Context mo179952a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo179953a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m204080a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m204076a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo179955d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo179956e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo179957f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m204083c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m204077a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m204082b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileActivityV3$Companion;", "", "()V", "FRAGMENT_TAG", "", "KEY_USER_OPENED_CUSTOM", "generateBundle", "Landroid/os/Bundle;", "openedStatus", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "support", "", "bundle", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.UserProfileActivityV3$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Bundle mo179959a(UserCustomStatus userCustomStatus) {
            return C0796b.m3875a(TuplesKt.to(UpdateKey.STATUS, userCustomStatus));
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo179960a(Bundle bundle) {
            boolean z;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            String string = bundle.getString("param_key_user_id");
            String string2 = bundle.getString("param_key_token");
            String str = string;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str2 = string2;
                if (str2 == null || str2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("UserProfileFragmentV3");
        if (!(findFragmentByTag instanceof BaseFragment)) {
            findFragmentByTag = null;
        }
        BaseFragment baseFragment = (BaseFragment) findFragmentByTag;
        if (baseFragment != null) {
            baseFragment.finish();
        }
        super.onBackPressed();
    }

    /* renamed from: a */
    public static Resources m204077a(UserProfileActivityV3 userProfileActivityV3) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userProfileActivityV3);
        }
        return userProfileActivityV3.mo179955d();
    }

    /* renamed from: c */
    public static AssetManager m204083c(UserProfileActivityV3 userProfileActivityV3) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userProfileActivityV3);
        }
        return userProfileActivityV3.mo179957f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        m204079a(this, new UserProfileFragmentV3());
    }

    /* renamed from: b */
    public static void m204082b(UserProfileActivityV3 userProfileActivityV3) {
        userProfileActivityV3.mo179956e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            UserProfileActivityV3 userProfileActivityV32 = userProfileActivityV3;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    userProfileActivityV32.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m204080a(UserProfileActivityV3 userProfileActivityV3, Context context) {
        userProfileActivityV3.mo179953a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(userProfileActivityV3);
        }
    }

    /* renamed from: a */
    public static Context m204076a(UserProfileActivityV3 userProfileActivityV3, Configuration configuration) {
        Context a = userProfileActivityV3.mo179952a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final void m204079a(FragmentActivity fragmentActivity, Fragment fragment) {
        Intent intent = fragmentActivity.getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        fragment.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, fragment, "UserProfileFragmentV3");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("UserProfileFragmentV3");
        if (findFragmentByTag != null) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }
}
