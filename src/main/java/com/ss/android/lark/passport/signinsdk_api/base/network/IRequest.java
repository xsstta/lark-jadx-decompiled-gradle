package com.ss.android.lark.passport.signinsdk_api.base.network;

import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.model.http.HttpParams;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0007H&J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u0017H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\b\u0010\u001b\u001a\u00020\u0007H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\"\u001a\u00020\u0003H&¨\u0006#"}, d2 = {"Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "autoHandleToast", "", "callbackAtUIThread", "canLog", "getCaptchaType", "", "getExtraCommonCodeHandler", "", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "getHeaders", "Lcom/ss/android/lark/http/model/http/HttpHeaders;", "getHost", "getMethod", "Lcom/ss/android/lark/http/model/http/HttpMethod;", "getMonitorCodeCreator", "Lcom/ss/android/lark/passport/signinsdk_api/base/monitor/IMonitorCodeCreator;", "getName", "getParams", "Lcom/ss/android/lark/http/model/http/HttpParams;", "getPath", "getRequestBody", "", "", "getUniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "getUrl", "ignoreCaptchaToken", "isNeedLoginInfo", "isNewPassportLifecycle", "setHost", "", "host", "usePacketHost", "signinsdk-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.signinsdk_api.base.network.e */
public interface IRequest extends AbstractC49347c {
    /* renamed from: a */
    void mo171283a(String str);

    /* renamed from: c */
    String mo171284c();

    /* renamed from: d */
    UniContext mo171285d();

    /* renamed from: e */
    HttpMethod mo171286e();

    /* renamed from: f */
    HttpHeaders mo171287f();

    /* renamed from: g */
    String mo171288g();

    /* renamed from: h */
    String mo171289h();

    /* renamed from: i */
    Map<String, Object> mo171290i();

    /* renamed from: j */
    HttpParams mo171291j();

    /* renamed from: k */
    String mo171292k();

    /* renamed from: l */
    boolean mo171293l();

    /* renamed from: m */
    List<ICommonCodeHandler> mo171294m();

    /* renamed from: n */
    AbstractC49348a mo171295n();

    /* renamed from: o */
    boolean mo171296o();

    /* renamed from: p */
    boolean mo171297p();

    /* renamed from: q */
    String mo171298q();

    /* renamed from: r */
    boolean mo171299r();

    /* renamed from: s */
    boolean mo171300s();

    /* renamed from: t */
    boolean mo171301t();

    /* renamed from: u */
    boolean mo171302u();
}
