package com.ss.android.lark.threaddetail.view.message;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33308b;
import com.ss.android.lark.chat.chatwindow.chat.message.p1625b.AbstractC33309a;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock;
import com.ss.android.lark.threaddetail.view.block.ThreadDetailReplyBlock;
import com.ss.android.lark.threaddetail.view.block.ThreadDetailTopicBlock;
import com.ss.android.lark.threaddetail.view.callback.IThreadDetailCallbackHub;
import com.ss.android.lark.threaddetail.view.message.ThreadDetailBubbleCell;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.C59008d;
import com.ss.android.lark.widget.recyclerview.hive.ICellHoverHandler;

public class ThreadDetailBubbleCell extends AbstractC33308b<ChatMessageVO, ThreadDetailBubbleViewHolder> {

    /* renamed from: c */
    private final boolean f138140c;

    /* renamed from: g */
    private final AbstractC59004b f138141g;

    /* access modifiers changed from: package-private */
    public static class ThreadDetailBubbleViewHolder extends C59008d {

        /* renamed from: a */
        public View f138142a;

        /* renamed from: b */
        public View f138143b;

        /* renamed from: c */
        public View f138144c;
        @BindView(7483)
        View contentHolder;

        /* renamed from: d */
        public View f138145d;

        /* renamed from: e */
        public View f138146e;

        /* renamed from: f */
        public View f138147f;

        /* renamed from: g */
        public View f138148g;
        @BindView(7373)
        public View mDesktopHoverStub;

        ThreadDetailBubbleViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.C59008d, com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            super.mo122652a(view);
            ButterKnife.bind(this, view);
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        if (this.f138140c) {
            return R.layout.item_thread_detail_content;
        }
        return R.layout.item_thread_detail_reply;
    }

