package com.ss.android.lark.passport.infra.base.network.handler;

import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ$\u0010\u0010\u001a\u00020\r\"\u0004\b\u0000\u0010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0013J\u001c\u0010\u0014\u001a\u00020\r\"\u0004\b\u0000\u0010\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001aR\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/CommonCodeHandlers;", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "(Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;)V", "mBaseCodeHandlerList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "Lkotlin/collections/ArrayList;", "mRequest", "getMRequest", "()Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "handleError", "", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleRetry", "T", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "handleSuccess", "response", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "registerCodeHandler", "", "codeHandler", "", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.f */
public final class CommonCodeHandlers {

    /* renamed from: a */
    public static final List<ICommonCodeHandler> f123247a = CollectionsKt.listOf((Object[]) new ICommonCodeHandler[]{new RsaDescrptErrorCodeHandler(), UnauthorizedHandler.f123255a});

    /* renamed from: b */
    public static final Companion f123248b = new Companion(null);

    /* renamed from: c */
    private final ArrayList<ICommonCodeHandler> f123249c = new ArrayList<>();

    /* renamed from: d */
    private final IRequest f123250d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/CommonCodeHandlers$Companion;", "", "()V", "RETRY_HANDLERS", "", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "getRETRY_HANDLERS$passport_infra_release", "()Ljava/util/List;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.c.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo171325a(List<? extends ICommonCodeHandler> list) {
        if (list != null) {
            this.f123249c.addAll(list);
        }
    }

    public CommonCodeHandlers(IRequest eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        this.f123250d = eVar;
    }

    /* renamed from: a */
    public final boolean mo171326a(NetworkErrorResult networkErrorResult) {
        if (networkErrorResult == null) {
            return false;
        }
        int errorCode = networkErrorResult.getErrorCode();
        Iterator<ICommonCodeHandler> it = this.f123249c.iterator();
        while (it.hasNext()) {
            ICommonCodeHandler next = it.next();
            CodeHandlerHelper eVar = CodeHandlerHelper.f123246a;
            Intrinsics.checkExpressionValueIsNotNull(next, "handler");
            Integer a = eVar.mo171324a(next);
            if (a != null && errorCode == a.intValue()) {
                next.mo171319a(networkErrorResult);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final <T> boolean mo171328a(ResponseModel<T> responseModel) {
        if (responseModel == null) {
            return false;
        }
        int code = responseModel.getCode();
        Iterator<ICommonCodeHandler> it = this.f123249c.iterator();
        while (it.hasNext()) {
            ICommonCodeHandler next = it.next();
            CodeHandlerHelper eVar = CodeHandlerHelper.f123246a;
            Intrinsics.checkExpressionValueIsNotNull(next, "handler");
            Integer a = eVar.mo171324a(next);
            if (a != null && code == a.intValue()) {
                next.mo171320a(responseModel);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final <T> boolean mo171327a(NetworkErrorResult networkErrorResult, ICallback<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (networkErrorResult == null) {
            return false;
        }
        int errorCode = networkErrorResult.getErrorCode();
        for (ICommonCodeHandler bVar : f123247a) {
            Integer a = CodeHandlerHelper.f123246a.mo171324a(bVar);
            if (a != null && errorCode == a.intValue()) {
                bVar.mo171321a(this.f123250d, networkErrorResult, aVar);
                return true;
            }
        }
        return false;
    }
}
