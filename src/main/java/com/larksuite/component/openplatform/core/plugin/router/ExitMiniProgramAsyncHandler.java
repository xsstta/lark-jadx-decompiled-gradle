package com.larksuite.component.openplatform.core.plugin.router;

import android.app.Activity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.util.C67070z;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ApiSupportType(apiName = {"exitMiniProgram"}, support = {AppType.GadgetAPP})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/router/ExitMiniProgramAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "apiNames", "", "handleAPI", "", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.router.c */
public final class ExitMiniProgramAsyncHandler extends AbstractC65797c {
    public ExitMiniProgramAsyncHandler() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("exitMiniProgram");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…pi.API_EXIT_MINI_PROGRAM)");
        return singletonList;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apiInvokeData");
        AbstractC67709b.AbstractC67710a h = mo230475h();
        Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
        Activity f = h.mo235051f();
        if (f != null) {
            Object a = bVar.mo234985a("isFullExit", false);
            Intrinsics.checkExpressionValueIsNotNull(a, "apiInvokeData.getParam(\"isFullExit\", false)");
            boolean booleanValue = ((Boolean) a).booleanValue();
            Object a2 = bVar.mo234985a("noAnimation", false);
            Intrinsics.checkExpressionValueIsNotNull(a2, "apiInvokeData.getParam(\"noAnimation\", false)");
            boolean booleanValue2 = ((Boolean) a2).booleanValue();
            AppBrandLogger.m52830i("ExitMiniProgramAsyncHandler", "isFullExit" + booleanValue + " noAnimation:" + booleanValue2);
            if (booleanValue) {
                C67070z.m261391a(f, 1, mo230473f());
            } else if (booleanValue2) {
                C67070z.m261391a(f, 15, mo230473f());
            } else {
                C67070z.m261391a(f, 9, mo230473f());
            }
            mo230494j();
            return;
        }
        mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "activity is null");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExitMiniProgramAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }
}
