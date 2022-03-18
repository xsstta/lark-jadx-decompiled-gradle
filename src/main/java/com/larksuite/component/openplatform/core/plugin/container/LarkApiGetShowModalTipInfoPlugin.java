package com.larksuite.component.openplatform.core.plugin.container;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.suite.R;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.C67432a;

public class LarkApiGetShowModalTipInfoPlugin extends OPPlugin {

    private static class LarkApiGetShowModalTipInfoRequest extends C25920a {
        private LarkApiGetShowModalTipInfoRequest() {
        }
    }

    private static class LarkApiGetShowModalTipInfoResponse extends C25921b {
        @JSONField(name = "cancelText")
        public String mCancelText;
        @JSONField(name = "confirmText")
        public String mConfirmText;
        @JSONField(name = "title")
        public String mTitle;

        private LarkApiGetShowModalTipInfoResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"getShowModalTipInfo"})
    public void larkApiGetShowModalTipInfoAsync(LKEvent lKEvent, LarkApiGetShowModalTipInfoRequest larkApiGetShowModalTipInfoRequest, AbstractC25905b bVar, AbstractC25897h<LarkApiGetShowModalTipInfoResponse> hVar) {
        LarkApiGetShowModalTipInfoResponse larkApiGetShowModalTipInfoResponse = new LarkApiGetShowModalTipInfoResponse();
        if (getAppContext().getCurrentActivity() == null || C67432a.m262319a(getAppContext()).getAppInfo() == null) {
            larkApiGetShowModalTipInfoResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            hVar.callback(larkApiGetShowModalTipInfoResponse);
            AppBrandLogger.m52829e("LarkApiGetShowModalTipInfo", "appbrandcontext activity is null");
            return;
        }
        larkApiGetShowModalTipInfoResponse.mTitle = getAppContext().getCurrentActivity().getString(R.string.lark_brand_show_modal_tip_title, new Object[]{C67432a.m262319a(getAppContext()).getAppInfo().appName});
        larkApiGetShowModalTipInfoResponse.mConfirmText = getAppContext().getCurrentActivity().getString(R.string.lark_brand_show_modal_tip_confirm);
        larkApiGetShowModalTipInfoResponse.mCancelText = getAppContext().getCurrentActivity().getString(R.string.lark_brand_show_modal_tip_cancel);
        hVar.callback(larkApiGetShowModalTipInfoResponse);
    }
}
