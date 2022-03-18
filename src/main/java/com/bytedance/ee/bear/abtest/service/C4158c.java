package com.bytedance.ee.bear.abtest.service;

import android.text.TextUtils;
import com.bytedance.ee.bear.abtest.service.AbstractC4156b;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.abtest.service.c */
public class C4158c extends AbstractC4155a {

    /* renamed from: a */
    private static AbstractC4156b.AbstractC4157a f12622a;

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    /* renamed from: a */
    public static void m17271a(AbstractC4156b.AbstractC4157a aVar) {
        if (f12622a == null) {
            f12622a = aVar;
        }
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public Boolean getABTestBooleanValue(String str, boolean z) {
        AbstractC4156b.AbstractC4157a aVar;
        C13479a.m54764b("DocsABTestServiceImpl", "getABTestIntValue :" + str);
        if (TextUtils.isEmpty(str) || (aVar = f12622a) == null) {
            return true;
        }
        return aVar.getABTestBooleanValue(str, z);
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public Integer getABTestIntValue(String str, boolean z) {
        AbstractC4156b.AbstractC4157a aVar;
        C13479a.m54764b("DocsABTestServiceImpl", "getABTestIntValue :" + str);
        if (TextUtils.isEmpty(str) || (aVar = f12622a) == null) {
            return null;
        }
        return aVar.getABTestIntValue(str, z);
    }

    @Override // com.bytedance.ee.bear.abtest.service.AbstractC4156b
    public String getABTestStringValue(String str, boolean z) {
        AbstractC4156b.AbstractC4157a aVar;
        C13479a.m54764b("DocsABTestServiceImpl", "getABTestIntValue :" + str);
        if (TextUtils.isEmpty(str) || (aVar = f12622a) == null) {
            return null;
        }
        return aVar.getABTestStringValue(str, z);
    }
}
