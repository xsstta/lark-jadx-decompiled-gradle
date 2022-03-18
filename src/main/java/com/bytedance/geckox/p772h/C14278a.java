package com.bytedance.geckox.p772h;

import com.bytedance.geckox.buffer.p760a.C14210b;
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

/* renamed from: com.bytedance.geckox.h.a */
public class C14278a implements AbstractC14279b {

    /* renamed from: a */
    protected OkHttpClient f37536a = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).build();

    /* renamed from: b */
    protected OkHttpClient f37537b = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).writeTimeout(30, TimeUnit.SECONDS).build();

    /* renamed from: a */
    private Map<String, String> m57609a(Headers headers) {
        if (headers == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : headers.names()) {
            hashMap.put(str, headers.get(str));
        }
        return hashMap;
    }

    @Override // com.bytedance.geckox.p772h.AbstractC14280c
    /* renamed from: a */
    public C14281d mo52248a(String str, String str2) throws Exception {
        String str3;
        Response execute = this.f37536a.newCall(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2)).build()).execute();
        Map<String, String> a = m57609a(execute.headers());
        if (execute.code() == 200) {
            str3 = execute.body().string();
        } else {
            str3 = null;
        }
        return new C14281d(a, str3, execute.code(), execute.message());
    }

    @Override // com.bytedance.geckox.p772h.AbstractC14279b
    /* renamed from: a */
    public C14281d mo52249a(String str, String str2, Map<String, String> map) throws Exception {
        String str3;
        Request.Builder post = new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2));
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                post.addHeader(entry.getKey(), entry.getValue());
            }
        }
        Response execute = this.f37536a.newCall(post.build()).execute();
        Map<String, String> a = m57609a(execute.headers());
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
        BufferedInputStream bufferedInputStream;
        int i = 0;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            Response execute = this.f37537b.newCall(new Request.Builder().get().url(str).build()).execute();
            int code = execute.code();
            if (code == 200) {
                try {
                    bufferedInputStream = new BufferedInputStream(execute.body().byteStream());
                } catch (Exception e2) {
                    e = e2;
                    i = code;
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
                    i = code;
                    bufferedInputStream2 = bufferedInputStream;
                    throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream2 = bufferedInputStream;
                    C14355c.m57819a(bufferedInputStream2);
                    throw th;
                }
            } else {
                throw new RuntimeException("downloadFile failed, code: " + code + ", url:" + str);
            }
        } catch (Exception e4) {
            e = e4;
            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
        }
    }
}
