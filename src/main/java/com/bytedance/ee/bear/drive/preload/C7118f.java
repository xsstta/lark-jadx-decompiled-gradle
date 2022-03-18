package com.bytedance.ee.bear.drive.preload;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.C6930g;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.C7078e;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.C7031b;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.imfile.FileInfoV2Puller;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.C6992d;
import com.bytedance.ee.bear.drive.preload.C7118f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.preload.f */
public class C7118f {

    /* renamed from: a */
    private C10917c f19183a;

    /* renamed from: b */
    private String f19184b;

    /* renamed from: c */
    private String f19185c;

    /* renamed from: d */
    private String f19186d;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m28510c() throws Exception {
        boolean z = false;
        if (C6880a.m27065a().mo27076a(C6880a.m27077a(this.f19184b, this.f19185c), false) == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: b */
    private AbstractC68307f<Boolean> m28508b() {
        return C7058b.m28088b((NetService) KoinJavaComponent.m268610a(NetService.class)).mo26542a(new FileInfoV2Puller.Params(this.f19184b, this.f19185c, this.f19186d)).mo237985a(C11678b.m48478b()).mo238020d($$Lambda$f$Aom8ef9uiiSEiFt3spHmGNtiwA.INSTANCE).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.preload.$$Lambda$f$zqDrTVpq4Hi8N6x5jFRXQqBdEc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7118f.this.m28505a((AbstractC6949c) obj);
            }
        });
    }

    /* renamed from: a */
    public Disposable mo27849a() {
        C13479a.m54764b("DriveSdk", "PreloadTask#execute() start， appId=" + C13721c.m55650d(this.f19184b) + ", fileId=" + C13721c.m55650d(this.f19185c) + ", authExtra=" + C13721c.m55650d(this.f19186d));
        return AbstractC68307f.m265099b((Callable) new Callable() {
            /* class com.bytedance.ee.bear.drive.preload.$$Lambda$f$8nj7TSWSLXg7kHDcUjjiJLvVZBQ */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C7118f.this.m28510c();
            }
        }).mo237998a((AbstractC68322n) $$Lambda$f$1OtRCXbM9oY5LUZXd1GpDmzK80g.INSTANCE).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48478b()).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.drive.preload.$$Lambda$f$cCP74lrLS1vN0nWfX_CuVyOP5hM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7118f.this.m28509b((Boolean) obj);
            }
        }).mo238001b($$Lambda$f$_CCkkreexpN17FCUGMaHdWng7A.INSTANCE, $$Lambda$f$9BQsEBkDJtdmfCyAM6MMkgKP00.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractC70020b m28509b(Boolean bool) throws Exception {
        C13479a.m54764b("DriveSdk", "PreloadTask#execute() start request");
        return m28508b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28506a(Boolean bool) throws Exception {
        C13479a.m54764b("DriveSdk", "PreloadTask#execute() done, result=" + bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC68307f m28505a(final AbstractC6949c cVar) throws Exception {
        return C7078e.m28152a(new C7031b(this.f19183a), new C7117e(C6920b.m27342f().mo27165a(C6930g.class)), new C6992d(C6920b.m27342f().mo27165a(C6930g.class))).mo27578a(cVar, new IDownloader.C7022a<C7088b>() {
            /* class com.bytedance.ee.bear.drive.preload.C7118f.C71191 */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25449a(AbstractC6949c<C7088b> cVar) {
                C13479a.m54758a("DriveSdk", "PreloadTask#onNoDownload()");
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: b */
            public void mo25454b(AbstractC6949c<C7088b> cVar) {
                C13479a.m54758a("DriveSdk", "PreloadTask#onServerTransform()");
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: c */
            public void mo25455c(AbstractC6949c<C7088b> cVar) {
                C13479a.m54775e("DriveSdk", "PreloadTask#onHitCache()");
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25450a(DriveException driveException) {
                C13479a.m54759a("DriveSdk", "PreloadTask, lownload error=", driveException);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m28513a(String str, Boolean bool) throws Exception {
                C13479a.m54764b("DriveSdk", "PreloadTask#onSuccess() put cache done, key=" + str);
            }

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
            /* renamed from: a */
            public void mo25453a(String str, String str2) {
                C7088b bVar = (C7088b) cVar.mo27371a();
                C6880a.m27065a().mo27080a(0, C6880a.m27077a(bVar.mo27322a().f19101m, bVar.mo27322a().f18785a), bVar.mo27343j(), bVar.mo27322a().f18785a, bVar.mo27322a().mo27364g(), bVar.mo27333d(), "1", str2, bVar.mo27322a().mo27358a(), bVar.mo27322a().f19101m, bVar.mo27322a().f18785a, bVar.mo27351r(), bVar.mo27322a().f18791g).mo238004b(C11678b.m48479c()).mo238001b(new Consumer(str) {
                    /* class com.bytedance.ee.bear.drive.preload.$$Lambda$f$1$8hOxMzTbCvDnZVVFAE5phqYj9U */
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C7118f.C71191.m28513a(this.f$0, (Boolean) obj);
                    }
                }, new Consumer<Throwable>() {
                    /* class com.bytedance.ee.bear.drive.preload.C7118f.C71191.C71201 */

                    /* renamed from: a */
                    public void accept(Throwable th) throws Exception {
                        C13479a.m54759a("DriveSdk", "PreloadTask#onSUccess() put cache error=", th);
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ boolean m28511c(Boolean bool) throws Exception {
        C13479a.m54764b("DriveSdk", "PreloadTask#execute() cached=" + bool);
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28507a(Throwable th) throws Exception {
        C13479a.m54758a("DriveSdk", "PreloadTask#execute() error=" + th);
    }

    C7118f(C10917c cVar, String str, String str2, String str3) {
        this.f19183a = cVar;
        this.f19184b = str;
        this.f19185c = str2;
        this.f19186d = str3;
    }
}
