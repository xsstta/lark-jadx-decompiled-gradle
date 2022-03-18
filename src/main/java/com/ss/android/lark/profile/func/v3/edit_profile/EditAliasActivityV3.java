package com.ss.android.lark.profile.func.v3.edit_profile;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0004H\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasActivityV3;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditAliasActivityV3 extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f130333a = new Companion(null);

    /* renamed from: a */
    public Context mo179930a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179931a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179932a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m204048a(this, context);
    }

    /* renamed from: b */
    public void mo179933b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179934c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m204046a(this, configuration);
    }

    public AssetManager getAssets() {
        return m204050c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m204047a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m204049b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasActivityV3$Companion;", "", "()V", "EXTRA_ALIAS_DESCRIPTION", "", "EXTRA_ALIAS_IMAGE", "EXTRA_ALIAS_NAME", "EXTRA_USER_ID", "EXTRA_USER_NAME", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.EditAliasActivityV3$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        KeyboardUtils.hideKeyboard(this);
        super.onDestroy();
    }

    /* renamed from: a */
    public static Resources m204047a(EditAliasActivityV3 editAliasActivityV3) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAliasActivityV3);
        }
        return editAliasActivityV3.mo179931a();
    }

    /* renamed from: c */
    public static AssetManager m204050c(EditAliasActivityV3 editAliasActivityV3) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAliasActivityV3);
        }
        return editAliasActivityV3.mo179934c();
    }

    /* renamed from: b */
    public static void m204049b(EditAliasActivityV3 editAliasActivityV3) {
        editAliasActivityV3.mo179933b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            EditAliasActivityV3 editAliasActivityV32 = editAliasActivityV3;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    editAliasActivityV32.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EditAliasFragmentV3 aVar = new EditAliasFragmentV3();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, aVar, "EditAliasFragmentV3").commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m204048a(EditAliasActivityV3 editAliasActivityV3, Context context) {
        editAliasActivityV3.mo179932a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(editAliasActivityV3);
        }
    }

    /* renamed from: a */
    public static Context m204046a(EditAliasActivityV3 editAliasActivityV3, Configuration configuration) {
        Context a = editAliasActivityV3.mo179930a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("EditAliasFragmentV3");
        if (findFragmentByTag != null) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }
}
