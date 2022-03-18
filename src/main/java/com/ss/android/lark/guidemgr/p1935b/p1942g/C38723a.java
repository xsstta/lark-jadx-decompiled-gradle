package com.ss.android.lark.guidemgr.p1935b.p1942g;

import androidx.core.util.C0844e;
import com.bytedance.lark.pb.onboarding.v1.UserGuideInfo;
import com.bytedance.lark.pb.onboarding.v1.UserGuideViewAreaPair;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38711a;
import com.ss.android.lark.guidemgr.p1935b.p1938c.C38712b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.guidemgr.b.g.a */
public class C38723a {
    /* renamed from: a */
    public static List<C0844e<C38711a, List<C38712b>>> m152936a(List<UserGuideViewAreaPair> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (UserGuideViewAreaPair userGuideViewAreaPair : list) {
                if (!(userGuideViewAreaPair.area == null || userGuideViewAreaPair.ordered_infos == null || userGuideViewAreaPair.ordered_infos.isEmpty())) {
                    C38711a aVar = new C38711a(userGuideViewAreaPair.area.key, userGuideViewAreaPair.area.priority.longValue());
                    ArrayList arrayList2 = new ArrayList();
                    for (UserGuideInfo userGuideInfo : userGuideViewAreaPair.ordered_infos) {
                        arrayList2.add(new C38712b(userGuideInfo.key, userGuideInfo.priority.longValue(), aVar, false));
                    }
                    arrayList.add(new C0844e(aVar, arrayList2));
                }
            }
        }
        return arrayList;
    }
}
