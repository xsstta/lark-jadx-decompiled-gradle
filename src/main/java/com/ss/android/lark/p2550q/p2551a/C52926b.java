package com.ss.android.lark.p2550q.p2551a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsResponse;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.mm.net.HttpBaseResponse;
import com.ss.android.lark.mm.net.HttpMmResponse;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.error.MmCommonLocalErrorHandler;
import com.ss.android.lark.mm.net.error.MmHttpErrorProcessor;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.net.parse.C47073a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.p2550q.p2551a.C52926b;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okio.ByteString;
import okio.C69694c;

/* renamed from: com.ss.android.lark.q.a.b */
public class C52926b {

    /* renamed from: com.ss.android.lark.q.a.b$a */
    public static class C52927a {
        /* renamed from: a */
        public static void m204910a(String str, HttpHeaders httpHeaders, Map<String, String> map, AbstractC47070c cVar, String str2, IHttpLocalErrorHandler aVar) {
            m204906a(m204902a(str, HttpMethod.POST, httpHeaders, map), cVar, str2, aVar);
        }

        /* renamed from: a */
        public static void m204911a(final String str, final HttpHeaders httpHeaders, final Map<String, String> map, final Map<String, Pair<String, File>> map2, final AbstractC47070c cVar) {
            C45857i.m181676a(new Runnable() {
                /* class com.ss.android.lark.p2550q.p2551a.C52926b.C52927a.RunnableC529292 */

                public void run() {
                    C53241h.m205898b("MmRustExecutor", "[executePostAudioFile] start");
                    MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
                    if (!CollectionUtils.isEmpty(map2)) {
                        for (String str : map2.keySet()) {
                            Pair pair = (Pair) map2.get(str);
                            if (!(pair == null || pair.second == null)) {
                                type.addFormDataPart(str, (String) pair.first, FormBody.create(MediaType.parse("application/octet-stream"), (File) pair.second));
                            }
                        }
                    }
                    String a = C52926b.m204900a(str, map);
                    MultipartBody build = type.build();
                    Map<String, String> a2 = C52926b.m204901a(httpHeaders);
                    String boundary = build.boundary();
                    C69694c cVar = new C69694c();
                    a2.put("Content-Type", "multipart/form-data; boundary=" + boundary);
                    try {
                        a2.put("Content-Length", Long.toString(build.contentLength()));
                        build.writeTo(cVar);
                    } catch (IOException e) {
                        C45855f.m181666e("MmRustExecutor", "write buffer error: " + e.getMessage());
                    }
                    if (cVar.mo244510a() == 0) {
                        C45855f.m181666e("MmRustExecutor", "buffer is empty, return");
                        cVar.mo161288a(C47068a.f118477l);
                        return;
                    }
                    SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
                    aVar.mo55528a(a);
                    aVar.mo55526a(SendHttpRequest.Method.POST);
                    aVar.mo55529a(a2);
                    aVar.mo55530a(ByteString.of(cVar.readByteArray()));
                    cVar.mo244551g();
                    Command command = Command.SEND_HTTP;
                    C529301 r2 = new IGetDataCallback<SendHttpResponse>() {
                        /* class com.ss.android.lark.p2550q.p2551a.C52926b.C52927a.RunnableC529292.C529301 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            C45855f.m181666e("MmRustExecutor", "[executePostAudioFile] errorResult: " + errorResult);
                            C45859k.m181685a(new Runnable(errorResult) {
                                /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$b$a$2$1$8lTVFtjXl0Mop4UimBh6aMtvZDE */
                                public final /* synthetic */ ErrorResult f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    C52926b.C52927a.RunnableC529292.C529301.m204917a(AbstractC47070c.this, this.f$1);
                                }
                            });
                        }

                        /* renamed from: a */
                        public void onSuccess(SendHttpResponse sendHttpResponse) {
                            int intValue = sendHttpResponse.http_status_code.intValue();
                            C45855f.m181664c("MmRustExecutor", "[executePostAudioFile] status: " + intValue);
                            C45859k.m181685a(new Runnable(intValue) {
                                /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$b$a$2$1$GIUzC8kiD50uoD_I0DMJsgy_cXM */
                                public final /* synthetic */ int f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    C52926b.C52927a.RunnableC529292.C529301.m204916a(AbstractC47070c.this, this.f$1);
                                }
                            });
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public static /* synthetic */ void m204916a(AbstractC47070c cVar, int i) {
                            if (cVar != null) {
                                cVar.mo161289a(i + "");
                            }
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public static /* synthetic */ void m204917a(AbstractC47070c cVar, ErrorResult errorResult) {
                            if (cVar != null) {
                                cVar.mo161288a(new C47068a(errorResult.getErrorCode(), errorResult.getDebugMsg()));
                            }
                        }
                    };
                    ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
                    protoAdapter.getClass();
                    SdkSender.asynSendRequestNonWrap(command, aVar, r2, new SdkSender.IParser() {
                        /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$nlGhYri8FPznwzigG1jXpA4FnXA */

                        @Override // com.ss.android.lark.sdk.SdkSender.IParser
                        public final Object parse(byte[] bArr) {
                            return (SendHttpResponse) ProtoAdapter.this.decode(bArr);
                        }
                    });
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ C52925a m204903a(byte[] bArr) throws IOException {
            C52925a aVar = new C52925a();
            aVar.f130776a = GetSettingsResponse.ADAPTER.decode(bArr).field_groups;
            return aVar;
        }

        /* renamed from: a */
        public static String m204904a(String str) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            GetSettingsRequest.C19155a aVar = new GetSettingsRequest.C19155a();
            aVar.mo65459a(arrayList);
            C52925a aVar2 = (C52925a) SdkSender.syncSend(Command.GET_SETTINGS, aVar, $$Lambda$b$a$Y39KYTTXQRr7KeryyHn4HKFyM.INSTANCE);
            if (aVar2 == null || aVar2.f130776a == null) {
                return null;
            }
            return aVar2.f130776a.get(str);
        }

