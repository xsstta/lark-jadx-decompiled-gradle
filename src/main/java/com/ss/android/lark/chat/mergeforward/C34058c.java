package com.ss.android.lark.chat.mergeforward;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.C58984d;

/* renamed from: com.ss.android.lark.chat.mergeforward.c */
public class C34058c implements AbstractC33342d {

    /* renamed from: a */
    private final FragmentActivity f88040a;

    /* renamed from: b */
    private int f88041b;

    /* renamed from: c */
    private C58984d f88042c;

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public void mo122534a(int[] iArr) {
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: c */
    public boolean mo122539c() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: d */
    public boolean mo122540d() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: e */
    public boolean mo122541e() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: f */
    public boolean mo122542f() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: h */
    public String mo122544h() {
        return "";
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: i */
    public boolean mo122545i() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: j */
    public boolean mo122546j() {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: k */
    public boolean mo122547k() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: l */
    public boolean mo122548l() {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: m */
    public boolean mo122549m() {
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33347e, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: n */
    public Chat mo122550n() {
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: o */
    public C33973b mo122551o() {
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: p */
    public C33973b mo122552p() {
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: r */
    public boolean mo122554r() {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: t */
    public OpenApp mo122556t() {
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: u */
    public int[] mo122557u() {
        return null;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: v */
    public boolean mo122558v() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: w */
    public boolean mo122559w() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: x */
    public boolean mo122560x() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: g */
    public FragmentActivity mo122543g() {
        return this.f88040a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: s */
    public int mo122555s() {
        return this.f88041b;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: q */
    public boolean mo122553q() {
        C58984d dVar = this.f88042c;
        if (dVar == null || !dVar.mo200107c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo126225a(int i) {
        this.f88041b = i;
    }

    public C34058c(FragmentActivity fragmentActivity) {
        this.f88040a = fragmentActivity;
    }

    /* renamed from: a */
    public void mo126226a(C58984d dVar) {
        this.f88042c = dVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: b */
    public boolean mo122538b(AbsMessageVO aVar) {
        C58984d dVar = this.f88042c;
        if (dVar == null || !dVar.mo200106b(aVar)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public boolean mo122535a(AbsMessageVO aVar) {
        C58984d dVar = this.f88042c;
        if (dVar == null || !dVar.mo123399a(aVar)) {
            return false;
        }
        return true;
    }
}
