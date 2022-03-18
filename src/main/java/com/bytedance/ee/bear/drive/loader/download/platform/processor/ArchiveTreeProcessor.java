package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.util.p702e.C13657b;

public class ArchiveTreeProcessor extends AbsServerTransformProcessor {
    public ArchiveTreeProcessor(C7079f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsServerTransformProcessor
    /* renamed from: a */
    public boolean mo27693a(AbstractC7043e eVar) {
        String str = (String) C13657b.m55418a(eVar.mo27609g(), "");
        if (TextUtils.isEmpty(str)) {
            Log.w("ArchiveTreeProcessor", "checkReadyResult() extra is empty");
            return false;
        }
        mo27691f().mo27679b().mo27391b(str);
        return true;
    }
}
