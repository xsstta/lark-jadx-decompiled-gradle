package com.ss.android.lark.locationmessage.ui.navigation;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.locationmessage.statistics.NavigateHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.ttm.player.MediaPlayer;

public class NavigateActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C41638d f105735a;

    /* renamed from: a */
    public Context mo149738a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo149739a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo149740a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m165184a(this, context);
    }

    /* renamed from: b */
    public void mo149741b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo149742c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m165182a(this, configuration);
    }

    public AssetManager getAssets() {
        return m165186c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m165183a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m165185b(this);
    }

    /* renamed from: a */
    public static Resources m165183a(NavigateActivity navigateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(navigateActivity);
        }
        return navigateActivity.mo149739a();
    }

    /* renamed from: c */
    public static AssetManager m165186c(NavigateActivity navigateActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(navigateActivity);
        }
        return navigateActivity.mo149742c();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !DesktopUtil.m144301a((Context) this)) {
            getWindow().getDecorView().setSystemUiVisibility(13826);
        }
    }

    /* renamed from: b */
    public static void m165185b(NavigateActivity navigateActivity) {
        navigateActivity.mo149741b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NavigateActivity navigateActivity2 = navigateActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    navigateActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(DynamicModule.f58006b);
        getWindow().addFlags(MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        setContentView(R.layout.activity_navigate);
        Bundle parseArguments = parseArguments(getIntent());
        if (((LocationInfo) parseArguments.getSerializable("extra_location")) == null) {
            Log.m165382e("extra location is empty, exit");
            finish();
        } else {
            this.f105735a = (C41638d) Fragment.instantiate(this, C41638d.class.getName(), parseArguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, this.f105735a).commit();
        }
        NavigateHitPoint.m165176b("message_location_view");
    }

    /* renamed from: a */
    public static void m165184a(NavigateActivity navigateActivity, Context context) {
        navigateActivity.mo149740a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(navigateActivity);
        }
    }

    /* renamed from: a */
    public static Context m165182a(NavigateActivity navigateActivity, Configuration configuration) {
        Context a = navigateActivity.mo149738a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
