package com.larksuite.component.metriclogger_constants.domains.translation;

import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.metriclogger.consts.domains.DomainAnno;
import com.larksuite.component.metriclogger_constants.domains.MainDomain;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@DomainAnno(HwBuildEx.VersionCodes.EMUI_5_1)
public class TranslationDomain extends MainDomain {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SubDomains {
    }
}
