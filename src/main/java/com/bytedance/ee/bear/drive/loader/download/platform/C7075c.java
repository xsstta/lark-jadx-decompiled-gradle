package com.bytedance.ee.bear.drive.loader.download.platform;

import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.AbstractC68309a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.c */
public class C7075c {

    /* renamed from: a */
    public final List<IProcessor> f19043a;

    /* renamed from: b */
    public DriveException f19044b;

    /* renamed from: c */
    private final IDownloader.C7022a f19045c;

    /* renamed from: d */
    private final AbstractC7077d f19046d;

    /* renamed from: a */
    private void m28141a(List<IProcessor> list) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28143c() {
        C13479a.m54764b("DrivePlatform_DownloadTask", "shutdown processor");
        for (IProcessor iProcessor : this.f19043a) {
            iProcessor.mo27687b();
        }
    }

    /* renamed from: a */
    public AbstractC68307f<Boolean> mo27670a() {
        m28141a(this.f19043a);
        return AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.C7075c.C70761 */

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(AbstractC68323g<Boolean> gVar) throws Exception {
                boolean z;
                if (!gVar.isCancelled()) {
                    for (IProcessor iProcessor : C7075c.this.f19043a) {
                        IProcessor.Result a = iProcessor.mo27686a();
                        C13479a.m54764b("DrivePlatform_DownloadTask", iProcessor.getClass().getSimpleName() + " execute completed, result: " + a.mo27694b().name());
                        boolean z2 = false;
                        if (a.mo27694b() == IProcessor.Result.Type.SUCCESS || a.mo27694b() == IProcessor.Result.Type.FAIL_AND_INTERRUPT) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (a.mo27694b() == IProcessor.Result.Type.FAIL_AND_CONTINUE || a.mo27694b() == IProcessor.Result.Type.FAIL_AND_INTERRUPT) {
                            z2 = true;
                        }
                        if (z2) {
                            C7075c.this.f19044b = a.mo27695c();
                            continue;
                        } else {
                            C7075c.this.f19044b = null;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                }
                if (!gVar.isCancelled()) {
                    C13479a.m54764b("DrivePlatform_DownloadTask", "===> all processors execute completed, task finished.");
                    C7075c.this.mo27671a(gVar);
                }
            }
        }, BackpressureStrategy.BUFFER).mo238008b((AbstractC68309a) new AbstractC68309a() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.$$Lambda$c$MkX3S977gQSct4PGCM2wGBhkQA0 */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C7075c.lambda$MkX3S977gQSct4PGCM2wGBhkQA0(C7075c.this);
            }
        });
    }

    /* renamed from: a */
    public void mo27671a(AbstractC68323g<Boolean> gVar) {
        if (!gVar.isCancelled()) {
            DriveException driveException = this.f19044b;
            if (driveException != null) {
                this.f19045c.mo25450a(driveException);
            }
            gVar.onNext(true);
            gVar.onComplete();
        }
    }

    C7075c(List<IProcessor> list, IDownloader.C7022a aVar, AbstractC7077d dVar) {
        this.f19043a = list;
        this.f19045c = aVar;
        this.f19046d = dVar;
    }
}
