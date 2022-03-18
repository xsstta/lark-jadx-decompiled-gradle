package com.ss.android.lark.integrator;

import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vpn.p2919a.AbstractC58196a;
import com.ss.android.lark.vpn.p2919a.AbstractC58198b;

public class VPNSDKModuleProvider {
    /* renamed from: a */
    public static AbstractC58198b m154355a() {
        return (AbstractC58198b) ClaymoreServiceLoader.loadFirst(AbstractC58198b.class);
    }

    @ClaymoreImpl(AbstractC58196a.class)
    public static class VPNSDKDependency implements AbstractC58196a {
        public void logoutFeishu() {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).logout(LarkContext.getApplication().getApplicationContext(), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.integrator.VPNSDKModuleProvider.VPNSDKDependency.C390971 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i("VPNSDKModuleProvider", "logout onSuccess called.");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("VPNSDKModuleProvider", "logout onError called");
                }
            });
        }

        public String getDomain() {
            VPNSDKSettingConfig vPNSDKSettingConfig = (VPNSDKSettingConfig) SettingManager.getInstance().get(VPNSDKSettingConfig.class);
            if (vPNSDKSettingConfig == null) {
                Log.m165383e("VPNSDKModuleProvider", "The vpnSetting obtained from the setting is null when getDomain");
                return "";
            } else if (TextUtils.isEmpty(vPNSDKSettingConfig.f100373a)) {
                Log.m165383e("VPNSDKModuleProvider", "The vpnDomain obtained from the setting is null when getDomain");
                return "";
            } else {
                return "https://" + vPNSDKSettingConfig.f100373a;
            }
        }
    }
}
