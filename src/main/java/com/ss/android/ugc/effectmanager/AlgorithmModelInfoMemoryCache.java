package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.model.C60633c;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\b\u001a\u00020\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/effectmanager/AlgorithmModelInfoMemoryCache;", "", "()V", "TAG", "", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/ugc/effectmanager/ModelInfoCache;", "hasBuiltCache", "Ljava/util/concurrent/atomic/AtomicBoolean;", "buildCache", "", "serverModelInfos", "Lcom/ss/android/ugc/effectmanager/LoadedModelList;", "localCache", "Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;", "", "isModelReady", "modelName", "writeModelInfo", "modelInfo", "Lcom/ss/android/ugc/effectmanager/model/ModelInfo;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.a */
public final class AlgorithmModelInfoMemoryCache {

    /* renamed from: a */
    public static final AlgorithmModelInfoMemoryCache f151112a = new AlgorithmModelInfoMemoryCache();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, ModelInfoCache> f151113b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final AtomicBoolean f151114c = new AtomicBoolean(false);

    private AlgorithmModelInfoMemoryCache() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m234943a() {
        return f151114c.get();
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m234942a(ModelInfo modelInfo) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            Intrinsics.checkParameterIsNotNull(modelInfo, "modelInfo");
            String name = modelInfo.getName();
            C60633c cVar = new C60633c();
            cVar.mo208110b(name);
            cVar.mo208114d(modelInfo.getMD5());
            cVar.mo208107a(modelInfo.getType());
            cVar.mo208111c(modelInfo.getVersion());
            cVar.mo208108a(false);
            ModelInfoCache jVar = new ModelInfoCache(cVar, modelInfo);
            EPLog.m235179b("AlgorithmModelInfoMemoryCache", "model: " + name + " write in cache!");
            f151113b.put(name, jVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized boolean m234944a(String str) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            if (str == null) {
                return false;
            }
            ModelInfoCache jVar = f151113b.get(str);
            if (jVar == null) {
                EPLog.m235180c("AlgorithmModelInfoMemoryCache", "model: " + str + " not in cache!");
                return false;
            }
            C60633c a = jVar.mo208068a();
            ModelInfo b = jVar.mo208069b();
            if (!Intrinsics.areEqual(a.mo208109b(), b.getVersion())) {
                EPLog.m235180c("AlgorithmModelInfoMemoryCache", "model: " + str + " version not match. local version: " + a.mo208109b() + ", server version: " + b.getVersion());
                return false;
            } else if (a.mo208112c()) {
                return true;
            } else {
                if (a.mo208113d() != b.getType()) {
                    EPLog.m235180c("AlgorithmModelInfoMemoryCache", "model: " + str + " size not match. local size: " + a.mo208113d() + ", server size: " + b.getType());
                    return false;
                } else if (!(!Intrinsics.areEqual(a.mo208115e(), b.getMD5()))) {
                    return true;
                } else {
                    EPLog.m235180c("AlgorithmModelInfoMemoryCache", "model: " + str + " md5 not match. local md5: " + a.mo208115e() + ", server md5: " + b.getMD5());
                    return false;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo207012a(C60629h hVar, IModelCache dVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "serverModelInfos");
        Intrinsics.checkParameterIsNotNull(dVar, "localCache");
        Map<String, ModelInfo> a = hVar.mo208056a();
        if (a.isEmpty()) {
            f151114c.set(false);
            return;
        }
        Map<String, C60633c> a2 = dVar.mo207018a();
        if (a2.isEmpty()) {
            f151114c.set(false);
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(a, "serverModelInfo");
        for (Map.Entry<String, ModelInfo> entry : a.entrySet()) {
            String key = entry.getKey();
            C60633c cVar = a2.get(key);
            if (cVar != null) {
                ModelInfo value = entry.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "modelInfo.value");
                ModelInfoCache jVar = new ModelInfoCache(cVar, value);
                Intrinsics.checkExpressionValueIsNotNull(key, "name");
                f151113b.put(key, jVar);
            }
        }
        f151114c.set(true);
    }
}
