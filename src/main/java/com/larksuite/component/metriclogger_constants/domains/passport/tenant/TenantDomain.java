package com.larksuite.component.metriclogger_constants.domains.passport.tenant;

import com.larksuite.component.metriclogger.consts.domains.C24341b;
import com.larksuite.component.metriclogger.consts.domains.DomainAnno;
import com.larksuite.component.metriclogger_constants.domains.passport.PassportDomain;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@DomainAnno(5)
public class TenantDomain extends PassportDomain {

    /* renamed from: a */
    public static final C24341b f60103a = new C24341b(4, 1, TenantDomain.class);

    /* renamed from: b */
    public static final C24341b f60104b = new C24341b(4, 2, TenantDomain.class);

    @Retention(RetentionPolicy.SOURCE)
    public @interface SubDomains {
    }
}
