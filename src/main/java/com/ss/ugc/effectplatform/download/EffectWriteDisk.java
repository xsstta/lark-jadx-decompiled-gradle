package com.ss.ugc.effectplatform.download;

import bytekn.foundation.io.file.FileInputStream;
import com.ss.ugc.effectplatform.cache.EffectCacheManager;
import com.ss.ugc.effectplatform.cache.EffectDiskLruCache;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.cache.disklrucache.DiskLruCache;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.util.FileUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/ugc/effectplatform/download/EffectWriteDisk;", "Lcom/ss/ugc/effectplatform/download/IWriteDisk;", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "getEffect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "execWrite", "", "inputStream", "Lbytekn/foundation/io/file/FileInputStream;", "contentLength", "", "listener", "Lcom/ss/ugc/effectplatform/download/DownloadListener;", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.download.g */
public final class EffectWriteDisk implements IWriteDisk {

    /* renamed from: a */
    public static final Companion f164909a = new Companion(null);

    /* renamed from: b */
    private final Effect f164910b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/download/EffectWriteDisk$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EffectWriteDisk(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        this.f164910b = effect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "progress", "", "contentLength", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.download.g$b */
    static final class C65509b extends Lambda implements Function2<Integer, Long, Unit> {
        final /* synthetic */ DownloadListener $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65509b(DownloadListener cVar) {
            super(2);
            this.$listener = cVar;
        }

        public final void invoke(int i, long j) {
            DownloadListener cVar = this.$listener;
            if (cVar != null) {
                cVar.mo227767a(i, j);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Long l) {
            invoke(num.intValue(), l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.ugc.effectplatform.download.IWriteDisk
    /* renamed from: a */
    public String mo227769a(FileInputStream bVar, long j, DownloadListener cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "inputStream");
        String b = FileUtils.f165113a.mo228324b(this.f164910b.getZipPath());
        if (b == null) {
            return null;
        }
        ICache a = EffectCacheManager.f164822a.mo227691a(b);
        if (a instanceof EffectDiskLruCache) {
            Effect effect = this.f164910b;
            return ((EffectDiskLruCache) a).mo227693a(effect, bVar, effect.getFile_url().getUri(), j, new C65509b(cVar));
        }
        DiskLruCache.Companion aVar = DiskLruCache.f164764h;
        String a2 = aVar.mo227659a(this.f164910b.getId() + ".zip");
        if (a != null) {
            a.mo227681a(a2, bVar);
        }
        return this.f164910b.getZipPath();
    }
}
