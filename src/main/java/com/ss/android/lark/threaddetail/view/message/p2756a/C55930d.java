package com.ss.android.lark.threaddetail.view.message.p2756a;

import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.MergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.d */
public class C55930d implements AbstractC34028a<C33141d<ChatMessageVO<MergeForwardContentVO>, MergeForwardMessageCell.MergeForwardMessageViewHolder>> {

    /* renamed from: a */
    private final C55934b f138220a;

    /* renamed from: b */
    private final AbstractC55897p f138221b;

    /* renamed from: c */
    private final AbstractC36503q f138222c = C29990c.m110930b().mo134586n();

    /* renamed from: d */
    private final AbstractC36502p f138223d = C29990c.m110930b().af();

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ChatMessageVO<MergeForwardContentVO>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ChatMessageVO<MergeForwardContentVO>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        mo190676a((List<C34029b>) list, dVar);
    }

    public C55930d(C55934b bVar, AbstractC55897p pVar) {
        this.f138220a = bVar;
        this.f138221b = pVar;
    }

    /* renamed from: a */
    public void mo190676a(List<C34029b> list, C33141d<ChatMessageVO<MergeForwardContentVO>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        ChatMessageVO cVar = (ChatMessageVO) dVar.f85280b;
        MergeForwardContentVO hVar = (MergeForwardContentVO) ((ChatMessageVO) dVar.f85280b).mo121699g();
        View view = ((MergeForwardMessageCell.MergeForwardMessageViewHolder) dVar.f85279a).f146209n;
        if (this.f138223d.mo134683a()) {
            list.add(AbstractC55870a.CC.m217017a(this.f138221b, view, hVar, cVar.mo121681a()));
        }
    }
}
