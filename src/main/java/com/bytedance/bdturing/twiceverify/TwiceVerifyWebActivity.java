package com.bytedance.bdturing.twiceverify;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.C0774a;
import com.bytedance.bdturing.AbstractC3571m;
import com.bytedance.bdturing.EventReport;
import com.bytedance.bdturing.VerifyWebView;
import com.bytedance.bdturing.p207c.C3529b;
import com.bytedance.bdturing.p207c.C3535d;
import com.bytedance.bdturing.twiceverify.C3582c;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import com.bytedance.bdturing.verify.request.DownSmsRequest;
import com.bytedance.bdturing.verify.request.PasswordRequest;
import com.bytedance.bdturing.verify.request.UpSmsRequest;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;

public class TwiceVerifyWebActivity extends AppCompatActivity {

    /* renamed from: a */
    private VerifyWebView f11312a;

    /* renamed from: b */
    private View f11313b;

    /* renamed from: c */
    private AbstractRequest f11314c;

    /* renamed from: d */
    private C3529b f11315d;

    /* renamed from: e */
    private AbstractC3571m f11316e = new AbstractC3571m() {
        /* class com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity.C35781 */

        @Override // com.bytedance.bdturing.AbstractC3571m
        /* renamed from: a */
        public void mo14250a() {
            EventReport.m14807a(0, "success");
        }

        @Override // com.bytedance.bdturing.AbstractC3571m
        /* renamed from: a */
        public void mo14251a(int i, String str) {
            EventReport.m14807a(i, str);
        }
    };

    /* renamed from: a */
    public Context mo14415a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo14418a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m15107a(this, context);
    }

    /* renamed from: b */
    public Resources mo14419b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo14420c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m15105a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo14422d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m15109c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m15106a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m15108b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f11312a = null;
        C3582c.m15126a().mo14439g();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        finish();
        C3582c.AbstractC3584a e = C3582c.m15126a().mo14437e();
        if (e != null) {
            e.mo14357a(2, "user close");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14416a() {
        if (this.f11312a == null) {
            VerifyWebView verifyWebView = (VerifyWebView) findViewById(R.id.bdturing_webview);
            this.f11312a = verifyWebView;
            verifyWebView.mo14257a(this.f11316e);
        }
        VerifyWebView verifyWebView2 = this.f11312a;
        if (verifyWebView2 != null) {
            verifyWebView2.setParentActivity(this);
        }
        this.f11312a.getSettings().setJavaScriptEnabled(true);
        this.f11315d = new C3529b(new C3535d(this), this.f11312a);
        this.f11312a.loadUrl(this.f11314c.mo14351i(), new HashMap());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        setFinishOnTouchOutside(false);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) decorView.getLayoutParams();
        layoutParams.gravity = 80;
        layoutParams.width = UIUtils.getScreenWidth(this);
        if (C3582c.m15126a().mo14436d() == null || C3582c.m15126a().mo14436d().mo14425a() <= 0) {
            layoutParams.height = (int) UIUtils.dip2Px(this, 304.0f);
            AbstractRequest aVar = this.f11314c;
            if (aVar instanceof DownSmsRequest) {
                layoutParams.height = (int) UIUtils.dip2Px(this, 290.0f);
            } else if (aVar instanceof UpSmsRequest) {
                layoutParams.height = (int) UIUtils.dip2Px(this, 304.0f);
            } else if (aVar instanceof PasswordRequest) {
                layoutParams.height = (int) UIUtils.dip2Px(this, 272.0f);
            }
        } else {
            layoutParams.height = C3582c.m15126a().mo14436d().mo14425a();
        }
        getWindowManager().updateViewLayout(decorView, layoutParams);
    }

    /* renamed from: a */
    public static Resources m15106a(TwiceVerifyWebActivity twiceVerifyWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(twiceVerifyWebActivity);
        }
        return twiceVerifyWebActivity.mo14419b();
    }

    /* renamed from: c */
    public static AssetManager m15109c(TwiceVerifyWebActivity twiceVerifyWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(twiceVerifyWebActivity);
        }
        return twiceVerifyWebActivity.mo14422d();
    }

    /* renamed from: b */
    public static void m15108b(TwiceVerifyWebActivity twiceVerifyWebActivity) {
        twiceVerifyWebActivity.mo14420c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TwiceVerifyWebActivity twiceVerifyWebActivity2 = twiceVerifyWebActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    twiceVerifyWebActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bdturing_twice_verify_activity_web);
        C3582c.m15126a().mo14435c().mo14428a(this, "");
        this.f11314c = C3582c.m15126a().mo14438f();
        mo14416a();
        this.f11313b = findViewById(R.id.tob_bg_view);
        if (C3582c.m15126a().mo14436d() != null) {
            Drawable g = C0774a.m3779g(getResources().getDrawable(R.drawable.bdturing_twice_verify_top_radius_bg));
            C0774a.m3766a(g, C3582c.m15126a().mo14436d().mo14426b());
            this.f11313b.setBackgroundDrawable(g);
        }
    }

    /* renamed from: a */
    public void mo14417a(int i) {
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.twice_verify_white));
        Toast.makeText(this, "ERROR:" + i, 1).show();
        VerifyWebView verifyWebView = this.f11312a;
        if (verifyWebView != null) {
            verifyWebView.setVisibility(4);
        }
    }

    /* renamed from: a */
    public static void m15107a(TwiceVerifyWebActivity twiceVerifyWebActivity, Context context) {
        twiceVerifyWebActivity.mo14418a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(twiceVerifyWebActivity);
        }
    }

    /* renamed from: a */
    public static Context m15105a(TwiceVerifyWebActivity twiceVerifyWebActivity, Configuration configuration) {
        Context a = twiceVerifyWebActivity.mo14415a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
