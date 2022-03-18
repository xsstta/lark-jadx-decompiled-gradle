package com.tt.miniapp.webbridge.sync.p3355a;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapp.webbridge.sync.p3355a.C67326b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.C67589g;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "showPopoverMenu")
/* renamed from: com.tt.miniapp.webbridge.sync.a.c */
public class C67332c extends AbstractC67320f implements C67326b.AbstractC67331d {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showPopoverMenu";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            AppBrandLogger.m52830i("ShowPopoverHandler", "show popover:" + this.mArgs);
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final JSONArray optJSONArray = jSONObject.optJSONArray("items");
            final JSONObject optJSONObject = jSONObject.optJSONObject("position");
            final String optString = jSONObject.optString("tag");
            final double optDouble = jSONObject.optDouble("offsetTop", 0.0d);
            final double optDouble2 = jSONObject.optDouble("offsetBottom", 0.0d);
            if (!(optJSONArray == null || optJSONObject == null)) {
                if (optJSONArray.length() != 0) {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.tt.miniapp.webbridge.sync.p3355a.C67332c.RunnableC673331 */

                        public void run() {
                            RenderViewManager.IRender currentIRender = AppbrandApplicationImpl.getInst(C67332c.this.iAppContext).getRenderViewManager().getCurrentIRender();
                            if (currentIRender == null) {
                                AppBrandLogger.m52829e("ShowPopoverHandler", "iRender is null");
                                C67332c.this.callbackFail(C25906a.f64077g.f64115H, "iRender is null");
                                return;
                            }
                            int titleBarHeight = currentIRender.getTitleBarHeight();
                            Context currentActivity = C67332c.this.iAppContext.getCurrentActivity();
                            if (currentActivity == null) {
                                currentActivity = AppbrandContext.getInst().getApplicationContext();
                            }
                            if (currentActivity != null) {
                                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                                Rect rect = new Rect();
                                C67332c.this.mo234016a(optJSONArray, linkedHashMap);
                                C67332c.this.mo234017a(optJSONObject, rect, titleBarHeight);
                                C67326b.m262211a(C67332c.this.iAppContext).mo234000a(C67332c.this.iAppContext, currentIRender, linkedHashMap, rect, optString, optDouble, optDouble2, C67332c.this);
                                return;
                            }
                            AppBrandLogger.m52829e("ShowPopoverHandler", "context is null");
                            C67332c.this.callbackFail(ApiErrorCode.INNER_CONTEXT_ERROR.code, ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                        }
                    });
                    return CharacterUtils.empty();
                }
            }
            callbackFail(C25906a.f64072b.f64115H, C25906a.f64072b.f64117J);
            AppBrandLogger.m52829e("ShowPopoverHandler", "show popover, invalid param");
            return CharacterUtils.empty();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("ShowPopoverHandler", e);
            callbackFail(ApiErrorCode.INTERNAL_ERROR_JSON.code, ApiErrorCode.INTERNAL_ERROR_JSON.msg);
        }
    }

    @Override // com.tt.miniapp.webbridge.sync.p3355a.C67326b.AbstractC67331d
    /* renamed from: a */
    public void mo234015a(boolean z) {
        if (z) {
            callbackOk();
        } else {
            callbackFail(C25906a.f64077g.f64115H, "popover show failed");
        }
    }

    /* renamed from: a */
    public void mo234016a(JSONArray jSONArray, LinkedHashMap<String, String> linkedHashMap) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
            if (jSONObject != null) {
                linkedHashMap.put(jSONObject.optString("id"), jSONObject.optString("text"));
            }
        }
    }

    public C67332c(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    public void mo234017a(JSONObject jSONObject, Rect rect, int i) {
        rect.set(C67589g.m263062a((double) jSONObject.optInt("left", 0)), C67589g.m263062a((double) jSONObject.optInt("top", 0)) + i, C67589g.m263062a((double) jSONObject.optInt("right", 0)), C67589g.m263062a((double) jSONObject.optInt("bottom", 0)) + i);
    }
}
