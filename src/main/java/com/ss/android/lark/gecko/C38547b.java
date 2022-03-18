package com.ss.android.lark.gecko;

import com.bytedance.geckox.buffer.p760a.C14210b;
import com.bytedance.geckox.p772h.AbstractC14280c;
import com.bytedance.geckox.p772h.C14281d;
import com.bytedance.geckox.utils.C14355c;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.ss.android.lark.gecko.b */
public class C38547b implements AbstractC14280c {

    /* renamed from: a */
    protected OkHttpClient f99069a = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).build();

    /* renamed from: b */
    protected OkHttpClient f99070b = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).build();

    /* renamed from: c */
    private boolean f99071c;

    /* renamed from: a */
    private Map<String, String> m152024a(Headers headers) {
        HashMap hashMap = new HashMap();
        if (this.f99071c) {
            hashMap.put("X-TT-ENV", "prod");
        }
        if (headers == null) {
            return hashMap;
        }
        for (String str : headers.names()) {
            hashMap.put(str, headers.get(str));
        }
        return hashMap;
    }

    public C38547b(boolean z) {
        this.f99071c = z;
    }

    @Override // com.bytedance.geckox.p772h.AbstractC14280c
    /* renamed from: a */
    public C14281d mo52248a(String str, String str2) throws Exception {
        String str3;
        String replace = str.replace("https://", "http://");
        Response execute = this.f99069a.newCall(new Request.Builder().url(replace).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2)).build()).execute();
        Map<String, String> a = m152024a(execute.headers());
        if (execute.code() == 200) {
            str3 = execute.body().string();
        } else {
            str3 = null;
        }
        return new C14281d(a, str3, execute.code(), execute.message());
    }

    @Override // com.bytedance.geckox.p772h.AbstractC14280c
    /* renamed from: a */
    public void mo52250a(String str, long j, C14210b bVar) throws Exception {
        Throwable th;
        Exception e;
        int i;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            Response execute = this.f99070b.newCall(new Request.Builder().get().url(str).build()).execute();
            i = execute.code();
            try {
                bufferedInputStream = new BufferedInputStream(execute.body().byteStream());
            } catch (Exception e2) {
                e = e2;
                try {
                    throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                } catch (Throwable th2) {
                    th = th2;
                    C14355c.m57819a(bufferedInputStream2);
                    throw th;
                }
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        bVar.write(bArr, 0, read);
                    } else {
                        C14355c.m57819a(bufferedInputStream);
                        return;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream2 = bufferedInputStream;
                throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = bufferedInputStream;
                C14355c.m57819a(bufferedInputStream2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            i = 0;
            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
        }
    }
}
