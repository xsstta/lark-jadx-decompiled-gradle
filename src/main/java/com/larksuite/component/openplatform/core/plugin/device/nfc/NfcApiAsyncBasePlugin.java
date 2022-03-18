package com.larksuite.component.openplatform.core.plugin.device.nfc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3411h.AbstractC67731b;
import org.json.JSONObject;

public abstract class NfcApiAsyncBasePlugin extends OPPlugin {

    public static class NfcApiRequestModel extends C25920a {
        @JSONField(name = "__nativeBuffers__")
        public JSONArray mNativeBuffers;
        @JSONField(name = "timeout")
        public int mTimeout;
        @JSONField(name = "tech")
        public String mType;
    }

    public abstract void execute(AbstractC67731b bVar, NfcApiRequestModel nfcApiRequestModel, LKEvent lKEvent);

    public String getNfcTech() {
        return "";
    }

    /* access modifiers changed from: protected */
    public void callbackOk(LKEvent lKEvent) {
        lKEvent.mo92153t();
    }

    /* access modifiers changed from: protected */
    public void callbackOk(JSONObject jSONObject, LKEvent lKEvent) {
        lKEvent.mo92127a(jSONObject);
    }

    /* access modifiers changed from: protected */
    public void handleAPI(final LKEvent lKEvent, final NfcApiRequestModel nfcApiRequestModel) {
        final String appId = getAppContext().getAppId();
        if (TextUtils.isEmpty(appId)) {
            AppBrandLogger.m52830i("NfcApiAsyncBasePlugin", "appid is empty");
            callbackFail("appid is empty", lKEvent);
            return;
        }
        final String str = nfcApiRequestModel.mType;
        if (TextUtils.isEmpty(str)) {
            str = getNfcTech();
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("NfcApiAsyncBasePlugin", "nfc type is empty");
            callbackFail("nfc type is empty", lKEvent);
            return;
        }
        final AbstractC67730a aVar = (AbstractC67730a) getAppContext().findServiceByInterface(AbstractC67730a.class);
        if (aVar == null) {
            AppBrandLogger.m52830i("NfcApiAsyncBasePlugin", "nfc service is null");
            callbackFail("nfc service is null", lKEvent);
            return;
        }
        aVar.mo87909a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.device.nfc.NfcApiAsyncBasePlugin.RunnableC248441 */

            public void run() {
                AbstractC67730a aVar = aVar;
                AbstractC67731b a = aVar.mo87905a(appId + "_" + str);
                if (a == null) {
                    AppBrandLogger.m52830i("NfcApiAsyncBasePlugin", "nfc is null, now create one");
                    a = aVar.mo87906a(str, appId);
                }
                if (a == null) {
                    AppBrandLogger.m52830i("NfcApiAsyncBasePlugin", "nfc is null");
                    NfcApiAsyncBasePlugin.this.callbackFail("nfc is null", lKEvent);
                    return;
                }
                NfcApiAsyncBasePlugin.this.execute(a, nfcApiRequestModel, lKEvent);
            }
        });
    }
}
