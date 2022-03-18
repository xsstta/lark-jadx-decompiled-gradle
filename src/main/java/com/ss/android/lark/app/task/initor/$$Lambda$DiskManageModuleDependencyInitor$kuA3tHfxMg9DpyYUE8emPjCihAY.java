package com.ss.android.lark.app.task.initor;

import com.bytedance.apm.ApmAgent;
import com.ss.android.lark.diskmanage.monitor.C36830d;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.app.task.initor.-$$Lambda$DiskManageModuleDependencyInitor$kuA3tHfxMg9DpyYUE8emPjCihAY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DiskManageModuleDependencyInitor$kuA3tHfxMg9DpyYUE8emPjCihAY implements C36830d.AbstractC36831a {
    public static final /* synthetic */ $$Lambda$DiskManageModuleDependencyInitor$kuA3tHfxMg9DpyYUE8emPjCihAY INSTANCE = new $$Lambda$DiskManageModuleDependencyInitor$kuA3tHfxMg9DpyYUE8emPjCihAY();

    private /* synthetic */ $$Lambda$DiskManageModuleDependencyInitor$kuA3tHfxMg9DpyYUE8emPjCihAY() {
    }

    @Override // com.ss.android.lark.diskmanage.monitor.C36830d.AbstractC36831a
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ApmAgent.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }
}
