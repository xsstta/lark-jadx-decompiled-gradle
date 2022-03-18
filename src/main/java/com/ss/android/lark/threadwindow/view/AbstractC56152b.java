package com.ss.android.lark.threadwindow.view;

import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.base.view.p1603a.C32929c;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.C33240h;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33088a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import com.ss.android.lark.chat.message_menu.context.ThreadActionContext;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56151b;
import com.ss.android.lark.threadwindow.view.p2767b.p2768a.C56154a;
import com.ss.android.lark.threadwindow.view.p2767b.p2768a.C56155b;
import com.ss.android.lark.threadwindow.view.p2767b.p2769b.AbstractC56156a;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.threadwindow.view.b */
public abstract class AbstractC56152b implements AbstractC59012g<ThreadMessageVO> {

    /* renamed from: a */
    private final AbstractC33342d f138885a;

    /* renamed from: b */
    public final AbstractC56156a f138886b;

    /* renamed from: c */
    public final AbstractC56151b f138887c;

    /* renamed from: d */
    protected boolean f138888d = C29990c.m110930b().mo134586n().mo134685a("im.message.use_new_message_menu");

    /* renamed from: e */
    private final RecyclerView f138889e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo191310a(String str, String str2, int i, int i2, String str3, int i3);

    /* renamed from: a */
    public void m218923b(C34029b bVar, ThreadMessageVO<?> threadMessageVO, int i) {
        if (bVar.f87968c == 1) {
            mo191310a(threadMessageVO.mo121662H(), bVar.f87967b, threadMessageVO.mo121673S(), i, threadMessageVO.af(), bVar.f87975j);
        } else if (bVar.f87968c == 0 && bVar.f87974i != null) {
            bVar.f87974i.onSelected(bVar);
        }
    }

    /* renamed from: a */
    private boolean m218919a(ThreadMessageVO<?> threadMessageVO) {
        if (threadMessageVO.mo121676V() == null) {
            return false;
        }
        return threadMessageVO.mo121676V().isCrossWithKa();
    }

    /* renamed from: a */
    private boolean m218918a() {
        return C29990c.m110930b().mo134519R().mo134474b();
    }

