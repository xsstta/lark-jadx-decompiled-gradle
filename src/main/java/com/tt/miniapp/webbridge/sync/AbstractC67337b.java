package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.webbridge.sync.b */
public abstract class AbstractC67337b extends AbstractC67320f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo234020a(String str) {
        AppBrandLogger.m52828d("tma_BasePickerEventHandler", "timePicker onCancel");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg(str, "cancel"));
            AppbrandApplicationImpl.getInst(this.iAppContext).getRenderViewManager().invokeHandler(this.mRender.getRenderViewId(), this.mCallBackId, jSONObject.toString());
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_BasePickerEventHandler", e.getStackTrace());
        }
    }

    public AbstractC67337b(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
