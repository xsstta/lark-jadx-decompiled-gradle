package com.bytedance.ee.bear.slide;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.loading.LoadingLayout;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.slide.SlideRouteActivity;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class SlideRouteActivity extends BaseActivity {

    /* renamed from: a */
    private LoadingLayout f30523a;

    /* renamed from: b */
    private LinearLayout f30524b;

    /* renamed from: c */
    private String f30525c;

    /* renamed from: d */
    private String f30526d;

    /* renamed from: e */
    private final RunnableC11367a f30527e = new RunnableC11367a(this);

    /* renamed from: f */
    private final C68289a f30528f = new C68289a();

    /* renamed from: a */
    public Context mo43493a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo43495a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m47151a(this, context);
    }

    /* renamed from: c */
    public Resources mo43497c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m47148a(this, configuration);
    }

    /* renamed from: d */
    public void mo43499d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo43500e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m47155c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m47149a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m47154b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlideRouteActivity$b */
    public static class C11368b implements NetService.AbstractC5074c<C11369c> {
        private C11368b() {
        }

        /* renamed from: a */
        public C11369c parse(String str) {
            C11369c cVar = new C11369c();
            try {
                cVar.setPptxToken(new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optString("pptx_token"));
            } catch (JSONException e) {
                C13479a.m54758a("SlideRouteActivity", "parse()...error = " + e);
            }
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlideRouteActivity$c */
    public static class C11369c extends NetService.Result {
        private String pptxToken;

        private C11369c() {
        }

        public String getPptxToken() {
            return this.pptxToken;
        }

        public void setPptxToken(String str) {
            this.pptxToken = str;
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: g */
    private void m47157g() {
        LoadingLayout loadingLayout = this.f30523a;
        if (loadingLayout != null) {
            loadingLayout.mo23570c();
        }
        this.f30527e.mo43503a(true);
    }

    /* renamed from: f */
    private void m47156f() {
        if (this.f30523a != null) {
            this.f30527e.mo43503a(false);
            this.f30523a.postDelayed(this.f30527e, 300);
        }
    }

    /* renamed from: h */
    private void m47158h() {
        this.f30523a = (LoadingLayout) findViewById(R.id.common_loading);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.common_error_tip);
        this.f30524b = linearLayout;
        linearLayout.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.slide.SlideRouteActivity.C113661 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SlideRouteActivity.this.mo43496b();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        LoadingLayout loadingLayout = this.f30523a;
        if (loadingLayout != null) {
            loadingLayout.removeCallbacks(this.f30527e);
        }
        this.f30528f.mo237935a();
        C13479a.m54764b("SlideRouteActivity", "onDestroy()...");
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.slide.SlideRouteActivity$a */
    public static class RunnableC11367a implements Runnable {

        /* renamed from: a */
        private final WeakReference<SlideRouteActivity> f30530a;

        /* renamed from: b */
        private boolean f30531b;

        public void run() {
            C13479a.m54764b("SlideRouteActivity", "DelayLoadingRunnable()...");
            if (this.f30531b) {
                C13479a.m54764b("SlideRouteActivity", "DelayLoadingRunnable()...cancelled");
            } else if (this.f30530a.get() != null) {
                this.f30530a.get().mo43494a();
            }
        }

        /* renamed from: a */
        public void mo43503a(boolean z) {
            this.f30531b = z;
        }

        RunnableC11367a(SlideRouteActivity slideRouteActivity) {
            this.f30530a = new WeakReference<>(slideRouteActivity);
        }
    }

    /* renamed from: j */
    private void m47160j() {
        C13479a.m54764b("SlideRouteActivity", "openSlide()...");
        m47157g();
        SlideRouteBean slideRouteBean = new SlideRouteBean();
        slideRouteBean.mo43508a(true);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(this.f30525c, slideRouteBean);
        finish();
    }

    /* renamed from: i */
    private void m47159i() {
        Intent intent = getIntent();
        if (intent == null) {
            C13479a.m54764b("SlideRouteActivity", "intent is null");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(ShareHitPoint.f121869d);
        this.f30525c = intent.getStringExtra("url");
        this.f30526d = intent.getStringExtra("obj_token");
        C13479a.m54764b("SlideRouteActivity", "type = " + stringExtra);
        if (TextUtils.isEmpty(this.f30526d)) {
            C13479a.m54764b("SlideRouteActivity", "mObjToken is null");
            finish();
        }
    }

    /* renamed from: b */
    public void mo43496b() {
        C13479a.m54764b("SlideRouteActivity", "fetchPPTXUrl()...");
        m47156f();
        NetService.C5077f fVar = new NetService.C5077f("/space/api/slide/query_pptx_token");
        fVar.mo20145a("slide_token", this.f30526d);
        this.f30528f.mo237937a(((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C11368b()).mo20141a(fVar).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$SlideRouteActivity$9d1M1UGpNj6gQHTuDqTbiIkY6YE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SlideRouteActivity.this.m47150a((SlideRouteActivity) ((SlideRouteActivity.C11369c) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.slide.$$Lambda$SlideRouteActivity$tGeIEwV2batt0aflx1JUZM4_AQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SlideRouteActivity.this.m47153a((SlideRouteActivity) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    public void mo43494a() {
        LinearLayout linearLayout = this.f30524b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LoadingLayout loadingLayout = this.f30523a;
        if (loadingLayout != null) {
            loadingLayout.mo23569b();
            this.f30523a.mo23567a();
        }
    }

    /* renamed from: a */
    public static Resources m47149a(SlideRouteActivity slideRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(slideRouteActivity);
        }
        return slideRouteActivity.mo43497c();
    }

    /* renamed from: c */
    public static AssetManager m47155c(SlideRouteActivity slideRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(slideRouteActivity);
        }
        return slideRouteActivity.mo43500e();
    }

    /* renamed from: b */
    public static void m47154b(SlideRouteActivity slideRouteActivity) {
        slideRouteActivity.mo43499d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SlideRouteActivity slideRouteActivity2 = slideRouteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    slideRouteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47150a(C11369c cVar) throws Exception {
        if (TextUtils.isEmpty(cVar.getPptxToken())) {
            C13479a.m54764b("SlideRouteActivity", "fetchPPTXUrl()...pptxToken is empty");
            m47160j();
            return;
        }
        C13479a.m54764b("SlideRouteActivity", "fetchPPTXUrl()...success");
        m47152a(cVar.getPptxToken());
    }

    /* renamed from: a */
    private void m47152a(String str) {
        C13479a.m54764b("SlideRouteActivity", "openPPTX()...");
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C6313i.m25327a().mo25382a(C8275a.f22375h.mo32553a(), str, ""));
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47153a(Throwable th) throws Exception {
        C13479a.m54758a("SlideRouteActivity", "fetchPPTXUrl()...error = " + th);
        m47160j();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.doc_slide_route_activity);
        if (bundle != null) {
            C13479a.m54764b("SlideRouteActivity", "onDoCreate: restore so finish");
            finish();
            return;
        }
        m47159i();
        m47158h();
        mo43496b();
    }

    /* renamed from: a */
    public static void m47151a(SlideRouteActivity slideRouteActivity, Context context) {
        slideRouteActivity.mo43495a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(slideRouteActivity);
        }
    }

    /* renamed from: a */
    public static Context m47148a(SlideRouteActivity slideRouteActivity, Configuration configuration) {
        Context a = slideRouteActivity.mo43493a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
