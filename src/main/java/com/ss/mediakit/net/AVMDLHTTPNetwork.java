package com.ss.mediakit.net;

import com.ss.mediakit.net.AVMDLNetClient;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

public class AVMDLHTTPNetwork extends AVMDLNetClient {
    public static final MediaType JSON = MediaType.parse("application/json");
    private static OkHttpClient mClient;
    private Call mCall;

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public void cancel() {
        Call call = this.mCall;
        if (call != null && !call.isCanceled()) {
            this.mCall.cancel();
        }
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public void startTask(String str, Map<String, String> map, final AVMDLNetClient.CompletionListener completionListener) {
        synchronized (AVMDLHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                url.header(str2, map.get(str2));
            }
        }
        Call newCall = mClient.newCall(url.build());
        this.mCall = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.mediakit.net.AVMDLHTTPNetwork.C653761 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC, Splitter:B:24:0x004e] */
            @Override // okhttp3.Callback
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r5, okhttp3.Response r6) {
                /*
                    r4 = this;
                    r5 = 0
                    okhttp3.ResponseBody r0 = r6.body()     // Catch:{ all -> 0x0049 }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0013 }
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0013 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0013 }
                    r2 = r1
                    r1 = r5
                    goto L_0x0018
                L_0x0011:
                    r5 = move-exception
                    goto L_0x004c
                L_0x0013:
                    r1 = move-exception
                    r1.printStackTrace()     // Catch:{ all -> 0x0011 }
                    r2 = r5
                L_0x0018:
                    if (r1 != 0) goto L_0x002a
                    boolean r3 = r6.isSuccessful()     // Catch:{ all -> 0x0011 }
                    if (r3 != 0) goto L_0x002a
                    java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0011 }
                    java.lang.String r3 = "http fail"
                    r1.<init>(r3)     // Catch:{ all -> 0x0011 }
                    r6.code()     // Catch:{ all -> 0x0011 }
                L_0x002a:
                    if (r0 == 0) goto L_0x0031
                    r0.close()     // Catch:{ Exception -> 0x0030 }
                    goto L_0x0031
                L_0x0030:
                L_0x0031:
                    if (r1 != 0) goto L_0x0039
                    com.ss.mediakit.net.AVMDLNetClient$CompletionListener r6 = r8
                    r6.onCompletion(r2, r5)
                    goto L_0x0048
                L_0x0039:
                    com.ss.mediakit.net.AVMDLNetClient$CompletionListener r6 = r8
                    com.ss.mediakit.net.Error r0 = new com.ss.mediakit.net.Error
                    r3 = 0
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r3, r5, r5, r1)
                    r6.onCompletion(r2, r0)
                L_0x0048:
                    return
                L_0x0049:
                    r6 = move-exception
                    r0 = r5
                    r5 = r6
                L_0x004c:
                    if (r0 == 0) goto L_0x0051
                    r0.close()     // Catch:{ Exception -> 0x0051 }
                L_0x0051:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.net.AVMDLHTTPNetwork.C653761.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }

    @Override // com.ss.mediakit.net.AVMDLNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final AVMDLNetClient.CompletionListener completionListener) {
        synchronized (AVMDLHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
            }
        }
        Request.Builder url = new Request.Builder().url(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                url.addHeader(str2, map.get(str2));
            }
        }
        if (i == 1) {
            url.post(RequestBody.create(JSON, String.valueOf(jSONObject)));
        }
        Call newCall = mClient.newCall(url.build());
        this.mCall = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.mediakit.net.AVMDLHTTPNetwork.C653772 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                completionListener.onCompletion(null, new Error(0, null, null, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[SYNTHETIC, Splitter:B:23:0x004d] */
            @Override // okhttp3.Callback
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r5, okhttp3.Response r6) throws java.io.IOException {
                /*
                    r4 = this;
                    r5 = 0
                    okhttp3.ResponseBody r0 = r6.body()     // Catch:{ all -> 0x0048 }
                    java.lang.String r1 = r0.string()     // Catch:{ Exception -> 0x0013 }
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0013 }
                    r2.<init>(r1)     // Catch:{ Exception -> 0x0013 }
                    r1 = r2
                    r2 = r5
                    goto L_0x001c
                L_0x0011:
                    r5 = move-exception
                    goto L_0x004b
                L_0x0013:
                    r1 = move-exception
                    java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0011 }
                    r1.printStackTrace()     // Catch:{ all -> 0x0011 }
                    r1 = r5
                L_0x001c:
                    boolean r3 = r6.isSuccessful()     // Catch:{ all -> 0x0011 }
                    if (r3 != 0) goto L_0x0029
                    java.lang.String r2 = r6.message()     // Catch:{ all -> 0x0011 }
                    r6.code()     // Catch:{ all -> 0x0011 }
                L_0x0029:
                    if (r0 == 0) goto L_0x0030
                    r0.close()     // Catch:{ Exception -> 0x002f }
                    goto L_0x0030
                L_0x002f:
                L_0x0030:
                    if (r2 != 0) goto L_0x0038
                    com.ss.mediakit.net.AVMDLNetClient$CompletionListener r6 = r10
                    r6.onCompletion(r1, r5)
                    goto L_0x0047
                L_0x0038:
                    com.ss.mediakit.net.AVMDLNetClient$CompletionListener r6 = r10
                    com.ss.mediakit.net.Error r0 = new com.ss.mediakit.net.Error
                    r3 = 0
                    java.lang.String r2 = r2.toString()
                    r0.<init>(r3, r5, r5, r2)
                    r6.onCompletion(r1, r0)
                L_0x0047:
                    return
                L_0x0048:
                    r6 = move-exception
                    r0 = r5
                    r5 = r6
                L_0x004b:
                    if (r0 == 0) goto L_0x0050
                    r0.close()     // Catch:{ Exception -> 0x0050 }
                L_0x0050:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.net.AVMDLHTTPNetwork.C653772.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
