package com.ss.android.lark.threadmergeforward;

import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.p1603a.C32929c;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import com.ss.android.lark.chat.message_menu.context.PrivateThreadForwardActionContext;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.threadmergeforward.c */
public abstract class AbstractC55960c implements AbstractC59012g<ChatMessageVO> {

    /* renamed from: a */
    public final AbstractC55897p f138281a;

    /* renamed from: b */
    public final AbstractC55962a f138282b;

    /* renamed from: c */
    protected boolean f138283c = C29990c.m110930b().mo134586n().mo134685a("im.message.use_new_message_menu");

    /* renamed from: d */
    private final C55934b f138284d;

    /* renamed from: e */
    private final RecyclerView f138285e;

    /* renamed from: com.ss.android.lark.threadmergeforward.c$a */
    public interface AbstractC55962a {
        /* renamed from: a */
        MessageInfo mo190720a(String str);
    }

    /* renamed from: a */
    public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        C32930d.C32932a aVar;
        if (this.f138284d.mo122553q()) {
            return false;
        }
        if (this.f138283c) {
            aVar = m217460a(bVar, eVar, cVar, eVar.mo200148l());
        } else {
            aVar = m217461a(bVar, eVar, cVar, eVar.mo200148l(), null);
        }
        if (aVar == null) {
            return false;
        }
        C32930d a = aVar.mo121611a();
        a.mo121593a(eVar.f146209n);
        return a.mo121599e();
    }

    /* renamed from: a */
    private AbstractC34028a<C33141d> m217462a(AbstractC59004b bVar) {
        if (bVar instanceof AbstractC34028a) {
            return (AbstractC34028a) bVar;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m217471b(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m217467a(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m217459a(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m217469b(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m217464a(ChatMessageVO cVar, PrivateThreadForwardActionContext dVar, List list) {
        if (!cVar.mo121698f() && !C34438a.m133578a(cVar)) {
            list.addAll(MessageActionManager.f84892a.mo121931a(dVar));
            Collections.sort(list, $$Lambda$c$7jZtN50N6lvGfV0v4G8ZDiEjiZM.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m217470b(C34029b bVar, ChatMessageVO<?> cVar, int i) {
        if (bVar.f87968c == 0 && bVar.f87974i != null) {
            bVar.f87974i.onSelected(bVar);
        }
    }

    public AbstractC55960c(C55934b bVar, RecyclerView recyclerView, AbstractC55897p pVar, AbstractC55962a aVar) {
        this.f138284d = bVar;
        this.f138285e = recyclerView;
        this.f138281a = pVar;
        this.f138282b = aVar;
    }

    /* renamed from: a */
    private C32930d.C32932a m217460a(AbstractC59004b bVar, AbstractC59010e eVar, final ChatMessageVO cVar, int i) {
        Log.i("PriThreadForwardClick", "use new message menu");
        C32930d.C32932a a = new C32930d.C32932a(this.f138284d.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$yLIEDI1ddNOiLc12swp2jq9u6L4.INSTANCE).mo121601a((View) this.f138285e).mo121609a(false).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(new PrivateThreadForwardActionContext((AbstractView$OnClickListenerC59005c) bVar, (C59008d) eVar, this.f138284d, this.f138281a) {
            /* class com.ss.android.lark.threadmergeforward.AbstractC55960c.C559611 */

            @Override // com.ss.android.lark.biz.im.extension.ActionContext
            /* renamed from: h */
            public AbsMessageVO<?> mo106788h() {
                return cVar;
            }

            @Override // com.ss.android.lark.biz.im.extension.ActionContext
            /* renamed from: j */
            public Message mo106790j() {
                MessageInfo n = mo106789i();
                if (n == null) {
                    return null;
                }
                return n.getMessage();
            }

            /* renamed from: n */
            public MessageInfo mo106789i() {
                return AbstractC55960c.this.f138282b.mo190720a(cVar.mo121681a());
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a
            /* renamed from: a */
            public void mo190485a(ChatMessageVO cVar) {
                AbstractC55960c.this.f138281a.mo190485a(cVar);
            }
        }) {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$c$If0S8JBheLf6ndvQHuOZ8X1kLHk */
            public final /* synthetic */ PrivateThreadForwardActionContext f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC55960c.m217464a(ChatMessageVO.this, this.f$1, list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(cVar, i) {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$c$OMfE9n_0Qcj2K76LquvPlt0hkks */
            public final /* synthetic */ ChatMessageVO f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC55960c.this.m217463a((AbstractC55960c) this.f$1, (ChatMessageVO) this.f$2, (int) bVar);
            }
        }).mo121600a(0, this.f138284d.mo122555s()).mo121610a(this.f138284d.mo122557u()).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$c$ErWM7O17hAiqYXScyAE3qagZ3gY */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC55960c.m217467a(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m217465a(List<C34029b> list, AbstractC34028a<C33141d> aVar, AbstractC59010e eVar, ChatMessageVO<?> cVar) {
        C33141d dVar = new C33141d(eVar, cVar);
        String a = cVar.mo121681a();
        int l = eVar.mo200148l();
        list.add(AbstractC55870a.CC.m217009a((AbstractC55880e) this.f138281a, a, l));
        list.add(AbstractC55870a.CC.m217005a((AbstractC55876a) this.f138281a, (ChatMessageVO) cVar));
        list.add(AbstractC55870a.CC.m217010a(this.f138281a, l));
        aVar.mo120413a(list, dVar);
        Collections.sort(list, $$Lambda$c$jeLGnnGnsq7WS5dKCPGKZbT4f4U.INSTANCE);
    }

    /* renamed from: a */
    private C32930d.C32932a m217461a(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar, int i, AbstractC32928b<ChatMessageVO<?>> bVar2) {
        AbstractC34028a<C33141d> a = m217462a(bVar);
        if (a == null) {
            return null;
        }
        C32929c cVar2 = new C32929c(cVar);
        cVar2.mo121589a(new ThreadMergeForwardMenuFilter());
        C32930d.C32932a a2 = new C32930d.C32932a(this.f138284d.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$yLIEDI1ddNOiLc12swp2jq9u6L4.INSTANCE).mo121603a((C32930d.AbstractC32933b) cVar2).mo121601a((View) this.f138285e).mo121609a(false).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(a, eVar, cVar) {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$c$6c_UXDwiJY80iQIqW1eBG4IEQoU */
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
                AbstractC55960c.this.m217465a((AbstractC55960c) this.f$1, (AbstractC34028a) this.f$2, (AbstractC59010e) this.f$3, (ChatMessageVO) list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(cVar, i) {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$c$DLPbIcJjUE2ysoASxrVuBs4cxs0 */
            public final /* synthetic */ ChatMessageVO f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC55960c.this.m217470b(this.f$1, this.f$2, bVar);
            }
        }).mo121600a(0, this.f138284d.mo122555s()).mo121610a(this.f138284d.mo122557u()).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$c$8WbFtaXxUwN54vRgOEOP9OT3tDs */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC55960c.m217471b(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a2.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.threadmergeforward.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }
}
