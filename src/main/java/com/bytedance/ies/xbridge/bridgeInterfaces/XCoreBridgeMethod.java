package com.bytedance.ies.xbridge.bridgeInterfaces;

import com.bytedance.ies.xbridge.XBridgeMethod;
import com.bytedance.ies.xbridge.model.context.XContextProviderFactory;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.b.a */
public abstract class XCoreBridgeMethod implements XBridgeMethod {

    /* renamed from: a */
    private XContextProviderFactory f37988a;

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: b */
    public void mo33998b() {
        XBridgeMethod.C14429c.m58208a(this);
    }

    @Override // com.bytedance.ies.xbridge.XBridgeMethod
    /* renamed from: a */
    public void mo52923a(XContextProviderFactory cVar) {
        this.f37988a = cVar;
    }

    /* renamed from: a */
    public <T> T mo52930a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clz");
        XContextProviderFactory cVar = this.f37988a;
        if (cVar != null) {
            return (T) cVar.mo53115a(cls);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo52932a(XBridgeMethod.Callback aVar, Map<String, Object> map, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(map, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(str, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", 1);
        linkedHashMap.put("msg", str);
        linkedHashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
        aVar.mo33972a(linkedHashMap);
    }

    /* renamed from: a */
    public final void mo52931a(XBridgeMethod.Callback aVar, int i, String str, Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(map, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        linkedHashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
        aVar.mo33972a(linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m58218a(XCoreBridgeMethod aVar, XBridgeMethod.Callback aVar2, Map map, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str = "";
            }
            aVar.mo52932a(aVar2, map, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccess");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ies.xbridge.b.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m58217a(XCoreBridgeMethod aVar, XBridgeMethod.Callback aVar2, int i, String str, Map map, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                str = "";
            }
            if ((i2 & 8) != 0) {
                map = new LinkedHashMap();
            }
            aVar.mo52931a(aVar2, i, str, map);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailure");
    }
}
