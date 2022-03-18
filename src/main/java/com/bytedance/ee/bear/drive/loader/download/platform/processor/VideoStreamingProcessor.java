package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.util.p702e.C13657b;

public class VideoStreamingProcessor extends AbsServerTransformProcessor {
    public VideoStreamingProcessor(C7079f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsServerTransformProcessor
    /* renamed from: a */
    public boolean mo27693a(AbstractC7043e eVar) {
        if (C13657b.m55422a(eVar.mo27608f())) {
            return false;
        }
        mo27691f().mo27679b().mo27389a(eVar.mo27608f());
        return true;
    }
}
