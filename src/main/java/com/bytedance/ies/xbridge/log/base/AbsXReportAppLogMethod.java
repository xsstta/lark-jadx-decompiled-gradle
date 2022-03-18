package com.bytedance.ies.xbridge.log.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.log.model.XReportAppLogMethodParamModel;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.c.a.b */
public abstract class AbsXReportAppLogMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38007a = "x.reportAppLog";

    /* renamed from: c */
    private final XBridgeMethod.Access f38008c = XBridgeMethod.Access.PROTECT;

    /* renamed from: a */
    public abstract void mo33987a(XReportAppLogMethodParamModel bVar, XReportAppLogCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38007a;
    }

    /* renamed from: com.bytedance.ies.xbridge.c.a.b$b */
    public static final class C14433b implements XReportAppLogCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXReportAppLogMethod f38009a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38010b;

        C14433b(AbsXReportAppLogMethod bVar, XBridgeMethod.Callback aVar) {
            this.f38009a = bVar;
            this.f38010b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.log.base.AbsXReportAppLogMethod.XReportAppLogCallback
        /* renamed from: a */
        public void mo53064a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38009a.mo52932a(this.f38010b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XReportAppLogMethodParamModel a = XReportAppLogMethodParamModel.f38019c.mo53081a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo33987a(a, new C14433b(this, aVar), xBridgePlatformType);
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.c.a.b$a */
    public interface XReportAppLogCallback {
        /* renamed from: a */
        void mo53064a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.c.a.b$a$a */
        public static final class C14432a {
            /* renamed from: a */
            public static /* synthetic */ void m58239a(XReportAppLogCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53064a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
