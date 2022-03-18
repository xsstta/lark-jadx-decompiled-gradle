package com.ss.lark.android.passport.biz.service.impl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.infra.base.router.C49094g;
import com.ss.android.lark.passport.infra.base.router.C49095h;
import com.ss.android.lark.passport.infra.service.IRouterActionFindService;
import com.ss.lark.android.passport.biz.router.C65190d;
import com.ss.lark.android.passport.biz.router.C65191e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(IRouterActionFindService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/RouterActionFindService;", "Lcom/ss/android/lark/passport/infra/service/IRouterActionFindService;", "()V", "getTotalNormalRouterAction", "Lcom/ss/android/lark/passport/infra/base/router/TotalNormalRouterAction;", "getTotalPageRouterAction", "Lcom/ss/android/lark/passport/infra/base/router/TotalPageRouterAction;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RouterActionFindService implements IRouterActionFindService {
    @Override // com.ss.android.lark.passport.infra.service.IRouterActionFindService
    public C49094g getTotalNormalRouterAction() {
        C65190d a = C65190d.m256021a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DefaultNormalRouterAction.getInstance()");
        return a;
    }

    @Override // com.ss.android.lark.passport.infra.service.IRouterActionFindService
    public C49095h getTotalPageRouterAction() {
        C65191e d = C65191e.m256023d();
        Intrinsics.checkExpressionValueIsNotNull(d, "DefaultPageRouterAction.getInstance()");
        return d;
    }
}
