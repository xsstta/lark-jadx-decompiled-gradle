package com.ss.android.lark.message.card.p2267g;

import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.message.card.g.a */
public class C45310a {

    /* renamed from: a */
    public static final HashMap<String, C45311a> f114712a;

    static {
        HashMap<String, C45311a> hashMap = new HashMap<>();
        f114712a = hashMap;
        hashMap.put("blue", new C45311a(101, R.color.udtoken_message_card_text_blue, R.color.udtoken_message_card_bg_blue));
        hashMap.put("wathet", new C45311a(102, R.color.udtoken_message_card_text_wathet, R.color.udtoken_message_card_bg_wathet));
        hashMap.put("turquoise", new C45311a(103, R.color.udtoken_message_card_text_turquoise, R.color.udtoken_message_card_bg_turquoise));
        hashMap.put("green", new C45311a(104, R.color.udtoken_message_card_text_green, R.color.udtoken_message_card_bg_green));
        hashMap.put("lime", new C45311a(LocationRequest.PRIORITY_NO_POWER, R.color.udtoken_message_card_text_lime, R.color.udtoken_message_card_bg_lime));
        hashMap.put("yellow", new C45311a(106, R.color.udtoken_message_card_text_yellow, R.color.udtoken_message_card_bg_yellow));
        hashMap.put("orange", new C45311a(ActivityIdentificationData.WALKING, R.color.udtoken_message_card_text_orange, R.color.udtoken_message_card_bg_orange));
        hashMap.put("red", new C45311a(108, R.color.udtoken_message_card_text_red, R.color.udtoken_message_card_bg_red));
        hashMap.put("carmine", new C45311a(SmEvents.EVENT_NR, R.color.udtoken_message_card_text_carmine, R.color.udtoken_message_card_bg_carmine));
        hashMap.put("violet", new C45311a(SmEvents.EVENT_NO, R.color.udtoken_message_card_text_violet, R.color.udtoken_message_card_bg_violet));
        hashMap.put("purple", new C45311a(SmEvents.EVENT_NT, R.color.udtoken_message_card_text_purple, R.color.udtoken_message_card_bg_purple));
        hashMap.put("indigo", new C45311a(SmEvents.EVENT_NE_RR, R.color.udtoken_message_card_text_indigo, R.color.udtoken_message_card_bg_indigo));
        hashMap.put("neutral", new C45311a(100, R.color.udtoken_message_card_text_neutral, R.color.udtoken_message_card_bg_neutral));
        hashMap.put("grey", new C45311a(100, R.color.udtoken_message_card_text_neutral, R.color.udtoken_message_card_bg_neutral));
        hashMap.put("gray", new C45311a(100, R.color.udtoken_message_card_text_neutral, R.color.udtoken_message_card_bg_neutral));
    }

    /* renamed from: com.ss.android.lark.message.card.g.a$a */
    public static class C45311a {

        /* renamed from: a */
        public int f114713a;

        /* renamed from: b */
        public int f114714b;

        /* renamed from: c */
        public int f114715c;

        public C45311a(int i, int i2, int i3) {
            this.f114713a = i;
            this.f114714b = i3;
            this.f114715c = i2;
        }
    }
}
