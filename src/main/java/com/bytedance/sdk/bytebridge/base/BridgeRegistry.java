package com.bytedance.sdk.bytebridge.base;

import com.bytedance.sdk.bytebridge.base.context.GlobalBridgeView;
import com.bytedance.sdk.bytebridge.base.context.IBridgeView;
import com.bytedance.sdk.bytebridge.base.model.BridgeInfo;
import com.bytedance.sdk.bytebridge.base.model.BridgeModule;
import com.bytedance.sdk.bytebridge.base.model.C20685c;
import com.bytedance.sdk.bytebridge.base.model.C20687f;
import com.bytedance.sdk.bytebridge.base.result.AbstractC20688a;
import com.bytedance.sdk.bytebridge.base.utils.BridgeUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001'B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007J\u001c\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007J\u001e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J,\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0002J \u0010#\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0002J\u001c\u0010&\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/BridgeRegistry;", "", "()V", "TAG", "", "bridgeInfoViewMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/bytedance/sdk/bytebridge/base/context/IBridgeView;", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeInfo;", "destroyMap", "Lcom/bytedance/sdk/bytebridge/base/result/AbsBridgeAsyncResult;", "moduleBridgeNameListMap", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeModule;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "moduleSrcMap", "Lcom/bytedance/sdk/bytebridge/base/BridgeRegistry$BridgeModuleWrapper;", "viewModuleMap", "getBridgeInfoByNameView", "bridgeName", "bridgeView", "getBridgeModuleWrapper", "bridgeSrc", "destroyMethod", "Ljava/lang/reflect/Method;", "registerBridgeModule", "", "bridgeModuleSrc", "registerDestroyMethod", "asyncResult", "searchBridgeInfoByNameKey", "splitSubscriberInfo", "subscriberInfo", "Lcom/bytedance/sdk/bytebridge/base/model/SubscriberInfo;", "bridgeModule", "bridgeInfoMap", "unregisterBridgeModule", "removeModule", "", "unregisterWebViewWithBridgeModuleSrc", "BridgeModuleWrapper", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.b */
public final class BridgeRegistry {

    /* renamed from: a */
    public static final BridgeRegistry f50559a = new BridgeRegistry();

    /* renamed from: b */
    private static final ConcurrentHashMap<IBridgeView, CopyOnWriteArrayList<BridgeModule>> f50560b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Object, Object> f50561c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<IBridgeView, ConcurrentHashMap<String, BridgeInfo>> f50562d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<BridgeModule, CopyOnWriteArrayList<String>> f50563e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<IBridgeView, ConcurrentHashMap<String, AbstractC20688a>> f50564f = new ConcurrentHashMap<>();

    private BridgeRegistry() {
    }

    /* renamed from: a */
    public final BridgeInfo mo69779a(String str, IBridgeView dVar) {
        BridgeInfo b;
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(dVar, "bridgeView");
        BridgeInfo b2 = m75359b(str, dVar);
        if (b2 != null) {
            return b2;
        }
        if (ByteBridge.f50573b.mo69803b().mo69828b() && (b = m75359b(BridgeUtils.f50598a.mo69818a(str), dVar)) != null) {
            return b;
        }
        if (!(dVar instanceof GlobalBridgeView)) {
            return mo69779a(str, BridgeUtils.f50598a.mo69817a());
        }
        return null;
    }

    /* renamed from: b */
    private final BridgeInfo m75359b(String str, IBridgeView dVar) {
        ConcurrentHashMap<String, BridgeInfo> concurrentHashMap = f50562d.get(dVar);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(concurrentHashMap, "bridgeInfoViewMap[bridge…w] ?: ConcurrentHashMap()");
        BridgeInfo bVar = concurrentHashMap.get(str);
        if (bVar != null) {
            return bVar;
        }
        ByteBridge.f50573b.mo69804b(str);
        CopyOnWriteArrayList<BridgeModule> copyOnWriteArrayList = f50560b.get(dVar);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOnWriteArrayList, "viewModuleMap[bridgeView…?: CopyOnWriteArrayList()");
        Class<?> a = ByteBridge.f50573b.mo69802a(str);
        if (a != null) {
            BridgeModule dVar2 = null;
            Iterator<BridgeModule> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BridgeModule next = it.next();
                if (a.isAssignableFrom(next.mo69841a().getClass())) {
                    dVar2 = next;
                    break;
                }
            }
            if (dVar2 != null) {
                f50559a.m75358a(ByteBridge.f50573b.mo69801a(a), dVar2, concurrentHashMap);
            }
        }
        if (concurrentHashMap.containsKey(str)) {
            f50562d.put(dVar, concurrentHashMap);
            return concurrentHashMap.get(str);
        }
        for (T t : copyOnWriteArrayList) {
            Collection<C20685c> a2 = ByteBridge.f50573b.mo69801a(t.mo69841a().getClass()).mo69847a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "subscriberInfo.methodInfoList");
            for (T t2 : a2) {
                Intrinsics.checkExpressionValueIsNotNull(t2, "bridgeMethodInfo");
                if (Intrinsics.areEqual(t2.mo69838b(), str)) {
                    concurrentHashMap.put(str, new BridgeInfo(t.mo69841a(), t2));
                    ConcurrentHashMap<BridgeModule, CopyOnWriteArrayList<String>> concurrentHashMap2 = f50563e;
                    CopyOnWriteArrayList<String> copyOnWriteArrayList2 = concurrentHashMap2.get(t);
                    if (copyOnWriteArrayList2 == null) {
                        copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(copyOnWriteArrayList2, "moduleBridgeNameListMap[…?: CopyOnWriteArrayList()");
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    concurrentHashMap2.put(t, copyOnWriteArrayList2);
                }
            }
        }
        f50562d.put(dVar, concurrentHashMap);
        return concurrentHashMap.get(str);
    }

    /* renamed from: a */
    private final void m75358a(C20687f fVar, BridgeModule dVar, ConcurrentHashMap<String, BridgeInfo> concurrentHashMap) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = f50563e.get(dVar);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOnWriteArrayList, "moduleBridgeNameListMap[…?: CopyOnWriteArrayList()");
        Collection<C20685c> a = fVar.mo69847a();
        Intrinsics.checkExpressionValueIsNotNull(a, "subscriberInfo.methodInfoList");
        for (T t : a) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            String b = t.mo69838b();
            Intrinsics.checkExpressionValueIsNotNull(b, "it.bridgeMethodName");
            concurrentHashMap.put(b, new BridgeInfo(dVar.mo69841a(), t));
            copyOnWriteArrayList.add(t.mo69838b());
        }
        f50563e.put(dVar, copyOnWriteArrayList);
    }

    /* renamed from: a */
    public final void mo69780a(AbstractC20688a aVar, String str, IBridgeView dVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "asyncResult");
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(dVar, "bridgeView");
        ConcurrentHashMap<IBridgeView, ConcurrentHashMap<String, AbstractC20688a>> concurrentHashMap = f50564f;
        ConcurrentHashMap<String, AbstractC20688a> concurrentHashMap2 = concurrentHashMap.get(dVar);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(concurrentHashMap2, "destroyMap[bridgeView] ?: ConcurrentHashMap()");
        concurrentHashMap2.put(str, aVar);
        concurrentHashMap.put(dVar, concurrentHashMap2);
    }
}
