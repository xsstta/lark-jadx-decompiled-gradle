package com.ss.android.lark.sticker.ui.emoticon.preview;

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

public class StickerPreviewActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C55186b f136214a;

    /* renamed from: a */
    public Context mo188129a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo188130a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo188131a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m214083a(this, context);
    }

    /* renamed from: b */
    public void mo188132b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo188133c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m214081a(this, configuration);
    }

    public AssetManager getAssets() {
        return m214085c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m214082a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m214084b(this);
    }

    /* renamed from: a */
    public static Resources m214082a(StickerPreviewActivity stickerPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerPreviewActivity);
        }
        return stickerPreviewActivity.mo188130a();
    }

    /* renamed from: c */
    public static AssetManager m214085c(StickerPreviewActivity stickerPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerPreviewActivity);
        }
        return stickerPreviewActivity.mo188133c();
    }

    /* renamed from: b */
    public static void m214084b(StickerPreviewActivity stickerPreviewActivity) {
        stickerPreviewActivity.mo188132b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            StickerPreviewActivity stickerPreviewActivity2 = stickerPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    stickerPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sticker_preview);
        this.f136214a = (C55186b) Fragment.instantiate(this, C55186b.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f136214a).commit();
    }

    /* renamed from: a */
    public static void m214083a(StickerPreviewActivity stickerPreviewActivity, Context context) {
        stickerPreviewActivity.mo188131a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m214081a(StickerPreviewActivity stickerPreviewActivity, Configuration configuration) {
        Context a = stickerPreviewActivity.mo188129a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
