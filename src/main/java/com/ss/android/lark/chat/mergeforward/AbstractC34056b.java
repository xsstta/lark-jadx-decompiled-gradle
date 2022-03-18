package com.ss.android.lark.chat.mergeforward;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32926a;
import com.ss.android.lark.chat.base.view.p1603a.C32929c;
import com.ss.android.lark.chat.base.view.p1603a.C32930d;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33088a;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.C33141d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a.C33092c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.message_menu.MessageActionManager;
import com.ss.android.lark.chat.message_menu.context.MergeForwardActionContext;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.mergeforward.b */
public abstract class AbstractC34056b implements AbstractC59012g<ChatMessageVO> {

    /* renamed from: a */
    protected boolean f88035a = C29990c.m110930b().mo134586n().mo134685a("im.message.use_new_message_menu");

    /* renamed from: b */
    private final AbstractC33342d f88036b;

    /* renamed from: c */
    private final RecyclerView f88037c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC32926a m132127a(C32930d.C32934c cVar) {
        return new C33088a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC32926a m132133b(C32930d.C32934c cVar) {
        return new C33088a(cVar);
    }

    /* renamed from: a */
    private AbstractC34028a<C33141d> m132128a(AbstractC59004b bVar) {
        if (bVar instanceof AbstractC34028a) {
            return (AbstractC34028a) bVar;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132135b(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m132131a(AbstractC59010e eVar) {
        eVar.f146209n.setSelected(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m132126a(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m132132b(C34029b bVar, C34029b bVar2) {
        return bVar.f87966a - bVar2.f87966a;
    }

    public AbstractC34056b(RecyclerView recyclerView, AbstractC33342d dVar) {
        this.f88037c = recyclerView;
        this.f88036b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m132129a(ChatMessageVO cVar, MergeForwardActionContext cVar2, List list) {
        if (!cVar.mo121698f() && !C34438a.m133578a(cVar)) {
            list.addAll(MessageActionManager.f84892a.mo121931a(cVar2));
            Collections.sort(list, $$Lambda$b$sJvcNKpRsk0IeU7xdxjrfPVDnw.INSTANCE);
        }
    }

    /* renamed from: b */
    private C32930d mo126193b(AbstractC59004b bVar, AbstractC59010e eVar, final ChatMessageVO cVar) {
        Log.m165389i("MergeForwardClickHandler", "use new message menu");
        return new C32930d.C32932a(this.f88036b.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$b$K3ucFQL5C8L5GzrDs4eFLRIFYDw.INSTANCE).mo121600a(0, this.f88036b.mo122555s()).mo121601a((View) this.f88037c).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(new MergeForwardActionContext((AbstractView$OnClickListenerC59005c) bVar, (C59008d) eVar, this.f88036b) {
            /* class com.ss.android.lark.chat.mergeforward.AbstractC34056b.C340571 */

            /* renamed from: n */
            public MessageInfo mo106789i() {
                return null;
            }

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
        }) {
            /* class com.ss.android.lark.chat.mergeforward.$$Lambda$b$BpKQ9aawW10EuEgLcqquq7yRnxY */
            public final /* synthetic */ MergeForwardActionContext f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32937f
            public final void onPrepareMenuList(List list) {
                AbstractC34056b.m132129a(ChatMessageVO.this, this.f$1, list);
            }
        }).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
            /* class com.ss.android.lark.chat.mergeforward.$$Lambda$b$iJC60vhkXD07N2LRagD6GUZiWo */

            @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
            public final void onDismiss() {
                AbstractC34056b.m132131a(AbstractC59010e.this);
            }
        }).mo121611a().mo121591a();
    }

    /* renamed from: a */
    public boolean mo122581d(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        C32930d dVar;
        AbstractC34028a<C33141d> a = m132128a(bVar);
        if (a == null) {
            return false;
        }
        if (this.f88035a) {
            dVar = mo126193b(bVar, eVar, cVar);
        } else {
            dVar = new C32930d.C32932a(this.f88036b.mo122543g()).mo121602a((AbstractC32926a.AbstractC32927a) $$Lambda$b$PEGmV_SsewKk7_pryzsULXL2nZg.INSTANCE).mo121600a(0, this.f88036b.mo122555s()).mo121601a((View) this.f88037c).mo121603a((C32930d.AbstractC32933b) new C32929c(cVar).mo121589a(new C33092c())).mo121606a((C32930d.AbstractC32937f) new C32930d.AbstractC32937f(a, eVar, cVar) {
                /* class com.ss.android.lark.chat.mergeforward.$$Lambda$b$PSkRbtO19Pjcn9YmnAPfkG_4AsI */
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
                    AbstractC34056b.this.m132130a((AbstractC34056b) this.f$1, (AbstractC34028a) this.f$2, (AbstractC59010e) this.f$3, (ChatMessageVO) list);
                }
            }).mo121604a((C32930d.AbstractC32935d) new C32930d.AbstractC32935d() {
                /* class com.ss.android.lark.chat.mergeforward.$$Lambda$b$tLtppTumscgzeHJQRPJ5ZS9mq7Y */

                @Override // com.ss.android.lark.chat.base.view.p1603a.C32930d.AbstractC32935d
                public final void onDismiss() {
                    AbstractC34056b.m132135b(AbstractC59010e.this);
                }
            }).mo121611a().mo121591a();
        }
        if (dVar.mo121599e()) {
            eVar.f146209n.setSelected(true);
        }
        return dVar.mo121599e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void m132130a(List<C34029b> list, AbstractC34028a<C33141d> aVar, AbstractC59010e eVar, ChatMessageVO cVar) {
        aVar.mo120413a(list, new C33141d(eVar, cVar));
        Collections.sort(list, $$Lambda$b$giZrYgQFsuThDHRgme2iIkq7YBI.INSTANCE);
    }
}
