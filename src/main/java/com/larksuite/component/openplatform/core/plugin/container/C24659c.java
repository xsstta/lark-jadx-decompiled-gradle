package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapp.manager.C66417c;
import com.tt.miniapp.p3289g.p3292c.C66186c;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.C67432a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.c */
public class C24659c extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "getUsageRecord";
    }

    public C24659c() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        try {
            int optInt = new JSONObject(this.f168426a).optInt(ShareHitPoint.f121869d, 1);
            List arrayList = new ArrayList();
            arrayList.add(C67432a.m262319a(mo232455f()).getAppInfo().appId);
            if (optInt == 1) {
                arrayList = C67053q.m261332c(mo232455f());
            }
            JSONObject a = m89736a(arrayList);
            if (a != null) {
                return mo232446a(new JSONObject().put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, a));
            }
            return mo232451b("Miniapp Usage Record List is null");
        } catch (JSONException e) {
            AppBrandLogger.m52829e("SyncMsgCtrl", e);
            return mo232445a(e);
        }
    }

    public C24659c(String str) {
        super(str);
    }

    /* renamed from: a */
    private static JSONObject m89736a(List<String> list) {
        String str;
        if (list == null || list.isEmpty()) {
            AppBrandLogger.m52829e("SyncMsgCtrl", "getMiniappUsageRecordList appidList is empty");
            return null;
        }
        List<C66186c> a = C66417c.m259663a().mo231955b().mo231518a(list);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C66186c cVar : a) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appID", cVar.f167066a);
                jSONObject2.put("startTime", cVar.f167067b);
                jSONObject2.put("duration", cVar.f167068c);
                String str2 = "0";
                if (TextUtils.isEmpty(cVar.f167069d)) {
                    str = str2;
                } else {
                    str = cVar.f167069d;
                }
                jSONObject2.put("scene", str);
                if (!TextUtils.isEmpty(cVar.f167070e)) {
                    str2 = cVar.f167070e;
                }
                jSONObject2.put("subScene", str2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("records", jSONArray);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("SyncMsgCtrl", e);
        }
        AppBrandLogger.m52828d("SyncMsgCtrl", "result = ", jSONObject.toString());
        return jSONObject;
    }
}
