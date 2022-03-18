package com.bytedance.ies.xbridge.route.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.route.model.XCloseMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.f.a.a */
public abstract class AbsXCloseMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38047a = "x.close";

    /* renamed from: a */
    public abstract void mo33974a(XCloseMethodParamModel aVar, XCloseCallback aVar2, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38047a;
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.a$b */
    public static final class C14437b implements XCloseCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXCloseMethod f38048a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38049b;

        C14437b(AbsXCloseMethod aVar, XBridgeMethod.Callback aVar2) {
            this.f38048a = aVar;
            this.f38049b = aVar2;
        }

        @Override // com.bytedance.ies.xbridge.route.base.AbsXCloseMethod.XCloseCallback
        /* renamed from: a */
        public void mo53141a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38048a, this.f38049b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.route.base.AbsXCloseMethod.XCloseCallback
        /* renamed from: a */
        public void mo53142a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38048a.mo52932a(this.f38049b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        mo33974a(XCloseMethodParamModel.f38054a.mo53149a(hVar), new C14437b(this, aVar), xBridgePlatformType);
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.a$a */
    public interface XCloseCallback {
        /* renamed from: a */
        void mo53141a(int i, String str);

        /* renamed from: a */
        void mo53142a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.f.a.a$a$a */
        public static final class C14436a {
            /* renamed from: a */
            public static /* synthetic */ void m58351a(XCloseCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53142a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
