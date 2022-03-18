package com.bytedance.ee.bear.middleground.feed;

import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.feed.C9416a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9491c;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedBuilder;
import com.bytedance.ee.bear.middleground.feed.export.bean.IFeed;
import com.bytedance.ee.bear.middleground.feed.p453a.C9422e;
import com.bytedance.ee.bear.middleground.feed.p453a.C9423f;
import com.bytedance.ee.bear.middleground.feed.p453a.C9424g;
import com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2;
import com.bytedance.ee.bear.service.C10917c;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.middleground.feed.b */
public class C9429b implements AbstractC9493f {
    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public void mo35934a() {
        FeedReportV2.f25356a.mo35968h();
        FeedReportV2.f25356a.mo35960b("stage_native_fragment_oncreate");
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: b */
    public void mo35940b() {
        FeedReportV2.f25356a.mo35967g();
        FeedReportV2.f25356a.mo35960b("stage_native_vc_oncreate");
        FeedReportV2.f25356a.mo35963c("stage_native_fragment_oncreate");
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public IFeed mo35932a(FeedBuilder aVar) {
        return new C9416a.C9418a().mo35891a(aVar.f25512a).mo35893a(aVar.f25514c).mo35894a(aVar.f25515d).mo35892a(aVar.f25517f).mo35890a(aVar.f25513b).mo35895a(aVar.f25516e).mo35896a();
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public void mo35936a(Map<String, Object> map) {
        FeedReportV2.f25356a.mo35957a(map);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public AbstractC9492e mo35933a(String str, C8275a aVar) {
        return new C9424g(str, aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: b */
    public AbstractC9491c mo35939b(String str, C8275a aVar) {
        return new C9430a(str, aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public void mo35935a(C10917c cVar, OfflineDoc offlineDoc) {
        C9422e.m38966a(cVar).mo35918a(offlineDoc);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public boolean mo35937a(C10917c cVar, String str) {
        return C9422e.m38966a(cVar).mo35922a(str);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9493f
    /* renamed from: a */
    public boolean mo35938a(String str, Map<String, String> map) {
        return C9423f.m39001a(str, map);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.feed.b$a */
    class C9430a extends C9424g implements AbstractC9491c {
        public C9430a(String str, C8275a aVar) {
            super(str, aVar);
        }
    }
}
