package com.bytedance.ee.lark.component.p607a.p608a;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ee.lark.component.AbstractC12716a;
import com.bytedance.ee.lark.component.C12733b;
import com.bytedance.ee.lark.component.p607a.p611d.C12723a;
import com.bytedance.ee.lark.component.p607a.p612e.AbstractC12726c;
import com.bytedance.ee.lark.component.p607a.p612e.C12725b;
import com.bytedance.ee.lark.component.p607a.p613f.C12730a;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.component.a.a.c */
public class C12720c implements BridgeHandler<String, LarkWebView> {

    /* renamed from: a */
    private C12725b f34064a;

    /* renamed from: b */
    private AbstractC12726c f34065b;

    /* renamed from: c */
    private String f34066c;

    /* renamed from: d */
    private OPTrace f34067d;

    @Override // com.bytedance.ee.larkwebview.bridge.BridgeHandler
    /* renamed from: a */
    public boolean mo30817a() {
        return true;
    }

    /* renamed from: a */
    public void mo30815a(String str, JsCallBack gVar, String str2, LarkWebView larkWebView) {
        m52640a(str);
        if (TextUtils.isEmpty(str)) {
            m52639a(C12719b.f34058i, null, gVar, Status.FAILURE, new JSONObject());
            Log.m165389i("NativeComponentBridge", "data is empty");
            return;
        }
        AbstractC12726c b = C12733b.m52710a().mo48223b();
        this.f34065b = b;
        if (b == null) {
            Log.m165383e("NativeComponentBridge", "registerHandler, componentTypeProvider is null, handlerName = " + this.f34066c);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(ShareHitPoint.f121869d);
            if (this.f34065b.mo48196a(larkWebView, optString) == null && this.f34065b.mo48197a(optString) == null) {
                Log.m165383e("NativeComponentBridge", "NativeComponentHandler handle, component: " + optString + " not registered");
                m52639a(C12719b.f34055f, jSONObject, gVar, Status.FAILURE, jSONObject);
                return;
            }
            m52643a(jSONObject, gVar, larkWebView);
        } catch (JSONException e) {
            Log.m165389i("NativeComponentBridge", "NativeComponentHandler error, handler = " + this.f34066c + " e: " + e);
            m52639a(C12719b.f34058i, null, gVar, Status.FAILURE, new JSONObject());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m52640a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.lark.component.p607a.p608a.C12720c.m52640a(java.lang.String):void");
    }

    public C12720c(String str, C12725b bVar) {
        this.f34066c = str;
        this.f34064a = bVar;
    }

    /* renamed from: c */
    private void m52646c(JSONObject jSONObject, JsCallBack gVar) {
        this.f34064a.mo48194b(jSONObject.optString("id"));
        m52639a(C12719b.f34053d, jSONObject, gVar, Status.SUCCESS, new JSONObject());
    }

    /* renamed from: a */
    private void m52638a(C12719b bVar, JSONObject jSONObject) {
        String str;
        OPMonitorCode oPMonitorCode = new OPMonitorCode("client.open_platform.api.common", 10003, OPMonitorLevel.NORMAL, "native_callback_invoke");
        String str2 = "";
        if (jSONObject != null) {
            str2 = jSONObject.optString(ShareHitPoint.f121869d);
            str = jSONObject.optString("method");
        } else {
            str = str2;
        }
        OPMonitor oPMonitor = new OPMonitor(oPMonitorCode);
        oPMonitor.addCategoryValue(ApiHandler.API_CALLBACK_ERRMSG, bVar.f34063c);
        oPMonitor.addCategoryValue("innerMsg", bVar.f34063c);
        oPMonitor.addCategoryValue("errCode", Integer.valueOf(bVar.f34061a));
        oPMonitor.addCategoryValue("innerCode", Integer.valueOf(bVar.f34062b));
        oPMonitor.addCategoryValue("is_native_component", 1);
        oPMonitor.addCategoryValue("native_component_type", str2);
        if (!TextUtils.isEmpty(str)) {
            oPMonitor.addCategoryValue("native_component_method", str);
        }
        oPMonitor.flush(this.f34067d);
        this.f34067d.finish(new OPMonitor("monitor_batch_report", OPTrace.Companion.mo170884a()));
    }

    /* renamed from: b */
    private void m52644b(JSONObject jSONObject, JsCallBack gVar) {
        String optString = jSONObject.optString("id");
        jSONObject.optString(ShareHitPoint.f121869d);
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject == null) {
            Log.m165383e("NativeComponentBridge", "updateNativeComponent error with empty data");
            m52639a(C12719b.f34058i, null, gVar, Status.FAILURE, new JSONObject());
            return;
        }
        AbstractC12716a a = this.f34064a.mo48188a(optString);
        if (a == null) {
            Log.m165383e("NativeComponentBridge", "updateNativeComponent, nativeBaseComponent not exist");
            m52639a(C12719b.f34060k, null, gVar, Status.FAILURE, new JSONObject());
            return;
        }
        a.updateData(com.alibaba.fastjson.JSONObject.parseObject(optJSONObject.toString()));
        this.f34064a.mo48193b(a);
        m52639a(C12719b.f34053d, jSONObject, gVar, Status.SUCCESS, new JSONObject());
    }

