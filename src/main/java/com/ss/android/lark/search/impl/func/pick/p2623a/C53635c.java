package com.ss.android.lark.search.impl.func.pick.p2623a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatViewData;
import com.ss.android.lark.searchcommon.dto.C53893b;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.search.impl.func.pick.a.c */
public class C53635c {
    /* renamed from: a */
    public PickChatViewData mo182947a(SearchChatInfo searchChatInfo) {
        if (searchChatInfo == null) {
            return null;
        }
        PickChatViewData pickChatViewData = new PickChatViewData();
        pickChatViewData.setId(searchChatInfo.getId());
        pickChatViewData.setBusinessId(searchChatInfo.getId());
        pickChatViewData.setImageKey(searchChatInfo.getAvatarKey());
        pickChatViewData.setName(searchChatInfo.getTitle());
        int userCount = searchChatInfo.getUserCount();
        if (userCount <= 0) {
            userCount = searchChatInfo.getMemberCount();
        }
        pickChatViewData.setChatCount(userCount);
        pickChatViewData.setDescription(searchChatInfo.getSubTitle());
        pickChatViewData.setNameHighLights(searchChatInfo.getTitleHitTerms());
        pickChatViewData.setDescHighLights(searchChatInfo.getSubTitleHitTerms());
        pickChatViewData.setChatType(searchChatInfo.getChatType());
        pickChatViewData.setCrossTenant(searchChatInfo.isCrossTenant());
        pickChatViewData.setDepartment(searchChatInfo.isDepartment());
        pickChatViewData.setTenant(searchChatInfo.isTenant());
        return pickChatViewData;
    }

    /* renamed from: a */
    public SearchChatInfo mo182948a(PickChatViewData pickChatViewData) {
        if (pickChatViewData == null) {
            return null;
        }
        SearchChatInfo searchChatInfo = new SearchChatInfo();
        searchChatInfo.setId(pickChatViewData.getId());
        searchChatInfo.setAvatarKey(pickChatViewData.getImageKey());
        searchChatInfo.setTitle(pickChatViewData.getName());
        searchChatInfo.setUserCount(pickChatViewData.getChatCount());
        searchChatInfo.setSubTitle(pickChatViewData.getDescription());
        searchChatInfo.setTitleHitTerms(pickChatViewData.getNameHighLights());
        searchChatInfo.setSubTitleHitTerms(pickChatViewData.getDescHighLights());
        searchChatInfo.setChatType(pickChatViewData.getChatType());
        searchChatInfo.setCrossTenant(pickChatViewData.isCrossTenant());
        searchChatInfo.setDepartment(pickChatViewData.isDepartment());
        searchChatInfo.setTenant(pickChatViewData.isTenant());
        searchChatInfo.setMember(true);
        searchChatInfo.setPublic(pickChatViewData.isPublic());
        return searchChatInfo;
    }

    /* renamed from: a */
    private void m207628a(PickChatViewData pickChatViewData, Chat chat) {
        if (chat.getType() != Chat.Type.P2P || pickChatViewData.isShowBotTag()) {
            pickChatViewData.setDescription(chat.getDescription());
        } else {
            pickChatViewData.setDescription("");
        }
    }

    /* renamed from: a */
    public PickChatViewData mo182946a(C53893b bVar, Chat chat, Chatter chatter) {
        if (bVar == null || chat == null) {
            return null;
        }
        PickChatViewData pickChatViewData = new PickChatViewData();
        pickChatViewData.setImageKey(bVar.mo183902d());
        pickChatViewData.setName(bVar.mo183904e());
        pickChatViewData.setNameHighLights(new ArrayList());
        pickChatViewData.setDescHighLights(new ArrayList());
        if (chat.getType() == Chat.Type.P2P) {
            if (chatter == null) {
                return null;
            }
            pickChatViewData.setP2pChatterId(chatter.getId());
            pickChatViewData.setShowBotTag(chatter.showBotTag());
            pickChatViewData.setP2pChatterDescription(chatter.getDescription());
        }
        pickChatViewData.setBusinessId(chat.getId());
        pickChatViewData.setId(chat.getId());
        pickChatViewData.setCrossTenant(chat.isCrossTenant());
        pickChatViewData.setCrossWithKa(chat.isCrossWithKa());
        pickChatViewData.setChatType(bVar.mo183906f());
        int userCount = chat.getUserCount();
        if (userCount <= 0) {
            userCount = chat.getMemberCount();
        }
        pickChatViewData.setChatCount(userCount);
        pickChatViewData.setTenant(bVar.mo183907g());
        pickChatViewData.setOfficialOnCall(bVar.mo183909i());
        pickChatViewData.setDepartment(bVar.mo183908h());
        m207628a(pickChatViewData, chat);
        return pickChatViewData;
    }
}
