package com.ss.android.lark.passport.infra.base.network;

import com.larksuite.framework.utils.aq;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u00014B\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0002\u0010\u001cJ\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0003H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\b\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0016J\b\u0010(\u001a\u00020\tH\u0016J\b\u0010)\u001a\u00020\u0003H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\n\u0010+\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010,\u001a\u00020\u0003H\u0016J\b\u0010-\u001a\u00020\u0007H\u0016J\b\u0010.\u001a\u00020\u0003H\u0016J\u0014\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\n\u00100\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u00101\u001a\u00020\u0003H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u00103\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u000e\u0010\u001d\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/CommonRequest;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "path", "", "method", "Lcom/ss/android/lark/http/model/http/HttpMethod;", "params", "Lcom/ss/android/lark/http/model/http/HttpParams;", "headers", "Lcom/ss/android/lark/http/model/http/HttpHeaders;", "body", "", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "monitorCode", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "mIgnoreCaptchaToken", "", "isNewPassportLifecycle", "changeToUIThread", "usePacketHost", "captchaType", "isNeedLoginInfo", "handlers", "", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "autoHandleToast", "(Ljava/lang/String;Lcom/ss/android/lark/http/model/http/HttpMethod;Lcom/ss/android/lark/http/model/http/HttpParams;Lcom/ss/android/lark/http/model/http/HttpHeaders;Ljava/util/Map;Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;ZZZZLjava/lang/String;ZLjava/util/List;Z)V", "TAG", "host", "isCanceled", "monitor", "buildUrl", "callbackAtUIThread", "canLog", "cancel", "", "getCaptchaType", "getExtraCommonCodeHandler", "getHeaders", "getHost", "getMethod", "getMonitorCodeCreator", "getName", "getParams", "getPath", "getRequestBody", "getUniContext", "getUrl", "ignoreCaptchaToken", "setHost", "Builder", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.a */
public final class CommonRequest implements IRequest {

    /* renamed from: a */
    private final String f123199a;

    /* renamed from: b */
    private String f123200b;

    /* renamed from: c */
    private AbstractC49348a f123201c;

    /* renamed from: d */
    private boolean f123202d;

    /* renamed from: e */
    private String f123203e;

    /* renamed from: f */
    private HttpMethod f123204f;

    /* renamed from: g */
    private HttpParams f123205g;

    /* renamed from: h */
    private HttpHeaders f123206h;

    /* renamed from: i */
    private Map<String, Object> f123207i;

    /* renamed from: j */
    private UniContext f123208j;

    /* renamed from: k */
    private final boolean f123209k;

    /* renamed from: l */
    private final boolean f123210l;

    /* renamed from: m */
    private final boolean f123211m;

    /* renamed from: n */
    private final boolean f123212n;

    /* renamed from: o */
    private final String f123213o;

    /* renamed from: p */
    private boolean f123214p;

    /* renamed from: q */
    private List<? extends ICommonCodeHandler> f123215q;

