package com.ss.android.lark.banner.export.entity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.banner.export.entity.p1396a.C29486a;
import com.ss.android.lark.pb.guide.BannerInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.banner.export.entity.c */
public class C29490c {
    /* renamed from: a */
    public static C29489b m108575a(C29486a aVar) {
        if (aVar == null) {
            return null;
        }
        C29489b bVar = new C29489b();
        bVar.f73669a = aVar.f73654a;
        bVar.f73670b = aVar.f73655b;
        bVar.f73671c = "DYNAMIC";
        bVar.f73672d = aVar.f73656c;
        return bVar;
    }

    /* renamed from: a */
    public static C29489b m108576a(BannerInfo bannerInfo) {
        String str;
        if (bannerInfo == null) {
            return null;
        }
        C29489b bVar = new C29489b();
        bVar.f73669a = bannerInfo.mbanner_key;
        bVar.f73670b = bannerInfo.mpriority.intValue();
        if (bannerInfo.mbiz_name != null) {
            str = bannerInfo.mbiz_name.name();
        } else {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        bVar.f73671c = str;
        if (bannerInfo.mbiz_name == BannerInfo.BannerBizName.DYNAMIC) {
            bVar.f73672d = bannerInfo.mdy_data;
        }
        return bVar;
    }

    /* renamed from: a */
    public static List<C29489b> m108577a(List<BannerInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || list.size() == 0)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(m108576a(list.get(i)));
            }
        }
        return arrayList;
    }
}
