package com.ss.android.lark.chat.chatwindow.chat;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33221c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.C58984d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.e */
public class C33234e implements AbstractC33342d {

    /* renamed from: a */
    private final FragmentActivity f85524a;

    /* renamed from: b */
    private final C33221c f85525b = new C33221c();

    /* renamed from: c */
    private Chat f85526c;

    /* renamed from: d */
    private C33973b f85527d;

    /* renamed from: e */
    private C33973b f85528e;

    /* renamed from: f */
    private int f85529f;

    /* renamed from: g */
    private C58984d f85530g;

    /* renamed from: h */
    private OpenApp f85531h;

    /* renamed from: i */
    private boolean f85532i;

    /* renamed from: j */
    private int[] f85533j;

    /* renamed from: k */
    private List<String> f85534k;

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: c */
    public boolean mo122539c() {
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: m */
    public boolean mo122549m() {
        return false;
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

    /* renamed from: a */
    public List<String> mo122525a() {
        return this.f85534k;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: g */
    public FragmentActivity mo122543g() {
        return this.f85524a;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33347e, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: n */
    public Chat mo122550n() {
        return this.f85526c;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: o */
    public C33973b mo122551o() {
        return this.f85528e;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: p */
    public C33973b mo122552p() {
        return this.f85527d;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: r */
    public boolean mo122554r() {
        return this.f85532i;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: s */
    public int mo122555s() {
        return this.f85529f;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: t */
    public OpenApp mo122556t() {
        return this.f85531h;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: u */
    public int[] mo122557u() {
        return this.f85533j;
    }

    /* renamed from: b */
    public void mo122536b() {
        List<String> list = this.f85534k;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: e */
    public boolean mo122541e() {
        return this.f85526c.isSuper();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: f */
    public boolean mo122542f() {
        return this.f85526c.isMeeting();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: h */
    public String mo122544h() {
        return this.f85526c.getId();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: i */
    public boolean mo122545i() {
        return this.f85526c.isP2PChat();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: j */
    public boolean mo122546j() {
        return this.f85526c.isSecret();
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: d */
    public boolean mo122540d() {
        if (this.f85526c.getType() == Chat.Type.GROUP) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext
    /* renamed from: l */
    public boolean mo122548l() {
        C33973b bVar = this.f85528e;
        if (bVar == null || !bVar.mo124225m()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: q */
    public boolean mo122553q() {
        C58984d dVar = this.f85530g;
        if (dVar == null || !dVar.mo200107c()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: k */
    public boolean mo122547k() {
        if (this.f85528e == null || !this.f85527d.mo124202c().equals(this.f85528e.mo124202c())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo122526a(int i) {
        this.f85529f = i;
    }

    public C33234e(FragmentActivity fragmentActivity) {
        this.f85524a = fragmentActivity;
    }

    /* renamed from: a */
    public void mo122527a(OpenApp openApp) {
        this.f85531h = openApp;
    }

    /* renamed from: b */
    public void mo122537b(ChatChatter chatChatter) {
        if (chatChatter != null) {
            this.f85528e = this.f85525b.mo122491a(chatChatter);
        }
    }

    /* renamed from: a */
    public void mo122528a(Chat chat) {
        this.f85526c = chat;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: b */
    public boolean mo122538b(AbsMessageVO aVar) {
        List<String> list;
        C58984d dVar = this.f85530g;
        if ((dVar == null || !dVar.mo200106b(aVar)) && ((list = this.f85534k) == null || !list.contains(aVar.mo121681a()))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo122529a(ChatChatter chatChatter) {
        if (chatChatter != null) {
            this.f85527d = this.f85525b.mo122491a(chatChatter);
        }
    }

    /* renamed from: a */
    public void mo122530a(C58984d dVar) {
        this.f85530g = dVar;
    }

    /* renamed from: a */
    public void mo122531a(String str) {
        List<String> list = this.f85534k;
        if (list != null) {
            list.remove(str);
        }
    }

    /* renamed from: a */
    public void mo122532a(List<String> list) {
        if (this.f85534k == null) {
            this.f85534k = new ArrayList();
        }
        this.f85534k.clear();
        this.f85534k.addAll(list);
    }

    /* renamed from: a */
    public void mo122533a(boolean z) {
        this.f85532i = z;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public void mo122534a(int[] iArr) {
        this.f85533j = iArr;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d
    /* renamed from: a */
    public boolean mo122535a(AbsMessageVO aVar) {
        C58984d dVar = this.f85530g;
        if (dVar == null || !dVar.mo123399a(aVar)) {
            return false;
        }
        return true;
    }

    public C33234e(FragmentActivity fragmentActivity, Chat chat) {
        this.f85526c = chat;
        this.f85524a = fragmentActivity;
    }
}
