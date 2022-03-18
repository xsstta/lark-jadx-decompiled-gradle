package com.bytedance.ee.bear.drive.loader.download.platform.processor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.C7079f;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7043e;
import com.bytedance.ee.log.C13479a;
import java.util.Objects;

public class OggFileProcessor extends AbsServerTransformProcessor {

    /* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.processor.OggFileProcessor$a */
    private static class C7081a {
        @JSONField(name = "mime_type")

        /* renamed from: a */
        public String f19073a;

        private C7081a() {
        }

        public String toString() {
            return "Extra{mineType='" + this.f19073a + '\'' + '}';
        }
    }

    public OggFileProcessor(C7079f fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.processor.AbsServerTransformProcessor
    /* renamed from: a */
    public boolean mo27693a(AbstractC7043e eVar) {
        AbstractC6949c b = mo27691f().mo27679b();
        String c = eVar.mo27605c();
        Objects.requireNonNull(c);
        b.mo27387a(c);
        C7081a aVar = (C7081a) JSON.parseObject(eVar.mo27609g(), C7081a.class);
        if (aVar == null || TextUtils.isEmpty(aVar.f19073a)) {
            C13479a.m54758a("DrivePlatform_Processor", "ogg file mimeType is empty! extra = " + aVar);
        } else {
            mo27691f().mo27679b().mo27393c(aVar.f19073a);
        }
        if (!"6".equals(mo27691f().mo27678a().mo27672a().mo27539d()) && aVar != null && "video/ogg".equalsIgnoreCase(aVar.f19073a)) {
            return true;
        }
        return false;
    }
}
