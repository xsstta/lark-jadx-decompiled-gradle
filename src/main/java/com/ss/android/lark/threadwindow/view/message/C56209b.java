package com.ss.android.lark.threadwindow.view.message;

import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.GroupMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.RecallOrBurnedMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.SystemMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33337h;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33343a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33346c;
import com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55926a;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55928b;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55929c;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55932f;
import com.ss.android.lark.threadwindow.view.message.ThreadWindowBubbleCell;
import com.ss.android.lark.threadwindow.view.message.p2770a.C56206a;
import com.ss.android.lark.threadwindow.view.message.p2770a.C56207b;
import com.ss.android.lark.threadwindow.view.message.p2770a.C56208c;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56150a;
import com.ss.android.lark.threadwindow.view.p2766a.AbstractC56151b;
import com.ss.android.lark.threadwindow.view.p2767b.p2769b.AbstractC56156a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.view.message.b */
public class C56209b {

    /* renamed from: a */
    List<IOpenMessageCellFactory> f139101a = C29990c.m110930b().mo134507F().mo134430c();

    /* renamed from: b */
    private final C56210c f139102b;

    /* renamed from: c */
    private final AbstractC59012g<ThreadMessageVO> f139103c;

    /* renamed from: d */
    private final AbstractC56151b f139104d;

    /* renamed from: e */
    private final AbstractC56156a f139105e;

    /* renamed from: f */
    private final AbstractC56150a f139106f;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC59004b m219185a(ThreadWindowBubbleCell threadWindowBubbleCell, ThreadMessageVO threadMessageVO) {
        return threadWindowBubbleCell;
    }

