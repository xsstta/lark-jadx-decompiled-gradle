package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.c */
public class C12449c extends AbstractC12447a {
    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b
    public List<String> getCachedRelationSpaceIds() {
        return WikiDatabase.m51821n().mo16369m().mo47445a();
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.AbstractC12448b
    public Boolean isRelationCached(String str, String str2) {
        return Boolean.valueOf(WikiDatabase.m51821n().mo16369m().mo47455b(str, str2));
    }
}