    public class ThreadDetailBubbleViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadDetailBubbleViewHolder f138149a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder = this.f138149a;
            if (threadDetailBubbleViewHolder != null) {
                this.f138149a = null;
                threadDetailBubbleViewHolder.contentHolder = null;
                threadDetailBubbleViewHolder.mDesktopHoverStub = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadDetailBubbleViewHolder_ViewBinding(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, View view) {
            this.f138149a = threadDetailBubbleViewHolder;
            threadDetailBubbleViewHolder.contentHolder = Utils.findRequiredView(view, R.id.content_holder, "field 'contentHolder'");
            threadDetailBubbleViewHolder.mDesktopHoverStub = Utils.findRequiredView(view, R.id.chat_hover_item_stub, "field 'mDesktopHoverStub'");
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b, com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c
    public int ao_() {
        return (super.ao_() + "" + this.f138141g.ao_()).hashCode();
    }

    /* renamed from: com.ss.android.lark.threaddetail.view.message.ThreadDetailBubbleCell$a */
    public static class C55913a {

        /* renamed from: a */
        private C55934b f138150a;

        /* renamed from: b */
        private AbstractC33290a f138151b;

        /* renamed from: c */
        private IThreadDetailCallbackHub f138152c;

        /* renamed from: d */
        private AbstractC59012g<ChatMessageVO> f138153d;

        /* renamed from: e */
        private AbstractC34028a f138154e;

        /* renamed from: f */
        private boolean f138155f;

        /* renamed from: a */
        public ThreadDetailBubbleCell mo190649a() {
            C55934b bVar;
            AbstractC33290a aVar = this.f138151b;
            if (aVar == null || (bVar = this.f138150a) == null) {
                throw new IllegalArgumentException("mainCell and chatContext cannot be null");
            }
            ThreadDetailBubbleCell threadDetailBubbleCell = new ThreadDetailBubbleCell(bVar, aVar, this.f138155f, this.f138152c);
            threadDetailBubbleCell.mo200134a(this.f138153d);
            threadDetailBubbleCell.mo122781a(this.f138154e);
            return threadDetailBubbleCell;
        }

        /* renamed from: a */
        public C55913a mo190643a(AbstractC33290a aVar) {
            this.f138151b = aVar;
            return this;
        }

        /* renamed from: a */
        public C55913a mo190644a(AbstractC34028a aVar) {
            this.f138154e = aVar;
            return this;
        }

        /* renamed from: a */
        public C55913a mo190645a(IThreadDetailCallbackHub aVar) {
            this.f138152c = aVar;
            return this;
        }

        /* renamed from: a */
        public C55913a mo190646a(C55934b bVar) {
            this.f138150a = bVar;
            return this;
        }

        /* renamed from: a */
        public C55913a mo190647a(AbstractC59012g<ChatMessageVO> gVar) {
            this.f138153d = gVar;
            return this;
        }

        /* renamed from: a */
        public C55913a mo190648a(boolean z) {
            this.f138155f = z;
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m217201b(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder) {
        threadDetailBubbleViewHolder.f138142a.setVisibility(4);
    }

    /* renamed from: a */
    private void m217195a(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder) {
        if (threadDetailBubbleViewHolder.f138142a == null) {
            ((ViewStub) threadDetailBubbleViewHolder.mDesktopHoverStub).inflate();
            threadDetailBubbleViewHolder.f138142a = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_wrapper);
            threadDetailBubbleViewHolder.f138143b = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reaction_wrapper);
            threadDetailBubbleViewHolder.f138144c = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reaction);
            threadDetailBubbleViewHolder.f138145d = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reply_wrapper);
            threadDetailBubbleViewHolder.f138146e = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_reply);
            threadDetailBubbleViewHolder.f138147f = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_more_operation_wrapper);
            threadDetailBubbleViewHolder.f138148g = threadDetailBubbleViewHolder.f146209n.findViewById(R.id.desktop_hover_more_operation);
        }
    }

    /* renamed from: a */
    public void mo122718b(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ChatMessageVO cVar) {
        threadDetailBubbleViewHolder.contentHolder.setOnClickListener(new View.OnClickListener(threadDetailBubbleViewHolder, cVar) {
            /* class com.ss.android.lark.threaddetail.view.message.$$Lambda$ThreadDetailBubbleCell$EB3wuyXQiqDAUW7tgWT8uPhcA18 */
            public final /* synthetic */ ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder f$1;
            public final /* synthetic */ ChatMessageVO f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                ThreadDetailBubbleCell.this.m217196a((ThreadDetailBubbleCell) this.f$1, (ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder) this.f$2, (ChatMessageVO) view);
            }
        });
        m217202b(threadDetailBubbleViewHolder, cVar);
    }

    /* renamed from: b */
    private void m217202b(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ChatMessageVO cVar) {
        int i;
        int i2;
        if (DesktopUtil.m144301a((Context) this.f85792a.mo122543g()) && (this.f146200f instanceof ICellHoverHandler)) {
            threadDetailBubbleViewHolder.contentHolder.getLayoutParams().width = -2;
            m217195a(threadDetailBubbleViewHolder);
            ICellHoverHandler iCellHoverHandler = (ICellHoverHandler) this.f146200f;
            boolean c = iCellHoverHandler.mo122234c(this, threadDetailBubbleViewHolder, cVar);
            boolean b = iCellHoverHandler.mo122230b(this, threadDetailBubbleViewHolder, cVar);
            boolean a = iCellHoverHandler.mo122226a(this, threadDetailBubbleViewHolder, cVar);
            View view = threadDetailBubbleViewHolder.f138143b;
            int i3 = 0;
            if (c) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = threadDetailBubbleViewHolder.f138145d;
            if (b) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
            View view3 = threadDetailBubbleViewHolder.f138147f;
            if (!a) {
                i3 = 8;
            }
            view3.setVisibility(i3);
            threadDetailBubbleViewHolder.f146209n.setOnHoverListener(new View.OnHoverListener(threadDetailBubbleViewHolder, iCellHoverHandler, cVar) {
                /* class com.ss.android.lark.threaddetail.view.message.$$Lambda$ThreadDetailBubbleCell$xJQBReF8g8_WkioAONokSE3CjzI */
                public final /* synthetic */ ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder f$1;
                public final /* synthetic */ ICellHoverHandler f$2;
                public final /* synthetic */ ChatMessageVO f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final boolean onHover(View view, MotionEvent motionEvent) {
                    return ThreadDetailBubbleCell.this.m217200a(this.f$1, this.f$2, this.f$3, view, motionEvent);
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m217199a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m217196a(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ChatMessageVO cVar, View view) {
        mo122683c(threadDetailBubbleViewHolder, cVar);
    }

    /* renamed from: a */
    private void m217197a(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, boolean z, int i) {
        boolean[] zArr = new boolean[3];
        if (i == 0) {
            zArr[0] = true;
        } else if (i == 1) {
            zArr[1] = true;
        } else if (i == 2) {
            zArr[2] = true;
        }
        if (z) {
            zArr = new boolean[3];
        }
        threadDetailBubbleViewHolder.f138144c.setSelected(zArr[0]);
        threadDetailBubbleViewHolder.f138146e.setSelected(zArr[1]);
        threadDetailBubbleViewHolder.f138148g.setSelected(zArr[2]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m217198a(ICellHoverHandler iCellHoverHandler, ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ChatMessageVO cVar, View view) {
        iCellHoverHandler.mo122222a(threadDetailBubbleViewHolder.f138147f, this, threadDetailBubbleViewHolder, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m217204c(ICellHoverHandler iCellHoverHandler, ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ChatMessageVO cVar, View view) {
        iCellHoverHandler.mo122232c(threadDetailBubbleViewHolder.f138143b, this, threadDetailBubbleViewHolder, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m217203b(ICellHoverHandler iCellHoverHandler, ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ChatMessageVO cVar, View view) {
        iCellHoverHandler.mo122228b(threadDetailBubbleViewHolder.f138145d, this, threadDetailBubbleViewHolder, cVar);
    }

    private ThreadDetailBubbleCell(C55934b bVar, AbstractC33290a aVar, boolean z, IThreadDetailCallbackHub aVar2) {
        super(bVar);
        this.f138140c = z;
        mo200138a(R.id.content_holder, aVar);
        ThreadDetailCommonBlock threadDetailCommonBlock = new ThreadDetailCommonBlock(bVar, z, aVar2);
        if (z) {
            ThreadDetailTopicBlock threadDetailTopicBlock = new ThreadDetailTopicBlock(bVar, threadDetailCommonBlock);
            this.f138141g = threadDetailTopicBlock;
            mo200138a(R.id.new_messages_content, threadDetailTopicBlock);
            return;
        }
        ThreadDetailReplyBlock threadDetailReplyBlock = new ThreadDetailReplyBlock(threadDetailCommonBlock, aVar2);
        this.f138141g = threadDetailReplyBlock;
        mo200138a(R.id.reply_root, threadDetailReplyBlock);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m217200a(ThreadDetailBubbleViewHolder threadDetailBubbleViewHolder, ICellHoverHandler iCellHoverHandler, ChatMessageVO cVar, View view, MotionEvent motionEvent) {
        if (mo200139f() instanceof AbstractC33309a) {
            ((AbstractC33309a) mo200139f()).mo122681a(view, MotionEvent.obtain(motionEvent));
        }
        int action = motionEvent.getAction();
        if (action == 7) {
            boolean a = m217199a(threadDetailBubbleViewHolder.f138143b, motionEvent);
            boolean a2 = m217199a(threadDetailBubbleViewHolder.f138145d, motionEvent);
            boolean a3 = m217199a(threadDetailBubbleViewHolder.f138147f, motionEvent);
            if (a) {
                iCellHoverHandler.mo122224a(threadDetailBubbleViewHolder.f138143b, this, threadDetailBubbleViewHolder, cVar, motionEvent, 0);
                m217197a(threadDetailBubbleViewHolder, false, 0);
            } else if (a2) {
                iCellHoverHandler.mo122224a(threadDetailBubbleViewHolder.f138145d, this, threadDetailBubbleViewHolder, cVar, motionEvent, 1);
                m217197a(threadDetailBubbleViewHolder, false, 1);
            } else if (a3) {
                iCellHoverHandler.mo122224a(threadDetailBubbleViewHolder.f138147f, this, threadDetailBubbleViewHolder, cVar, motionEvent, 2);
                m217197a(threadDetailBubbleViewHolder, false, 2);
            } else {
                motionEvent.setAction(10);
                iCellHoverHandler.mo122224a(threadDetailBubbleViewHolder.f138143b, this, threadDetailBubbleViewHolder, cVar, motionEvent, 0);
                m217197a(threadDetailBubbleViewHolder, true, 0);
            }
        } else if (action == 9) {
            threadDetailBubbleViewHolder.f138142a.setVisibility(0);
        } else if (action == 10) {
            threadDetailBubbleViewHolder.f138142a.post(new Runnable() {
                /* class com.ss.android.lark.threaddetail.view.message.$$Lambda$ThreadDetailBubbleCell$Z6l9t5QExPhnVJPrkydMQ6ufJh0 */

                public final void run() {
                    ThreadDetailBubbleCell.m217201b(ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder.this);
                }
            });
            iCellHoverHandler.mo122224a(threadDetailBubbleViewHolder.f138143b, this, threadDetailBubbleViewHolder, cVar, motionEvent, 0);
            m217197a(threadDetailBubbleViewHolder, true, 0);
        }
        threadDetailBubbleViewHolder.f138143b.setOnClickListener(new View.OnClickListener(iCellHoverHandler, threadDetailBubbleViewHolder, cVar) {
            /* class com.ss.android.lark.threaddetail.view.message.$$Lambda$ThreadDetailBubbleCell$mycki0VO32pUxjtDozWkPSv6jMg */
            public final /* synthetic */ ICellHoverHandler f$1;
            public final /* synthetic */ ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder f$2;
            public final /* synthetic */ ChatMessageVO f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                ThreadDetailBubbleCell.this.m217204c(this.f$1, this.f$2, this.f$3, view);
            }
        });
        threadDetailBubbleViewHolder.f138145d.setOnClickListener(new View.OnClickListener(iCellHoverHandler, threadDetailBubbleViewHolder, cVar) {
            /* class com.ss.android.lark.threaddetail.view.message.$$Lambda$ThreadDetailBubbleCell$J898YxO3BhXbf740EfpDp4WcxuA */
            public final /* synthetic */ ICellHoverHandler f$1;
            public final /* synthetic */ ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder f$2;
            public final /* synthetic */ ChatMessageVO f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                ThreadDetailBubbleCell.this.m217203b(this.f$1, this.f$2, this.f$3, view);
            }
        });
        threadDetailBubbleViewHolder.f138147f.setOnClickListener(new View.OnClickListener(iCellHoverHandler, threadDetailBubbleViewHolder, cVar) {
            /* class com.ss.android.lark.threaddetail.view.message.$$Lambda$ThreadDetailBubbleCell$EKY2R7Hb2DlmoAyz1aU2VEy3_os */
            public final /* synthetic */ ICellHoverHandler f$1;
            public final /* synthetic */ ThreadDetailBubbleCell.ThreadDetailBubbleViewHolder f$2;
            public final /* synthetic */ ChatMessageVO f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                ThreadDetailBubbleCell.this.m217198a(this.f$1, this.f$2, this.f$3, view);
            }
        });
        return true;
    }
}
