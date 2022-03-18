package com.bytedance.lark.sdk;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\n&'()*+,-./B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001a@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\"@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse;", "", "builder", "Lcom/bytedance/lark/sdk/LarkResponse$Builder;", "(Lcom/bytedance/lark/sdk/LarkResponse$Builder;)V", "<set-?>", "", "hostIP", "getHostIP", "()Ljava/lang/String;", "Lcom/bytedance/lark/sdk/LarkResponse$InnerError;", "innerError", "getInnerError", "()Lcom/bytedance/lark/sdk/LarkResponse$InnerError;", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseStatus;", "reponseStatus", "getReponseStatus", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseStatus;", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;", "responseBody", "getResponseBody", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseComplexConnectProgress;", "responseComplexConnectProgress", "getResponseComplexConnectProgress", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseComplexConnectProgress;", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseError;", "responseError", "getResponseError", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseError;", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseHeader;", "responseHeader", "getResponseHeader", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseHeader;", "Lcom/bytedance/lark/sdk/LarkResponse$StageCost;", "stageCost", "getStageCost", "()Lcom/bytedance/lark/sdk/LarkResponse$StageCost;", "Builder", "InnerError", "InnerErrorCode", "ResponseBody", "ResponseComplexConnectProgress", "ResponseError", "ResponseHeader", "ResponseStatus", "SdkErrorCode", "StageCost", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LarkResponse {

    /* renamed from: a */
    private StageCost f48338a;

    /* renamed from: b */
    private ResponseStatus f48339b = ResponseStatus.UNKNOWN;

    /* renamed from: c */
    private ResponseHeader f48340c;

    /* renamed from: d */
    private InnerError f48341d;

    /* renamed from: e */
    private ResponseError f48342e;

    /* renamed from: f */
    private ResponseBody f48343f;

    /* renamed from: g */
    private ResponseComplexConnectProgress f48344g;

    /* renamed from: h */
    private String f48345h = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$ResponseStatus;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SUCCESS", "CANCEL", "ERROR", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ResponseStatus {
        UNKNOWN,
        SUCCESS,
        CANCEL,
        ERROR
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;", "", "contentLength", "", "contentType", "", "body", "Ljava/io/ByteArrayOutputStream;", "(JLjava/lang/String;Ljava/io/ByteArrayOutputStream;)V", "getBody", "()Ljava/io/ByteArrayOutputStream;", "getContentLength", "()J", "getContentType", "()Ljava/lang/String;", "Companion", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$c */
    public static final class ResponseBody {

        /* renamed from: a */
        public static final Companion f48356a = new Companion(null);

        /* renamed from: b */
        private final long f48357b;

        /* renamed from: c */
        private final String f48358c;

        /* renamed from: d */
        private final ByteArrayOutputStream f48359d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody$Companion;", "", "()V", "createEmptyResponseBody", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.lark.sdk.LarkResponse$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final String mo67145a() {
            return this.f48358c;
        }

        /* renamed from: b */
        public final ByteArrayOutputStream mo67146b() {
            return this.f48359d;
        }

        public ResponseBody(long j, String str, ByteArrayOutputStream byteArrayOutputStream) {
            Intrinsics.checkParameterIsNotNull(str, "contentType");
            Intrinsics.checkParameterIsNotNull(byteArrayOutputStream, "body");
            this.f48357b = j;
            this.f48358c = str;
            this.f48359d = byteArrayOutputStream;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$InnerErrorCode;", "", "value", "", "(Ljava/lang/String;II)V", "toInt", GrsBaseInfo.CountryCodeSource.UNKNOWN, "WAIT_TIMEOUT", "MEMORY_LIMIT", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum InnerErrorCode {
        UNKNOWN(2000),
        WAIT_TIMEOUT(2001),
        MEMORY_LIMIT(2002);
        
        private int value = -1;

        public final int toInt() {
            return this.value;
        }

        private InnerErrorCode(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$SdkErrorCode;", "", "value", "", "(Ljava/lang/String;II)V", "toInt", "TIMEOUT", "OTHERS", "SDK", "OFFLINE", "IO", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SdkErrorCode {
        TIMEOUT(1000),
        OTHERS(CommonCode.StatusCode.API_CLIENT_EXPIRED),
        SDK(1002),
        OFFLINE(1003),
        IO(1004);
        
        private int value = -1;

        public final int toInt() {
            return this.value;
        }

        private SdkErrorCode(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00103\u001a\u000204R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$Builder;", "", "()V", "hostIP", "", "getHostIP", "()Ljava/lang/String;", "setHostIP", "(Ljava/lang/String;)V", "innerError", "Lcom/bytedance/lark/sdk/LarkResponse$InnerError;", "getInnerError", "()Lcom/bytedance/lark/sdk/LarkResponse$InnerError;", "setInnerError", "(Lcom/bytedance/lark/sdk/LarkResponse$InnerError;)V", "reponseStatus", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseStatus;", "getReponseStatus", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseStatus;", "setReponseStatus", "(Lcom/bytedance/lark/sdk/LarkResponse$ResponseStatus;)V", "responseBody", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;", "getResponseBody", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;", "setResponseBody", "(Lcom/bytedance/lark/sdk/LarkResponse$ResponseBody;)V", "responseComplexConnectProgress", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseComplexConnectProgress;", "getResponseComplexConnectProgress", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseComplexConnectProgress;", "setResponseComplexConnectProgress", "(Lcom/bytedance/lark/sdk/LarkResponse$ResponseComplexConnectProgress;)V", "responseError", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseError;", "getResponseError", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseError;", "setResponseError", "(Lcom/bytedance/lark/sdk/LarkResponse$ResponseError;)V", "responseHeader", "Lcom/bytedance/lark/sdk/LarkResponse$ResponseHeader;", "getResponseHeader", "()Lcom/bytedance/lark/sdk/LarkResponse$ResponseHeader;", "setResponseHeader", "(Lcom/bytedance/lark/sdk/LarkResponse$ResponseHeader;)V", "stageCost", "Lcom/bytedance/lark/sdk/LarkResponse$StageCost;", "getStageCost", "()Lcom/bytedance/lark/sdk/LarkResponse$StageCost;", "setStageCost", "(Lcom/bytedance/lark/sdk/LarkResponse$StageCost;)V", "build", "Lcom/bytedance/lark/sdk/LarkResponse;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$a */
    public static final class Builder {

        /* renamed from: a */
        private StageCost f48346a;

        /* renamed from: b */
        private ResponseStatus f48347b = ResponseStatus.UNKNOWN;

        /* renamed from: c */
        private ResponseHeader f48348c;

        /* renamed from: d */
        private InnerError f48349d;

        /* renamed from: e */
        private ResponseError f48350e;

        /* renamed from: f */
        private ResponseBody f48351f;

        /* renamed from: g */
        private ResponseComplexConnectProgress f48352g;

        /* renamed from: h */
        private String f48353h = "";

        /* renamed from: a */
        public final StageCost mo67126a() {
            return this.f48346a;
        }

        /* renamed from: b */
        public final ResponseStatus mo67135b() {
            return this.f48347b;
        }

        /* renamed from: c */
        public final ResponseHeader mo67136c() {
            return this.f48348c;
        }

        /* renamed from: d */
        public final InnerError mo67137d() {
            return this.f48349d;
        }

        /* renamed from: e */
        public final ResponseError mo67138e() {
            return this.f48350e;
        }

        /* renamed from: f */
        public final ResponseBody mo67139f() {
            return this.f48351f;
        }

        /* renamed from: g */
        public final ResponseComplexConnectProgress mo67140g() {
            return this.f48352g;
        }

        /* renamed from: h */
        public final String mo67141h() {
            return this.f48353h;
        }

        /* renamed from: i */
        public final LarkResponse mo67142i() {
            return new LarkResponse(this);
        }

        /* renamed from: a */
        public final void mo67127a(ResponseStatus responseStatus) {
            Intrinsics.checkParameterIsNotNull(responseStatus, "<set-?>");
            this.f48347b = responseStatus;
        }

        /* renamed from: a */
        public final void mo67128a(InnerError bVar) {
            this.f48349d = bVar;
        }

        /* renamed from: a */
        public final void mo67129a(ResponseBody cVar) {
            this.f48351f = cVar;
        }

        /* renamed from: a */
        public final void mo67130a(ResponseComplexConnectProgress dVar) {
            this.f48352g = dVar;
        }

        /* renamed from: a */
        public final void mo67131a(ResponseError eVar) {
            this.f48350e = eVar;
        }

        /* renamed from: a */
        public final void mo67132a(ResponseHeader fVar) {
            this.f48348c = fVar;
        }

        /* renamed from: a */
        public final void mo67133a(StageCost gVar) {
            this.f48346a = gVar;
        }

        /* renamed from: a */
        public final void mo67134a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f48353h = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$InnerError;", "", "innerErrorCode", "Lcom/bytedance/lark/sdk/LarkResponse$InnerErrorCode;", "message", "", "(Lcom/bytedance/lark/sdk/LarkResponse$InnerErrorCode;Ljava/lang/String;)V", "getInnerErrorCode", "()Lcom/bytedance/lark/sdk/LarkResponse$InnerErrorCode;", "getMessage", "()Ljava/lang/String;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$b */
    public static final class InnerError {

        /* renamed from: a */
        private final InnerErrorCode f48354a;

        /* renamed from: b */
        private final String f48355b;

        /* renamed from: a */
        public final InnerErrorCode mo67143a() {
            return this.f48354a;
        }

        /* renamed from: b */
        public final String mo67144b() {
            return this.f48355b;
        }

        public InnerError(InnerErrorCode innerErrorCode, String str) {
            Intrinsics.checkParameterIsNotNull(innerErrorCode, "innerErrorCode");
            Intrinsics.checkParameterIsNotNull(str, "message");
            this.f48354a = innerErrorCode;
            this.f48355b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$ResponseError;", "", "sdkErrorCode", "Lcom/bytedance/lark/sdk/LarkResponse$SdkErrorCode;", "message", "", "(Lcom/bytedance/lark/sdk/LarkResponse$SdkErrorCode;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getSdkErrorCode", "()Lcom/bytedance/lark/sdk/LarkResponse$SdkErrorCode;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$e */
    public static final class ResponseError {

        /* renamed from: a */
        private final SdkErrorCode f48362a;

        /* renamed from: b */
        private final String f48363b;

        /* renamed from: a */
        public final SdkErrorCode mo67147a() {
            return this.f48362a;
        }

        /* renamed from: b */
        public final String mo67148b() {
            return this.f48363b;
        }

        public ResponseError(SdkErrorCode sdkErrorCode, String str) {
            Intrinsics.checkParameterIsNotNull(sdkErrorCode, "sdkErrorCode");
            Intrinsics.checkParameterIsNotNull(str, "message");
            this.f48362a = sdkErrorCode;
            this.f48363b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$ResponseHeader;", "", "httpStatusCode", "", "protocol", "Lcom/bytedance/lark/sdk/LarkNetProtocol;", "headers", "", "Lcom/bytedance/lark/sdk/HttpHeader;", "(ILcom/bytedance/lark/sdk/LarkNetProtocol;Ljava/util/List;)V", "getHeaders", "()Ljava/util/List;", "getHttpStatusCode", "()I", "getProtocol", "()Lcom/bytedance/lark/sdk/LarkNetProtocol;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$f */
    public static final class ResponseHeader {

        /* renamed from: a */
        private final int f48364a;

        /* renamed from: b */
        private final LarkNetProtocol f48365b;

        /* renamed from: c */
        private final List<HttpHeader> f48366c;

        /* renamed from: a */
        public final int mo67149a() {
            return this.f48364a;
        }

        /* renamed from: b */
        public final LarkNetProtocol mo67150b() {
            return this.f48365b;
        }

        /* renamed from: c */
        public final List<HttpHeader> mo67151c() {
            return this.f48366c;
        }

        public ResponseHeader(int i, LarkNetProtocol larkNetProtocol, List<HttpHeader> list) {
            Intrinsics.checkParameterIsNotNull(larkNetProtocol, "protocol");
            Intrinsics.checkParameterIsNotNull(list, "headers");
            this.f48364a = i;
            this.f48365b = larkNetProtocol;
            this.f48366c = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$StageCost;", "", "dnsCost", "", "tcpConnectCost", "tlsCost", "(III)V", "getDnsCost", "()I", "getTcpConnectCost", "getTlsCost", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$g */
    public static final class StageCost {

        /* renamed from: a */
        private final int f48367a;

        /* renamed from: b */
        private final int f48368b;

        /* renamed from: c */
        private final int f48369c;

        /* renamed from: a */
        public final int mo67152a() {
            return this.f48367a;
        }

        /* renamed from: b */
        public final int mo67153b() {
            return this.f48368b;
        }

        /* renamed from: c */
        public final int mo67154c() {
            return this.f48369c;
        }

        public StageCost(int i, int i2, int i3) {
            this.f48367a = i;
            this.f48368b = i2;
            this.f48369c = i3;
        }
    }

    /* renamed from: a */
    public final StageCost mo67117a() {
        return this.f48338a;
    }

    /* renamed from: b */
    public final ResponseStatus mo67118b() {
        return this.f48339b;
    }

    /* renamed from: c */
    public final ResponseHeader mo67119c() {
        return this.f48340c;
    }

    /* renamed from: d */
    public final InnerError mo67120d() {
        return this.f48341d;
    }

    /* renamed from: e */
    public final ResponseError mo67121e() {
        return this.f48342e;
    }

    /* renamed from: f */
    public final ResponseBody mo67122f() {
        return this.f48343f;
    }

    /* renamed from: g */
    public final String mo67123g() {
        return this.f48345h;
    }

    public LarkResponse(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f48338a = aVar.mo67126a();
        this.f48339b = aVar.mo67135b();
        this.f48340c = aVar.mo67136c();
        this.f48341d = aVar.mo67137d();
        this.f48342e = aVar.mo67138e();
        this.f48343f = aVar.mo67139f();
        this.f48344g = aVar.mo67140g();
        this.f48345h = aVar.mo67141h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/lark/sdk/LarkResponse$ResponseComplexConnectProgress;", "", "recvLength", "", "contentLength", "(II)V", "getContentLength", "()I", "getRecvLength", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.LarkResponse$d */
    public static final class ResponseComplexConnectProgress {

        /* renamed from: a */
        private final int f48360a;

        /* renamed from: b */
        private final int f48361b;

        public ResponseComplexConnectProgress(int i, int i2) {
            this.f48360a = i;
            this.f48361b = i2;
        }
    }
}
