package com.ss.android.lark.chat.chatwindow.chat.message;

import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.d */
public interface AbstractC33342d extends AbstractC33347e, IMessageContext {
    /* renamed from: a */
    void mo122534a(int[] iArr);

    /* renamed from: a */
    boolean mo122535a(AbsMessageVO aVar);

    /* renamed from: b */
    boolean mo122538b(AbsMessageVO aVar);

    /* renamed from: c */
    boolean mo122539c();

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: d */
    boolean mo122540d();

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: j */
    boolean mo122546j();

    /* renamed from: k */
    boolean mo122547k();

    /* renamed from: m */
    boolean mo122549m();

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33347e
    /* renamed from: n */
    Chat mo122550n();

    /* renamed from: o */
    C33973b mo122551o();

    /* renamed from: p */
    C33973b mo122552p();

    /* renamed from: q */
    boolean mo122553q();

    /* renamed from: r */
    boolean mo122554r();

    /* renamed from: s */
    int mo122555s();

    /* renamed from: t */
    OpenApp mo122556t();

    /* renamed from: u */
    int[] mo122557u();
}
