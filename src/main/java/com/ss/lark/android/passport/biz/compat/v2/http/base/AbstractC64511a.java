package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.content.Context;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;

/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.a */
public interface AbstractC64511a {

    /* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.a$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$a(AbstractC64511a aVar, Context context, NetworkErrorResult networkErrorResult) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: <T:Ljava/lang/Object;>(Lcom/ss/android/lark/passport/signinsdk_api/base/http/IRequest<TT;>;Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;Lcom/ss/android/lark/passport/signinsdk_api/base/a<TT;>;)Z */
        public static boolean $default$a(AbstractC64511a aVar, IRequest iRequest, NetworkErrorResult networkErrorResult, AbstractC49342a aVar2) {
            return false;
        }
    }

    /* renamed from: a */
    boolean mo223175a(Context context, NetworkErrorResult networkErrorResult);

    /* renamed from: a */
    boolean mo223176a(NetworkErrorResult networkErrorResult);

    /* renamed from: a */
    <T> boolean mo223177a(IRequest<T> iRequest, NetworkErrorResult networkErrorResult, AbstractC49342a<T> aVar);

    /* renamed from: a */
    boolean mo223178a(V2ResponseModel v2ResponseModel);
}
