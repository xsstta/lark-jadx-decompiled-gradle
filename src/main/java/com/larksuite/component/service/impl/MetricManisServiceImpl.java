package com.larksuite.component.service.impl;

import android.content.Context;
import com.larksuite.component.dto.MetricIPCData;
import com.larksuite.component.metriclogger.AbstractC24339c;
import com.larksuite.component.metriclogger.C24350k;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.service.IMetricManisService;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RemoteServiceImpl(service = IMetricManisService.class)
public class MetricManisServiceImpl implements IMetricManisService {
    private Context mContext;

    public MetricManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.larksuite.component.service.IMetricManisService
    public void metricIPC(MetricIPCData metricIPCData) {
        metricLogger(metricIPCData.mo86678b(), metricIPCData.mo86677a(), metricIPCData.mo86679c(), metricIPCData.mo86680d(), metricIPCData.mo86682e(), metricIPCData.mo86683f());
    }

    private void metricLogger(boolean z, long j, int i, int i2, List<Integer> list, Map<String, Object> map) {
        AbstractC24339c cVar;
        if (z) {
            cVar = C24350k.m88899a(j, C24341b.m88853a(i, i2, new int[0]));
        } else {
            cVar = C24350k.m88900a(C24341b.m88853a(i, i2, new int[0]));
        }
        if (cVar != null) {
            if (list != null) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    cVar.mo87078a(it.next().intValue());
                }
            }
            if (map != null) {
                for (String str : map.keySet()) {
                    cVar.mo87077a(str, map.get(str));
                }
            }
            cVar.mo87079a();
        }
    }
}
