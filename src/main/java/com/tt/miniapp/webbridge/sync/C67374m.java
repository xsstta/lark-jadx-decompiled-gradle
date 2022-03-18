package com.tt.miniapp.webbridge.sync;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONObject;

@ApiHandler(eventName = "showKeyboard")
/* renamed from: com.tt.miniapp.webbridge.sync.m */
public class C67374m extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showKeyboard";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            if (this.mRender == null) {
                return makeFailMsg("render is null");
            }
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final String optString = jSONObject.optString(ShareHitPoint.f121869d);
            if (TextUtils.equals(optString, "text") || TextUtils.equals(optString, "digit") || TextUtils.equals(optString, "number") || TextUtils.equals(optString, "idcard")) {
                final int a = C67302a.m262173a();
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("showKeyboard", "ok"));
                jSONObject2.put("inputId", a);
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67374m.RunnableC673751 */

                    public void run() {
                        if (C67374m.this.mRender != null) {
                            C67374m.this.mRender.addNativeView(a, optString, C67374m.this.mArgs, null);
                            C67374m.this.invokeHandler(jSONObject2.toString());
                        }
                    }
                });
            }
            if (TextUtils.isEmpty(optString)) {
                final int optInt = jSONObject.optInt("inputId");
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67374m.RunnableC673762 */

                    public void run() {
                        if (C67374m.this.mRender != null) {
                            C67374m.this.mRender.showKeyboard(optInt);
                        }
                    }
                });
            }
            return CharacterUtils.empty();
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ShowKeyboardHandler", "", e);
            return makeFailMsg(e);
        }
    }

    public C67374m(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
