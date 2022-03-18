package com.ss.android.appcenter.business.net.p1270a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.gson.JsonObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.business.p1265a.C27581i;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.ss.android.appcenter.business.net.a.b */
public class C27714b {

    /* renamed from: e */
    public boolean f69279e;

    /* renamed from: com.ss.android.appcenter.business.net.a.b$a */
    public interface AbstractC27716a {
        /* renamed from: a */
        void mo98363a(SendHttpResponse sendHttpResponse, C27717b bVar);

        /* renamed from: a */
        void mo98364a(ErrorResult errorResult, C27717b bVar);
    }

    /* renamed from: com.ss.android.appcenter.business.net.a.b$b */
    public static class C27717b {

        /* renamed from: a */
        public String f69282a;

        /* renamed from: b */
        public String f69283b;
    }

    /* renamed from: c */
    protected static SendHttpRequest.C15253a m101360c() {
        return new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55529a(m101357a()).mo55527a((Integer) 30);
    }

    /* renamed from: a */
    public static HashMap<String, String> m101357a() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (C27548m.m100547m().mo98221e() != null) {
            hashMap.put("Cookie", "session=" + C27548m.m100547m().mo98221e().mo98211a());
        }
        hashMap.put("User-Agent", C27581i.m100670a());
        return hashMap;
    }

    /* renamed from: b */
    public static JsonObject m101359b() {
        JsonObject jsonObject = new JsonObject();
        if (C27548m.m100547m().mo98218b() != null) {
            jsonObject.addProperty("locale", C28183g.m103240a());
            jsonObject.addProperty("larkVersion", C27548m.m100547m().mo98218b().mo98171b());
        }
        return jsonObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SendHttpResponse m101356a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }

    /* renamed from: a */
    public static void m101358a(SendHttpRequest.C15253a aVar, final String str, final AbstractC27716a aVar2) {
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, aVar, new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.appcenter.business.net.p1270a.C27714b.C277151 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C27717b bVar = new C27717b();
                bVar.f69282a = str;
                aVar2.mo98364a(errorResult, bVar);
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                C27717b bVar = new C27717b();
                if (sendHttpResponse.headers != null) {
                    bVar.f69283b = sendHttpResponse.headers.get("x-log-id");
                }
                bVar.f69282a = str;
                aVar2.mo98363a(sendHttpResponse, bVar);
            }
        }, $$Lambda$b$pRasEx0cIiZZ3MTNTq3bGOr5N4E.INSTANCE);
    }
}
