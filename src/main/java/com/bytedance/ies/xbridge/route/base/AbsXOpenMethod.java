package com.bytedance.ies.xbridge.route.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.route.model.XOpenMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.f.a.b */
public abstract class AbsXOpenMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38050a = "x.open";

    /* renamed from: c */
    private final XBridgeMethod.Access f38051c = XBridgeMethod.Access.PROTECT;

    /* renamed from: a */
    public abstract void mo33984a(XOpenMethodParamModel bVar, XOpenCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38050a;
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.b$b */
    public static final class C14439b implements XOpenCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXOpenMethod f38052a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38053b;

        C14439b(AbsXOpenMethod bVar, XBridgeMethod.Callback aVar) {
            this.f38052a = bVar;
            this.f38053b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.route.base.AbsXOpenMethod.XOpenCallback
        /* renamed from: a */
        public void mo53143a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38052a, this.f38053b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.route.base.AbsXOpenMethod.XOpenCallback
        /* renamed from: a */
        public void mo53144a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38052a.mo52932a(this.f38053b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XOpenMethodParamModel a = XOpenMethodParamModel.f38057b.mo53156a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo33984a(a, new C14439b(this, aVar), xBridgePlatformType);
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.b$a */
    public interface XOpenCallback {
        /* renamed from: a */
        void mo53143a(int i, String str);

        /* renamed from: a */
        void mo53144a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.f.a.b$a$a */
        public static final class C14438a {
            /* renamed from: a */
            public static /* synthetic */ void m58359a(XOpenCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53144a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
