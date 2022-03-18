package com.ss.android.lark.searchcommon.service.p2638a.p2639a;

import com.bytedance.lark.pb.search.v1.CalendarFilterParam;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import com.ss.android.lark.searchcommon.service.entity.request.MessageTag;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.searchcommon.service.a.a.a */
public class C53904a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.searchcommon.service.a.a.a$1 */
    public static /* synthetic */ class C539051 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133206a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.searchcommon.service.entity.request.MessageTag[] r0 = com.ss.android.lark.searchcommon.service.entity.request.MessageTag.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.searchcommon.service.p2638a.p2639a.C53904a.C539051.f133206a = r0
                com.ss.android.lark.searchcommon.service.entity.request.MessageTag r1 = com.ss.android.lark.searchcommon.service.entity.request.MessageTag.PIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.searchcommon.service.p2638a.p2639a.C53904a.C539051.f133206a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.searchcommon.service.entity.request.MessageTag r1 = com.ss.android.lark.searchcommon.service.entity.request.MessageTag.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.service.p2638a.p2639a.C53904a.C539051.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static CalendarFilterParam m208913a(NetSearchRequest.CalendarFilter calendarFilter) {
        CalendarFilterParam.C18811a aVar = new CalendarFilterParam.C18811a();
        if (calendarFilter == null) {
            return aVar.build();
        }
        aVar.mo64592a(calendarFilter.removeChatIds);
        return aVar.build();
    }

    /* renamed from: a */
    public static ChatFilterParam m208914a(NetSearchRequest.ChatFilter chatFilter) {
        ChatFilterParam.C18813a aVar = new ChatFilterParam.C18813a();
        if (chatFilter == null) {
            return aVar.build();
        }
        aVar.mo64598a(m208916b(chatFilter.chatTypes));
        aVar.mo64600b(chatFilter.chatMemberIds);
        aVar.mo64597a(chatFilter.chatKeyWord);
        aVar.mo64601c(chatFilter.chatModes);
        return aVar.build();
    }

    /* renamed from: b */
    private static List<ChatFilterParam.ChatType> m208916b(List<ChatType> list) {
        ArrayList arrayList = new ArrayList();
        for (ChatType chatType : list) {
            if (!(chatType == null || chatType == ChatType.UNKNOWN)) {
                arrayList.add(ChatFilterParam.ChatType.fromValue(chatType.getNumber()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<IntegrationSearchRequest.FilterParam.MessageTag> m208915a(List<MessageTag> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MessageTag messageTag : list) {
            if (C539051.f133206a[messageTag.ordinal()] != 1) {
                arrayList.add(IntegrationSearchRequest.FilterParam.MessageTag.UNKNOWN);
            } else {
                arrayList.add(IntegrationSearchRequest.FilterParam.MessageTag.PIN);
            }
        }
        return arrayList;
    }
}
