package com.tt.miniapp.settings.v2.handler;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.AbstractC12790g;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.tt.miniapphost.util.AppbrandUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class FlutterRenderGlobalSupportSettingHandler extends AbstractC12744b {
    private static final AbstractC12790g<FlutterRenderGlobalSupportSettingHandler> HOLDER = new AbstractC12790g<FlutterRenderGlobalSupportSettingHandler>() {
        /* class com.tt.miniapp.settings.v2.handler.FlutterRenderGlobalSupportSettingHandler.C667531 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public FlutterRenderGlobalSupportSettingHandler mo48227b(Context... contextArr) {
            return new FlutterRenderGlobalSupportSettingHandler();
        }
    };
    private JSONObject mFlutterConfig;

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public String getSettingKey() {
        return "flutter_render_global_config";
    }

    public static final FlutterRenderGlobalSupportSettingHandler get() {
        return HOLDER.mo48348c(new Context[0]);
    }

    private JSONObject getClientConfig() {
        try {
            if (this.mFlutterConfig == null) {
                String settingFromLocal = getSettingFromLocal("flutter_render_global_config", "");
                if (TextUtils.isEmpty(settingFromLocal)) {
                    AppBrandLogger.m52829e("FlutterRenderGlobalSupportSettingHandler", "flutter render config is empty");
                    return null;
                }
                this.mFlutterConfig = new JSONObject(settingFromLocal);
            }
            return this.mFlutterConfig;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("FlutterRenderGlobalSupportSettingHandler", "flutter render, json error", e);
            return null;
        }
    }

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void saveSettingFromRemote(String str) {
        C12782a.m52834a("flutter_render_global_config", str);
    }

    public boolean verifyJsVersion(String str) {
        JSONObject clientConfig = getClientConfig();
        AppBrandLogger.m52830i("FlutterRenderGlobalSupportSettingHandler", "flutter render， client config", clientConfig);
        if (clientConfig == null) {
            return false;
        }
        String optString = clientConfig.optString("minJsSdkVersionCode");
        String optString2 = clientConfig.optString("maxJsSdkVersionCode");
        if (!TextUtils.isEmpty(optString) || !TextUtils.isEmpty(optString2)) {
            try {
                long convertVersionStrToCode = AppbrandUtil.convertVersionStrToCode(str);
                AppBrandLogger.m52830i("FlutterRenderGlobalSupportSettingHandler", "clientVersion, current version: ", Long.valueOf(convertVersionStrToCode), "min config version", optString, "max config version", optString2);
                if (!TextUtils.isEmpty(optString) && convertVersionStrToCode < AppbrandUtil.convertVersionStrToCode(optString)) {
                    return false;
                }
                if (!TextUtils.isEmpty(optString2) && convertVersionStrToCode > AppbrandUtil.convertVersionStrToCode(optString2)) {
                    return false;
                }
                AppBrandLogger.m52830i("FlutterRenderGlobalSupportSettingHandler", "js sdk version match success");
                return true;
            } catch (Exception e) {
                AppBrandLogger.m52829e("FlutterRenderGlobalSupportSettingHandler", "error js sdk version code", e);
                return false;
            }
        } else {
            AppBrandLogger.m52830i("FlutterRenderGlobalSupportSettingHandler", "not verify js sdk version code, version config isEmpty");
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12744b
    public String loadConfig(String str, String str2) {
        return C12782a.m52838b(str, str2);
    }
}
