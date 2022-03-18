package com.bytedance.sdk.bridge;

import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.sdk.bridge.annotation.C20658a;
import com.bytedance.sdk.bridge.api.BridgeService;
import com.bytedance.sdk.bridge.model.BridgeInfo;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bridge.model.BridgeTmpInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\u0002\u0010 J%\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010(J\u0018\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010(J\"\u0010*\u001a\u0004\u0018\u00010\u000f2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,2\b\u0010'\u001a\u0004\u0018\u00010(J\u001e\u0010-\u001a\u0004\u0018\u00010\u000f2\u0006\u0010.\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007J\u0010\u0010/\u001a\u0004\u0018\u00010\f2\u0006\u00100\u001a\u00020\u0004J\u0006\u00101\u001a\u00020%J\u001a\u00102\u001a\u0002032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u00104\u001a\u00020\u0004H\u0002J\u001a\u00105\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u00104\u001a\u00020\u0004H\u0002J\"\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u00104\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0001H\u0002J\b\u0010:\u001a\u00020%H\u0002J/\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b2\u0006\u0010<\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010=\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010>J\u001a\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(J\u0016\u0010A\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(J\u0018\u0010B\u001a\u00020%2\u0006\u00100\u001a\u00020\u00042\b\b\u0001\u0010C\u001a\u00020\u0004J\"\u0010D\u001a\u0004\u0018\u00010\"2\u0006\u0010E\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010=\u001a\u00020\u0001J\u0016\u0010F\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006G"}, d2 = {"Lcom/bytedance/sdk/bridge/BridgeRegistry;", "", "()V", "TAG", "", "bridgeService", "Lcom/bytedance/sdk/bridge/api/BridgeService;", "commonBridgeModuleContainer", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/sdk/bridge/model/BridgeTmpInfo;", "commonEventInfoContainer", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/bytedance/sdk/bridge/BridgeMethodInfo;", "commonMethodInfoContainer", "", "Lcom/bytedance/sdk/bridge/model/BridgeInfo;", "isNotInitBridgeSdk", "", "()Z", "setNotInitBridgeSdk", "(Z)V", "mModuleMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "getMModuleMap", "()Ljava/util/HashMap;", "checkParamsRequired", "", "params", "Lorg/json/JSONObject;", "paramInfos", "Lcom/bytedance/sdk/bridge/BridgeParamInfo;", "(Lorg/json/JSONObject;[Lcom/bytedance/sdk/bridge/BridgeParamInfo;)[Ljava/lang/String;", "checkRequiredParams", "Lcom/bytedance/sdk/bridge/model/BridgeResult;", "(Lorg/json/JSONObject;[Lcom/bytedance/sdk/bridge/BridgeParamInfo;)Lcom/bytedance/sdk/bridge/model/BridgeResult;", "disableBridgeMethods", "", "module", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "enableBridgeMethods", "findBridgeInfoByLifecycle", "infos", "", "getBridgeMethodInfoByName", "bridgeName", "getEventMethodInfoByName", "event", "initBridgeSdk", "optJSONArray", "Lorg/json/JSONArray;", "key", "optJSONObject", "optLong", "", "jsonObject", "defaultValue", "printCurrentMethod", "processBridgeParams", "bridgeMethodInfo", "bridgeContext", "(Lcom/bytedance/sdk/bridge/BridgeMethodInfo;Lorg/json/JSONObject;Ljava/lang/Object;)[Ljava/lang/Object;", "registerBridge", "bridgeModule", "registerBridgeWithLifeCycle", "registerEvent", "privilege", "runBridgeMethod", "bridgeInfo", "unregister", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.h */
public final class BridgeRegistry {

    /* renamed from: a */
    public static final BridgeRegistry f50436a = new BridgeRegistry();

    /* renamed from: b */
    private static final String f50437b = f50437b;

    /* renamed from: c */
    private static final ConcurrentHashMap<String, List<BridgeInfo>> f50438c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static final ConcurrentHashMap<String, C20666f> f50439d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final CopyOnWriteArrayList<BridgeTmpInfo> f50440e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    private static final BridgeService f50441f = ((BridgeService) C20216d.m73783a(BridgeService.class));

    /* renamed from: g */
    private static volatile boolean f50442g = true;

    /* renamed from: h */
    private static final HashMap<String, Class<?>> f50443h = new HashMap<>();

    private BridgeRegistry() {
    }

    /* renamed from: a */
    public final HashMap<String, Class<?>> mo69575a() {
        return f50443h;
    }

    /* renamed from: b */
    public final void mo69579b() {
        if (f50442g) {
            f50442g = false;
            BridgeService bridgeService = (BridgeService) C20216d.m73783a(BridgeService.class);
            if (bridgeService != null) {
                bridgeService.initBridgeSDK();
            }
        }
    }

    /* renamed from: c */
    private final void m75165c() {
        Boolean bool;
        C20661b a = BridgeManager.f50421a.mo69560a();
        if (a != null) {
            bool = a.mo69544a();
        } else {
            bool = null;
        }
        if (!(!Intrinsics.areEqual((Object) bool, (Object) true))) {
            StringBuilder sb = new StringBuilder("--------- Current Common BridgeMethod --------\n");
            Set<String> keySet = f50438c.keySet();
            Intrinsics.checkExpressionValueIsNotNull(keySet, "commonMethodInfoContainer.keys");
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                sb.append(((String) it.next()) + "\n");
            }
            Logger lVar = Logger.f50514b;
            String str = f50437b;
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
            lVar.mo69733a(str, sb2);
        }
    }

    /* renamed from: a */
    public final C20666f mo69571a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        return f50439d.get(str);
    }

    /* renamed from: a */
    private final JSONObject m75162a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (Intrinsics.areEqual(str, "__all_params__")) {
            return jSONObject;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return optJSONObject;
            }
        } catch (Exception unused) {
        }
        return new JSONObject();
    }

    /* renamed from: b */
    private final JSONArray m75164b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return new JSONArray();
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                return optJSONArray;
            }
        } catch (Exception unused) {
        }
        return new JSONArray();
    }

    /* renamed from: b */
    public final BridgeResult mo69578b(JSONObject jSONObject, C20667g[] gVarArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(gVarArr, "paramInfos");
        String[] a = mo69577a(jSONObject, gVarArr);
        if (a.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : a) {
            jSONArray.put(str);
        }
        jSONObject2.put("params", jSONArray);
        Logger.f50514b.mo69733a(f50437b, "params is error");
        return BridgeResult.f50535a.mo69766d("params error", jSONObject2);
    }

    /* renamed from: a */
    public final BridgeInfo mo69574a(List<BridgeInfo> list, Lifecycle lifecycle) {
        BridgeInfo aVar = null;
        if (lifecycle != null || list == null || !(!list.isEmpty())) {
            if (list != null) {
                for (T t : list) {
                    if (Intrinsics.areEqual(t.mo69771d(), lifecycle)) {
                        return t;
                    }
                    if (t.mo69771d() == null) {
                        aVar = t;
                    }
                }
            }
            return aVar;
        }
        Boolean f = BridgeManager.f50421a.mo69560a().mo69549f();
        Intrinsics.checkExpressionValueIsNotNull(f, "BridgeManager.bridgeConf…sCompatiblePreLoadWebview");
        if (f.booleanValue()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size).mo69770c()) {
                    return list.get(size);
                }
            }
        }
        return (BridgeInfo) CollectionsKt.last((List) list);
    }

    /* renamed from: b */
    public final void mo69580b(Object obj, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Logger lVar = Logger.f50514b;
        String str = f50437b;
        lVar.mo69733a(str, " enableBridgeMethods " + obj.getClass().getSimpleName());
        C20678m a = C20658a.m75123a(obj.getClass());
        if (a != null) {
            for (C20666f fVar : a.mo69750a()) {
                Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                String b = fVar.mo69563b();
                BridgeInfo a2 = f50436a.mo69574a(f50438c.get(b), lifecycle);
                if (a2 != null) {
                    a2.mo69768a(true);
                }
                Logger lVar2 = Logger.f50514b;
                String str2 = f50437b;
                lVar2.mo69733a(str2, " enable  " + b + '\n');
            }
        }
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69516g();
        }
    }

    /* renamed from: c */
    public final void mo69581c(Object obj, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        C20678m a = C20658a.m75123a(obj.getClass());
        if (a != null) {
            for (C20666f fVar : a.mo69750a()) {
                Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                String b = fVar.mo69563b();
                List<BridgeInfo> list = f50438c.get(b);
                BridgeInfo a2 = f50436a.mo69574a(list, lifecycle);
                if (!(list == null || a2 == null)) {
                    list.remove(a2);
                    Logger lVar = Logger.f50514b;
                    String str = f50437b;
                    lVar.mo69733a(str, "unregister  " + lifecycle + " -- " + b);
                }
            }
        }
        CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList = f50440e;
        synchronized (copyOnWriteArrayList) {
            Iterator<BridgeTmpInfo> it = copyOnWriteArrayList.iterator();
            Intrinsics.checkExpressionValueIsNotNull(it, "commonBridgeModuleContainer.iterator()");
            while (it.hasNext()) {
                BridgeTmpInfo next = it.next();
                if (Intrinsics.areEqual(obj, next.mo69772a())) {
                    f50440e.remove(next);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69518i();
        }
    }

    /* renamed from: a */
    public final BridgeInfo mo69573a(String str, Lifecycle lifecycle) {
        C20666f fVar;
        Boolean bool;
        C20678m a;
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        ConcurrentHashMap<String, List<BridgeInfo>> concurrentHashMap = f50438c;
        if (concurrentHashMap.containsKey(str)) {
            BridgeInfo a2 = mo69574a(concurrentHashMap.get(str), lifecycle);
            C20666f b = a2 != null ? a2.mo69769b() : null;
            if (!(a2 == null || b == null || !a2.mo69770c())) {
                return a2;
            }
        }
        BridgeSDKInitHelper.f50444a.mo69583a(str);
        if (f50443h.isEmpty()) {
            for (AbstractC20674k kVar : BridgeSDKInitHelper.f50444a.mo69582a()) {
                if (kVar != null) {
                    kVar.mo69731a(f50443h);
                }
            }
        }
        Class<?> cls = f50443h.get(str);
        BridgeTmpInfo cVar = null;
        if (cls != null) {
            CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList = f50440e;
            synchronized (copyOnWriteArrayList) {
                for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                    CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList2 = f50440e;
                    if (!(!cls.isAssignableFrom(copyOnWriteArrayList2.get(size).mo69772a().getClass()) || (cVar = copyOnWriteArrayList2.get(size)) == null || (a = C20658a.m75123a(cls)) == null)) {
                        for (C20666f fVar2 : a.mo69750a()) {
                            Intrinsics.checkExpressionValueIsNotNull(fVar2, "methodInfo");
                            String b2 = fVar2.mo69563b();
                            if (!TextUtils.isEmpty(b2)) {
                                ConcurrentHashMap<String, List<BridgeInfo>> concurrentHashMap2 = f50438c;
                                List<BridgeInfo> list = concurrentHashMap2.get(b2);
                                if (list == null) {
                                    list = Collections.synchronizedList(new ArrayList());
                                    Intrinsics.checkExpressionValueIsNotNull(b2, "bridgeMethodName");
                                    Intrinsics.checkExpressionValueIsNotNull(list, "infos");
                                    concurrentHashMap2.put(b2, list);
                                }
                                BridgeInfo a3 = f50436a.mo69574a(list, lifecycle);
                                if (a3 == null) {
                                    list.add(new BridgeInfo(cVar.mo69772a(), fVar2, false, cVar.mo69773b(), 4, null));
                                } else {
                                    Boolean f = BridgeManager.f50421a.mo69560a().mo69549f();
                                    Intrinsics.checkExpressionValueIsNotNull(f, "BridgeManager.bridgeConf…sCompatiblePreLoadWebview");
                                    if (f.booleanValue() && !a3.mo69770c()) {
                                        list.add(new BridgeInfo(cVar.mo69772a(), fVar2, false, cVar.mo69773b(), 4, null));
                                    }
                                }
                            } else {
                                Logger.f50514b.mo69735c(f50437b, "Bridge method name cannot be empty！");
                                throw new IllegalArgumentException("Bridge method name cannot be empty！");
                            }
                        }
                        continue;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (cVar == null) {
            CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList3 = f50440e;
            synchronized (copyOnWriteArrayList3) {
                int size2 = copyOnWriteArrayList3.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        break;
                    }
                    C20678m a4 = C20658a.m75123a(f50440e.get(size2).mo69772a().getClass());
                    if (a4 != null) {
                        for (C20666f fVar3 : a4.mo69750a()) {
                            Intrinsics.checkExpressionValueIsNotNull(fVar3, "methodInfo");
                            String b3 = fVar3.mo69563b();
                            if (TextUtils.equals(b3, str)) {
                                ConcurrentHashMap<String, List<BridgeInfo>> concurrentHashMap3 = f50438c;
                                List<BridgeInfo> list2 = concurrentHashMap3.get(b3);
                                if (list2 == null) {
                                    list2 = Collections.synchronizedList(new ArrayList());
                                    Intrinsics.checkExpressionValueIsNotNull(b3, "bridgeMethodName");
                                    Intrinsics.checkExpressionValueIsNotNull(list2, "infosTwo");
                                    concurrentHashMap3.put(b3, list2);
                                }
                                BridgeInfo a5 = f50436a.mo69574a(list2, lifecycle);
                                if (a5 == null) {
                                    CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList4 = f50440e;
                                    list2.add(new BridgeInfo(copyOnWriteArrayList4.get(size2).mo69772a(), fVar3, false, copyOnWriteArrayList4.get(size2).mo69773b(), 4, null));
                                } else {
                                    Boolean f2 = BridgeManager.f50421a.mo69560a().mo69549f();
                                    Intrinsics.checkExpressionValueIsNotNull(f2, "BridgeManager.bridgeConf…sCompatiblePreLoadWebview");
                                    if (f2.booleanValue() && !a5.mo69770c()) {
                                        CopyOnWriteArrayList<BridgeTmpInfo> copyOnWriteArrayList5 = f50440e;
                                        list2.add(new BridgeInfo(copyOnWriteArrayList5.get(size2).mo69772a(), fVar3, false, copyOnWriteArrayList5.get(size2).mo69773b(), 4, null));
                                    }
                                }
                            }
                        }
                    }
                    ConcurrentHashMap<String, List<BridgeInfo>> concurrentHashMap4 = f50438c;
                    if (concurrentHashMap4.containsKey(str)) {
                        if (f50436a.mo69574a(concurrentHashMap4.get(str), lifecycle) != null) {
                            break;
                        }
                    }
                    size2--;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        ConcurrentHashMap<String, List<BridgeInfo>> concurrentHashMap5 = f50438c;
        if (concurrentHashMap5.containsKey(str)) {
            BridgeInfo a6 = mo69574a(concurrentHashMap5.get(str), lifecycle);
            if (a6 != null) {
                fVar = a6.mo69769b();
            } else {
                fVar = null;
            }
            if (!(a6 == null || fVar == null || !a6.mo69770c())) {
                return a6;
            }
            Logger lVar = Logger.f50514b;
            String str2 = f50437b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found, bridgeInfo:");
            sb.append(a6);
            sb.append(", methodInfo:");
            sb.append(fVar);
            sb.append("}, isActive:");
            if (a6 != null) {
                bool = Boolean.valueOf(a6.mo69770c());
            } else {
                bool = null;
            }
            sb.append(bool);
            lVar.mo69736d(str2, sb.toString());
        }
        m75165c();
        Logger.f50514b.mo69736d(f50437b, str + " not found, cmic:" + concurrentHashMap5.size() + ", cbmc:" + f50440e.size() + ", mm:" + f50443h.size());
        return null;
    }

    /* renamed from: a */
    public final void mo69576a(Object obj, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(obj, "module");
        Logger lVar = Logger.f50514b;
        String str = f50437b;
        lVar.mo69733a(str, " disableBridgeMethods " + obj.getClass().getSimpleName());
        C20678m a = C20658a.m75123a(obj.getClass());
        if (a != null) {
            for (C20666f fVar : a.mo69750a()) {
                Intrinsics.checkExpressionValueIsNotNull(fVar, "methodInfo");
                String b = fVar.mo69563b();
                BridgeInfo a2 = f50436a.mo69574a(f50438c.get(b), lifecycle);
                if (a2 != null) {
                    a2.mo69768a(false);
                }
                Logger lVar2 = Logger.f50514b;
                String str2 = f50437b;
                lVar2.mo69733a(str2, " disable  " + b + '\n');
            }
        }
        if (obj instanceof AbsBridgeLifeCycleModule) {
            ((AbsBridgeLifeCycleModule) obj).mo69517h();
        }
    }

    /* renamed from: a */
    public final String[] mo69577a(JSONObject jSONObject, C20667g[] gVarArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(gVarArr, "paramInfos");
        ArrayList arrayList = new ArrayList();
        if (gVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (C20667g gVar : gVarArr) {
            if (gVar.mo69570e()) {
                if (jSONObject == null) {
                    Intrinsics.throwNpe();
                }
                if (jSONObject.opt(gVar.mo69568c()) == null) {
                    String c = gVar.mo69568c();
                    Intrinsics.checkExpressionValueIsNotNull(c, "it.paramName");
                    arrayList.add(c);
                }
            }
        }
        Object[] array2 = arrayList.toArray(new String[0]);
        if (array2 != null) {
            return (String[]) array2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    private final long m75161a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            String optString = jSONObject.optString(str);
            if (obj != null) {
                long longValue = ((Long) obj).longValue();
                try {
                    Long valueOf = Long.valueOf(optString);
                    Intrinsics.checkExpressionValueIsNotNull(valueOf, "java.lang.Long.valueOf(value)");
                    return valueOf.longValue();
                } catch (NumberFormatException unused) {
                    return longValue;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
            }
        } else if (obj != null) {
            return ((Long) obj).longValue();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
    }

    /* renamed from: a */
    public final BridgeResult mo69572a(BridgeInfo aVar, JSONObject jSONObject, Object obj) {
        Intrinsics.checkParameterIsNotNull(aVar, "bridgeInfo");
        Intrinsics.checkParameterIsNotNull(obj, "bridgeContext");
        try {
            Object[] a = m75163a(aVar.mo69769b(), jSONObject, obj);
            BridgeResult bridgeResult = (BridgeResult) aVar.mo69769b().mo69562a().invoke(aVar.mo69767a(), Arrays.copyOf(a, a.length));
            Logger lVar = Logger.f50514b;
            String str = f50437b;
            lVar.mo69733a(str, "Bridge method [" + aVar.mo69769b().mo69563b() + "] run successfully.");
            return bridgeResult;
        } catch (Exception e) {
            e.printStackTrace();
            String stackTraceString = Log.getStackTraceString(e);
            BridgeService bridgeService = f50441f;
            if (bridgeService == null) {
                return null;
            }
            String str2 = f50437b;
            bridgeService.reportErrorInfo(str2, "runBridgeMethod = " + stackTraceString);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r5 != null) goto L_0x00e0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] m75163a(com.bytedance.sdk.bridge.C20666f r10, org.json.JSONObject r11, java.lang.Object r12) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bridge.BridgeRegistry.m75163a(com.bytedance.sdk.bridge.f, org.json.JSONObject, java.lang.Object):java.lang.Object[]");
    }
}
