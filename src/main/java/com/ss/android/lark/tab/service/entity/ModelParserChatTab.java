package com.ss.android.lark.tab.service.entity;

import com.bytedance.lark.pb.im.v1.ChatTab;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.tab.service.entity.ChatTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/tab/service/entity/ModelParserChatTab;", "", "()V", "parseChatTabFromPb", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "pbChatTab", "Lcom/bytedance/lark/pb/im/v1/ChatTab;", "parseChatTabListFromPb", "", "chatId", "", "pbChatTabs", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.service.entity.b */
public final class ModelParserChatTab {

    /* renamed from: a */
    public static final ModelParserChatTab f136437a = new ModelParserChatTab();

    private ModelParserChatTab() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<ChatTab> m214410a(String str, List<ChatTab> list) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "pbChatTabs");
        Chat e = C32821b.m126120a().mo121056e(str);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m214409a(e, it.next()));
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final ChatTab m214409a(Chat chat, ChatTab chatTab) {
        Intrinsics.checkParameterIsNotNull(chatTab, "pbChatTab");
        ChatTab.Type type = chatTab.type;
        if (type != null) {
            int i = C55292c.f136438a[type.ordinal()];
            if (i == 1) {
                ChatTab.Companion aVar = ChatTab.Companion;
                Long l = chatTab.id;
                Intrinsics.checkExpressionValueIsNotNull(l, "pbChatTab.id");
                return aVar.mo188421a(l.longValue());
            } else if (i == 2) {
                ChatTab.Companion aVar2 = ChatTab.Companion;
                Long l2 = chatTab.id;
                Intrinsics.checkExpressionValueIsNotNull(l2, "pbChatTab.id");
                return aVar2.mo188422a(chat, l2.longValue());
            }
        }
        Long l3 = chatTab.id;
        Intrinsics.checkExpressionValueIsNotNull(l3, "pbChatTab.id");
        long longValue = l3.longValue();
        String str = chatTab.name;
        Intrinsics.checkExpressionValueIsNotNull(str, "pbChatTab.name");
        ChatTab.ChatTabType.Companion aVar3 = ChatTab.ChatTabType.Companion;
        ChatTab.Type type2 = chatTab.type;
        Intrinsics.checkExpressionValueIsNotNull(type2, "pbChatTab.type");
        ChatTab.ChatTabType a = aVar3.mo188419a(type2.getValue());
        ByteString byteString = chatTab.payload;
        String str2 = chatTab.payload_json;
        Long l4 = chatTab.id;
        Intrinsics.checkExpressionValueIsNotNull(l4, "pbChatTab.id");
        return new ChatTab(longValue, str, a, byteString, str2, l4.longValue());
    }
}
