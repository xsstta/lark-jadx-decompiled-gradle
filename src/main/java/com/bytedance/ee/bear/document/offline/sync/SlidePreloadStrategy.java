package com.bytedance.ee.bear.document.offline.sync;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.document.C5681c;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockModel;
import com.bytedance.ee.bear.document.offline.sync.preloadexecutor.SubBlockType;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SlidePreloadStrategy extends AbstractC5983c {

    /* access modifiers changed from: private */
    public static class ParseForSlide implements NonProguard {
        public Data0 data;

        /* access modifiers changed from: private */
        public static class Data0 implements NonProguard {
            public Data1 data;

            /* access modifiers changed from: private */
            public static class Data1 implements NonProguard {
                public Data2 data;

                /* access modifiers changed from: private */
                public static class Data2 implements NonProguard {
                    public Slide slide;

                    /* access modifiers changed from: private */
                    public static class Slide implements NonProguard {
                        public Map<String, Page> pages;

                        /* access modifiers changed from: private */
                        public static class Page implements NonProguard {
                            public Background background;
                            public Map<String, Element> elements;

                            /* access modifiers changed from: private */
                            public static class Background implements NonProguard {
                                public String fillType;
                                public BackgroundImage image;

                                /* access modifiers changed from: private */
                                public static class BackgroundImage implements NonProguard {
                                    public String url;

                                    private BackgroundImage() {
                                    }
                                }

                                private Background() {
                                }
                            }

                            /* access modifiers changed from: private */
                            public static class Element implements NonProguard {
                                public List<String> commentIds;
                                public String type;
                                public String url;

                                private Element() {
                                }
                            }

                            private Page() {
                            }
                        }

                        private Slide() {
                        }
                    }

                    private Data2() {
                    }
                }

                private Data1() {
                }
            }

            private Data0() {
            }
        }

        private ParseForSlide() {
        }
    }

    public SlidePreloadStrategy() {
        this.f16764a = "SlidePreloadStrategy";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5983c, com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        this.f16770g = account.f14592i + "_" + account.f14584a + "_" + "SLIDE_CLIENT_VARS";
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: c */
    public C5968f mo24219c(String str) {
        if (TextUtils.isEmpty(this.f16770g)) {
            return new C5968f();
        }
        C5968f d = C5955d.m24025b().mo24098d(this.f16770g, str);
        if (d == null) {
            return d;
        }
        String d2 = d.mo24137d();
        if (d2 == null || !mo24224a(d) || d.mo24152l().mo24332a()) {
            return null;
        }
        m24202a(d2, str, d);
        return d;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public JSONObject mo24216a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) "JSON");
            jSONObject.put("req_id", (Object) 1);
            jSONObject.put("tenant_id", (Object) 4);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) 2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("member_id", (Object) this.f16772i);
            jSONObject2.put("base_rev", (Object) 0);
            jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, (Object) 0);
            jSONObject2.put(ShareHitPoint.f121869d, (Object) "CLIENT_VARS");
            jSONObject2.put("token", (Object) str);
            jSONObject2.put("open_type", (Object) 1);
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            String str2 = this.f16764a;
            C13479a.m54758a(str2, "consumeSlide()... e = " + e);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public void mo24218a(String str, String str2) {
        if (str != null) {
            m24202a(str, str2, C5955d.m24025b().mo24091c(this.f16770g, str2));
        }
    }

    /* renamed from: a */
    private void m24202a(String str, String str2, C5968f fVar) {
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (ParseForSlide.Data0.Data1.Data2.Slide.Page page : ((ParseForSlide) JSON.parseObject(str, ParseForSlide.class)).data.data.data.slide.pages.values()) {
                if (!(page == null || page.elements == null)) {
                    for (ParseForSlide.Data0.Data1.Data2.Slide.Page.Element element : page.elements.values()) {
                        if (element != null) {
                            if (TextUtils.equals(element.type, "IMAGE") && C5681c.m23038a(element.url)) {
                                arrayList.add(new SubBlockModel(str2, C8275a.f22376i.mo32555b(), SubBlockType.IMAGE_DATA, element.url));
                            }
                            if (element.commentIds == null) {
                                i = 0;
                            } else {
                                i = element.commentIds.size();
                            }
                            i2 += i;
                        }
                    }
                    if (page.background != null && TextUtils.equals(page.background.fillType, "IMAGE") && page.background.image != null && C5681c.m23038a(page.background.image.url)) {
                        arrayList.add(new SubBlockModel(str2, C8275a.f22376i.mo32555b(), SubBlockType.IMAGE_DATA, page.background.image.url));
                    }
                }
            }
            fVar.mo24152l().mo24331a(4);
            fVar.mo24152l().mo24331a(64);
            if (arrayList.isEmpty()) {
                fVar.mo24152l().mo24331a(1);
            } else if (fVar.mo24152l().mo24335b(SubBlockType.IMAGE_DATA)) {
                C6002l.m24300a().mo24264a(this.f16770g, str2, C8275a.f22376i.mo32555b(), arrayList);
            }
            if (i2 > 0) {
                C6002l.m24300a().mo24266a(new SubBlockModel(str2, C8275a.f22376i.mo32555b(), SubBlockType.COMMENTS_DATA));
            } else if (fVar.mo24152l().mo24335b(SubBlockType.COMMENTS_DATA)) {
                fVar.mo24152l().mo24331a(16);
            }
            C5955d.m24025b().mo24083b(fVar);
        } catch (Exception e) {
            String str3 = this.f16764a;
            C13479a.m54758a(str3, "preloadSlideRes" + e);
        }
        if (this.f16773j != null) {
            this.f16773j.mo24233a(str2, System.currentTimeMillis());
        }
    }
}
