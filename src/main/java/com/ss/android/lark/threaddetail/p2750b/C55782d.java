package com.ss.android.lark.threaddetail.p2750b;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.response.C34020a;
import com.ss.android.lark.chat.service.impl.AbstractC34230k;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threaddetail.b.d */
public class C55782d extends AbstractC33953b<MessageInfo, C55781c> {

    /* renamed from: b */
    private AbstractC34230k f137613b = C32881i.m126556a();

    /* renamed from: c */
    private String f137614c;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: b */
    public String mo122968b() {
        return "ThreadDetailPageLoader";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.core.model.AbstractC33953b
    /* renamed from: a */
    public String mo122966a() {
        return this.f137614c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo122964a(MessageInfo messageInfo) {
        return messageInfo.getMessage().getThreadPosition();
    }

    public C55782d(String str, Executor executor) {
        super(executor);
        this.f137614c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55781c mo122967b(MessageFetchScene messageFetchScene, int i, int i2, int i3, int i4, boolean z, ChannelDataFetcherStrategy channelDataFetcherStrategy, String str) {
        C34020a a = this.f137613b.mo121345a(this.f137614c, messageFetchScene, i, i2, i3, channelDataFetcherStrategy, i4, z);
        if (a == null) {
            return null;
        }
        if (a.f87908b == null && CollectionUtils.isEmpty(a.f87907a)) {
            return null;
        }
        C55781c cVar = new C55781c(a.f87907a, a.f87909c, a.f87910d);
        cVar.mo190304a(a.f87908b);
        C29990c.m110930b().mo134577e().mo120954a(a.f87912f, a.f87911e, a.f87913g);
        return cVar;
    }
}
