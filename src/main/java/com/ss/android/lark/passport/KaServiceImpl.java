package com.ss.android.lark.passport;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.infra.service.IKaService;
import com.ss.android.lark.passport.ka.C49288a;
import com.ss.android.lark.passport.ka.p2452a.C49289a;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(IKaService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/KaServiceImpl;", "Lcom/ss/android/lark/passport/infra/service/IKaService;", "()V", "getKaIdp", "Lcom/ss/android/lark/passport/signinsdk_api/idp/IKaIdp;", "isLoadingUrlOpen", "", "id-provider-ka_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class KaServiceImpl implements IKaService {
    @Override // com.ss.android.lark.passport.infra.service.IKaService
    public boolean isLoadingUrlOpen() {
        return C49289a.f123738a;
    }

    @Override // com.ss.android.lark.passport.infra.service.IKaService
    public AbstractC49384b<?> getKaIdp() {
        C49288a a = C49288a.m194203a();
        Intrinsics.checkExpressionValueIsNotNull(a, "KaIdp.inst()");
        return a;
    }
}
