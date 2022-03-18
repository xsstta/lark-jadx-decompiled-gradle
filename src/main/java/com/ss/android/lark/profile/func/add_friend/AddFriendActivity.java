package com.ss.android.lark.profile.func.add_friend;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/AddFriendActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupFragment", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddFriendActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private AddFriendFragment f129611a;

    /* renamed from: a */
    public Context mo179045a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo179046a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo179047a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m202789a(this, context);
    }

    /* renamed from: b */
    public void mo179048b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo179049c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m202787a(this, configuration);
    }

    public AssetManager getAssets() {
        return m202791c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m202788a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m202790b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f129611a = null;
        super.onDestroy();
    }

    /* renamed from: d */
    private final void m202792d() {
        AddFriendFragment aVar = new AddFriendFragment();
        this.f129611a = aVar;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        AddFriendFragment aVar2 = this.f129611a;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        beginTransaction.add(16908290, aVar2, "AddFriendFragment");
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m202792d();
    }

    /* renamed from: a */
    public static Resources m202788a(AddFriendActivity addFriendActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addFriendActivity);
        }
        return addFriendActivity.mo179046a();
    }

    /* renamed from: c */
    public static AssetManager m202791c(AddFriendActivity addFriendActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addFriendActivity);
        }
        return addFriendActivity.mo179049c();
    }

    /* renamed from: b */
    public static void m202790b(AddFriendActivity addFriendActivity) {
        addFriendActivity.mo179048b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AddFriendActivity addFriendActivity2 = addFriendActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    addFriendActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m202789a(AddFriendActivity addFriendActivity, Context context) {
        addFriendActivity.mo179047a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(addFriendActivity);
        }
    }

    /* renamed from: a */
    public static Context m202787a(AddFriendActivity addFriendActivity, Configuration configuration) {
        Context a = addFriendActivity.mo179045a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AddFriendFragment aVar = this.f129611a;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
