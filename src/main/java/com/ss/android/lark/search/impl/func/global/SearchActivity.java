package com.ss.android.lark.search.impl.func.global;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.search.impl.func.global.search.entity.GlobalSearchOrderData;
import com.ss.android.lark.search.redesign.SearchFragment;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.gecko.ASLynxGeckoManager;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SearchActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private SearchFragment f132385a;

    /* renamed from: com.ss.android.lark.search.impl.func.global.SearchActivity$a */
    public interface AbstractC53625a {
        /* renamed from: a */
        void mo182928a();
    }

    /* renamed from: a */
    public Context mo182919a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182920a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182921a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m207586a(this, context);
    }

    /* renamed from: b */
    public void mo182923b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182924c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m207583a(this, configuration);
    }

    public AssetManager getAssets() {
        return m207588c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m207585a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m207587b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        SearchFragment mVar = this.f132385a;
        if (mVar instanceof AbstractC53625a) {
            mVar.mo182928a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        ASLynxGeckoManager.f133123f.mo183794a().mo183793c();
    }

    /* renamed from: d */
    private void m207589d() {
        SearchFragment mVar = new SearchFragment();
        this.f132385a = mVar;
        mVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f132385a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m207585a(SearchActivity searchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
        return searchActivity.mo182920a();
    }

    /* renamed from: c */
    public static AssetManager m207588c(SearchActivity searchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
        return searchActivity.mo182924c();
    }

    /* renamed from: b */
    public static void m207587b(SearchActivity searchActivity) {
        searchActivity.mo182923b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchActivity searchActivity2 = searchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("LarkSearch.Search.SearchActivity").mo168688b();
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        SearchCommonModuleDependency.f133119a.mo183785a();
        C48211b.m190251a().mo168689b("setupFragment");
        m207589d();
        C48211b.m190251a().mo168691c("setupFragment");
        C53883a.m208794a().mo183800c();
    }

    /* renamed from: a */
    public boolean mo182922a(String str) {
        SearchFragment mVar = this.f132385a;
        if (mVar != null) {
            return mVar.mo183460b(str);
        }
        return false;
    }

    /* renamed from: a */
    public static void m207586a(SearchActivity searchActivity, Context context) {
        searchActivity.mo182921a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
    }

    /* renamed from: a */
    public static Context m207583a(SearchActivity searchActivity, Configuration configuration) {
        Context a = searchActivity.mo182919a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m165389i("LarkSearch.Search.SearchActivity", "requestCode: " + i);
        if (intent != null) {
            for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }

    /* renamed from: a */
    public static Intent m207584a(Context context, String str, String str2, int i, boolean z, boolean z2, GlobalSearchOrderData globalSearchOrderData) {
        Intent intent = new Intent(context, SearchActivity.class);
        intent.putExtra("searchKey", str);
        intent.putExtra("searchTitle", str2);
        intent.putExtra("translateY", i);
        intent.putExtra("transition_anim", z);
        intent.putExtra("search_result_type_order", globalSearchOrderData);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        if (z2) {
            intent.addFlags(67108864);
        }
        return intent;
    }
}
