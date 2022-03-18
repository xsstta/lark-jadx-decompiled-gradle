package com.bytedance.lark.webview.container.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.webview.container.impl.p836b.AbstractC19856a;
import com.bytedance.lynx.webview.TTWebSdk;
import com.larksuite.component.webview.container.dto.AbstractC25833d;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;

public class WebContainerActivity extends BaseFragmentActivity implements AbstractC19856a {

    /* renamed from: a */
    private AbstractC25833d f48440a;

    /* renamed from: b */
    private Handler f48441b;

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return super.getExitAnimationConfig();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        Handler handler = this.f48441b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f48441b = null;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("enter_transition");
        if (intArrayExtra != null) {
            return new ActivityAnimationManager.AnimationConfig(intArrayExtra);
        }
        return super.getEnterAnimationConfig();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        Bundle parseArguments = parseArguments(getIntent());
        if (parseArguments != null) {
            return parseArguments.getBoolean("isNeedLogin", true);
        }
        return super.isNeedLoginStatus();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        AbstractC25820a a = C25821b.m93347a();
        if (a == null) {
            Log.m165383e("WebContainerActivity", "IWebContainerDependency is null!!!!");
            return super.getResources();
        } else if (a.mo91848a("lark.browser.webview.pool")) {
            return getApplicationContext().getResources();
        } else {
            return super.getResources();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m72386b(int i) {
        setStatusBarByParseColor(i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo67231a(this);
    }

    /* renamed from: a */
    private void mo67231a(Context context) {
        if (TTWebSdk.isTTWebView()) {
            TTWebSdk.resetWebViewContext(context);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo67231a(getBaseContext());
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public Bundle parseArguments(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getExtras();
    }

    @Override // com.bytedance.lark.webview.container.impl.p836b.AbstractC19856a
    /* renamed from: a */
    public void mo67225a(int i) {
        Handler handler = this.f48441b;
        if (handler != null) {
            handler.post(new Runnable(i) {
                /* class com.bytedance.lark.webview.container.impl.$$Lambda$WebContainerActivity$m4lRGqaH6D2rgND6xxXWSKPr3BE */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    WebContainerActivity.this.m72386b(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a(getClass().getSimpleName()).mo168688b();
        C48211b.m190251a().mo168689b("onCreate");
        super.onCreate(bundle);
        Bundle parseArguments = parseArguments(getIntent());
        C25821b.m93347a().mo91850b(parseArguments.getString("url", ""));
        setContentView(R.layout.activity_webview_container);
        this.f48441b = new Handler(Looper.getMainLooper());
        this.f48440a = AbstractC25833d.CC.m93461a(this, parseArguments);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f48440a.mo67297i()).commitAllowingStateLoss();
        C48211b.m190251a().mo168691c("onCreate");
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2 = false;
        if (keyEvent.getKeyCode() == 4) {
            z = true;
        } else {
            z = false;
        }
        AbstractC25833d dVar = this.f48440a;
        if (dVar == null || !z) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getRepeatCount() != 0) {
            z2 = true;
        }
        if (dVar.mo67290c(z2)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(getSupportFragmentManager() == null || getSupportFragmentManager().getFragments() == null || getSupportFragmentManager().getFragments().size() <= 0)) {
            for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
        if (i == 19999 && i2 == 1) {
            setResult(1);
            finish();
        }
    }
}
