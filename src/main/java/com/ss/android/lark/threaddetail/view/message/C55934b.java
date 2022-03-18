package com.ss.android.lark.threaddetail.view.message;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.threaddetail.view.C55906d;
import com.ss.android.lark.widget.recyclerview.C58984d;

/* renamed from: com.ss.android.lark.threaddetail.view.message.b */
public class C55934b implements AbstractC33342d {

    /* renamed from: a */
    private final AbstractC55935a f138231a;

    /* renamed from: b */
    private final FragmentActivity f138232b;

    /* renamed from: c */
    private final AbstractC55936b f138233c;

    /* renamed from: d */
    private C58984d f138234d;

    /* renamed from: e */
    private final C55906d f138235e;

    /* renamed from: f */
    private int[] f138236f;

    /* renamed from: com.ss.android.lark.threaddetail.view.message.b$a */
    public interface AbstractC55935a {
        Chat getChat();
    }

    /* renamed from: com.ss.android.lark.threaddetail.view.message.b$b */
    public interface AbstractC55936b {
        String getThreadId();
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
    /* renamed from: s */
    public int mo122555s() {
        return 0;
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
        return true;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: g */
    public FragmentActivity mo122543g() {
        return this.f138232b;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: u */
    public int[] mo122557u() {
        return this.f138236f;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33347e, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: n */
    public Chat mo122550n() {
        return this.f138231a.getChat();
    }

    /* renamed from: a */
    public String mo190684a() {
        AbstractC55936b bVar = this.f138233c;
        if (bVar != null) {
            return bVar.getThreadId();
        }
        return "";
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

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: q */
    public boolean mo122553q() {
        C58984d dVar = this.f138234d;
        if (dVar == null || !dVar.mo200107c()) {
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

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: h */
    public String mo122544h() {
        if (mo122550n() == null) {
            return "";
        }
        return mo122550n().getId();
    }

    /* renamed from: a */
    public void mo190685a(C58984d dVar) {
        this.f138234d = dVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public void mo122534a(int[] iArr) {
        this.f138236f = iArr;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: b */
    public boolean mo122538b(AbsMessageVO aVar) {
        throw new RuntimeException("this method can not been used in ThreadDetailContext");
    }

    /* renamed from: a */
    public boolean mo190686a(int i) {
        C58984d dVar = this.f138234d;
        if (dVar == null || !dVar.mo200106b(this.f138235e.mo190569b(i))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public boolean mo122535a(AbsMessageVO aVar) {
        C58984d dVar = this.f138234d;
        if (dVar == null || !dVar.mo123399a(aVar)) {
            return false;
        }
        return true;
    }

    public C55934b(FragmentActivity fragmentActivity, C55906d dVar, AbstractC55935a aVar, AbstractC55936b bVar) {
        this.f138231a = aVar;
        this.f138233c = bVar;
        this.f138235e = dVar;
        this.f138232b = fragmentActivity;
    }
}