        /* renamed from: a */
        private static String m204905a(Map<String, String> map) {
            String str = "";
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    str = !TextUtils.isEmpty(str) ? str + ContainerUtils.FIELD_DELIMITER + entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue() : str + entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue();
                }
            }
            return str;
        }

        /* renamed from: a */
        private static SendHttpRequest.C15253a m204902a(String str, HttpMethod httpMethod, HttpHeaders httpHeaders, Map<String, String> map) {
            SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
            aVar.mo55528a(str);
            if (map != null && map.size() > 0) {
                httpHeaders.put(new HttpHeaders("Content-Type", "application/x-www-form-urlencoded;charset=utf-8"));
                aVar.mo55530a(ByteString.encodeUtf8(m204905a(map)));
            }
            String str2 = httpHeaders.get("request-id");
            if (!TextUtils.isEmpty(str2)) {
                aVar.mo55532b(str2);
            }
            if (httpMethod == HttpMethod.GET) {
                aVar.mo55526a(SendHttpRequest.Method.GET);
            } else if (httpMethod == HttpMethod.POST) {
                aVar.mo55526a(SendHttpRequest.Method.POST);
            } else {
                aVar.mo55526a(SendHttpRequest.Method.POST);
            }
            aVar.mo55529a(C52926b.m204901a(httpHeaders));
            return aVar;
        }

        /* renamed from: a */
        private static void m204906a(SendHttpRequest.C15253a aVar, final AbstractC47070c cVar, final String str, final IHttpLocalErrorHandler aVar2) {
            C53241h.m205898b("MmRustExecutor", "doHttpRequest start " + str);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            Command command = Command.SEND_HTTP;
            C529281 r1 = new IGetDataCallback<SendHttpResponse>() {
                /* class com.ss.android.lark.p2550q.p2551a.C52926b.C52927a.C529281 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C53241h.m205894a("MmRustExecutor", "err " + errorResult.toString() + " " + str + " time " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    C45859k.m181685a(new Runnable(aVar2, cVar) {
                        /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$b$a$1$VN5TNguCxgmAwNApSH000pE0fw4 */
                        public final /* synthetic */ IHttpLocalErrorHandler f$1;
                        public final /* synthetic */ AbstractC47070c f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C52926b.C52927a.C529281.m204912a(ErrorResult.this, this.f$1, this.f$2);
                        }
                    });
                }

                /* renamed from: a */
                public void onSuccess(SendHttpResponse sendHttpResponse) {
                    int intValue = sendHttpResponse.http_status_code.intValue();
                    C53241h.m205898b("MmRustExecutor", "onSuccess status " + intValue + " " + str + " time " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    if (intValue != 200) {
                        try {
                            onError(new ErrorResult(intValue, new String(sendHttpResponse.body.toByteArray())));
                        } catch (Exception unused) {
                            onError(new ErrorResult(intValue, "ERROR_RESPONSE_ERROR"));
                        }
                    } else if (cVar.f118482h) {
                        HttpMmResponse httpMmResponse = (HttpMmResponse) C47073a.m186344a(cVar, new String(sendHttpResponse.body.toByteArray()));
                        if (httpMmResponse != null) {
                            C45859k.m181685a(new Runnable(httpMmResponse, cVar) {
                                /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$b$a$1$3oMTPTT9ZGSzekep9TWFpvtRGZU */
                                public final /* synthetic */ HttpMmResponse f$1;
                                public final /* synthetic */ AbstractC47070c f$2;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                public final void run() {
                                    C52926b.C52927a.C529281.this.m204913a((C52926b.C52927a.C529281) this.f$1, (HttpMmResponse) this.f$2);
                                }
                            });
                            return;
                        }
                        C45855f.m181666e("MmRustExecutor", "onSuccess onError USER_DEF_ERR_BODY_INVALID");
                        onError(new ErrorResult((int) IByteRtcError.BRERR_INVALID_TOKEN, "USER_DEF_ERR_BODY_INVALID"));
                    } else {
                        HttpBaseResponse a = C47073a.m186343a(new String(sendHttpResponse.body.toByteArray()));
                        if (a != null) {
                            C45859k.m181685a(new Runnable(C47073a.m186344a(cVar, a.data), cVar) {
                                /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$b$a$1$pYxFkfffqrEQcL8ZeG2ZcBoO51k */
                                public final /* synthetic */ Object f$1;
                                public final /* synthetic */ AbstractC47070c f$2;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                public final void run() {
                                    C52926b.C52927a.C529281.this.m204914a((C52926b.C52927a.C529281) this.f$1, (Object) this.f$2);
                                }
                            });
                            return;
                        }
                        C45855f.m181666e("MmRustExecutor", "onSuccess onError USER_DEF_ERR_BODY_INVALID");
                        onError(new ErrorResult((int) IByteRtcError.BRERR_INVALID_TOKEN, "USER_DEF_ERR_BODY_INVALID"));
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m204913a(HttpMmResponse httpMmResponse, AbstractC47070c cVar) {
                    if (httpMmResponse.data != null) {
                        cVar.mo161289a(httpMmResponse);
                    } else {
                        onError(new ErrorResult((int) IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION, "USER_DEF_ERR_JSON_PARSE_EXCEPTION"));
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m204914a(Object obj, AbstractC47070c cVar) {
                    if (obj != null) {
                        cVar.mo161289a(obj);
                    } else {
                        onError(new ErrorResult((int) IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION, "USER_DEF_ERR_JSON_PARSE_EXCEPTION"));
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m204912a(ErrorResult errorResult, IHttpLocalErrorHandler aVar, AbstractC47070c cVar) {
                    HttpBaseResponse parse = HttpBaseResponse.parse(errorResult.getDebugMsg());
                    MmHttpErrorProcessor.f118486a.mo165334a(parse, aVar);
                    if (parse != null) {
                        cVar.mo161288a(new C47068a(errorResult.getErrorCode(), parse.code, errorResult.getDebugMsg()));
                    } else {
                        cVar.mo161288a(C47068a.m186323a(errorResult.getErrorCode(), errorResult.getDebugMsg()));
                    }
                }
            };
            ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, aVar, r1, new SdkSender.IParser() {
                /* class com.ss.android.lark.p2550q.p2551a.$$Lambda$nlGhYri8FPznwzigG1jXpA4FnXA */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (SendHttpResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }

        /* renamed from: a */
        public static void m204907a(String str, HttpHeaders httpHeaders, AbstractC47070c cVar, String str2) {
            m204906a(m204902a(str, HttpMethod.GET, httpHeaders, Collections.emptyMap()), cVar, str2, new MmCommonLocalErrorHandler());
        }

        /* renamed from: a */
        public static void m204908a(String str, HttpHeaders httpHeaders, AbstractC47070c cVar, String str2, IHttpLocalErrorHandler aVar) {
            m204906a(m204902a(str, HttpMethod.GET, httpHeaders, Collections.emptyMap()), cVar, str2, aVar);
        }

        /* renamed from: a */
        public static void m204909a(String str, HttpHeaders httpHeaders, Map<String, String> map, AbstractC47070c cVar, String str2) {
            m204906a(m204902a(str, HttpMethod.POST, httpHeaders, map), cVar, str2, new MmCommonLocalErrorHandler());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m204901a(HttpHeaders httpHeaders) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : httpHeaders.headersMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m204900a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null || map.size() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        boolean z = true;
        for (String str2 : map.keySet()) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(map.get(str2))) {
                if (z) {
                    z = false;
                } else {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append(str2);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }
}
