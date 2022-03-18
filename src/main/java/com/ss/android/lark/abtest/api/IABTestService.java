package com.ss.android.lark.abtest.api;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import java.util.List;
import java.util.Set;

public interface IABTestService {
    <T> T getAbTestValue(Class<? extends AbstractC28490a> cls, boolean z);

    Set<String> getAllAbTestKeys();

    void registerExperiments(String str, List<AbstractC28490a> list);
}
