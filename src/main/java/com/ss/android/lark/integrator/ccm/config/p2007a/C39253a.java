package com.ss.android.lark.integrator.ccm.config.p2007a;

import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.abtest.api.IABTestService;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.config.a.a */
public class C39253a implements AbstractC4156b.AbstractC4157a {
    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public Boolean getABTestBooleanValue(String str, boolean z) {
        Object a = m154842a(str, z);
        if (a instanceof Boolean) {
            return (Boolean) a;
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public Integer getABTestIntValue(String str, boolean z) {
        Object a = m154842a(str, z);
        if (a instanceof Integer) {
            return (Integer) a;
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public String getABTestStringValue(String str, boolean z) {
        Object a = m154842a(str, z);
        if (a instanceof String) {
            return (String) a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.ss.android.lark.abtest.api.IABTestService */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private Object m154842a(String str, boolean z) {
        try {
            Class<?> cls = Class.forName(str);
            if (AbstractC28490a.class.isAssignableFrom(cls)) {
                Object abTestValue = ((IABTestService) ApiUtils.getApi(IABTestService.class)).getAbTestValue(cls, z);
                C13479a.m54764b("DocABTest", "getABTestValue<" + cls + ">: " + abTestValue);
                return abTestValue;
            }
            C13479a.m54758a("DocABTest", "error: Class<" + str + "> doesn't inherit from class<LarkExperimentConfig>.");
            return null;
        } catch (ClassNotFoundException unused) {
            C13479a.m54758a("DocABTest", "error: Class< " + str + "> not found.");
            return null;
        }
    }
}
