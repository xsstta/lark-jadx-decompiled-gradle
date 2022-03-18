package com.ss.android.lark.feed.app.team.entity;

import android.text.TextUtils;
import com.bytedance.lark.pb.feed.v1.BadgeCount;
import com.bytedance.lark.pb.feed.v1.FeedEntityPreview;
import com.bytedance.lark.pb.feed.v1.GetItemsResponse;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.service.impl.C38159h;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2733c.C55366b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.team.entity.c */
public class C37872c {

    /* renamed from: a */
    private long f97125a;

    /* renamed from: b */
    private Team f97126b;

    /* renamed from: c */
    private List<Item> f97127c;

    /* renamed from: d */
    private Map<Long, FeedPreviewInfo> f97128d;

    /* renamed from: e */
    private Map<Long, BadgeCount> f97129e;

    /* renamed from: f */
    private List<FeedPreviewInfo> f97130f;

    /* renamed from: a */
    public long mo138725a() {
        return this.f97125a;
    }

    /* renamed from: b */
    public Team mo138726b() {
        return this.f97126b;
    }

    /* renamed from: c */
    public List<Item> mo138727c() {
        return this.f97127c;
    }

    /* renamed from: d */
    public List<FeedPreviewInfo> mo138728d() {
        return this.f97130f;
    }

    /* renamed from: a */
    public static C37872c m149017a(GetItemsResponse getItemsResponse, long j, Team team) {
        C37872c cVar = new C37872c();
        cVar.f97125a = j;
        cVar.f97126b = team;
        if (getItemsResponse != null) {
            ArrayList arrayList = new ArrayList();
            Item item = null;
            for (Map.Entry<Long, GetItemsResponse.Result> entry : getItemsResponse.results.entrySet()) {
                if (entry.getValue() != null) {
                    for (com.bytedance.lark.pb.basic.v1.Item item2 : entry.getValue().items) {
                        if (item2 != null) {
                            if (TextUtils.equals(item2.entity_id, String.valueOf(team.getDefaultChatId()))) {
                                item = C55366b.m214900a(item2);
                            } else {
                                arrayList.add(C55366b.m214900a(item2));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList, new Comparator<Item>() {
                /* class com.ss.android.lark.feed.app.team.entity.C37872c.C378731 */

                /* renamed from: a */
                public int compare(Item item, Item item2) {
                    return item.getNameWeight().compareTo(item2.getNameWeight());
                }
            });
            if (item != null) {
                arrayList.add(0, item);
            }
            cVar.f97127c = arrayList;
            HashMap hashMap = new HashMap();
            for (Map.Entry<Long, FeedEntityPreview> entry2 : getItemsResponse.chats.entrySet()) {
                FeedPreviewInfo a = C38159h.m150022a(entry2.getValue());
                if (a != null) {
                    hashMap.put(entry2.getKey(), a);
                }
            }
            cVar.f97128d = hashMap;
            ArrayList arrayList2 = new ArrayList();
            for (Item item3 : cVar.f97127c) {
                FeedPreviewInfo feedPreviewInfo = cVar.f97128d.get(Long.valueOf(Long.parseLong(item3.getEntityId())));
                if (feedPreviewInfo != null) {
                    arrayList2.add(feedPreviewInfo);
                }
            }
            cVar.f97130f = arrayList2;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<Long, BadgeCount> entry3 : getItemsResponse.item2badge_count.entrySet()) {
                hashMap2.put(entry3.getKey(), entry3.getValue());
            }
            cVar.f97129e = hashMap2;
        }
        return cVar;
    }
}