    /* renamed from: a */
    private boolean m219187a(ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121680Z() == 1 || threadMessageVO.mo121680Z() == 3 || threadMessageVO.mo121680Z() == 4 || threadMessageVO.mo121680Z() == 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m219188a(AbstractC33342d dVar) {
        return !DesktopUtil.m144301a((Context) dVar.mo122543g());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Class m219189b(ThreadMessageVO threadMessageVO) {
        if (!m219187a(threadMessageVO)) {
            C53241h.m205900d("ThreadWindowCellFactory", "getItem Type:" + threadMessageVO + "/" + threadMessageVO.mo121710r());
            return PostContentVO.class;
        } else if (threadMessageVO.mo121710r() == Message.Type.TEXT || threadMessageVO.mo121710r() == Message.Type.POST) {
            return PostContentVO.class;
        } else {
            return threadMessageVO.mo121699g().getClass();
        }
    }

    /* renamed from: a */
    public void mo191561a(AbstractView$OnClickListenerC58999a aVar) {
        AbstractC33290a aVar2;
        AbstractC33290a aVar3;
        ArrayList<AbstractC59004b> arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(this.f139101a)) {
            for (IOpenMessageCellFactory dVar : this.f139101a) {
                C33346c cVar = new C33346c(this.f139104d);
                IOpenMessageCell b = dVar.mo120404b(this.f139102b, cVar);
                arrayList.add(new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new C33343a(this.f139102b, b, cVar)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C33337h(this.f139102b, b)).mo191531a());
            }
        }
        if (m219188a(this.f139102b)) {
            aVar2 = new ThreadWindowPostCell2(this.f139102b, this.f139104d);
        } else {
            aVar2 = new ThreadWindowPostCell(this.f139102b, this.f139104d);
        }
        ThreadWindowBubbleCell a = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(aVar2).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C56207b(this.f139102b, this.f139105e)).mo191531a();
        ThreadWindowBubbleCell.C56172a a2 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new C56199a(this.f139102b, this.f139104d)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c);
        C56210c cVar2 = this.f139102b;
        AbstractC56156a aVar4 = this.f139105e;
        ThreadWindowBubbleCell a3 = a2.mo191526a(new C55926a(cVar2, aVar4, aVar4)).mo191531a();
        ThreadWindowBubbleCell.C56172a a4 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b);
        if (DesktopUtil.m144307b()) {
            aVar3 = new C56212d(this.f139102b, this.f139104d);
        } else {
            aVar3 = new C56213e(this.f139102b, this.f139104d);
        }
        ThreadWindowBubbleCell a5 = a4.mo191525a(aVar3).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191531a();
        ThreadWindowBubbleCell a6 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new FolderMessageCell(this.f139102b, this.f139104d)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191531a();
        ThreadWindowBubbleCell a7 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new GroupMessageCell(this.f139102b, UIHelper.dp2px(1.0f), R.drawable.thread_item_float_white_bg)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191531a();
        ThreadWindowBubbleCell a8 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new ImageMessageCell(this.f139102b, 4.0f, 0.5f, true, this.f139104d)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C55928b(this.f139102b, this.f139105e)).mo191531a();
        ThreadWindowBubbleCell a9 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new MediaMessageCell(this.f139102b, 4.0f, 0.5f, true, this.f139104d)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C55929c(this.f139102b, this.f139104d)).mo191531a();
        ThreadWindowBubbleCell a10 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new StickerMessageCell(this.f139102b, 4.0f, 0.5f, true, null)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C55932f(this.f139102b, this.f139105e)).mo191531a();
        ThreadWindowBubbleCell.C56172a a11 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b);
        C56210c cVar3 = this.f139102b;
        ThreadWindowBubbleCell a12 = a11.mo191525a(new MergeForwardMessageCell(cVar3, UIUtils.dp2px(cVar3.mo122543g(), 12.0f), R.drawable.thread_item_white_bg)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C56206a(this.f139105e)).mo191531a();
        ThreadWindowBubbleCell a13 = new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new ThreadMergeForwardMessageCell(this.f139102b, 0, R.drawable.thread_item_float_white_bg, this.f139104d)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191526a(new C56208c(this.f139105e)).mo191531a();
        new ThreadWindowBubbleCell.C56172a().mo191529a(this.f139102b).mo191525a(new RecallOrBurnedMessageCell(this.f139102b, this.f139104d)).mo191527a(this.f139106f).mo191528a(this.f139104d).mo191530a(this.f139103c).mo191531a();
        SystemMessageCell systemMessageCell = new SystemMessageCell(this.f139102b, this.f139104d);
        ThreadWindowTabOnBoardingCell threadWindowTabOnBoardingCell = new ThreadWindowTabOnBoardingCell(this.f139102b, this.f139104d);
        ThreadWindowTabNoMoreCell threadWindowTabNoMoreCell = new ThreadWindowTabNoMoreCell(this.f139102b);
        ThreadWindowAtAndReplyTipCell threadWindowAtAndReplyTipCell = new ThreadWindowAtAndReplyTipCell(this.f139102b, this.f139104d);
        aVar.mo200122a(new AbstractView$OnClickListenerC58999a.AbstractC59002b() {
            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$b$Gk8N3kSOBYMXGwzzCzYBJR48Tk */

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59002b
            public final Class typeOf(Object obj) {
                return C56209b.this.m219189b((ThreadMessageVO) obj);
            }
        });
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a(threadWindowTabNoMoreCell) {
            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$b$BtdkZJyZNzNaQAZFTFeOFnD7Lp4 */
            public final /* synthetic */ AbstractC59004b f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C56209b.m219186a(AbstractC59004b.this, this.f$1, (ThreadMessageVO) obj);
            }
        });
        for (AbstractC59004b bVar : arrayList) {
            aVar.mo200123a(bVar);
        }
        aVar.mo200123a(systemMessageCell);
        aVar.mo200123a(a3);
        aVar.mo200123a(a);
        aVar.mo200123a(a8);
        aVar.mo200123a(a10);
        aVar.mo200123a(a9);
        aVar.mo200123a(a5);
        aVar.mo200123a(a7);
        aVar.mo200123a(a12);
        aVar.mo200123a(a13);
        aVar.mo200123a(threadWindowAtAndReplyTipCell);
        aVar.mo200123a(a6);
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a() {
            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$b$C6n8lFcTB8AkC56zi_RImSgE07Y */

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C56209b.m219185a(ThreadWindowBubbleCell.this, (ThreadMessageVO) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC59004b m219186a(AbstractC59004b bVar, AbstractC59004b bVar2, ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121680Z() == 4) {
            return bVar;
        }
        if (threadMessageVO.mo121680Z() == 5) {
            return bVar2;
        }
        return null;
    }

    /* renamed from: a */
    public static C56209b m219184a(C56210c cVar, AbstractC56150a aVar, AbstractC59012g<ThreadMessageVO> gVar, AbstractC56151b bVar, AbstractC56156a aVar2) {
        return new C56209b(cVar, aVar, gVar, bVar, aVar2);
    }

    private C56209b(C56210c cVar, AbstractC56150a aVar, AbstractC59012g<ThreadMessageVO> gVar, AbstractC56151b bVar, AbstractC56156a aVar2) {
        this.f139102b = cVar;
        this.f139103c = gVar;
        this.f139104d = bVar;
        this.f139106f = aVar;
        this.f139105e = aVar2;
    }
}
