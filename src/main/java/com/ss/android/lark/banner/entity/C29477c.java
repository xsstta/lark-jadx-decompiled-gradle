package com.ss.android.lark.banner.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.banner.export.entity.AbstractC29485a;
import com.ss.android.lark.banner.export.entity.p1396a.C29488c;
import com.ss.android.lark.banner.statistics.BannerApm;
import com.ss.android.lark.banner.statistics.BannerAppreciable;
import com.ss.android.lark.pb.guide.BannerDyData;

/* renamed from: com.ss.android.lark.banner.entity.c */
public class C29477c implements AbstractC29485a {

    /* renamed from: a */
    protected String f73652a;

    /* renamed from: b */
    protected AbstractC29476b f73653b;

    /* renamed from: a */
    public String mo104438a() {
        return this.f73652a;
    }

    /* renamed from: b */
    public AbstractC29476b mo104439b() {
        return this.f73653b;
    }

    /* renamed from: a */
    public static C29477c m108541a(C29488c cVar) {
        if (cVar == null) {
            return null;
        }
        C29477c cVar2 = new C29477c();
        cVar2.f73652a = "NORMAL";
        cVar2.f73653b = BannerNormalContent.m108471a(cVar);
        return cVar2;
    }

    /* renamed from: a */
    public static C29477c m108543a(Object obj) {
        if (obj instanceof BannerDyData) {
            return m108542a((BannerDyData) obj);
        }
        if (obj instanceof C29488c) {
            return m108541a((C29488c) obj);
        }
        return null;
    }

    /* renamed from: a */
    public static C29477c m108542a(BannerDyData bannerDyData) {
        String str;
        if (bannerDyData == null) {
            return null;
        }
        C29477c cVar = new C29477c();
        if (bannerDyData.mbanner_type != null) {
            str = bannerDyData.mbanner_type.name();
        } else {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        cVar.f73652a = str;
        if (bannerDyData.mbanner_type == BannerDyData.BannerType.NORMAL) {
            cVar.f73653b = BannerNormalContent.m108472a(bannerDyData.mnormal_content);
        } else if (bannerDyData.mbanner_type == BannerDyData.BannerType.TEMPLATE) {
            cVar.f73653b = BannerTemplateContent.m108489a(bannerDyData.mtemplate_content);
        } else if (bannerDyData.mbanner_type == BannerDyData.BannerType.CAROUSEL) {
            cVar.f73653b = BannerCarouselContent.m108534a(bannerDyData.mcarousel_content);
        } else {
            BannerApm.f73689a.mo104462b(cVar.f73652a);
            BannerAppreciable.f73690a.mo104465a(cVar.f73652a);
        }
        return cVar;
    }
}
