package com.larksuite.component.metriclogger;

import android.content.Context;
import com.larksuite.component.dto.MetricIPCData;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger.p1091a.AbstractC24335a;
import com.larksuite.component.service.IMetricManisService;
import ee.android.framework.manis.C68183b;

/* renamed from: com.larksuite.component.metriclogger.k */
public class C24350k {

    /* renamed from: a */
    private static final AbstractC24342d f60062a = new C24349j();

    /* renamed from: a */
    public static AbstractC24339c m88900a(C24341b bVar) {
        AbstractC24339c cVar;
        AbstractC24335a a = C24343e.m88858a();
        if (a != null) {
            cVar = a.metric(bVar);
        } else {
            cVar = C24343e.f60035a;
        }
        cVar.mo87075a(f60062a);
        return cVar;
    }

    /* renamed from: a */
    public static AbstractC24339c m88899a(long j, C24341b bVar) {
        AbstractC24339c cVar;
        AbstractC24335a a = C24343e.m88858a();
        if (a != null) {
            cVar = a.metricTimer(j, bVar);
        } else {
            cVar = C24343e.f60035a;
        }
        cVar.mo87075a(f60062a);
        return cVar;
    }

    /* renamed from: a */
    public static void m88901a(Context context, MetricIPCData metricIPCData) {
        IMetricManisService iMetricManisService = (IMetricManisService) C68183b.m264839a().mo237086a(context, IMetricManisService.class);
        if (iMetricManisService != null) {
            iMetricManisService.metricIPC(metricIPCData);
        }
    }
}
