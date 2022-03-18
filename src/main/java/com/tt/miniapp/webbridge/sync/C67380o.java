package com.tt.miniapp.webbridge.sync;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.AbstractC67320f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.refer.common.annotation.ApiHandler;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiHandler(eventName = "showPickerView")
/* renamed from: com.tt.miniapp.webbridge.sync.o */
public class C67380o extends AbstractC67320f {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showPickerView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            final int optInt = jSONObject.optInt("current");
            JSONArray optJSONArray = jSONObject.optJSONArray("array");
            final ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            if (arrayList.size() > 0) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.webbridge.sync.C67380o.RunnableC673811 */

                    public void run() {
                        if (C67380o.this.mRender == null) {
                            AppBrandLogger.m52829e("tma_ShowPickerViewHandler", "current render is null");
                            C67380o.this.invokeHandler("current render is null");
                            return;
                        }
                        Activity currentActivity = C67380o.this.mRender.getCurrentActivity();
                        if (currentActivity == null) {
                            AppBrandLogger.m52829e("tma_ShowPickerViewHandler", "activity is null");
                            C67380o.this.invokeHandler("activity is null");
                        } else if (currentActivity.isFinishing()) {
                            AppBrandLogger.m52829e("tma_ShowPickerViewHandler", "activity is finishing");
                            C67380o.this.invokeHandler("activity is finishing");
                        } else {
                            HostDependManager.getInst().showPickerView(currentActivity, C67380o.this.mArgs, optInt, arrayList, new HostOptionUiDepend.AbstractC67691c<String>() {
                                /* class com.tt.miniapp.webbridge.sync.C67380o.RunnableC673811.C673821 */

                                @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
                                /* renamed from: a */
                                public void mo234047a() {
                                    AppBrandLogger.m52830i("tma_ShowPickerViewHandler", "ShowPickerViewHandler2 onCancel");
                                    AppbrandApplicationImpl.getInst(C67380o.this.iAppContext).getRenderViewManager().invokeHandler(C67380o.this.mRender.getRenderViewId(), C67380o.this.mCallBackId, C67380o.this.mo234060a(true, -1));
                                }

                                @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
                                /* renamed from: b */
                                public void mo234050b() {
                                    AppBrandLogger.m52830i("tma_ShowPickerViewHandler", "ShowPickerViewHandler2 onDismiss");
                                    AppbrandApplicationImpl.getInst(C67380o.this.iAppContext).getRenderViewManager().invokeHandler(C67380o.this.mRender.getRenderViewId(), C67380o.this.mCallBackId, C67380o.this.mo234060a(true, -1));
                                }

                                /* renamed from: a */
                                public void mo234062a(int i, String str) {
                                    AppBrandLogger.m52830i("tma_ShowPickerViewHandler", "ShowPickerViewHandler2 onItemPicked index ", Integer.valueOf(i), " item ", str);
                                    AppbrandApplicationImpl.getInst(C67380o.this.iAppContext).getRenderViewManager().invokeHandler(C67380o.this.mRender.getRenderViewId(), C67380o.this.mCallBackId, C67380o.this.mo234060a(false, i));
                                }
                            });
                        }
                    }
                });
                return "";
            }
            AppBrandLogger.m52829e("tma_ShowPickerViewHandler", "empty array");
            return makeFailMsg("empty array");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ShowPickerViewHandler", e);
            return makeFailMsg(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo234060a(boolean z, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("showPickerView", "cancel"));
            } else {
                jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, buildErrorMsg("showPickerView", "ok"));
                jSONObject.put("index", i);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_ShowPickerViewHandler", e);
            return CharacterUtils.empty();
        }
    }

    public C67380o(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }
}
