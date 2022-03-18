package com.ss.android.lark.search.impl.func.chatinside.detail.folderinside;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\n\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/detail/folderinside/FolderInsideSearchActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "checkValid", "", "extras", "Landroid/os/Bundle;", "onCreate", "", "savedInstanceState", "setupFragment", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FolderInsideSearchActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo182605a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182606a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182607a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m207135a(this, context);
    }

    /* renamed from: b */
    public void mo182608b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182609c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m207133a(this, configuration);
    }

    public AssetManager getAssets() {
        return m207138c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m207134a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m207137b(this);
    }

    /* renamed from: d */
    private final void m207139d() {
        FolderInsideSearchFragment aVar = new FolderInsideSearchFragment();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        aVar.setArguments(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, aVar, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m207134a(FolderInsideSearchActivity folderInsideSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderInsideSearchActivity);
        }
        return folderInsideSearchActivity.mo182606a();
    }

    /* renamed from: c */
    public static AssetManager m207138c(FolderInsideSearchActivity folderInsideSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderInsideSearchActivity);
        }
        return folderInsideSearchActivity.mo182609c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        if (!m207136a(intent.getExtras())) {
            finish();
        } else {
            m207139d();
        }
    }

    /* renamed from: b */
    public static void m207137b(FolderInsideSearchActivity folderInsideSearchActivity) {
        folderInsideSearchActivity.mo182608b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderInsideSearchActivity folderInsideSearchActivity2 = folderInsideSearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderInsideSearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m207136a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("extra.chat.id")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m207135a(FolderInsideSearchActivity folderInsideSearchActivity, Context context) {
        folderInsideSearchActivity.mo182607a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderInsideSearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m207133a(FolderInsideSearchActivity folderInsideSearchActivity, Configuration configuration) {
        Context a = folderInsideSearchActivity.mo182605a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
