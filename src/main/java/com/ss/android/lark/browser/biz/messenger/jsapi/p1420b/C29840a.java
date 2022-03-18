package com.ss.android.lark.browser.biz.messenger.jsapi.p1420b;

import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.b.a */
public class C29840a {

    /* renamed from: a */
    private final OkHttpClient f74569a;

    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.b.a$a */
    private static class C29842a {

        /* renamed from: a */
        static C29840a f74570a = new C29840a();
    }

    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.b.a$b */
    public interface AbstractC29843b {
        /* renamed from: a */
        void mo107388a(int i, long j, long j2);

        /* renamed from: a */
        void mo107389a(String str, int i);

        /* renamed from: a */
        void mo107390a(Response response);
    }

    /* renamed from: a */
    public static C29840a m110323a() {
        return C29842a.f74570a;
    }

    private C29840a() {
        this.f74569a = new OkHttpClient.Builder().build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122 A[SYNTHETIC, Splitter:B:63:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012a A[Catch:{ IOException -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144 A[SYNTHETIC, Splitter:B:72:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014c A[Catch:{ IOException -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m110324a(okhttp3.Call r20, okhttp3.Response r21, java.io.File r22, com.ss.android.lark.browser.biz.messenger.jsapi.p1420b.C29840a.AbstractC29843b r23) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.messenger.jsapi.p1420b.C29840a.m110324a(okhttp3.Call, okhttp3.Response, java.io.File, com.ss.android.lark.browser.biz.messenger.jsapi.b.a$b):void");
    }

    /* renamed from: a */
    public synchronized void mo107443a(String str, String str2, Map<String, String> map, String str3, String str4, AbstractC29843b bVar) {
        String str5;
        try {
            Request.Builder url = new Request.Builder().url(str);
            if (!map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    url.addHeader(entry.getKey(), entry.getValue());
                }
            }
            if (TextUtils.equals("GET", str2)) {
                url.get();
            } else {
                if (!TextUtils.isEmpty(map.get("Content-Type"))) {
                    str5 = map.get("Content-Type");
                } else if (!TextUtils.isEmpty(map.get("content-type"))) {
                    str5 = map.get("content-type");
                } else if (!TextUtils.isEmpty(str3)) {
                    bVar.mo107389a("content-type is invalid", 363005);
                    return;
                } else {
                    str5 = "application/x-www-form-urlencoded";
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                url.post(RequestBody.create(MediaType.parse(str5), str3));
            }
            Call newCall = this.f74569a.newCall(url.build());
            Response execute = newCall.execute();
            File file = new File(str4);
            if (execute != null) {
                m110324a(newCall, execute, file, bVar);
            } else if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            bVar.mo107389a("exception: " + e, -1);
        }
    }
}
