package com.bytedance.ee.bear.drive.preload;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6930g;
import com.bytedance.ee.bear.drive.config.strategy.C6933j;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.C7003b;
import com.bytedance.ee.bear.drive.loader.download.C7004c;
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
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.C6990b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.preload.C7111b;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.preload.b */
public class C7111b {

    /* renamed from: a */
    public C10917c f19148a;

    /* renamed from: b */
    public Context f19149b;

    /* renamed from: c */
    public C7128a f19150c;

    /* renamed from: d */
    public List<C7113a> f19151d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public C7116d f19152e;

    /* renamed from: f */
    private C6923a f19153f;

    /* renamed from: c */
    private boolean m28461c() {
        for (C7113a aVar : this.f19151d) {
            if (aVar.f19155b != 4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m28460b() {
        C13479a.m54764b("DrivePreloadExecutor", "cancelScrollTask start()");
        for (C7113a aVar : this.f19151d) {
            if (aVar.f19155b == 4) {
                aVar.mo27838a();
            }
        }
        C13479a.m54764b("DrivePreloadExecutor", "cancelScrollTask end()");
    }

    /* renamed from: a */
    public void mo27837a() {
        C13479a.m54764b("DrivePreloadExecutor", "cancelAllTask start()");
        for (C7113a aVar : this.f19151d) {
            aVar.mo27838a();
        }
        C13479a.m54764b("DrivePreloadExecutor", "cancelAllTask end()");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.preload.b$a */
    public class C7113a {

        /* renamed from: a */
        public AbstractC6927d f19154a;

        /* renamed from: b */
        public int f19155b;

        /* renamed from: c */
        public C6880a f19156c;

        /* renamed from: d */
        public List<String> f19157d;

        /* renamed from: f */
        private ConcurrentLinkedQueue<DriveOfflineDoc> f19159f;

        /* renamed from: g */
        private int f19160g;

        /* renamed from: h */
        private AtomicInteger f19161h;

        /* renamed from: i */
        private AtomicBoolean f19162i;

        /* renamed from: j */
        private C68289a f19163j;

        /* renamed from: k */
        private AbstractC7095c f19164k;

        /* renamed from: l */
        private AbstractC7064c<FileInfoV1Puller.Params, C7086a> f19165l;

        /* renamed from: m */
        private IDownloader f19166m;

        /* renamed from: n */
        private C6923a f19167n;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m28467a(C7086a aVar) throws Exception {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m28469a(Boolean bool) throws Exception {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ void m28472b(Boolean bool) throws Exception {
        }

        /* renamed from: a */
        public synchronized void mo27838a() {
            if (this.f19162i.get()) {
                C13479a.m54764b("DrivePreloadExecutor", "current task is shutdown, preload type=" + this.f19155b + " obj=" + this);
                return;
            }
            this.f19163j.mo237935a();
            this.f19159f.clear();
            C7045g.m28051a(this.f19157d);
            if (C7111b.this.f19152e != null) {
                C7111b.this.f19152e.mo27848a();
            }
            this.f19162i.set(true);
            C7111b.this.f19151d.remove(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m28473b(Throwable th) throws Exception {
            C13479a.m54761a("DrivePreloadExecutor", th);
            mo27841a(false);
        }

        /* renamed from: a */
        public void mo27839a(DriveOfflineDoc driveOfflineDoc) {
            if (driveOfflineDoc == null) {
                C13479a.m54757a("preloadDrive == null");
                return;
            }
            boolean z = true;
            if (C6880a.m27065a().mo27076a(C6880a.m27076a(driveOfflineDoc.mo20396a()), true) == null) {
                z = false;
            }
            if (z) {
                C13479a.m54772d("DrivePreloadExecutor", "drive preload has cache. return. ");
                mo27841a(false);
                return;
            }
            C13479a.m54764b("DrivePreloadExecutor", "startPreloadTask...");
            this.f19163j.mo237937a(this.f19165l.mo26542a(new FileInfoV1Puller.Params(driveOfflineDoc.mo20396a(), null, driveOfflineDoc.mo20397b(), this.f19154a.mo27238a(), this.f19154a.mo27241a((String) null), null)).mo238004b(C11678b.m48478b()).mo237985a(C11678b.m48478b()).mo238005b($$Lambda$b$a$5QeIiRdMvx3_M2iSSTghfADUlNg.INSTANCE).mo238001b(new Consumer(driveOfflineDoc) {
                /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$a$14BUlFmixDuSC0erxkX1d_WJPxc */
                public final /* synthetic */ DriveOfflineDoc f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7111b.C7113a.this.m28471b(this.f$1, (C7086a) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$a$gxaMF0vJAM8GNXBpwfJAWfkQLo */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7111b.C7113a.this.m28473b((C7111b.C7113a) ((Throwable) obj));
                }
            }));
        }

        /* renamed from: a */
        public synchronized void mo27841a(boolean z) {
            if (z) {
                this.f19161h.incrementAndGet();
            }
            int i = this.f19161h.get();
            if (i < this.f19160g) {
                if (!this.f19159f.isEmpty()) {
                    mo27839a(this.f19159f.poll());
                }
            }
            C13479a.m54764b("DrivePreloadExecutor", "drive preload task done, type=" + this.f19155b + ", preload count=" + i);
            this.f19159f.clear();
            this.f19156c.mo27095g();
            C7111b.this.f19151d.remove(this);
            this.f19162i.set(true);
        }

        /* renamed from: a */
        private void m28468a(C7086a aVar, DriveOfflineDoc driveOfflineDoc) {
            this.f19163j.mo237937a(AbstractC68307f.m265083a(aVar).mo237985a(C11678b.m48478b()).mo238014c(new Function(driveOfflineDoc) {
                /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$a$tSN2RwqIMRBmz9HItQ7EQAYCQU */
                public final /* synthetic */ DriveOfflineDoc f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C7111b.C7113a.this.m28465a(this.f$1, (C7086a) obj);
                }
            }).mo238001b($$Lambda$b$a$xSddpCxEkYhwDnSr6Wm4TZxhNo.INSTANCE, new Consumer(driveOfflineDoc) {
                /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$a$Sl5nhpOt2z1q8gIinAY_cM2nNY */
                public final /* synthetic */ DriveOfflineDoc f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7111b.C7113a.this.m28466a((C7111b.C7113a) this.f$1, (DriveOfflineDoc) ((Throwable) obj));
                }
            }));
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m28471b(DriveOfflineDoc driveOfflineDoc, C7086a aVar) throws Exception {
            if (!this.f19164k.mo27714c(aVar.mo27322a().mo27364g(), null)) {
                m28468a(aVar, driveOfflineDoc);
            } else if (C7111b.this.f19152e.mo27847a(aVar) == C7116d.f19176b) {
                m28468a(aVar, driveOfflineDoc);
            } else {
                mo27841a(true);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ AbstractC70020b m28465a(final DriveOfflineDoc driveOfflineDoc, final C7086a aVar) throws Exception {
            C7111b.this.f19150c.mo27874a(aVar, 4);
            if (!this.f19154a.mo27243a(aVar.mo27322a().f18787c, aVar.mo27322a().mo27364g())) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.PRELOAD_SIZE_TOO_LARGE));
            }
            String absolutePath = this.f19154a.mo27239a(C7111b.this.f19149b, aVar.mo27322a().f18787c).getAbsolutePath();
            final String a = this.f19154a.mo27240a(aVar);
            final String g = aVar.mo27322a().mo27364g();
            aVar.mo27334d(new File(absolutePath, a).getAbsolutePath());
            return this.f19166m.mo27581b(C7090c.m28237a(aVar), new IDownloader.C7022a<C7086a>() {
                /* class com.bytedance.ee.bear.drive.preload.C7111b.C7113a.C71141 */

                /* renamed from: f */
                private boolean f19173f;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m28478a(Boolean bool) throws Exception {
                    C7113a.this.mo27841a(true);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m28479a(Throwable th) throws Exception {
                    C13479a.m54761a("DrivePreloadExecutor", th);
                    C7113a.this.mo27841a(true);
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: b */
                public void mo25454b(AbstractC6949c<C7086a> cVar) {
                    C13479a.m54764b("DrivePreloadExecutor", "onServerTransform");
                    C7113a.this.mo27841a(false);
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: a */
                public void mo25449a(AbstractC6949c<C7086a> cVar) {
                    C13479a.m54764b("DrivePreloadExecutor", "onNoDownloadCompleted");
                    C7113a.this.mo27841a(false);
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: c */
                public void mo25455c(AbstractC6949c<C7086a> cVar) {
                    mo25453a((String) null, cVar.mo27371a().mo27322a().f19098q);
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: a */
                public void mo25450a(DriveException driveException) {
                    C7113a.this.m28466a(driveException, driveOfflineDoc);
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: a */
                public void mo25451a(String str) {
                    C7113a.this.f19157d.add(str);
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: a */
                public void mo25452a(String str, int i) {
                    C13479a.m54758a("DrivePreloadExecutor", "rust on failed, key=" + str + " errorCode=" + i);
                    C7111b.this.f19150c.mo27875a(aVar, i, 4);
                    if (!this.f19173f) {
                        this.f19173f = true;
                        C7113a.this.mo27841a(true);
                    }
                }

                @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
                /* renamed from: a */
                public void mo25453a(String str, String str2) {
                    int i;
                    if (this.f19173f) {
                        C13479a.m54764b("DrivePreloadExecutor", "mIsDone before");
                        return;
                    }
                    this.f19173f = true;
                    if (!TextUtils.isEmpty(str)) {
                        C13479a.m54764b("DrivePreloadExecutor", "download done");
                        if (aVar.mo27345l() == 2) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        C7113a.this.f19156c.mo27081a(i, a, aVar.mo27343j(), aVar.mo27322a().f18785a, g, aVar.mo27333d(), C7113a.this.f19154a.mo27245b(), aVar.mo27322a().f19098q, aVar.mo27322a().mo27358a(), aVar.mo27339f(), aVar.mo27351r(), aVar.mo27322a().f18791g).mo238004b(C11678b.m48479c()).mo238001b(new Consumer() {
                            /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$a$1$CmDX7M4P6B0Foil2SGCMs5XN8gs */

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C7111b.C7113a.C71141.this.m28478a((C7111b.C7113a.C71141) ((Boolean) obj));
                            }
                        }, new Consumer() {
                            /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$a$1$dHYarjgHBFgBeSdRNmK7e1plHZ8 */

                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                C7111b.C7113a.C71141.this.m28479a((C7111b.C7113a.C71141) ((Throwable) obj));
                            }
                        });
                        return;
                    }
                    C13479a.m54764b("DrivePreloadExecutor", "download hit cache");
                    C7113a.this.mo27841a(true);
                }
            });
        }

        /* renamed from: a */
        public void m28466a(Throwable th, DriveOfflineDoc driveOfflineDoc) {
            DriveException driveException;
            if (th instanceof DriveException) {
                driveException = (DriveException) th;
            } else {
                driveException = null;
            }
            if (driveException == null || !(driveException.getErrorCode() == ErrCode.PRELOAD_SIZE_TOO_LARGE || driveException.getErrorCode() == ErrCode.DRIVE_FILE_NOT_SUPPORT_PREVIEW || driveException.getErrorCode() == ErrCode.PERMISSION_DENIED || driveException.getErrorCode() == ErrCode.POLICY_DENIED || driveException.getErrorCode() == ErrCode.COPY_TIMEOUT || driveException.getErrorCode() == ErrCode.COPY_FAILED)) {
                C13479a.m54761a("DrivePreloadExecutor", th);
                C7004c.m27898a(C7111b.this.f19150c, th, driveOfflineDoc.mo20396a(), 4);
                mo27841a(true);
            } else {
                C13479a.m54775e("DrivePreloadExecutor", "preload error, but can continue cal, error=" + driveException);
                mo27841a(false);
            }
            if (driveException == null) {
                return;
            }
            if (driveException.getErrorCode() == ErrCode.OWNER_DELETED_FILE || driveException.getErrorCode() == ErrCode.FILE_NOT_FOUND) {
                ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31515c(driveOfflineDoc.mo20396a()).mo238001b($$Lambda$b$a$753mXycipiUzve7Zt8C2FjXnnss.INSTANCE, $$Lambda$b$a$FTcEQYpBbVwyPKJ2MbP3ue2y2V0.INSTANCE);
            }
        }

        private C7113a(int i, ConcurrentLinkedQueue<DriveOfflineDoc> concurrentLinkedQueue) {
            this.f19161h = new AtomicInteger();
            this.f19162i = new AtomicBoolean();
            this.f19163j = new C68289a();
            this.f19157d = new CopyOnWriteArrayList();
            C6920b f = C6920b.m27342f();
            this.f19167n = f.mo27168c();
            if (i == 4) {
                this.f19154a = f.mo27165a(C6933j.class);
            } else {
                this.f19154a = f.mo27165a(C6930g.class);
            }
            this.f19156c = f.mo27170e();
            this.f19164k = f.mo27169d();
            this.f19155b = i;
            this.f19159f = concurrentLinkedQueue;
            this.f19160g = C7111b.this.mo27835a(i);
            this.f19165l = C7058b.m28085a((NetService) KoinJavaComponent.m268610a(NetService.class));
            C6920b.m27342f().mo27167b();
            this.f19166m = C7078e.m28152a(new C7023a(C7111b.this.f19148a), new C7003b(this.f19154a), new C6990b(this.f19154a));
        }
    }

    /* renamed from: a */
    public int mo27835a(int i) {
        if (i == 0) {
            return this.f19153f.mo27222e();
        }
        if (i != 1) {
            if (i == 2) {
                return this.f19153f.mo27220d();
            }
            if (i == 3) {
                return this.f19153f.mo27218c();
            }
            if (i != 4) {
                return 0;
            }
        }
        return this.f19153f.mo27215b();
    }

    public C7111b(Context context, C10917c cVar) {
        this.f19148a = cVar;
        this.f19149b = context;
        C6920b f = C6920b.m27342f();
        this.f19153f = f.mo27168c();
        this.f19150c = f.mo27167b();
        this.f19152e = new C7116d(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m28459b(int i, ArrayList arrayList) throws Exception {
        if (i == 4) {
            if (m28461c()) {
                return true;
            }
            m28460b();
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(arrayList);
        C7113a aVar = new C7113a(i, concurrentLinkedQueue);
        this.f19151d.add(aVar);
        aVar.mo27839a((DriveOfflineDoc) concurrentLinkedQueue.poll());
        return true;
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27836a(int i, ArrayList<DriveOfflineDoc> arrayList) {
        if (!C5084ad.m20847d().mo20038b().mo20042c()) {
            C13479a.m54775e("DrivePreloadExecutor", "preload file ignore, current wifi not connected");
            return AbstractC68307f.m265083a((Object) false);
        } else if (!((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a()) {
            C13479a.m54764b("DrivePreloadExecutor", "preloadFile ignore because isSuiteFileFeatureEnable=false");
            return AbstractC68307f.m265083a((Object) false);
        } else {
            C13479a.m54764b("DrivePreloadExecutor", "start preload drive file, type=" + i);
            if (CollectionUtils.isEmpty(arrayList)) {
                C13479a.m54775e("DrivePreloadExecutor", "preload file list is empty, ignore preload.");
                return AbstractC68307f.m265083a((Object) false);
            }
            C13479a.m54764b("DrivePreloadExecutor", "preload drive file size=" + arrayList.size() + " type = " + i + " config size=" + mo27835a(i));
            return AbstractC68307f.m265083a((Object) arrayList).mo237985a(C11678b.m48478b()).mo238020d(new Function(i) {
                /* class com.bytedance.ee.bear.drive.preload.$$Lambda$b$BcKvX6O42yg8ilTUVSKfgworgLI */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C7111b.this.m28459b(this.f$1, (ArrayList) obj);
                }
            });
        }
    }
}
