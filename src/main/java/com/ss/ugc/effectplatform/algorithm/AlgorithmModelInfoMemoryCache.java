package com.ss.ugc.effectplatform.algorithm;

import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.concurrent.lock.AtomicBoolean;
import bytekn.foundation.concurrent.lock.Lock;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.LocalModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.C65518b;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmModelInfoMemoryCache;", "", "()V", "TAG", "", "cache", "Lbytekn/foundation/collections/SharedMutableMap;", "Lcom/ss/ugc/effectplatform/algorithm/ModelInfoCache;", "classLock", "Lbytekn/foundation/concurrent/lock/Lock;", "hasBuiltCache", "Lbytekn/foundation/concurrent/lock/AtomicBoolean;", "buildCache", "", "serverModelInfos", "Lcom/ss/ugc/effectplatform/model/LoadedModelList;", "localCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "getModelMemoryInfo", "name", "", "isModelReady", "modelName", "updateModelInfo", "serverModelInfo", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "localModelInfo", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "writeModelInfo", "modelInfo", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.c */
public final class AlgorithmModelInfoMemoryCache {

    /* renamed from: a */
    public static final AlgorithmModelInfoMemoryCache f164841a = new AlgorithmModelInfoMemoryCache();

    /* renamed from: b */
    private static final Lock f164842b = new Lock();

    /* renamed from: c */
    private static final SharedMutableMap<String, ModelInfoCache> f164843c = new SharedMutableMap<>(false, 1, null);

    /* renamed from: d */
    private static final AtomicBoolean f164844d = new AtomicBoolean(false);

    private AlgorithmModelInfoMemoryCache() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m256703a() {
        return f164844d.mo8629a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m256702a(ModelInfo modelInfo) {
        Intrinsics.checkParameterIsNotNull(modelInfo, "modelInfo");
        String name = modelInfo.getName();
        String str = "";
        LocalModelInfo a = LocalModelInfo.f164948a.mo227935a(str);
        a.mo227924a(name);
        String a2 = C65518b.m256861a(modelInfo);
        if (a2 != null) {
            str = a2;
        }
        a.mo227930c(str);
        a.mo227923a(modelInfo.getType());
        a.mo227928b(modelInfo.getVersion());
        a.mo227925a(false);
        ModelInfoCache hVar = new ModelInfoCache(a, modelInfo);
        Lock gVar = f164842b;
        gVar.mo8634a();
        try {
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("AlgorithmModelInfoMemoryCache", "model: " + name + " write in cache!");
            f164843c.put(name, hVar);
            Unit unit = Unit.INSTANCE;
        } finally {
            gVar.mo8635b();
        }
    }

    /* JADX INFO: finally extract failed */
    @JvmStatic
    /* renamed from: a */
    public static final boolean m256704a(String str) {
        if (str == null) {
            return false;
        }
        Lock gVar = f164842b;
        gVar.mo8634a();
        try {
            ModelInfoCache hVar = f164843c.get(str);
            gVar.mo8635b();
            if (hVar == null) {
                Logger bVar = Logger.f5760a;
                Logger.m7508a(bVar, "AlgorithmModelInfoMemoryCache", "model: " + str + " not in cache!", null, 4, null);
                return false;
            }
            LocalModelInfo a = hVar.mo227724a();
            ModelInfo b = hVar.mo227725b();
            if (!Intrinsics.areEqual(a.mo227929c(), b.getVersion())) {
                Logger bVar2 = Logger.f5760a;
                Logger.m7508a(bVar2, "AlgorithmModelInfoMemoryCache", "model: " + str + " version not match. local version: " + a.mo227929c() + ", server version: " + b.getVersion(), null, 4, null);
                return false;
            } else if (a.mo227926a()) {
                return true;
            } else {
                if (a.mo227931d() != b.getType()) {
                    Logger bVar3 = Logger.f5760a;
                    Logger.m7508a(bVar3, "AlgorithmModelInfoMemoryCache", "model: " + str + " size not match. local size: " + a.mo227931d() + ", server size: " + b.getType(), null, 4, null);
                    return false;
                } else if (!(!Intrinsics.areEqual(a.mo227932e(), C65518b.m256861a(b)))) {
                    return true;
                } else {
                    Logger bVar4 = Logger.f5760a;
                    Logger.m7508a(bVar4, "AlgorithmModelInfoMemoryCache", "model: " + str + " md5 not match. local md5: " + a.mo227932e() + ", server md5: " + C65518b.m256861a(b), null, 4, null);
                    return false;
                }
            }
        } catch (Throwable th) {
            gVar.mo8635b();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo227705a(LoadedModelList dVar, AlgorithmModelCache aVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(dVar, "serverModelInfos");
        Intrinsics.checkParameterIsNotNull(aVar, "localCache");
        Map<String, ModelInfo> b = dVar.mo227917b();
        if (b == null || b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f164844d.mo8628a(false);
            return;
        }
        Map<String, LocalModelInfo> a = aVar.mo227639a();
        if (a == null || a.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f164844d.mo8628a(false);
            return;
        }
        Lock gVar = f164842b;
        gVar.mo8634a();
        try {
            for (Map.Entry<String, ModelInfo> entry : b.entrySet()) {
                String key = entry.getKey();
                LocalModelInfo eVar = a.get(key);
                if (eVar != null) {
                    f164843c.put(key, new ModelInfoCache(eVar, entry.getValue()));
                }
            }
            Unit unit = Unit.INSTANCE;
            gVar.mo8635b();
            f164844d.mo8628a(true);
        } catch (Throwable th) {
            gVar.mo8635b();
            throw th;
        }
    }
}
