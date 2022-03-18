package com.ss.android.lark.threaddetail.view;

import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.p1603a.C32929c;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.chatwindow.chat.AbstractC33083a;
import com.ss.android.lark.chat.chatwindow.chat.C33188c;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33093d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33094e;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33097aa;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import com.ss.android.lark.chat.message_menu.context.ThreadDetailActionContext;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPointNew;
import com.ss.android.lark.threaddetail.view.callback.IThreadDetailCallbackHub;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2753a.C55874a;
import com.ss.android.lark.threaddetail.view.p2752b.p2753a.C55875b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55886i;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55888k;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.e */
public abstract class AbstractC55909e extends AbstractC33083a implements C33188c.AbstractC33189a, ICellHoverHandler<ChatMessageVO>, AbstractC59012g<ChatMessageVO> {

    /* renamed from: b */
    public final AbstractC55897p f138131b;

    /* renamed from: c */
    public final IThreadDetailCallbackHub f138132c;

    /* renamed from: d */
    public final AbstractC55911a f138133d;

    /* renamed from: e */
    protected boolean f138134e = C29990c.m110930b().mo134586n().mo134685a("im.message.use_new_message_menu");

    /* renamed from: f */
    private final C55934b f138135f;

    /* renamed from: g */
    private final RecyclerView f138136g;

    /* renamed from: h */
    private C33097aa f138137h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.threaddetail.view.e$a */
    public interface AbstractC55911a {
        /* renamed from: a */
        MessageInfo mo190491a(String str);

        /* renamed from: a */
        Boolean mo190492a();

