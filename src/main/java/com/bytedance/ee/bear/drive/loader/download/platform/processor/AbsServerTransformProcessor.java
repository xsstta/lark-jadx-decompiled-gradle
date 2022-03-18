package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.C7084a;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.C7085b;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.log.C13479a;

public abstract class AbsServerTransformProcessor extends AbsProcessor {

    /* renamed from: a */
    private AbstractC7039c.AbstractC7040a f19065a;

    /* renamed from: b */
    private C7085b f19066b;

    /* renamed from: c */
    private AbstractC6949c f19067c = mo27691f().mo27679b();

    /* renamed from: d */
    private AbstractC7039c f19068d = mo27691f().mo27678a().mo27675d();

    /* renamed from: e */
    private IDownloader.C7022a f19069e = mo27691f().mo27681d();

    /* renamed from: f */
    private AbstractC7042d f19070f = mo27691f().mo27678a().mo27672a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo27693a(AbstractC7043e eVar);

    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m28183h() {
        this.f19066b.mo27701c();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: d */
    public void mo27689d() {
        AbstractC7039c.AbstractC7040a aVar = this.f19065a;
        if (aVar != null) {
            aVar.mo27596a();
        }
    }

    /* renamed from: g */
    private AbstractC7043e m28182g() {
        if (!this.f19070f.mo27538c()) {
            return this.f19068d.mo27588a(this.f19067c);
        }
        AbstractC7039c.AbstractC7040a a = this.f19068d.mo27587a();
        this.f19065a = a;
        a.mo27597a(new AbstractC7039c.AbstractC7041b() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.processor.$$Lambda$AbsServerTransformProcessor$TjR6o8P1ILK7RfsDXEsWmAqi98s */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7041b
            public final void onTransformStart() {
                AbsServerTransformProcessor.lambda$TjR6o8P1ILK7RfsDXEsWmAqi98s(AbsServerTransformProcessor.this);
            }
        });
        return this.f19065a.mo27595a(this.f19067c);
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: c */
    public IProcessor.Result mo27688c() {
        Throwable th;
        AbstractC7043e eVar = null;
        try {
            th = null;
            eVar = m28182g();
        } catch (Throwable th2) {
            C13479a.m54759a("DrivePlatform_Processor", "ServerTransformProcessor getPreviewGetData fail. ", th2);
            th = th2.getCause();
        }
        if (eVar != null && m28181b(eVar)) {
            this.f19066b.mo27700b();
            boolean a = mo27693a(eVar);
            C13479a.m54764b("DrivePlatform_Processor", getClass().getSimpleName() + " checkReadyResult, check through: " + a);
            if (a) {
                this.f19069e.mo25454b(this.f19067c);
                return IProcessor.Result.m28190a();
            }
        }
        DriveException a2 = C7084a.m28226a(eVar, this.f19067c, th, mo27690e());
        if (!(a2.getErrorCode() == ErrCode.REQUEST_TRANSFORM_CANCEL_EXP || a2.getErrorCode() == ErrCode.REQUEST_TRANSFORM_SHUTDOWN_EXP)) {
            this.f19066b.mo27699a();
        }
        if (a2.getErrorCode() == ErrCode.DRIVE_FILE_ZERO_SIZE) {
            return IProcessor.Result.m28192b(a2);
        }
        return IProcessor.Result.m28191a(a2);
    }

    /* renamed from: b */
    private boolean m28181b(AbstractC7043e eVar) {
        if (eVar.mo27603a() == 0) {
            return true;
        }
        return false;
    }

    public AbsServerTransformProcessor(C7079f fVar) {
        super(fVar);
        this.f19066b = new C7085b(fVar);
    }
}
