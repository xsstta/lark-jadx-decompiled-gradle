package com.ss.android.lark.member_manage.impl.chat_admin;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatAdminActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo159596a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159597a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159598a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179022a(this, context);
    }

    /* renamed from: b */
    public void mo159599b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159600c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179020a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179024c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179021a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179023b(this);
    }

    /* renamed from: d */
    private final void m179025d() {
        ChatAdminFragment aVar = new ChatAdminFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m179025d();
    }

    /* renamed from: a */
    public static Resources m179021a(ChatAdminActivity chatAdminActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatAdminActivity);
        }
        return chatAdminActivity.mo159597a();
    }

    /* renamed from: c */
    public static AssetManager m179024c(ChatAdminActivity chatAdminActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatAdminActivity);
        }
        return chatAdminActivity.mo159600c();
    }

    /* renamed from: b */
    public static void m179023b(ChatAdminActivity chatAdminActivity) {
        chatAdminActivity.mo159599b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatAdminActivity chatAdminActivity2 = chatAdminActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatAdminActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m179022a(ChatAdminActivity chatAdminActivity, Context context) {
        chatAdminActivity.mo159598a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatAdminActivity);
        }
    }

    /* renamed from: a */
    public static Context m179020a(ChatAdminActivity chatAdminActivity, Configuration configuration) {
        Context a = chatAdminActivity.mo159596a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
