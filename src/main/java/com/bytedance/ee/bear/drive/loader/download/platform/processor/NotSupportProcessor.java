package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.IProcessor;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;

public class NotSupportProcessor extends AbsProcessor {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: d */
    public void mo27689d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsProcessor
    /* renamed from: c */
    public IProcessor.Result mo27688c() {
        return IProcessor.Result.m28192b(new DriveException(ErrCode.DRIVE_FILE_NOT_SUPPORT_PREVIEW));
    }

    public NotSupportProcessor(C7079f fVar) {
        super(fVar);
    }
}
