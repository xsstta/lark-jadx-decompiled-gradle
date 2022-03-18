package com.ss.android.lark.integrator.calendar.dependency;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.dependency.idependency.IDynamicConfigModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalDynamicConfigModuleDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IDynamicConfigModuleDependency;", "()V", "mCoreApi", "Lcom/ss/android/lark/biz/core/api/ICoreApi;", "kotlin.jvm.PlatformType", "getDocsDomain", "", "tenantCode", "getDomain", "alias", "Lcom/bytedance/lark/pb/basic/v1/DomainSettings$Alias;", "getDomains", "", "getDynamicPeopleDomain", "getDynamicReportDomain", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.j */
public final class CalDynamicConfigModuleDependency implements IDynamicConfigModuleDependency {

    /* renamed from: a */
    private final ICoreApi f100513a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.calendar.dependency.idependency.IDynamicConfigModuleDependency
    /* renamed from: a */
    public String mo108232a() {
        String domain = this.f100513a.getDomain(DomainSettings.Alias.SUITE_REPORT);
        if (domain != null) {
            return domain;
        }
        return "";
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IDynamicConfigModuleDependency
    /* renamed from: b */
    public String mo108235b() {
        String domain = this.f100513a.getDomain(DomainSettings.Alias.PEOPLE);
        if (domain != null) {
            return domain;
        }
        return "";
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IDynamicConfigModuleDependency
    /* renamed from: a */
    public String mo108233a(String str) {
        String tenantDocDomain = this.f100513a.tenantDocDomain(str);
        if (tenantDocDomain != null) {
            return tenantDocDomain;
        }
        return "";
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IDynamicConfigModuleDependency
    /* renamed from: a */
    public List<String> mo108234a(DomainSettings.Alias alias) {
        Intrinsics.checkParameterIsNotNull(alias, "alias");
        List<String> domains = this.f100513a.getDomains(alias);
        if (domains != null) {
            return domains;
        }
        return new ArrayList();
    }
}
