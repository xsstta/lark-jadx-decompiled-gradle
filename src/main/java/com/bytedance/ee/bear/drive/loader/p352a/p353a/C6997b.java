package com.bytedance.ee.bear.drive.loader.p352a.p353a;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.AbstractC7000a;
import com.bytedance.ee.bear.drive.loader.download.AbstractC7006d;
import com.bytedance.ee.bear.drive.loader.download.C7003b;
import com.bytedance.ee.bear.drive.loader.download.platform.C7078e;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7023a;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7045g;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.FileInfoV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.C6990b;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.b */
public final class C6997b {

    /* renamed from: a */
    public AbstractC7006d f18911a;

    /* renamed from: b */
    public Set<String> f18912b = new HashSet();

    /* renamed from: c */
    private long f18913c;

    /* renamed from: d */
    private AbstractC7064c<FileInfoV1Puller.Params, C7086a> f18914d;

    /* renamed from: e */
    private IDownloader f18915e;

    /* renamed from: f */
    private C68289a f18916f = new C68289a();

    /* renamed from: a */
    public void mo27531a(C7086a aVar, IFileLoader.LoadListener aVar2) {
        this.f18916f.mo237937a(AbstractC68307f.m265083a(aVar).mo237985a(C11678b.m48478b()).mo238014c(new Function(aVar2) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$scyLdThAhBqQwYN3CvDupTrEijQ */
            public final /* synthetic */ IFileLoader.LoadListener f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6997b.this.m27844a(this.f$1, (C7086a) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$b$b8o1sLxw2tIeIsds_lu7go0o1LY.INSTANCE, new Consumer(aVar, aVar2) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$0gpuwsdK68oSqVIJQ2zS5jomLPc */
            public final /* synthetic */ C7086a f$1;
            public final /* synthetic */ IFileLoader.LoadListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6997b.this.m27846a((C6997b) this.f$1, (C7086a) this.f$2, (IFileLoader.LoadListener) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    public void m27846a(Throwable th, C7086a aVar, IFileLoader.LoadListener aVar2) {
        if (th instanceof DriveException) {
            C13479a.m54758a("DRIVE_PREVIEW_FLOW_SourceExecutor", "handle download Err, errCode: " + ((DriveException) th).getErrorCode());
            try {
                aVar2.mo25511a(((DriveException) th).getErrorCode());
            } catch (Exception e) {
                C13479a.m54759a("DRIVE_PREVIEW_FLOW_SourceExecutor", "handleErr() DriveException error", e);
                aVar2.mo25511a(ErrCode.DEFAULT);
            }
        } else {
            C13479a.m54758a("DRIVE_PREVIEW_FLOW_SourceExecutor", "handleErr() no DriveException");
            aVar2.mo25511a(ErrCode.DEFAULT);
        }
    }

    /* renamed from: a */
    public void mo27529a() {
        this.f18916f.mo237935a();
        C7045g.m28051a(this.f18912b);
    }

    /* renamed from: a */
    private AbstractC68307f<C7086a> m27842a(BaseSpaceOpenEntity baseSpaceOpenEntity) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "pullFileInfo start.");
        return this.f18914d.mo26542a(new FileInfoV1Puller.Params(baseSpaceOpenEntity.getFileId(), baseSpaceOpenEntity.getMountNodeToken(), baseSpaceOpenEntity.getMountPoint(), this.f18911a.mo25751b().mo27238a(), this.f18911a.mo25751b().mo27241a(baseSpaceOpenEntity.getVersion()), baseSpaceOpenEntity.getApiExtra()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public AbstractC68307f<C7086a> m27855c(C7086a aVar) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "checkMobileNetwork start.");
        if (this.f18911a.mo25751b().mo27244a(this.f18911a.mo25752c(), C7090c.m28237a(aVar))) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "checkMobileNetwork, need user confirm.");
            return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.MOBILE_NETWORK_NOT_AUTHORIZATION, aVar));
        }
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "checkMobileNetwork end, no need confirm, continue.");
        return AbstractC68307f.m265083a(aVar);
    }

    public C6997b(AbstractC7006d dVar) {
        this.f18911a = dVar;
        this.f18914d = C7058b.m28085a((NetService) KoinJavaComponent.m268610a(NetService.class));
        this.f18915e = C7078e.m28152a(new C7023a(dVar.mo25743a()), new C7003b(dVar.mo25751b()), new C6990b(dVar.mo25751b()));
        this.f18913c = C6920b.m27342f().mo27168c().mo27227i().getDownload_origin_file_max_size() * 1024;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbstractC68307f<C7086a> m27856d(C7086a aVar) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "checkDownloadFileSize start.");
        C7086a.C7087a x = aVar.mo27322a();
        if (x == null || x.mo27359b() <= this.f18913c) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "checkDownloadFileSize end, file size normal, continue.");
            return AbstractC68307f.m265083a(aVar);
        }
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "checkDownloadFileSize, file size over limit: " + x.mo27359b());
        return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DRIVE_DOWNLOAD_FILE_OVER_SIZE, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public AbstractC68307f<Boolean> m27853b(final C7086a aVar, final IFileLoader.LoadListener aVar2) {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "downloadFile, start. please check the event callback. ");
        return this.f18915e.mo27582c(C7090c.m28237a(aVar), new AbstractC7000a(C7090c.m28237a(aVar), this.f18911a, 2, aVar2) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.C6997b.C69981 */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25450a(DriveException driveException) {
                super.mo25450a(driveException);
                C6997b.this.m27846a(driveException, aVar, aVar2);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7000a, com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: c */
            public void mo25455c(AbstractC6949c cVar) {
                super.mo25455c(cVar);
                C6997b.this.f18911a.mo25754e().mo27889a("success", "DEC0", aVar.mo27322a().f18785a, 2);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25451a(String str) {
                super.mo25451a(str);
                C6997b.this.f18912b.add(str);
                C6997b.this.f18911a.mo25754e().mo27896b(aVar.mo27322a().f18785a, "rust_download", C6997b.this.f18911a.mo25751b());
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7000a, com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25453a(String str, String str2) {
                super.mo25453a(str, str2);
                C6997b.this.f18911a.mo25754e().mo27889a("success", "DEC0", aVar.mo27322a().f18785a, 2);
            }
        });
    }

    /* renamed from: a */
    public void mo27530a(BaseSpaceOpenEntity baseSpaceOpenEntity, IFileLoader.LoadListener aVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f18916f.mo237937a(m27842a(baseSpaceOpenEntity).mo237985a(C11678b.m48481e()).mo238013c(new Consumer(aVar, baseSpaceOpenEntity) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$a21pDXMVC9hB9H1bw8gqEiyRKg */
            public final /* synthetic */ IFileLoader.LoadListener f$1;
            public final /* synthetic */ BaseSpaceOpenEntity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6997b.this.m27845a((C6997b) this.f$1, (IFileLoader.LoadListener) this.f$2, (BaseSpaceOpenEntity) ((AbstractC70022d) obj));
            }
        }).mo238005b(new Consumer(atomicReference, aVar) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$LoDIQp_69C3YjJBnoz3zLbOFXAk */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ IFileLoader.LoadListener f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6997b.this.m27850a((C6997b) this.f$1, (AtomicReference) this.f$2, (IFileLoader.LoadListener) ((C7086a) obj));
            }
        }).mo237985a(C11678b.m48478b()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$ZFB0GF2lLGv4dDJ6dzmmQKPdwI */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6997b.this.m27856d((C7086a) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$yM9GLYARczlfFyAN0qGf58AiAg */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6997b.this.m27855c((C7086a) obj);
            }
        }).mo238014c(new Function(aVar) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$TGj1_0MRannOsYaC6oC1FHv_DU */
            public final /* synthetic */ IFileLoader.LoadListener f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6997b.this.m27853b(this.f$1, (C7086a) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$b$zayOiTXEbfREbZe9vV9FqQ0c0E4.INSTANCE, new Consumer(atomicReference, baseSpaceOpenEntity, aVar) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$b$L26KOyNHRGSCyiirKcICQFsHI8 */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ BaseSpaceOpenEntity f$2;
            public final /* synthetic */ IFileLoader.LoadListener f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6997b.this.m27849a(this.f$1, this.f$2, this.f$3, (Throwable) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27845a(IFileLoader.LoadListener aVar, BaseSpaceOpenEntity baseSpaceOpenEntity, AbstractC70022d dVar) throws Exception {
        aVar.mo25427a(InfoCode.PreFetchFileInfo, null);
        this.f18911a.mo25754e().mo27896b(baseSpaceOpenEntity.getFileId(), "request_file_info", this.f18911a.mo25751b());
    }

    /* renamed from: a */
    private void m27848a(Throwable th, String str, IFileLoader.LoadListener aVar) {
        m27846a(th, new C7086a(new C7086a.C7087a("", 0, null, 0, "", false, str, "", "", 0, "", "", "", 0, 0)), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27850a(AtomicReference atomicReference, IFileLoader.LoadListener aVar, C7086a aVar2) throws Exception {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_SourceExecutor", "exe1 pull file info completed, callback fetch file info success.");
        this.f18911a.mo25754e().mo27884a("request_file_info", aVar2, this.f18911a.mo25751b());
        this.f18911a.mo25754e().mo27874a(aVar2, 2);
        atomicReference.set(aVar2);
        aVar.mo25427a(InfoCode.FileInfoSuccess, aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27849a(AtomicReference atomicReference, BaseSpaceOpenEntity baseSpaceOpenEntity, IFileLoader.LoadListener aVar, Throwable th) throws Exception {
        if (atomicReference.get() == null) {
            m27848a(th, baseSpaceOpenEntity.getFileId(), aVar);
        } else {
            m27846a(th, (C7086a) atomicReference.get(), aVar);
        }
    }
}