        /* renamed from: b */
        Boolean mo190493b(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo190494a(ChatMessageVO<?> cVar, String str, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo190495a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo190496a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo190497b();

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33188c.AbstractC33189a
    /* renamed from: a */
    public void mo122399a(ChatMessageVO cVar) {
        if (this.f138137h == null) {
            this.f138137h = new C33097aa(this.f138135f.mo122543g(), this.f138135f.mo122544h(), this.f138135f);
        }
        this.f138137h.mo122266a(cVar.mo121681a(), "THUMBSUP", 3);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33188c.AbstractC33189a
    /* renamed from: a */
    public void mo122400a(String str, int i) {
        this.f138131b.mo121955a(str);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.C33188c.AbstractC33189a
    /* renamed from: a */
    public C32930d.C32932a mo122398a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, AbstractC32928b<ChatMessageVO<?>> bVar2) {
        return m217161a(bVar, eVar, cVar, eVar.mo200148l(), bVar2);
    }

    /* renamed from: c */
    private boolean m217172c() {
        return C29990c.m110930b().mo134519R().mo134474b();
    }

    /* renamed from: d */
    private boolean m217173d() {
        C55934b bVar = this.f138135f;
        if (bVar == null || bVar.mo122550n() == null) {
            return false;
        }
        return this.f138135f.mo122550n().isCrossWithKa();
    }

    /* renamed from: a */
    private AbstractC34028a<C33141d> m217162a(AbstractC59004b bVar) {
        if (bVar instanceof AbstractC34028a) {
            return (AbstractC34028a) bVar;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m217171b(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m217167a(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m217159a(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m217169b(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m217163a(ThreadDetailActionContext fVar, List list) {
        list.addAll(MessageActionManager.f84892a.mo121931a(fVar));
        Collections.sort(list, $$Lambda$e$XcoXWf556XLA0VMuusxOgQEgI44.INSTANCE);
    }

    /* renamed from: d */
    public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        C32930d.C32932a aVar;
        if (this.f138135f.mo122553q()) {
            return false;
        }
        ThreadTopicHitPoint.f135906a.mo187715a(C29990c.m110930b().mo134515N().mo134394a());
        if (this.f138134e) {
            aVar = m217160a(bVar, eVar, cVar, eVar.mo200148l());
        } else {
            aVar = m217161a(bVar, eVar, cVar, eVar.mo200148l(), null);
        }
        if (aVar == null) {
            return false;
        }
        C32930d a = aVar.mo121611a();
        a.mo121593a(eVar.f146209n);
        ThreadTopicHitPointNew.f135908b.mo187753a(this.f138135f.mo122550n(), this.f138135f.mo190684a(), "msg_press", "im_msg_menu_view", ChatParamUtils.f88665a.mo126912a(cVar));
        return a.mo121599e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m217170b(C34029b bVar, ChatMessageVO<?> cVar, int i) {
        if (bVar.f87968c == 1) {
            mo190494a(cVar, bVar.f87967b, bVar.f87975j);
        } else if (bVar.f87968c == 0 && bVar.f87974i != null) {
            bVar.f87974i.onSelected(bVar);
        }
    }

    /* renamed from: a */
    private C32930d.C32932a m217160a(AbstractC59004b bVar, AbstractC59010e eVar, final ChatMessageVO cVar, int i) {
        Log.m165389i("ThreadDetailCellClickHandler", "use new message menu");
        C32930d.C32932a a = new C32930d.C32932a(this.f138135f.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$yLIEDI1ddNOiLc12swp2jq9u6L4.INSTANCE).mo121601a((View) this.f138136g).mo121609a(false).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$e$htnwk6FzvwVamn4ddUSCTrpaYw */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC55909e.m217163a(ThreadDetailActionContext.this, list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(cVar, i) {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$e$mtf1OAvEmq094QBVE8yktoJ17o */
            public final /* synthetic */ ChatMessageVO f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC55909e.this.m217164a((AbstractC55909e) this.f$1, (ChatMessageVO) this.f$2, (int) bVar);
            }
        }).mo121600a(0, this.f138135f.mo122555s()).mo121610a(this.f138135f.mo122557u()).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$e$7CgnGC4jCKH0OLPMxWzu697JE */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC55909e.m217167a(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m217165a(List<C34029b> list, AbstractC34028a<C33141d> aVar, AbstractC59010e eVar, ChatMessageVO<?> cVar) {
        list.add(C34029b.m131930a().mo126127a(0).mo126131a());
        C33141d dVar = new C33141d(eVar, cVar);
        String a = cVar.mo121681a();
        int l = eVar.mo200148l();
        list.add(AbstractC55870a.CC.m217013a(this.f138131b, a));
        list.add(AbstractC55870a.CC.m217009a((AbstractC55880e) this.f138131b, a, l));
        list.add(AbstractC55870a.CC.m217005a((AbstractC55876a) this.f138131b, (ChatMessageVO) cVar));
        list.add(AbstractC55870a.CC.m217012a((AbstractC55886i) this.f138131b, (ChatMessageVO) cVar));
        list.add(AbstractC55870a.CC.m217010a(this.f138131b, l));
        if (m217172c() && C34352r.m133233a(this.f138135f.mo122541e(), cVar.mo121710r(), cVar.ai(), cVar.mo121698f()) && !m217173d()) {
            list.add(AbstractC55870a.CC.m217014a((AbstractC55888k) this.f138131b, a, l));
        }
        aVar.mo120413a(list, dVar);
        Collections.sort(list, $$Lambda$e$AnjJ0Nxsmib39lYC_j6bbsaUAsk.INSTANCE);
    }

    public AbstractC55909e(C55934b bVar, RecyclerView recyclerView, AbstractC55897p pVar, IThreadDetailCallbackHub aVar, AbstractC55911a aVar2) {
        this.f138135f = bVar;
        this.f138136g = recyclerView;
        this.f138131b = pVar;
        this.f138132c = aVar;
        this.f138133d = aVar2;
    }

    /* renamed from: a */
    private C32930d.C32932a m217161a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, int i, AbstractC32928b<ChatMessageVO<?>> bVar2) {
        AbstractC34028a<C33141d> a = m217162a(bVar);
        if (a == null) {
            return null;
        }
        C32929c a2 = new C32929c(cVar).mo121589a(new C33093d()).mo121589a(new C33094e(a, new C33141d(eVar, cVar))).mo121589a(new C55874a(this.f138135f, C29990c.m110930b().mo134515N().mo134394a(), mo190497b())).mo121589a(new C55875b(mo190495a(), mo190496a(cVar.mo121681a())));
        if (bVar2 != null) {
            a2.mo121589a(bVar2);
        }
        C32930d.C32932a a3 = new C32930d.C32932a(this.f138135f.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$yLIEDI1ddNOiLc12swp2jq9u6L4.INSTANCE).mo121603a((C32930d.AbstractC32933b) a2).mo121601a((View) this.f138136g).mo121609a(false).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(a, eVar, cVar) {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$e$_FDnpwUaCA6vWqpktM8ExakT7xI */
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
                AbstractC55909e.this.m217165a((AbstractC55909e) this.f$1, (AbstractC34028a) this.f$2, (AbstractC59010e) this.f$3, (ChatMessageVO) list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(cVar, i) {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$e$2uAf_H1yhXjXl5EIKoxfJjMlW4 */
            public final /* synthetic */ ChatMessageVO f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC55909e.this.m217170b((AbstractC55909e) this.f$1, (ChatMessageVO) this.f$2, (int) bVar);
            }
        }).mo121600a(0, this.f138135f.mo122555s()).mo121610a(this.f138135f.mo122557u()).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$e$mi9QlG5CsXpRosDzPD8NJiqE__A */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC55909e.m217171b(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a3.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.threaddetail.view.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }
}
