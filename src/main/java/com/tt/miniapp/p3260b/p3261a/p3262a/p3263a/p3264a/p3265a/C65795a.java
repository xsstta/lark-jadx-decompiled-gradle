package com.tt.miniapp.p3260b.p3261a.p3262a.p3263a.p3264a.p3265a;

import com.tt.frontendapiinterface.ApiCallResult;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tt.miniapp.b.a.a.a.a.a.a */
public class C65795a {

    /* renamed from: a */
    private CountDownLatch f165828a;

    /* renamed from: b */
    private ApiCallResult f165829b;

    /* renamed from: a */
    public void mo230477a(ApiCallResult apiCallResult) {
        this.f165829b = apiCallResult;
        CountDownLatch countDownLatch = this.f165828a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
