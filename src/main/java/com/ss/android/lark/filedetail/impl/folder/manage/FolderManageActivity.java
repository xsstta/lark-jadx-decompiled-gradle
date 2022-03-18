package com.ss.android.lark.filedetail.impl.folder.manage;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageFragment;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FolderManageActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private FolderManageFragment f98119a;

    /* renamed from: a */
    public Context mo139850a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo139851a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo139852a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m150426a(this, context);
    }

    /* renamed from: b */
    public void mo139853b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo139854c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m150424a(this, configuration);
    }

    public AssetManager getAssets() {
        return m150428c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m150425a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m150427b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        FolderManageFragment aVar = this.f98119a;
        if (aVar != null) {
            aVar.mo139879a();
        }
    }

    /* renamed from: d */
    private final void m150429d() {
        FolderManageFragment aVar = new FolderManageFragment();
        this.f98119a = aVar;
        if (aVar != null) {
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            aVar.setArguments(intent.getExtras());
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
            beginTransaction.add(16908290, aVar, (String) null);
            beginTransaction.commitNowAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m150429d();
    }

    /* renamed from: a */
    public static Resources m150425a(FolderManageActivity folderManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderManageActivity);
        }
        return folderManageActivity.mo139851a();
    }

    /* renamed from: c */
    public static AssetManager m150428c(FolderManageActivity folderManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderManageActivity);
        }
        return folderManageActivity.mo139854c();
    }

    /* renamed from: b */
    public static void m150427b(FolderManageActivity folderManageActivity) {
        folderManageActivity.mo139853b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderManageActivity folderManageActivity2 = folderManageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderManageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m150426a(FolderManageActivity folderManageActivity, Context context) {
        folderManageActivity.mo139852a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderManageActivity);
        }
    }

    /* renamed from: a */
    public static Context m150424a(FolderManageActivity folderManageActivity, Configuration configuration) {
        Context a = folderManageActivity.mo139850a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
