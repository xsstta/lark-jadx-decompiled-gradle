package com.ss.lark.android.passport.biz.feature.session;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.infra.service.ISessionInvalidService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(ISessionInvalidService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/session/SessionInvalidService;", "Lcom/ss/android/lark/passport/infra/service/ISessionInvalidService;", "()V", "sessionMayInvalid", "", "reason", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SessionInvalidService implements ISessionInvalidService {
    @Override // com.ss.android.lark.passport.infra.service.ISessionInvalidService
    public void sessionMayInvalid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reason");
        SessionInvalidProcessor.m255033a(str);
    }
}
