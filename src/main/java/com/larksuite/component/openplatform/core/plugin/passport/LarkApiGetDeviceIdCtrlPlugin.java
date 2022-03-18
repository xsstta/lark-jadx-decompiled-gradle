package com.larksuite.component.openplatform.core.plugin.passport;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;

public class LarkApiGetDeviceIdCtrlPlugin extends OPPlugin {

    private static class LarkApiGetDeviceIdCtrlRequest extends C25920a {
        private LarkApiGetDeviceIdCtrlRequest() {
        }
    }

    private static class LarkApiGetDeviceIdCtrlResponse extends C25921b {
        @JSONField(name = "deviceID")
        public String mDeviceId;

        private LarkApiGetDeviceIdCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getDeviceID"})
    public void larkApiGetDeviceIdCtrlAsync(LKEvent lKEvent, LarkApiGetDeviceIdCtrlRequest larkApiGetDeviceIdCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<LarkApiGetDeviceIdCtrlResponse> hVar, final AbstractC25895f fVar) {
        fVar.mo92190b().mo92224i("LarkApiGetDeviceIdCtrlPlugin", "plugin process start");
        final LarkApiGetDeviceIdCtrlResponse larkApiGetDeviceIdCtrlResponse = new LarkApiGetDeviceIdCtrlResponse();
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("deviceID");
        ILogger b = fVar.mo92190b();
        b.mo92224i("LarkApiGetDeviceIdCtrlPlugin", "handle GetDeviceId api, permission:" + a);
        if (a) {
            LarkExtensionManager.getInstance().getExtension().getDeviceId(new ExtensionWrapper.AbstractC13303a() {
                /* class com.larksuite.component.openplatform.core.plugin.passport.LarkApiGetDeviceIdCtrlPlugin.C254441 */

                @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
                /* renamed from: b */
                public void mo48822b(String str) {
                    ILogger b = fVar.mo92190b();
                    b.mo92223e("LarkApiGetDeviceIdCtrlPlugin", "getDeviceId failed, msg:" + str);
                    larkApiGetDeviceIdCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    larkApiGetDeviceIdCtrlResponse.mErrorMessage = "getDeviceId failed";
                    hVar.callback(larkApiGetDeviceIdCtrlResponse);
                }

                @Override // com.bytedance.ee.larkbrand.service.ExtensionWrapper.AbstractC13303a
                /* renamed from: a */
                public void mo48821a(String str) {
                    if (str == null) {
                        larkApiGetDeviceIdCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                        larkApiGetDeviceIdCtrlResponse.mErrorMessage = "hash id failed";
                        hVar.callback(larkApiGetDeviceIdCtrlResponse);
                        fVar.mo92190b().mo92223e("LarkApiGetDeviceIdCtrlPlugin", "hash id failed");
                        return;
                    }
                    ILogger b = fVar.mo92190b();
                    b.mo92224i("LarkApiGetDeviceIdCtrlPlugin", "deviceID " + str);
                    larkApiGetDeviceIdCtrlResponse.mDeviceId = str;
                    hVar.callback(larkApiGetDeviceIdCtrlResponse);
                }
            });
            return;
        }
        larkApiGetDeviceIdCtrlResponse.mErrorCode = ApiCode.AUTHORIZE_AUTH_DENY.code;
        larkApiGetDeviceIdCtrlResponse.mErrorMessage = "no deviceID authorization";
        hVar.callback(larkApiGetDeviceIdCtrlResponse);
        fVar.mo92190b().mo92224i("LarkApiGetDeviceIdCtrlPlugin", "handle GetDeviceId api fail: no permission");
    }
}
