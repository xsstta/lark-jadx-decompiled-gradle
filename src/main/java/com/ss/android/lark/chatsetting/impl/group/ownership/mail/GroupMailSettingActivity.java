package com.ss.android.lark.chatsetting.impl.group.ownership.mail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupMailSettingActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f89730a = new Companion(null);

    /* renamed from: a */
    public Context mo128267a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128268a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128269a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135081a(this, context);
    }

    /* renamed from: b */
    public void mo128270b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128271c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135079a(this, configuration);
    }

    public AssetManager getAssets() {
        return m135083c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135080a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135082b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/mail/GroupMailSettingActivity$Companion;", "", "()V", "EXTRA_CHAT_ID", "", "EXTRA_CHAT_OWNER_ID", "EXTRA_IS_THREAD", "EXTRA_MAIL_ENABLE", "EXTRA_PERMISSION_TYPE", "TAG", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.mail.GroupMailSettingActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* renamed from: a */
    public static Resources m135080a(GroupMailSettingActivity groupMailSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupMailSettingActivity);
        }
        return groupMailSettingActivity.mo128268a();
    }

    /* renamed from: c */
    public static AssetManager m135083c(GroupMailSettingActivity groupMailSettingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupMailSettingActivity);
        }
        return groupMailSettingActivity.mo128271c();
    }

    /* renamed from: b */
    public static void m135082b(GroupMailSettingActivity groupMailSettingActivity) {
        groupMailSettingActivity.mo128270b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupMailSettingActivity groupMailSettingActivity2 = groupMailSettingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupMailSettingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        GroupMailSettingFragment aVar = new GroupMailSettingFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        beginTransaction.add(16908290, aVar, (String) null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static void m135081a(GroupMailSettingActivity groupMailSettingActivity, Context context) {
        groupMailSettingActivity.mo128269a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupMailSettingActivity);
        }
    }

    /* renamed from: a */
    public static Context m135079a(GroupMailSettingActivity groupMailSettingActivity, Configuration configuration) {
        Context a = groupMailSettingActivity.mo128267a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
