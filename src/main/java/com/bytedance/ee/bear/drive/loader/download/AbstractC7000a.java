package com.bytedance.ee.bear.drive.loader.download;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.a */
public abstract class AbstractC7000a<FM extends AbstractC6946a> extends IDownloader.C7022a<FM> {

    /* renamed from: a */
    private static final IFileLoader.LoadListener f18928a = new IFileLoader.SimpleLoadListener();

    /* renamed from: b */
    private final AbstractC6949c<FM> f18929b;

    /* renamed from: c */
    private final WeakReference<IFileLoader.LoadListener> f18930c;

    /* renamed from: d */
    private final AbstractC7006d f18931d;

    /* renamed from: e */
    private final int f18932e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m27880a(Boolean bool) throws Exception {
    }

    /* renamed from: a */
    private IFileLoader.LoadListener m27877a() {
        IFileLoader.LoadListener aVar = this.f18930c.get();
        if (aVar != null) {
            return aVar;
        }
        C13479a.m54775e("DriveComponent", "received rust callback after cancel download");
        return f18928a;
    }

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.a$1 */
    static /* synthetic */ class C70011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18933a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader$TransStatus[] r0 = com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.TransStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.loader.download.AbstractC7000a.C70011.f18933a = r0
                com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader$TransStatus r1 = com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.TransStatus.TRANSFORM_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.loader.download.AbstractC7000a.C70011.f18933a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader$TransStatus r1 = com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.TransStatus.TRANSFORMING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.drive.loader.download.AbstractC7000a.C70011.f18933a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader$TransStatus r1 = com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.TransStatus.TRANSFORM_FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.loader.download.AbstractC7000a.C70011.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25448a(int i) {
        m27877a().mo25760a(i);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: b */
    public void mo25454b(AbstractC6949c<FM> cVar) {
        m27877a().mo25512a(cVar.mo27371a().mo27356v());
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: c */
    public void mo25455c(AbstractC6949c<FM> cVar) {
        m27877a().mo25512a(cVar.mo27371a().mo27356v());
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25449a(AbstractC6949c<FM> cVar) {
        m27877a().mo25512a(cVar.mo27371a().mo27356v());
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo27533a(IDownloader.TransStatus transStatus) {
        int i = C70011.f18933a[transStatus.ordinal()];
        if (i == 1) {
            m27877a().mo25427a(InfoCode.GenerateFinished, null);
        } else if (i == 2) {
            m27877a().mo25427a(InfoCode.Generating, null);
        } else if (i == 3) {
            m27877a().mo25427a(InfoCode.GenerateFailed, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m27878a(File file, Boolean bool) throws Exception {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW_DownCallback", "onSuccess copy file if Needed");
        String c = C6880a.m27098c(file.getCanonicalPath());
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27879a(File file, String str) throws Exception {
        int i;
        String k = this.f18929b.mo27381k();
        if (this.f18931d.mo25751b().mo27243a(file.length(), this.f18929b.mo27373c())) {
            if (this.f18929b.mo27383m() == 2) {
                i = 2;
            } else {
                i = 0;
            }
            this.f18931d.mo25752c().mo27079a(0, i, this.f18931d.mo25751b().mo27240a(this.f18929b.mo27371a()), k, this.f18929b.mo27372b(), this.f18929b.mo27373c(), this.f18929b.mo27380j(), this.f18931d.mo25751b().mo27245b(), this.f18929b.mo27375e(), this.f18929b.mo27371a().mo27322a().mo27358a(), this.f18929b.mo27382l(), "", "", this.f18929b.mo27371a().mo27351r(), false, this.f18929b.mo27379i()).mo238004b(C11678b.m48479c()).mo238001b($$Lambda$a$xhFvQf2s5bWLwGRCDZLSEacK1BY.INSTANCE, $$Lambda$a$ruypY6DuJqcao2DKMmxriNfJNqA.INSTANCE);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f18929b.mo27397e(str);
        }
        m27877a().mo25512a(this.f18929b.mo27371a().mo27356v());
        this.f18931d.mo25754e().mo27884a("rust_download", this.f18929b.mo27371a(), this.f18931d.mo25751b());
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25452a(String str, int i) {
        if (i != 401) {
            if (i != 1000) {
                if (i == 1007) {
                    m27877a().mo25511a(ErrCode.NO_NETWORK);
                } else if (i != 1024) {
                    if (i != 2003) {
                        if (i == 3002) {
                            m27877a().mo25511a(ErrCode.OWNER_DELETED_FILE);
                        } else if (i == 403) {
                            m27877a().mo25511a(ErrCode.PERMISSION_DENIED);
                        } else if (i != 404) {
                            m27877a().mo25511a(ErrCode.DEFAULT);
                        }
                    }
                    m27877a().mo25511a(ErrCode.FILE_NOT_FOUND);
                }
            }
            this.f18931d.mo25754e().mo27875a(this.f18929b.mo27371a(), i, this.f18932e);
        }
        m27877a().mo25511a(ErrCode.RUST_NOT_LOGIN);
        this.f18931d.mo25754e().mo27875a(this.f18929b.mo27371a(), i, this.f18932e);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25453a(String str, String str2) {
        this.f18929b.mo27396d(true);
        File file = new File(this.f18929b.mo27381k());
        AbstractC68307f.m265083a((Object) true).mo238020d(new Function(file) {
            /* class com.bytedance.ee.bear.drive.loader.download.$$Lambda$a$kpH92Wq4pcYQtlb9EsfFtUmapU */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC7000a.m27878a(this.f$0, (Boolean) obj);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(file) {
            /* class com.bytedance.ee.bear.drive.loader.download.$$Lambda$a$oaQbrX2Xnf4lbn3Gc1zBlsZJRA */
            public final /* synthetic */ File f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC7000a.this.m27879a((AbstractC7000a) this.f$1, (File) ((String) obj));
            }
        }, $$Lambda$a$1KdpnPFIZDiDmnLRTDsBP4eXTKo.INSTANCE);
    }

    public AbstractC7000a(AbstractC6949c<FM> cVar, IFileLoader.LoadListener aVar, AbstractC7006d dVar, int i) {
        this.f18929b = cVar;
        this.f18930c = new WeakReference<>(aVar);
        this.f18931d = dVar;
        this.f18932e = i;
    }
}
