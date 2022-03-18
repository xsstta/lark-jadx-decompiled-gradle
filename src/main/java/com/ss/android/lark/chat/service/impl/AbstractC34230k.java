package com.ss.android.lark.chat.service.impl;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.IThreadService;
import com.ss.android.lark.biz.im.api.ThreadStateInfo;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.response.C34020a;
import com.ss.android.lark.chat.entity.response.C34021b;
import com.ss.android.lark.chat.entity.response.C34022c;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.k */
public interface AbstractC34230k extends IThreadService {
    /* renamed from: a */
    C34020a mo121345a(String str, MessageFetchScene messageFetchScene, int i, int i2, int i3, ChannelDataFetcherStrategy channelDataFetcherStrategy, int i4, boolean z);

    /* renamed from: a */
    C34021b mo121346a(String str, MessageFetchScene messageFetchScene, int i, int i2, int i3, ChannelDataFetcherStrategy channelDataFetcherStrategy, int i4, boolean z, boolean z2);

    /* renamed from: a */
    C34021b mo121347a(String str, List<Integer> list);

    /* renamed from: a */
    C34022c mo121348a(String str, String str2, MessageFetchScene messageFetchScene, String str3, int i, int i2);

    /* renamed from: a */
    C34022c mo121349a(String str, String str2, MessageFetchScene messageFetchScene, String str3, int i, int i2, List<String> list);

    /* renamed from: a */
    void mo121351a(String str, long j);

    /* renamed from: a */
    void mo121352a(String str, ThreadStateInfo.ThreadState threadState, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo121353a(String str, boolean z, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: b */
    C34020a mo121354b(String str, List<Integer> list);
}
