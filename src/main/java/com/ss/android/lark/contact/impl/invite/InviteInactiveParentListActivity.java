package com.ss.android.lark.contact.impl.invite;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteInactiveParentListActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private InviteInactiveParentListFragment f92925a;

    /* renamed from: a */
    public Context mo132255a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132256a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132257a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m140888a(this, context);
    }

    /* renamed from: b */
    public void mo132258b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132259c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m140886a(this, configuration);
    }

    public AssetManager getAssets() {
        return m140890c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m140887a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m140889b(this);
    }

    /* renamed from: d */
    private final void m140891d() {
        InviteInactiveParentListFragment bVar = new InviteInactiveParentListFragment();
        this.f92925a = bVar;
        if (bVar != null) {
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            bVar.setArguments(intent.getExtras());
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.add(16908290, bVar, (String) null);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m140891d();
    }

    /* renamed from: a */
    public static Resources m140887a(InviteInactiveParentListActivity inviteInactiveParentListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteInactiveParentListActivity);
        }
        return inviteInactiveParentListActivity.mo132256a();
    }

    /* renamed from: c */
    public static AssetManager m140890c(InviteInactiveParentListActivity inviteInactiveParentListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteInactiveParentListActivity);
        }
        return inviteInactiveParentListActivity.mo132259c();
    }

    /* renamed from: b */
    public static void m140889b(InviteInactiveParentListActivity inviteInactiveParentListActivity) {
        inviteInactiveParentListActivity.mo132258b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteInactiveParentListActivity inviteInactiveParentListActivity2 = inviteInactiveParentListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteInactiveParentListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m140888a(InviteInactiveParentListActivity inviteInactiveParentListActivity, Context context) {
        inviteInactiveParentListActivity.mo132257a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteInactiveParentListActivity);
        }
    }

    /* renamed from: a */
    public static Context m140886a(InviteInactiveParentListActivity inviteInactiveParentListActivity, Configuration configuration) {
        Context a = inviteInactiveParentListActivity.mo132255a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InviteInactiveParentListFragment bVar = this.f92925a;
        if (bVar != null) {
            bVar.onActivityResult(i, i2, intent);
        }
    }
}
