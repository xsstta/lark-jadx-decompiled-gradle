package com.larksuite.component.metriclogger.p1091a;

import com.larksuite.component.metriclogger.AbstractC24339c;
import com.larksuite.component.metriclogger.consts.domains.C24341b;

/* renamed from: com.larksuite.component.metriclogger.a.a */
public abstract class AbstractC24335a {
    private AbstractC24336b mLogAccess;

    public abstract AbstractC24339c metric(AbstractC24336b bVar, C24341b bVar2);

    public abstract AbstractC24339c metricTimer(AbstractC24336b bVar, long j, C24341b bVar2);

    public void setLogAccess(AbstractC24336b bVar) {
        this.mLogAccess = bVar;
    }

    public AbstractC24339c metric(C24341b bVar) {
        return metric(this.mLogAccess, bVar);
    }

    public AbstractC24339c metricTimer(long j, C24341b bVar) {
        return metricTimer(this.mLogAccess, j, bVar);
    }
}
