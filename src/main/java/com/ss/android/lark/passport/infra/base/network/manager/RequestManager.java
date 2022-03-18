package com.ss.android.lark.passport.infra.base.network.manager;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40652s;
import com.ss.android.lark.passport.infra.base.network.handler.CommonCodeHandlers;
import com.ss.android.lark.passport.infra.base.network.handler.ToastCodeHandler;
import com.ss.android.lark.passport.infra.base.network.interceptor.IRequestInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.IResponseInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.InterceptorResult;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetchCallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.RequestResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0017J$\u0010\u0018\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0017H\u0002J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u0015J6\u0010%\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\"\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006*"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/manager/RequestManager;", "", "()V", "TAG_ERROR", "", "TAG_REQUEST", "TAG_RESPONSE", "config", "Lcom/ss/android/lark/passport/infra/base/network/manager/RequestConfig;", "getConfig", "()Lcom/ss/android/lark/passport/infra/base/network/manager/RequestConfig;", "setConfig", "(Lcom/ss/android/lark/passport/infra/base/network/manager/RequestConfig;)V", "httpUniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "getHttpUniContext", "()Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "async", "", "T", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "doRealFetch", "commonCallback", "getRequestCodeHandlers", "", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "logCancel", "logError", "passportError", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "logRequest", "logResponse", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/RequestResult;", "watchError", "codeCreator", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "uniContext", "watchSuccessBiz", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.e.b */
public final class RequestManager {

    /* renamed from: a */
    public static final RequestManager f123277a = new RequestManager();

    /* renamed from: b */
    private static final UniContext f123278b = WatcherUniContext.f123348l.mo171435c();

    /* renamed from: c */
    private static RequestConfig f123279c = new RequestConfig();

    private RequestManager() {
    }

    /* renamed from: a */
    public final UniContext mo171354a() {
        return f123278b;
    }

    /* renamed from: b */
    public final RequestConfig mo171361b() {
        return f123279c;
    }

    /* renamed from: a */
    public final void mo171360a(RequestResult fVar, IRequest eVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "result");
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x_request_id", eVar.mo171287f().get("X-Request-ID"));
        Map<String, String> b = fVar.mo172213b();
        linkedHashMap.put("x_tt_logid", b != null ? b.get("x-tt-logid") : null);
        PassportLog.f123351c.mo171474a().mo171467b("n_net_response", "URL:" + eVar.mo171289h() + eVar.mo171284c(), linkedHashMap);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/passport/infra/base/network/manager/RequestManager$doRealFetch$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetchCallback;", "onError", "", "passportError", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/RequestResult;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.e.b$a */
    public static final class C49082a implements IFetchCallback {

        /* renamed from: a */
        final /* synthetic */ IRequest f123280a;

        /* renamed from: b */
        final /* synthetic */ AbstractC49348a f123281b;

        /* renamed from: c */
        final /* synthetic */ UniContext f123282c;

        /* renamed from: d */
        final /* synthetic */ ICallback f123283d;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IFetchCallback
        /* renamed from: a */
        public void mo171362a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "passportError");
            RequestManager.f123277a.mo171356a(this.f123280a, networkErrorResult);
            RequestManager.m193480a(RequestManager.f123277a, this.f123280a, networkErrorResult, this.f123281b, this.f123282c, null, 16, null);
            if (this.f123280a.mo171124b()) {
                RequestManager.f123277a.mo171355a(this.f123280a);
            } else {
                this.f123283d.mo101475a(networkErrorResult);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.IFetchCallback
        /* renamed from: a */
        public void mo171363a(RequestResult fVar) {
            int i;
            String str;
            int i2;
            Intrinsics.checkParameterIsNotNull(fVar, "result");
            UniContext a = RequestManager.f123277a.mo171354a();
            C40652s sVar = C40652s.f103159b;
            Intrinsics.checkExpressionValueIsNotNull(sVar, "EPMClientPassportMonitor…MONITOR_HTTP_REQUEST_SUCC");
            WatcherHelper.m193668b(a, sVar, MapsKt.mapOf(TuplesKt.to("api_path", this.f123280a.mo171284c()), TuplesKt.to("succ_type", "net"))).setResultTypeSuccess().flush();
            RequestManager.f123277a.mo171360a(fVar, this.f123280a);
            if (this.f123280a.mo171124b()) {
                RequestManager.f123277a.mo171355a(this.f123280a);
                return;
            }
            try {
                RequestResult fVar2 = fVar;
                for (IResponseInterceptor gVar : RequestManager.f123277a.mo171361b().mo171347b()) {
                    fVar2 = gVar.mo171333a(this.f123280a, gVar.mo171334a(fVar2, this.f123280a.mo171285d()));
                    NetworkErrorResult a2 = fVar2.mo172210a();
                    if (a2 != null) {
                        RequestManager.f123277a.mo171356a(this.f123280a, a2);
                        RequestManager.f123277a.mo171357a(this.f123280a, a2, this.f123281b, this.f123282c, fVar);
                        this.f123283d.mo101475a(a2);
                        return;
                    }
                }
                JSONObject parseObject = JSON.parseObject(fVar2.mo172215d());
                Intrinsics.checkExpressionValueIsNotNull(parseObject, "JSON.parseObject(requestResult.body)");
                try {
                    i = parseObject.getIntValue("code");
                } catch (Throwable unused) {
                    i = 0;
                }
                try {
                    str = parseObject.getString("message");
                    Intrinsics.checkExpressionValueIsNotNull(str, "jsonBody.getString(\"message\")");
                } catch (Throwable unused2) {
                    str = "Response message is null";
                }
                ResponseModel responseModel = new ResponseModel(i, str, parseObject);
                try {
                    i2 = parseObject.getIntValue("biz_code");
                } catch (Throwable unused3) {
                    i2 = 0;
                }
                responseModel.setBiz_code(i2);
                responseModel.setData(JSON.parseObject(parseObject.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), this.f123283d.mo101474a(), new Feature[0]));
                if (!responseModel.isSuccess()) {
                    NetworkErrorResult networkErrorResult = new NetworkErrorResult(responseModel.getCode(), responseModel.getMessage());
                    networkErrorResult.setBizCode(responseModel.getBiz_code());
                    RequestManager.f123277a.mo171356a(this.f123280a, networkErrorResult);
                    RequestManager.f123277a.mo171357a(this.f123280a, networkErrorResult, this.f123281b, this.f123282c, fVar);
                    this.f123283d.mo101475a(networkErrorResult);
                    return;
                }
                RequestManager.f123277a.mo171358a(this.f123280a, this.f123281b, this.f123282c);
                this.f123283d.mo101476a(responseModel);
            } catch (Throwable th) {
                th.printStackTrace();
                NetworkErrorResult networkErrorResult2 = new NetworkErrorResult(-6, "http code:" + fVar.mo172214c() + " " + th.getMessage());
                RequestManager.f123277a.mo171356a(this.f123280a, networkErrorResult2);
                RequestManager.f123277a.mo171357a(this.f123280a, networkErrorResult2, this.f123281b, this.f123282c, fVar);
                this.f123283d.mo101475a(networkErrorResult2);
            }
        }

