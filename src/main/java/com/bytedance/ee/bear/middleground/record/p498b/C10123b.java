package com.bytedance.ee.bear.middleground.record.p498b;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.record.viewhistory.RecordListResult;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.b.b */
public class C10123b {

    /* renamed from: a */
    private NetService f27346a = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: b */
    private NetService.C5077f f27347b;

    /* renamed from: c */
    private NetService.AbstractC5075d<RecordListResult> f27348c;

    /* renamed from: com.bytedance.ee.bear.middleground.record.b.b$a */
    public interface AbstractC10126a {
        /* renamed from: a */
        void mo38534a(RecordListResult recordListResult);

        /* renamed from: a */
        void mo38535a(Throwable th) throws Exception;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.record.b.b$b */
    private static class C10127b implements NetService.AbstractC5074c<RecordListResult> {
        private C10127b() {
        }

        /* renamed from: a */
        public RecordListResult parse(String str) {
            RecordListResult recordListResult = new RecordListResult();
            try {
                JSONObject jSONObject = new JSONObject(str);
                recordListResult.setCode(jSONObject.optInt("code"));
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    recordListResult.uv = optJSONObject.optInt("uv");
                    recordListResult.uvHidden = optJSONObject.optInt("hidden_uv");
                    recordListResult.nextPageToken = optJSONObject.optString("next_page_token");
                    JSONArray jSONArray = optJSONObject.getJSONArray("users");
                    recordListResult.users = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        RecordListResult.C10143a aVar = new RecordListResult.C10143a();
                        aVar.f27380a = jSONObject2.optString("id");
                        aVar.f27381b = jSONObject2.optString("name");
                        aVar.f27382c = jSONObject2.optString("en_name");
                        aVar.f27383d = jSONObject2.optString("avatar_url");
                        aVar.f27384e = jSONObject2.optString("department");
                        aVar.f27387h = jSONObject2.optLong("last_view_time");
                        aVar.f27388i = jSONObject2.optInt("user_type");
                        aVar.f27389j = jSONObject2.optBoolean("is_external");
                        aVar.f27390k = jSONObject2.optBoolean("is_resigned");
                        aVar.f27385f = jSONObject2.optString("tenant_id");
                        aVar.f27386g = jSONObject2.optString("tenant_name");
                        recordListResult.users.add(aVar);
                    }
                }
            } catch (JSONException e) {
                C13479a.m54759a("GetRecordListExecutor", "parse fail", e);
            }
            return recordListResult;
        }
    }

    /* renamed from: a */
    private void m42148a(String str, int i, String str2, int i2, boolean z) {
        String str3;
        NetService.C5077f fVar = new NetService.C5077f("/api/obj_stats/get_view_detail/");
        this.f27347b = fVar;
        fVar.mo20143a(2);
        this.f27347b.mo20145a("token", str);
        this.f27347b.mo20145a("obj_type", String.valueOf(i));
        this.f27347b.mo20145a("page_size", String.valueOf(i2));
        this.f27347b.mo20145a("next_page_token", str2);
        NetService.C5077f fVar2 = this.f27347b;
        if (z) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        fVar2.mo20145a("get_view_count", str3);
    }

    /* renamed from: a */
    public Disposable mo38531a(String str, int i, String str2, int i2, boolean z, final AbstractC10126a aVar) {
        m42148a(str, i, str2, i2, z);
        NetService.AbstractC5075d<RecordListResult> a = this.f27346a.mo20117a(new C10127b());
        this.f27348c = a;
        return a.mo20141a(this.f27347b).mo238001b(new Consumer<RecordListResult>() {
            /* class com.bytedance.ee.bear.middleground.record.p498b.C10123b.C101241 */

            /* renamed from: a */
            public void accept(RecordListResult recordListResult) {
                C13479a.m54772d("GetRecordListExecutor", "GetRecordListExecutor doAction accept  result=" + recordListResult);
                AbstractC10126a aVar = aVar;
                if (aVar != null) {
                    aVar.mo38534a(recordListResult);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.middleground.record.p498b.C10123b.C101252 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("GetRecordListExecutor", "GetRecordListExecutor doAction failed", th);
                AbstractC10126a aVar = aVar;
                if (aVar != null) {
                    aVar.mo38535a(th);
                }
            }
        });
    }
}
