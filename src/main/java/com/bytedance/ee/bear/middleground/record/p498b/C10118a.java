package com.bytedance.ee.bear.middleground.record.p498b;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.record.b.a */
public class C10118a {

    /* renamed from: com.bytedance.ee.bear.middleground.record.b.a$a */
    public interface AbstractC10121a {
        /* renamed from: a */
        void mo38529a(Boolean bool);

        /* renamed from: a */
        void mo38530a(Throwable th) throws Exception;
    }

    /* renamed from: com.bytedance.ee.bear.middleground.record.b.a$b */
    private static class C10122b implements NetService.AbstractC5074c<NetService.Result<Boolean>> {
        private C10122b() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<Boolean> parse(String str) throws NetService.ParseException {
            NetService.Result<Boolean> result = new NetService.Result<>();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optJSONObject("settings");
                result.code = jSONObject.getInt("code");
                result.data = Boolean.valueOf(optJSONObject.getBoolean("allow_read_list_setting"));
                result.msg = jSONObject.getString("msg");
            } catch (JSONException e) {
                C13479a.m54759a("GetPrivacyExecutor", "parse: ", e);
                e.printStackTrace();
            }
            return result;
        }
    }

    /* renamed from: a */
    public Disposable mo38526a(final AbstractC10121a aVar) {
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C10122b()).mo20141a(new NetService.C5077f("/space/api/user_properties/get/")).mo238001b(new Consumer<NetService.Result<Boolean>>() {
            /* class com.bytedance.ee.bear.middleground.record.p498b.C10118a.C101191 */

            /* renamed from: a */
            public void accept(NetService.Result<Boolean> result) {
                C13479a.m54772d("GetPrivacyExecutor", "GetPrivacyExecutor doAction accept  result=" + result);
                AbstractC10121a aVar = aVar;
                if (aVar != null) {
                    aVar.mo38529a((Boolean) result.data);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.middleground.record.p498b.C10118a.C101202 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("GetPrivacyExecutor", " doAction failed", th);
                AbstractC10121a aVar = aVar;
                if (aVar != null) {
                    aVar.mo38530a(th);
                }
            }
        });
    }
}
