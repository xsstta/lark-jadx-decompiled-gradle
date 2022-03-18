package com.ss.android.lark.threadwindow.view.message;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33221c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.threadwindow.view.message.c */
public class C56210c implements AbstractC33342d {

    /* renamed from: a */
    private final FragmentActivity f139107a;

    /* renamed from: b */
    private final C33221c f139108b = new C33221c();

    /* renamed from: c */
    private C33973b f139109c;

    /* renamed from: d */
    private int f139110d;

    /* renamed from: e */
    private final AbstractC56211a f139111e;

    /* renamed from: f */
    private int[] f139112f;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.c$a */
    public interface AbstractC56211a {
        Chat getChat();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public boolean mo122535a(AbsMessageVO aVar) {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: b */
    public boolean mo122538b(AbsMessageVO aVar) {
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: c */
    public boolean mo122539c() {
        return true;
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
        return false;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: o */
    public C33973b mo122551o() {
        return null;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: q */
    public boolean mo122553q() {
        return false;
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

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: v */
    public boolean mo122558v() {
        return true;
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
        return this.f139107a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: p */
    public C33973b mo122552p() {
        return this.f139109c;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: s */
    public int mo122555s() {
        return this.f139110d;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: u */
    public int[] mo122557u() {
        return this.f139112f;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33347e, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: n */
    public Chat mo122550n() {
        return this.f139111e.getChat();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: e */
    public boolean mo122541e() {
        Chat n = mo122550n();
        if (n == null || !n.isSuper()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: f */
    public boolean mo122542f() {
        Chat n = mo122550n();
        if (n == null || !n.isMeeting()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: h */
    public String mo122544h() {
        Chat n = mo122550n();
        if (n == null) {
            return "";
        }
        return n.getId();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: i */
    public boolean mo122545i() {
        Chat n = mo122550n();
        if (n == null || !n.isP2PChat()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: j */
    public boolean mo122546j() {
        Chat n = mo122550n();
        if (n == null || !n.isSecret()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: d */
    public boolean mo122540d() {
        Chat n = mo122550n();
        if (n == null || n.getType() != Chat.Type.GROUP) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo191562a(int i) {
        this.f139110d = i;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public void mo122534a(int[] iArr) {
        this.f139112f = iArr;
    }

    /* renamed from: a */
    public void mo191563a(ChatChatter chatChatter) {
        if (chatChatter != null) {
            this.f139109c = this.f139108b.mo122491a(chatChatter);
        }
    }

    public C56210c(FragmentActivity fragmentActivity, AbstractC56211a aVar) {
        this.f139111e = aVar;
        this.f139107a = fragmentActivity;
    }
}
