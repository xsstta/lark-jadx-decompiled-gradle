package com.ss.android.lark.ai.smartreply.p1344b;

import ai.v1.GetSmartComposeResponse;
import ai.v1.SuggestionItem;
import com.bytedance.lark.pb.ai.v1.GetSmartReplyResponse;
import com.ss.android.lark.ai.smartcompose.p1341a.C28580a;
import com.ss.android.lark.ai.smartcompose.p1341a.C28581b;
import com.ss.android.lark.ai.smartreply.dto.C28616a;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.b.a */
public class C28600a {
    /* renamed from: a */
    public static C28581b m104871a(SuggestionItem suggestionItem) {
        return new C28581b(suggestionItem.suggestion, suggestionItem.id, suggestionItem.confidence, suggestionItem.reason);
    }

    /* renamed from: a */
    public static C28616a m104873a(GetSmartReplyResponse getSmartReplyResponse) {
        return new C28616a(m104874a(getSmartReplyResponse.smart_replies), getSmartReplyResponse.vid, getSmartReplyResponse.impr_id);
    }

    /* renamed from: a */
    public static C28580a m104870a(GetSmartComposeResponse getSmartComposeResponse) {
        ArrayList arrayList = new ArrayList();
        if (getSmartComposeResponse.suggestion != null && !getSmartComposeResponse.suggestion.isEmpty()) {
            for (SuggestionItem suggestionItem : getSmartComposeResponse.suggestion) {
                arrayList.add(m104871a(suggestionItem));
            }
        }
        return new C28580a(arrayList, getSmartComposeResponse.vid, getSmartComposeResponse.language, getSmartComposeResponse.force_display, getSmartComposeResponse.min_display_char_len);
    }

    /* renamed from: a */
    private static SmartReplyItem m104872a(com.bytedance.lark.pb.ai.v1.SmartReplyItem smartReplyItem) {
        SmartReplyItem.C28613a aVar;
        SmartReplyItem.C28614b bVar = null;
        if (smartReplyItem.app_action_params != null) {
            aVar = new SmartReplyItem.C28613a(smartReplyItem.app_action_params.action_url);
        } else {
            aVar = null;
        }
        if (smartReplyItem.calendar_action_params != null) {
            bVar = new SmartReplyItem.C28614b(smartReplyItem.calendar_action_params.start_time, smartReplyItem.calendar_action_params.end_time, smartReplyItem.calendar_action_params.duration, smartReplyItem.calendar_action_params.time_grain);
        }
        return new SmartReplyItem(smartReplyItem.label, smartReplyItem.text_reply, smartReplyItem.item_id, SmartReplyItem.Type.forNumber(smartReplyItem.type.getValue()), aVar, bVar, smartReplyItem.icon_key);
    }

    /* renamed from: a */
    public static List<SmartReplyItem> m104874a(List<com.bytedance.lark.pb.ai.v1.SmartReplyItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (com.bytedance.lark.pb.ai.v1.SmartReplyItem smartReplyItem : list) {
                arrayList.add(m104872a(smartReplyItem));
            }
        }
        return arrayList;
    }
}
