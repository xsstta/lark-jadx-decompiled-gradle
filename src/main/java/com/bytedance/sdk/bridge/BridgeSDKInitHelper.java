package com.bytedance.sdk.bridge;

import com.bytedance.sdk.bridge.annotation.C20658a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J*\u0010\f\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/bytedance/sdk/bridge/BridgeSDKInitHelper;", "", "()V", "iBridgeIndexList", "", "Lcom/bytedance/sdk/bridge/IBridgeIndex;", "getIBridgeIndexList", "()Ljava/util/List;", "getSubscriberInfoFromModule", "", "bridgeName", "", "initBridgeIndex", "callBack", "Lcom/bytedance/sdk/bridge/BridgeSDKInitHelper$IBridgeIndexInitCallBack;", "moduleNames", "executor", "Ljava/util/concurrent/Executor;", "replaceStr", "str", "oldValue", "newValue", "IBridgeIndexInitCallBack", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.i */
public final class BridgeSDKInitHelper {

    /* renamed from: a */
    public static final BridgeSDKInitHelper f50444a = new BridgeSDKInitHelper();

    /* renamed from: b */
    private static final List<AbstractC20674k> f50445b;

    private BridgeSDKInitHelper() {
    }

    /* renamed from: a */
    public final List<AbstractC20674k> mo69582a() {
        return f50445b;
    }

    static {
        List<AbstractC20674k> a = C20664c.m75148a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BridgeIndexManager.getIBridgeIndices()");
        f50445b = a;
    }

    /* renamed from: a */
    public final void mo69583a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        HashMap hashMap = new HashMap();
        Logger lVar = Logger.f50514b;
        lVar.mo69733a("inittask", " getSubscriberInfoFromModule bridgeName - " + str);
        for (AbstractC20674k kVar : f50445b) {
            if (kVar != null) {
                HashMap hashMap2 = hashMap;
                kVar.mo69732a(hashMap2, str);
                if (!hashMap2.isEmpty()) {
                    break;
                }
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            try {
                Object value = entry.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "entry1.value");
                if (!Intrinsics.areEqual((C20678m) value, C20658a.m75124a().get(entry.getKey()))) {
                    z = false;
                    break;
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        }
        if (!z) {
            HashMap hashMap3 = hashMap;
            if (!hashMap3.isEmpty()) {
                C20658a.m75126a(hashMap3);
            }
        }
    }
}
