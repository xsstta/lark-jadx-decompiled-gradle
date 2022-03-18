package com.ss.android.ugc.effectmanager.common.cache;

import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 J2\u0010!\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/cache/EffectDiskLruCache;", "Lcom/ss/android/ugc/effectmanager/common/cachemanager/ICache;", "configuration", "Lcom/ss/android/ugc/effectmanager/EffectConfiguration;", "maxSize", "", "(Lcom/ss/android/ugc/effectmanager/EffectConfiguration;J)V", "realEffectDiskLruCache", "Lcom/ss/android/ugc/effectmanager/common/cache/OldEffectDiskLruCache;", "clear", "", "has", "", "key", "", "queryToStream", "Ljava/io/InputStream;", "queryToValue", "readEffectInMemory", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "remove", "removeEffect", "removePattern", "pattern", "Ljava/util/regex/Pattern;", "patternStr", "save", "inputStream", "value", "unzipEffectToDisk", "monitorTrace", "Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "writeEffectZipToDisk", "expectMD5", "contentLength", "progressListener", "Lcom/ss/android/ugc/effectmanager/common/download/DownloadListener;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.a.b */
public final class EffectDiskLruCache implements ICache {

    /* renamed from: a */
    private C60498e f151235a;

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    /* renamed from: a */
    public InputStream mo207129a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C60498e eVar = this.f151235a;
        if (eVar != null) {
            return eVar.mo207129a(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    /* renamed from: b */
    public boolean mo207134b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C60498e eVar = this.f151235a;
        if (eVar != null) {
            return eVar.mo207134b(str);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo207133b(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        C60498e eVar = this.f151235a;
        if (eVar != null) {
            eVar.mo207137a(effect);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
    }

    /* renamed from: a */
    public final void mo207130a(Effect effect) {
        String unzipPath;
        String name;
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        C60498e eVar = this.f151235a;
        if (eVar != null && (unzipPath = effect.getUnzipPath()) != null && (name = new File(unzipPath).getName()) != null) {
            eVar.mo207140c(name);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    /* renamed from: a */
    public long mo207128a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        C60498e eVar = this.f151235a;
        if (eVar != null) {
            return eVar.mo207128a(str, str2);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo207131a(Effect effect, MonitorTrace bVar) throws Exception {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        C60498e eVar = this.f151235a;
        if (eVar != null) {
            eVar.mo207138a(effect, bVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
    }

    /* renamed from: a */
    public final void mo207132a(Effect effect, InputStream inputStream, String str, long j, DownloadListener aVar) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        Intrinsics.checkParameterIsNotNull(inputStream, "inputStream");
        C60498e eVar = this.f151235a;
        if (eVar != null) {
            eVar.mo207139a(effect, inputStream, j, aVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
    }
}
