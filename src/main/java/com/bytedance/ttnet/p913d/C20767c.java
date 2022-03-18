package com.bytedance.ttnet.p913d;

import com.bytedance.frameworks.baselib.network.http.AbstractC13978a;
import com.bytedance.retrofit2.client.AbstractC20592a;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.HttpClient;
import java.io.IOException;

/* renamed from: com.bytedance.ttnet.d.c */
public class C20767c implements AbstractC20592a {
    @Override // com.bytedance.retrofit2.client.AbstractC20592a
    /* renamed from: a */
    public AbstractC20594b mo51540a(Request request) throws IOException {
        AbstractC13978a httpClient = HttpClient.getHttpClient(request.getUrl());
        if (httpClient != null) {
            return httpClient.mo51540a(request);
        }
        return null;
    }
}
