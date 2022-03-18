package com.ss.android.lark.integrator.passport.lazy.init;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpRequestBody;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetchCallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.RequestResult;
import com.ss.android.lark.sdk.SdkSender;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/integrator/passport/lazy/init/RustFetcher;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetcher;", "()V", "TAG", "", "logger", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "asyncFetch", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetchCallback;", "buildRequest", "Lcom/bytedance/lark/pb/basic/v1/SendHttpRequest$Builder;", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.lazy.init.c */
public final class RustFetcher implements IFetcher {

    /* renamed from: a */
    private final String f101697a = "RustFetcher";

    /* renamed from: b */
    private final PassportLog f101698b = PassportLog.f123351c.mo171474a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/passport/lazy/init/RustFetcher$asyncFetch$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sendHttpResponse", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.lazy.init.c$a */
    public static final class C39982a implements IGetDataCallback<SendHttpResponse> {

        /* renamed from: a */
        final /* synthetic */ IFetchCallback f101699a;

        C39982a(IFetchCallback cVar) {
            this.f101699a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f101699a.mo171362a(new NetworkErrorResult(errorResult.getErrorCode(), errorResult.getDisplayMsg()));
        }

        /* renamed from: a */
        public void onSuccess(SendHttpResponse sendHttpResponse) {
            Intrinsics.checkParameterIsNotNull(sendHttpResponse, "sendHttpResponse");
            byte[] byteArray = sendHttpResponse.body.toByteArray();
            Intrinsics.checkExpressionValueIsNotNull(byteArray, "sendHttpResponse.body.toByteArray()");
            String str = new String(byteArray, Charsets.f173341a);
            Integer num = sendHttpResponse.http_status_code;
            Intrinsics.checkExpressionValueIsNotNull(num, "sendHttpResponse.http_status_code");
            RequestResult fVar = new RequestResult(num.intValue(), str);
            fVar.mo172212a(sendHttpResponse.headers);
            this.f101699a.mo171363a(fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/basic/v1/SendHttpResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.lazy.init.c$b */
    static final class C39983b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C39983b f101700a = new C39983b();

        C39983b() {
        }

        /* renamed from: a */
        public final SendHttpResponse parse(byte[] bArr) {
            return SendHttpResponse.ADAPTER.decode(bArr);
        }
    }

    /* renamed from: a */
    private final SendHttpRequest.C15253a m158615a(IRequest eVar) {
        if (!TextUtils.isEmpty(eVar.mo171284c())) {
            SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
            aVar.mo55528a(eVar.mo171288g());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HttpHeaders f = eVar.mo171287f();
            if (f != null && !f.isEmpty()) {
                for (String str : f.getNames()) {
                    Intrinsics.checkExpressionValueIsNotNull(str, "key");
                    String str2 = f.get(str);
                    Intrinsics.checkExpressionValueIsNotNull(str2, "httpHeaders[key]");
                    linkedHashMap.put(str, str2);
                }
            }
            aVar.mo55529a(linkedHashMap);
            aVar.f40436f = linkedHashMap.get("X-Request-ID");
            int i = C39984d.f101701a[eVar.mo171286e().ordinal()];
            if (i == 1) {
                aVar.mo55526a(SendHttpRequest.Method.GET);
            } else if (i == 2) {
                HttpRequestBody httpRequestBody = new HttpRequestBody("application/json;charset=utf-8", C38760a.m153057a(eVar.mo171290i()));
                if (!TextUtils.isEmpty(httpRequestBody.getContent())) {
                    String content = httpRequestBody.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content, "body.content");
                    Charset charset = Charsets.f173341a;
                    if (content != null) {
                        byte[] bytes = content.getBytes(charset);
                        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                        aVar.mo55530a(ByteString.of(bytes, 0, bytes.length));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (eVar.mo171293l()) {
                    this.f101698b.mo171468c(this.f101697a, "post body is null or getContent is empty");
                }
                aVar.mo55526a(SendHttpRequest.Method.POST);
            } else if (i == 3) {
                aVar.mo55526a(SendHttpRequest.Method.PATCH);
            } else if (i == 4) {
                HttpRequestBody httpRequestBody2 = new HttpRequestBody("application/json;charset=utf-8", C38760a.m153057a(eVar.mo171290i()));
                if (!TextUtils.isEmpty(httpRequestBody2.getContent())) {
                    String content2 = httpRequestBody2.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content2, "deleteBody.content");
                    Charset charset2 = Charsets.f173341a;
                    if (content2 != null) {
                        byte[] bytes2 = content2.getBytes(charset2);
                        Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                        aVar.mo55530a(ByteString.of(bytes2, 0, bytes2.length));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (eVar.mo171293l()) {
                    this.f101698b.mo171468c(this.f101697a, "delete body is null or getContent is empty");
                }
                aVar.mo55526a(SendHttpRequest.Method.DELETE);
            }
            return aVar;
        } else if (!eVar.mo171293l()) {
            return null;
        } else {
            this.f101698b.mo171465b(this.f101697a, "url is empty");
            return null;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher
    /* renamed from: a */
    public void mo145171a(IRequest eVar, IFetchCallback cVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        SendHttpRequest.C15253a a = m158615a(eVar);
        if (a == null) {
            cVar.mo171362a(new NetworkErrorResult(-1, "builder is null"));
        } else {
            SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, a, new C39982a(cVar), C39983b.f101700a);
        }
    }
}
