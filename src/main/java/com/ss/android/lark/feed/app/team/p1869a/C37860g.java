package com.ss.android.lark.feed.app.team.p1869a;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.team.entity.Item;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.team.a.g */
public class C37860g {
    /* renamed from: a */
    public static C37874d m148992a(C37874d dVar, FeedPreviewInfo feedPreviewInfo) {
        dVar.mo138744b(feedPreviewInfo.mo106105s());
        dVar.mo138734a(feedPreviewInfo.mo106058d());
        dVar.mo138743b(m148994b(dVar, feedPreviewInfo));
        dVar.mo138735a(feedPreviewInfo.an());
        dVar.mo138731a((int) feedPreviewInfo.mo106106t());
        dVar.mo138739a(feedPreviewInfo.mo106107u());
        dVar.mo138733a(feedPreviewInfo.mo106101q());
        return dVar;
    }

    /* renamed from: b */
    private static int m148994b(C37874d dVar, FeedPreviewInfo feedPreviewInfo) {
        int number;
        int i = 0;
        if (C37264a.m146754c() && !CollectionUtils.isEmpty(feedPreviewInfo.mo106080j())) {
            i = 0 | FeedPreview.MarkType.URGENT.getNumber();
        }
        FeedPreviewInfo.AtInfo y = feedPreviewInfo.mo106111y();
        if (y != null) {
            if (y.mo106117b() == FeedPreviewInfo.AtInfo.AtType.ALL) {
                number = FeedPreview.MarkType.AT_ALL.getNumber();
            } else {
                if (y.mo106117b() == FeedPreviewInfo.AtInfo.AtType.USER) {
                    number = FeedPreview.MarkType.AT_USER.getNumber();
                }
                dVar.mo138736a(new FeedPreview.AtInfo(y.mo106113a(), y.mo106130h(), y.mo106120c()));
            }
            i = number | i;
            dVar.mo138736a(new FeedPreview.AtInfo(y.mo106113a(), y.mo106130h(), y.mo106120c()));
        }
        return i;
    }

    /* renamed from: a */
    public static List<C37874d> m148993a(List<Item> list, List<FeedPreviewInfo> list2, long j, String str) {
        HashMap hashMap = new HashMap(list.size());
        for (Item item : list) {
            hashMap.put(item.getEntityId(), item);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (FeedPreviewInfo feedPreviewInfo : list2) {
            Item item2 = (Item) hashMap.get(feedPreviewInfo.mo106098p());
            if (item2 != null) {
                C37874d dVar = new C37874d();
                dVar.mo138738a(feedPreviewInfo.mo106098p());
                dVar.mo138737a(item2);
                dVar.mo138732a(j);
                dVar.mo138745b(TextUtils.equals(str, feedPreviewInfo.mo106098p()));
                m148992a(dVar, feedPreviewInfo);
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
