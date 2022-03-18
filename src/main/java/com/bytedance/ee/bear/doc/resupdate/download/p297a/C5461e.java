package com.bytedance.ee.bear.doc.resupdate.download.p297a;

import com.bytedance.ee.bear.thread.BearExecutors;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.download.a.e */
public class C5461e {

    /* renamed from: b */
    private static C5461e f15542b;

    /* renamed from: a */
    private final OkHttpClient f15543a = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).writeTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).dispatcher(new Dispatcher(BearExecutors.m48467b())).build();

    /* renamed from: a */
    public static C5461e m22136a() {
        if (f15542b == null) {
            synchronized (C5461e.class) {
                if (f15542b == null) {
                    f15542b = new C5461e();
                }
            }
        }
        return f15542b;
    }

    /* renamed from: a */
    private void m22137a(Request request, Callback callback) throws IOException {
        this.f15543a.newCall(request).enqueue(callback);
    }

    /* renamed from: a */
    public void mo21849a(String str, Callback callback) throws IOException {
        m22137a(new Request.Builder().url(str).build(), callback);
    }

    /* renamed from: a */
    public void mo21848a(String str, long j, long j2, Callback callback) throws IOException {
        Request.Builder builder = new Request.Builder();
        m22137a(builder.header("RANGE", "bytes=" + j + "-" + j2).url(str).build(), callback);
    }
}
