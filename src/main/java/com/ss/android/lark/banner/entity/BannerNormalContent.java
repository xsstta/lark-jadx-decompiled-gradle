package com.ss.android.lark.banner.entity;

import com.ss.android.lark.banner.export.entity.p1396a.C29488c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BannerNormalContent implements AbstractC29476b {

    /* renamed from: a */
    protected String f73604a;

    /* renamed from: b */
    protected String f73605b;

    /* renamed from: c */
    protected int f73606c;

    /* renamed from: d */
    protected String f73607d;

    /* renamed from: e */
    protected String f73608e;

    /* renamed from: f */
    protected String f73609f;

    /* renamed from: g */
    protected String f73610g;

    /* renamed from: h */
    protected String f73611h;

    /* renamed from: i */
    protected String f73612i;

    /* renamed from: j */
    protected String f73613j;

    /* renamed from: k */
    protected String f73614k;

    /* renamed from: l */
    protected boolean f73615l;

    /* renamed from: m */
    protected String f73616m;

    /* renamed from: n */
    protected String f73617n;

    /* renamed from: o */
    protected String f73618o;

    /* renamed from: p */
    protected int f73619p;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Layout {
    }

    /* renamed from: a */
    public String mo104372a() {
        return this.f73604a;
    }

    /* renamed from: b */
    public String mo104373b() {
        return this.f73605b;
    }

    /* renamed from: c */
    public int mo104374c() {
        return this.f73606c;
    }

    /* renamed from: d */
    public String mo104375d() {
        return this.f73607d;
    }

    /* renamed from: e */
    public String mo104376e() {
        return this.f73608e;
    }

    /* renamed from: f */
    public String mo104377f() {
        return this.f73609f;
    }

    /* renamed from: g */
    public String mo104378g() {
        return this.f73610g;
    }

    /* renamed from: h */
    public String mo104379h() {
        return this.f73611h;
    }

    /* renamed from: i */
    public String mo104380i() {
        return this.f73612i;
    }

    /* renamed from: j */
    public String mo104381j() {
        return this.f73613j;
    }

    /* renamed from: k */
    public String mo104382k() {
        return this.f73614k;
    }

    /* renamed from: l */
    public boolean mo104383l() {
        return this.f73615l;
    }

    /* renamed from: m */
    public String mo104384m() {
        return this.f73616m;
    }

    /* renamed from: n */
    public String mo104385n() {
        return this.f73617n;
    }

    /* renamed from: o */
    public String mo104386o() {
        return this.f73618o;
    }

    /* renamed from: p */
    public int mo104387p() {
        return this.f73619p;
    }

    /* renamed from: a */
    public static BannerNormalContent m108471a(C29488c cVar) {
        if (cVar == null) {
            return null;
        }
        BannerNormalContent bannerNormalContent = new BannerNormalContent();
        bannerNormalContent.f73604a = cVar.f73657a;
        bannerNormalContent.f73606c = cVar.f73658b;
        bannerNormalContent.f73608e = cVar.f73659c;
        bannerNormalContent.f73609f = cVar.f73660d;
        bannerNormalContent.f73610g = cVar.f73661e;
        bannerNormalContent.f73611h = cVar.f73662f;
        bannerNormalContent.f73612i = cVar.f73663g;
        bannerNormalContent.f73613j = cVar.f73664h;
        bannerNormalContent.f73614k = cVar.f73665i;
        bannerNormalContent.f73615l = cVar.f73666j;
        bannerNormalContent.f73616m = cVar.f73667k;
        bannerNormalContent.f73617n = cVar.f73668l;
        bannerNormalContent.f73619p = 2;
        return bannerNormalContent;
    }

    /* renamed from: a */
    public static BannerNormalContent m108472a(com.ss.android.lark.pb.guide.BannerNormalContent bannerNormalContent) {
        if (bannerNormalContent == null) {
            return null;
        }
        BannerNormalContent bannerNormalContent2 = new BannerNormalContent();
        bannerNormalContent2.f73604a = bannerNormalContent.mbackground_color;
        bannerNormalContent2.f73605b = bannerNormalContent.mbanner_icon;
        bannerNormalContent2.f73607d = bannerNormalContent.mbackground_pic;
        bannerNormalContent2.f73608e = bannerNormalContent.mtitle;
        bannerNormalContent2.f73609f = bannerNormalContent.mtitle_color;
        bannerNormalContent2.f73610g = bannerNormalContent.msub_title;
        bannerNormalContent2.f73611h = bannerNormalContent.msub_title_color;
        bannerNormalContent2.f73612i = bannerNormalContent.mcta_title;
        bannerNormalContent2.f73613j = bannerNormalContent.mcta_title_color;
        bannerNormalContent2.f73614k = bannerNormalContent.mcta_background_color;
        bannerNormalContent2.f73615l = bannerNormalContent.mbanner_closeable.booleanValue();
        bannerNormalContent2.f73616m = bannerNormalContent.mbanner_closeable_color;
        bannerNormalContent2.f73617n = bannerNormalContent.mbutton_link;
        bannerNormalContent2.f73618o = bannerNormalContent.mframe_color;
        bannerNormalContent2.f73619p = bannerNormalContent.mlayout.getValue();
        return bannerNormalContent2;
    }
}
