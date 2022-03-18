package com.ss.ttvideoengine.net;

import android.os.SystemClock;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
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

public class TTHTTPNetwork extends TTVNetClient {
    public static final MediaType JSON = MediaType.parse("application/json");
    private static OkHttpClient mClient;
    private static boolean mIsRetryWhenFail = true;
    private static int mMaxRetryTimeOut = 10;
    private Call mCall;
    private long mStartTime;
    public int mStatus;

    @Override // com.ss.ttvideoengine.net.TTVNetClient
    public void cancel() {
        Call call = this.mCall;
        if (call != null && !call.isCanceled()) {
            this.mCall.cancel();
        }
    }

    public TTHTTPNetwork() {
        if (mClient == null) {
            synchronized (TTHTTPNetwork.class) {
                if (mClient == null) {
                    mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
                }
            }
        }
    }

    public static void isRetryWhenFail(int i) {
        TTVideoEngineLog.m256500d("TTHTTPNetwork", "isRetryWhenFail:" + i);
        if (i >= 0) {
            boolean z = true;
            if (i <= 1) {
                if (i != 1) {
                    z = false;
                }
                mIsRetryWhenFail = z;
            }
        }
    }

    public static void setMaxRetryTimeOut(int i) {
        TTVideoEngineLog.m256500d("TTHTTPNetwork", "setMaxRetryTimeOut:" + i);
        if (i < 0 || i > 60) {
            mMaxRetryTimeOut = 10;
        } else {
            mMaxRetryTimeOut = i;
        }
    }

