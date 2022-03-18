package com.ss.android.lark.meego.wrapper.common;

import com.bytedance.apm.ApmAgent;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0011\u001a\u00020\u000bJ\"\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/meego/wrapper/common/MeegoApm;", "", "()V", "MEEGO_INSTALL_PLUGIN", "", "MEEGO_LOAD_LK_FLUTTER", "MEEGO_PAGE_COST", "STAGE_RESULT", "STAGE_SHOW", "STAGE_START", "sendInstallPluginResult", "", "success", "", "cost", "", ApiHandler.API_CALLBACK_ERRMSG, "sendInstallPluginStart", "sendLoadLKFlutterResult", "sendLoadLKFlutterStart", "sendMeegoPageCost", "stage", "meego_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.meego.wrapper.a.c */
public final class MeegoApm {

    /* renamed from: a */
    public static final MeegoApm f113631a = new MeegoApm();

    private MeegoApm() {
    }

    /* renamed from: a */
    public final void mo158737a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "start");
        ApmAgent.monitorEvent("meego_install_plugin", jSONObject, null, null);
    }

    /* renamed from: b */
    public final void mo158740b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "start");
        ApmAgent.monitorEvent("meego_load_lk_flutter", jSONObject, null, null);
    }

    /* renamed from: a */
    public final void mo158738a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "stage");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cost", j);
        ApmAgent.monitorEvent("meego_page_cost", jSONObject, jSONObject2, null);
    }

    /* renamed from: b */
    public final void mo158741b(boolean z, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "result");
        jSONObject.put("success", z);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("err_msg", str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("cost", j);
        ApmAgent.monitorEvent("meego_load_lk_flutter", jSONObject, jSONObject3, jSONObject2);
    }

    /* renamed from: a */
    public final void mo158739a(boolean z, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "result");
        jSONObject.put("success", z);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("err_msg", str);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("cost", j);
        ApmAgent.monitorEvent("meego_install_plugin", jSONObject, jSONObject3, jSONObject2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m177837a(MeegoApm cVar, boolean z, long j, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        cVar.mo158741b(z, j, str);
    }
}
