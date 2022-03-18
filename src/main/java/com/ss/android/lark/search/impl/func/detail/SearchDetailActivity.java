package com.ss.android.lark.search.impl.func.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;

public class SearchDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C53622f f132265a;

    /* renamed from: b */
    private SearchDetailInitData f132266b;

    /* renamed from: a */
    public Context mo182775a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182776a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182777a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m207354a(this, context);
    }

    /* renamed from: b */
    public void mo182778b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182779c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m207351a(this, configuration);
    }

    public AssetManager getAssets() {
        return m207357c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m207353a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m207356b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        C53622f fVar = this.f132265a;
        if (fVar != null) {
            fVar.mo182914c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C53622f fVar = this.f132265a;
        if (fVar != null) {
            fVar.destroy();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        this.f132265a.mo182915d();
    }

    /* renamed from: d */
    private void m207358d() {
        Pair<? extends AbstractC53569a, ? extends BaseSearchView> a = C53612d.m207554a(this, this.f132266b);
        if (a == null) {
            Log.m165383e(this.TAG, "the scene is not right");
            return;
        }
        C53622f fVar = new C53622f((AbstractC53569a) a.first, (BaseSearchView) a.second, this.f132266b.sceneType, this.f132266b.resultType);
        this.f132265a = fVar;
        fVar.create();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        if (!m207355a(getIntent())) {
            return super.getEnterAnimationConfig();
        }
        if (this.f132266b.isMainPage) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
        }
        return super.getEnterAnimationConfig();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        if (!m207355a(getIntent())) {
            return super.getExitAnimationConfig();
        }
        if (this.f132266b.isMainPage) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
        }
        return super.getExitAnimationConfig();
    }

    /* renamed from: c */
    public static AssetManager m207357c(SearchDetailActivity searchDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchDetailActivity);
        }
        return searchDetailActivity.mo182779c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m207355a(getIntent())) {
            finish();
            return;
        }
        setContentView(R.layout.activity_search_detail);
        m207358d();
    }

    /* renamed from: b */
    public static void m207356b(SearchDetailActivity searchDetailActivity) {
        searchDetailActivity.mo182778b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchDetailActivity searchDetailActivity2 = searchDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static Resources m207353a(SearchDetailActivity searchDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchDetailActivity);
        }
        return searchDetailActivity.mo182776a();
    }

    /* renamed from: a */
    private boolean m207355a(Intent intent) {
        if (intent == null) {
            Log.m165382e("checkValidity failed: intent is null");
            return false;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.m165382e("checkValidity failed: bundle is null");
            return false;
        }
        Serializable serializable = extras.getSerializable("search/origin_data");
        if (!(serializable instanceof SearchDetailInitData)) {
            Log.m165382e("checkValidity failed: initObj is null");
            return false;
        }
        this.f132266b = (SearchDetailInitData) serializable;
        return true;
    }

    /* renamed from: a */
    public static void m207354a(SearchDetailActivity searchDetailActivity, Context context) {
        searchDetailActivity.mo182777a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchDetailActivity);
        }
    }

    /* renamed from: a */
    public static Intent m207352a(Context context, SearchDetailInitData searchDetailInitData) {
        Intent intent = new Intent(context, SearchDetailActivity.class);
        intent.putExtra("search/origin_data", searchDetailInitData);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static Context m207351a(SearchDetailActivity searchDetailActivity, Configuration configuration) {
        Context a = searchDetailActivity.mo182775a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
