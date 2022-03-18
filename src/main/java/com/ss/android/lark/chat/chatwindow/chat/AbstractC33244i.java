package com.ss.android.lark.chat.chatwindow.chat;

import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.OpenApp;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.p1603a.C32929c;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.chatwindow.chat.C33188c;
import com.ss.android.lark.chat.chatwindow.chat.menu.IMenuProviderHandler;
import com.ss.android.lark.chat.chatwindow.chat.menu.IMessageMenuProvider;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33088a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33090a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33091b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33093d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33094e;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33130s;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33095a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33097aa;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33099ab;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33139y;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IViewInChatMenuHandler;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.TakeActionMenuHandler;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import com.ss.android.lark.chat.p1605c.p1606a.AbstractC33010a;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.C44854a;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.i */
public abstract class AbstractC33244i extends AbstractC33083a implements IMenuProviderHandler, C33188c.AbstractC33189a, ICellHoverHandler<ChatMessageVO>, AbstractC59012g<ChatMessageVO> {

    /* renamed from: b */
    protected final AbstractC33342d f85548b;

    /* renamed from: c */
    protected final AbstractC33120i f85549c;

    /* renamed from: d */
    public AbstractC33246a f85550d;

    /* renamed from: e */
    protected boolean f85551e = C29990c.m110930b().mo134586n().mo134685a("im.message.use_new_message_menu");

    /* renamed from: f */
    private final RecyclerView f85552f;

    /* renamed from: g */
    private C33097aa f85553g;

    /* renamed from: h */
    private List<IMessageMenuProvider> f85554h = new ArrayList();

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.i$a */
    public interface AbstractC33246a {
        /* renamed from: a */
        ActionContext.PageType mo122586a();

        /* renamed from: a */
        MessageInfo mo122587a(String str);

        /* renamed from: b */
        AbstractC33302l mo122588b();

