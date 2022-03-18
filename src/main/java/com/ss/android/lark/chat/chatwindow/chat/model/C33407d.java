package com.ss.android.lark.chat.chatwindow.chat.model;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.d */
public class C33407d extends AbstractC33953b<MessageInfo, ChatPageData> {

    /* renamed from: b */
    private final String f86030b;

    /* renamed from: c */
    private final IInnerMessageService f86031c = C32848e.m126401b();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public String mo122968b() {
        return "ChatWindow";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: a */
    public String mo122966a() {
        return this.f86030b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo122964a(MessageInfo messageInfo) {
        return messageInfo.getMessage().getPosition();
    }

    public C33407d(Executor executor, String str) {
        super(executor);
        this.f86030b = str;
    }

    /* renamed from: a */
    private void m129440a(MessageFetchScene messageFetchScene, List<MessageInfo> list) {
        if (messageFetchScene == MessageFetchScene.FIRST_SCREEN || messageFetchScene == MessageFetchScene.SPECIFIED_POSITION) {
            Log.m165389i("ChatWindow", "print first page data begin, scene:" + messageFetchScene.getDesc());
            Iterator<MessageInfo> it = list.iterator();
            while (it.hasNext()) {
                Log.m165389i("ChatWindow", "load message:" + it.next().getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ChatPageData mo122967b(MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str) {
        ChatMessageResponse a = this.f86031c.mo121079a(this.f86030b, messageFetchScene, i, i2, i3, i4, z, channelDataFetcherStrategy, str);
        if (a == null) {
            return null;
        }
        C29990c.m110930b().mo134577e().mo120954a(a.sdkCost, a.clientDataCost, a.netCosts);
        ChatPageData bVar = new ChatPageData(a.messageInfoList, a.invisiblePositions, a.missingPositions, a.messagesSyncPipeFinished);
        m129440a(messageFetchScene, a.messageInfoList);
        return bVar;
    }
}
