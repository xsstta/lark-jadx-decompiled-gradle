package com.ss.android.lark.contact.impl.setting.one_way_contact.permission;

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
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatPermissionActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo132529a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132530a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132531a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m141317a(this, context);
    }

    /* renamed from: b */
    public void mo132532b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132533c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m141315a(this, configuration);
    }

    public AssetManager getAssets() {
        return m141319c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m141316a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m141318b(this);
    }

    /* renamed from: d */
    private final void m141320d() {
        ChatPermissionFragment aVar = new ChatPermissionFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m141320d();
    }

    /* renamed from: a */
    public static Resources m141316a(ChatPermissionActivity chatPermissionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatPermissionActivity);
        }
        return chatPermissionActivity.mo132530a();
    }

    /* renamed from: c */
    public static AssetManager m141319c(ChatPermissionActivity chatPermissionActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatPermissionActivity);
        }
        return chatPermissionActivity.mo132533c();
    }

    /* renamed from: b */
    public static void m141318b(ChatPermissionActivity chatPermissionActivity) {
        chatPermissionActivity.mo132532b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatPermissionActivity chatPermissionActivity2 = chatPermissionActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatPermissionActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m141317a(ChatPermissionActivity chatPermissionActivity, Context context) {
        chatPermissionActivity.mo132531a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatPermissionActivity);
        }
    }

    /* renamed from: a */
    public static Context m141315a(ChatPermissionActivity chatPermissionActivity, Configuration configuration) {
        Context a = chatPermissionActivity.mo132529a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
