package com.ss.android.lark.search.impl.func.chatinside.p2608b;

import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.search.impl.func.chatinside.entity.ChatInsideSearchResponse;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.b.a */
public class C53411a {
    /* renamed from: a */
    public static ChatInsideSearchResponse m206839a(SearchResponse searchResponse) {
        ChatInsideSearchResponse chatInsideSearchResponse = new ChatInsideSearchResponse();
        chatInsideSearchResponse.setHasMore(searchResponse.isHasMore());
        chatInsideSearchResponse.setSearchKey(searchResponse.getQuery());
        chatInsideSearchResponse.setRequestId(searchResponse.getRequestId());
        chatInsideSearchResponse.setSearchItems(searchResponse.getInfoList());
        chatInsideSearchResponse.setAbnormalNotice(searchResponse.getAbnormalNotice());
        chatInsideSearchResponse.setImprId(searchResponse.getImprId());
        chatInsideSearchResponse.setTotal(searchResponse.getTotal());
        return chatInsideSearchResponse;
    }

    /* renamed from: a */
    public static Pair<List<String>, List<String>> m206838a(List<ChatChatter> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Pair.create(new ArrayList(), new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ChatChatter chatChatter : list) {
            String avatarKey = chatChatter.getAvatarKey();
            if (!TextUtils.isEmpty(avatarKey)) {
                arrayList.add(avatarKey);
            }
            arrayList2.add(chatChatter.getId());
        }
        return Pair.create(arrayList, arrayList2);
    }

    /* renamed from: b */
    public static Pair<List<String>, List<String>> m206840b(List<BasePickViewData> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Pair.create(new ArrayList(), new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BasePickViewData basePickViewData : list) {
            if (basePickViewData != null && (basePickViewData instanceof PickChatterViewData) && !TextUtils.isEmpty(basePickViewData.getImageKey()) && !TextUtils.isEmpty(basePickViewData.getId())) {
                arrayList.add(basePickViewData.getImageKey());
                arrayList2.add(basePickViewData.getId());
            }
        }
        return Pair.create(arrayList, arrayList2);
    }
}
