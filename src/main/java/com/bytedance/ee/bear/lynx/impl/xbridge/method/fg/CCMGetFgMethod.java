package com.bytedance.ee.bear.lynx.impl.xbridge.method.fg;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.XBridgePlatformType;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.bridgeInterfaces.XCoreBridgeMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J\u0012\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0017\u0018\u00010\u0014H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/fg/CCMGetFgMethod;", "Lcom/bytedance/ies/xbridge/bridgeInterfaces/XCoreBridgeMethod;", "()V", "access", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "getAccess", "()Lcom/bytedance/ies/xbridge/XBridgeMethod$Access;", "name", "", "getName", "()Ljava/lang/String;", "handle", "", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "callback", "Lcom/bytedance/ies/xbridge/XBridgeMethod$Callback;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "provideParamModel", "Ljava/lang/Class;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "provideResultModel", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.a.a */
public final class CCMGetFgMethod extends XCoreBridgeMethod {

    /* renamed from: a */
    private final String f23814a = "ccm.getFg";

    /* renamed from: c */
    private final XBridgeMethod.Access f23815c = XBridgeMethod.Access.PROTECT;

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public String mo33973a() {
        return this.f23814a;
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo33975a(XReadableMap hVar, XBridgeMethod.Callback aVar, XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(hVar, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, ShareHitPoint.f121869d);
        CCMGetFgMethodParam a = CCMGetFgMethodParam.f23816b.mo33978a(hVar);
        if (a == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -3, "param is empty", null, 8, null);
            return;
        }
        CCMGetFgMethodResultModel cVar = new CCMGetFgMethodResultModel();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : a.mo33976a()) {
            linkedHashMap.put(str, Boolean.valueOf(C4211a.m17514a().mo16536a(str, false)));
        }
        cVar.mo33980a(linkedHashMap);
        Map<String, Object> a2 = CCMGetFgMethodResultModel.f23818a.mo33981a(cVar);
        if (a2 == null) {
            XCoreBridgeMethod.m58217a(this, aVar, -5, "result is invalid", null, 8, null);
        } else {
            XCoreBridgeMethod.m58218a(this, aVar, a2, null, 4, null);
        }
    }
}
