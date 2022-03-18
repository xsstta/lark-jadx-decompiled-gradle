package com.bytedance.ee.bear.basesdk.apisupport;

import com.bytedance.ee.bear.basesdk.api.AbstractC4393q;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.watermark.dto.WatermarkInfo;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.z */
final class C4441z implements AbstractC4393q {

    /* renamed from: a */
    private final AbstractC4431q f13098a;

    /* renamed from: b */
    private final AbstractC4393q f13099b;

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4393q
    /* renamed from: a */
    public void mo17082a(WatermarkInfo watermarkInfo) {
        C13479a.m54764b("Apisupport", "api call: updateWatermarkInfo");
        this.f13098a.mo17158a();
        this.f13099b.mo17082a(watermarkInfo);
    }

    C4441z(AbstractC4431q qVar, AbstractC4393q qVar2) {
        this.f13098a = qVar;
        this.f13099b = qVar2;
    }
}