        C49082a(IRequest eVar, AbstractC49348a aVar, UniContext uniContext, ICallback aVar2) {
            this.f123280a = eVar;
            this.f123281b = aVar;
            this.f123282c = uniContext;
            this.f123283d = aVar2;
        }
    }

    /* renamed from: b */
    private final void m193481b(IRequest eVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x_request_id", eVar.mo171287f().get("X-Request-ID"));
        PassportLog.f123351c.mo171474a().mo171467b("n_net_request", "URL:" + eVar.mo171289h() + eVar.mo171284c(), linkedHashMap);
    }

    /* renamed from: c */
    private final List<ICommonCodeHandler> m193483c(IRequest eVar) {
        List<ICommonCodeHandler> m;
        ArrayList arrayList = new ArrayList();
        if (!(eVar.mo171294m() == null || (m = eVar.mo171294m()) == null)) {
            arrayList.addAll(m);
        }
        if (!ServiceFinder.m193748c().isLogin()) {
            arrayList.addAll(RequestConfig.f123273a.mo171351a());
        }
        arrayList.addAll(RequestConfig.f123273a.mo171352b());
        if (eVar.mo171302u()) {
            arrayList.add(new ToastCodeHandler());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo171355a(IRequest eVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x_request_id", eVar.mo171287f().get("X-Request-ID"));
        PassportLog.f123351c.mo171474a().mo171469c("n_net_response", "URL:" + eVar.mo171289h() + eVar.mo171284c() + ", request is canceled", linkedHashMap);
    }

    /* renamed from: b */
    private final <T> void m193482b(IRequest eVar, ICallback<T> aVar) {
        AbstractC49348a n = eVar.mo171295n();
        UniContext d = eVar.mo171285d();
        if (!(n == null || d == null)) {
            OPMonitorCode a = n.mo171971a();
            Intrinsics.checkExpressionValueIsNotNull(a, "codeCreator.startCode");
            WatcherHelper.m193666a(d, a, null, 4, null);
        }
        UniContext uniContext = f123278b;
        C40652s sVar = C40652s.f103158a;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "EPMClientPassportMonitor…ONITOR_HTTP_REQUEST_START");
        WatcherHelper.m193665a(uniContext, sVar, MapsKt.mapOf(TuplesKt.to("api_path", eVar.mo171284c())));
        IFetcher c = f123279c.mo171348c();
        if (c != null) {
            c.mo145171a(eVar, new C49082a(eVar, n, d, aVar));
        }
    }

    /* renamed from: a */
    public final void mo171356a(IRequest eVar, NetworkErrorResult networkErrorResult) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(networkErrorResult, "passportError");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("x_request_id", eVar.mo171287f().get("X-Request-ID"));
        PassportLog.f123351c.mo171474a().mo171472d("n_net_error", "{URL:" + eVar.mo171289h() + eVar.mo171284c() + ", ErrorCode:" + networkErrorResult.getErrorCode() + ", ErrorMessage:" + networkErrorResult.getErrorMessage() + ", errorType:" + networkErrorResult.getErrorType() + "}", linkedHashMap);
    }

    /* renamed from: a */
    public final <T> void mo171359a(IRequest eVar, ICallback<T> aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        List<IRequestInterceptor> a = f123279c.mo171346a();
        if (eVar.mo171301t()) {
            str = f123279c.mo171350e();
        } else {
            str = f123279c.mo171349d();
        }
        if (TextUtils.isEmpty(str)) {
            NetworkErrorResult networkErrorResult = new NetworkErrorResult(-1, "host is empty");
            mo171356a(eVar, networkErrorResult);
            aVar.mo101475a(networkErrorResult);
            return;
        }
        eVar.mo171283a(str);
        if (eVar.mo171300s()) {
            CommonCodeHandlers fVar = new CommonCodeHandlers(eVar);
            fVar.mo171325a(m193483c(eVar));
            aVar = new UICallback(fVar, aVar);
        }
        IRequest eVar2 = eVar;
        for (IRequestInterceptor fVar2 : a) {
            InterceptorResult b = fVar2.mo171337b(fVar2.mo171335a(eVar2));
            NetworkErrorResult a2 = b.mo171343a();
            if (a2 != null) {
                f123277a.mo171356a(eVar, a2);
                aVar.mo101475a(a2);
                return;
            }
            eVar2 = b.mo171345b();
        }
        m193481b(eVar2);
        m193482b(eVar2, aVar);
    }

    /* renamed from: a */
    public final void mo171358a(IRequest eVar, AbstractC49348a aVar, UniContext uniContext) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        UniContext uniContext2 = f123278b;
        C40652s sVar = C40652s.f103159b;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "EPMClientPassportMonitor…MONITOR_HTTP_REQUEST_SUCC");
        WatcherHelper.m193668b(uniContext2, sVar, MapsKt.mapOf(TuplesKt.to("api_path", eVar.mo171284c()), TuplesKt.to("succ_type", "biz"))).setResultTypeSuccess().flush();
        if (aVar != null && uniContext != null) {
            OPMonitorCode b = aVar.mo171972b();
            Intrinsics.checkExpressionValueIsNotNull(b, "codeCreator.successCode");
            WatcherHelper.m193669b(uniContext, b, null, 4, null).setResultTypeSuccess().flush();
        }
    }

    /* renamed from: a */
    public final void mo171357a(IRequest eVar, NetworkErrorResult networkErrorResult, AbstractC49348a aVar, UniContext uniContext, RequestResult fVar) {
        String str;
        String str2;
        Map<String, String> b;
        Map<String, String> b2;
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(networkErrorResult, "passportError");
        UniContext uniContext2 = f123278b;
        C40652s sVar = C40652s.f103160c;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "EPMClientPassportMonitor…MONITOR_HTTP_REQUEST_FAIL");
        C40652s sVar2 = sVar;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.to("api_path", eVar.mo171284c());
        pairArr[1] = TuplesKt.to("x_request_id", eVar.mo171287f().get("X-Request-ID"));
        if (fVar == null || (b2 = fVar.mo172213b()) == null) {
            str = null;
        } else {
            str = b2.get("x-tt-logid");
        }
        pairArr[2] = TuplesKt.to("x_tt_logid", str);
        pairArr[3] = TuplesKt.to("biz_code", Integer.valueOf(networkErrorResult.getBizCode()));
        pairArr[4] = TuplesKt.to("error_code", Integer.valueOf(networkErrorResult.getErrorCode()));
        WatcherHelper.m193668b(uniContext2, sVar2, MapsKt.mapOf(pairArr)).setResultTypeFail().flush();
        if (aVar != null && uniContext != null) {
            OPMonitorCode c = aVar.mo171973c();
            Intrinsics.checkExpressionValueIsNotNull(c, "codeCreator.failCode");
            Pair[] pairArr2 = new Pair[4];
            pairArr2[0] = TuplesKt.to("biz_code", Integer.valueOf(networkErrorResult.getBizCode()));
            pairArr2[1] = TuplesKt.to("x_request_id", eVar.mo171287f().get("X-Request-ID"));
            if (fVar == null || (b = fVar.mo172213b()) == null) {
                str2 = null;
            } else {
                str2 = b.get("x-tt-logid");
            }
            pairArr2[2] = TuplesKt.to("x_tt_logid", str2);
            pairArr2[3] = TuplesKt.to("error_code", Integer.valueOf(networkErrorResult.getErrorCode()));
            WatcherHelper.m193668b(uniContext, c, MapsKt.mapOf(pairArr2)).setResultTypeFail().flush();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m193480a(RequestManager bVar, IRequest eVar, NetworkErrorResult networkErrorResult, AbstractC49348a aVar, UniContext uniContext, RequestResult fVar, int i, Object obj) {
        if ((i & 16) != 0) {
            fVar = null;
        }
        bVar.mo171357a(eVar, networkErrorResult, aVar, uniContext, fVar);
    }
}
