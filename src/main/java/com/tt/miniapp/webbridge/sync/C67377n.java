package com.tt.miniapp.webbridge.sync;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@ApiHandler(eventName = "showMultiPickerView")
/* renamed from: com.tt.miniapp.webbridge.sync.n */
public class C67377n extends AbstractC67337b {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showMultiPickerView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            JSONArray jSONArray = jSONObject.getJSONArray("array");
            final ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    if (jSONArray2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList.add(arrayList2);
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            arrayList2.add(jSONArray2.getString(i2));
                        }
                    }
                }
            }
            int size = arrayList.size();
            if (size == 0) {
                AppBrandLogger.m52829e("tma_ShowMultiPickerViewHandler", "empty array");
                return makeFailMsg("empty array");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("current");
            final int[] iArr = new int[arrayList.size()];
            if (optJSONArray != null) {
                for (int i3 = 0; i3 < size; i3++) {
                    iArr[i3] = optJSONArray.getInt(i3);
                }
            }
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.tt.miniapp.webbridge.sync.C67377n.RunnableC673781 */

                public void run() {
                    if (C67377n.this.mRender == null) {
                        AppBrandLogger.m52829e("tma_ShowMultiPickerViewHandler", "current render is null");
                        C67377n nVar = C67377n.this;
                        nVar.invokeHandler(nVar.makeFailMsg("current render is null"));
                        return;
                    }
                    Activity currentActivity = C67377n.this.mRender.getCurrentActivity();
                    if (currentActivity == null) {
                        AppBrandLogger.m52829e("tma_ShowMultiPickerViewHandler", "activity is null");
                        C67377n nVar2 = C67377n.this;
                        nVar2.invokeHandler(nVar2.makeFailMsg("activity is null"));
                        return;
                    }
                    C67377n.this.mo234056a(currentActivity, arrayList, iArr);
                }
            });
            return null;
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ShowMultiPickerViewHandler", e);
            return makeFailMsg(e);
        }
    }

    public C67377n(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    public void mo234056a(Activity activity, List<List<String>> list, int[] iArr) {
        HostDependManager.getInst().showMultiPickerView(activity, this.mArgs, list, iArr, new HostOptionUiDepend.AbstractC67690b() {
            /* class com.tt.miniapp.webbridge.sync.C67377n.C673792 */

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: a */
            public void mo234047a() {
                AppBrandLogger.m52830i("tma_ShowMultiPickerViewHandler", "onWheeled onCancel");
                C67377n.this.mo234020a("showMultiPickerView");
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: b */
            public void mo234050b() {
                AppBrandLogger.m52830i("tma_ShowMultiPickerViewHandler", "onWheeled onDismiss");
                C67377n.this.mo234020a("showMultiPickerView");
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67690b
            /* renamed from: a */
            public void mo234059a(int[] iArr) {
                AppBrandLogger.m52828d("tma_ShowMultiPickerViewHandler", "onWheeled onConfirm");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67377n.this.buildErrorMsg("showMultiPickerView", "ok"));
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("current", jSONArray);
                    AppbrandApplicationImpl.getInst(C67377n.this.iAppContext).getRenderViewManager().invokeHandler(C67377n.this.mRender.getRenderViewId(), C67377n.this.mCallBackId, jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ShowMultiPickerViewHandler", e);
                    C67377n nVar = C67377n.this;
                    nVar.invokeHandler(nVar.makeFailMsg(e));
                }
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67690b
            /* renamed from: a */
            public void mo234058a(int i, int i2, Object obj) {
                AppBrandLogger.m52830i("tma_ShowMultiPickerViewHandler", "onWheeled column", Integer.valueOf(i), " index ", Integer.valueOf(i2), " item ", obj);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("column", i);
                    jSONObject.put("current", i2);
                    AppbrandApplicationImpl.getInst(C67377n.this.iAppContext).getRenderViewManager().publish(C67377n.this.mRender.getRenderViewId(), "onMultiPickerViewChange", jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ShowMultiPickerViewHandler", e);
                }
            }
        });
    }
}
