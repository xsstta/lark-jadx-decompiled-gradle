package com.ss.android.lark.member_manage.impl.add_member;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AddGroupMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C44931a f113748a;

    /* renamed from: a */
    public Context mo158959a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo158960a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo158961a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m178070a(this, context);
    }

    /* renamed from: b */
    public void mo158962b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo158963c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m178067a(this, configuration);
    }

    public AssetManager getAssets() {
        return m178072c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m178068a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m178071b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f113748a.mo159038a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        KeyboardUtils.hideKeyboard(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m178069a(bundle);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        this.f113748a.onSaveInstanceState(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static Resources m178068a(AddGroupMemberActivity addGroupMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addGroupMemberActivity);
        }
        return addGroupMemberActivity.mo158960a();
    }

    /* renamed from: c */
    public static AssetManager m178072c(AddGroupMemberActivity addGroupMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addGroupMemberActivity);
        }
        return addGroupMemberActivity.mo158963c();
    }

    /* renamed from: b */
    public static void m178071b(AddGroupMemberActivity addGroupMemberActivity) {
        addGroupMemberActivity.mo158962b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddGroupMemberActivity addGroupMemberActivity2 = addGroupMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addGroupMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m178069a(Bundle bundle) {
        this.f113748a = new C44931a();
        Bundle extras = getIntent().getExtras();
        if (bundle != null) {
            extras.putSerializable("selectedIds", bundle.getSerializable("selectedIds"));
            extras.putString("department_id", bundle.getString("department_id"));
        }
        this.f113748a.setArguments(extras);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f113748a, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m178070a(AddGroupMemberActivity addGroupMemberActivity, Context context) {
        addGroupMemberActivity.mo158961a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addGroupMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m178067a(AddGroupMemberActivity addGroupMemberActivity, Configuration configuration) {
        Context a = addGroupMemberActivity.mo158959a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
