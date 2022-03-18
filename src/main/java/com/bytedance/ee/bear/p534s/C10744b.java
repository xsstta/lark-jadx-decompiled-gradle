package com.bytedance.ee.bear.p534s;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.s.b */
public class C10744b {

    /* renamed from: a */
    private NetService.AbstractC5075d<C10749c> f28728a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.s.b$a */
    public interface AbstractC10747a {
        /* renamed from: a */
        void mo40658a();

        /* renamed from: a */
        void mo40659a(C10749c cVar);
    }

    /* renamed from: com.bytedance.ee.bear.s.b$b */
    static class C10748b implements NetService.AbstractC5074c<C10749c> {
        C10748b() {
        }

        /* renamed from: a */
        public C10749c parse(String str) throws NetService.ParseException {
            C10749c cVar = new C10749c();
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    boolean z = true;
                    if (optJSONObject.getInt("enable_watermark") != 1) {
                        z = false;
                    }
                    cVar.showWatermark = z;
                }
            } catch (JSONException e) {
                C13479a.m54759a("WatermarkExecutor ", "parse fail", e);
            }
            return cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.s.b$c */
    public static class C10749c extends NetService.Result {
        boolean showWatermark;

        C10749c() {
        }
    }

    public C10744b(NetService netService) {
        this.f28728a = netService.mo20117a(new C10748b());
    }

    /* renamed from: a */
    private NetService.C5076e m44544a(String str, String str2) {
        NetService.C5077f fVar = new NetService.C5077f("/api/obj_setting/get/");
        fVar.mo20145a("obj_type", str2);
        fVar.mo20145a("obj_token", str);
        return fVar;
    }

    /* renamed from: a */
    public void mo40655a(String str, String str2, final AbstractC10747a aVar) {
        this.f28728a.mo20141a(m44544a(str, str2)).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<C10749c>() {
            /* class com.bytedance.ee.bear.p534s.C10744b.C107451 */

            /* renamed from: a */
            public void accept(C10749c cVar) throws Exception {
                aVar.mo40659a(cVar);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.p534s.C10744b.C107462 */

            /* renamed from: a */
            public void accept(Throwable th) {
                aVar.mo40658a();
            }
        });
    }
}
