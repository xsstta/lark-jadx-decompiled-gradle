package com.ss.android.lark.banner.entity.p1395a;

import com.ss.android.lark.pb.guide.PullBannerRequest;
import java.util.Map;

/* renamed from: com.ss.android.lark.banner.entity.a.b */
public class C29474b {

    /* renamed from: a */
    String f73649a;

    /* renamed from: b */
    Map<String, String> f73650b;

    /* renamed from: a */
    public PullBannerRequest.C49786a mo104435a() {
        PullBannerRequest.C49786a aVar = new PullBannerRequest.C49786a();
        aVar.mo173314a(BannerSceneMapper.f73648b.mo104434a(this.f73649a));
        Map<String, String> map = this.f73650b;
        if (map != null) {
            aVar.mo173315a(map);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo104436a(Map<String, String> map) {
        this.f73650b = map;
    }

    public C29474b(String str) {
        this.f73649a = str;
    }
}
