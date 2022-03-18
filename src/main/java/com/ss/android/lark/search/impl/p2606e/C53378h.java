package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchMessageViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;

/* renamed from: com.ss.android.lark.search.impl.e.h */
public class C53378h extends AbstractC53371a<SearchMessageViewData, SearchMessageInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchMessageViewData mo182051a(SearchMessageInfo searchMessageInfo) {
        return new SearchMessageViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchMessageViewData searchMessageViewData, SearchMessageInfo searchMessageInfo) {
        searchMessageViewData.setMessageId(searchMessageInfo.getId());
        searchMessageViewData.setChatId(searchMessageInfo.getChatId());
        searchMessageViewData.setMsgType(searchMessageInfo.getMsgType());
        searchMessageViewData.setUpdateTime(searchMessageInfo.getUpdateTime());
        searchMessageViewData.setPosition(searchMessageInfo.getPosition());
        searchMessageViewData.setThreadId(searchMessageInfo.getThreadId());
        searchMessageViewData.setMessageThreadPosition(searchMessageInfo.getMessageThreadPosition());
        searchMessageViewData.setThreadChatPosition(searchMessageInfo.getThreadChatPosition());
        searchMessageViewData.setFromName(searchMessageInfo.getFromName());
        searchMessageViewData.setFromId(searchMessageInfo.getFromId());
        searchMessageViewData.setFromAvatarKey(searchMessageInfo.getFromAvatarKey());
        searchMessageViewData.setBotId(searchMessageInfo.getP2pBotId());
        searchMessageViewData.setMessageDocInfoList(searchMessageInfo.getMessageDocInfoList());
        searchMessageViewData.setP2pChat(searchMessageInfo.isP2pChat());
        searchMessageViewData.setP2pChatterId(searchMessageInfo.getP2pChatterId());
    }
}
