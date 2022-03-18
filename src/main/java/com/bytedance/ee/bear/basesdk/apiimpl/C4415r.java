package com.bytedance.ee.bear.basesdk.apiimpl;

import com.bytedance.ee.bear.basesdk.api.AbstractC4393q;
import com.bytedance.ee.bear.basesdk.services.AbstractC4501b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13629i;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.r */
public class C4415r implements AbstractC4393q {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4393q
    /* renamed from: a */
    public void mo17082a(WatermarkInfo watermarkInfo) {
        if (!C13629i.m55308c()) {
            new C10917c(new C10929e()).mo41508c(AbstractC4501b.class).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.basesdk.apiimpl.$$Lambda$r$4g0j08i0GnadaXicfDVLF5VOmWs */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C4415r.m18228a(WatermarkInfo.this, (AbstractC4501b) obj);
                }
            }).mo238001b($$Lambda$r$vE86vADTpmm7plj4piorjxNI0.INSTANCE, $$Lambda$r$yFMFDXdTf0lU4bVD091j6ybLWM.INSTANCE);
        }
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40648a(watermarkInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m18228a(WatermarkInfo watermarkInfo, AbstractC4501b bVar) throws Exception {
        C13479a.m54764b("IWatermark", "updateWatermarkInfo in DocsProcessService");
        bVar.updateWatermarkInfo(watermarkInfo);
        return "";
    }
}
