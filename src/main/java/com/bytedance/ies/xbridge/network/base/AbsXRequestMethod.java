package com.bytedance.ies.xbridge.network.base;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.bytedance.ies.xbridge.network.model.XRequestMethodParamModel;
import com.bytedance.ies.xbridge.network.model.XRequestMethodResultModel;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/xbridge/network/base/AbsXRequestMethod;", "Lcom/bytedance/ies/xbridge/bridgeInterfaces/XCoreBridgeMethod;", "()V", "access", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "getAccess", "()Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "callback", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodParamModel;", "Lcom/bytedance/ies/xbridge/network/base/AbsXRequestMethod$XRequestCallback;", "provideParamModel", "Ljava/lang/Class;", "provideResultModel", "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodResultModel;", "XRequestCallback", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.e.a.a */
public abstract class AbsXRequestMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f38033a = "x.request";

    /* renamed from: c */
    private final XBridgeMethod.Access f38034c = XBridgeMethod.Access.PROTECT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/xbridge/network/base/AbsXRequestMethod$XRequestCallback;", "", "onFailure", "", "code", "", "msg", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodResultModel;", "onSuccess", "result", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.e.a.a$a */
    public interface XRequestCallback {
        /* renamed from: a */
        void mo53122a(int i, String str, XRequestMethodResultModel bVar);

        /* renamed from: a */
        void mo53123a(XRequestMethodResultModel bVar, String str);
    }

    /* renamed from: a */
    public abstract void mo33992a(XRequestMethodParamModel aVar, XRequestCallback aVar2, XBridgePlatformType xBridgePlatformType);

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f38033a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/bytedance/ies/xbridge/network/base/AbsXRequestMethod$handle$1", "Lcom/bytedance/ies/xbridge/network/base/AbsXRequestMethod$XRequestCallback;", "onFailure", "", "code", "", "msg", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/network/model/XRequestMethodResultModel;", "onSuccess", "result", "x-bridge-network_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.e.a.a$b */
    public static final class C14435b implements XRequestCallback {

        /* renamed from: a */
        final /* synthetic */ AbsXRequestMethod f38035a;

        /* renamed from: b */
        final /* synthetic */ XBridgeMethod.Callback f38036b;

        C14435b(AbsXRequestMethod aVar, XBridgeMethod.Callback aVar2) {
            this.f38035a = aVar;
            this.f38036b = aVar2;
        }

        @Override // com.bytedance.ies.xbridge.network.base.AbsXRequestMethod.XRequestCallback
        /* renamed from: a */
        public void mo53123a(XRequestMethodResultModel bVar, String str) {
            Intrinsics.checkParameterIsNotNull(bVar, "result");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            Map<String, Object> a = XRequestMethodResultModel.f38043a.mo53140a(bVar);
            if (a == null) {
                XCoreBridgeMethod.m58217a(this.f38035a, this.f38036b, -5, null, null, 12, null);
            } else {
                this.f38035a.mo52932a(this.f38036b, a, str);
            }
        }

        @Override // com.bytedance.ies.xbridge.network.base.AbsXRequestMethod.XRequestCallback
        /* renamed from: a */
        public void mo53122a(int i, String str, XRequestMethodResultModel bVar) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkParameterIsNotNull(str, "msg");
            if (bVar != null) {
                linkedHashMap = XRequestMethodResultModel.f38043a.mo53140a(bVar);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            if (linkedHashMap == null) {
                XCoreBridgeMethod.m58217a(this.f38035a, this.f38036b, i, str, null, 8, null);
            } else {
                this.f38035a.mo52931a(this.f38036b, i, str, linkedHashMap);
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        XRequestMethodParamModel a = XRequestMethodParamModel.f38037c.mo53134a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, null, null, 12, null);
        } else {
            mo33992a(a, new C14435b(this, aVar), xBridgePlatformType);
        }
    }
}
