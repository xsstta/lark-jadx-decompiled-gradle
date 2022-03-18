package com.bytedance.ee.bear.wiki.homepage.spacelist;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wiki.homepage.spacelist.p584b.C12001b;
import com.bytedance.ee.bear.wiki.mvpframework.WikiBaseActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class WikiAllSpaceActivity extends WikiBaseActivity {
    /* renamed from: a */
    public Context mo45938a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo45939a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo45940a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m49746a(this, context);
    }

    /* renamed from: b */
    public void mo45941b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo45942c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m49744a(this, configuration);
    }

    public AssetManager getAssets() {
        return m49748c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m49745a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m49747b(this);
    }

    /* renamed from: d */
    private void m49750d() {
        getSupportFragmentManager().beginTransaction().replace(R.id.wiki_all_space_list_frame_container, C12001b.m49770a(getIntent().getParcelableArrayListExtra("space_list_data"), getIntent().getIntExtra("EXTRA_PAGE_MODE", 0), getIntent().getIntExtra("createDocumentType", C8275a.f22371d.mo32555b())), C12001b.class.getSimpleName()).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m49745a(WikiAllSpaceActivity wikiAllSpaceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiAllSpaceActivity);
        }
        return wikiAllSpaceActivity.mo45939a();
    }

    /* renamed from: c */
    public static AssetManager m49748c(WikiAllSpaceActivity wikiAllSpaceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiAllSpaceActivity);
        }
        return wikiAllSpaceActivity.mo45942c();
    }

    /* renamed from: b */
    public static void m49747b(WikiAllSpaceActivity wikiAllSpaceActivity) {
        wikiAllSpaceActivity.mo45941b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiAllSpaceActivity wikiAllSpaceActivity2 = wikiAllSpaceActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiAllSpaceActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private void m49749c(Bundle bundle) {
        if (bundle == null) {
            C13479a.m54764b("WikiAllSpaceActivity", "setUpWikiAllSpaceFragment: default");
            m49750d();
            return;
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(C12001b.class.getSimpleName());
        if (findFragmentByTag == null) {
            C13479a.m54764b("WikiAllSpaceActivity", "setUpWikiAllSpaceFragment: restore no found Any fragment");
            m49750d();
        } else if (!(findFragmentByTag instanceof C12001b)) {
            C13479a.m54764b("WikiAllSpaceActivity", "setUpWikiAllSpaceFragment: restore no found WikiAllSpaceFragment");
            m49750d();
        } else {
            C13479a.m54764b("WikiAllSpaceActivity", "setUpWikiAllSpaceFragment: restore WikiAllSpaceFragment");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        setContentView(R.layout.wiki_all_space_list_activity);
        m49749c(bundle);
    }

    /* renamed from: a */
    public static void m49746a(WikiAllSpaceActivity wikiAllSpaceActivity, Context context) {
        wikiAllSpaceActivity.mo45940a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiAllSpaceActivity);
        }
    }

    /* renamed from: a */
    public static Context m49744a(WikiAllSpaceActivity wikiAllSpaceActivity, Configuration configuration) {
        Context a = wikiAllSpaceActivity.mo45938a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13479a.m54764b("WikiAllSpaceActivity", "WikiAllSpaceActivity.onActivityResult(), requestCode: " + i);
        if (i2 == -1 && i == 4884) {
            finish();
        }
    }
}
