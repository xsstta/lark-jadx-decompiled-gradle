package com.bytedance.ee.bear.lynx.impl.xbridge.method;

import android.content.Context;
import com.bytedance.ee.bear.lynx.impl.utli.RoutePageUtils;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.route.base.AbsXCloseMethod;
import com.bytedance.ies.xbridge.route.model.XCloseMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMClosePageMethod;", "Lcom/bytedance/ies/xbridge/route/base/AbsXCloseMethod;", "()V", "TAG", "", "name", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/route/model/XCloseMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/route/base/AbsXCloseMethod$XCloseCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.a */
public final class CCMClosePageMethod extends AbsXCloseMethod {

    /* renamed from: a */
    private final String f23812a = "ccm.closePage";

    /* renamed from: c */
    private final String f23813c = "ccm-lynx: XClosePageMethod";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.route.base.AbsXCloseMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23812a;
    }

    @Override // com.bytedance.ies.xbridge.route.base.AbsXCloseMethod
    /* renamed from: a */
    public void mo33974a(XCloseMethodParamModel aVar, AbsXCloseMethod.XCloseCallback aVar2, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        Context context = (Context) mo52930a(Context.class);
        if (context == null) {
            aVar2.mo53141a(0, "Context not provided in host");
        } else if (RoutePageUtils.f23776a.mo33927a(context, aVar.mo53145a(), aVar.mo53148b())) {
            AbsXCloseMethod.XCloseCallback.C14436a.m58351a(aVar2, new XDefaultResultModel(), null, 2, null);
        } else {
            aVar2.mo53141a(0, "close page fail");
        }
    }
}