    /* renamed from: r */
    private final boolean f123216r;

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c
    /* renamed from: a */
    public void mo171123a() {
        this.f123202d = true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: l */
    public boolean mo171293l() {
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c
    /* renamed from: b */
    public boolean mo171124b() {
        return this.f123202d;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: c */
    public String mo171284c() {
        return this.f123203e;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: d */
    public UniContext mo171285d() {
        return this.f123208j;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: e */
    public HttpMethod mo171286e() {
        return this.f123204f;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: f */
    public HttpHeaders mo171287f() {
        return this.f123206h;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: h */
    public String mo171289h() {
        return this.f123200b;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: i */
    public Map<String, Object> mo171290i() {
        return this.f123207i;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: j */
    public HttpParams mo171291j() {
        return this.f123205g;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: k */
    public String mo171292k() {
        return this.f123199a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.passport.signinsdk_api.base.network.b>, java.util.List<com.ss.android.lark.passport.signinsdk_api.base.network.b> */
    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: m */
    public List<ICommonCodeHandler> mo171294m() {
        return this.f123215q;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: n */
    public AbstractC49348a mo171295n() {
        return this.f123201c;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: o */
    public boolean mo171296o() {
        return this.f123214p;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: p */
    public boolean mo171297p() {
        return this.f123209k;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: q */
    public String mo171298q() {
        return this.f123213o;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: r */
    public boolean mo171299r() {
        return this.f123210l;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: s */
    public boolean mo171300s() {
        return this.f123211m;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: t */
    public boolean mo171301t() {
        return this.f123212n;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: u */
    public boolean mo171302u() {
        return this.f123216r;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: g */
    public String mo171288g() {
        return m193343v();
    }

    /* renamed from: v */
    private final String m193343v() {
        HttpUrl.Builder builder;
        LinkedHashMap<String, String> linkedHashMap = mo171291j().urlParamsMap;
        Intrinsics.checkExpressionValueIsNotNull(linkedHashMap, "getParams().urlParamsMap");
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        HttpUrl parse = HttpUrl.parse(this.f123200b + mo171284c());
        if (parse == null || (builder = parse.newBuilder()) == null) {
            HttpUrl.Builder builder2 = new HttpUrl.Builder();
            builder2.scheme(aq.m95057a(this.f123200b));
            builder2.host(aq.m95059b(this.f123200b));
            builder = builder2.encodedPath(mo171284c());
        }
        for (Map.Entry<String, String> entry : linkedHashMap2.entrySet()) {
            builder.addQueryParameter(entry.getKey(), entry.getValue());
        }
        String httpUrl = builder.build().toString();
        Intrinsics.checkExpressionValueIsNotNull(httpUrl, "builder.build().toString()");
        return httpUrl;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0001J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nJ\u0016\u0010&\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005J\u001a\u0010-\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\nJ\u0010\u00100\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\nJ\u0014\u00102\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/CommonRequest$Builder;", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "usePacketHost", "", "(Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;Z)V", "autoHandleToast", "body", "", "", "captchaType", "captchaType$annotations", "()V", "changeToUIThread", "handlers", "", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "headers", "Lcom/ss/android/lark/http/model/http/HttpHeaders;", "isNeedLoginInfo", "isNewPassportLifecycle", "mIgnoreCaptchaToken", "method", "Lcom/ss/android/lark/http/model/http/HttpMethod;", "monitor", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "params", "Lcom/ss/android/lark/http/model/http/HttpParams;", "path", "getUniContext", "()Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "getUsePacketHost", "()Z", "appendBody", "key", "value", "appendHeader", "appendParam", "build", "Lcom/ss/android/lark/passport/infra/base/network/CommonRequest;", "callbackAtUIThread", "boolean", "ignoreCaptchaToken", "needLoginInfo", "putRequestBody", "setCaptchaType", "mCapchaType", "setFlowType", "flowType", "setHandlers", "setHeaders", "setMethod", "setMonitorCodeCreator", "setParams", "setPath", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.a$a */
    public static final class Builder {

        /* renamed from: a */
        private String f123217a = "";

        /* renamed from: b */
        private HttpMethod f123218b = HttpMethod.POST;

        /* renamed from: c */
        private HttpParams f123219c = new HttpParams();

        /* renamed from: d */
        private HttpHeaders f123220d = new HttpHeaders();

        /* renamed from: e */
        private Map<String, Object> f123221e = new LinkedHashMap();

        /* renamed from: f */
        private boolean f123222f = true;

        /* renamed from: g */
        private AbstractC49348a f123223g;

        /* renamed from: h */
        private List<? extends ICommonCodeHandler> f123224h;

        /* renamed from: i */
        private boolean f123225i;

        /* renamed from: j */
        private String f123226j;

        /* renamed from: k */
        private boolean f123227k;

        /* renamed from: l */
        private boolean f123228l = true;

        /* renamed from: m */
        private boolean f123229m = true;

        /* renamed from: n */
        private final UniContext f123230n;

        /* renamed from: o */
        private final boolean f123231o;

        /* renamed from: a */
        public final CommonRequest mo171310a() {
            return new CommonRequest(this.f123217a, this.f123218b, this.f123219c, this.f123220d, this.f123221e, this.f123230n, this.f123223g, this.f123225i, this.f123227k, this.f123228l, this.f123231o, this.f123226j, this.f123222f, this.f123224h, this.f123229m, null);
        }

        /* renamed from: a */
        public final Builder mo171309a(boolean z) {
            this.f123222f = z;
            return this;
        }

        /* renamed from: b */
        public final Builder mo171312b(boolean z) {
            this.f123228l = z;
            return this;
        }

        /* renamed from: c */
        public final Builder mo171314c(boolean z) {
            this.f123229m = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo171303a(HttpMethod httpMethod) {
            Intrinsics.checkParameterIsNotNull(httpMethod, "method");
            this.f123218b = httpMethod;
            return this;
        }

        /* renamed from: c */
        public final Builder mo171313c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "mCapchaType");
            this.f123226j = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo171304a(AbstractC49348a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "monitor");
            this.f123223g = aVar;
            return this;
        }

        /* renamed from: b */
        public final Builder mo171311b(String str) {
            if (str != null) {
                this.f123221e.put("flow_type", str);
            }
            return this;
        }

        /* renamed from: a */
        public final Builder mo171305a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            this.f123217a = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo171308a(Map<String, Object> map) {
            Intrinsics.checkParameterIsNotNull(map, "body");
            this.f123221e.putAll(map);
            return this;
        }

        public Builder(UniContext uniContext, boolean z) {
            this.f123230n = uniContext;
            this.f123231o = z;
        }

        /* renamed from: a */
        public final Builder mo171306a(String str, Object obj) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(obj, "value");
            this.f123221e.put(str, obj);
            return this;
        }

        /* renamed from: a */
        public final Builder mo171307a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "value");
            LinkedHashMap<String, String> linkedHashMap = this.f123219c.urlParamsMap;
            Intrinsics.checkExpressionValueIsNotNull(linkedHashMap, "params.urlParamsMap");
            linkedHashMap.put(str, str2);
            return this;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IRequest
    /* renamed from: a */
    public void mo171283a(String str) {
        if (str == null) {
            str = "";
        }
        this.f123200b = str;
    }

    private CommonRequest(String str, HttpMethod httpMethod, HttpParams httpParams, HttpHeaders httpHeaders, Map<String, Object> map, UniContext uniContext, AbstractC49348a aVar, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, List<? extends ICommonCodeHandler> list, boolean z6) {
        this.f123203e = str;
        this.f123204f = httpMethod;
        this.f123205g = httpParams;
        this.f123206h = httpHeaders;
        this.f123207i = map;
        this.f123208j = uniContext;
        this.f123209k = z;
        this.f123210l = z2;
        this.f123211m = z3;
        this.f123212n = z4;
        this.f123213o = str2;
        this.f123214p = z5;
        this.f123215q = list;
        this.f123216r = z6;
        this.f123199a = "CommonRequest";
        this.f123200b = "";
        this.f123201c = aVar;
    }

    public /* synthetic */ CommonRequest(String str, HttpMethod httpMethod, HttpParams httpParams, HttpHeaders httpHeaders, Map map, UniContext uniContext, AbstractC49348a aVar, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, List list, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, httpMethod, httpParams, httpHeaders, map, uniContext, aVar, z, z2, z3, z4, str2, z5, list, z6);
    }
}
