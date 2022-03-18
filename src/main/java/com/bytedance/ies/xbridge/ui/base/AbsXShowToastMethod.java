package com.bytedance.ies.xbridge.ui.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.ui.model.XShowToastMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.ui.a.d */
public abstract class AbsXShowToastMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38100a = "x.showToast";

    /* renamed from: c */
    private final XBridgeMethod.Access f38101c = XBridgeMethod.Access.PROTECT;

    /* renamed from: a */
    public abstract void mo33986a(XShowToastMethodParamModel bVar, XShowToastCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38100a;
    }

    /* renamed from: com.bytedance.ies.xbridge.ui.a.d$b */
    public static final class C14455b implements XShowToastCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXShowToastMethod f38102a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38103b;

        C14455b(AbsXShowToastMethod dVar, XBridgeMethod.Callback aVar) {
            this.f38102a = dVar;
            this.f38103b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXShowToastMethod.XShowToastCallback
        /* renamed from: a */
        public void mo53189a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38102a, this.f38103b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXShowToastMethod.XShowToastCallback
        /* renamed from: a */
        public void mo53190a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38102a.mo52932a(this.f38103b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XShowToastMethodParamModel a = XShowToastMethodParamModel.f38112c.mo53212a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo33986a(a, new C14455b(this, aVar), xBridgePlatformType);
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.ui.a.d$a */
    public interface XShowToastCallback {
        /* renamed from: a */
        void mo53189a(int i, String str);

        /* renamed from: a */
        void mo53190a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.ui.a.d$a$a */
        public static final class C14454a {
            /* renamed from: a */
            public static /* synthetic */ void m58471a(XShowToastCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53190a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
