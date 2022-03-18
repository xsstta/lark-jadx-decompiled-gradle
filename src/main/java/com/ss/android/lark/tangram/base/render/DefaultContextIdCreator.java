package com.ss.android.lark.tangram.base.render;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/tangram/base/render/DefaultContextIdCreator;", "", "()V", "contextId", "", "getContextId", "()Ljava/lang/String;", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.e.a */
public final class DefaultContextIdCreator {

    /* renamed from: a */
    public static final DefaultContextIdCreator f136648a = new DefaultContextIdCreator();

    private DefaultContextIdCreator() {
    }

    /* renamed from: a */
    public final String mo188788a() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        if (replace$default != null) {
            String substring = replace$default.substring(0, 10);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
