package com.bytedance.ee.bear.p379f;

import com.bytedance.ee.log.C13479a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* renamed from: com.bytedance.ee.bear.f.b */
public class C7659b {

    /* renamed from: a */
    private String f20764a;

    /* renamed from: b */
    private String f20765b;

    /* renamed from: c */
    private AbstractC7658a f20766c;

    /* renamed from: d */
    private OkHttpClient f20767d;

    /* renamed from: a */
    public void mo30074a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                C13479a.m54759a("SimpleDownloadHelper", "onResponse: close error ", e);
            }
        }
    }

    /* renamed from: a */
    public void mo30075a(String str, final String str2, final AbstractC7658a aVar) {
        this.f20764a = str;
        this.f20765b = str2;
        this.f20766c = aVar;
        if (this.f20767d == null) {
            this.f20767d = new OkHttpClient.Builder().retryOnConnectionFailure(true).connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
        }
        Request build = new Request.Builder().url(str).build();
        if (aVar != null) {
            aVar.mo21167a();
        }
        this.f20767d.newCall(build).enqueue(new Callback() {
            /* class com.bytedance.ee.bear.p379f.C7659b.C76601 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                C13479a.m54759a("SimpleDownloadHelper", "on Download Failure: ", iOException);
                AbstractC7658a aVar = aVar;
                if (aVar != null) {
                    aVar.mo21170a(iOException);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:34:0x008f A[Catch:{ all -> 0x0083 }] */
            @Override // okhttp3.Callback
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r18, okhttp3.Response r19) {
                /*
                // Method dump skipped, instructions count: 158
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.p379f.C7659b.C76601.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
