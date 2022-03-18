package com.tt.miniapp.webbridge.sync;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.picker.wheel.C65949b;
import com.tt.miniapp.component.nativeview.picker.wheel.entity.C65964a;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "updateMultiPickerView")
/* renamed from: com.tt.miniapp.webbridge.sync.y */
public class C67400y extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "updateMultiPickerView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final int optInt = jSONObject.optInt("column");
            final int optInt2 = jSONObject.optInt("current");
            final ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("array");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67400y.RunnableC674011 */

                public void run() {
                    C65949b b = C65964a.m258366a().mo230926b();
                    if (b != null) {
                        b.mo230899a(optInt, arrayList, optInt2);
                        return;
                    }
                    AppBrandLogger.m52829e("UpdateMultiPickerViewHandler", "multi picker is null");
                    C67400y yVar = C67400y.this;
                    yVar.invokeHandler(yVar.makeFailMsg("multi picker is null"));
                }
            });
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("updateMultiPickerView", "ok"));
            return jSONObject2.toString();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("UpdateMultiPickerViewHandler", e);
            return makeFailMsg(e);
        }
    }

    public C67400y(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
