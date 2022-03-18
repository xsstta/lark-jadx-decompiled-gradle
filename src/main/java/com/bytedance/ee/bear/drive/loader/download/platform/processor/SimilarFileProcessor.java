package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7039c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.misc.RustCallback;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.AbstractC6993e;
import com.bytedance.ee.log.C13479a;

public class SimilarFileProcessor extends AbsProcessor {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: d */
    public void mo27689d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: c */
    public IProcessor.Result mo27688c() {
        AbstractC6949c b = mo27691f().mo27679b();
        AbstractC6993e e = mo27691f().mo27678a().mo27676e();
        AbstractC7039c d = mo27691f().mo27678a().mo27675d();
        IDownloader.C7022a d2 = mo27691f().mo27681d();
        if (e.mo27519a(b)) {
            C13479a.m54764b("DrivePlatform_Processor", getClass().getSimpleName() + " hit cache successfully, end procedure.");
            d2.mo25455c(b);
            return IProcessor.Result.m28190a();
        }
        String c = d.mo27594c(b, RustCallback.wrap(d2), mo27691f().mo27678a().mo27672a().mo27536a());
        if (!d.mo27593b(c)) {
            C13479a.m54758a("DrivePlatform_Processor", getClass().getSimpleName() + " submit rust failure, return rust key: -1");
            return IProcessor.Result.m28191a(new DriveException(ErrCode.RUST_SUBMIT_ERROR, "Rust internal error, return key is -1"));
        }
        d2.mo25451a(c);
        C13479a.m54764b("DrivePlatform_Processor", getClass().getSimpleName() + " submit rust success, return rust key: " + c);
        return IProcessor.Result.m28190a();
    }

    public SimilarFileProcessor(C7079f fVar) {
        super(fVar);
    }
}
