package com.bytedance.ee.bear.lynx.impl.xbridge.method;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.bear.lynx.impl.utli.RoutePageUtils;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.route.base.AbsXOpenMethod;
import com.bytedance.ies.xbridge.route.model.XOpenMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/CCMOpenPageMethod;", "Lcom/bytedance/ies/xbridge/route/base/AbsXOpenMethod;", "()V", "TAG", "", "name", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/route/model/XOpenMethodParamModel;", "callback", "Lcom/bytedance/ies/xbridge/route/base/AbsXOpenMethod$XOpenCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.d */
public final class CCMOpenPageMethod extends AbsXOpenMethod {

    /* renamed from: a */
    private final String f23821a = "ccm.openPage";

    /* renamed from: c */
    private final String f23822c = "ccm-lynx: XOpenPageMethod";

    @Override // com.bytedance.ies.xbridge.XBridgeMethod, com.bytedance.ies.xbridge.route.base.AbsXOpenMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23821a;
    }

    @Override // com.bytedance.ies.xbridge.route.base.AbsXOpenMethod
    /* renamed from: a */
    public void mo33984a(XOpenMethodParamModel bVar, AbsXOpenMethod.XOpenCallback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(bVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        String a = bVar.mo53150a();
        boolean b = bVar.mo53154b();
        boolean c = bVar.mo53155c();
        String str = this.f23822c;
        Log.i(str, "replace: " + b + "  useSysBrowser: " + c);
        Context context = (Context) mo52930a(Context.class);
        if (context == null) {
            aVar.mo53143a(0, "Context not provided in host");
        } else if (TextUtils.isEmpty(a)) {
            aVar.mo53143a(0, "schema url is empty");
        } else if (RoutePageUtils.f23776a.mo33928a(context, a, b, c)) {
            AbsXOpenMethod.XOpenCallback.C14438a.m58359a(aVar, new XDefaultResultModel(), null, 2, null);
        } else {
            aVar.mo53143a(0, "open page fail");
        }
    }
}