        /* renamed from: c */
        Chatter mo122589c();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.menu.IMenuProviderHandler
    /* renamed from: a */
    public void mo122257a(IMessageMenuProvider cVar) {
        this.f85554h.add(cVar);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33188c.AbstractC33189a
    /* renamed from: a */
    public void mo122399a(ChatMessageVO cVar) {
        if (this.f85553g == null) {
            this.f85553g = new C33097aa(this.f85548b.mo122543g(), this.f85548b.mo122544h(), this.f85548b);
        }
        this.f85553g.mo122266a(cVar.mo121681a(), "THUMBSUP", 3);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33188c.AbstractC33189a
    /* renamed from: a */
    public void mo122400a(String str, int i) {
        this.f85549c.mo121938a(str, i);
    }

    /* renamed from: a */
    public void m128547b(C34029b bVar, ChatMessageVO<?> cVar) {
        if (bVar.f87968c == 1) {
            if (this.f85553g == null) {
                this.f85553g = new C33097aa(this.f85548b.mo122543g(), this.f85548b.mo122544h(), this.f85548b);
            }
            this.f85553g.mo122266a(cVar.mo121681a(), bVar.f87967b, bVar.f87975j);
        } else if (bVar.f87968c == 0 && bVar.f87974i != null) {
            bVar.f87974i.onSelected(bVar);
        }
    }

    /* renamed from: b */
    private boolean m128549b() {
        return C29990c.m110930b().mo134519R().mo134474b();
    }

    /* renamed from: c */
    private boolean m128551c() {
        if (!C29990c.m110930b().ab().mo134600a("chat.messageAction")) {
            return false;
        }
        return C29990c.m110930b().mo134586n().mo134685a("lark.message_action");
    }

    /* renamed from: a */
    private boolean m128544a() {
        AbstractC33342d dVar = this.f85548b;
        if (dVar == null || dVar.mo122550n() == null) {
            return false;
        }
        return this.f85548b.mo122550n().isCrossWithKa();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC32926a m128537a(C32930d.C32934c cVar) {
        return new C33088a(cVar);
    }

    /* renamed from: a */
    private AbstractC34028a<C33141d> m128538a(AbstractC59004b bVar) {
        if (bVar instanceof AbstractC34028a) {
            return (AbstractC34028a) bVar;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m128548b(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
        C33240h.m128531a().mo122574a(false);
    }

    /* renamed from: b */
    private boolean m128550b(AbstractC33342d dVar) {
        if (dVar.mo122556t() == null || dVar.mo122556t().getChatable() == null || dVar.mo122556t().getChatable() != OpenApp.Chatable.UNCHATABLE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m128542a(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
        C33240h.m128531a().mo122574a(false);
    }

    /* renamed from: a */
    private boolean m128545a(AbstractC33342d dVar) {
        if (dVar.mo122556t() == null || dVar.mo122556t().getState() == null || dVar.mo122556t().getState() == OpenApp.State.USABLE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m128536a(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m128546b(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public ActionContext mo122582e(AbstractC59004b bVar, AbstractC59010e eVar, final ChatMessageVO cVar) {
        return new AbstractC33010a((AbstractView$OnClickListenerC59005c) bVar, (C59008d) eVar, this.f85550d.mo122586a(), this.f85548b, this.f85549c) {
            /* class com.ss.android.lark.chat.chatwindow.chat.AbstractC33244i.C332451 */

            /* renamed from: n */
            public ChatMessageVO<?> mo106788h() {
                return cVar;
            }

            @Override // com.ss.android.lark.biz.im.extension.ActionContext
            /* renamed from: k */
            public Chatter mo106791k() {
                return AbstractC33244i.this.f85550d.mo122589c();
            }

            /* renamed from: o */
            public MessageInfo mo106789i() {
                return AbstractC33244i.this.f85550d.mo122587a(cVar.mo121681a());
            }

            @Override // com.ss.android.lark.chat.message_menu.provider.ChatMutePlayActionProvider.MutePlayContext
            /* renamed from: p */
            public AbstractC33302l mo121963p() {
                return AbstractC33244i.this.f85550d.mo122588b();
            }

            @Override // com.ss.android.lark.biz.im.extension.ActionContext
            /* renamed from: j */
            public Message mo106790j() {
                if (mo106789i() == null) {
                    return null;
                }
                return mo106789i().getMessage();
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m128539a(ChatMessageVO cVar, ActionContext actionContext, List list) {
        if (!cVar.mo121698f() && !C34438a.m133578a(cVar)) {
            list.addAll(MessageActionManager.f84892a.mo121931a(actionContext));
            Collections.sort(list, $$Lambda$i$QQQSLNaSjyuGHcqmVWE_pFqRWxk.INSTANCE);
        }
    }

    /* renamed from: d */
    public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        C32930d.C32932a aVar;
        if (this.f85551e) {
            aVar = mo122583f(bVar, eVar, cVar);
        } else {
            aVar = mo122579b(bVar, eVar, cVar, (AbstractC32928b<ChatMessageVO<?>>) null);
        }
        if (aVar == null) {
            return false;
        }
        C32930d a = aVar.mo121611a();
        if (!C33240h.m128531a().mo122576c()) {
            Rect rect = new Rect();
            eVar.f146209n.getGlobalVisibleRect(rect);
            a.mo121592a(rect);
        } else {
            a.mo121591a();
        }
        Map<String, ? extends Object> a2 = ChatParamUtils.f88665a.mo126912a(cVar);
        ChatHitPointNew.f135660c.mo187384a(this.f85548b.mo122550n(), "msg_press", "im_msg_menu_view", a2);
        ChatHitPointNew.f135660c.mo187385a(this.f85548b.mo122550n(), a2);
        C54970a.m213420a(cVar, a2);
        if (a.mo121599e()) {
            eVar.f146209n.setSelected(true);
        }
        return a.mo121599e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C32930d.C32932a mo122583f(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        Log.m165389i("MessageCellClickHandler", "use new message menu");
        if (this.f85548b.mo122550n() == null) {
            return null;
        }
        ActionContext e = mo122582e(bVar, eVar, cVar);
        $$Lambda$yLIEDI1ddNOiLc12swp2jq9u6L4 r0 = $$Lambda$yLIEDI1ddNOiLc12swp2jq9u6L4.INSTANCE;
        $$Lambda$i$EmJ_Ne426V8RusZfXoEXwzSWyds r1 = new C32930d.AbstractC32937f(e) {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$i$EmJ_Ne426V8RusZfXoEXwzSWyds */
            public final /* synthetic */ ActionContext f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC33244i.m128539a(ChatMessageVO.this, this.f$1, list);
            }
        };
        C32930d.C32932a a = new C32930d.C32932a(this.f85548b.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) r0).mo121600a(0, this.f85548b.mo122555s()).mo121610a(this.f85548b.mo122557u()).mo121601a((View) this.f85552f).mo121609a(false).mo121606a((C32930d.AbstractC32937f) r1).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(cVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$i$v2JnJ9YK3s9HR4rhxhEJZHtbrM0 */
            public final /* synthetic */ ChatMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC33244i.this.m128540a((AbstractC33244i) this.f$1, (ChatMessageVO) bVar);
            }
        }).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$i$IcyjWspvBJXMEw3cgbHxSw8_eQg */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC33244i.m128542a(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }

    public AbstractC33244i(RecyclerView recyclerView, AbstractC33342d dVar, AbstractC33120i iVar, AbstractC33246a aVar) {
        this.f85548b = dVar;
        this.f85552f = recyclerView;
        this.f85549c = iVar;
        this.f85550d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m128541a(List<C34029b> list, AbstractC34028a<C33141d> aVar, AbstractC59010e eVar, ChatMessageVO<?> cVar) {
        if (this.f85548b.mo122550n() != null && !cVar.mo121698f() && !C34438a.m133578a((ChatMessageVO) cVar)) {
            FragmentActivity g = this.f85548b.mo122543g();
            C33141d dVar = new C33141d(eVar, cVar);
            boolean z = false;
            list.add(C34029b.m131930a().mo126127a(0).mo126131a());
            if (!this.f85548b.mo122550n().isOnCall() && C29990c.m110930b().mo134595w().mo134365c(this.f85548b.mo122550n())) {
                list.add(AbstractC33142f.CC.m128063a((AbstractC33116e) this.f85549c, cVar.mo121681a()));
            }
            list.add(AbstractC33142f.CC.m128070a((AbstractC33126o) this.f85549c, cVar.mo121681a(), eVar.mo200148l()));
            list.add(AbstractC33142f.CC.m128064a((AbstractC33117f) this.f85549c, cVar.mo121681a()));
            if (this.f85548b.mo122559w()) {
                list.add(AbstractC33142f.CC.m128077a((IViewInChatMenuHandler) this.f85549c, cVar.mo121692b(), cVar.mo121717y()));
            }
            list.add(AbstractC33142f.CC.m128071a((AbstractC33127p) this.f85549c, cVar.mo121681a()));
            list.add(AbstractC33142f.CC.m128066a(this.f85549c, eVar.mo200148l()));
            if (!this.f85548b.mo122550n().isOnCall() && C29990c.m110930b().mo134595w().mo134363b(this.f85548b.mo122550n())) {
                if (cVar.mo121659E() != null) {
                    z = true;
                }
                list.add(AbstractC33142f.CC.m128078a(z, this.f85549c, cVar.mo121681a()));
            }
            list.add(AbstractC33142f.CC.m128069a(new C33099ab(g), cVar));
            if (m128549b() && C34352r.m133233a(this.f85548b.mo122541e(), cVar.mo121710r(), cVar.ai(), cVar.mo121698f()) && !m128544a()) {
                list.add(AbstractC33142f.CC.m128073a((AbstractC33130s) this.f85549c, cVar.mo121681a(), cVar.mo121717y()));
            }
            if (C44854a.m177784a(cVar.mo121710r(), this.f85548b)) {
                list.add(AbstractC33142f.CC.m128058a(dVar.f85279a.f146209n, new C33139y(), dVar.f85280b, this.f85548b.mo122550n()));
            }
            list.add(AbstractC33142f.CC.m128062a(new C33095a(g), cVar));
            if (m128551c()) {
                list.add(AbstractC33142f.CC.m128074a(new TakeActionMenuHandler(g), this.f85548b.mo122544h(), cVar.mo121681a(), cVar.mo121710r()));
            }
            for (IMessageMenuProvider cVar2 : this.f85554h) {
                if (cVar2.mo122172g()) {
                    list.add(cVar2.mo122161a(this.f85549c, eVar, cVar));
                }
            }
            aVar.mo120413a(list, dVar);
            Collections.sort(list, $$Lambda$i$co4TiZ0jHQCMzLyhmqlvZ5q0euE.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C32930d.C32932a mo122579b(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, AbstractC32928b<ChatMessageVO<?>> bVar2) {
        boolean z;
        boolean z2;
        String str;
        AbstractC34028a<C33141d> a = m128538a(bVar);
        if (a == null) {
            return null;
        }
        C32929c a2 = new C32929c(cVar).mo121589a(new C33093d()).mo121589a(new C33094e(a, new C33141d(eVar, cVar))).mo121589a(new C33090a(!this.f85548b.mo122550n().isChatable(), this.f85548b.mo122546j(), m128545a(this.f85548b), m128550b(this.f85548b)));
        if (this.f85548b.mo122540d() || !this.f85548b.mo122551o().mo124224l()) {
            z = false;
        } else {
            z = true;
        }
        boolean a3 = C34339g.m133167a(this.f85548b.mo122550n());
        if (this.f85548b.mo122540d() || !this.f85548b.mo122551o().mo124225m()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean r = this.f85548b.mo122554r();
        if (this.f85548b.mo122540d()) {
            str = "";
        } else {
            str = this.f85548b.mo122551o().mo124202c();
        }
        C32929c a4 = a2.mo121589a(new C33091b(z, a3, z2, r, str, this.f85548b.mo122550n()));
        for (IMessageMenuProvider cVar2 : this.f85554h) {
            if (cVar2.mo122172g()) {
                a4.mo121589a(cVar2.mo122171f());
            }
        }
        if (bVar2 != null) {
            a4.mo121589a(bVar2);
        }
        C32930d.C32932a a5 = new C32930d.C32932a(this.f85548b.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$i$11S9zbRnl7rdUaMaB1rzcHNngA.INSTANCE).mo121600a(0, this.f85548b.mo122555s()).mo121610a(this.f85548b.mo122557u()).mo121601a((View) this.f85552f).mo121603a((C32930d.AbstractC32933b) a4).mo121609a(false).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(a, eVar, cVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$i$O_k4s1BRgALUW_DwIFvjH6xqERo */
            public final /* synthetic */ AbstractC34028a f$1;
            public final /* synthetic */ AbstractC59010e f$2;
            public final /* synthetic */ ChatMessageVO f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC33244i.this.m128541a((AbstractC33244i) this.f$1, (AbstractC34028a) this.f$2, (AbstractC59010e) this.f$3, (ChatMessageVO) list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(cVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$i$ykHLrj9_Sbk0MZ_2htY7rOWOD9k */
            public final /* synthetic */ ChatMessageVO f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC33244i.this.m128547b((AbstractC33244i) this.f$1, (ChatMessageVO) bVar);
            }
        }).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$i$wmRcB0Fwa2pDQpZgTWJ9E6u9ZPE */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC33244i.m128548b(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a5.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.chat.chatwindow.chat.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33188c.AbstractC33189a
    /* renamed from: a */
    public C32930d.C32932a mo122398a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, AbstractC32928b<ChatMessageVO<?>> bVar2) {
        return mo122579b(bVar, eVar, cVar, bVar2);
    }
}
