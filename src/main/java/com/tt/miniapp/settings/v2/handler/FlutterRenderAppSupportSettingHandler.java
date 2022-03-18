package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.tt.miniapphost.util.AppbrandUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FlutterRenderAppSupportSettingHandler extends AbstractC12744b {
    private static final AbstractC12790g<FlutterRenderAppSupportSettingHandler> HOLDER = new AbstractC12790g<FlutterRenderAppSupportSettingHandler>() {
        /* class com.tt.miniapp.settings.v2.handler.FlutterRenderAppSupportSettingHandler.C667521 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public FlutterRenderAppSupportSettingHandler mo48227b(Context... contextArr) {
            return new FlutterRenderAppSupportSettingHandler();
        }
    };
    private JSONObject mFlutterConfig;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "flutter_render_app_config";
    }

    public static final FlutterRenderAppSupportSettingHandler get() {
        return HOLDER.mo48348c(new Context[0]);
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("flutter_render_app_config", str);
    }

    public JSONObject getAppConfig(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "flutter render, app id is empty");
                return null;
            }
            if (this.mFlutterConfig == null) {
                String settingFromLocal = getSettingFromLocal("flutter_render_app_config", "");
                if (TextUtils.isEmpty(settingFromLocal)) {
                    AppBrandLogger.m52829e("FlutterRenderSupportSettingHandler", "flutter render config is empty");
                    return null;
                }
                this.mFlutterConfig = new JSONObject(settingFromLocal);
            }
            if (this.mFlutterConfig.has(str)) {
                return this.mFlutterConfig.getJSONObject(str);
            }
            AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "flutter render, app not enable");
            return null;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("FlutterRenderSupportSettingHandler", "flutter render, json error", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }

    public boolean verifyPath(String str, String str2) {
        try {
            JSONObject appConfig = getAppConfig(str);
            if (appConfig == null) {
                return false;
            }
            if (TextUtils.isEmpty(str2)) {
                AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "flutter render, startPage is empty, first page default enable");
                return true;
            }
            JSONArray optJSONArray = appConfig.optJSONArray("path");
            if (optJSONArray != null) {
                if (optJSONArray.length() != 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (str2.equals(optJSONArray.get(i))) {
                            AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "flutter render, path match success");
                            return true;
                        }
                    }
                    return false;
                }
            }
            AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "flutter render, path config is empty, all path enable");
            return true;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("FlutterRenderSupportSettingHandler", e);
        }
    }

    public boolean verifyAppVersion(String str, String str2) {
        JSONObject appConfig = getAppConfig(str);
        if (appConfig == null) {
            return false;
        }
        String optString = appConfig.optString("minMiniAppVersionCode");
        String optString2 = appConfig.optString("maxMiniAppVersionCode");
        if (!TextUtils.isEmpty(optString) || !TextUtils.isEmpty(optString2)) {
            try {
                long convertVersionStrToCode = AppbrandUtil.convertVersionStrToCode(str2);
                AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "MinAppVersion, current version: ", Long.valueOf(convertVersionStrToCode), "min config version", optString, "max config version", optString2);
                if (!TextUtils.isEmpty(optString) && convertVersionStrToCode < AppbrandUtil.convertVersionStrToCode(optString)) {
                    return false;
                }
                if (!TextUtils.isEmpty(optString2) && convertVersionStrToCode > AppbrandUtil.convertVersionStrToCode(optString2)) {
                    return false;
                }
                AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "MiniAppVersionCode match success");
                return true;
            } catch (Exception e) {
                AppBrandLogger.m52829e("FlutterRenderSupportSettingHandler", "error MiniAppVersionCode:", e);
                return false;
            }
        } else {
            AppBrandLogger.m52830i("FlutterRenderSupportSettingHandler", "not verify mini app version code, version config isEmpty");
            return true;
        }
    }
}
