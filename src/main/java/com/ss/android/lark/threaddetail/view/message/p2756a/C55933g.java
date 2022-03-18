package com.ss.android.lark.threaddetail.view.message.p2756a;

import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.g */
public class C55933g implements AbstractC34028a<C33141d<ChatMessageVO<ThreadMergeForwardContentVO>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder>> {

    /* renamed from: a */
    private final AbstractC55893n f138229a;

    /* renamed from: b */
    private final AbstractC36502p f138230b = C29990c.m110930b().af();

    public C55933g(AbstractC55893n nVar) {
        this.f138229a = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ChatMessageVO<ThreadMergeForwardContentVO>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        mo190682a((List<C34029b>) list, dVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.lark.chat.export.ui.b.b, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo120415a(C34029b bVar, C33141d<ChatMessageVO<ThreadMergeForwardContentVO>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        return mo190683a(bVar, (C33141d) dVar);
    }

    /* renamed from: a */
    public void mo190682a(List<C34029b> list, C33141d<ChatMessageVO<ThreadMergeForwardContentVO>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        if (this.f138230b.mo134683a()) {
            View view = ((ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder) dVar.f85279a).f146209n;
            list.add(AbstractC55870a.CC.m217017a(this.f138229a, view, (ThreadMergeForwardContentVO) ((ChatMessageVO) dVar.f85280b).mo121699g(), ((ChatMessageVO) dVar.f85280b).mo121681a()));
        }
    }

    /* renamed from: a */
    public boolean mo190683a(C34029b bVar, C33141d dVar) {
        if (bVar.f87966a == 0 || bVar.f87966a == 7 || bVar.f87966a == 9 || bVar.f87966a == 12 || bVar.f87966a == 15 || bVar.f87966a == 23 || bVar.f87966a == 25 || bVar.f87966a == 5 || bVar.f87966a == 16) {
            return true;
        }
        return false;
    }
}
