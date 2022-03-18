package com.ss.android.lark.audit.http;

import android.text.TextUtils;
import com.larksuite.framework.http.p1191f.C26003a;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.log.Log;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* renamed from: com.ss.android.lark.audit.http.f */
public class C29337f implements AbstractC29335d {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.audit.http.f$2 */
    public static /* synthetic */ class C293392 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73382a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.http.model.http.HttpMethod[] r0 = com.ss.android.lark.http.model.http.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.audit.http.C29337f.C293392.f73382a = r0
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.audit.http.C29337f.C293392.f73382a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.model.http.HttpMethod r1 = com.ss.android.lark.http.model.http.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.audit.http.C29337f.C293392.<clinit>():void");
        }
    }

    /* renamed from: a */
    public RequestBody mo103921a(IRequest iRequest) {
        try {
            return RequestBody.create(MediaType.parse("application/x-protobuf"), iRequest.getRequestBytes());
        } catch (Exception e) {
            Log.m165383e("OkHttpExecutor", "buildBody error " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private Request m107791b(IRequest iRequest) {
        if (TextUtils.isEmpty(iRequest.getUrl())) {
            return null;
        }
        Request.Builder url = new Request.Builder().url(iRequest.getUrl());
        HttpHeaders buildHeaders = iRequest.buildHeaders(iRequest.getHeaders());
        if (!buildHeaders.isEmpty()) {
            for (String str : buildHeaders.getNames()) {
                try {
                    url.addHeader(str, buildHeaders.get(str));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        int i = C293392.f73382a[iRequest.getMethod().ordinal()];
        if (i == 1) {
            url.get();
        } else if (i == 2) {
            url.post(mo103921a(iRequest));
        }
        return url.build();
    }

    @Override // com.ss.android.lark.audit.http.AbstractC29335d
    /* renamed from: a */
    public <T extends BaseRequest> void mo103920a(final T t, final AbstractC29334c cVar) {
        if (cVar != null) {
            C29336e.m107790a().newCall(m107791b(t)).enqueue(new Callback() {
                /* class com.ss.android.lark.audit.http.C29337f.C293381 */

                /* renamed from: a */
                public void mo103922a(BaseRequest baseRequest, AbstractC29334c cVar) {
                    if (baseRequest != null && baseRequest.getReTryNum() < 7) {
                        baseRequest.tryNumAdd();
                        C29337f.this.mo103920a(baseRequest, cVar);
                    }
                }

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    C29333b bVar = new C29333b(-1, iOException.toString());
                    AbstractC29334c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo103880a(bVar);
                    }
                    mo103922a(t, cVar);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    Log.m165389i("OkHttpExecutor", "onResponse " + t.getUrl());
                    String string = response.body().string();
                    try {
                        BaseResponse baseResponse = (BaseResponse) C26003a.m94120a(string, BaseResponse.class);
                        if (baseResponse == null) {
                            Log.m165383e("OkHttpExecutor", t.getUrl() + " baseResponse is null " + string);
                            AbstractC29334c cVar = cVar;
                            if (cVar != null) {
                                cVar.mo103880a(new C29333b(-1, "baseResponse is null " + string));
                            }
                            mo103922a(t, cVar);
                        } else if (baseResponse.code != 0) {
                            Log.m165383e("OkHttpExecutor", t.getUrl() + " baseResponse is error " + baseResponse.code + " " + baseResponse.messge);
                            AbstractC29334c cVar2 = cVar;
                            if (cVar2 != null) {
                                cVar2.mo103880a(new C29333b(baseResponse.code, baseResponse.messge));
                            }
                            mo103922a(t, cVar);
                        } else {
                            cVar.mo103881a(baseResponse.data);
                        }
                    } catch (Throwable th) {
                        cVar.mo103880a(new C29333b(-1, th.getMessage()));
                    }
                }
            });
        }
    }
}
