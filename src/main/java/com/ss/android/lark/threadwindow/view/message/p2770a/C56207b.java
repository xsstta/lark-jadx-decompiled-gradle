package com.ss.android.lark.threadwindow.view.message.p2770a;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.C55896o;
import com.ss.android.lark.threadwindow.view.p2767b.p2769b.AbstractC56156a;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.view.message.a.b */
public class C56207b implements AbstractC34028a<C33141d<ThreadMessageVO<ContentVO<?>>, AbstractC59010e>> {

    /* renamed from: a */
    private final AbstractC33342d f139096a;

    /* renamed from: b */
    private final AbstractC56156a f139097b;

    /* renamed from: c */
    private final AbstractC36502p f139098c = C29990c.m110930b().af();

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ThreadMessageVO<ContentVO<?>>, AbstractC59010e> dVar) {
        return true;
    }

    /* renamed from: a */
    private boolean m219175a(AbstractC33342d dVar) {
        return !DesktopUtil.m144301a((Context) dVar.mo122543g());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ThreadMessageVO<ContentVO<?>>, AbstractC59010e> dVar) {
        mo191557a((List<C34029b>) list, dVar);
    }

    public C56207b(AbstractC33342d dVar, AbstractC56156a aVar) {
        this.f139096a = dVar;
        this.f139097b = aVar;
    }

    /* renamed from: a */
    public void mo191557a(List<C34029b> list, C33141d<ThreadMessageVO<ContentVO<?>>, AbstractC59010e> dVar) {
        if ((((ThreadMessageVO) dVar.f85280b).mo121699g() instanceof BaseTextContentVO) && !C35247g.m137635b(((ThreadMessageVO) dVar.f85280b).mo121699g())) {
            ThreadMessageVO threadMessageVO = (ThreadMessageVO) dVar.f85280b;
            BaseTextContentVO baseTextContentVO = (BaseTextContentVO) ((ThreadMessageVO) dVar.f85280b).mo121699g();
            View view = dVar.f85279a.f146209n;
            if (this.f139098c.mo134683a()) {
                list.add(AbstractC55870a.CC.m217018a(this.f139097b, view, baseTextContentVO, threadMessageVO.mo121662H(), threadMessageVO.mo121673S()));
            }
            if (!m219175a(this.f139096a) || !(threadMessageVO.mo121699g() instanceof BaseTextContentVO)) {
                list.add(AbstractC55870a.CC.m217007a(this.f139097b, (AbsMessageVO<?>) threadMessageVO));
            } else {
                list.add(AbstractC55870a.CC.m217008a(new C55896o(this.f139096a.mo122543g()), threadMessageVO));
            }
            if (C29990c.m110930b().mo134586n().mo134685a("ai.chat.message.menu.search")) {
                list.add(AbstractC33142f.CC.m128059a(view, this.f139097b, dVar.f85280b));
            }
        }
    }
}
