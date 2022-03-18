package com.ss.ugc.effectplatform.cache;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.concurrent.lock.Lock;
import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.io.file.FileInputStream;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.p054b.C1686c;
import com.ss.ugc.effectplatform.cache.disklrucache.DiskLruCache;
import com.ss.ugc.effectplatform.cache.disklrucache.IAllowListKeyRule;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 12\u00020\u0001:\u00011B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016Jv\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010*\u001a\u00020\b2:\b\u0002\u0010+\u001a4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\b¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0017\u0018\u00010,H\u0004Jv\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010*\u001a\u00020\b2:\b\u0002\u0010+\u001a4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\b¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0017\u0018\u00010,H\u0004R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118DX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/DiskLruCacheImpl;", "Lcom/ss/ugc/effectplatform/cache/ICache;", "cacheDir", "", "appVersion", "", "valueCount", "maxSize", "", "allowListRule", "Lcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;", "(Ljava/lang/String;IIJLcom/ss/ugc/effectplatform/cache/disklrucache/IAllowListKeyRule;)V", "getCacheDir", "()Ljava/lang/String;", "classLock", "Lbytekn/foundation/concurrent/lock/Lock;", "diskLruCache", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "getDiskLruCache", "()Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache;", "diskLruCacheInternal", "Lbytekn/foundation/concurrent/SharedReference;", "clear", "", "getSnapshot", "Lcom/ss/ugc/effectplatform/cache/disklrucache/DiskLruCache$Snapshot;", "key", "has", "", "queryToStream", "Lbytekn/foundation/io/file/FileInputStream;", "queryToValue", "remove", "removePattern", "patternString", "save", "inputStream", "value", "writeInputStreamAsZipToDisk", "Lkotlin/Pair;", "modelStream", "expectMD5", "contentLength", "onProgressCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "progress", "writeInputStreamToDisk", "Companion", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.a.c */
public class DiskLruCacheImpl implements ICache {

    /* renamed from: a */
    public static final Companion f164814a = new Companion(null);

    /* renamed from: b */
    private SharedReference<DiskLruCache> f164815b;

    /* renamed from: c */
    private final Lock f164816c;

    /* renamed from: d */
    private final String f164817d;

    /* renamed from: e */
    private final int f164818e;

    /* renamed from: f */
    private final int f164819f;

    /* renamed from: g */
    private final long f164820g;

    /* renamed from: h */
    private final IAllowListKeyRule f164821h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/ugc/effectplatform/cache/DiskLruCacheImpl$Companion;", "", "()V", "BUFFER_SIZE", "", "TAG", "", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo227688c() {
        return this.f164817d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DiskLruCache mo227684b() {
        Object obj;
        DiskLruCache a;
        Lock gVar = this.f164816c;
        gVar.mo8634a();
        try {
            if (this.f164815b.mo8625a() == null || (a = this.f164815b.mo8625a()) == null || !a.mo227645b()) {
                try {
                    Result.Companion aVar = Result.Companion;
                    obj = Result.m271569constructorimpl(DiskLruCache.f164764h.mo227658a(this.f164817d, this.f164818e, this.f164819f, this.f164820g, this.f164821h));
                } catch (Throwable th) {
                    Result.Companion aVar2 = Result.Companion;
                    obj = Result.m271569constructorimpl(C69097g.m265890a(th));
                }
                Throwable r2 = Result.m271572exceptionOrNullimpl(obj);
                if (r2 != null) {
                    Logger bVar = Logger.f5760a;
                    Logger.m7508a(bVar, "DiskLruCacheImpl", "DiskLruCache.open fails, ex: " + r2, null, 4, null);
                }
                SharedReference<DiskLruCache> bVar2 = this.f164815b;
                if (Result.m271575isFailureimpl(obj)) {
                    obj = null;
                }
                C1686c.m7469a(bVar2, obj);
            }
            return this.f164815b.mo8625a();
        } finally {
            gVar.mo8635b();
        }
    }

