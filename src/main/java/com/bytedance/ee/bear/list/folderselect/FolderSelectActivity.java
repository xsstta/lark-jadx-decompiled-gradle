package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folderselect.search.SearchFolderFragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FolderSelectActivity extends BaseActivity implements AbstractC8402d {

    /* renamed from: a */
    private DocOperateBean f22633a;

    /* renamed from: b */
    private C8412h f22634b;

    /* renamed from: c */
    private String f22635c;

    /* renamed from: d */
    private String f22636d;

    /* renamed from: e */
    private boolean f22637e;

    /* renamed from: f */
    private boolean f22638f;

    /* renamed from: a */
    public Context mo32825a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo32829a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m34758a(this, context);
    }

    /* renamed from: b */
    public Resources mo32830b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo32831c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m34756a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo32833d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m34760c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m34757a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m34759b(this);
    }

    public void finish() {
        super.finish();
        DocOperateBean docOperateBean = this.f22633a;
        if (docOperateBean != null && docOperateBean.mo20985k()) {
            overridePendingTransition(0, R.anim.facade_slide_bottom_out);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() >= 1) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: e */
    private void m34761e() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f22633a = (DocOperateBean) intent.getParcelableExtra("EXTRA_OPERATE_BEAN");
            this.f22635c = intent.getStringExtra("extra_root_title");
            this.f22636d = intent.getStringExtra("extra_operate_text");
            this.f22638f = intent.getBooleanExtra("extra_show_recent_folder", true);
            this.f22637e = intent.getBooleanExtra("extra_disable_create_folder", false);
            if (this.f22633a == null) {
                this.f22633a = new DocOperateBean();
            }
        }
    }

    /* renamed from: f */
    private void m34762f() {
        if (this.f22634b == null) {
            this.f22634b = C8412h.m34840a(this, this.f22633a, this.f22635c, this.f22638f);
        }
        getSupportFragmentManager().beginTransaction().add(16908290, this.f22634b).commitAllowingStateLoss();
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8402d
    /* renamed from: a */
    public void mo32826a() {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(16908290, SearchFolderFragment.m34961a(this, this.f22633a)).addToBackStack(null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m34757a(FolderSelectActivity folderSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderSelectActivity);
        }
        return folderSelectActivity.mo32830b();
    }

    /* renamed from: c */
    public static AssetManager m34760c(FolderSelectActivity folderSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderSelectActivity);
        }
        return folderSelectActivity.mo32833d();
    }

    /* renamed from: b */
    public static void m34759b(FolderSelectActivity folderSelectActivity) {
        folderSelectActivity.mo32831c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderSelectActivity folderSelectActivity2 = folderSelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderSelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        m34761e();
        m34762f();
    }

    /* renamed from: a */
    public static void m34758a(FolderSelectActivity folderSelectActivity, Context context) {
        folderSelectActivity.mo32829a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderSelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m34756a(FolderSelectActivity folderSelectActivity, Configuration configuration) {
        Context a = folderSelectActivity.mo32825a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8402d
    /* renamed from: a */
    public void mo32827a(int i, String str, String str2, boolean z) {
        int i2;
        if (SpaceFeatureGatingV2.m32622a()) {
            i2 = FolderVersion.getNewShareFolderOwnerType();
        } else {
            i2 = FolderVersion.getPersonalFolderOwnerType();
        }
        mo32828a(i, str, str2, z, 2, false, i2);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8402d
    /* renamed from: a */
    public void mo32828a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3) {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(16908290, C8422l.m34869a(this.f22633a, this.f22636d, this.f22637e, i, str, str2, z, i2, z2, i3)).addToBackStack(null).commitAllowingStateLoss();
    }
}
