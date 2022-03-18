package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.common.C6896i;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.log.C13479a;
import java.io.Serializable;

public class ProgressiveImageProcessor extends AbsServerTransformProcessor {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.processor.ProgressiveImageProcessor$a */
    public static final class C7082a implements Serializable {
        public int height;
        public int width;

        private C7082a() {
        }
    }

    public ProgressiveImageProcessor(C7079f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    private boolean m28201a(C7082a aVar) {
        if (aVar == null || aVar.width <= 0 || aVar.height <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m28202b(AbstractC7043e eVar) {
        if (!TextUtils.isEmpty(eVar.mo27605c()) && !TextUtils.isEmpty(eVar.mo27609g())) {
            try {
                C7082a aVar = (C7082a) JSON.parseObject(eVar.mo27609g(), C7082a.class);
                if (!m28201a(aVar) || C6896i.m27268a(aVar.width, aVar.height)) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                C13479a.m54758a("DrivePlatform_Processor", "canProgressive, parse ");
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsServerTransformProcessor
    /* renamed from: a */
    public boolean mo27693a(AbstractC7043e eVar) {
        if (!eVar.mo27604b()) {
            return false;
        }
        boolean b = m28202b(eVar);
        C13479a.m54764b("DrivePlatform_Processor", "ProgressiveImageProcessor.handleTransformResult(), can progressive: " + b);
        if (b) {
            mo27691f().mo27679b().mo27390a(true);
            mo27691f().mo27679b().mo27387a(eVar.mo27605c());
            return true;
        }
        C13479a.m54764b("DrivePlatform_Processor", "not satisfy progressive processing conditions, download the origin file!!");
        return false;
    }
}
