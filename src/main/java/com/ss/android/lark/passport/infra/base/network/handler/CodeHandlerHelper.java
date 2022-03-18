package com.ss.android.lark.passport.infra.base.network.handler;

import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/CodeHandlerHelper;", "", "()V", "code", "", "handler", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "(Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;)Ljava/lang/Integer;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.e */
public final class CodeHandlerHelper {

    /* renamed from: a */
    public static final CodeHandlerHelper f123246a = new CodeHandlerHelper();

    private CodeHandlerHelper() {
    }

    /* renamed from: a */
    public final Integer mo171324a(ICommonCodeHandler bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "handler");
        CodeHandlerAnno codeHandlerAnno = (CodeHandlerAnno) bVar.getClass().getAnnotation(CodeHandlerAnno.class);
        if (codeHandlerAnno != null) {
            return Integer.valueOf(codeHandlerAnno.code());
        }
        return null;
    }
}
