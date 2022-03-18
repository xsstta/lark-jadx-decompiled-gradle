package com.ss.android.lark.chat.core.model;

import com.ss.android.lark.chat.core.model.PageLoader;

/* renamed from: com.ss.android.lark.chat.core.model.h */
public class C33963h extends PageLoader.C33949b {

    /* renamed from: a */
    public MessageFetchScene f87553a;

    /* renamed from: b */
    public ChannelDataFetcherStrategy f87554b;

    public C33963h(PageLoader.AbstractC33950c cVar, int i) {
        super(cVar, i);
        this.f87554b = ChannelDataFetcherStrategy.SYNC_SERVER_DATA;
    }

    public C33963h(int i, int i2, MessageFetchScene messageFetchScene) {
        super(i, i2);
        this.f87554b = ChannelDataFetcherStrategy.SYNC_SERVER_DATA;
        this.f87553a = messageFetchScene;
    }

    public C33963h(int i, int i2, MessageFetchScene messageFetchScene, ChannelDataFetcherStrategy channelDataFetcherStrategy) {
        this(i, i2, messageFetchScene);
        this.f87554b = channelDataFetcherStrategy;
    }
}
