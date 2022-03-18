package com.bytedance.ee.larkbrand.p659i;

import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.larkbrand.p648c.C12980b;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.i.c */
public class C13127c extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "operateMapContext";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            AppBrandLogger.m52830i("OperateMapContextHandler", this.mArgs);
            final JSONObject jSONObject = new JSONObject(this.mArgs);
            int optInt = jSONObject.optInt("mapId");
            final String optString = jSONObject.optString(ShareHitPoint.f121869d);
            if (this.mRender == null) {
                AppBrandLogger.m52829e("OperateMapContextHandler", "mRender is null");
                callbackFail("render is null");
                return CharacterUtils.empty();
            }
            final C12980b bVar = null;
            View nativeView = this.mRender.getNativeView(optInt);
            if (nativeView instanceof C12980b) {
                bVar = (C12980b) nativeView;
            }
            if (bVar == null) {
                String str = "mapView not found: " + optInt;
                AppBrandLogger.m52829e("OperateMapContextHandler", str);
                callbackFail(str);
                return CharacterUtils.empty();
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.p659i.C13127c.RunnableC131281 */

                public void run() {
                    if ("moveToLocation".equals(optString)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        if (optJSONObject == null || !optJSONObject.has("latitude") || !optJSONObject.has("longitude")) {
                            bVar.mo48884a();
                        } else {
                            bVar.mo48885a(optJSONObject.optDouble("latitude"), optJSONObject.optDouble("longitude"));
                        }
                        C13127c.this.callbackOk();
                    }
                }
            });
            return CharacterUtils.empty();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("OperateMapContextHandler", e);
            callbackFail("json exception: " + e.getMessage());
        }
    }

    public C13127c(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
