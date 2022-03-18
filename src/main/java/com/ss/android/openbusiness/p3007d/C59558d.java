package com.ss.android.openbusiness.p3007d;

import android.os.Build;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.openbusiness.C59480b;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.ss.android.openbusiness.d.d */
public class C59558d {

    /* renamed from: com.ss.android.openbusiness.d.d$a */
    public interface AbstractC59560a {
        /* renamed from: a */
        void mo202858a(SendHttpResponse sendHttpResponse, C59561b bVar);

        /* renamed from: a */
        void mo202859a(ErrorResult errorResult, C59561b bVar);
    }

    /* renamed from: com.ss.android.openbusiness.d.d$b */
    public static class C59561b {

        /* renamed from: a */
        public String f147843a;

        /* renamed from: b */
        public String f147844b;
    }

    /* renamed from: c */
    public static SendHttpRequest.C15253a m231059c() {
        return new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55529a(m231058b()).mo55527a((Integer) 30);
    }

    /* renamed from: b */
    public static HashMap<String, String> m231058b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Cookie", "session=" + C59480b.m230865a().mo144880f());
        hashMap.put("User-Agent", m231060d());
        return hashMap;
    }

    /* renamed from: d */
    public static String m231060d() {
        return "Mozilla/5.0 " + "(Android)" + ' ' + Build.BRAND + ' ' + Build.MODEL;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SendHttpResponse m231056a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }

    /* renamed from: a */
    public static void m231057a(SendHttpRequest.C15253a aVar, final String str, final AbstractC59560a aVar2) {
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, aVar, new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.openbusiness.p3007d.C59558d.C595591 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C59561b bVar = new C59561b();
                bVar.f147843a = str;
                aVar2.mo202859a(errorResult, bVar);
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                C59561b bVar = new C59561b();
                if (sendHttpResponse.headers != null) {
                    bVar.f147844b = sendHttpResponse.headers.get("x-log-id");
                }
                bVar.f147843a = str;
                aVar2.mo202858a(sendHttpResponse, bVar);
            }
        }, $$Lambda$d$XvS5HKX0dpFd_tCXNjA8HzzC6A.INSTANCE);
    }
}
