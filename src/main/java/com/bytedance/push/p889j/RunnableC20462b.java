package com.bytedance.push.p889j;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.push.interfaze.AbstractC20452o;
import com.bytedance.push.p883e.C20409d;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.C59966d;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.j.b */
public final class RunnableC20462b implements Runnable {

    /* renamed from: a */
    private final String f49942a;

    /* renamed from: b */
    private final AbstractC20452o f49943b;

    public void run() {
        synchronized (RunnableC20459a.f49934a) {
            m74472a();
        }
    }

    /* renamed from: a */
    private void m74472a() {
        if (TextUtils.isEmpty(this.f49942a)) {
            C20552c.m74845a("UidSync", "action is null");
            return;
        }
        Map<Integer, C20409d> a = C20463c.m74474a(AppProvider.getApp());
        if (a == null || a.isEmpty()) {
            C20552c.m74845a("UidSync", "token is empty");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C20409d dVar : a.values()) {
            if (dVar == null || dVar.f49888c <= 0 || TextUtils.isEmpty(dVar.f49887b)) {
                C20552c.m74845a("UidSync", "invalid cache : " + dVar);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sender_id", dVar.f49888c);
                    jSONObject.put("token", dVar.f49887b);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        Map<String, String> commonParams = this.f49943b.getCommonParams();
        commonParams.put("update_event", this.f49942a);
        String a2 = C59436a.m230727a(C59966d.m232705a(), commonParams);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("sender_token_list", jSONArray.toString()));
        for (int i = 0; i < 2; i++) {
            try {
                C20552c.m74845a("UidSync", "request url = " + a2);
                NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
                reqContext.addCommonParams = false;
                if ("success".equals(new JSONObject(NetworkClient.getDefault().post(a2, arrayList, (Map<String, String>) null, reqContext)).optString("message"))) {
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public RunnableC20462b(AbstractC20452o oVar, String str) {
        this.f49943b = oVar;
        this.f49942a = str;
    }
}
