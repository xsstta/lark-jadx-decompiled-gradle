package com.bytedance.ee.larkbrand.p659i;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.i.e */
public class C13131e extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateMap";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            final int optInt = new JSONObject(this.mArgs).optInt("mapId");
            AppBrandLogger.m52830i("UpdateMapHandler", this.mArgs);
            if (this.mRender != null) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.bytedance.ee.larkbrand.p659i.C13131e.RunnableC131321 */

                    public void run() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (C13131e.this.mRender != null) {
                                C13131e.this.mRender.updateNativeView(optInt, C13131e.this.mArgs, null);
                                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C13131e.this.buildErrorMsg("updateMap", "ok"));
                                AppbrandApplicationImpl.getInst(C13131e.this.iAppContext).getRenderViewManager().invokeHandler(C13131e.this.mRender.getRenderViewId(), C13131e.this.mCallBackId, jSONObject.toString());
                            }
                        } catch (Exception e) {
                            AppBrandLogger.stacktrace(6, "UpdateMapHandler", e.getStackTrace());
                            try {
                                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C13131e.this.buildErrorMsg("updateMap", "fail"));
                                AppbrandApplicationImpl.getInst(C13131e.this.iAppContext).getRenderViewManager().invokeHandler(C13131e.this.mRender.getRenderViewId(), C13131e.this.mCallBackId, jSONObject.toString());
                            } catch (Exception e2) {
                                AppBrandLogger.m52829e("UpdateMapHandler", "updateMap", e2);
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "UpdateMapHandler", e.getStackTrace());
        }
        return CharacterUtils.empty();
    }

    public C13131e(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
