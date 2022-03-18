package com.ss.android.lark.ding.service.impl;

import com.bytedance.lark.pb.basic.v1.Urgent;
import com.bytedance.lark.pb.im.v1.GetUrgentsAckStatusResponse;
import com.ss.android.lark.ding.dto.C36636a;
import com.ss.android.lark.ding.dto.UrgentType;
import com.ss.android.lark.ding.entity.DingStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.ding.service.impl.d */
public class C36757d {
    /* renamed from: a */
    public static C36636a m144998a(Urgent urgent) {
        C36636a aVar = new C36636a();
        aVar.mo135171a(urgent.id);
        aVar.mo135173b(urgent.message_id);
        aVar.mo135169a(UrgentType.forNumber(urgent.type.getValue()));
        aVar.mo135168a(urgent.send_time.longValue());
        aVar.mo135175c(urgent.ack_chatter_id);
        return aVar;
    }

    /* renamed from: a */
    public static DingStatus m144999a(String str, List<String> list) {
        DingStatus dingStatus = new DingStatus();
        dingStatus.setMessageId(str);
        dingStatus.setUnconfirmedChatterIds(list);
        return dingStatus;
    }

    /* renamed from: a */
    public static Map<String, DingStatus> m145000a(GetUrgentsAckStatusResponse getUrgentsAckStatusResponse, List<String> list) {
        HashMap hashMap = new HashMap();
        Map<String, GetUrgentsAckStatusResponse.UrgentStatus> map = getUrgentsAckStatusResponse.urgent_status;
        Map<String, GetUrgentsAckStatusResponse.PhoneStatus> map2 = getUrgentsAckStatusResponse.phone_status;
        for (String str : list) {
            GetUrgentsAckStatusResponse.UrgentStatus urgentStatus = map.get(str);
            DingStatus dingStatus = new DingStatus();
            dingStatus.setMessageId(str);
            dingStatus.setConfirmedChatterIds(new ArrayList(urgentStatus.ack_chatter_ids));
            dingStatus.setUnconfirmedChatterIds(new ArrayList(urgentStatus.init_chatter_ids));
            hashMap.put(str, dingStatus);
        }
        return hashMap;
    }
}
