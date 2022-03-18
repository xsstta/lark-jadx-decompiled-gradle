package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.feed.export.bean.f */
public interface AbstractC9493f {
    /* renamed from: a */
    IFeed mo35932a(FeedBuilder aVar);

    /* renamed from: a */
    AbstractC9492e mo35933a(String str, C8275a aVar);

    /* renamed from: a */
    void mo35934a();

    /* renamed from: a */
    void mo35935a(C10917c cVar, OfflineDoc offlineDoc);

    /* renamed from: a */
    void mo35936a(Map<String, Object> map);

    /* renamed from: a */
    boolean mo35937a(C10917c cVar, String str);

    /* renamed from: a */
    boolean mo35938a(String str, Map<String, String> map);

    /* renamed from: b */
    AbstractC9491c mo35939b(String str, C8275a aVar);

    /* renamed from: b */
    void mo35940b();
}
