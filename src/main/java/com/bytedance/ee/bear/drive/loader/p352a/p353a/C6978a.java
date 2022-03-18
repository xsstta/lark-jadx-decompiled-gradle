package com.bytedance.ee.bear.drive.loader.p352a.p353a;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.drive.biz.preview.pdf.StreamingCache;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.DriveFgHelper;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.AbstractC7000a;
import com.bytedance.ee.bear.drive.loader.download.AbstractC7006d;
import com.bytedance.ee.bear.drive.loader.download.C7004c;
import com.bytedance.ee.bear.drive.loader.download.p356a.C7002a;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7045g;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.api.AbstractC7064c;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7021i;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.C6978a;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6995f;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.AbstractC6987c;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.C6985a;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.C6986b;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.C6988d;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.C6989e;
import com.bytedance.ee.bear.drive.preload.C7115c;
import com.bytedance.ee.bear.drive.view.preview.excel.C7272b;
import com.bytedance.ee.bear.p409j.AbstractC7935a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a */
public class C6978a<P, FM extends AbstractC6946a> {

    /* renamed from: a */
    public AbstractC7006d f18867a;

    /* renamed from: b */
    public Set<String> f18868b;

    /* renamed from: c */
    public C6982b<P> f18869c;

    /* renamed from: d */
    public IFileLoader.LoadListener f18870d;

    /* renamed from: e */
    private C7115c f18871e;

    /* renamed from: f */
    private C68289a f18872f;

    /* renamed from: g */
    private AbstractC7935a f18873g;

    /* renamed from: h */
    private List<AbstractC6987c> f18874h;

    /* renamed from: i */
    private IDownloader f18875i;

    /* renamed from: j */
    private AbstractC7064c<P, FM> f18876j;

    /* renamed from: k */
    private AbstractC6995f<DriveCache, FM> f18877k;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a$b */
    public static class C6982b<P> {

        /* renamed from: a */
        public String f18887a;

        /* renamed from: b */
        public String f18888b;

        /* renamed from: c */
        public boolean f18889c;

        /* renamed from: d */
        public P f18890d;

        /* renamed from: e */
        private boolean f18891e;

        /* renamed from: f */
        private boolean f18892f;

        private C6982b() {
        }

        /* renamed from: b */
        public boolean mo27514b() {
            return this.f18891e;
        }

        /* renamed from: c */
        public boolean mo27516c() {
            return this.f18892f;
        }

        /* renamed from: a */
        public boolean mo27512a() {
            return this.f18889c;
        }

        /* renamed from: a */
        public void mo27510a(String str) {
            this.f18887a = str;
        }

        /* renamed from: b */
        public void mo27513b(boolean z) {
            this.f18891e = z;
        }

        /* renamed from: c */
        public void mo27515c(boolean z) {
            this.f18892f = z;
        }

        /* renamed from: a */
        public void mo27511a(boolean z) {
            this.f18889c = z;
        }
    }

    /* renamed from: a */
    public void mo27495a() {
        m27770a(true);
    }

