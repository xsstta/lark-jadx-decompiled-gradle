package com.larksuite.component.metriclogger;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.log.Log;
import java.util.Arrays;

/* renamed from: com.larksuite.component.metriclogger.j */
public class C24349j implements AbstractC24342d {
    @Override // com.larksuite.component.metriclogger.AbstractC24342d
    /* renamed from: a */
    public void mo87094a(C24345g gVar) {
        if (gVar != null) {
            StringBuilder sb = new StringBuilder((int) DynamicModule.f58006b);
            sb.append("metric id=");
            sb.append(gVar.f60045f);
            sb.append("; type=");
            sb.append(gVar.f60044e);
            sb.append("; domains=");
            sb.append(Arrays.toString(gVar.f60043d));
            if (gVar.f60041b != 0) {
                sb.append("; timestamp=");
                sb.append(gVar.f60041b);
            }
            if (gVar.f60042c != null) {
                sb.append("; tracingId=");
                sb.append(gVar.f60042c);
            }
            if (gVar.f60048i != 0) {
                sb.append("; timer=");
                sb.append(gVar.f60048i);
            }
            if (gVar.f60047h != 0) {
                sb.append("; emitType=");
                sb.append(gVar.f60047h);
            }
            Log.m165389i("metriclogger", sb.toString());
        }
    }
}
