package com.bytedance.ies.xbridge;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0007R\"\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeRegistryCache;", "", "()V", "cache", "", "Ljava/lang/Class;", "Lcom/bytedance/ies/xbridge/XBridgeMethod;", "", "find", "clazz", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.c */
public final class XBridgeRegistryCache {

    /* renamed from: a */
    public static final XBridgeRegistryCache f38001a = new XBridgeRegistryCache();

    /* renamed from: b */
    private static final Map<Class<? extends XBridgeMethod>, String> f38002b = new LinkedHashMap();

    private XBridgeRegistryCache() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m58231a(Class<? extends XBridgeMethod> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Map<Class<? extends XBridgeMethod>, String> map = f38002b;
        String str = map.get(cls);
        if (str == null) {
            map.put(cls, ((XBridgeMethod) cls.newInstance()).mo33973a());
            str = map.get(cls);
        }
        if (str == null) {
            Intrinsics.throwNpe();
        }
        return str;
    }
}