    /* renamed from: a */
    public void mo27496a(AbstractC6949c<FM> cVar) {
        this.f18872f.mo237937a(AbstractC68307f.m265083a(cVar).mo237985a(C11678b.m48478b()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$_vjxyh38Z4GXb7OKLJd6qPoP2Y */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27785d((AbstractC6949c) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$a$FvD4Y8uRc7yj7QS4RetEeQatB9A.INSTANCE, new Consumer(cVar) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$VsWQqURmjYxPSqGIg_YzQC7yHpA */
            public final /* synthetic */ AbstractC6949c f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6978a.this.m27765a((C6978a) this.f$1, (AbstractC6949c) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: a */
    private void m27770a(boolean z) {
        AbstractC68307f<C7002a<FM>> fVar;
        C13479a.m54764b("PreviewFileExecutor", "exe1 start. enable async: " + z);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        boolean b = C5084ad.m20847d().mo20038b().mo20041b();
        if (!z) {
            fVar = AbstractC68307f.m265083a(C7002a.m27890a());
        } else {
            fVar = m27779c(b).mo238005b(new Consumer(atomicReference, b) {
                /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$PmdFJjXXoeBAv3OcWFGSYEcE7o */
                public final /* synthetic */ AtomicReference f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6978a.this.m27769a((C6978a) this.f$1, (AtomicReference) this.f$2, (boolean) ((C7002a) obj));
                }
            });
        }
        this.f18872f.mo237937a(fVar.mo237985a(C11678b.m48479c()).mo238014c(m27784d()).mo238005b(new Consumer(atomicReference) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$sShmOe01MPurQ9AtIt0K0AQZFg0 */
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6978a.this.m27778b((C6978a) this.f$1, (AtomicReference) ((AccountService.Account) obj));
            }
        }).mo238014c(new Function(atomicReference) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$vo1J4bSieMyzUa0uoZlsI7PGx_c */
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27762a((C6978a) this.f$1, (AtomicReference) ((AccountService.Account) obj));
            }
        }).mo237985a(C11678b.m48479c()).mo238005b(new Consumer(atomicReference2) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$kTNBZeFhnF6eo78Q0lKlLsf7NI */
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6978a.this.m27782c(this.f$1, (AbstractC6946a) obj);
            }
        }).mo238014c(new Function(atomicReference) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$vwUxKf50eb_jGYF_7wIiZrnwzw */
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27775b((C6978a) this.f$1, (AtomicReference) ((AbstractC6946a) obj));
            }
        }).mo238014c(new Function(atomicReference) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$ADqBIeOLpMiucB5TB2bOYvX8CLU */
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27763a((C6978a) this.f$1, (AtomicReference) ((AbstractC6946a) obj));
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$SIiSylK_goxojlQpwSEWBAoijSE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27781c((C6978a) ((AbstractC6946a) obj));
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$soDi0kxqolaHAniQwaYarVFFYuE */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27774b((C6978a) ((AbstractC6946a) obj));
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$a$DZD6j3REodv4BWj0wLVZ4ddHRc.INSTANCE, new Consumer(atomicReference2, atomicReference) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$kJBKs4lVVrvLJlCl0Atg88CTl_8 */
            public final /* synthetic */ AtomicReference f$1;
            public final /* synthetic */ AtomicReference f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6978a.this.m27768a((C6978a) this.f$1, this.f$2, (AtomicReference) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m27769a(AtomicReference atomicReference, boolean z, C7002a aVar) throws Exception {
        C13479a.m54764b("PreviewFileExecutor", "exe1 load async file info completed. result is none: " + aVar.mo27534b());
        if (!aVar.mo27534b()) {
            atomicReference.set(aVar.mo27535c());
            this.f18870d.mo25427a(InfoCode.HitCache, aVar.mo27535c());
            this.f18867a.mo25754e().mo27874a((AbstractC6946a) aVar.mo27535c(), 3);
        } else if (!z) {
            C13479a.m54764b("PreviewFileExecutor", "After loadAsyncFIle no cache and not connected, error");
            throw new DriveException(ErrCode.NO_NETWORK);
        }
    }

    /* access modifiers changed from: private */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.drive.loader.a.a.a<P, FM extends com.bytedance.ee.bear.drive.core.model.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m27768a(AtomicReference atomicReference, AtomicReference atomicReference2, Throwable th) throws Exception {
        m27767a(th, (AbstractC6946a) atomicReference.get(), atomicReference2.get() != null);
    }

    /* renamed from: a */
    public void mo27497a(Throwable th, FM fm) {
        m27767a(th, (AbstractC6946a) fm, false);
    }

    /* renamed from: a */
    private void m27767a(Throwable th, FM fm, boolean z) {
        C7004c.m27899a(this.f18867a.mo25754e(), th, this.f18869c.f18887a, 3, z);
        if (z && C7004c.m27901a(th)) {
            C13479a.m54764b("PreviewFileExecutor", "preview error but can use cache, exp = " + th);
        } else if (th instanceof DriveException) {
            C13479a.m54758a("PreviewFileExecutor", "handle download Err, errCode: " + ((DriveException) th).getErrorCode());
            try {
                int i = C69802.f18880a[((DriveException) th).getErrorCode().ordinal()];
                if (i == 1) {
                    IFileLoader.LoadListener aVar = this.f18870d;
                    InfoCode infoCode = InfoCode.FileNotChange;
                    Objects.requireNonNull(fm);
                    aVar.mo25427a(infoCode, fm);
                } else if (i != 2) {
                    this.f18870d.mo25511a(((DriveException) th).getErrorCode());
                } else {
                    IFileLoader.LoadListener aVar2 = this.f18870d;
                    InfoCode infoCode2 = InfoCode.WPS_PREVIEW;
                    Objects.requireNonNull(fm);
                    aVar2.mo25427a(infoCode2, fm);
                    this.f18870d.mo25512a(fm.mo27356v());
                }
            } catch (Exception e) {
                C13479a.m54761a("PreviewFileExecutor", e);
                this.f18870d.mo25511a(ErrCode.DEFAULT);
            }
        } else {
            this.f18870d.mo25511a(ErrCode.DEFAULT);
        }
    }

    /* renamed from: d */
    private Function<C7002a<FM>, AbstractC70020b<AccountService.Account>> m27784d() {
        return new Function() {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$QXCGSWLhd08JDdHAsDQgKo0Qku4 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27760a((C6978a) ((C7002a) obj));
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a$2 */
    public static /* synthetic */ class C69802 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18880a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.drive.loader.model.ErrCode[] r0 = com.bytedance.ee.bear.drive.loader.model.ErrCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.loader.p352a.p353a.C6978a.C69802.f18880a = r0
                com.bytedance.ee.bear.drive.loader.model.ErrCode r1 = com.bytedance.ee.bear.drive.loader.model.ErrCode.FILE_NOT_CHANGED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.loader.p352a.p353a.C6978a.C69802.f18880a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.loader.model.ErrCode r1 = com.bytedance.ee.bear.drive.loader.model.ErrCode.WPS_PREVIEW_EXP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.loader.p352a.p353a.C6978a.C69802.<clinit>():void");
        }
    }

    /* renamed from: c */
    private List<AbstractC6987c> m27780c() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new C6985a(this.f18867a.mo25751b(), this.f18867a.mo25752c()));
        arrayList.add(new C6988d(this.f18867a.mo25743a(), this.f18867a.mo25751b(), this.f18875i));
        arrayList.add(new C6986b(this.f18867a.mo25751b(), this.f18867a.mo25752c()));
        arrayList.add(new C6989e(this.f18869c.mo27512a()));
        return arrayList;
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a$a */
    public static class C6981a<P, FM extends AbstractC6946a> {

        /* renamed from: a */
        private C6982b f18881a = new C6982b();

        /* renamed from: b */
        private AbstractC7006d f18882b;

        /* renamed from: c */
        private IDownloader f18883c;

        /* renamed from: d */
        private AbstractC7064c<P, FM> f18884d;

        /* renamed from: e */
        private AbstractC6995f<DriveCache, FM> f18885e;

        /* renamed from: f */
        private IFileLoader.LoadListener f18886f;

        /* renamed from: a */
        public C6978a<P, FM> mo27507a() {
            IDownloader iDownloader;
            AbstractC7064c<P, FM> cVar;
            IFileLoader.LoadListener aVar;
            C6982b bVar;
            AbstractC7006d dVar = this.f18882b;
            if (dVar != null && (iDownloader = this.f18883c) != null && (cVar = this.f18884d) != null && (aVar = this.f18886f) != null && (bVar = this.f18881a) != null) {
                return new C6978a<>(iDownloader, dVar, cVar, this.f18885e, bVar, aVar);
            }
            throw new NullPointerException("you should setDownloadDependency");
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27499a(IFileLoader.LoadListener aVar) {
            this.f18886f = aVar;
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27500a(AbstractC6995f<DriveCache, FM> fVar) {
            this.f18885e = fVar;
            return this;
        }

        /* renamed from: b */
        public C6981a<P, FM> mo27508b(boolean z) {
            this.f18881a.mo27515c(z);
            return this;
        }

        /* renamed from: c */
        public C6981a<P, FM> mo27509c(boolean z) {
            this.f18881a.mo27513b(z);
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27501a(AbstractC7006d dVar) {
            this.f18882b = dVar;
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27502a(IDownloader iDownloader) {
            this.f18883c = iDownloader;
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27503a(AbstractC7064c<P, FM> cVar) {
            this.f18884d = cVar;
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27504a(P p) {
            this.f18881a.f18890d = p;
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27505a(String str) {
            this.f18881a.mo27510a(str);
            return this;
        }

        /* renamed from: a */
        public C6981a<P, FM> mo27506a(boolean z) {
            this.f18881a.mo27511a(z);
            return this;
        }
    }

    /* renamed from: b */
    public void mo27498b() {
        this.f18872f.mo237935a();
        C7045g.m28051a(this.f18868b);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a$c */
    public static class C6983c implements Function<AbstractC68307f<? extends Throwable>, AbstractC68307f<?>> {

        /* renamed from: a */
        IFileLoader.LoadListener f18893a;

        /* renamed from: b */
        private final int f18894b;

        /* renamed from: c */
        private int f18895c;

        /* renamed from: d */
        private final List<Integer> f18896d;

        /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.f<R>, io.reactivex.f<?> */
        /* renamed from: a */
        public AbstractC68307f<?> apply(AbstractC68307f<? extends Throwable> fVar) {
            return (AbstractC68307f<R>) fVar.mo238014c(new Function() {
                /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$c$qZpdj9CvmNg8XRD1EmuWZDFj7s */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C6978a.C6983c.this.m27811b((Throwable) obj);
                }
            });
        }

        /* renamed from: a */
        private boolean m27810a(Throwable th) {
            if (!(th instanceof DriveException) || ((DriveException) th).getErrorCode() != ErrCode.COPY_TIMEOUT) {
                return false;
            }
            return true;
        }

        public C6983c(IFileLoader.LoadListener aVar) {
            List<Integer> asList = Arrays.asList(1, 1, 1, 3, 5, 10, 15, 30);
            this.f18896d = asList;
            this.f18893a = aVar;
            this.f18894b = asList.size();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ AbstractC70020b m27811b(Throwable th) throws Exception {
            if (m27810a(th)) {
                int i = this.f18895c + 1;
                this.f18895c = i;
                if (i <= this.f18894b) {
                    if (i == 1) {
                        this.f18893a.mo25511a(ErrCode.COPPING);
                    }
                    C13479a.m54764b("PreviewFileExecutor", "pull file info failed because of drive copy! perform retry. retryCount = " + this.f18895c);
                    return AbstractC68307f.m265098b((long) this.f18896d.get(this.f18895c - 1).intValue(), TimeUnit.SECONDS);
                }
            }
            C13479a.m54764b("PreviewFileExecutor", "pull file info failed, but not because drive copy, not retry!");
            return AbstractC68307f.m265084a(th);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ AbstractC70020b m27774b(AbstractC6946a aVar) throws Exception {
        return m27785d(C7090c.m28237a(aVar));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m27760a(C7002a aVar) throws Exception {
        return this.f18873g.mo30707b().mo237988a($$Lambda$a$6pEgCWoJRi9C5S6F1w6tXgS3kMg.INSTANCE).mo238011b(AbstractC68307f.m265083a(new AccountService.Account()));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public AbstractC68307f<Boolean> m27785d(final AbstractC6949c<FM> cVar) {
        C13479a.m54764b("PreviewFileExecutor", "downloadFile, start. please check the event callback. ");
        return this.f18875i.mo27578a(cVar, new AbstractC7000a<FM>(this.f18870d, this.f18867a, 3, cVar) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.C6978a.C69791 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.drive.loader.a.a.a */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25450a(DriveException driveException) {
                super.mo25450a(driveException);
                C6978a.this.mo27497a(driveException, cVar.mo27371a());
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25451a(String str) {
                super.mo25451a(str);
                C6978a.this.f18868b.add(str);
                C6978a.this.f18867a.mo25754e().mo27896b(C6978a.this.f18869c.f18887a, "rust_download", C6978a.this.f18867a.mo25751b());
                C6978a.this.f18870d.mo25760a(0);
            }
        });
    }

    /* renamed from: c */
    private AbstractC68307f<C7002a<FM>> m27779c(boolean z) {
        return AbstractC68307f.m265083a(this.f18869c).mo238014c(new Function(z) {
            /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$jx0Frb1N8oTPXMNEDRLSkiMtCzE */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6978a.this.m27764a((C6978a) this.f$1, (boolean) ((C6978a.C6982b) obj));
            }
        }).mo238026e($$Lambda$a$tFSe9ktRDVA2zfSIgWN2y1y2qRs.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbstractC68307f<FM> m27781c(FM fm) {
        C13479a.m54764b("PreviewFileExecutor", "checkMobileNetwork start.");
        if (this.f18869c.mo27516c() || !this.f18867a.mo25751b().mo27244a(this.f18867a.mo25752c(), C7090c.m28237a(fm))) {
            C13479a.m54764b("PreviewFileExecutor", "checkMobileNetwork end, no need confirm, continue.");
            return AbstractC68307f.m265083a(fm);
        }
        C13479a.m54764b("PreviewFileExecutor", "checkMobileNetwork, need user confirm.");
        return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.MOBILE_NETWORK_NOT_AUTHORIZATION, fm));
    }

    /* renamed from: b */
    private AbstractC68307f<FM> m27773b(boolean z) {
        C13479a.m54764b("PreviewFileExecutor", "pullFileInfo start.");
        return this.f18876j.mo26542a(this.f18869c.f18890d).mo238033h(new C6983c(this.f18870d));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m27761a(Throwable th) throws Exception {
        C13479a.m54758a("PreviewFileExecutor", "loadAsyncFileInfo failure, err: " + th);
        return AbstractC68307f.m265083a(C7002a.m27890a());
    }

    /* renamed from: c */
    private boolean m27783c(AbstractC6949c<FM> cVar) {
        C6920b.m27342f().mo27168c();
        if (C7272b.m29082a(C6920b.m27342f().mo27169d(), cVar.mo27373c(), cVar.mo27380j(), cVar.mo27382l())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.drive.loader.a.a.a<P, FM extends com.bytedance.ee.bear.drive.core.model.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m27765a(AbstractC6949c cVar, Throwable th) throws Exception {
        mo27497a(th, cVar.mo27371a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m27762a(AtomicReference atomicReference, AccountService.Account account) throws Exception {
        boolean z;
        if (atomicReference.get() != null) {
            z = true;
        } else {
            z = false;
        }
        return m27773b(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m27782c(AtomicReference atomicReference, AbstractC6946a aVar) throws Exception {
        C13479a.m54764b("PreviewFileExecutor", "exe1 pull file info completed, callback fetch file info success.");
        this.f18867a.mo25754e().mo27884a("request_file_info", aVar, this.f18867a.mo25751b());
        this.f18867a.mo25754e().mo27874a(aVar, 3);
        atomicReference.set(aVar);
        this.f18870d.mo25427a(InfoCode.FileInfoSuccess, aVar);
    }

    /* renamed from: a */
    private AbstractC68307f<FM> m27758a(FM fm, FM fm2) {
        C13479a.m54764b("PreviewFileExecutor", "checkAsyncFileInfo, start.");
        if (fm != null) {
            boolean z = true;
            Iterator<AbstractC6987c> it = this.f18874h.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo27521a(C7090c.m28237a(fm), C7090c.m28237a(fm2))) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                C13479a.m54764b("PreviewFileExecutor", "checkAsyncFileInfo, file not changed.");
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.FILE_NOT_CHANGED, fm2));
            }
        }
        C13479a.m54764b("PreviewFileExecutor", "checkAsyncFileInfo end, file changed, continue.");
        return AbstractC68307f.m265083a(fm2);
    }

    /* access modifiers changed from: private */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.drive.loader.a.a.a<P, FM extends com.bytedance.ee.bear.drive.core.model.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ AbstractC70020b m27775b(AtomicReference atomicReference, AbstractC6946a aVar) throws Exception {
        return m27771b(aVar, (AbstractC6946a) atomicReference.get());
    }

    /* renamed from: b */
    private AbstractC68307f<FM> m27771b(FM fm, FM fm2) {
        boolean z;
        AbstractC6949c cVar;
        C13479a.m54764b("PreviewFileExecutor", "filterExpCase start.");
        AbstractC6949c a = C7090c.m28237a(fm);
        int h = a.mo27378h();
        long g = a.mo27377g();
        String c = a.mo27373c();
        if ((h != 5 || this.f18867a.mo25753d().mo27712a(c)) && !this.f18867a.mo25751b().mo27246b(g, c)) {
            z = false;
        } else {
            z = true;
        }
        boolean a2 = DriveFgHelper.m27375a();
        if (h == 6 || g == 0) {
            C13479a.m54775e("PreviewFileExecutor", "filterExpCase, drive file zero size!!!");
            return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DRIVE_FILE_ZERO_SIZE));
        } else if (z) {
            C13479a.m54775e("PreviewFileExecutor", "filterExpCase, drive file oversize!!!");
            return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DRIVE_FILE_OVER_SIZE));
        } else if (!a.mo27379i() || this.f18869c.mo27512a() || this.f18869c.mo27514b() || !a2) {
            C13479a.m54764b("PreviewFileExecutor", "filterExpCase end, no exp case, continue.");
            return AbstractC68307f.m265083a(fm);
        } else {
            AbstractC6949c a3 = C7090c.m28237a(fm);
            if (fm2 != null) {
                cVar = C7090c.m28237a(fm2);
            } else {
                cVar = null;
            }
            a.mo27384a(2);
            if (cVar != null && cVar.mo27379i() && TextUtils.equals(a3.mo27373c(), cVar.mo27373c())) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.FILE_NOT_CHANGED));
            }
            C13479a.m54764b("PreviewFileExecutor", "filterExpCase, drive use wps preview");
            return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.WPS_PREVIEW_EXP));
        }
    }

    /* access modifiers changed from: private */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.drive.loader.a.a.a<P, FM extends com.bytedance.ee.bear.drive.core.model.a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m27763a(AtomicReference atomicReference, AbstractC6946a aVar) throws Exception {
        return m27758a((AbstractC6946a) atomicReference.get(), aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m27778b(AtomicReference atomicReference, AccountService.Account account) throws Exception {
        C13479a.m54764b("PreviewFileExecutor", "exe1 callback pre fetch file info.");
        this.f18870d.mo25427a(InfoCode.PreFetchFileInfo, atomicReference.get());
        this.f18867a.mo25754e().mo27896b(this.f18869c.f18887a, "request_file_info", this.f18867a.mo25751b());
        this.f18867a.mo25754e().mo27896b(this.f18869c.f18887a, "dev_performance_drive_open_finish", null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m27764a(boolean z, C6982b bVar) throws Exception {
        C13479a.m54764b("PreviewFileExecutor", "loadAsyncFileInfo, read cache.");
        DriveCache a = this.f18867a.mo25752c().mo27076a(this.f18867a.mo25744a(bVar.f18887a, bVar.f18888b), true);
        boolean a2 = DriveFgHelper.m27375a();
        if (a != null) {
            return AbstractC68307f.m265083a(a).mo238020d(this.f18877k).mo238014c(new Function(bVar, a, z, a2) {
                /* class com.bytedance.ee.bear.drive.loader.p352a.p353a.$$Lambda$a$X0B5qrcdr2tQYv3oOVqP9xQlRNA */
                public final /* synthetic */ C6978a.C6982b f$1;
                public final /* synthetic */ DriveCache f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C6978a.this.m27759a(this.f$1, this.f$2, this.f$3, this.f$4, (AbstractC6946a) obj);
                }
            });
        }
        FM b = this.f18877k.mo27525b(this.f18869c.f18887a, this.f18869c.f18888b);
        if (b != null) {
            return AbstractC68307f.m265083a(C7002a.m27891a(b));
        }
        return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "loadAsyncFileInfo has not found cache"));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ AbstractC70020b m27759a(C6982b bVar, DriveCache driveCache, boolean z, boolean z2, AbstractC6946a aVar) throws Exception {
        AbstractC6949c<FM> a = C7090c.m28237a(aVar);
        if (this.f18867a.mo25753d().mo27717f(a.mo27380j(), null) && C4211a.m17514a().mo16536a("ccm.drive.pdf_linearized_enable", false)) {
            StreamingCache streamingCache = (StreamingCache) JSON.parseObject(a.mo27382l(), StreamingCache.class);
            if (streamingCache == null || !streamingCache.check()) {
                if (driveCache.mo20325b() != null) {
                    driveCache.mo20325b().exists();
                }
            } else if (bVar.f18889c) {
                C13479a.m54775e("PreviewFileExecutor", "loadAsyncFileInfo() pdf is streaming cache but in vc not usable");
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "not support local cache"));
            } else {
                C13479a.m54764b("PreviewFileExecutor", "loadAsyncFileInfo() pdf is streaming cache, data=" + streamingCache);
                a.mo27387a(streamingCache.getStreamingUrl());
                a.mo27390a(true);
                a.mo27385a(streamingCache.getPreviewFileSize());
            }
        } else if (!z) {
            if (this.f18867a.mo25753d().mo27724m(a.mo27380j(), null) && !this.f18867a.mo25753d().mo27712a(a.mo27380j())) {
                a.mo27395d(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            } else if (this.f18867a.mo25751b().mo27246b(aVar.mo27322a().f18787c, aVar.mo27322a().mo27364g())) {
                a.mo27395d(GrsBaseInfo.CountryCodeSource.UNKNOWN);
                aVar.mo27322a().mo27367j().mo27369a(5);
            } else if (this.f18867a.mo25751b().mo27242a(aVar.mo27322a().f18787c) && !C6892d.m27243b(this.f18867a.mo25753d(), aVar.mo27322a().mo27364g(), a.mo27380j())) {
                a.mo27395d(GrsBaseInfo.CountryCodeSource.UNKNOWN);
                aVar.mo27322a().mo27367j().mo27369a(6);
            } else if (C6892d.m27252j(a.mo27380j()) && !"audio/ogg".equalsIgnoreCase(aVar.mo27351r())) {
                a.mo27395d(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
        } else if (!m27783c(a)) {
            return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "not support local cache"));
        } else {
            if (this.f18867a.mo25753d().mo27724m(a.mo27380j(), null)) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "not support, local is archive"));
            }
            if (this.f18867a.mo25751b().mo27246b(a.mo27377g(), a.mo27373c())) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "not support, local is oversize"));
            }
            if (this.f18867a.mo25753d().mo27714c(a.mo27380j(), a.mo27374d())) {
                return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "not support local is video"));
            }
            if (!C6892d.m27245c(a.mo27373c()) || !z2 || !driveCache.mo20344j()) {
                if (C6892d.m27252j(a.mo27373c()) && TextUtils.isEmpty(a.mo27371a().mo27351r())) {
                    return AbstractC68307f.m265084a((Throwable) new DriveException(ErrCode.DEFAULT, "not support ogg file with empty mime type"));
                }
            } else if (this.f18869c.f18889c || this.f18869c.mo27514b()) {
                ErrCode errCode = ErrCode.DEFAULT;
                return AbstractC68307f.m265084a((Throwable) new DriveException(errCode, "not support wps cache in vcfollow mode or history model vc=" + this.f18869c.f18889c));
            } else {
                a.mo27384a(2);
                a.mo27394c(true);
            }
        }
        a.mo27392b(true);
        a.mo27394c(true);
        C13479a.m54764b("PreviewFileExecutor", "loadAsyncFileInfo success");
        return AbstractC68307f.m265083a(C7002a.m27891a(aVar));
    }

    private C6978a(IDownloader iDownloader, AbstractC7006d dVar, AbstractC7064c<P, FM> cVar, AbstractC6995f<DriveCache, FM> fVar, C6982b<P> bVar, IFileLoader.LoadListener aVar) {
        this.f18872f = new C68289a();
        this.f18868b = new HashSet();
        this.f18875i = iDownloader;
        this.f18867a = dVar;
        this.f18876j = cVar;
        this.f18877k = fVar;
        this.f18871e = new C7115c();
        this.f18873g = (AbstractC7935a) KoinJavaComponent.m268610a(AbstractC7935a.class);
        this.f18869c = bVar;
        this.f18870d = aVar;
        this.f18874h = m27780c();
        if (this.f18869c.mo27512a()) {
            this.f18875i.mo27580a(new C7021i());
        }
    }
}
