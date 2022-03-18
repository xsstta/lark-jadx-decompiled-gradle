package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.SharedReference;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.EffectFetcherArguments;
import com.ss.ugc.effectplatform.cache.EffectCacheManager;
import com.ss.ugc.effectplatform.cache.EffectDiskLruCache;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.download.DownloadListener;
import com.ss.ugc.effectplatform.download.DownloadManager;
import com.ss.ugc.effectplatform.download.DownloadResult;
import com.ss.ugc.effectplatform.exception.CurrentEditingException;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.task.result.EffectTaskResult;
import com.ss.ugc.effectplatform.util.EffectUtils;
import com.ss.ugc.effectplatform.util.FileUtils;
import com.ss.ugc.effectplatform.util.NetStatusChecker;
import com.ss.ugc.effectplatform.util.TextUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/ugc/effectplatform/task/EffectFetcherTask;", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "arguments", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "downloadManager", "Lcom/ss/ugc/effectplatform/download/DownloadManager;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;Lcom/ss/ugc/effectplatform/download/DownloadManager;Lcom/ss/ugc/effectplatform/EffectConfig;)V", "getArguments", "()Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "duration", "Lbytekn/foundation/concurrent/SharedReference;", "", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "fileSize", "requestedUrl", "", "unzipTime", "execute", "", "onFailed", "syncTask", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onResponse", "response", "shouldMobDownloadError", "", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.f */
public final class EffectFetcherTask extends SyncTask<EffectTaskResult> {

    /* renamed from: d */
    public static final Companion f165033d = new Companion(null);

    /* renamed from: a */
    public SharedReference<Long> f165034a = new SharedReference<>(0L);

    /* renamed from: b */
    public SharedReference<Long> f165035b = new SharedReference<>(0L);

    /* renamed from: c */
    public SharedReference<Long> f165036c = new SharedReference<>(0L);

    /* renamed from: e */
    private SharedReference<String> f165037e = new SharedReference<>(null);

    /* renamed from: f */
    private final Effect f165038f;

    /* renamed from: g */
    private final EffectFetcherArguments f165039g;

    /* renamed from: h */
    private final DownloadManager f165040h;

    /* renamed from: i */
    private final EffectConfig f165041i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/EffectFetcherTask$Companion;", "", "()V", "TAG", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.ugc.effectplatform.task.SyncTask
    /* renamed from: a */
    public void mo228250a() {
        boolean z;
        EffectFetcherTask fVar = this;
        mo228287a(fVar);
        Logger.f5760a.mo8662a("EffectFetcherTask", "download effect: " + this.f165038f.getEffect_id() + ", name: " + this.f165038f.getName() + ", uri: " + this.f165038f.getFile_url().getUri() + " start");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        if (!NetStatusChecker.f165129a.mo228351a(this.f165041i.mo227543C())) {
            mo228271a((SyncTask<EffectTaskResult>) fVar, new ExceptionResult(10011));
            return;
        }
        List<String> b = this.f165039g.mo227734b();
        List<String> list = b;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || EffectUtils.f165112a.mo228315a(this.f165038f.getFile_url())) {
            mo228271a((SyncTask<EffectTaskResult>) fVar, new ExceptionResult(10003));
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (mo228291b()) {
                mo228271a((SyncTask<EffectTaskResult>) fVar, new ExceptionResult((int) UpdateDialogStatusCode.DISMISS));
                return;
            }
            try {
                this.f165037e.mo8626a(b.get(i));
                if (TextUtils.f165135a.mo228357a(this.f165038f.getZipPath()) || TextUtils.f165135a.mo228357a(this.f165038f.getUnzipPath())) {
                    this.f165038f.setZipPath(this.f165039g.mo227735c() + FileManager.f5817a.mo8712a() + this.f165038f.getId() + ".zip");
                    this.f165038f.setUnzipPath(this.f165039g.mo227735c() + FileManager.f5817a.mo8712a() + this.f165038f.getId());
                }
                String a = this.f165037e.mo8625a();
                if (a == null) {
                    break;
                }
                DownloadManager dVar = this.f165040h;
                Long valueOf = dVar != null ? Long.valueOf(dVar.mo227770a(a, new C65535b(this, objectRef))) : null;
                if (valueOf != null && valueOf.longValue() > 0) {
                    mo228273a((SyncTask<EffectTaskResult>) this, new EffectTaskResult(this.f165038f, null));
                    return;
                }
            } catch (Exception e) {
                Logger.f5760a.mo8663a("EffectFetcherTask", "download: " + this.f165038f.getEffect_id() + ", name: " + this.f165038f.getName() + " failed, count: " + i, e);
                if (i == b.size() - 1) {
                    ExceptionResult cVar = new ExceptionResult(e);
                    cVar.mo227910a(this.f165037e.mo8625a(), "", "");
                    if (!(e instanceof CurrentEditingException)) {
                        String b2 = FileUtils.f165113a.mo228324b(this.f165038f.getZipPath());
                        if (b2 != null) {
                            ICache a2 = EffectCacheManager.f164822a.mo227691a(b2);
                            if (a2 instanceof EffectDiskLruCache) {
                                ((EffectDiskLruCache) a2).mo227694a(this.f165038f);
                            } else {
                                FileManager.f5817a.mo8731g(this.f165038f.getUnzipPath());
                                FileManager.f5817a.mo8731g(this.f165038f.getZipPath());
                            }
                        }
                    } else {
                        cVar.mo227909a("editor in currently editing!");
                    }
                    mo228271a((SyncTask<EffectTaskResult>) fVar, cVar);
                    return;
                }
            }
        }
        mo228271a((SyncTask<EffectTaskResult>) fVar, new ExceptionResult(objectRef.element));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/ugc/effectplatform/task/EffectFetcherTask$execute$fileSize$1", "Lcom/ss/ugc/effectplatform/download/DownloadListener;", "onFinish", "", "result", "Lcom/ss/ugc/effectplatform/download/DownloadResult;", "onProgress", "progress", "", "totalSize", "", "onStart", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.f$b */
    public static final class C65535b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ EffectFetcherTask f165042a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f165043b;

