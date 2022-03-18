package com.bytedance.ies.xbridge;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bytedance.ies.xbridge.a */
public final class XBridge {

    /* renamed from: a */
    public static final XBridge f37982a = new XBridge();

    /* renamed from: b */
    private static final Map<Class<Object>, Object> f37983b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, XBridgeRegistry> f37984c = new LinkedHashMap();

    private XBridge() {
    }

    /* renamed from: a */
    public final Map<String, Class<? extends XBridgeMethod>> mo52925a(XBridgePlatformType xBridgePlatformType, String str) {
        XBridgeRegistry bVar;
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, "platformType");
        Intrinsics.checkParameterIsNotNull(str, "namespace");
        Map<String, XBridgeRegistry> map = f37984c;
        if (map.get(str) == null || (bVar = map.get(str)) == null) {
            return null;
        }
        return bVar.mo52928a(xBridgePlatformType);
    }

    /* renamed from: a */
    public final void mo52926a(Class<? extends XBridgeMethod> cls, XBridgePlatformType xBridgePlatformType, String str) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, "scope");
        Intrinsics.checkParameterIsNotNull(str, "namespace");
        Map<String, XBridgeRegistry> map = f37984c;
        if (map.get(str) == null) {
            map.put(str, new XBridgeRegistry());
        }
        XBridgeRegistry bVar = map.get(str);
        if (bVar != null) {
            bVar.mo52929a(cls, xBridgePlatformType);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m58210a(XBridge aVar, Class cls, XBridgePlatformType xBridgePlatformType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            xBridgePlatformType = XBridgePlatformType.ALL;
        }
        if ((i & 4) != 0) {
            str = "DEFAULT";
        }
        aVar.mo52926a(cls, xBridgePlatformType, str);
    }
}
