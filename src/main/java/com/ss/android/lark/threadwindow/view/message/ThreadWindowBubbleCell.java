package com.ss.android.lark.threadwindow.view.message;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33308b;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1625b.AbstractC33309a;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threadwindow.view.block.OtherAreaBlock;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowBubbleCell;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56150a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;

public class ThreadWindowBubbleCell extends AbstractC33308b<ThreadMessageVO, ThreadWindowBubbleViewHolder> {

    /* renamed from: c */
    private final AbstractC33342d f138966c;

    /* renamed from: g */
    private final AbstractC56150a f138967g;

    /* renamed from: h */
    private OtherAreaBlock f138968h;

    /* renamed from: i */
    private final OtherAreaBlock.AbstractC56166a f138969i;

    /* renamed from: j */
    private final AbstractC33290a f138970j;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_common_v2;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadWindowBubbleViewHolder extends C59008d {
        @BindView(7483)
        View contentHolder;

        ThreadWindowBubbleViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.C59008d, com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            super.mo122652a(view);
            ButterKnife.bind(this, view);
        }
    }

    public class ThreadWindowBubbleViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadWindowBubbleViewHolder f138974a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadWindowBubbleViewHolder threadWindowBubbleViewHolder = this.f138974a;
            if (threadWindowBubbleViewHolder != null) {
                this.f138974a = null;
                threadWindowBubbleViewHolder.contentHolder = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadWindowBubbleViewHolder_ViewBinding(ThreadWindowBubbleViewHolder threadWindowBubbleViewHolder, View view) {
            this.f138974a = threadWindowBubbleViewHolder;
            threadWindowBubbleViewHolder.contentHolder = Utils.findRequiredView(view, R.id.content_holder, "field 'contentHolder'");
        }
    }

    /* renamed from: d */
    private void m219031d() {
        OtherAreaBlock otherAreaBlock = new OtherAreaBlock(this.f138966c.mo122543g(), this.f138966c.mo122552p(), this.f138967g, this.f138969i);
        this.f138968h = otherAreaBlock;
        mo200138a(R.id.content_layout, otherAreaBlock);
    }

    /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowBubbleCell$a */
    public static class C56172a {

        /* renamed from: a */
        private C56210c f138975a;

        /* renamed from: b */
        private AbstractC33290a f138976b;

        /* renamed from: c */
        private AbstractC56150a f138977c;

        /* renamed from: d */
        private OtherAreaBlock.AbstractC56166a f138978d;

        /* renamed from: e */
        private AbstractC59012g f138979e;

        /* renamed from: f */
        private AbstractC34028a f138980f;

        /* renamed from: a */
        public ThreadWindowBubbleCell mo191531a() {
            C56210c cVar;
            AbstractC33290a aVar = this.f138976b;
            if (aVar == null || (cVar = this.f138975a) == null) {
                throw new IllegalArgumentException("mainChildCell and threadWindowContext cannot be null");
            }
            ThreadWindowBubbleCell threadWindowBubbleCell = new ThreadWindowBubbleCell(cVar, aVar, this.f138977c, this.f138978d);
            threadWindowBubbleCell.mo200134a(this.f138979e);
            threadWindowBubbleCell.mo122781a(this.f138980f);
            return threadWindowBubbleCell;
        }

        /* renamed from: a */
        public C56172a mo191525a(AbstractC33290a aVar) {
            this.f138976b = aVar;
            return this;
        }

        /* renamed from: a */
        public C56172a mo191526a(AbstractC34028a aVar) {
            this.f138980f = aVar;
            return this;
        }

        /* renamed from: a */
        public C56172a mo191527a(AbstractC56150a aVar) {
            this.f138977c = aVar;
            return this;
        }

        /* renamed from: a */
        public C56172a mo191528a(OtherAreaBlock.AbstractC56166a aVar) {
            this.f138978d = aVar;
            return this;
        }

        /* renamed from: a */
        public C56172a mo191529a(C56210c cVar) {
            this.f138975a = cVar;
            return this;
        }

        /* renamed from: a */
        public C56172a mo191530a(AbstractC59012g gVar) {
            this.f138979e = gVar;
            return this;
        }
    }

    /* renamed from: a */
    public void mo122718b(final ThreadWindowBubbleViewHolder threadWindowBubbleViewHolder, final ThreadMessageVO threadMessageVO) {
        threadWindowBubbleViewHolder.contentHolder.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowBubbleCell.C561711 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadWindowBubbleCell.this.mo122683c(threadWindowBubbleViewHolder, threadMessageVO);
            }
        });
        m219030b(threadWindowBubbleViewHolder, threadMessageVO);
    }

    /* renamed from: b */
    private void m219030b(ThreadWindowBubbleViewHolder threadWindowBubbleViewHolder, ThreadMessageVO threadMessageVO) {
        if (DesktopUtil.m144301a((Context) this.f85792a.mo122543g())) {
            threadWindowBubbleViewHolder.f146209n.setOnHoverListener(new View.OnHoverListener(threadMessageVO, threadWindowBubbleViewHolder) {
                /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$ThreadWindowBubbleCell$Tqi_85Rr26tB6ve6ClxRdZS7Q4A */
                public final /* synthetic */ ThreadMessageVO f$1;
                public final /* synthetic */ ThreadWindowBubbleCell.ThreadWindowBubbleViewHolder f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return ThreadWindowBubbleCell.lambda$Tqi_85Rr26tB6ve6ClxRdZS7Q4A(ThreadWindowBubbleCell.this, this.f$1, this.f$2, view, motionEvent);
                }
            });
        }
    }

    private ThreadWindowBubbleCell(C56210c cVar, AbstractC33290a aVar, AbstractC56150a aVar2, OtherAreaBlock.AbstractC56166a aVar3) {
        super(cVar);
        this.f138966c = cVar;
        this.f138967g = aVar2;
        this.f138969i = aVar3;
        this.f138970j = aVar;
        mo200138a(R.id.content_holder, aVar);
        m219031d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m219029a(ThreadMessageVO threadMessageVO, ThreadWindowBubbleViewHolder threadWindowBubbleViewHolder, View view, MotionEvent motionEvent) {
        boolean z;
        AbstractC33290a aVar = this.f138970j;
        if (aVar instanceof AbstractC33309a) {
            z = ((AbstractC33309a) aVar).mo122681a(view, MotionEvent.obtain(motionEvent));
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        this.f138968h.mo191480a(view, threadMessageVO, threadWindowBubbleViewHolder.mo200148l(), motionEvent);
        return true;
    }
}
