package com.ss.android.lark.feed.service.impl;

import com.bytedance.lark.pb.basic.v1.Urgent;
import com.ss.android.lark.biz.im.api.UrgentInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.impl.g */
public class C38158g {
    /* renamed from: a */
    private static UrgentInfo m150020a(Urgent urgent) {
        if (urgent == null) {
            return null;
        }
        UrgentInfo urgentInfo = new UrgentInfo();
        urgentInfo.mo106638a(urgent.id);
        urgentInfo.mo106639b(urgent.message_id);
        urgentInfo.mo106637a(urgent.send_time.longValue());
        return urgentInfo;
    }

    /* renamed from: a */
    public static List<UrgentInfo> m150021a(List<Urgent> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Urgent urgent : list) {
            UrgentInfo a = m150020a(urgent);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
