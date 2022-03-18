package com.bytedance.ee.lark.infra.network.p622a.p623a;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.a */
public abstract class AbstractC12794a implements Callback {
    /* renamed from: a */
    public abstract void mo48350a(Call call, Response response) throws IOException;

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        mo48350a(call, response);
    }
}
