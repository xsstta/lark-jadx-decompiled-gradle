package com.ss.lark.android.passport.biz.compat.v2.http.common;

import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/CodeHandlerHelper;", "", "()V", "code", "", "handler", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "(Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;)Ljava/lang/Integer;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.c */
public final class CodeHandlerHelper {

    /* renamed from: a */
    public static final CodeHandlerHelper f162907a = new CodeHandlerHelper();

    private CodeHandlerHelper() {
    }

    /* renamed from: a */
    public final Integer mo223186a(AbstractC64511a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        CodeHandlerAnno codeHandlerAnno = (CodeHandlerAnno) aVar.getClass().getAnnotation(CodeHandlerAnno.class);
        if (codeHandlerAnno != null) {
            return Integer.valueOf(codeHandlerAnno.code());
        }
        return null;
    }
}
