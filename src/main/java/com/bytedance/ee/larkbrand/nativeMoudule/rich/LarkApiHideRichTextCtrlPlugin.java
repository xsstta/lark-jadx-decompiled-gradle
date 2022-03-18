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
import com.tt.miniapphost.AppbrandContext;

public class LarkApiHideRichTextCtrlPlugin extends OPPlugin {

    private static class LarkApiHideRichTextCtrlResponse extends C25921b {
        private LarkApiHideRichTextCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    public void hideRichText(LarkApiHideRichTextCtrlResponse larkApiHideRichTextCtrlResponse, AbstractC25897h<LarkApiHideRichTextCtrlResponse> hVar) {
        AppBrandLogger.m52830i("LarkApiHideRichTextCtrlPlugin", "hide rich text");
        try {
            if (getAppContext().getCurrentActivity() != null && C13251h.m54006d() != null) {
                C13251h.m54006d().dismiss();
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LarkApiHideRichTextCtrlPlugin", "rich text module invoke error", e);
            larkApiHideRichTextCtrlResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            larkApiHideRichTextCtrlResponse.mErrorMessage = C25611a.m91379a(e);
            hVar.callback(larkApiHideRichTextCtrlResponse);
        }
    }

    @LKPluginFunction(async = true, eventName = {"hideRichText"})
    public void hideRichTextCtrlAsync(LKEvent lKEvent, RichTextData richTextData, AbstractC25905b bVar, final AbstractC25897h<LarkApiHideRichTextCtrlResponse> hVar) {
        AppBrandLogger.m52830i("LarkApiHideRichTextCtrlPlugin", "rich text ctrl hide execute");
        final LarkApiHideRichTextCtrlResponse larkApiHideRichTextCtrlResponse = new LarkApiHideRichTextCtrlResponse();
        if (AppbrandContext.getMainHandler() != null) {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.LarkApiHideRichTextCtrlPlugin.RunnableC132061 */

                public void run() {
                    LarkApiHideRichTextCtrlPlugin.this.hideRichText(larkApiHideRichTextCtrlResponse, hVar);
                }
            });
        }
    }
}
