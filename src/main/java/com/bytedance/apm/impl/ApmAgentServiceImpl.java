package com.bytedance.apm.impl;

import android.content.Context;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.config.C2892e;
import com.bytedance.services.apm.api.C20694a;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

public class ApmAgentServiceImpl implements IApmAgent {
    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(C20694a aVar) {
        ApmAgent.monitorEvent(C2892e.m12235g().mo12478a(aVar.mo69890a()).mo12477a(aVar.mo69893d()).mo12479a(aVar.mo69891b()).mo12482b(aVar.mo69892c()).mo12483c(aVar.mo69894e()).mo12480a(aVar.mo69895f()).mo12481a());
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        ApmAgent.monitorCommonLog(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        ApmAgent.monitorExceptionLog(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorLog(String str, JSONObject jSONObject) {
        ApmAgent.monitorCommonLog(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ApmAgent.monitorDuration(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        ApmAgent.monitorStatusRate(str, i, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ApmAgent.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        ApmAgent.monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
        ApmAgent.reportLegacyMonitorLog(C2785b.m11735a(), j, j2, z);
    }
}
