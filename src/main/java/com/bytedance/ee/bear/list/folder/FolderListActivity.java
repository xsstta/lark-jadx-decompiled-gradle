package com.bytedance.ee.bear.list.folder;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FolderListActivity extends BaseActivity {

    /* renamed from: a */
    private String f22450a;

    /* renamed from: b */
    private String f22451b;

    /* renamed from: c */
    private String f22452c;

    /* renamed from: d */
    private String f22453d;

    /* renamed from: e */
    private String f22454e;

    /* renamed from: f */
    private String f22455f;

    /* renamed from: g */
    private int f22456g;

    /* renamed from: h */
    private String f22457h;

    /* renamed from: i */
    private int f22458i;

    /* renamed from: j */
    private int f22459j;

    /* renamed from: k */
    private boolean f22460k;

    /* renamed from: l */
    private boolean f22461l;

    /* renamed from: m */
    private Fragment f22462m;

    /* renamed from: a */
    public Context mo32668a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo32670a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m34294a(this, context);
    }

    /* renamed from: c */
    public Resources mo32672c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m34292a(this, configuration);
    }

    /* renamed from: d */
    public void mo32674d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo32675e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m34296c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m34293a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m34295b(this);
    }

    /* renamed from: a */
    public void mo32669a() {
        Intent intent = getIntent();
        this.f22450a = intent.getStringExtra("token");
        this.f22451b = intent.getStringExtra("title");
        this.f22452c = intent.getStringExtra("parent_space_id");
        this.f22454e = intent.getStringExtra("current_module");
        this.f22455f = intent.getStringExtra(ShareHitPoint.f121868c);
        this.f22456g = intent.getIntExtra("depth", 0);
        this.f22457h = intent.getStringExtra(ShareHitPoint.f121869d);
        this.f22459j = intent.getIntExtra("owner_type", 0);
        this.f22458i = intent.getIntExtra("permission", 2);
        this.f22460k = intent.getBooleanExtra("is_external", false);
        this.f22461l = intent.getBooleanExtra("is_personal_folder", false);
        this.f22453d = intent.getStringExtra("parent_token");
    }

    /* renamed from: b */
    public void mo32671b() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("token", this.f22450a);
        bundle.putString("title", this.f22451b);
        bundle.putString("parent_space_id", this.f22452c);
        bundle.putString("current_module", this.f22454e);
        bundle.putString(ShareHitPoint.f121868c, this.f22455f);
        bundle.putInt("depth", this.f22456g);
        bundle.putString(ShareHitPoint.f121869d, this.f22457h);
        bundle.putInt("permission", this.f22458i);
        bundle.putBoolean("is_external", this.f22460k);
        bundle.putBoolean("is_personal_folder", this.f22461l);
        bundle.putString("parent_token", this.f22453d);
        if (FolderVersion.isShareFolderV2(this.f22459j)) {
            str = as.class.getName();
        } else {
            str = C8358e.class.getName();
        }
        C13479a.m54764b("FolderListActivity", "initFragment()...fragmentName = " + str);
        this.f22462m = Fragment.instantiate(this, str, bundle);
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f22462m).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m34293a(FolderListActivity folderListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderListActivity);
        }
        return folderListActivity.mo32672c();
    }

    /* renamed from: c */
    public static AssetManager m34296c(FolderListActivity folderListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderListActivity);
        }
        return folderListActivity.mo32675e();
    }

    /* renamed from: b */
    public static void m34295b(FolderListActivity folderListActivity) {
        folderListActivity.mo32674d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderListActivity folderListActivity2 = folderListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        mo32669a();
        mo32671b();
    }

    /* renamed from: a */
    public static void m34294a(FolderListActivity folderListActivity, Context context) {
        folderListActivity.mo32670a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderListActivity);
        }
    }

    /* renamed from: a */
    public static Context m34292a(FolderListActivity folderListActivity, Configuration configuration) {
        Context a = folderListActivity.mo32668a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f22462m;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
