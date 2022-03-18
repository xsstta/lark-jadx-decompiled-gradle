package com.bytedance.ies.xbridge.ui.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.params.XDefaultParamModel;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.ui.a.b */
public abstract class AbsXHideLoadingMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38093a = "x.hideLoading";

    /* renamed from: c */
    private final XBridgeMethod.Access f38094c = XBridgeMethod.Access.PROTECT;

    /* renamed from: a */
    public abstract void mo33982a(XDefaultParamModel bVar, XHideLoadingCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38093a;
    }

    /* renamed from: com.bytedance.ies.xbridge.ui.a.b$b */
    public static final class C14451b implements XHideLoadingCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXHideLoadingMethod f38095a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38096b;

        C14451b(AbsXHideLoadingMethod bVar, XBridgeMethod.Callback aVar) {
            this.f38095a = bVar;
            this.f38096b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXHideLoadingMethod.XHideLoadingCallback
        /* renamed from: a */
        public void mo53185a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38095a, this.f38096b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXHideLoadingMethod.XHideLoadingCallback
        /* renamed from: a */
        public void mo53186a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38095a.mo52932a(this.f38096b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        mo33982a(XDefaultParamModel.f38031a.mo53120a(hVar), new C14451b(this, aVar), xBridgePlatformType);
    }

    /* renamed from: com.bytedance.ies.xbridge.ui.a.b$a */
    public interface XHideLoadingCallback {
        /* renamed from: a */
        void mo53185a(int i, String str);

        /* renamed from: a */
        void mo53186a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.ui.a.b$a$a */
        public static final class C14450a {
            /* renamed from: a */
            public static /* synthetic */ void m58455a(XHideLoadingCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53186a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
