package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

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
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/PrivacyBlockListFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PrivacyBlockListActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private PrivacyBlockListFragment f93106a;

    /* renamed from: a */
    public Context mo132484a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132485a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132486a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m141260a(this, context);
    }

    /* renamed from: b */
    public void mo132487b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132488c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m141258a(this, configuration);
    }

    public AssetManager getAssets() {
        return m141262c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m141259a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m141261b(this);
    }

    /* renamed from: d */
    private final void m141263d() {
        PrivacyBlockListFragment aVar = new PrivacyBlockListFragment();
        this.f93106a = aVar;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        PrivacyBlockListFragment aVar2 = this.f93106a;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        beginTransaction.add(16908290, aVar2, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        m141263d();
    }

    /* renamed from: a */
    public static Resources m141259a(PrivacyBlockListActivity privacyBlockListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacyBlockListActivity);
        }
        return privacyBlockListActivity.mo132485a();
    }

    /* renamed from: c */
    public static AssetManager m141262c(PrivacyBlockListActivity privacyBlockListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacyBlockListActivity);
        }
        return privacyBlockListActivity.mo132488c();
    }

    /* renamed from: b */
    public static void m141261b(PrivacyBlockListActivity privacyBlockListActivity) {
        privacyBlockListActivity.mo132487b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PrivacyBlockListActivity privacyBlockListActivity2 = privacyBlockListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    privacyBlockListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m141260a(PrivacyBlockListActivity privacyBlockListActivity, Context context) {
        privacyBlockListActivity.mo132486a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(privacyBlockListActivity);
        }
    }

    /* renamed from: a */
    public static Context m141258a(PrivacyBlockListActivity privacyBlockListActivity, Configuration configuration) {
        Context a = privacyBlockListActivity.mo132484a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrivacyBlockListFragment aVar = this.f93106a;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        aVar.onActivityResult(i, i2, intent);
    }
}
