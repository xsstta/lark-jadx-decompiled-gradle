package com.bytedance.ies.xbridge.ui.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.params.XDefaultParamModel;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.ui.a.c */
public abstract class AbsXShowLoadingMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38097a = "x.showLoading";

    /* renamed from: a */
    public abstract void mo33985a(XDefaultParamModel bVar, XShowLoadingCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38097a;
    }

    /* renamed from: com.bytedance.ies.xbridge.ui.a.c$b */
    public static final class C14453b implements XShowLoadingCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXShowLoadingMethod f38098a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38099b;

        C14453b(AbsXShowLoadingMethod cVar, XBridgeMethod.Callback aVar) {
            this.f38098a = cVar;
            this.f38099b = aVar;
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXShowLoadingMethod.XShowLoadingCallback
        /* renamed from: a */
        public void mo53187a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38098a, this.f38099b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXShowLoadingMethod.XShowLoadingCallback
        /* renamed from: a */
        public void mo53188a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38098a.mo52932a(this.f38099b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        mo33985a(XDefaultParamModel.f38031a.mo53120a(hVar), new C14453b(this, aVar), xBridgePlatformType);
    }

    /* renamed from: com.bytedance.ies.xbridge.ui.a.c$a */
    public interface XShowLoadingCallback {
        /* renamed from: a */
        void mo53187a(int i, String str);

        /* renamed from: a */
        void mo53188a(XDefaultResultModel bVar, String str);

        /* renamed from: com.bytedance.ies.xbridge.ui.a.c$a$a */
        public static final class C14452a {
            /* renamed from: a */
            public static /* synthetic */ void m58463a(XShowLoadingCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53188a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
