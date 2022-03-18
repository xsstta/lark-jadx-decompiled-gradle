package com.ss.android.lark.threaddetail.view.message.p2756a;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.C55896o;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a.e */
public class C55931e implements AbstractC34028a<C33141d<ChatMessageVO<ContentVO<?>>, AbstractC59010e>> {

    /* renamed from: a */
    private final C55934b f138224a;

    /* renamed from: b */
    private final AbstractC55897p f138225b;

    /* renamed from: c */
    private final AbstractC36502p f138226c = C29990c.m110930b().af();

    /* renamed from: a */
    public boolean mo120415a(C34029b bVar, C33141d<ChatMessageVO<ContentVO<?>>, AbstractC59010e> dVar) {
        return true;
    }

    /* renamed from: a */
    private boolean m217280a(AbstractC33342d dVar) {
        return !DesktopUtil.m144301a((Context) dVar.mo122543g());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, java.lang.Object] */
    @Override // com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo120413a(List list, C33141d<ChatMessageVO<ContentVO<?>>, AbstractC59010e> dVar) {
        mo190678a((List<C34029b>) list, dVar);
    }

    public C55931e(C55934b bVar, AbstractC55897p pVar) {
        this.f138224a = bVar;
        this.f138225b = pVar;
    }

    /* renamed from: a */
    public void mo190678a(List<C34029b> list, C33141d<ChatMessageVO<ContentVO<?>>, AbstractC59010e> dVar) {
        if ((((ChatMessageVO) dVar.f85280b).mo121699g() instanceof BaseTextContentVO) && !C35247g.m137635b(((ChatMessageVO) dVar.f85280b).mo121699g())) {
            ChatMessageVO cVar = (ChatMessageVO) dVar.f85280b;
            BaseTextContentVO baseTextContentVO = (BaseTextContentVO) ((ChatMessageVO) dVar.f85280b).mo121699g();
            View view = dVar.f85279a.f146209n;
            if (this.f138226c.mo134683a()) {
                list.add(AbstractC55870a.CC.m217017a(this.f138225b, view, baseTextContentVO, cVar.mo121681a()));
            }
            if (!m217280a(this.f138224a) || !(cVar.mo121699g() instanceof BaseTextContentVO)) {
                list.add(AbstractC55870a.CC.m217007a(this.f138225b, (AbsMessageVO<?>) cVar));
            } else {
                list.add(AbstractC55870a.CC.m217008a(new C55896o(this.f138224a.mo122543g()), cVar));
            }
            if (C29990c.m110930b().mo134586n().mo134685a("ai.chat.message.menu.search")) {
                list.add(AbstractC33142f.CC.m128059a(view, this.f138225b, cVar));
            }
        }
    }
}
