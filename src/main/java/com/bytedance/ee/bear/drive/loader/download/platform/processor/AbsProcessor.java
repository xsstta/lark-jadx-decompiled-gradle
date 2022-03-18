package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import com.bytedance.ee.bear.drive.core.model.AbstractC6950d;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.log.C13479a;

public abstract class AbsProcessor implements IProcessor {

    /* renamed from: a */
    private final C7079f f19062a;

    /* renamed from: b */
    private final Object f19063b = new Object();

    /* renamed from: c */
    private volatile boolean f19064c = false;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract IProcessor.Result mo27688c() throws Throwable;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo27689d();

    /* renamed from: e */
    public boolean mo27690e() {
        return this.f19064c;
    }

    /* renamed from: f */
    public C7079f mo27691f() {
        return this.f19062a;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: g */
    private void m28174g() {
        if (mo27691f().mo27680c() != null) {
            mo27691f().mo27679b().mo27386a(mo27691f().mo27680c());
        } else {
            mo27691f().mo27679b().mo27386a(new AbstractC6950d.C6951a(-1, mo27691f().mo27679b().mo27373c()));
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor
    /* renamed from: b */
    public void mo27687b() {
        C13479a.m54764b("DrivePlatform_Processor", "shutdown processor, current previewEntity: " + mo27691f().mo27680c());
        synchronized (this.f19063b) {
            if (!this.f19064c) {
                this.f19064c = true;
                mo27689d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = mo27688c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        com.bytedance.ee.log.C13479a.m54759a("DrivePlatform_Processor", getClass().getSimpleName() + " throw exception during execution. ", r0);
        r0 = com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor.Result.m28191a(new com.bytedance.ee.bear.drive.loader.model.DriveException(com.bytedance.ee.bear.drive.loader.model.ErrCode.DEFAULT, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        com.bytedance.ee.log.C13479a.m54764b("DrivePlatform_Processor", getClass().getSimpleName() + " start, current previewEntity: " + mo27691f().mo27680c());
        m28174g();
     */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor.Result mo27686a() {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor.mo27686a():com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor$Result");
    }

    public AbsProcessor(C7079f fVar) {
        this.f19062a = fVar;
    }
}
