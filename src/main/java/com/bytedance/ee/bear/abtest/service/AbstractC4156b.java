package com.bytedance.ee.bear.abtest.service;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.abtest.service.b */
public interface AbstractC4156b {

    /* renamed from: com.bytedance.ee.bear.abtest.service.b$a */
    public interface AbstractC4157a extends AbstractC4156b {
    }

    Boolean getABTestBooleanValue(String str, boolean z);

    Integer getABTestIntValue(String str, boolean z);

    String getABTestStringValue(String str, boolean z);
}
