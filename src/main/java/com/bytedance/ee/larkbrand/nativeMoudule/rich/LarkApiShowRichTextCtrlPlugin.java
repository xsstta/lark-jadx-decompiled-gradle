package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.C67549i;

public class LarkApiShowRichTextCtrlPlugin extends OPPlugin {

    private static class LarkApiShowRichTextCtrlResponse extends C25921b {
        private LarkApiShowRichTextCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showRichText"})
    public void showRichTextCtrlAsync(LKEvent lKEvent, RichTextData richTextData, AbstractC25905b bVar, AbstractC25897h<LarkApiShowRichTextCtrlResponse> hVar) {
        LarkApiShowRichTextCtrlResponse larkApiShowRichTextCtrlResponse = new LarkApiShowRichTextCtrlResponse();
        AppBrandLogger.m52830i("LarkApiShowRichTextCtrlPlugin", "rich text ctrl show execute");
        AbstractC67550j a = C67549i.m262706a(getAppContext()).mo234573a("showRichText");
        if (a == null) {
            larkApiShowRichTextCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            larkApiShowRichTextCtrlResponse.mErrorMessage = "rich text module is null";
            hVar.callback(larkApiShowRichTextCtrlResponse);
            return;
        }
        AppBrandLogger.m52828d("ApiShowRichTextCtrl", "ApiShowRichTextCtrl show1sss");
        try {
            if (a instanceof C13251h) {
                ((C13251h) a).mo49464a(richTextData);
            } else {
                larkApiShowRichTextCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                larkApiShowRichTextCtrlResponse.mErrorMessage = "module is not rich text module";
            }
            hVar.callback(larkApiShowRichTextCtrlResponse);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LarkApiShowRichTextCtrlPlugin", "rich text module invoke error", e);
            larkApiShowRichTextCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            larkApiShowRichTextCtrlResponse.mErrorMessage = C25611a.m91379a(e);
            hVar.callback(larkApiShowRichTextCtrlResponse);
        }
    }
}
