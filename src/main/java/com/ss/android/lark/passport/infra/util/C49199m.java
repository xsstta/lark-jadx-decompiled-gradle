package com.ss.android.lark.passport.infra.util;

import com.ss.android.lark.passport.infra.base.network.service.RequestService;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005¨\u0006\u0006"}, d2 = {"async", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "T", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.m */
public final class C49199m {
    /* renamed from: a */
    public static final <T> AbstractC49347c m193957a(IRequest eVar, ICallback<T> aVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "$this$async");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        RequestService.f123287a.mo171365a(eVar, aVar);
        return eVar;
    }
}
