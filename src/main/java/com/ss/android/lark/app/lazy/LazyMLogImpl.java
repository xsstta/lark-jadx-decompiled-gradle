package com.ss.android.lark.app.lazy;

import android.app.Application;
import android.content.Context;
import com.larksuite.component.metriclogger.AbstractC24339c;
import com.larksuite.component.metriclogger.C24348i;
import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger.p1091a.AbstractC24335a;
import com.larksuite.component.metriclogger.p1091a.AbstractC24336b;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.LarkContext;

public class LazyMLogImpl extends AbstractC24335a {
    public LazyMLogImpl() {
        Application application = LarkContext.getApplication();
        C24348i.m88890a(C26252ad.m94994c(application), getRustMLogPath(application));
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addDeviceIdChangeListener($$Lambda$LazyMLogImpl$CZxxuH2sbX0_bJYPxHbPX4v6Pfg.INSTANCE);
    }

    private String getRustMLogPath(Context context) {
        String str = C57881t.m224632e(context) + "/metric/";
        C26311p.m95289i(str);
        return str;
    }

    static /* synthetic */ void lambda$new$0(String str) {
        Log.m165389i("DeviceIdService", "InitMLogWorkTask onDeviceid  changed = " + str);
        C24348i.m88889a(str);
    }

    @Override // com.larksuite.component.metriclogger.p1091a.AbstractC24335a
    public AbstractC24339c metric(AbstractC24336b bVar, C24341b bVar2) {
        return bVar.mo87087a(bVar2);
    }

    @Override // com.larksuite.component.metriclogger.p1091a.AbstractC24335a
    public AbstractC24339c metricTimer(AbstractC24336b bVar, long j, C24341b bVar2) {
        return bVar.mo87086a(j, bVar2);
    }
}
