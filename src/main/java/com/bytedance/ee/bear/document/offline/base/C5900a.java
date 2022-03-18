package com.bytedance.ee.bear.document.offline.base;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.net.C5202c;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.jsbridge.AbstractC7944c;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.eenet.httpclient.rust.exception.RustIOException;
import com.bytedance.ee.eenet.util.ComplexConnect;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.bytedance.ee.bear.document.offline.base.a */
public class C5900a implements AbstractC7944c<FetchModel> {

    /* renamed from: a */
    public final ConcurrentLinkedQueue<Call> f16520a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public C5904b f16521b;

    /* renamed from: c */
    public boolean f16522c = true;

    /* renamed from: d */
    private final C68289a f16523d = new C68289a();

    /* renamed from: e */
    private ConnectionService f16524e;

    /* renamed from: f */
    private LiveData<ConnectionService.NetworkState> f16525f;

    /* renamed from: g */
    private AbstractC1178x<ConnectionService.NetworkState> f16526g = new AbstractC1178x<ConnectionService.NetworkState>() {
        /* class com.bytedance.ee.bear.document.offline.base.C5900a.C59011 */

        /* renamed from: a */
        public void onChanged(ConnectionService.NetworkState networkState) {
            C5900a.this.f16522c = networkState.mo20041b();
            C13479a.m54764b("FetchHandler", "newConnectionDetector  mIsConnected: " + C5900a.this.f16522c);
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m23771c() {
        this.f16525f.mo5928b(this.f16526g);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m23772d() {
        this.f16525f.mo5925a(this.f16526g);
    }

    /* renamed from: b */
    public void mo23868b() {
        C13479a.m54764b("FetchHandler", "destroy: ");
        if (this.f16525f != null && this.f16526g != null) {
            C13748k.m55732a(new Runnable() {
                /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$a$nY1xOzJBvLJoVzjyYbXOt4oErA */

                public final void run() {
                    C5900a.m269255lambda$nY1xOzJBvLJoVzjyYbXOt4oErA(C5900a.this);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo23864a() {
        C13479a.m54764b("FetchHandler", "cancelAll: ");
        Iterator<Call> it = this.f16520a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.f16520a.clear();
        this.f16523d.mo237935a();
    }

    /* renamed from: b */
    private AbstractC68307f<OfflineResultModel> m23770b(final FetchModel fetchModel) {
        if (this.f16522c || this.f16524e.mo20038b().mo20041b()) {
            final int[] iArr = {0};
            return AbstractC68307f.m265080a(new AbstractC68324h<OfflineResultModel>() {
                /* class com.bytedance.ee.bear.document.offline.base.C5900a.C59022 */

                @Override // io.reactivex.AbstractC68324h
                public void subscribe(final AbstractC68323g<OfflineResultModel> gVar) throws Exception {
                    if (!gVar.isCancelled()) {
                        C13479a.m54764b("FetchHandler", "subscribe: begin request for ");
                        Request.Builder a = C5900a.this.mo23863a(fetchModel);
                        if (C5900a.this.mo23866a(fetchModel.key)) {
                            a.addHeader("EENet-Request-Enable-Complex-Connect", ComplexConnect.TRUE.toString());
                        }
                        final Call newCall = C5900a.this.f16521b.mo23870a().newCall(a.build());
                        C5900a.this.f16520a.add(newCall);
                        newCall.enqueue(new Callback() {
                            /* class com.bytedance.ee.bear.document.offline.base.C5900a.C59022.C59031 */

                            @Override // okhttp3.Callback
                            public void onFailure(Call call, IOException iOException) {
                                int i;
                                C5900a.this.f16520a.remove(newCall);
                                if (!gVar.isCancelled()) {
                                    C13479a.m54758a("FetchHandler", "   url:     Exception: " + iOException);
                                    String iOException2 = iOException.toString();
                                    if (iOException instanceof RustIOException) {
                                        i = ((RustIOException) iOException).getRustSdkErrorCode();
                                    } else {
                                        i = C5202c.m21233a(iOException);
                                    }
                                    if (C5900a.this.mo23867a(iOException)) {
                                        int[] iArr = iArr;
                                        iArr[0] = iArr[0] + 1;
                                        C13479a.m54764b("FetchHandler", "onFailure: try count " + iArr[0] + "   errorCode: " + i + "  e: " + iOException.toString());
                                        if (iArr[0] >= fetchModel.retryCount) {
                                            C13479a.m54764b("FetchHandler", "onFailure: have tried " + fetchModel.retryCount + " times for ");
                                            gVar.onNext(new OfflineResultModel(i, iOException2, "{}"));
                                            gVar.onComplete();
                                            return;
                                        }
                                        gVar.onError(iOException);
                                        gVar.onComplete();
                                        return;
                                    }
                                    C13479a.m54758a("FetchHandler", "onFailure   errorCode: " + i + "  e: " + iOException.toString());
                                    gVar.onNext(new OfflineResultModel(i, iOException2, "{}"));
                                    gVar.onComplete();
                                }
                            }

                            @Override // okhttp3.Callback
                            public void onResponse(Call call, Response response) throws IOException {
                                String str;
                                int i;
                                C5900a.this.f16520a.remove(newCall);
                                if (!gVar.isCancelled()) {
                                    C13479a.m54764b("FetchHandler", "onResponse: request success for " + call + "   url: ");
                                    ResponseBody body = response.body();
                                    if (body == null) {
                                        str = "";
                                    } else {
                                        str = body.string();
                                    }
                                    if (!TextUtils.isEmpty(str) && str.endsWith("\n")) {
                                        str = C5900a.m23767a(str, "\n", "");
                                    }
                                    OfflineResultModel offlineResultModel = new OfflineResultModel();
                                    offlineResultModel.setData(str);
                                    int i2 = 0;
                                    if (!TextUtils.isEmpty(str) && fetchModel.checkResponseDataJSONValid) {
                                        try {
                                            JSON.parseObject(str);
                                            offlineResultModel.setDataJsonInvalid(false);
                                        } catch (Exception unused) {
                                            offlineResultModel.setDataJsonInvalid(true);
                                        }
                                    }
                                    offlineResultModel.setMessage("");
                                    int code = response.code();
                                    if (code != 200) {
                                        i2 = code;
                                    }
                                    if (i2 > 0) {
                                        i = -i2;
                                    } else {
                                        i = i2;
                                    }
                                    offlineResultModel.setCode(i);
                                    if (i2 != 0) {
                                        C13479a.m54758a("FetchHandler", "requestNetResource()... code = " + i2 + ", responseStr = " + str + ", for " + call);
                                    }
                                    gVar.onNext(offlineResultModel);
                                    gVar.onComplete();
                                }
                            }
                        });
                    }
                }
            }, BackpressureStrategy.BUFFER).mo237982a((long) fetchModel.retryCount, new AbstractC68322n() {
                /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$YT66hgZ_jc44EF7G3AjX9vBAW0I */

                @Override // io.reactivex.functions.AbstractC68322n
                public final boolean test(Object obj) {
                    return C5900a.this.mo23867a((Throwable) obj);
                }
            });
        }
        C13479a.m54775e("FetchHandler", "sendRequestIfNeed not connected ");
        return AbstractC68307f.m265083a(new OfflineResultModel(-1, "no_network", "{}"));
    }

    /* renamed from: a */
    public Request.Builder mo23863a(FetchModel fetchModel) {
        String str;
        fetchModel.headers.remove("Accept-Encoding");
        Request.Builder builder = new Request.Builder();
        builder.url(fetchModel.url);
        if (fetchModel.headers != null) {
            for (Map.Entry<String, String> entry : fetchModel.headers.entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if ("get".equalsIgnoreCase(fetchModel.method)) {
            builder.method(fetchModel.method, null);
        } else {
            String str2 = fetchModel.method;
            MediaType parse = MediaType.parse(fetchModel.headers.get("Content-Type"));
            if (TextUtils.isEmpty(fetchModel.body)) {
                str = "";
            } else {
                str = fetchModel.body;
            }
            builder.method(str2, RequestBody.create(parse, str));
        }
        builder.addHeader("EENet-Request-Tag", "docJSFetchRequest");
        builder.addHeader("fromsource", "mobileweb");
        return builder;
    }

    /* renamed from: a */
    public boolean mo23866a(String str) {
        if (TextUtils.equals(str, "CLIENT_VARS")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo23867a(Throwable th) {
        if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23769a(AbstractC7947h hVar, Throwable th) throws Exception {
        C5890a.m23697a(new OfflineResultModel(-3, "unkown error", "{}"), hVar);
        C13479a.m54759a("FetchHandler", "handle: error", th);
    }

    C5900a(Context context, AbstractC4928g gVar) {
        Context applicationContext = context.getApplicationContext();
        ConnectionService d = C5084ad.m20847d();
        this.f16524e = d;
        this.f16525f = d.mo20037a();
        C13748k.m55732a(new Runnable() {
            /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$a$SvlqwJW9IduuAFTGcYv_oIQTCWQ */

            public final void run() {
                C5900a.lambda$SvlqwJW9IduuAFTGcYv_oIQTCWQ(C5900a.this);
            }
        });
        this.f16521b = new C5904b(applicationContext, C5084ad.m20847d());
    }

    /* renamed from: a */
    public void handle(FetchModel fetchModel, AbstractC7947h hVar) {
        if (fetchModel == null) {
            C13479a.m54758a("FetchHandler", "handle: fetchModel is null");
            return;
        }
        this.f16523d.mo237937a(m23770b(fetchModel).mo238001b(new Consumer(hVar) {
            /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$a$6uwwtsfZDK59TxBZ5GUrAt0me0 */
            public final /* synthetic */ AbstractC7947h f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5900a.m269254lambda$6uwwtsfZDK59TxBZ5GUrAt0me0(FetchModel.this, this.f$1, (OfflineResultModel) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.document.offline.base.$$Lambda$a$hXbtWafqqCN7CY4cziSLPn4vQaY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5900a.lambda$hXbtWafqqCN7CY4cziSLPn4vQaY(AbstractC7947h.this, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m23768a(FetchModel fetchModel, AbstractC7947h hVar, OfflineResultModel offlineResultModel) throws Exception {
        C13479a.m54764b("FetchHandler", "handle: have result for ");
        offlineResultModel.setUrl(fetchModel.url);
        C5890a.m23697a(offlineResultModel, hVar);
    }

    /* renamed from: a */
    public static String m23767a(String str, String str2, String str3) {
        return str.replaceFirst("(?s)" + str2 + "(?!.*?" + str2 + ")", str3);
    }
}
