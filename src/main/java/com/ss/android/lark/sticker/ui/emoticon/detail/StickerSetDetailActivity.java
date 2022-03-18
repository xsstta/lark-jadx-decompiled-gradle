package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class StickerSetDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C55134b f136120a;

    /* renamed from: a */
    public Context mo188036a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo188037a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo188038a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m213929a(this, context);
    }

    /* renamed from: b */
    public void mo188039b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo188040c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m213927a(this, configuration);
    }

    public AssetManager getAssets() {
        return m213931c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m213928a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m213930b(this);
    }

    /* renamed from: a */
    public static Resources m213928a(StickerSetDetailActivity stickerSetDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetDetailActivity);
        }
        return stickerSetDetailActivity.mo188037a();
    }

    /* renamed from: c */
    public static AssetManager m213931c(StickerSetDetailActivity stickerSetDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetDetailActivity);
        }
        return stickerSetDetailActivity.mo188040c();
    }

    /* renamed from: b */
    public static void m213930b(StickerSetDetailActivity stickerSetDetailActivity) {
        stickerSetDetailActivity.mo188039b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            StickerSetDetailActivity stickerSetDetailActivity2 = stickerSetDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    stickerSetDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sticker_set_detail);
        this.f136120a = (C55134b) Fragment.instantiate(this, C55134b.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f136120a).commit();
    }

    /* renamed from: a */
    public static void m213929a(StickerSetDetailActivity stickerSetDetailActivity, Context context) {
        stickerSetDetailActivity.mo188038a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m213927a(StickerSetDetailActivity stickerSetDetailActivity, Configuration configuration) {
        Context a = stickerSetDetailActivity.mo188036a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
