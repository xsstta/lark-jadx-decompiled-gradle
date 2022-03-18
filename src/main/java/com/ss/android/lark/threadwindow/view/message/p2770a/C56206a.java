package com.ss.android.lark.threadwindow.view.message.p2770a;

import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.MergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.view.message.a.a */
public class C56206a implements AbstractC34028a<C33141d<ThreadMessageVO<ContentVO<?>>, MergeForwardMessageCell.MergeForwardMessageViewHolder>> {

    /* renamed from: a */
    private final AbstractC55893n f139094a;

    /* renamed from: b */
    private final AbstractC36502p f139095b = C29990c.m110930b().af();

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ThreadMessageVO<ContentVO<?>>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        return true;
    }

    public C56206a(AbstractC55893n nVar) {
        this.f139094a = nVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ThreadMessageVO<ContentVO<?>>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        mo191555a((List<C34029b>) list, dVar);
    }

    /* renamed from: a */
    public void mo191555a(List<C34029b> list, C33141d<ThreadMessageVO<ContentVO<?>>, MergeForwardMessageCell.MergeForwardMessageViewHolder> dVar) {
        if (this.f139095b.mo134683a()) {
            ThreadMessageVO threadMessageVO = (ThreadMessageVO) dVar.f85280b;
            View view = ((MergeForwardMessageCell.MergeForwardMessageViewHolder) dVar.f85279a).f146209n;
            list.add(AbstractC55870a.CC.m217018a(this.f139094a, view, (MergeForwardContentVO) ((ThreadMessageVO) dVar.f85280b).mo121699g(), threadMessageVO.mo121662H(), threadMessageVO.mo121673S()));
        }
    }
}
