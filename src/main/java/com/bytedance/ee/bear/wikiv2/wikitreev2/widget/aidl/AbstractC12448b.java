package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import java.util.List;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.aidl.b */
public interface AbstractC12448b {
    List<String> getCachedRelationSpaceIds();

    Boolean isRelationCached(String str, String str2);
}
