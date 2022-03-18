package com.ss.android.lark.feed.app.team.entity;

import com.bytedance.lark.pb.feed.v1.BadgeCount;
import com.bytedance.lark.pb.feed.v1.GetItemsResponse;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2733c.C55366b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.team.entity.f */
public class C37876f {

    /* renamed from: a */
    private List<Item> f97147a;

    /* renamed from: b */
    private Map<Long, Team> f97148b;

    /* renamed from: c */
    private Map<Long, BadgeCount> f97149c;

    private C37876f() {
    }

    /* renamed from: a */
    public List<Item> mo138767a() {
        return this.f97147a;
    }

    /* renamed from: b */
    public Map<Long, Team> mo138768b() {
        return this.f97148b;
    }

    /* renamed from: a */
    public static C37876f m149059a(GetItemsResponse getItemsResponse) {
        C37876f fVar = new C37876f();
        if (getItemsResponse != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Long, GetItemsResponse.Result> entry : getItemsResponse.results.entrySet()) {
                if (entry.getValue() != null) {
                    for (com.bytedance.lark.pb.basic.v1.Item item : entry.getValue().items) {
                        if (item != null) {
                            arrayList.add(C55366b.m214900a(item));
                        }
                    }
                }
            }
            Collections.sort(arrayList, new Comparator<Item>() {
                /* class com.ss.android.lark.feed.app.team.entity.C37876f.C378771 */

                /* renamed from: a */
                public int compare(Item item, Item item2) {
                    if (item.getOrderWeight() > item2.getOrderWeight()) {
                        return 1;
                    }
                    if (item.getOrderWeight() == item2.getOrderWeight()) {
                        return 0;
                    }
                    return -1;
                }
            });
            fVar.f97147a = arrayList;
            HashMap hashMap = new HashMap();
            for (Map.Entry<Long, com.bytedance.lark.pb.basic.v1.Team> entry2 : getItemsResponse.teams.entrySet()) {
                hashMap.put(entry2.getKey(), C55366b.m214901a(entry2.getValue()));
            }
            fVar.f97148b = hashMap;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<Long, BadgeCount> entry3 : getItemsResponse.item2badge_count.entrySet()) {
                hashMap2.put(entry3.getKey(), entry3.getValue());
            }
            fVar.f97149c = hashMap2;
        }
        return fVar;
    }
}
