package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchChatMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.c */
public class C53908c extends AbstractC53906a<SearchChatInfo, SearchChatMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchChatInfo mo184290a() {
        return new SearchChatInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchChatInfo searchChatInfo, SearchChatMeta searchChatMeta) {
        searchChatInfo.setChatType(Chat.Type.forNumber(searchChatMeta.type.getValue()));
        searchChatInfo.setMemberCount(searchChatMeta.member_count.intValue());
        searchChatInfo.setUserCount(searchChatMeta.user_count.intValue());
        searchChatInfo.setNewMsgCount(searchChatMeta.new_message_count.intValue());
        searchChatInfo.setRemind(searchChatMeta.is_remind.booleanValue());
        searchChatInfo.setChatMode(Chat.ChatMode.forNumber(searchChatMeta.chat_mode.getValue()));
        searchChatInfo.setDepartment(searchChatMeta.is_department.booleanValue());
        searchChatInfo.setTenant(searchChatMeta.is_tenant.booleanValue());
        searchChatInfo.setDelayed(searchChatMeta.is_delayed.booleanValue());
        searchChatInfo.setCrossTenant(searchChatMeta.is_cross_tenant.booleanValue());
        searchChatInfo.setSecretChat(searchChatMeta.is_crypto.booleanValue());
        searchChatInfo.setPublic(searchChatMeta.is_public_v2.booleanValue());
        searchChatInfo.setMember(searchChatMeta.is_member.booleanValue());
        searchChatInfo.setIsMeeting(searchChatMeta.is_meeting.booleanValue());
        searchChatInfo.setOfficialOnCall(searchChatMeta.is_official_oncall.booleanValue());
        searchChatInfo.setTags(searchChatMeta.tags);
        searchChatInfo.setCrossWithKa(searchChatMeta.is_cross_with_ka.booleanValue());
    }
}
