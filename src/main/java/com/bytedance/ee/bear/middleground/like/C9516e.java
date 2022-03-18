package com.bytedance.ee.bear.middleground.like;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.middleground.like.e */
public class C9516e extends C4918a implements AbstractC7945d<LikeListJsData> {
    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.util.openlikesList", this);
    }

    /* renamed from: a */
    public void handle(LikeListJsData likeListJsData, AbstractC7947h hVar) {
        C13479a.m54764b("LikeListLaunchWebService", "handle: " + likeListJsData);
        if (likeListJsData != null) {
            C9536g.m39375a().mo36378a(likeListJsData.getToken(), likeListJsData.getRefer_type(), "from_click");
        }
    }
}
