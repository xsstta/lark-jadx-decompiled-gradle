package com.bytedance.ee.bear.lynx.impl.xbridge.method.view;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod;", "Lcom/bytedance/ies/xbridge/bridgeInterfaces/XCoreBridgeMethod;", "()V", "access", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "getAccess", "()Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel;", "callback", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod$XSendContainerEventCallback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "Lcom/bytedance/ies/xbridge/XReadableMap;", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", "provideParamModel", "Ljava/lang/Class;", "provideResultModel", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "XSendContainerEventCallback", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.a */
public abstract class AbsSendContainerEventMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f23859a = "ccm.sendContainerEvent";

    /* renamed from: c */
    private final XBridgeMethod.Access f23860c = XBridgeMethod.Access.PROTECT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod$XSendContainerEventCallback;", "", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.a$a */
    public interface XSendContainerEventCallback {
    }

    /* renamed from: a */
    public abstract void mo34027a(SendEventContainerMethodParamModel sendEventContainerMethodParamModel, XSendContainerEventCallback aVar, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23859a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod$handle$1", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/AbsSendContainerEventMethod$XSendContainerEventCallback;", "onFailure", "", "code", "", "msg", "", "onSuccess", "result", "Lcom/bytedance/ies/xbridge/model/results/XDefaultResultModel;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.a$b */
    public static final class C8857b implements XSendContainerEventCallback {

        /* renamed from: a */
        final /* synthetic */ AbsSendContainerEventMethod f23861a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f23862b;

        C8857b(AbsSendContainerEventMethod aVar, XBridgeMethod.Callback aVar2) {
            this.f23861a = aVar;
            this.f23862b = aVar2;
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        mo34027a(SendEventContainerMethodParamModel.f23854a.mo34026a(hVar), new C8857b(this, aVar), xBridgePlatformType);
    }
}
