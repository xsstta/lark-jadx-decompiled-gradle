package com.ss.android.lark.threadwindow.view.message.p2770a;

import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.view.message.a.c */
public class C56208c implements AbstractC34028a<C33141d<ThreadMessageVO<ContentVO<?>>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder>> {

    /* renamed from: a */
    private final AbstractC55893n f139099a;

    /* renamed from: b */
    private final AbstractC36502p f139100b = C29990c.m110930b().af();

    public C56208c(AbstractC55893n nVar) {
        this.f139099a = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ThreadMessageVO<ContentVO<?>>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        mo191559a((List<C34029b>) list, dVar);
    }

    /* renamed from: a */
    public void mo191559a(List<C34029b> list, C33141d<ThreadMessageVO<ContentVO<?>>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        if (this.f139100b.mo134683a()) {
            ThreadMessageVO threadMessageVO = (ThreadMessageVO) dVar.f85280b;
            View view = ((ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder) dVar.f85279a).f146209n;
            list.add(AbstractC55870a.CC.m217018a(this.f139099a, view, (ThreadMergeForwardContentVO) ((ThreadMessageVO) dVar.f85280b).mo121699g(), threadMessageVO.mo121662H(), threadMessageVO.mo121673S()));
        }
    }

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ThreadMessageVO<ContentVO<?>>, ThreadMergeForwardMessageCell.ThreadMergeForwardViewHolder> dVar) {
        if (bVar.f87966a == 0 || bVar.f87966a == 7 || bVar.f87966a == 9 || bVar.f87966a == 12 || bVar.f87966a == 15 || bVar.f87966a == 23 || bVar.f87966a == 25 || bVar.f87966a == 5 || bVar.f87966a == 16 || bVar.f87966a == 14) {
            return true;
        }
        return false;
    }
}
