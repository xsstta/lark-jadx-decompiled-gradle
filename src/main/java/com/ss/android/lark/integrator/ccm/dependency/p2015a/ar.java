package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.basesdk.p253d.AbstractC4474e;
import com.bytedance.ee.bear.basesdk.p253d.C4479h;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.p1405e.AbstractC29559a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ar */
class ar implements AbstractC4474e {

    /* renamed from: a */
    private Context f100629a = LarkContext.getApplication();

    /* renamed from: b */
    private Map<AbstractC39295a, AbstractC29559a> f100630b = new ConcurrentHashMap();

    /* renamed from: c */
    private ICoreApi f100631c = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.ar$a */
    public interface AbstractC39295a {
        void onWatermarkInfoChanged(WatermarkInfo watermarkInfo);
    }

    @Override // com.bytedance.ee.bear.basesdk.p253d.AbstractC4474e
    /* renamed from: a */
    public WatermarkInfo mo17242a() {
        return this.f100631c.getWatermarkInfo(this.f100629a);
    }

    ar() {
    }

    /* renamed from: a */
    private void m155001a(final AbstractC39295a aVar) {
        if (aVar != null) {
            C392941 r0 = new AbstractC29559a() {
                /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.ar.C392941 */

                @Override // com.ss.android.lark.biz.core.api.p1405e.AbstractC29559a
                /* renamed from: a */
                public void mo105734a(WatermarkInfo watermarkInfo) {
                    aVar.onWatermarkInfoChanged(watermarkInfo);
                }
            };
            this.f100631c.registerWatermarkInfoChangedListener(r0);
            this.f100630b.put(aVar, r0);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.p253d.AbstractC4474e
    /* renamed from: a */
    public void mo17243a(C4479h.AbstractC4480a aVar) {
        aVar.getClass();
        m155001a(new AbstractC39295a() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.$$Lambda$kSKfEoFQHgkbVZ2rajOmXPFplJo */

            @Override // com.ss.android.lark.integrator.ccm.dependency.p2015a.ar.AbstractC39295a
            public final void onWatermarkInfoChanged(WatermarkInfo watermarkInfo) {
                C4479h.AbstractC4480a.this.onWatermarkChange(watermarkInfo);
            }
        });
    }
}