    private void _startTask(Request request, final TTVNetClient.CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            int i = this.mStatus;
            if (i != 3) {
                if (i != 1) {
                    this.mStatus = 1;
                    Call newCall = mClient.newCall(request);
                    this.mCall = newCall;
                    newCall.enqueue(new Callback() {
                        /* class com.ss.ttvideoengine.net.TTHTTPNetwork.C654742 */

                        @Override // okhttp3.Callback
                        public void onFailure(Call call, IOException iOException) {
                            TTHTTPNetwork.this.mStatus = 2;
                            completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
                            r1 = r10.body();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                            r3 = r1.string();
                            r4 = new org.json.JSONObject(r3);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                            com.ss.ttvideoengine.utils.TTVideoEngineLog.m256500d("TTHTTPNetwork", "startTask onResponse body:" + r3);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
                            r3 = null;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
                            r9 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
                            r9 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
                            r0 = r1;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
                            r9 = e;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
                            r4 = null;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
                            r3 = r9.toString();
                            r9.printStackTrace();
                            r9 = -9994;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
                            if (r10.isSuccessful() == false) goto L_0x0051;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
                            r3 = r10.message();
                            r9 = r10.code();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
                            if (r1 != null) goto L_0x005b;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
                            r1.close();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
                            if (r3 != null) goto L_0x0068;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
                            r5.onCompletion(r4, null);
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
                            r5.onCompletion(r4, new com.ss.ttvideoengine.utils.Error("", -9994, r9, r3));
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
                            r9 = th;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
                            if (r0 != null) goto L_0x0078;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
                            r0.close();
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
                            throw r9;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
                            r9 = -1;
                            r0 = null;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[Catch:{ all -> 0x003d }] */
                        /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[SYNTHETIC, Splitter:B:30:0x005b] */
                        /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
                        /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
                        /* JADX WARNING: Removed duplicated region for block: B:38:0x0078 A[SYNTHETIC, Splitter:B:38:0x0078] */
                        @Override // okhttp3.Callback
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void onResponse(okhttp3.Call r9, okhttp3.Response r10) throws java.io.IOException {
                            /*
                            // Method dump skipped, instructions count: 127
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.net.TTHTTPNetwork.C654742.onResponse(okhttp3.Call, okhttp3.Response):void");
                        }
                    });
                    return;
                }
            }
            TTVideoEngineLog.m256505i("TTHTTPNetwork", "_startTask status error, return. " + this.mStatus);
        }
    }

    @Override // com.ss.ttvideoengine.net.TTVNetClient
    public void startTask(String str, final TTVNetClient.CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
            if (mClient == null) {
                mClient = new OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).build();
            }
        }
        Call newCall = mClient.newCall(new Request.Builder().url(str).build());
        this.mCall = newCall;
        newCall.enqueue(new Callback() {
            /* class com.ss.ttvideoengine.net.TTHTTPNetwork.C654731 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                TTHTTPNetwork.this.mStatus = 2;
                completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x0056 A[SYNTHETIC, Splitter:B:24:0x0056] */
            @Override // okhttp3.Callback
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r6, okhttp3.Response r7) {
                /*
                    r5 = this;
                    r6 = 0
                    okhttp3.ResponseBody r0 = r7.body()     // Catch:{ all -> 0x0051 }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0015 }
                    java.lang.String r2 = r0.string()     // Catch:{ Exception -> 0x0015 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0015 }
                    r2 = -1
                    r2 = r1
                    r3 = -1
                    r1 = r6
                    goto L_0x001e
                L_0x0013:
                    r6 = move-exception
                    goto L_0x0054
                L_0x0015:
                    r1 = move-exception
                    com.ss.ttvideoengine.utils.TTVideoEngineLog.m256501d(r1)     // Catch:{ all -> 0x0013 }
                    r2 = -9979(0xffffffffffffd905, float:NaN)
                    r2 = r6
                    r3 = -9979(0xffffffffffffd905, float:NaN)
                L_0x001e:
                    if (r1 != 0) goto L_0x0031
                    boolean r4 = r7.isSuccessful()     // Catch:{ all -> 0x0013 }
                    if (r4 != 0) goto L_0x0031
                    java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0013 }
                    java.lang.String r3 = "http fail"
                    r1.<init>(r3)     // Catch:{ all -> 0x0013 }
                    int r3 = r7.code()     // Catch:{ all -> 0x0013 }
                L_0x0031:
                    if (r0 == 0) goto L_0x0038
                    r0.close()     // Catch:{ Exception -> 0x0037 }
                    goto L_0x0038
                L_0x0037:
                L_0x0038:
                    if (r1 != 0) goto L_0x0040
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r7 = r7
                    r7.onCompletion(r2, r6)
                    goto L_0x0050
                L_0x0040:
                    com.ss.ttvideoengine.net.TTVNetClient$CompletionListener r6 = r7
                    com.ss.ttvideoengine.utils.Error r7 = new com.ss.ttvideoengine.utils.Error
                    java.lang.String r0 = r1.toString()
                    java.lang.String r1 = ""
                    r7.<init>(r1, r3, r0)
                    r6.onCompletion(r2, r7)
                L_0x0050:
                    return
                L_0x0051:
                    r7 = move-exception
                    r0 = r6
                    r6 = r7
                L_0x0054:
                    if (r0 == 0) goto L_0x0059
                    r0.close()     // Catch:{ Exception -> 0x0059 }
                L_0x0059:
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.net.TTHTTPNetwork.C654731.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }

    private void _receivedError(Call call, IOException iOException, TTVNetClient.CompletionListener completionListener) {
        if (!mIsRetryWhenFail) {
            completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            return;
        }
        Request request = call.request();
        if (SystemClock.elapsedRealtime() - this.mStartTime < ((long) ((mMaxRetryTimeOut * 1000) - 500))) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            _startTask(request, completionListener);
            return;
        }
        completionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
    }

    @Override // com.ss.ttvideoengine.net.TTVNetClient
    public void startTask(String str, Map<String, String> map, TTVNetClient.CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
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
        _startTask(url.build(), completionListener);
    }

    @Override // com.ss.ttvideoengine.net.TTVNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, TTVNetClient.CompletionListener completionListener) {
        synchronized (TTHTTPNetwork.class) {
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
        _startTask(url.build(), completionListener);
    }

    @Override // com.ss.ttvideoengine.net.TTVNetClient
    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, final TTVNetClient.RawCompletionListener rawCompletionListener) {
        synchronized (TTHTTPNetwork.class) {
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
            /* class com.ss.ttvideoengine.net.TTHTTPNetwork.C654753 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                TTVideoEngineLog.m256500d("TTHTTPNetwork", "startTask onFailure: " + iOException.toString());
                rawCompletionListener.onCompletion(null, new Error("", -9994, iOException.toString()));
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
            @Override // okhttp3.Callback
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r6, okhttp3.Response r7) throws java.io.IOException {
                /*
                // Method dump skipped, instructions count: 102
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.net.TTHTTPNetwork.C654753.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
