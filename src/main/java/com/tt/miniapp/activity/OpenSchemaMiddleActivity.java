package com.tt.miniapp.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.C66205j;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapp.util.C67029c;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.miniapphost.process.p3379e.C67577a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.util.C67866g;

public class OpenSchemaMiddleActivity extends Activity {

    /* renamed from: a */
    public boolean f165627a;

    /* renamed from: b */
    public boolean f165628b = true;

    /* renamed from: c */
    public boolean f165629c;

    /* renamed from: d */
    public String f165630d;

    /* renamed from: e */
    public String f165631e;

    /* renamed from: f */
    public Runnable f165632f;

    /* renamed from: g */
    public AbstractC67565b f165633g;

    /* renamed from: h */
    public final Object f165634h = new Object();

    /* renamed from: i */
    private boolean f165635i;

    /* renamed from: j */
    private Runnable f165636j = new Runnable() {
        /* class com.tt.miniapp.activity.OpenSchemaMiddleActivity.RunnableC657391 */

        public void run() {
            OpenSchemaMiddleActivity.this.mo230348a();
        }
    };

    /* renamed from: k */
    private boolean f165637k = false;

    /* renamed from: l */
    private boolean f165638l = false;

    /* access modifiers changed from: protected */
    public void onStop() {
        m257725a(this);
    }

    /* renamed from: f */
    private boolean m257727f() {
        return TextUtils.isEmpty(this.f165630d);
    }

    /* renamed from: g */
    private boolean m257728g() {
        return "newTask".equalsIgnoreCase(this.f165630d);
    }

    /* renamed from: h */
    private boolean m257729h() {
        return "currentTask".equalsIgnoreCase(this.f165630d);
    }

    /* renamed from: d */
    public void mo230351d() {
        super.onStop();
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onStop");
    }

    public void onBackPressed() {
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onBackPressed");
        mo230348a();
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (this.f165627a) {
            AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onEnterAnimationComplete tryShowMiniAppActivity mFromAppId:", this.f165631e);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onPause");
    }

    /* renamed from: c */
    public void mo230350c() {
        if (!isFinishing()) {
            AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "finishCurrentActivity mFromAppId:", this.f165631e);
            if (C67018a.m261204a((Activity) this)) {
                finishAndRemoveTask();
            } else {
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onDestroy");
        if (this.f165638l) {
            getWindow().clearFlags(8192);
        }
        C67866g.m264031b(this.f165632f);
        C67866g.m264031b(this.f165636j);
        AbstractC67565b bVar = this.f165633g;
        if (bVar != null) {
            bVar.mo234711d();
            this.f165633g = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onResume");
        if (this.f165637k) {
            C67018a.m261220e(this);
        }
        if (this.f165628b) {
            this.f165628b = false;
            return;
        }
        this.f165627a = true;
        getWindow().addFlags(8192);
        this.f165638l = true;
        C67866g.m264028a(new Runnable() {
            /* class com.tt.miniapp.activity.OpenSchemaMiddleActivity.RunnableC657424 */

            public void run() {
                AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onResume tryShowMiniAppActivity mFromAppId:", OpenSchemaMiddleActivity.this.f165631e);
                OpenSchemaMiddleActivity.this.mo230348a();
            }
        }, 500);
    }

    /* renamed from: e */
    private void m257726e() {
        if (this.f165637k) {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().setSoftInputMode(16);
            if (C67043j.m261290k(this)) {
                C67043j.m261273a(getWindow());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
            C67029c.m261245a((Activity) this);
            C67018a.m261220e(this);
            return;
        }
        C66205j jVar = new C66205j(this, new C66205j.C66206a());
        jVar.mo231547a(true);
        jVar.mo231549b(true);
    }

    /* renamed from: a */
    public void mo230348a() {
        if (this.f165629c || isFinishing()) {
            AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "tryShowMiniAppActivity mMovingMiniAppActivity || isFinishing()");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C67018a.m261214b((Activity) this)) {
            mo230349b();
        }
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "tryShowMiniAppActivity duration:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: b */
    public void mo230349b() {
        AppBrandLogger.m52828d("OpenSchemaMiddleActivity", "showMiniAppActivityOnFront mFromAppId:", this.f165631e);
        if (!m257729h() && !m257728g() && !this.f165635i) {
            this.f165629c = C67018a.m261205a(this, this.f165631e);
            AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "moveMiniAppActivityToFront mFromAppId:", this.f165631e);
        }
        mo230350c();
        if (!this.f165629c) {
            C67018a.m261219d(this);
        }
    }

    /* renamed from: i */
    private boolean m257730i() {
        boolean z;
        String str;
        String stringExtra = getIntent().getStringExtra("schema");
        String stringExtra2 = getIntent().getStringExtra("args");
        C67577a generateAsyncIpcHandlerFromUri = ProcessUtil.generateAsyncIpcHandlerFromUri(Uri.parse(stringExtra));
        if (HostDependManager.getInst().openSchema(this, stringExtra) || HostDependManager.getInst().openSchema(this, stringExtra, stringExtra2)) {
            str = ApiCallResult.Builder.createOk("openSchema").build().toString();
            z = true;
        } else {
            str = ApiCallResult.Builder.createFail("openSchema").extraInfo("feature is not supported in app").build().toString();
            z = false;
        }
        if (generateAsyncIpcHandlerFromUri != null) {
            generateAsyncIpcHandlerFromUri.mo234767a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("openSchemaResult", (Object) str).mo234763b());
            if (m257728g() || m257727f()) {
                C67866g.m264028a(new Runnable() {
                    /* class com.tt.miniapp.activity.OpenSchemaMiddleActivity.RunnableC657413 */

                    public void run() {
                        OpenSchemaMiddleActivity.this.mo230350c();
                    }
                }, 300);
            }
        } else {
            DebugUtil.outputError("OpenSchemaMiddleActivity", "asyncIpcHandler ==null");
        }
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "openSchema schema:", stringExtra, "openSchemaSuccess:", Boolean.valueOf(z));
        return z;
    }

    public void forceMeasureContentView(final View view) {
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "forceMeasureContentView");
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.activity.OpenSchemaMiddleActivity.RunnableC657402 */

            public void run() {
                FrameLayout frameLayout = (FrameLayout) OpenSchemaMiddleActivity.this.getWindow().getDecorView();
                view.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight(), Integer.MIN_VALUE));
                synchronized (OpenSchemaMiddleActivity.this.f165634h) {
                    OpenSchemaMiddleActivity.this.f165634h.notifyAll();
                }
            }
        });
    }

    /* renamed from: a */
    public static void m257725a(OpenSchemaMiddleActivity openSchemaMiddleActivity) {
        openSchemaMiddleActivity.mo230351d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OpenSchemaMiddleActivity openSchemaMiddleActivity2 = openSchemaMiddleActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    openSchemaMiddleActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppBrandLogger.m52830i("OpenSchemaMiddleActivity", "onCreate");
        this.f165630d = getIntent().getStringExtra("launch_flag");
        this.f165631e = getIntent().getStringExtra("from_app_id");
        this.f165635i = getIntent().getBooleanExtra("is_from_app_in_host_stack", this.f165635i);
        this.f165637k = getIntent().getBooleanExtra("is_game", false);
        m257726e();
        if (!m257730i()) {
            mo230348a();
        }
    }
}
