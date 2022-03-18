package com.ss.android.lark.integrator.todo.p2047a;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56258t;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.todo.a.u */
public class C40058u implements AbstractC56258t {
    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56258t
    /* renamed from: a */
    public void mo145429a(String str) {
        Statistics.sendEvent(str);
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56258t
    /* renamed from: a */
    public void mo145430a(String str, JSONObject jSONObject) {
        Statistics.sendEvent(str, jSONObject);
    }
}
