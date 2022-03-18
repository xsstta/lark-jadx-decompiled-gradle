package com.ss.android.lark.integrator;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.emm.p1827a.AbstractC37004b;
import com.ss.android.lark.emm.p1827a.AbstractC37005c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.AbstractC48903b;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

public class EMMModuleProvider {
    /* renamed from: a */
    public static AbstractC37005c m154351a() {
        return (AbstractC37005c) ClaymoreServiceLoader.loadFirst(AbstractC37005c.class);
    }

    @ClaymoreImpl(AbstractC37004b.class)
    public static class EMMModuleDependency implements AbstractC37004b {
        public String getDeviceId() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceIdService().getDeviceId();
        }

        public String getUserId() {
            return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager().mo172422c();
        }

        public void logout() {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).logout(LarkContext.getApplication().getApplicationContext(), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.integrator.EMMModuleProvider.EMMModuleDependency.C390962 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    Log.m165389i("EMMModuleProvider", "logout onSuccess called.");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("EMMModuleProvider", "logout onError");
                }
            });
        }

        public String getChannel() {
            EMMSettingConfig eMMSettingConfig = getEMMSettingConfig();
            if (eMMSettingConfig == null) {
                Log.m165389i("EMMModuleProvider", "The emmSetting obtained from the setting is null when getChannel");
                return "";
            } else if (eMMSettingConfig.f100371c != null && !TextUtils.isEmpty(eMMSettingConfig.f100371c)) {
                return getEMMSettingConfig().f100371c;
            } else {
                Log.m165389i("EMMModuleProvider", "The emmDomain obtained from the setting is null when getChannel");
                return "";
            }
        }

        public String getDomain() {
            EMMSettingConfig eMMSettingConfig = getEMMSettingConfig();
            if (eMMSettingConfig == null) {
                Log.m165389i("EMMModuleProvider", "The emmSetting obtained from the setting is null when getDomain");
                return "";
            } else if (eMMSettingConfig.f100370b != null && !TextUtils.isEmpty(eMMSettingConfig.f100370b)) {
                return getEMMSettingConfig().f100370b;
            } else {
                Log.m165389i("EMMModuleProvider", "The emmDomain obtained from the setting is null when getDomain");
                return "";
            }
        }

        private EMMSettingConfig getEMMSettingConfig() {
            String string = SettingManager.getInstance().getString(EMMSettingConfig.class);
            if (TextUtils.isEmpty(string)) {
                Log.m165397w("EMMModuleProvider", "getEMMSettingConfig source string empty.");
                return null;
            }
            IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
            if (!iPassportApi.isLogin() || TextUtils.isEmpty(iPassportApi.getTenantId())) {
                Log.m165397w("EMMModuleProvider", "getEMMSettingConfig fetch too early without login.");
                return null;
            }
            try {
                JSONObject parseObject = JSONObject.parseObject(string);
                Log.m165379d("EMMModuleProvider", "getEMMSettingConfig data is \n" + parseObject.toJSONString());
                JSONObject jSONObject = parseObject.getJSONObject(iPassportApi.getTenantId());
                if (jSONObject != null) {
                    return new EMMSettingConfig(jSONObject);
                }
                Log.m165383e("EMMModuleProvider", "getEMMSettingConfig fetch failed, not found target tenant, id is " + iPassportApi.getTenantId() + ".");
                return null;
            } catch (Exception e) {
                Log.m165398w("EMMModuleProvider", "getEMMSettingConfig parse string error.", e);
                return null;
            }
        }

        public void getOpenPlatformCode(final IGetDataCallback<String> iGetDataCallback) {
            EMMSettingConfig eMMSettingConfig = getEMMSettingConfig();
            if (eMMSettingConfig == null) {
                Log.m165389i("EMMModuleProvider", "The emmSetting obtained from the setting is null when getOpenPlatformCode");
            } else if (eMMSettingConfig.f100369a == null || TextUtils.isEmpty(eMMSettingConfig.f100369a)) {
                Log.m165389i("EMMModuleProvider", "The emmAppID obtained from the setting is null when getOpenPlatformCode");
            } else {
                ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).miniAppLogin(LarkContext.getApplication(), eMMSettingConfig.f100369a, new AbstractC48903b() {
                    /* class com.ss.android.lark.integrator.EMMModuleProvider.EMMModuleDependency.C390951 */

                    @Override // com.ss.android.lark.openplatform_api.AbstractC48903b
                    /* renamed from: a */
                    public void mo142973a(String str) {
                        Log.m165389i("EMMModuleProvider", "onLoginSuccess code is " + str + ".");
                        iGetDataCallback.onSuccess(str);
                    }

                    @Override // com.ss.android.lark.openplatform_api.AbstractC48903b
                    /* renamed from: a */
                    public void mo142974a(org.json.JSONObject jSONObject) {
                        if (jSONObject == null) {
                            Log.m165389i("EMMModuleProvider", "onLoginFail data is empty.");
                            return;
                        }
                        Log.m165389i("EMMModuleProvider", "onLoginFail data is " + jSONObject.toString());
                    }
                });
            }
        }
    }
}
