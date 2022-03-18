package com.bytedance.ee.bear.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.search.wiki.C10899c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SearchSubActivity extends BaseActivity {

    /* renamed from: a */
    private C10845l f28872a;

    /* renamed from: b */
    private String f28873b;

    /* renamed from: a */
    public Context mo40806a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo40807a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo40808a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m44711a(this, context);
    }

    /* renamed from: b */
    public void mo40809b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo40810c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m44708a(this, configuration);
    }

    public AssetManager getAssets() {
        return m44714c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m44709a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m44713b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        C13479a.m54764b("SearchSubActivity", "onBackPressed()...");
        C10845l lVar = this.f28872a;
        if (lVar != null) {
            lVar.mo40943v();
        } else {
            finish();
        }
    }

    /* renamed from: a */
    private void m44710a(Intent intent) {
        try {
            this.f28873b = intent.getStringExtra(ShareHitPoint.f121869d);
        } catch (Exception e) {
            C13479a.m54761a("SearchSubActivity", e);
        }
    }

    /* renamed from: a */
    public static Resources m44709a(SearchSubActivity searchSubActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchSubActivity);
        }
        return searchSubActivity.mo40807a();
    }

    /* renamed from: c */
    public static AssetManager m44714c(SearchSubActivity searchSubActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchSubActivity);
        }
        return searchSubActivity.mo40810c();
    }

    /* renamed from: b */
    private void m44712b(Intent intent) {
        C10845l lVar = (C10845l) getSupportFragmentManager().findFragmentById(R.id.search_content_frame);
        this.f28872a = lVar;
        if (lVar == null) {
            this.f28872a = m44715c(intent.getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.search_content_frame, this.f28872a).commitAllowingStateLoss();
        }
    }

    /* renamed from: c */
    private C10845l m44715c(Bundle bundle) {
        if (TextUtils.equals(this.f28873b, "wiki")) {
            return (C10899c) Fragment.instantiate(this, C10899c.class.getName(), bundle);
        }
        return (C10845l) Fragment.instantiate(this, C10845l.class.getName(), bundle);
    }

    /* renamed from: b */
    public static void m44713b(SearchSubActivity searchSubActivity) {
        searchSubActivity.mo40809b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchSubActivity searchSubActivity2 = searchSubActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchSubActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        setContentView(R.layout.search_activity_sub);
        Intent intent = getIntent();
        if (getIntent() == null) {
            C13479a.m54764b("SearchSubActivity", "onDoCreate()...");
            finish();
            return;
        }
        m44710a(intent);
        m44712b(intent);
    }

    /* renamed from: a */
    public static Context m44708a(SearchSubActivity searchSubActivity, Configuration configuration) {
        Context a = searchSubActivity.mo40806a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m44711a(SearchSubActivity searchSubActivity, Context context) {
        searchSubActivity.mo40808a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchSubActivity);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13479a.m54772d("SearchSubActivity", "onActivityResult(), requestCode=" + i);
        if (intent != null) {
            if (i == 1 || i == 3 || i == 4097 || i == 4098 || i == 4) {
                C10845l lVar = this.f28872a;
                if (lVar != null) {
                    lVar.onActivityResult(i, i2, intent);
                }
            } else if (i == 2) {
                setResult(-1, intent);
                finish();
            }
        }
    }
}
