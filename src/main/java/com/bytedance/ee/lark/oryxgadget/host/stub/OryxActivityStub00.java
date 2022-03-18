package com.bytedance.ee.lark.oryxgadget.host.stub;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.ee.lark.oryxgadget.host.OryxActivityBase;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class OryxActivityStub00 extends OryxActivityBase {
    public void OryxActivityStub00__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Context OryxActivityStub00__createConfigurationContext$___twin___(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    public AssetManager OryxActivityStub00__getAssets$___twin___() {
        return super.getAssets();
    }

    public Resources OryxActivityStub00__getResources$___twin___() {
        return super.getResources();
    }

    public void OryxActivityStub00__onStop$___twin___() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_setting_service_common_LancetHooker_attachBaseContext(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_integrator_lancet_LancetHooker_createConfigurationContext(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_setting_service_common_LancetHooker_getAssets(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_setting_service_common_LancetHooker_getResources(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapphost.MiniappHostBase, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    public static AssetManager com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_setting_service_common_LancetHooker_getAssets(OryxActivityStub00 oryxActivityStub00) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxActivityStub00);
        }
        return oryxActivityStub00.OryxActivityStub00__getAssets$___twin___();
    }

    public static Resources com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_setting_service_common_LancetHooker_getResources(OryxActivityStub00 oryxActivityStub00) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxActivityStub00);
        }
        return oryxActivityStub00.OryxActivityStub00__getResources$___twin___();
    }

    public static void com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(OryxActivityStub00 oryxActivityStub00) {
        oryxActivityStub00.OryxActivityStub00__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OryxActivityStub00 oryxActivityStub002 = oryxActivityStub00;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    oryxActivityStub002.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_setting_service_common_LancetHooker_attachBaseContext(OryxActivityStub00 oryxActivityStub00, Context context) {
        oryxActivityStub00.OryxActivityStub00__attachBaseContext$___twin___(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oryxActivityStub00);
        }
    }

    public static Context com_bytedance_ee_lark_oryxgadget_host_stub_OryxActivityStub00_com_ss_android_lark_integrator_lancet_LancetHooker_createConfigurationContext(OryxActivityStub00 oryxActivityStub00, Configuration configuration) {
        Context OryxActivityStub00__createConfigurationContext$___twin___ = oryxActivityStub00.OryxActivityStub00__createConfigurationContext$___twin___(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", OryxActivityStub00__createConfigurationContext$___twin___);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(OryxActivityStub00__createConfigurationContext$___twin___);
    }
}
