package com.bytedance.ee.bear.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.search.wiki.C10896a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.functions.Function;

public class SearchHomeActivity extends BaseActivity {

    /* renamed from: a */
    private C10825h f28861a;

    /* renamed from: b */
    private String f28862b;

    /* renamed from: c */
    private String f28863c;

    /* renamed from: d */
    private String f28864d;

    /* renamed from: e */
    private boolean f28865e;

    /* renamed from: f */
    private String f28866f;

    /* renamed from: a */
    public Context mo40790a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo40791a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo40792a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m44681a(this, context);
    }

    /* renamed from: b */
    public void mo40793b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo40794c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m44678a(this, configuration);
    }

    public AssetManager getAssets() {
        return m44685c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m44679a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m44684b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        C10825h hVar = this.f28861a;
        if (hVar != null) {
            hVar.mo40937A();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: f */
    private C10825h m44688f() {
        if (TextUtils.equals(this.f28866f, "wiki")) {
            return C10896a.m45316b(this.f28862b, this.f28864d);
        }
        return C10825h.m44902a(this.f28862b, this.f28864d);
    }

    /* renamed from: e */
    private void m44687e() {
        C10825h hVar = (C10825h) getSupportFragmentManager().findFragmentById(R.id.search_content_frame);
        this.f28861a = hVar;
        if (hVar == null) {
            this.f28861a = m44688f();
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.search_content_frame, this.f28861a);
            beginTransaction.commit();
        }
    }

    public void finish() {
        boolean z;
        getWindow().setSoftInputMode(3);
        C10825h hVar = this.f28861a;
        if (hVar == null || !hVar.mo40938B()) {
            z = false;
        } else {
            z = true;
        }
        super.finish();
        if (this.f28865e && z) {
            ar.m20936a().mo41508c(ak.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.search.$$Lambda$SearchHomeActivity$R0sAi1cOTdO3IQrEHdcKkq8L2yk */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return SearchHomeActivity.this.m44680a((ak) obj);
                }
            }).mo238001b($$Lambda$SearchHomeActivity$H9y2CDCOBJg9YLtaAPFN7cwCro.INSTANCE, $$Lambda$SearchHomeActivity$VrlL_T96TRa3KbdCM_0Oz9GYfU.INSTANCE);
        }
    }

    /* renamed from: d */
    private void m44686d() {
        Intent intent = getIntent();
        if (intent != null) {
            RouteBean routeBean = (RouteBean) intent.getParcelableExtra("extra_intent_data");
            JSONObject jSONObject = new JSONObject();
            if (routeBean != null) {
                boolean equals = "EXTRA_FROM_LARK".equals(routeBean.mo40632r());
                String p = routeBean.mo40630p();
                String q = routeBean.mo40631q();
                String r = routeBean.mo40632r();
                String v = routeBean.mo40636v();
                jSONObject.put("isFromLark", (Object) Boolean.valueOf(equals));
                jSONObject.put("keyword", (Object) p);
                jSONObject.put("pageName", (Object) q);
                jSONObject.put(ShareHitPoint.f121868c, (Object) r);
                jSONObject.put(ShareHitPoint.f121869d, (Object) v);
            }
            this.f28865e = jSONObject.getBooleanValue("isFromLark");
            this.f28862b = (String) C13657b.m55418a(jSONObject.getString("keyword"), "");
            this.f28863c = (String) C13657b.m55418a(jSONObject.getString("pageName"), "");
            this.f28864d = (String) C13657b.m55418a(jSONObject.getString(ShareHitPoint.f121868c), "");
            this.f28866f = (String) C13657b.m55418a(jSONObject.getString(ShareHitPoint.f121869d), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m44680a(ak akVar) throws Exception {
        akVar.jumpToLarkFeed(this.f28863c);
        return "";
    }

    /* renamed from: a */
    public static Resources m44679a(SearchHomeActivity searchHomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchHomeActivity);
        }
        return searchHomeActivity.mo40791a();
    }

    /* renamed from: c */
    public static AssetManager m44685c(SearchHomeActivity searchHomeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchHomeActivity);
        }
        return searchHomeActivity.mo40794c();
    }

    /* renamed from: b */
    public static void m44684b(SearchHomeActivity searchHomeActivity) {
        searchHomeActivity.mo40793b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchHomeActivity searchHomeActivity2 = searchHomeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchHomeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
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
        setContentView(R.layout.search_activity_main);
        m44686d();
        m44687e();
    }

    /* renamed from: a */
    public static void m44681a(SearchHomeActivity searchHomeActivity, Context context) {
        searchHomeActivity.mo40792a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchHomeActivity);
        }
    }

    /* renamed from: a */
    public static Context m44678a(SearchHomeActivity searchHomeActivity, Configuration configuration) {
        Context a = searchHomeActivity.mo40790a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        C10825h hVar;
        super.onActivityResult(i, i2, intent);
        C13479a.m54772d("SearchHomeActivity", "onActivityResult(), requestCode = " + i);
        if (intent != null && (hVar = this.f28861a) != null) {
            if (i == 2 || i == 1 || i == 3 || i == 4097 || i == 4098 || i == 4) {
                hVar.onActivityResult(i, i2, intent);
            }
        }
    }
}
