package com.ss.android.lark.threadwindow.p2760a.p2762b;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.response.C34021b;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import com.ss.android.lark.threadwindow.p2760a.p2763c.C56029a;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threadwindow.a.b.e */
public class C56027e extends AbstractC33953b<ThreadInfo, C56029a> {

    /* renamed from: b */
    private final String f138539b;

    /* renamed from: c */
    private final AbstractC34230k f138540c = C32881i.m126556a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public String mo122968b() {
        return "ThreadWindow";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: a */
    public String mo122966a() {
        return this.f138539b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo122964a(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getPosition();
    }

    public C56027e(String str, Executor executor) {
        super(executor);
        this.f138539b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C56029a mo122967b(MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str) {
        boolean z2;
        if (messageFetchScene == MessageFetchScene.FIRST_SCREEN || messageFetchScene == MessageFetchScene.SPECIFIED_POSITION) {
            z2 = true;
        } else {
            z2 = false;
        }
        C34021b a = this.f138540c.mo121346a(this.f138539b, messageFetchScene, i, i2, i3, channelDataFetcherStrategy, i4, z, z2);
        if (a == null) {
            return null;
        }
        C56029a aVar = new C56029a(a.f87914a, a.f87915b, a.f87916c);
        C29990c.m110930b().mo134577e().mo120954a(a.f87918e, a.f87917d, a.f87919f);
        aVar.mo191065d(a.f87921h);
        aVar.mo191063a(a.f87920g);
        aVar.mo191064b(a.f87922i);
        return aVar;
    }
}