    /* renamed from: a */
    private void m52642a(JSONObject jSONObject, JsCallBack gVar) {
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString(ShareHitPoint.f121869d);
        Log.m165379d("NativeComponentBridge", "insertNativeComponent, id = " + optString + " type = " + optString2);
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject == null) {
            Log.m165383e("NativeComponentBridge", "insertNativeComponent error with empty data");
            m52639a(C12719b.f34058i, null, gVar, Status.FAILURE, new JSONObject());
            return;
        }
        try {
            if (this.f34064a.mo48188a(optString) != null) {
                Log.m165383e("NativeComponentBridge", "insertNativeComponent already inserted");
                m52639a(C12719b.f34059j, null, gVar, Status.FAILURE, new JSONObject());
                return;
            }
            AbstractC12716a a = this.f34065b.mo48195a(this.f34064a.mo48187a(), optString, optString2);
            if (a == null) {
                Log.m165383e("NativeComponentBridge", "insertNativeComponent, nativeBaseComponent not exist");
                m52639a(C12719b.f34060k, null, gVar, Status.FAILURE, new JSONObject());
            } else if (this.f34064a.mo48187a().mo48166a() == null) {
                Log.m165383e("NativeComponentBridge", "insertNativeComponent, context is null");
                m52639a(C12719b.f34057h, null, gVar, Status.FAILURE, new JSONObject());
            } else {
                C12730a aVar = new C12730a(this.f34064a.mo48187a().mo48166a());
                aVar.setNativeComponentProvider(this.f34064a);
                aVar.mo48208b(optString);
                a.bindContainer(aVar);
                a.bindData(new C12723a(optString, optString2, com.alibaba.fastjson.JSONObject.parseObject(optJSONObject.toString())));
                this.f34064a.mo48190a(a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", optString);
                m52639a(C12719b.f34053d, jSONObject, gVar, Status.SUCCESS, jSONObject2);
            }
        } catch (JSONException e) {
            Log.m165383e("NativeComponentBridge", "insertNativeComponent exception = " + e);
            m52639a(C12719b.f34058i, null, gVar, Status.FAILURE, new JSONObject());
        }
    }

    /* renamed from: b */
    private void m52645b(JSONObject jSONObject, JsCallBack gVar, LarkWebView larkWebView) {
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("method");
        Log.m165379d("NativeComponentBridge", "nativeComponentDispatchAction, id = " + optString + " method = " + optString2);
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject == null) {
            Log.m165383e("NativeComponentBridge", "nativeComponentDispatchAction error with empty data");
            m52639a(C12719b.f34058i, null, gVar, Status.FAILURE, new JSONObject());
            return;
        }
        AbstractC12716a a = this.f34064a.mo48188a(optString);
        if (a == null) {
            Log.m165383e("NativeComponentBridge", "updateNativeComponent, nativeBaseComponent not exist");
            m52639a(C12719b.f34060k, null, gVar, Status.FAILURE, new JSONObject());
        } else if ("reRender".equals(optString2)) {
            m52641a(optString, gVar, larkWebView);
        } else {
            a.performAction(optString2, com.alibaba.fastjson.JSONObject.parseObject(optJSONObject.toString()));
            m52639a(C12719b.f34053d, jSONObject, gVar, Status.SUCCESS, new JSONObject());
        }
    }

    /* renamed from: a */
    private void m52641a(String str, JsCallBack gVar, LarkWebView larkWebView) {
        AbstractC12716a a = this.f34064a.mo48188a(str);
        if (a == null) {
            Log.m165383e("NativeComponentBridge", "reRender, nativeBaseComponent not exist");
            m52639a(C12719b.f34060k, null, gVar, Status.FAILURE, new JSONObject());
            return;
        }
        ViewGroup container = a.getContainer();
        if (container == null) {
            Log.m165383e("NativeComponentBridge", "reRender, nativeBaseComponent not exist");
            m52639a(C12719b.f34057h, null, gVar, Status.FAILURE, new JSONObject());
        } else if (container.getParent() != null) {
            Log.m165383e("NativeComponentBridge", "reRender, nativeLayout has already added");
            m52639a(C12719b.f34053d, new JSONObject(), gVar, Status.SUCCESS, new JSONObject());
        } else {
            this.f34064a.mo48191a(larkWebView, str, a.getContainer());
            m52639a(C12719b.f34053d, new JSONObject(), gVar, Status.SUCCESS, new JSONObject());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private void m52643a(JSONObject jSONObject, JsCallBack gVar, LarkWebView larkWebView) {
        String str = this.f34066c;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095915653:
                if (str.equals("deleteNativeComponent")) {
                    c = 0;
                    break;
                }
                break;
            case -345754730:
                if (str.equals("nativeComponentDispatchAction")) {
                    c = 1;
                    break;
                }
                break;
            case 480322221:
                if (str.equals("insertNativeComponent")) {
                    c = 2;
                    break;
                }
                break;
            case 1970446463:
                if (str.equals("updateNativeComponentAttribute")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m52646c(jSONObject, gVar);
                break;
            case 1:
                break;
            case 2:
                m52642a(jSONObject, gVar);
                return;
            case 3:
                m52644b(jSONObject, gVar);
                return;
            default:
                Log.m165383e("NativeComponentBridge", "no handler handle api = " + this.f34066c);
                return;
        }
        m52645b(jSONObject, gVar, larkWebView);
    }

    /* renamed from: a */
    private void m52639a(C12719b bVar, JSONObject jSONObject, JsCallBack gVar, Status status, JSONObject jSONObject2) {
        Log.m165389i("NativeComponentBridge", "callbackResult, handleName = " + this.f34066c + " status = " + status);
        m52638a(bVar, jSONObject);
        gVar.mo49778a(status, jSONObject2);
    }
}
