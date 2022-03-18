package com.ss.android.lark.feed.service.impl;

import com.bytedance.lark.pb.feed.v1.AtInfo;
import com.bytedance.lark.pb.feed.v1.CardPair;
import com.bytedance.lark.pb.feed.v1.DraftPreview;
import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.bytedance.lark.pb.feed.v1.PushStatistcsEventResponse;
import com.bytedance.lark.pb.feed.v1.UrgentInfo;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.MuteUrgentInfo;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.service.impl.PushStatisticsEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.feed.service.impl.c */
public class C38127c {
    /* renamed from: a */
    public static FeedPreviewInfo.C29593a m149941a(DraftPreview draftPreview) {
        if (draftPreview == null) {
            return null;
        }
        FeedPreviewInfo.C29593a aVar = new FeedPreviewInfo.C29593a();
        aVar.mo106136a(draftPreview.content);
        return aVar;
    }

    /* renamed from: a */
    public static PushStatisticsEvent m149943a(PushStatistcsEventResponse pushStatistcsEventResponse) {
        if (pushStatistcsEventResponse == null) {
            return null;
        }
        return new PushStatisticsEvent(PushStatisticsEvent.Type.forNumber(pushStatistcsEventResponse.type.getValue()), m149946a(pushStatistcsEventResponse.box_datas));
    }

    /* renamed from: a */
    public static MuteUrgentInfo m149942a(UrgentInfo urgentInfo) {
        long j;
        if (urgentInfo == null) {
            return null;
        }
        Long l = urgentInfo.rank_time;
        if (urgentInfo.display_time != null) {
            j = TimeUnit.SECONDS.toMillis(urgentInfo.display_time.longValue());
        } else {
            j = 0;
        }
        return new MuteUrgentInfo(l, Long.valueOf(j), urgentInfo.urgent_content);
    }

    /* renamed from: b */
    public static List<String> m149947b(List<CardPair> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (CardPair cardPair : list) {
            arrayList.add(cardPair.id);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static FeedPreviewInfo.AtInfo m149940a(AtInfo atInfo) {
        long j;
        if (atInfo == null) {
            return null;
        }
        FeedPreviewInfo.AtInfo atInfo2 = new FeedPreviewInfo.AtInfo();
        atInfo2.mo106115a(FeedPreviewInfo.AtInfo.AtType.getSource(atInfo.type.getValue()));
        atInfo2.mo106116a(atInfo.user_id);
        atInfo2.mo106128f(atInfo.avatar_key);
        atInfo2.mo106119b(atInfo.localized_user_name);
        atInfo2.mo106121c(atInfo.channel_id);
        atInfo2.mo106123d(atInfo.channel_name);
        if (atInfo.at_display_time != null) {
            j = TimeUnit.SECONDS.toMillis(atInfo.at_display_time.longValue());
        } else {
            j = 0;
        }
        atInfo2.mo106114a(j);
        atInfo2.mo106118b(atInfo.at_rank_time.longValue());
        atInfo2.mo106125e(atInfo.at_content);
        return atInfo2;
    }

    /* renamed from: a */
    public static List<FeedFilter> m149944a(FeedFilter.List list) {
        if (list == null || list.types == null || list.types.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.types.size());
        for (Integer num : list.types) {
            arrayList.add(com.ss.android.lark.feed.app.entity.FeedFilter.Companion.valueOf(num.intValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<FeedPreviewInfo.AtInfo> m149945a(List<AtInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (AtInfo atInfo : list) {
            arrayList.add(m149940a(atInfo));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, PushStatisticsEvent.C38122a> m149946a(Map<String, PushStatistcsEventResponse.BoxData> map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return null;
        }
        for (String str : map.keySet()) {
            hashMap.put(str, new PushStatisticsEvent.C38122a(map.get(str).count.longValue()));
        }
        return hashMap;
    }
}
