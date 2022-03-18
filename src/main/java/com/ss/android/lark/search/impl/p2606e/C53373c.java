package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchChatViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;

/* renamed from: com.ss.android.lark.search.impl.e.c */
public class C53373c extends AbstractC53371a<SearchChatViewData, SearchChatInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchChatViewData mo182051a(SearchChatInfo searchChatInfo) {
        return new SearchChatViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchChatViewData searchChatViewData, SearchChatInfo searchChatInfo) {
        searchChatViewData.setChatId(searchChatInfo.getId());
        searchChatViewData.setChatType(searchChatInfo.getChatType());
        searchChatViewData.setNewMsgCount(searchChatInfo.getNewMsgCount());
        searchChatViewData.setRemind(searchChatInfo.isRemind());
        searchChatViewData.setThread(searchChatInfo.isThread());
        searchChatViewData.setDepartment(searchChatInfo.isDepartment());
        searchChatViewData.setTenant(searchChatInfo.isTenant());
        searchChatViewData.setDelayed(searchChatInfo.isDelayed());
        searchChatViewData.setCrossTenant(searchChatInfo.isCrossTenant());
        searchChatViewData.setSecretChat(searchChatInfo.isSecretChat());
        searchChatViewData.setPublic(searchChatInfo.isPublic());
        searchChatViewData.setMember(searchChatInfo.isMember());
        searchChatViewData.setMeeting(searchChatInfo.isMeeting());
        searchChatViewData.setOfficialOnCall(searchChatInfo.isOfficialOnCall());
        searchChatViewData.setShowTag(!this.f131908a.mo181817c());
        searchChatViewData.setTags(searchChatInfo.getTags());
        searchChatViewData.setCrossWithKA(searchChatInfo.isCrossWithKa());
        int userCount = searchChatInfo.getUserCount();
        if (userCount <= 0) {
            userCount = searchChatInfo.getMemberCount();
        }
        searchChatViewData.setChatCount(userCount);
    }
}
