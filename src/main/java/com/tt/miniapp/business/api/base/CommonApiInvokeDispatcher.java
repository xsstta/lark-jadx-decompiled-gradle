package com.tt.miniapp.business.api.base;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.refer.C67698a;
import com.tt.refer.common.base.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tt/miniapp/business/api/base/CommonApiInvokeDispatcher;", "Lcom/tt/miniapp/business/api/base/AbsAPIInvokeDispatcher;", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "appType", "Lcom/tt/refer/common/base/AppType;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;Lcom/tt/refer/common/base/AppType;)V", "createBetaAPIHandler", "Lcom/tt/miniapp/business/api/base/IAPIHandler;", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "createStableAPIHandler", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.b.a.a.e */
public class CommonApiInvokeDispatcher extends AbstractC65796b {

    /* renamed from: b */
    private final AppType f165842b;

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65796b
    /* renamed from: a */
    public AbstractC65803f mo50368a(String str) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        return C67698a.m263340a(this.f165830a, str, this.f165842b);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65796b
    /* renamed from: b */
    public AbstractC65803f mo230479b(String str) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        return C67698a.m263341b(this.f165830a, str, this.f165842b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonApiInvokeDispatcher(IAppContext iAppContext, AppType appType) {
        super(iAppContext);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        Intrinsics.checkParameterIsNotNull(appType, "appType");
        this.f165842b = appType;
    }
}
