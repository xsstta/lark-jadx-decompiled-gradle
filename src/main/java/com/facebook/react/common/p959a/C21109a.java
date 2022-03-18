package com.facebook.react.common.p959a;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* renamed from: com.facebook.react.common.a.a */
public class C21109a {
    /* renamed from: a */
    public static void m76732a(OkHttpClient okHttpClient, Object obj) {
        for (Call call : okHttpClient.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
                return;
            }
        }
        for (Call call2 : okHttpClient.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
                return;
            }
        }
    }
}
