package com.ss.android.lark.chat.service.impl;

import android.content.Context;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.service.IChatManisService;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IChatManisService.class)
public class ChatManisServiceImpl implements IChatManisService {
    private Context mContext;

    public ChatManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.chat.service.IChatManisService
    public void openChatByChatId(String str) {
        C35228b.m137564a().mo121114a(this.mContext, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.IPC).mo105929a());
    }

    @Override // com.ss.android.lark.chat.service.IChatManisService
    public void openChatByChatterId(String str) {
        C35228b.m137564a().mo121114a(this.mContext, ChatBundle.m109259a().mo105931b(str).mo105923a(ChatBundle.SourceType.IPC).mo105929a());
    }
}
