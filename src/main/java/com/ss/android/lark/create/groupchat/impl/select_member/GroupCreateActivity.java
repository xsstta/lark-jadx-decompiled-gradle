package com.ss.android.lark.create.groupchat.impl.select_member;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupExtraParams;
import com.ss.android.lark.create.groupchat.impl.statistics.CreateGroupHitPointNew;
import com.ss.android.lark.create.groupchat.impl.type.fragment.GroupCreateFgUtils;
import com.ss.android.lark.create.groupchat.impl.util.FragmentStateHelper;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class GroupCreateActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C36392f f93852a;

    /* renamed from: b */
    private FragmentStateHelper f93853b;

    /* renamed from: a */
    public Context mo134170a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo134171a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo134172a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m143381a(this, context);
    }

    /* renamed from: b */
    public void mo134173b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo134174c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m143379a(this, configuration);
    }

    public AssetManager getAssets() {
        return m143383c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m143380a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m143382b(this);
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
        C36392f fVar = this.f93852a;
        if (fVar != null) {
            fVar.mo134192a();
        }
    }

    /* renamed from: a */
    public static Resources m143380a(GroupCreateActivity groupCreateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupCreateActivity);
        }
        return groupCreateActivity.mo134171a();
    }

    /* renamed from: c */
    public static AssetManager m143383c(GroupCreateActivity groupCreateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupCreateActivity);
        }
        return groupCreateActivity.mo134174c();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        this.f93852a.mo134194b();
        bundle.putBundle("key_state_helper", this.f93853b.mo133832a());
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    public static void m143382b(GroupCreateActivity groupCreateActivity) {
        groupCreateActivity.mo134173b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupCreateActivity groupCreateActivity2 = groupCreateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupCreateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        CreateGroupExtraParams.Source source;
        super.onCreate(bundle);
        this.f93853b = new FragmentStateHelper();
        if (bundle != null) {
            this.f93853b.mo133833a(bundle.getBundle("key_state_helper"));
        }
        C36392f fVar = new C36392f();
        this.f93852a = fVar;
        fVar.mo134193a(this.f93853b);
        this.f93852a.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f93852a).commitAllowingStateLoss();
        boolean equals = TextUtils.equals(getIntent().getExtras().getString(ShareHitPoint.f121868c), "forward");
        if (equals) {
            source = CreateGroupExtraParams.Source.FROM_FORWARD;
        } else {
            source = CreateGroupExtraParams.Source.PLUS;
        }
        CreateGroupHitPointNew.f93887a.mo134199a(true, GroupCreateFgUtils.f93898a.mo134236a(), true, false, equals, (IParam) source);
    }

    /* renamed from: a */
    public static void m143381a(GroupCreateActivity groupCreateActivity, Context context) {
        groupCreateActivity.mo134172a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupCreateActivity);
        }
    }

    /* renamed from: a */
    public static Context m143379a(GroupCreateActivity groupCreateActivity, Configuration configuration) {
        Context a = groupCreateActivity.mo134170a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
