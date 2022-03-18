package com.bytedance.ee.bear.search.space;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.route.RouteBean;
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

public class SpaceSearchActivity extends BaseActivity {

    /* renamed from: a */
    public SpaceSearchFragment f29196a;

    /* renamed from: b */
    private int f29197b;

    /* renamed from: c */
    private int f29198c;

    /* renamed from: d */
    private String f29199d;

    /* renamed from: e */
    private String f29200e;

    /* renamed from: f */
    private String f29201f;

    /* renamed from: g */
    private String f29202g;

    /* renamed from: h */
    private boolean f29203h;

    /* renamed from: a */
    public Context mo41363a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo41364a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo41365a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m45149a(this, context);
    }

    /* renamed from: b */
    public void mo41366b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo41367c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m45145a(this, configuration);
    }

    public AssetManager getAssets() {
        return m45154d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m45152b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m45153c(this);
    }

    /* renamed from: d */
    private void m45155d() {
        this.f29196a.mo41374a(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.search.space.SpaceSearchActivity.C108711 */

            public void onAnimationEnd(Animator animator) {
                SpaceSearchActivity.this.f29196a = null;
                SpaceSearchActivity.super.finish();
                SpaceSearchActivity.this.overridePendingTransition(R.anim.facade_hold, R.anim.facade_hold);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
        SpaceSearchFragment spaceSearchFragment = this.f29196a;
        if (spaceSearchFragment != null) {
            spaceSearchFragment.mo41378k();
        } else {
            super.onBackPressed();
        }
    }

    public void finish() {
        boolean z;
        SpaceSearchFragment spaceSearchFragment = this.f29196a;
        if (spaceSearchFragment != null) {
            m45155d();
            return;
        }
        if (spaceSearchFragment == null || !spaceSearchFragment.mo41377j()) {
            z = false;
        } else {
            z = true;
        }
        super.finish();
        if (this.f29203h && z) {
            ar.m20936a().mo41508c(ak.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.search.space.$$Lambda$SpaceSearchActivity$0DUWXMWeiykscopm6U4jFXrpGco */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return SpaceSearchActivity.this.m45147a((ak) obj);
                }
            }).mo238001b($$Lambda$SpaceSearchActivity$d5N9pqJ_yyhpCfFFty0gAhRFqwg.INSTANCE, $$Lambda$SpaceSearchActivity$DEt7LvVEIqQ1D_N_eCEUIiZgyFI.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m45147a(ak akVar) throws Exception {
        akVar.jumpToLarkFeed(this.f29202g);
        return "";
    }

    /* renamed from: b */
    public static Resources m45152b(SpaceSearchActivity spaceSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(spaceSearchActivity);
        }
        return spaceSearchActivity.mo41364a();
    }

    /* renamed from: d */
    public static AssetManager m45154d(SpaceSearchActivity spaceSearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(spaceSearchActivity);
        }
        return spaceSearchActivity.mo41367c();
    }

    /* renamed from: c */
    public static void m45153c(SpaceSearchActivity spaceSearchActivity) {
        spaceSearchActivity.mo41366b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SpaceSearchActivity spaceSearchActivity2 = spaceSearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    spaceSearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private JSONObject m45146a(Intent intent) {
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
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        String str;
        super.mo16851a(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.f29197b = intent.getIntExtra("KEY_SEARCH_BAR_DY", 0);
            this.f29200e = intent.getStringExtra("KEY_FOLDER_TOKEN");
            this.f29198c = intent.getIntExtra("KEY_SEARCH_PAGE_TYPE", 1);
            if (intent.hasExtra("module")) {
                str = intent.getStringExtra("module");
            } else {
                str = "";
            }
            this.f29199d = str;
            JSONObject a = m45146a(intent);
            if (a != null) {
                this.f29203h = a.getBooleanValue("isFromLark");
                this.f29201f = (String) C13657b.m55418a(a.getString("keyword"), "");
                this.f29202g = (String) C13657b.m55418a(a.getString("pageName"), "");
            }
        }
        SpaceSearchFragment spaceSearchFragment = (SpaceSearchFragment) getSupportFragmentManager().findFragmentById(R.id.search_content_frame);
        this.f29196a = spaceSearchFragment;
        if (spaceSearchFragment == null) {
            this.f29196a = SpaceSearchFragment.m45163a(this, this.f29197b, this.f29198c, this.f29203h, this.f29201f, this.f29200e, this.f29199d);
            getSupportFragmentManager().beginTransaction().add(16908290, this.f29196a).commitAllowingStateLoss();
        }
    }

    /* renamed from: a */
    public static void m45149a(SpaceSearchActivity spaceSearchActivity, Context context) {
        spaceSearchActivity.mo41365a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(spaceSearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m45145a(SpaceSearchActivity spaceSearchActivity, Configuration configuration) {
        Context a = spaceSearchActivity.mo41363a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        SpaceSearchFragment spaceSearchFragment;
        super.onActivityResult(i, i2, intent);
        C13479a.m54772d("SpaceSearchActivity", "onActivityResult(), requestCode = " + i);
        if (intent != null && (spaceSearchFragment = this.f29196a) != null) {
            if (i == 5 || i == 3 || i == 4097 || i == 4098) {
                spaceSearchFragment.onActivityResult(i, i2, intent);
            }
        }
    }
}
