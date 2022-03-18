package com.bytedance.ies.xbridge;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0006J$\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u0005J \u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J \u0010\u0017\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0005R.\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeRegistry;", "", "()V", "bridgeMap", "", "Lcom/bytedance/ies/xbridge/XBridgePlatformType;", "", "Ljava/lang/Class;", "Lcom/bytedance/ies/xbridge/XBridgeMethod;", "namespace", "getNamespace", "()Ljava/lang/String;", "setNamespace", "(Ljava/lang/String;)V", "findMethodClass", "platformType", "name", "getMethodList", "", "innerRegisterMethod", "", "clazz", "scope", "registerMethod", "Companion", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.b */
public final class XBridgeRegistry {

    /* renamed from: b */
    public static final Companion f37985b = new Companion(null);

    /* renamed from: a */
    public final Map<XBridgePlatformType, Map<String, Class<? extends XBridgeMethod>>> f37986a = new LinkedHashMap();

    /* renamed from: c */
    private String f37987c = "DEFAULT";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/xbridge/XBridgeRegistry$Companion;", "", "()V", "copyWith", "Lcom/bytedance/ies/xbridge/XBridgeRegistry;", "bridgeRegistry", "x-bridge-core-api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Map<String, Class<? extends XBridgeMethod>> mo52928a(XBridgePlatformType xBridgePlatformType) {
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, "platformType");
        if (xBridgePlatformType == XBridgePlatformType.NONE) {
            return null;
        }
        return this.f37986a.get(xBridgePlatformType);
    }

    /* renamed from: b */
    private final void m58214b(Class<? extends XBridgeMethod> cls, XBridgePlatformType xBridgePlatformType) {
        LinkedHashMap linkedHashMap = this.f37986a.get(xBridgePlatformType);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(XBridgeRegistryCache.m58231a(cls), cls);
        this.f37986a.put(xBridgePlatformType, linkedHashMap);
    }

    /* renamed from: a */
    public final void mo52929a(Class<? extends XBridgeMethod> cls, XBridgePlatformType xBridgePlatformType) {
        List<XBridgePlatformType> list;
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(xBridgePlatformType, "scope");
        if (xBridgePlatformType == XBridgePlatformType.ALL) {
            list = CollectionsKt.listOf((Object[]) new XBridgePlatformType[]{XBridgePlatformType.ALL, XBridgePlatformType.WEB, XBridgePlatformType.LYNX, XBridgePlatformType.RN});
        } else {
            list = CollectionsKt.listOf(xBridgePlatformType);
        }
        for (XBridgePlatformType xBridgePlatformType2 : list) {
            m58214b(cls, xBridgePlatformType2);
        }
    }
}
