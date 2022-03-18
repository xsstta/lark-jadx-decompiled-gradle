package com.bytedance.ies.xbridge.ui.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.model.results.XDefaultResultModel;
import com.bytedance.ies.xbridge.ui.model.XConfigureStatusBarMethodParamModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod;", "Lcom/bytedance/ies/xbridge/bridgeInterfaces/XCoreBridgeMethod;", "()V", "access", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "getAccess", "()Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "callback", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "Lcom/bytedance/ies/xbridge/ui/model/XConfigureStatusBarMethodParamModel;", "Lcom/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod$XConfigureStatusBarCallback;", "provideParamModel", "Ljava/lang/Class;", "provideResultModel", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "XConfigureStatusBarCallback", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.ui.a.a */
public abstract class AbsXConfigureStatusBarMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38090a;

    /* renamed from: a */
    public abstract void mo53182a(XConfigureStatusBarMethodParamModel aVar, XConfigureStatusBarCallback aVar2, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38090a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod$handle$1", "Lcom/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod$XConfigureStatusBarCallback;", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.ui.a.a$b */
    public static final class C14449b implements XConfigureStatusBarCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXConfigureStatusBarMethod f38091a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38092b;

        C14449b(AbsXConfigureStatusBarMethod aVar, XBridgeMethod.Callback aVar2) {
            this.f38091a = aVar;
            this.f38092b = aVar2;
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXConfigureStatusBarMethod.XConfigureStatusBarCallback
        /* renamed from: a */
        public void mo53183a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            XCoreBridgeMethod.m58217a(this.f38091a, this.f38092b, i, str, null, 8, null);
        }

        @Override // com.bytedance.ies.xbridge.ui.base.AbsXConfigureStatusBarMethod.XConfigureStatusBarCallback
        /* renamed from: a */
        public void mo53184a(XDefaultResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            this.f38091a.mo52932a(this.f38092b, XDefaultResultModel.f38032a.mo53121a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XConfigureStatusBarMethodParamModel a = XConfigureStatusBarMethodParamModel.f38108a.mo53205a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, "Please check your input!", null, 8, null);
        } else {
            mo53182a(a, new C14449b(this, aVar), xBridgePlatformType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/base/AbsXConfigureStatusBarMethod$XConfigureStatusBarCallback;", "", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.ui.a.a$a */
    public interface XConfigureStatusBarCallback {
        /* renamed from: a */
        void mo53183a(int i, String str);

        /* renamed from: a */
        void mo53184a(XDefaultResultModel bVar, String str);

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.xbridge.ui.a.a$a$a */
        public static final class C14448a {
            /* renamed from: a */
            public static /* synthetic */ void m58447a(XConfigureStatusBarCallback aVar, XDefaultResultModel bVar, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = "";
                    }
                    aVar.mo53184a(bVar, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
            }
        }
    }
}
