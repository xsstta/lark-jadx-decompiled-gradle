package com.bytedance.vcloud.networkpredictor;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.vcloud.networkpredictor.l */
public class C20899l {

    /* renamed from: a */
    private String f51149a = "";

    /* renamed from: b */
    private ArrayList<C20900m> f51150b;

    /* renamed from: a */
    public void mo70611a(JSONObject jSONObject) throws Throwable {
        if (jSONObject != null) {
            this.f51149a = jSONObject.optString("stream_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("downinfo");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f51150b = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        C20900m mVar = new C20900m();
                        mVar.mo70612a(jSONObject2);
                        this.f51150b.add(mVar);
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
        }
    }
}
