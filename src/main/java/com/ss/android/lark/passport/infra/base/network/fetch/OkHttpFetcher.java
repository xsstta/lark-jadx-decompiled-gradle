package com.ss.android.lark.passport.infra.base.network.fetch;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetchCallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.RequestResult;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/fetch/OkHttpFetcher;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetcher;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "asyncFetch", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetchCallback;", "buildBody", "Lokhttp3/RequestBody;", "buildRequest", "Lokhttp3/Request;", "toMap", "", "headers", "Lokhttp3/Headers;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.b.b */
public final class OkHttpFetcher implements IFetcher {

    /* renamed from: a */
    private final String f123236a = "OkHttpFetcher";

    /* renamed from: b */
    private final RequestBody m193387b(IRequest eVar) {
        HttpRequestBody httpRequestBody = new HttpRequestBody("application/json;charset=utf-8", C38760a.m153057a(eVar.mo171290i()));
        RequestBody create = RequestBody.create(MediaType.parse(httpRequestBody.getMediaType()), httpRequestBody.getContent());
        Intrinsics.checkExpressionValueIsNotNull(create, "RequestBody.create(Media…mediaType), body.content)");
        return create;
    }

    /* renamed from: a */
    public final Map<String, String> mo171316a(Headers headers) {
        HashMap hashMap = new HashMap();
        if (headers != null) {
            for (String str : headers.names()) {
                Intrinsics.checkExpressionValueIsNotNull(str, "name");
                hashMap.put(str, headers.get(str));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private final Request m193386a(IRequest eVar) {
        boolean z;
        if (eVar.mo171284c().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Request.Builder url = new Request.Builder().url(eVar.mo171288g());
        Intrinsics.checkExpressionValueIsNotNull(url, "Request.Builder().url(request.getUrl())");
        HttpHeaders f = eVar.mo171287f();
        if (f != null && !f.isEmpty()) {
            for (String str : f.getNames()) {
                try {
                    url.addHeader(str, f.get(str));
                } catch (Exception e) {
                    if (eVar.mo171293l()) {
                        PassportLog a = PassportLog.f123351c.mo171474a();
                        String str2 = this.f123236a;
                        a.mo171462a(str2, eVar.mo171292k() + " add header exception: " + str + ContainerUtils.KEY_VALUE_DELIMITER + f.get(str), e);
                    }
                }
            }
        }
        int i = C49072c.f123239a[eVar.mo171286e().ordinal()];
        if (i == 1) {
            url.get();
        } else if (i == 2) {
            url.post(m193387b(eVar));
        } else if (i == 3) {
            url.delete(m193387b(eVar));
        } else if (i == 4) {
            url.patch(m193387b(eVar));
        }
        return url.build();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/passport/infra/base/network/fetch/OkHttpFetcher$asyncFetch$1", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.b.b$a */
    public static final class C49071a implements Callback {

        /* renamed from: a */
        final /* synthetic */ OkHttpFetcher f123237a;

        /* renamed from: b */
        final /* synthetic */ IFetchCallback f123238b;

        C49071a(OkHttpFetcher bVar, IFetchCallback cVar) {
            this.f123237a = bVar;
            this.f123238b = cVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(iOException, "e");
            NetworkErrorResult networkErrorResult = new NetworkErrorResult(-1, iOException.toString());
            if (iOException instanceof SocketTimeoutException) {
                networkErrorResult.setErrorType(-6);
            }
            this.f123238b.mo171362a(networkErrorResult);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            String str;
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            int code = response.code();
            ResponseBody body = response.body();
            if (body != null) {
                str = body.string();
            } else {
                str = null;
            }
            if (str != null) {
                RequestResult fVar = new RequestResult(code, str);
                fVar.mo172212a(this.f123237a.mo171316a(response.headers()));
                this.f123238b.mo171363a(fVar);
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher
    /* renamed from: a */
    public void mo145171a(IRequest eVar, IFetchCallback cVar) {
        Call newCall;
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        OkHttpClient a = OkHttpClientHelper.f123234a.mo171315a();
        Request a2 = m193386a(eVar);
        if (a2 != null && a != null && (newCall = a.newCall(a2)) != null) {
            newCall.enqueue(new C49071a(this, cVar));
        }
    }
}
