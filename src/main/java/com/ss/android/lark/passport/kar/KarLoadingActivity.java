package com.ss.android.lark.passport.kar;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49194j;
import com.ss.android.lark.passport.ka.C49298b;
import com.ss.android.lark.passport.ka.model.DecodedIdPLoginModel;
import com.ss.android.lark.passport.ka.p2452a.C49296c;
import com.ss.android.lark.passport.ka.transparent.KaLoadingActivity;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class KarLoadingActivity extends KaLoadingActivity implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: h */
    private View f123774h;

    /* renamed from: a */
    public Context mo171948a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m194283a(this, context);
    }

    /* renamed from: c */
    public Resources mo170970c() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo171949c(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m194281a(this, configuration);
    }

    public AssetManager getAssets() {
        return m194287c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m194282a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m194286b(this);
    }

    /* renamed from: w */
    public void mo171954w() {
        super.onStop();
    }

    /* renamed from: x */
    public AssetManager mo171955x() {
        return super.getAssets();
    }

    /* renamed from: b */
    public void mo170969b() {
        View view = this.f123774h;
        if (view != null) {
            view.setVisibility(0);
            this.f123774h.setOnClickListener(this);
        }
    }

    /* renamed from: y */
    private void m194288y() {
        C49296c.m194232a().mo171909a(C49296c.m194232a().mo171918d(), new AbstractC49352d<String>() {
            /* class com.ss.android.lark.passport.kar.KarLoadingActivity.C493112 */

            /* renamed from: a */
            public void mo145179a(String str) {
                C49298b.m194253a().mo171922a(KarLoadingActivity.this, str, null, false);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                PassportLog passportLog = KarLoadingActivity.this.f123052c;
                passportLog.mo171471d("KarLoadingActivity", "getKaPreConfig error: " + networkErrorResult.toString());
                KarLoadingActivity.this.mo170969b();
            }
        });
    }

    public void onClick(View view) {
        m194288y();
    }

    /* renamed from: a */
    public static Resources m194282a(KarLoadingActivity karLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(karLoadingActivity);
        }
        return karLoadingActivity.mo170970c();
    }

    /* renamed from: b */
    public static Intent m194284b(Context context) {
        Intent intent = new Intent(context, KarLoadingActivity.class);
        intent.addFlags(65536);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: c */
    public static AssetManager m194287c(KarLoadingActivity karLoadingActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(karLoadingActivity);
        }
        return karLoadingActivity.mo171955x();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.passport.ka.transparent.KaLoadingActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.error_page);
        this.f123774h = findViewById;
        findViewById.setOnClickListener(this);
        this.f123774h.setOnLongClickListener(this);
    }

    public boolean onLongClick(View view) {
        final ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        C49194j.m193951a(true, new AbstractC49392e() {
            /* class com.ss.android.lark.passport.kar.KarLoadingActivity.C493101 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: b */
            public void mo171342b(String str) {
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49392e
            /* renamed from: a */
            public void mo171341a(String str) {
                clipboardManager.setText(str);
            }
        });
        return false;
    }

    /* renamed from: b */
    public static void m194286b(KarLoadingActivity karLoadingActivity) {
        karLoadingActivity.mo171954w();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            KarLoadingActivity karLoadingActivity2 = karLoadingActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    karLoadingActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m194283a(KarLoadingActivity karLoadingActivity, Context context) {
        karLoadingActivity.mo171949c(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(karLoadingActivity);
        }
    }

    /* renamed from: a */
    public static Context m194281a(KarLoadingActivity karLoadingActivity, Configuration configuration) {
        Context a = karLoadingActivity.mo171948a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: b */
    public static void m194285b(Context context, DecodedIdPLoginModel decodedIdPLoginModel) {
        Intent b = m194284b(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("IDP_LOGIN_MODEL", decodedIdPLoginModel);
        b.putExtras(bundle);
        context.startActivity(b);
    }
}
