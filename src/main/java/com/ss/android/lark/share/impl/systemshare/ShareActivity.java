package com.ss.android.lark.share.impl.systemshare;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.impl.AbstractC54744b;
import com.ss.android.lark.share.impl.p2682a.C54740e;
import com.ss.android.lark.share.p2681a.AbstractC54714a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class ShareActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private boolean f135210a;

    /* renamed from: b */
    private final List<AbstractC54744b> f135211b = new ArrayList();

    /* renamed from: a */
    public Context mo186900a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186901a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186902a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m212440a(this, context);
    }

    /* renamed from: b */
    public void mo186903b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186904c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m212437a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean enableGlobalWatermark() {
        return false;
    }

    public AssetManager getAssets() {
        return m212444c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m212438a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m212443b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        this.f135210a = true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        if (this.f135210a) {
            m212439a(-2);
        }
        this.f135210a = false;
    }

    /* renamed from: d */
    private void m212446d() {
        this.f135211b.add(new C54762b(this));
        this.f135211b.add(new C54740e(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        if (!C54713a.m212321a().mo178389b()) {
            super.onDestroy();
        } else {
            super.onDestroy();
        }
    }

    /* renamed from: a */
    public static Resources m212438a(ShareActivity shareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareActivity);
        }
        return shareActivity.mo186901a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0013  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m212442b(android.content.Intent r3) {
        /*
            r2 = this;
            com.ss.android.lark.share.impl.a.f r0 = com.ss.android.lark.share.impl.p2682a.C54741f.m212395a()
            r0.mo186877b()
            java.util.List<com.ss.android.lark.share.impl.b> r0 = r2.f135211b
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            com.ss.android.lark.share.impl.b r1 = (com.ss.android.lark.share.impl.AbstractC54744b) r1
            boolean r1 = r1.mo186862a(r3)
            if (r1 == 0) goto L_0x000d
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.share.impl.systemshare.ShareActivity.m212442b(android.content.Intent):void");
    }

    /* renamed from: c */
    public static AssetManager m212444c(ShareActivity shareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareActivity);
        }
        return shareActivity.mo186904c();
    }

    /* renamed from: b */
    public static void m212443b(ShareActivity shareActivity) {
        shareActivity.mo186903b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareActivity shareActivity2 = shareActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m212445c(Intent intent) {
        String str;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str2 = "";
        if (data == null) {
            str = str2;
        } else {
            str = data.getScheme();
        }
        if (data != null) {
            str2 = data.getHost();
        }
        return C54740e.m212389a(action, str, str2);
    }

    /* renamed from: a */
    private void m212439a(int i) {
        Intent intent = new Intent();
        intent.putExtra("code", i);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    private boolean m212441a(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getIntExtra("checkParamsValidity", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        AbstractC54714a a = C54713a.m212321a();
        if (!a.mo178389b()) {
            super.onCreate(bundle);
            a.mo178387a(this);
            finish();
            return;
        }
        Intent intent = null;
        if (!m212441a(getIntent())) {
            getIntent().replaceExtras((Bundle) null);
            Log.m165397w("ShareActivity", "checkParamsValidity: true");
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
            getWindow().setStatusBarColor(0);
        }
        if (!C54713a.m212321a().mo178391d().mo178398a()) {
            Intent intent2 = getIntent();
            if (m212445c(intent2)) {
                intent = intent2;
            }
            C54713a.m212321a().mo178388a(this, intent);
            LKUIToast.show(getApplicationContext(), (int) R.string.Lark_Legacy_LogonTip);
            finish();
            return;
        }
        Intent intent3 = getIntent();
        if (intent3 == null) {
            Log.m165389i("ShareActivity", "getIntent is empty");
            finish();
            return;
        }
        m212446d();
        m212442b(intent3);
    }

    /* renamed from: a */
    public static void m212440a(ShareActivity shareActivity, Context context) {
        shareActivity.mo186902a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(shareActivity);
        }
    }

    /* renamed from: a */
    public static Context m212437a(ShareActivity shareActivity, Configuration configuration) {
        Context a = shareActivity.mo186900a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
