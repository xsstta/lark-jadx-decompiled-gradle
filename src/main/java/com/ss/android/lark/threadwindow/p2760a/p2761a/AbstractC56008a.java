package com.ss.android.lark.threadwindow.p2760a.p2761a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.threadwindow.a.a.a */
public abstract class AbstractC56008a extends AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>> implements AbstractC56014g {

    /* renamed from: a */
    private String f138491a;

    /* renamed from: i */
    private C56015h.AbstractC56017a f138492i;

    /* renamed from: j */
    private boolean f138493j;

    /* renamed from: k */
    private long f138494k = Long.MAX_VALUE;

    /* renamed from: l */
    private boolean f138495l = true;

    /* renamed from: m */
    private Context f138496m;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo122940b();

    /* renamed from: o */
    private boolean m217848o() {
        return !DesktopUtil.m144301a(UIHelper.getContext());
    }

    /* renamed from: a */
    public void mo191017a(long j) {
        this.f138494k = j;
    }

    /* renamed from: a */
    public void mo191019a(boolean z) {
        this.f138495l = z;
    }

    /* renamed from: b */
    public void mo191020b(String str) {
        this.f138491a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo122939b(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo122932a(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getBadgeCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122948e(ThreadInfo threadInfo) {
        if (this.f138493j) {
            this.f88882b.add(0, threadInfo);
        } else {
            this.f88882b.add(threadInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo122944c(ThreadInfo threadInfo) {
        if (this.f138492i.mo191045a() != mo122940b()) {
            return true;
        }
        String recallerId = threadInfo.mo126021c().getRecallerId();
        if (!TextUtils.isEmpty(recallerId)) {
            return recallerId.equals(this.f138491a);
        }
        return threadInfo.mo126021c().isFromMe();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo122949f(ThreadInfo threadInfo) {
        super.mo122949f(threadInfo);
        if (m217848o() && this.f138495l) {
            if (threadInfo.getMessage().getType() == Message.Type.TEXT || threadInfo.getMessage().getType() == Message.Type.POST) {
                ((BaseTextContent) threadInfo.getMessage().getContent()).setContentLayout(TextLayoutProcessor.m128385a(threadInfo, TextLayoutProcessor.m128387a().mo122463a(18), this.f138496m));
                if (threadInfo.getTranslateInfo() != null) {
                    ((BaseTextContent) threadInfo.getTranslateInfo().getTranslateContent()).setContentLayout(TextLayoutProcessor.m128385a(threadInfo, TextLayoutProcessor.m128387a().mo122463a(18).mo122483i(true), this.f138496m));
                }
            }
        }
    }

    public AbstractC56008a(AbstractExecutorC33962g gVar, AbstractC34417b.AbstractC34423e eVar, C56015h.AbstractC56017a aVar, Context context) {
        super(gVar, eVar);
        this.f138492i = aVar;
        this.f138493j = C56145l.m218886a();
        this.f138496m = context;
    }
}