        @Override // com.ss.ugc.effectplatform.download.DownloadListener
        /* renamed from: a */
        public void mo227766a() {
        }

        @Override // com.ss.ugc.effectplatform.download.DownloadListener
        /* renamed from: a */
        public void mo227768a(DownloadResult eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "result");
            if (eVar.mo227788g()) {
                this.f165042a.f165035b.mo8626a(Long.valueOf(eVar.mo227783d()));
                this.f165042a.f165034a.mo8626a(Long.valueOf(eVar.mo227776a()));
                this.f165042a.f165036c.mo8626a(Long.valueOf(eVar.mo227785e()));
                return;
            }
            this.f165043b.element = (T) eVar.mo227787f();
        }

        C65535b(EffectFetcherTask fVar, Ref.ObjectRef objectRef) {
            this.f165042a = fVar;
            this.f165043b = objectRef;
        }

        @Override // com.ss.ugc.effectplatform.download.DownloadListener
        /* renamed from: a */
        public void mo227767a(int i, long j) {
            EffectFetcherTask fVar = this.f165042a;
            fVar.mo228288a(fVar, i, j);
        }
    }

    /* renamed from: a */
    private final boolean m256985a(Effect effect, ExceptionResult cVar) {
        if (cVar.mo227908a() == 10001) {
            return false;
        }
        if (effect != null && cVar.mo227908a() == 10003 && effect.getEffect_type() == 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ugc.effectplatform.task.SyncTask
    /* renamed from: a */
    public void mo228271a(SyncTask<EffectTaskResult> mVar, ExceptionResult cVar) {
        IMonitorReport a;
        String str;
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        Intrinsics.checkParameterIsNotNull(cVar, "e");
        Logger bVar = Logger.f5760a;
        Logger.m7508a(bVar, "EffectFetcherTask", "download effect: " + this.f165038f.getEffect_id() + ", name: " + this.f165038f.getName() + " failed!, error msg: " + cVar.mo227911b() + ", error code: " + cVar.mo227908a(), null, 4, null);
        super.mo228271a((SyncTask) mVar, cVar);
        if (m256985a(this.f165038f, cVar) && (a = this.f165041i.mo227572s().mo8625a()) != null) {
            EffectConfig effectConfig = this.f165041i;
            String effect_id = this.f165038f.getEffect_id();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("error_code", Integer.valueOf(cVar.mo227908a()));
            String a2 = this.f165037e.mo8625a();
            if (a2 == null) {
                a2 = "";
            }
            pairArr[1] = TuplesKt.to("download_url", a2);
            Map mapOf = MapsKt.mapOf(pairArr);
            String b = cVar.mo227911b();
            if (b != null) {
                str = b;
            } else {
                str = "";
            }
            C65510b.m256829c(a, false, effectConfig, effect_id, mapOf, str);
        }
    }

    /* renamed from: a */
    public void mo228273a(SyncTask<EffectTaskResult> mVar, EffectTaskResult aVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
        Intrinsics.checkParameterIsNotNull(aVar, "response");
        super.mo228273a((SyncTask) mVar, (Object) aVar);
        Logger bVar = Logger.f5760a;
        bVar.mo8662a("EffectFetcherTask", "download effect: " + this.f165038f.getEffect_id() + ", name: " + this.f165038f.getName() + " success");
        IMonitorReport a = this.f165041i.mo227572s().mo8625a();
        if (a != null) {
            EffectConfig effectConfig = this.f165041i;
            String effect_id = this.f165038f.getEffect_id();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("duration", this.f165034a.mo8625a());
            pairArr[1] = TuplesKt.to("unzip_time", this.f165035b.mo8625a());
            pairArr[2] = TuplesKt.to("size", this.f165036c.mo8625a());
            String a2 = this.f165037e.mo8625a();
            if (a2 == null) {
                a2 = "";
            }
            pairArr[3] = TuplesKt.to("download_url", a2);
            C65510b.m256830c(a, true, effectConfig, effect_id, MapsKt.mapOf(pairArr), null, 16, null);
        }
    }

    public EffectFetcherTask(EffectFetcherArguments bVar, DownloadManager dVar, EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(bVar, "arguments");
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f165039g = bVar;
        this.f165040h = dVar;
        this.f165041i = effectConfig;
        this.f165038f = bVar.mo227733a();
    }
}