    @Override // com.ss.ugc.effectplatform.cache.ICache
    /* renamed from: b */
    public String mo227685b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        FileInputStream c = mo227687c(str);
        if (c != null) {
            return FileManager.m7583a(FileManager.f5817a, c, (ContentEncoding) null, 2, (Object) null);
        }
        return null;
    }

    @Override // com.ss.ugc.effectplatform.cache.ICache
    /* renamed from: c */
    public FileInputStream mo227687c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        DiskLruCache.Snapshot a = mo227637a(str);
        if (a != null) {
            return a.mo227675a(0);
        }
        return null;
    }

    @Override // com.ss.ugc.effectplatform.cache.ICache
    /* renamed from: e */
    public boolean mo227690e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String a = DiskLruCache.f164764h.mo227659a(str);
        DiskLruCache b = mo227684b();
        if (b != null) {
            return b.mo227646b(a);
        }
        return false;
    }

    /* renamed from: a */
    private final DiskLruCache.Snapshot mo227637a(String str) {
        String a = DiskLruCache.f164764h.mo227659a(str);
        try {
            DiskLruCache b = mo227684b();
            if (b != null) {
                return b.mo227649d(a);
            }
            return null;
        } catch (Exception e) {
            Logger bVar = Logger.f5760a;
            bVar.mo8663a("DiskLruCacheImpl", "get key:" + str + " exception", e);
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo227689d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        String a = DiskLruCache.f164764h.mo227659a(str);
        try {
            DiskLruCache b = mo227684b();
            if (b != null) {
                return b.mo227648c(a);
            }
            return false;
        } catch (Exception e) {
            Logger bVar = Logger.f5760a;
            bVar.mo8663a("DiskLruCacheImpl", "remove key:" + str + " exception", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r5 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5.mo8708b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r5 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[SYNTHETIC, Splitter:B:28:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[SYNTHETIC, Splitter:B:36:0x00ac] */
    @Override // com.ss.ugc.effectplatform.cache.ICache
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo227681a(java.lang.String r19, bytekn.foundation.io.file.FileInputStream r20) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.DiskLruCacheImpl.mo227681a(java.lang.String, bytekn.foundation.io.file.b):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079 A[SYNTHETIC, Splitter:B:29:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[SYNTHETIC, Splitter:B:34:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a1 A[SYNTHETIC, Splitter:B:39:0x00a1] */
    @Override // com.ss.ugc.effectplatform.cache.ICache
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo227682a(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.DiskLruCacheImpl.mo227682a(java.lang.String, java.lang.String):long");
    }

    public DiskLruCacheImpl(String str, int i, int i2, long j, IAllowListKeyRule dVar) {
        Intrinsics.checkParameterIsNotNull(str, "cacheDir");
        this.f164817d = str;
        this.f164818e = i;
        this.f164819f = i2;
        this.f164820g = j;
        this.f164821h = dVar;
        this.f164815b = new SharedReference<>(null);
        this.f164816c = new Lock();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x017a, code lost:
        if (r0 != null) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d7 A[SYNTHETIC, Splitter:B:48:0x01d7] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e9 A[Catch:{ Exception -> 0x01ec }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> mo227686b(java.lang.String r24, bytekn.foundation.io.file.FileInputStream r25, java.lang.String r26, long r27, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r29) {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.DiskLruCacheImpl.mo227686b(java.lang.String, bytekn.foundation.io.file.b, java.lang.String, long, kotlin.jvm.functions.k):kotlin.Pair");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0123 A[SYNTHETIC, Splitter:B:29:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> mo227683a(java.lang.String r18, bytekn.foundation.io.file.FileInputStream r19, java.lang.String r20, long r21, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r23) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.DiskLruCacheImpl.mo227683a(java.lang.String, bytekn.foundation.io.file.b, java.lang.String, long, kotlin.jvm.functions.k):kotlin.Pair");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DiskLruCacheImpl(java.lang.String r8, int r9, int r10, long r11, com.ss.ugc.effectplatform.cache.disklrucache.IAllowListKeyRule r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L_0x0007
            r9 = 0
            r2 = 0
            goto L_0x0008
        L_0x0007:
            r2 = r9
        L_0x0008:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x000f
            r10 = 1
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = r10
        L_0x0010:
            r9 = r14 & 16
            if (r9 == 0) goto L_0x0018
            r9 = 0
            r13 = r9
            com.ss.ugc.effectplatform.a.a.d r13 = (com.ss.ugc.effectplatform.cache.disklrucache.IAllowListKeyRule) r13
        L_0x0018:
            r6 = r13
            r0 = r7
            r1 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.cache.DiskLruCacheImpl.<init>(java.lang.String, int, int, long, com.ss.ugc.effectplatform.a.a.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.ugc.effectplatform.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ Pair m256673b(DiskLruCacheImpl cVar, String str, FileInputStream bVar, String str2, long j, Function2 kVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                j = 0;
            }
            if ((i & 16) != 0) {
                kVar = null;
            }
            return cVar.mo227686b(str, bVar, str2, j, kVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeInputStreamAsZipToDisk");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.ugc.effectplatform.a.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ Pair m256672a(DiskLruCacheImpl cVar, String str, FileInputStream bVar, String str2, long j, Function2 kVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                j = 0;
            }
            if ((i & 16) != 0) {
                kVar = null;
            }
            return cVar.mo227683a(str, bVar, str2, j, kVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeInputStreamToDisk");
    }
}
