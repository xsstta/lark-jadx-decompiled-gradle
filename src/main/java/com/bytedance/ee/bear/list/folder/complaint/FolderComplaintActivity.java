package com.bytedance.ee.bear.list.folder.complaint;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FolderComplaintActivity extends BaseActivity {

    /* renamed from: a */
    private String f22539a;

    /* renamed from: b */
    private String f22540b;

    /* renamed from: c */
    private String f22541c;

    /* renamed from: d */
    private boolean f22542d;

    /* renamed from: a */
    public Context mo32769a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo32771a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m34542a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m34540a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo32775d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo32776e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo32777f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m34544c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m34541a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m34543b(this);
    }

    /* renamed from: g */
    private Bundle m34545g() {
        Bundle bundle = new Bundle();
        bundle.putString("token", this.f22539a);
        bundle.putString("title", this.f22540b);
        bundle.putString("desc", this.f22541c);
        return bundle;
    }

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f22542d) {
            setResult(1);
        } else {
            setResult(2);
        }
        finish();
    }

    /* renamed from: c */
    public void mo32773c() {
        C13479a.m54764b("FolderComplaintActivity", "showSendComplaintSuccess()...");
        this.f22542d = true;
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(16908290, Fragment.instantiate(this, C8347d.class.getName(), m34545g())).addToBackStack(null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public void mo32770a() {
        Intent intent = getIntent();
        this.f22540b = intent.getStringExtra("title");
        this.f22541c = intent.getStringExtra("desc");
        this.f22539a = intent.getStringExtra("token");
    }

    /* renamed from: b */
    public void mo32772b() {
        C13479a.m54764b("FolderComplaintActivity", "initFragment()...");
        getSupportFragmentManager().beginTransaction().replace(16908290, Fragment.instantiate(this, C8343a.class.getName(), m34545g())).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m34541a(FolderComplaintActivity folderComplaintActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderComplaintActivity);
        }
        return folderComplaintActivity.mo32775d();
    }

    /* renamed from: c */
    public static AssetManager m34544c(FolderComplaintActivity folderComplaintActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderComplaintActivity);
        }
        return folderComplaintActivity.mo32777f();
    }

    /* renamed from: b */
    public static void m34543b(FolderComplaintActivity folderComplaintActivity) {
        folderComplaintActivity.mo32776e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderComplaintActivity folderComplaintActivity2 = folderComplaintActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderComplaintActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        mo32770a();
        mo32772b();
    }

    /* renamed from: a */
    public static void m34542a(FolderComplaintActivity folderComplaintActivity, Context context) {
        folderComplaintActivity.mo32771a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderComplaintActivity);
        }
    }

    /* renamed from: a */
    public static Context m34540a(FolderComplaintActivity folderComplaintActivity, Configuration configuration) {
        Context a = folderComplaintActivity.mo32769a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
