package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.f */
public class C7044f extends IDownloader.C7022a {

    /* renamed from: a */
    private final IDownloader.C7022a f18994a;

    public C7044f(IDownloader.C7022a aVar) {
        this.f18994a = aVar;
    }

    /* renamed from: a */
    private void m28030a(Runnable runnable) {
        C11678b.m48481e().scheduleDirect(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28031b(int i) {
        this.f18994a.mo25448a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m28037d(AbstractC6949c cVar) {
        this.f18994a.mo25455c(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m28038e(AbstractC6949c cVar) {
        this.f18994a.mo25454b(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m28039f(AbstractC6949c cVar) {
        this.f18994a.mo25449a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28032b(IDownloader.TransStatus transStatus) {
        this.f18994a.mo27533a(transStatus);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25448a(int i) {
        m28030a(new Runnable(i) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$uBVz_ZafVstSj41zTjrwUXPDi5s */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.lambda$uBVz_ZafVstSj41zTjrwUXPDi5s(C7044f.this, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: c */
    public void mo25455c(AbstractC6949c cVar) {
        C13479a.m54764b("DrivePlatform_ProxyCallback", "ProxyCallback.onHitCache()");
        m28030a(new Runnable(cVar) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$Sr0oP2Oq01fXufMtSxoCHyKS3lc */
            public final /* synthetic */ AbstractC6949c f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.lambda$Sr0oP2Oq01fXufMtSxoCHyKS3lc(C7044f.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28033b(DriveException driveException) {
        this.f18994a.mo25450a(driveException);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25449a(AbstractC6949c cVar) {
        C13479a.m54764b("DrivePlatform_ProxyCallback", "ProxyCallback.onNoDownload()");
        m28030a(new Runnable(cVar) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$ZpMCwgtyFUHFwrDZTJ5hB7TqhPU */
            public final /* synthetic */ AbstractC6949c f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.lambda$ZpMCwgtyFUHFwrDZTJ5hB7TqhPU(C7044f.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28034b(String str) {
        this.f18994a.mo25451a(str);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo27533a(IDownloader.TransStatus transStatus) {
        C13479a.m54764b("DrivePlatform_ProxyCallback", "ProxyCallback.onStatusChanged() status=" + transStatus);
        m28030a(new Runnable(transStatus) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$3htw1RHEMknW0hR9dGMzZDhwpM */
            public final /* synthetic */ IDownloader.TransStatus f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.m269432lambda$3htw1RHEMknW0hR9dGMzZDhwpM(C7044f.this, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25450a(DriveException driveException) {
        C13479a.m54758a("DrivePlatform_ProxyCallback", "ProxyCallback.onFailure() exp=" + driveException);
        m28030a(new Runnable(driveException) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$3f99NQfEAyzpZh3KxX7r5gd7lFA */
            public final /* synthetic */ DriveException f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.lambda$3f99NQfEAyzpZh3KxX7r5gd7lFA(C7044f.this, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25451a(String str) {
        C13479a.m54764b("DrivePlatform_ProxyCallback", "ProxyCallback.onSubmit() key=" + str);
        m28030a(new Runnable(str) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$Yd5IzeLq7FBP1tdayvc_j3KVoVY */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.lambda$Yd5IzeLq7FBP1tdayvc_j3KVoVY(C7044f.this, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: b */
    public void mo25454b(AbstractC6949c cVar) {
        C13479a.m54764b("DrivePlatform_ProxyCallback", "ProxyCallback.onServerTransform()");
        m28030a(new Runnable(cVar) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$WhmdP2KSI2MQ3ugYxmfBOh_IZA */
            public final /* synthetic */ AbstractC6949c f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7044f.m269433lambda$WhmdP2KSI2MQ3ugYxmfBOh_IZA(C7044f.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28035b(String str, int i) {
        this.f18994a.mo25452a(str, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m28036b(String str, String str2) {
        this.f18994a.mo25453a(str, str2);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25452a(String str, int i) {
        C13479a.m54758a("DrivePlatform_ProxyCallback", "ProxyCallback.onRustFailed() key=" + str + ", code=" + i);
        m28030a(new Runnable(str, i) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$b1oZpLJHcgsw3hNWP3MAFkT65L4 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7044f.lambda$b1oZpLJHcgsw3hNWP3MAFkT65L4(C7044f.this, this.f$1, this.f$2);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader.C7022a
    /* renamed from: a */
    public void mo25453a(String str, String str2) {
        C13479a.m54764b("DrivePlatform_ProxyCallback", "ProxyCallback.onSuccess() key=" + str + ", dataVersion=" + str2);
        m28030a(new Runnable(str, str2) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.abs.$$Lambda$f$ZU3iWiXjRJzP1ujhSHxo0_oEzek */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7044f.lambda$ZU3iWiXjRJzP1ujhSHxo0_oEzek(C7044f.this, this.f$1, this.f$2);
            }
        });
    }
}
