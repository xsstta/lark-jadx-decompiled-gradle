package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.ext.AbstractC67619e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.f */
public class C25156f extends ApiHandler {

    /* renamed from: a */
    public String f61437a;

    /* renamed from: b */
    public String f61438b;

    /* renamed from: c */
    public String f61439c;

    /* renamed from: d */
    public String f61440d;

    /* renamed from: e */
    public boolean f61441e;

    /* renamed from: f */
    public String f61442f;

    /* renamed from: g */
    public String f61443g;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "showModal";
    }

    public C25156f() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        AppBrandLogger.m52830i("tma_ApiShowModalDialogCtrl", this.mArgs);
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            this.f61437a = jSONObject.optString("title");
            this.f61438b = jSONObject.optString("content");
            this.f61439c = jSONObject.optString("confirmText");
            this.f61440d = jSONObject.optString("cancelText");
            this.f61441e = true;
            Object opt = jSONObject.opt("showCancel");
            if (opt instanceof Integer) {
                if (((Integer) opt).intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f61441e = z;
            } else {
                this.f61441e = jSONObject.optBoolean("showCancel", true);
            }
            this.f61442f = jSONObject.optString("confirmColor");
            this.f61443g = jSONObject.optString("cancelColor");
            if (!TextUtils.isEmpty(this.f61438b) || !TextUtils.isEmpty(this.f61437a)) {
                if (TextUtils.isEmpty(this.f61440d)) {
                    this.f61440d = C67590h.m263073a((int) R.string.microapp_m_map_dialog_cancel);
                }
                if (!this.f61441e) {
                    this.f61440d = "";
                }
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.C25156f.RunnableC251571 */

                    public void run() {
                        Activity currentActivity = C25156f.this.getAppContext().getCurrentActivity();
                        if (currentActivity != null) {
                            HostDependManager.getInst().showModal(currentActivity, C25156f.this.mArgs, C25156f.this.f61437a, C25156f.this.f61438b, C25156f.this.f61441e, C25156f.this.f61440d, C25156f.this.f61443g, C25156f.this.f61439c, C25156f.this.f61442f, new AbstractC67550j.AbstractC67551a<Integer>() {
                                /* class com.larksuite.component.openplatform.core.plugin.messenger.C25156f.RunnableC251571.C251581 */

                                /* renamed from: a */
                                public void onNativeModuleCall(Integer num) {
                                    boolean z;
                                    boolean z2;
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        AppBrandLogger.m52830i("tma_ApiShowModalDialogCtrl", "native module call, msg:" + num);
                                        if (num.intValue() == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        jSONObject.put("confirm", z);
                                        if (num.intValue() != 1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        jSONObject.put("cancel", z2);
                                        C25156f.this.callbackOk(jSONObject);
                                    } catch (JSONException e) {
                                        C25156f.this.callbackFail(e);
                                        AppBrandLogger.m52829e("tma_ApiShowModalDialogCtrl", e);
                                    }
                                }
                            }, C25156f.this.getAppContext().getCurrentActivity());
                            return;
                        }
                        C25156f.this.callbackFail(ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                        AppBrandLogger.m52829e("tma_ApiShowModalDialogCtrl", ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                    }
                });
                return;
            }
            AppBrandLogger.m52829e("tma_ApiShowModalDialogCtrl", "empty");
            callbackFail("title和content不能同时为空");
        } catch (JSONException e) {
            callbackFail(e);
        }
    }

    public C25156f(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
