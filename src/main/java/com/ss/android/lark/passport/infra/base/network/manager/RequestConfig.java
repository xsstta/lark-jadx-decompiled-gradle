package com.ss.android.lark.passport.infra.base.network.manager;

import com.ss.android.lark.passport.infra.base.network.fetch.OkHttpFetcher;
import com.ss.android.lark.passport.infra.base.network.handler.AlertCodeHandler;
import com.ss.android.lark.passport.infra.base.network.handler.AlertJumpCodeHandler;
import com.ss.android.lark.passport.infra.base.network.handler.BDTuringCodeHandler;
import com.ss.android.lark.passport.infra.base.network.handler.FormCodeHandler;
import com.ss.android.lark.passport.infra.base.network.handler.NeedCaptChaIdCodeHandler;
import com.ss.android.lark.passport.infra.base.network.handler.ToastAndJumpToFeedCodeHandler;
import com.ss.android.lark.passport.infra.base.network.interceptor.BDTuringInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.CaptchaIdInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.CommonRequestInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.CommonResponseInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.DeviceIdInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.IRequestInterceptor;
import com.ss.android.lark.passport.infra.base.network.interceptor.IResponseInterceptor;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IFetcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/manager/RequestConfig;", "", "()V", "mHttpFetcher", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetcher;", "getMHttpFetcher", "()Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetcher;", "setMHttpFetcher", "(Lcom/ss/android/lark/passport/signinsdk_api/base/network/IFetcher;)V", "requestInterceptors", "", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IRequestInterceptor;", "getRequestInterceptors", "()Ljava/util/List;", "setRequestInterceptors", "(Ljava/util/List;)V", "responseInterceptors", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IResponseInterceptor;", "getResponseInterceptors", "setResponseInterceptors", "getHost", "", "getPacketHost", "isEnableCaptchaToken", "", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.e.a */
public final class RequestConfig {

    /* renamed from: a */
    public static final Companion f123273a = new Companion(null);

    /* renamed from: b */
    private List<IRequestInterceptor> f123274b = new ArrayList();

    /* renamed from: c */
    private List<IResponseInterceptor> f123275c = new ArrayList();

    /* renamed from: d */
    private IFetcher f123276d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/manager/RequestConfig$Companion;", "", "()V", "baseCodeHandler", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "getBaseCodeHandler", "()Ljava/util/ArrayList;", "baseCodeHandlerWithContext", "getBaseCodeHandlerWithContext", "loginBizCodeHandler", "getLoginBizCodeHandler", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: c */
        public final ArrayList<ICommonCodeHandler> mo171353c() {
            ArrayList<ICommonCodeHandler> arrayList = new ArrayList<>();
            arrayList.add(new AlertCodeHandler());
            return arrayList;
        }

        /* renamed from: a */
        public final ArrayList<ICommonCodeHandler> mo171351a() {
            ArrayList<ICommonCodeHandler> arrayList = new ArrayList<>();
            arrayList.add(new AlertJumpCodeHandler());
            arrayList.add(new NeedCaptChaIdCodeHandler());
            return arrayList;
        }

        /* renamed from: b */
        public final ArrayList<ICommonCodeHandler> mo171352b() {
            ArrayList<ICommonCodeHandler> arrayList = new ArrayList<>();
            arrayList.add(new FormCodeHandler());
            arrayList.add(new ToastAndJumpToFeedCodeHandler());
            arrayList.add(BDTuringCodeHandler.f123245a);
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<IRequestInterceptor> mo171346a() {
        return this.f123274b;
    }

    /* renamed from: b */
    public final List<IResponseInterceptor> mo171347b() {
        return this.f123275c;
    }

    /* renamed from: c */
    public final IFetcher mo171348c() {
        return this.f123276d;
    }

    /* renamed from: f */
    private final boolean m193471f() {
        return PassportConfigCenter.f123034a.mo171113d().enableCaptchaToken;
    }

    /* renamed from: d */
    public final String mo171349d() {
        return ServiceFinder.m193751f().getAccountsHost(IDomainService.UrlUnitType.CURRENT_UNIT);
    }

    /* renamed from: e */
    public final String mo171350e() {
        return ServiceFinder.m193751f().getAccountsHost(IDomainService.UrlUnitType.HOST_UNIT);
    }

    public RequestConfig() {
        OkHttpFetcher httpFetcher = ServiceFinder.m193752g().getHttpFetcher();
        this.f123276d = httpFetcher == null ? new OkHttpFetcher() : httpFetcher;
        this.f123274b.add(new DeviceIdInterceptor());
        if (m193471f()) {
            this.f123274b.add(new CaptchaIdInterceptor());
        }
        this.f123274b.add(new CommonRequestInterceptor());
        this.f123275c.add(new CommonResponseInterceptor());
        this.f123275c.add(BDTuringInterceptor.f123258a);
    }
}
