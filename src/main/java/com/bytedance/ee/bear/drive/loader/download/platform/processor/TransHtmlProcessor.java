package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6929f;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.core.model.AbstractC6950d;
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
import com.bytedance.ee.bear.drive.view.preview.excel.C7272b;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;

public class TransHtmlProcessor extends AbsProcessor {

    /* renamed from: a */
    private AbstractC7039c.AbstractC7040a f19082a;

    /* renamed from: b */
    private C7085b f19083b;

    /* renamed from: c */
    private AbstractC6949c f19084c;

    /* renamed from: d */
    private AbstractC6993e f19085d;

    /* renamed from: e */
    private AbstractC7039c f19086e;

    /* renamed from: f */
    private IDownloader.C7022a f19087f;

    /* renamed from: g */
    private AbstractC7042d f19088g;

    /* renamed from: h */
    private DrivePriority.DownloadPriority f19089h;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m28221h() {
        this.f19083b.mo27701c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: d */
    public void mo27689d() {
        AbstractC7039c.AbstractC7040a aVar = this.f19082a;
        if (aVar != null) {
            aVar.mo27596a();
        }
    }

    /* renamed from: g */
    private AbstractC7043e m28220g() throws Throwable {
        if (!this.f19088g.mo27538c()) {
            return this.f19086e.mo27588a(this.f19084c);
        }
        AbstractC7039c.AbstractC7040a a = this.f19086e.mo27587a();
        this.f19082a = a;
        a.mo27597a(new AbstractC7039c.AbstractC7041b() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.processor.$$Lambda$TransHtmlProcessor$ObjxlxZWXTdDOqrJNObhhIgkA8 */

            @Override // com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c.AbstractC7041b
            public final void onTransformStart() {
                TransHtmlProcessor.m269439lambda$ObjxlxZWXTdDOqrJNObhhIgkA8(TransHtmlProcessor.this);
            }
        });
        return this.f19082a.mo27595a(this.f19084c);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: c */
    public IProcessor.Result mo27688c() {
        Throwable th;
        if (this.f19085d.mo27520a(this.f19084c, new AbstractC6993e.AbstractC6994a() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.processor.TransHtmlProcessor.C70831 */

            @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e.AbstractC6994a
            /* renamed from: a */
            public boolean mo27526a(AbstractC6927d dVar, String str, String str2, String str3) {
                if (C7272b.m29082a(TransHtmlProcessor.this.mo27691f().mo27678a().mo27674c(), str, str2, str3)) {
                    return false;
                }
                if (!C6892d.m27243b(TransHtmlProcessor.this.mo27691f().mo27678a().mo27674c(), str, str2) || !(dVar instanceof C6929f)) {
                    return true;
                }
                return false;
            }
        })) {
            C13479a.m54764b("TransHtmlProcessor", getClass().getSimpleName() + " hit cache successfully, end procedure.");
            mo27691f().mo27681d().mo25455c(this.f19084c);
            return IProcessor.Result.m28190a();
        }
        AbstractC7043e eVar = null;
        try {
            th = null;
            eVar = m28220g();
        } catch (Throwable th2) {
            C13479a.m54759a("TransHtmlProcessor", "TransHtmlProcessor getPreviewGetData fail. ", th2);
            th = th2.getCause();
        }
        if (eVar == null || !m28216a(eVar) || TextUtils.isEmpty(eVar.mo27605c())) {
            return m28215a(eVar, th);
        }
        return m28219d(eVar);
    }

    /* renamed from: a */
    private boolean m28216a(AbstractC7043e eVar) {
        if (eVar.mo27603a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m28217b(AbstractC7043e eVar) {
        if (mo27691f().mo27679b().mo27399o() == null) {
            C13479a.m54758a("TransHtmlProcessor", "previewEntity is null");
            return false;
        }
        if (eVar.mo27607e() > ((long) (mo27691f().mo27678a().mo27673b().mo27227i().getRender_html_file_max_size() * 1024))) {
            return true;
        }
        return false;
    }

    public TransHtmlProcessor(C7079f fVar) {
        super(fVar);
        this.f19083b = new C7085b(fVar);
        this.f19084c = fVar.mo27679b();
        this.f19085d = fVar.mo27678a().mo27676e();
        this.f19086e = fVar.mo27678a().mo27675d();
        this.f19087f = fVar.mo27681d();
        this.f19088g = fVar.mo27678a().mo27672a();
        this.f19089h = fVar.mo27678a().mo27672a().mo27536a();
    }

    /* renamed from: c */
    private boolean m28218c(AbstractC7043e eVar) {
        AbstractC6950d.C6951a o = mo27691f().mo27679b().mo27399o();
        if (o != null && !TextUtils.isEmpty(eVar.mo27609g())) {
            return C6892d.m27243b(mo27691f().mo27678a().mo27674c(), mo27691f().mo27679b().mo27373c(), o.f18799b);
        }
        C13479a.m54758a("TransHtmlProcessor", "previewEntity is null or extra is empty");
        return false;
    }

    /* renamed from: d */
    private IProcessor.Result m28219d(AbstractC7043e eVar) {
        if (m28218c(eVar)) {
            C13479a.m54764b("TransHtmlProcessor", "preview sub excel, no download");
            this.f19083b.mo27700b();
            AbstractC6949c b = mo27691f().mo27679b();
            b.mo27387a(eVar.mo27606d());
            b.mo27391b((String) C13657b.m55418a(eVar.mo27609g(), ""));
            mo27691f().mo27681d().mo25454b(b);
            return IProcessor.Result.m28190a();
        } else if (m28217b(eVar)) {
            C13479a.m54764b("TransHtmlProcessor", "trans html failed, html file is oversize: " + eVar.mo27607e());
            return IProcessor.Result.m28191a(new DriveException(ErrCode.DRIVE_FILE_OVER_SIZE));
        } else {
            C13479a.m54764b("TransHtmlProcessor", "download file directly");
            this.f19083b.mo27700b();
            this.f19084c.mo27387a((String) C13657b.m55418a(eVar.mo27605c(), ""));
            String a = this.f19086e.mo27590a(this.f19084c, RustCallback.wrap(this.f19087f), this.f19089h);
            if (!this.f19086e.mo27593b(a)) {
                return IProcessor.Result.m28191a(new DriveException(ErrCode.RUST_SUBMIT_ERROR, "Rust internal error, return key is -1"));
            }
            this.f19087f.mo25451a(a);
            return IProcessor.Result.m28190a();
        }
    }

    /* renamed from: a */
    private IProcessor.Result m28215a(AbstractC7043e eVar, Throwable th) {
        DriveException a = C7084a.m28226a(eVar, this.f19084c, th, mo27690e());
        if (!(a.getErrorCode() == ErrCode.REQUEST_TRANSFORM_CANCEL_EXP || a.getErrorCode() == ErrCode.REQUEST_TRANSFORM_SHUTDOWN_EXP)) {
            this.f19083b.mo27699a();
        }
        if (a.getErrorCode() == ErrCode.DRIVE_FILE_ZERO_SIZE) {
            return IProcessor.Result.m28192b(a);
        }
        return IProcessor.Result.m28191a(a);
    }
}
