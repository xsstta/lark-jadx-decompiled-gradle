package com.bytedance.ee.bear.lynx.impl.xbridge.method;

import android.content.Context;
import com.bytedance.ee.bear.lynx.impl.utli.LynxLoadingUtils;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.params.XDefaultParamModel;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.ui.base.AbsXShowLoadingMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMShowLoadingMethod;", "Lcom/bytedance/ies/xbridge/ui/base/AbsXShowLoadingMethod;", "()V", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/model/params/XDefaultParamModel;", "callback", "Lcom/bytedance/ies/xbridge/ui/base/AbsXShowLoadingMethod$XShowLoadingCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.e */
public final class CCMShowLoadingMethod extends AbsXShowLoadingMethod {
    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.ui.base.AbsXShowLoadingMethod
    /* renamed from: a */
    public String mo33973a() {
        return "ccm.showLoading";
    }

    @Override // com.bytedance.ies.xbridge.ui.base.AbsXShowLoadingMethod
    /* renamed from: a */
    public void mo33985a(XDefaultParamModel bVar, AbsXShowLoadingMethod.XShowLoadingCallback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(bVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        if (LynxLoadingUtils.f23768a.mo33917a((Context) mo52930a(Context.class))) {
            AbsXShowLoadingMethod.XShowLoadingCallback.C14452a.m58463a(aVar, new XDefaultResultModel(), null, 2, null);
        } else {
            aVar.mo53187a(0, "context is not instance of AbsLynxPageActivity");
        }
    }
}
