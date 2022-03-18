package com.tt.miniapp.webbridge.sync;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.refer.common.annotation.ApiHandler;
import org.json.JSONArray;
import org.json.JSONObject;

@ApiHandler(eventName = "showRegionPickerView")
/* renamed from: com.tt.miniapp.webbridge.sync.p */
public class C67383p extends AbstractC67337b {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showRegionPickerView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        final String[] strArr;
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            JSONArray optJSONArray = jSONObject.optJSONArray("current");
            final String optString = jSONObject.optString("customItem", null);
            if (optJSONArray == null) {
                strArr = null;
            } else {
                strArr = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    strArr[i] = optJSONArray.getString(i);
                }
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67383p.RunnableC673841 */

                public void run() {
                    if (C67383p.this.mRender == null) {
                        AppBrandLogger.m52829e("tma_ShowRegionPickerViewHandler", "current render is null");
                        C67383p pVar = C67383p.this;
                        pVar.invokeHandler(pVar.makeFailMsg("current render is null"));
                        return;
                    }
                    Activity currentActivity = C67383p.this.mRender.getCurrentActivity();
                    if (currentActivity == null) {
                        AppBrandLogger.m52829e("tma_ShowRegionPickerViewHandler", "activity is null");
                        C67383p pVar2 = C67383p.this;
                        pVar2.invokeHandler(pVar2.makeFailMsg("activity is null"));
                        return;
                    }
                    C67383p.this.mo234064a(currentActivity, strArr, optString);
                }
            });
        } catch (Exception e) {
            invokeHandler(makeFailMsg(e));
            AppBrandLogger.m52829e("tma_ShowRegionPickerViewHandler", e);
        }
        return null;
    }

    public C67383p(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    public void mo234064a(Activity activity, String[] strArr, String str) {
        HostDependManager.getInst().showRegionPickerView(activity, str, strArr, new HostOptionUiDepend.AbstractC67693e() {
            /* class com.tt.miniapp.webbridge.sync.C67383p.C673852 */

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: a */
            public void mo234047a() {
                AppBrandLogger.m52830i("tma_ShowRegionPickerViewHandler", "onWheeled onCancel");
                C67383p.this.mo234020a("showRegionPickerView");
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: b */
            public void mo234050b() {
                AppBrandLogger.m52830i("tma_ShowRegionPickerViewHandler", "onWheeled onDismiss");
                C67383p.this.mo234020a("showRegionPickerView");
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67693e
            /* renamed from: a */
            public void mo234067a(String[] strArr, String[] strArr2) {
                AppBrandLogger.m52828d("tma_ShowRegionPickerViewHandler", "onWheeled onConfirm");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67383p.this.buildErrorMsg("showRegionPickerView", "ok"));
                    JSONArray jSONArray = new JSONArray();
                    for (String str : strArr) {
                        jSONArray.put(str);
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    for (String str2 : strArr2) {
                        jSONArray2.put(str2);
                    }
                    jSONObject.put("value", jSONArray);
                    jSONObject.put("code", jSONArray2);
                    AppbrandApplicationImpl.getInst(C67383p.this.iAppContext).getRenderViewManager().invokeHandler(C67383p.this.mRender.getRenderViewId(), C67383p.this.mCallBackId, jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ShowRegionPickerViewHandler", e);
                    C67383p pVar = C67383p.this;
                    pVar.invokeHandler(pVar.makeFailMsg(e));
                }
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67693e
            /* renamed from: a */
            public void mo234066a(int i, int i2, Object obj) {
                AppBrandLogger.m52828d("tma_ShowRegionPickerViewHandler", "onWheeled column", Integer.valueOf(i), " index ", Integer.valueOf(i2), " item ", obj);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("column", i);
                    jSONObject.put("current", i2);
                    AppbrandApplicationImpl.getInst(C67383p.this.iAppContext).getRenderViewManager().publish(C67383p.this.mRender.getRenderViewId(), "onRegionPickerViewChange", jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ShowRegionPickerViewHandler", e);
                }
            }
        });
    }
}
