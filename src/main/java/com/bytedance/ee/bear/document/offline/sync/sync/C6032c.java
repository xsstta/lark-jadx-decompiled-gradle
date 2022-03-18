package com.bytedance.ee.bear.document.offline.sync.sync;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.sync.c */
public class C6032c {
    /* renamed from: a */
    public static void m24483a(AbstractC5233x xVar, OfflineDoc offlineDoc, int i) {
        if (offlineDoc != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_id", C13598b.m55197d(offlineDoc.getObj_token()));
                jSONObject.put("file_type", offlineDoc.getType());
                jSONObject.put("retry_times", i);
                xVar.mo21080a("dev_performance_sync_beginsync", jSONObject);
            } catch (JSONException e) {
                C13479a.m54761a("SyncReport", e);
            }
        }
    }

    /* renamed from: a */
    public static void m24484a(AbstractC5233x xVar, OfflineDoc offlineDoc, int i, int i2) {
        if (offlineDoc != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("file_id", C13598b.m55197d(offlineDoc.getObj_token()));
                jSONObject.put("file_type", offlineDoc.getType());
                jSONObject.put(UpdateKey.STATUS, i2);
                jSONObject.put("retry_times", i);
                xVar.mo21080a("dev_performance_sync_status", jSONObject);
            } catch (JSONException e) {
                C13479a.m54761a("SyncReport", e);
            }
        }
    }
}
