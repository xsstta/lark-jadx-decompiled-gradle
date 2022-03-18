package com.bytedance.ee.bear.lynx.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.kit.nglynx.debug.LynxDevtoolWrapper;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/CCMLynxCardTestActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "handleDebugIntent", "", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CCMLynxCardTestActivity extends AppCompatActivity {
    /* renamed from: a */
    public Context mo33881a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo33882a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo33883a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m36984a(this, context);
    }

    /* renamed from: b */
    public void mo33884b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo33885c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m36981a(this, configuration);
    }

    public AssetManager getAssets() {
        return m36986c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m36982a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m36985b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.CCMLynxCardTestActivity$a */
    public static final class RunnableC8820a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CCMLynxCardTestActivity f23740a;

        RunnableC8820a(CCMLynxCardTestActivity cCMLynxCardTestActivity) {
            this.f23740a = cCMLynxCardTestActivity;
        }

        public final void run() {
            this.f23740a.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m36983a(intent);
        }
    }

    /* renamed from: a */
    public static Resources m36982a(CCMLynxCardTestActivity cCMLynxCardTestActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cCMLynxCardTestActivity);
        }
        return cCMLynxCardTestActivity.mo33882a();
    }

    /* renamed from: c */
    public static AssetManager m36986c(CCMLynxCardTestActivity cCMLynxCardTestActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cCMLynxCardTestActivity);
        }
        return cCMLynxCardTestActivity.mo33885c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("vilinTest", "onCreate");
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        m36983a(intent);
    }

    /* renamed from: b */
    public static void m36985b(CCMLynxCardTestActivity cCMLynxCardTestActivity) {
        cCMLynxCardTestActivity.mo33884b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CCMLynxCardTestActivity cCMLynxCardTestActivity2 = cCMLynxCardTestActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    cCMLynxCardTestActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final void m36983a(Intent intent) {
        String str;
        try {
            LynxDevtoolWrapper bVar = LynxDevtoolWrapper.f38542a;
            Uri data = intent.getData();
            if (data != null) {
                str = data.toString();
            } else {
                str = null;
            }
            bVar.mo53719a(str);
            new Handler().postDelayed(new RunnableC8820a(this), 200);
        } catch (Exception e) {
            Log.e("CCMLynxCardTestActivity", e.toString());
        }
    }

    /* renamed from: a */
    public static void m36984a(CCMLynxCardTestActivity cCMLynxCardTestActivity, Context context) {
        cCMLynxCardTestActivity.mo33883a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cCMLynxCardTestActivity);
        }
    }

    /* renamed from: a */
    public static Context m36981a(CCMLynxCardTestActivity cCMLynxCardTestActivity, Configuration configuration) {
        Context a = cCMLynxCardTestActivity.mo33881a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        com.ss.android.lark.log.Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
