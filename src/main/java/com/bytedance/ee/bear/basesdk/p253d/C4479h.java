package com.bytedance.ee.bear.basesdk.p253d;

import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import javax.annotation.Nullable;

/* renamed from: com.bytedance.ee.bear.basesdk.d.h */
public final class C4479h {

    /* renamed from: a */
    private AbstractC4474e f13149a;

    /* renamed from: com.bytedance.ee.bear.basesdk.d.h$a */
    public interface AbstractC4480a {
        void onWatermarkChange(WatermarkInfo watermarkInfo);
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.d.h$b */
    private static final class C4481b {

        /* renamed from: a */
        public static final C4479h f13150a = new C4479h();
    }

    /* renamed from: b */
    public static C4479h m18489b() {
        return C4481b.f13150a;
    }

    @Nullable
    /* renamed from: a */
    public WatermarkInfo mo17247a() {
        AbstractC4474e eVar = this.f13149a;
        if (eVar != null) {
            return eVar.mo17242a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo17248a(AbstractC4474e eVar) {
        this.f13149a = eVar;
    }

    /* renamed from: a */
    public void mo17249a(AbstractC4480a aVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("registerWatermarkChangeListener, watermarkAgent null?: ");
        if (this.f13149a == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("WatermarkServiceImpl", sb.toString());
        AbstractC4474e eVar = this.f13149a;
        if (eVar != null && aVar != null) {
            eVar.mo17243a(aVar);
        }
    }
}
