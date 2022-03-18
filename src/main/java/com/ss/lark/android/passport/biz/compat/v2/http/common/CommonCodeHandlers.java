package com.ss.lark.android.passport.biz.compat.v2.http.common;

import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001bB\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aR\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/CommonCodeHandlers;", "T", "", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/http/IRequest;", "(Lcom/ss/android/lark/passport/signinsdk_api/base/http/IRequest;)V", "mBaseCodeHandlerList", "Ljava/util/ArrayList;", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "Lkotlin/collections/ArrayList;", "mRequest", "getMRequest", "()Lcom/ss/android/lark/passport/signinsdk_api/base/http/IRequest;", "handleError", "", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleRetry", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseLoginRequestCallback;", "handleSuccess", "response", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/V2ResponseModel;", "registerCodeHandler", "", "codeHandler", "", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
@Deprecated(message = "")
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.e */
public final class CommonCodeHandlers<T> {

    /* renamed from: a */
    public static final List<AbstractC64511a> f162908a = CollectionsKt.listOf(new RsaDescrptErrorCodeHandler());

    /* renamed from: b */
    public static final Companion f162909b = new Companion(null);

    /* renamed from: c */
    private final ArrayList<AbstractC64511a> f162910c = new ArrayList<>();

    /* renamed from: d */
    private final IRequest<T> f162911d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/CommonCodeHandlers$Companion;", "", "()V", "RETRY_HANDLERS", "", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "getRETRY_HANDLERS$passport_biz_release", "()Ljava/util/List;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo223187a(List<? extends AbstractC64511a> list) {
        Intrinsics.checkParameterIsNotNull(list, "codeHandler");
        this.f162910c.addAll(list);
    }

    public CommonCodeHandlers(IRequest<T> iRequest) {
        Intrinsics.checkParameterIsNotNull(iRequest, "request");
        this.f162911d = iRequest;
    }

    /* renamed from: a */
    public final boolean mo223188a(NetworkErrorResult networkErrorResult) {
        if (networkErrorResult == null) {
            return false;
        }
        int errorCode = networkErrorResult.getErrorCode();
        Iterator<AbstractC64511a> it = this.f162910c.iterator();
        while (it.hasNext()) {
            AbstractC64511a next = it.next();
            CodeHandlerHelper cVar = CodeHandlerHelper.f162907a;
            Intrinsics.checkExpressionValueIsNotNull(next, "handler");
            Integer a = cVar.mo223186a(next);
            if (a != null && errorCode == a.intValue()) {
                next.mo223176a(networkErrorResult);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo223190a(V2ResponseModel<?> v2ResponseModel) {
        if (v2ResponseModel == null) {
            return false;
        }
        int i = v2ResponseModel.code;
        Iterator<AbstractC64511a> it = this.f162910c.iterator();
        while (it.hasNext()) {
            AbstractC64511a next = it.next();
            CodeHandlerHelper cVar = CodeHandlerHelper.f162907a;
            Intrinsics.checkExpressionValueIsNotNull(next, "handler");
            Integer a = cVar.mo223186a(next);
            if (a != null && i == a.intValue()) {
                next.mo223178a(v2ResponseModel);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo223189a(NetworkErrorResult networkErrorResult, AbstractC49342a<T> aVar) {
        if (networkErrorResult == null) {
            return false;
        }
        int errorCode = networkErrorResult.getErrorCode();
        for (AbstractC64511a aVar2 : f162908a) {
            Integer a = CodeHandlerHelper.f162907a.mo223186a(aVar2);
            if (a != null && errorCode == a.intValue()) {
                aVar2.mo223177a(this.f162911d, networkErrorResult, aVar);
                return true;
            }
        }
        return false;
    }
}
