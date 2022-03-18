package com.larksuite.component.metriclogger_constants.domains.passport;

import com.larksuite.component.metriclogger.consts.domains.DomainAnno;
import com.larksuite.component.metriclogger_constants.domains.MainDomain;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@DomainAnno(1)
public class PassportDomain extends MainDomain {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SubDomains {
    }
}
