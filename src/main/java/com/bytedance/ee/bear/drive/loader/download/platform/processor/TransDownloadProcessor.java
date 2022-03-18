package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.C7084a;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.C7085b;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.RustCallback;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;

public class TransDownloadProcessor extends AbsProcessor {

    /* renamed from: a */
    private AbstractC7039c.AbstractC7040a f19074a;

    /* renamed from: b */
    private C7085b f19075b;

    /* renamed from: c */
    private AbstractC6949c f19076c;

    /* renamed from: d */
    private AbstractC6993e f19077d;

    /* renamed from: e */
    private AbstractC7039c f19078e;

    /* renamed from: f */
    private IDownloader.C7022a f19079f;

    /* renamed from: g */
    private AbstractC7042d f19080g;

    /* renamed from: h */
    private DrivePriority.DownloadPriority f19081h;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m28210h() {
        this.f19075b.mo27701c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: d */
    public void mo27689d() {
        AbstractC7039c.AbstractC7040a aVar = this.f19074a;
        if (aVar != null) {
            aVar.mo27596a();
        }
    }

    /* renamed from: g */
    private AbstractC7043e m28209g() throws Throwable {
        if (!this.f19080g.mo27538c()) {
            return this.f19078e.mo27588a(this.f19076c);
        }
        AbstractC7039c.AbstractC7040a a = this.f19078e.mo27587a();
        this.f19074a = a;
        a.mo27597a(new AbstractC7039c.AbstractC7041b() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.processor.$$Lambda$TransDownloadProcessor$b5U_772bA9twD98s3H3J9vPm3Ng */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7041b
            public final void onTransformStart() {
                TransDownloadProcessor.lambda$b5U_772bA9twD98s3H3J9vPm3Ng(TransDownloadProcessor.this);
            }
        });
        return this.f19074a.mo27595a(this.f19076c);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: c */
    public IProcessor.Result mo27688c() {
        Throwable th;
        if (this.f19077d.mo27519a(this.f19076c)) {
            C13479a.m54764b("DrivePlatform_Processor", getClass().getSimpleName() + " hit cache successfully, end procedure.");
            mo27691f().mo27681d().mo25455c(this.f19076c);
            return IProcessor.Result.m28190a();
        }
        AbstractC7043e eVar = null;
        try {
            th = null;
            eVar = m28209g();
        } catch (Throwable th2) {
            C13479a.m54759a("DrivePlatform_Processor", "TransDownloadProcessor getPreviewGetData fail. ", th2);
            th = th2.getCause();
        }
        if (eVar == null || !m28208b(eVar) || TextUtils.isEmpty(eVar.mo27605c())) {
            return mo27698a(eVar, th);
        }
        return mo27697a(eVar);
    }

    /* renamed from: b */
    private boolean m28208b(AbstractC7043e eVar) {
        if (eVar.mo27603a() == 0) {
            return true;
        }
        return false;
    }

    public TransDownloadProcessor(C7079f fVar) {
        super(fVar);
        this.f19075b = new C7085b(fVar);
        this.f19076c = fVar.mo27679b();
        this.f19077d = fVar.mo27678a().mo27676e();
        this.f19078e = fVar.mo27678a().mo27675d();
        this.f19079f = fVar.mo27681d();
        this.f19080g = fVar.mo27678a().mo27672a();
        this.f19081h = fVar.mo27678a().mo27672a().mo27536a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IProcessor.Result mo27697a(AbstractC7043e eVar) {
        this.f19075b.mo27700b();
        this.f19076c.mo27391b((String) C13657b.m55418a(eVar.mo27609g(), ""));
        this.f19076c.mo27387a((String) C13657b.m55418a(eVar.mo27605c(), ""));
        String a = this.f19078e.mo27590a(this.f19076c, RustCallback.wrap(this.f19079f), this.f19081h);
        if (!this.f19078e.mo27593b(a)) {
            return IProcessor.Result.m28191a(new DriveException(ErrCode.RUST_SUBMIT_ERROR, "Rust internal error, return key is -1"));
        }
        this.f19079f.mo25451a(a);
        return IProcessor.Result.m28190a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IProcessor.Result mo27698a(AbstractC7043e eVar, Throwable th) {
        DriveException a = C7084a.m28226a(eVar, this.f19076c, th, mo27690e());
        if (!(a.getErrorCode() == ErrCode.REQUEST_TRANSFORM_CANCEL_EXP || a.getErrorCode() == ErrCode.REQUEST_TRANSFORM_SHUTDOWN_EXP)) {
            this.f19075b.mo27699a();
        }
        if (a.getErrorCode() == ErrCode.DRIVE_FILE_ZERO_SIZE) {
            return IProcessor.Result.m28192b(a);
        }
        return IProcessor.Result.m28191a(a);
    }
}
