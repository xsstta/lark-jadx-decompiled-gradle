package com.ss.android.lark.sticker.ui.emoticon.shop;

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

public class StickerSetShopActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C55211b f136239a;

    /* renamed from: a */
    public Context mo188178a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo188179a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo188180a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m214137a(this, context);
    }

    /* renamed from: b */
    public void mo188181b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo188182c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m214135a(this, configuration);
    }

    public AssetManager getAssets() {
        return m214139c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m214136a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m214138b(this);
    }

    /* renamed from: a */
    public static Resources m214136a(StickerSetShopActivity stickerSetShopActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetShopActivity);
        }
        return stickerSetShopActivity.mo188179a();
    }

    /* renamed from: c */
    public static AssetManager m214139c(StickerSetShopActivity stickerSetShopActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetShopActivity);
        }
        return stickerSetShopActivity.mo188182c();
    }

    /* renamed from: b */
    public static void m214138b(StickerSetShopActivity stickerSetShopActivity) {
        stickerSetShopActivity.mo188181b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            StickerSetShopActivity stickerSetShopActivity2 = stickerSetShopActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    stickerSetShopActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sticker_set_shop);
        this.f136239a = (C55211b) Fragment.instantiate(this, C55211b.class.getName(), parseArguments(getIntent()));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f136239a).commit();
    }

    /* renamed from: a */
    public static void m214137a(StickerSetShopActivity stickerSetShopActivity, Context context) {
        stickerSetShopActivity.mo188180a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(stickerSetShopActivity);
        }
    }

    /* renamed from: a */
    public static Context m214135a(StickerSetShopActivity stickerSetShopActivity, Configuration configuration) {
        Context a = stickerSetShopActivity.mo188178a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
