package com.larksuite.component.metriclogger_constants.domains.translation.setting;

import com.larksuite.component.metriclogger.consts.domains.DomainAnno;
import com.larksuite.component.metriclogger_constants.domains.translation.TranslationDomain;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@DomainAnno(1)
public class TranslationSettingDomain extends TranslationDomain {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SubDomains {
    }
}
