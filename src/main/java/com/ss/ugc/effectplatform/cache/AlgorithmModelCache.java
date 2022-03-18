package com.ss.ugc.effectplatform.cache;

import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FilePathComponent;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager;
import com.ss.ugc.effectplatform.cache.disklrucache.DiskLruCache;
import com.ss.ugc.effectplatform.model.LocalModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.util.ModelNameProcessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011J \u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "Lcom/ss/ugc/effectplatform/cache/DiskLruCacheImpl;", "cacheDir", "", "appVersion", "", "builtInResourceManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "(Ljava/lang/String;ILcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;)V", "clearHistoryModel", "", "modelInfo", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "getLocalModelInfoByName", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "name", "getLocalModelInfoList", "", "writeModel", "modelType", "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "modelStream", "Lbytekn/foundation/io/file/FileInputStream;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.a */
public final class AlgorithmModelCache extends DiskLruCacheImpl {

    /* renamed from: b */
    private final BuiltInResourceManager f164763b;

    /* renamed from: a */
    public final Map<String, LocalModelInfo> mo227639a() {
        FilePathComponent b;
        String a;
        String str;
        HashMap hashMap = new HashMap();
        try {
            List<String> c = this.f164763b.mo227722c("model");
            if (c != null) {
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    List<String> c2 = this.f164763b.mo227722c("model/" + ((String) it.next()));
                    if (c2 != null) {
                        for (T t : c2) {
                            try {
                                str = ModelNameProcessor.f165128a.mo228346a((String) t);
                            } catch (Exception unused) {
                                str = "";
                            }
                            if (!Intrinsics.areEqual(str, "")) {
                                String b2 = ModelNameProcessor.f165128a.mo228348b(t);
                                LocalModelInfo a2 = LocalModelInfo.f164948a.mo227935a("");
                                a2.mo227924a(str);
                                a2.mo227928b(b2);
                                a2.mo227925a(true);
                                hashMap.put(str, a2);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.f5760a.mo8663a("DiskLruCacheImpl", "getLocalModelInfoList built in error", e);
        }
        try {
            DiskLruCache b3 = mo227684b();
            Set<String> a3 = b3 != null ? b3.mo227641a() : null;
            if (a3 != null) {
                for (T t2 : a3) {
                    String a4 = ModelNameProcessor.f165128a.mo228346a((String) t2);
                    DiskLruCache b4 = mo227684b();
                    DiskLruCache.Snapshot d = b4 != null ? b4.mo227649d(t2) : null;
                    if (!(d == null || (b = d.mo227676b(0)) == null || (a = b.mo8744a()) == null)) {
                        LocalModelInfo a5 = LocalModelInfo.f164948a.mo227935a(a);
                        a5.mo227925a(false);
                        hashMap.put(a4, a5);
                    }
                }
            }
            return hashMap;
        } catch (Exception e2) {
            Logger.f5760a.mo8663a("DiskLruCacheImpl", "error while getLocalModelInfoList", e2);
            return hashMap;
        }
    }

    /* renamed from: a */
    private final void m256611a(ModelInfo modelInfo) {
        Set<String> a;
        String name = modelInfo.getName();
        if (name != null) {
            String a2 = DiskLruCache.f164764h.mo227659a(name);
            DiskLruCache b = mo227684b();
            if (!(b == null || (a = b.mo227641a()) == null)) {
                for (T t : a) {
                    if (Intrinsics.areEqual(ModelNameProcessor.f165128a.mo228346a((String) t), a2)) {
                        mo227689d(t);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final LocalModelInfo mo227637a(String str) {
        T t;
        DiskLruCache.Snapshot dVar;
        String a;
        Set<String> a2;
        T t2;
        Intrinsics.checkParameterIsNotNull(str, "name");
        String a3 = DiskLruCache.f164764h.mo227659a(str);
        DiskLruCache b = mo227684b();
        LocalModelInfo eVar = null;
        if (b == null || (a2 = b.mo227641a()) == null) {
            t = null;
        } else {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (Intrinsics.areEqual(ModelNameProcessor.f165128a.mo228346a((String) t2), a3)) {
                    break;
                }
            }
            t = t2;
        }
        if (t == null) {
            return null;
        }
        DiskLruCache.Snapshot dVar2 = null;
        try {
            DiskLruCache b2 = mo227684b();
            if (b2 != null) {
                dVar = b2.mo227649d(t);
            } else {
                dVar = null;
            }
            if (dVar == null) {
                return null;
            }
            FilePathComponent b3 = dVar.mo227676b(0);
            if (!(b3 == null || (a = b3.mo8744a()) == null)) {
                eVar = LocalModelInfo.f164948a.mo227935a(a);
            }
            dVar.mo8708b();
            return eVar;
        } catch (Exception e) {
            Logger bVar = Logger.f5760a;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Logger.m7508a(bVar, "DiskLruCache", message, null, 4, null);
            if (dVar2 != null) {
                dVar2.mo8708b();
            }
            return null;
        } catch (Throwable th) {
            if (dVar2 != null) {
                dVar2.mo8708b();
            }
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlgorithmModelCache(String str, int i, BuiltInResourceManager fVar) {
        super(str, i, 0, Long.MAX_VALUE, null, 20, null);
        Intrinsics.checkParameterIsNotNull(str, "cacheDir");
        Intrinsics.checkParameterIsNotNull(fVar, "builtInResourceManager");
        this.f164763b = fVar;
    }

    /* renamed from: a */
    public final String mo227638a(FetchModelType fetchModelType, ModelInfo modelInfo, FileInputStream bVar) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(fetchModelType, "modelType");
        Intrinsics.checkParameterIsNotNull(modelInfo, "modelInfo");
        Intrinsics.checkParameterIsNotNull(bVar, "modelStream");
        m256611a(modelInfo);
        String a = DiskLruCache.f164764h.mo227659a(ModelNameProcessor.f165128a.mo228345a(modelInfo));
        int i = C65497b.f164813a[fetchModelType.ordinal()];
        if (i == 1) {
            ExtendedUrlModel file_url = modelInfo.getFile_url();
            if (file_url != null) {
                str = file_url.getUri();
            } else {
                str = null;
            }
            return (String) DiskLruCacheImpl.m256672a(this, a, bVar, str, 0, null, 24, null).getFirst();
        } else if (i == 2) {
            ExtendedUrlModel file_url2 = modelInfo.getFile_url();
            if (file_url2 != null) {
                str2 = file_url2.getUri();
            } else {
                str2 = null;
            }
            return (String) DiskLruCacheImpl.m256673b(this, a, bVar, str2, 0, null, 24, null).getFirst();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
