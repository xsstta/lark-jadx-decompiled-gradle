package com.ss.android.appcenter.business.net.p1270a;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.p1265a.C27580h;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.trace.OPTrace;

/* renamed from: com.ss.android.appcenter.business.net.a.a */
public abstract class AbstractC27713a implements C27714b.AbstractC27716a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> void mo98872a(String str, C1177w<T> wVar, T t, C27700a aVar, OPMonitorCode oPMonitorCode) {
        wVar.mo5926a((Object) t);
        C28184h.m103250d(str, C27580h.m100660a());
        aVar.setMonitorCode(oPMonitorCode).timing().flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98873a(String str, String str2, C1177w wVar, C27700a aVar, OPMonitorCode oPMonitorCode) {
        wVar.mo5926a((Object) null);
        C28184h.m103248b(str, str2);
        aVar.setMonitorCode(oPMonitorCode).setErrorMessage(str2).timing().flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98871a(C27700a aVar, OPMonitorCode oPMonitorCode, ErrorResult errorResult, C27714b.C27717b bVar, String str, OPTrace oPTrace) {
        aVar.setMonitorCode(oPMonitorCode).setErrorMessage(C27580h.m100661a(bVar.f69282a, errorResult)).setErrorCode(str).tracing(oPTrace).timing().flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98870a(C27700a aVar, OPMonitorCode oPMonitorCode, SendHttpResponse sendHttpResponse, C27714b.C27717b bVar, String str, OPTrace oPTrace) {
        aVar.setMonitorCode(oPMonitorCode).setErrorMessage(C27580h.m100664a(bVar.f69282a, bVar.f69283b, sendHttpResponse.json_body, sendHttpResponse.http_status_code.intValue())).setErrorCode(str).tracing(oPTrace).timing().flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98874a(String str, String str2, Throwable th, C1177w wVar, C27700a aVar, OPMonitorCode oPMonitorCode) {
        wVar.mo5926a((Object) null);
        C28184h.m103247a(str, str2, th);
        aVar.setMonitorCode(oPMonitorCode).setError(th).setErrorMessage(str2).timing().flush();
    }
}