    /* renamed from: a */
    private AbstractC34028a<C33141d> m218912a(AbstractC59004b bVar) {
        if (bVar instanceof AbstractC34028a) {
            return (AbstractC34028a) bVar;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m218924b(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m218915a(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
        C33240h.m128531a().mo122575b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m218909a(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m218920b(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC32926a m218910a(ThreadMessageVO threadMessageVO, boolean z, C32930d.C32934c cVar) {
        return new C33088a(cVar, threadMessageVO.mo121665K(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC32926a m218921b(ThreadMessageVO threadMessageVO, boolean z, C32930d.C32934c cVar) {
        return new C33088a(cVar, threadMessageVO.mo121665K(), z);
    }

    /* renamed from: b */
    public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, ThreadMessageVO threadMessageVO) {
        C32930d.C32932a<Integer> aVar;
        if (this.f138888d) {
            aVar = m218922b(threadMessageVO, bVar, eVar, eVar.mo200148l(), false, false);
        } else {
            aVar = m218911a(threadMessageVO, bVar, eVar, eVar.mo200148l(), false, false);
        }
        if (aVar == null) {
            return false;
        }
        C32930d<Integer> a = aVar.mo121611a();
        a.mo121591a();
        Map<String, ? extends Object> a2 = ChatHitPointNew.f135660c.mo187377a(threadMessageVO);
        ChatHitPointNew.f135660c.mo187384a(this.f138885a.mo122550n(), "msg_press", "im_msg_menu_view", a2);
        ChatHitPointNew.f135660c.mo187385a(this.f138885a.mo122550n(), a2);
        C54970a.m213420a(threadMessageVO, a2);
        return a.mo121599e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m218917a(boolean z, ThreadActionContext eVar, List list) {
        if (z) {
            list.add(C34029b.m131930a().mo126127a(0).mo126131a());
        } else {
            list.addAll(MessageActionManager.f84892a.mo121931a(eVar));
        }
        Collections.sort(list, $$Lambda$b$TzcctdwK76AoOaUnF_GSoqambQ4.INSTANCE);
    }

    public AbstractC56152b(AbstractC33342d dVar, RecyclerView recyclerView, AbstractC56156a aVar, AbstractC56151b bVar) {
        this.f138885a = dVar;
        this.f138889e = recyclerView;
        this.f138886b = aVar;
        this.f138887c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m218914a(List<C34029b> list, AbstractC34028a<C33141d> aVar, AbstractC59010e eVar, ThreadMessageVO<?> threadMessageVO, boolean z) {
        list.add(C34029b.m131930a().mo126127a(0).mo126131a());
        if (!z) {
            C33141d dVar = new C33141d(eVar, threadMessageVO);
            if (m218918a() && C34352r.m133233a(this.f138885a.mo122541e(), threadMessageVO.mo121710r(), threadMessageVO.ai(), threadMessageVO.mo121698f()) && !m218919a(threadMessageVO)) {
                list.add(AbstractC55870a.CC.m217015a(this.f138886b, threadMessageVO.mo121662H(), threadMessageVO));
            }
            aVar.mo120413a(list, dVar);
        }
        Collections.sort(list, $$Lambda$b$u3ModEiyHTO4bbcLiwIfZkOCKM8.INSTANCE);
    }

    /* renamed from: b */
    private C32930d.C32932a<Integer> m218922b(final ThreadMessageVO threadMessageVO, AbstractC59004b bVar, AbstractC59010e eVar, int i, boolean z, boolean z2) {
        Log.i("ThreadCellClickHandler", "use new message menu");
        C32930d.C32932a a = new C32930d.C32932a(this.f138885a.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) new AbstractC32926a.AbstractC32927a(z) {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$Od3UQJd7xShluwGk5E7TU4GzXc */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a.AbstractC32927a
            public final AbstractC32926a create(C32930d.C32934c cVar) {
                return AbstractC56152b.m218910a(ThreadMessageVO.this, this.f$1, cVar);
            }
        }).mo121609a(false).mo121600a(0, this.f138885a.mo122555s()).mo121601a((View) this.f138889e).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(z2, new ThreadActionContext((AbstractView$OnClickListenerC59005c) bVar, (C59008d) eVar, this.f138885a, this.f138886b) {
            /* class com.ss.android.lark.threadwindow.view.AbstractC56152b.C561531 */

            /* renamed from: o */
            public MessageInfo mo106789i() {
                return null;
            }

            /* renamed from: n */
            public ThreadMessageVO<?> mo106788h() {
                return threadMessageVO;
            }

            @Override // com.ss.android.lark.chat.message_menu.provider.ThreadMutePlayActionProvider.MutePlayContext
            public AbstractC33302l at_() {
                return AbstractC56152b.this.f138887c;
            }

            @Override // com.ss.android.lark.biz.im.extension.ActionContext
            /* renamed from: j */
            public Message mo106790j() {
                return threadMessageVO.mo121671Q();
            }

            @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c
            /* renamed from: b */
            public void mo190486b(AbsMessageVO aVar) {
                AbstractC56152b.this.f138886b.mo190486b(aVar);
            }
        }) {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$TsX6o6sZtzyOrxpZPBEUgEqqtWw */
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ ThreadActionContext f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC56152b.m218917a(this.f$0, this.f$1, list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(threadMessageVO, i) {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$6ORXBRZMQfj1xK61QrA_QoI2scw */
            public final /* synthetic */ ThreadMessageVO f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC56152b.this.m218913a((AbstractC56152b) this.f$1, (ThreadMessageVO) this.f$2, (int) bVar);
            }
        }).mo121610a(this.f138885a.mo122557u()).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$DMjhwUJ5gvxzzHa1Uz8MTDoQ15c */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC56152b.m218915a(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }

    /* renamed from: a */
    private C32930d.C32932a<Integer> m218911a(ThreadMessageVO threadMessageVO, AbstractC59004b bVar, AbstractC59010e eVar, int i, boolean z, boolean z2) {
        AbstractC34028a<C33141d> a = m218912a(bVar);
        if (a == null) {
            return null;
        }
        C32930d.C32932a a2 = new C32930d.C32932a(this.f138885a.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) new AbstractC32926a.AbstractC32927a(z) {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$l7PKUIZi_ItHZgVdGECZQ14b50A */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a.AbstractC32927a
            public final AbstractC32926a create(C32930d.C32934c cVar) {
                return AbstractC56152b.m218921b(ThreadMessageVO.this, this.f$1, cVar);
            }
        }).mo121603a((C32930d.AbstractC32933b) new C32929c(threadMessageVO).mo121589a(new C56154a()).mo121589a(new C56155b(a, new C33141d(eVar, threadMessageVO)))).mo121609a(false).mo121600a(0, this.f138885a.mo122555s()).mo121601a((View) this.f138889e).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(a, eVar, threadMessageVO, z2) {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$WE25beIcCV5YM3O2LXWCY7B6jiE */
            public final /* synthetic */ AbstractC34028a f$1;
            public final /* synthetic */ AbstractC59010e f$2;
            public final /* synthetic */ ThreadMessageVO f$3;
            public final /* synthetic */ boolean f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC56152b.this.m218914a((AbstractC56152b) this.f$1, (AbstractC34028a) this.f$2, (AbstractC59010e) this.f$3, (ThreadMessageVO) this.f$4, (boolean) list);
            }
        }).mo121605a((C32930d.AbstractC32936e) new C32930d.AbstractC32936e(threadMessageVO, i) {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$vA6kZYnR8suG5Wl19GKcXICwLb8 */
            public final /* synthetic */ ThreadMessageVO f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32936e
            public final void onMenuSelected(C34029b bVar) {
                AbstractC56152b.this.m218923b((AbstractC56152b) this.f$1, (ThreadMessageVO) this.f$2, (int) bVar);
            }
        }).mo121610a(this.f138885a.mo122557u()).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$b$SKDKMYZMziLgnMS4v2CDJ1XIM3Y */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC56152b.m218924b(AbstractC59010e.this);
            }
        });
        WindowDialogManager dVar = WindowDialogManager.f91123a;
        dVar.getClass();
        return a2.mo121607a((C32930d.AbstractC32938g) new C32930d.AbstractC32938g() {
            /* class com.ss.android.lark.threadwindow.view.$$Lambda$T_j3f70297ji3hDMr2bR8BtzHc */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32938g
            public final void onShow(PopupWindow popupWindow) {
                WindowDialogManager.this.mo129820a(popupWindow);
            }
        });
    }
}
