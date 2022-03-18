package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.base.view.vo.message.FolderContentVO;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.base.view.vo.message.MergeForwardContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.ShareGroupChatContentVO;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.base.view.vo.message.UnKnownContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33296f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33329a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33330b;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33331c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33332d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33333e;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33335f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33336g;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33338i;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33339j;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33340k;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33341l;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33343a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33346c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33352a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33354c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33355d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33356e;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33357f;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33358g;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33359i;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1634c.C33361a;
import com.ss.android.lark.chat.chatwindow.chat.message.text.PostMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.text.TextMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.view.message.menu.FolderContextMenuHandler;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.open.message.AbstractC34073b;
import com.ss.android.lark.chat.open.message.IStatusLayoutPlaceProvider;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.c */
public class C33328c {

    /* renamed from: a */
    List<IOpenMessageCellFactory> f85863a = C29990c.m110930b().mo134507F().mo134428a();

    /* renamed from: b */
    private final AbstractC33342d f85864b;

    /* renamed from: c */
    private final AbstractC59012g<ChatMessageVO> f85865c;

    /* renamed from: d */
    private final AbstractC33120i f85866d;

    /* renamed from: e */
    private final AbstractC33296f f85867e;

    /* renamed from: f */
    private final IStatusLayoutPlaceProvider f85868f = new C33361a();

    /* renamed from: g */
    private final AbstractC34072a f85869g = new C33353b();

    /* renamed from: h */
    private final AbstractC34072a f85870h = new C33356e();

    /* renamed from: i */
    private final AbstractC34072a f85871i = new C33358g();

    /* renamed from: j */
    private final AbstractC34072a f85872j = new C33352a();

    /* renamed from: k */
    private final AbstractC34072a f85873k = new C33354c();

    /* renamed from: l */
    private final AbstractC34072a f85874l = new C33355d();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ AbstractView$OnClickListenerC58999a m129040b(AbstractView$OnClickListenerC58999a aVar) {
        mo122819a(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Class m129038a(ChatMessageVO cVar) {
        ContentVO g = cVar.mo121699g();
        if (g != null) {
            return g.getClass();
        }
        C53241h.m205900d("ChatMessageCellFactory2", "getItem Type:" + cVar + "/" + cVar.mo121710r());
        return UnKnownContentVO.class;
    }

    /* renamed from: a */
    public void mo122819a(AbstractView$OnClickListenerC58999a aVar) {
        AbstractC33290a aVar2;
        AbstractC34073b bVar;
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$OU0UQJM2MOx6dpP2qtGqEHpmnM */

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C33328c.m129043d(MessageBubbleCell.this, (ChatMessageVO) obj);
            }
        });
        if (!CollectionUtils.isEmpty(this.f85863a)) {
            for (IOpenMessageCellFactory dVar : this.f85863a) {
                C33346c cVar = new C33346c(this.f85867e);
                IOpenMessageCell b = dVar.mo120404b(this.f85864b, cVar);
                MessageBubbleCell.C33273a a = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new C33343a(this.f85864b, b, cVar)).mo122725a(this.f85868f).mo122726a(new C33357f(b)).mo122728a(this.f85865c).mo122721a(this.f85867e);
                if (b instanceof AbstractC34073b) {
                    bVar = (AbstractC34073b) b;
                } else {
                    bVar = null;
                }
                aVar.mo200126a(b.mo120409a(), new AbstractView$OnClickListenerC58999a.AbstractC59001a() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$lUVvE2zNK2HWJi3IRGJWZxsHErk */

                    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
                    public final AbstractC59004b mapToCell(Object obj) {
                        return C33328c.m129042c(MessageBubbleCell.this, (ChatMessageVO) obj);
                    }
                });
            }
        }
        MessageBubbleCell.C33273a a2 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new TextMessageCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(this.f85869g).mo122728a(this.f85865c).mo122721a(this.f85867e);
        AbstractC33342d dVar2 = this.f85864b;
        AbstractC33120i iVar = this.f85866d;
        MessageBubbleCell a3 = a2.mo122724a(new C33340k(dVar2, iVar, iVar, iVar)).mo122729a();
        AbstractC33342d dVar3 = this.f85864b;
        AbstractC33296f fVar = this.f85867e;
        MessageBubbleCell.C33273a a4 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new PostMessageCell(dVar3, fVar, fVar)).mo122725a(this.f85868f).mo122726a(this.f85871i).mo122728a(this.f85865c).mo122721a(this.f85867e);
        AbstractC33342d dVar4 = this.f85864b;
        AbstractC33120i iVar2 = this.f85866d;
        MessageBubbleCell a5 = a4.mo122724a(new C33338i(dVar4, iVar2, iVar2, iVar2)).mo122729a();
        MessageBubbleCell a6 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new ImageMessageCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(this.f85870h).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33333e(this.f85864b, this.f85866d)).mo122729a();
        MessageBubbleCell a7 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new StickerMessageCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(this.f85870h).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33339j(this.f85864b, this.f85866d)).mo122729a();
        MessageBubbleCell a8 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new MediaMessageCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(this.f85870h).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33335f(this.f85864b, this.f85867e)).mo122729a();
        MessageBubbleCell a9 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new AudioDraftMessageCell(this.f85864b)).mo122725a(this.f85868f).mo122726a(this.f85869g).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122729a();
        MessageBubbleCell.C33273a a10 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new AudioMessageNewCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(this.f85872j).mo122728a(this.f85865c).mo122721a(this.f85867e);
        AbstractC33342d dVar5 = this.f85864b;
        AbstractC33120i iVar3 = this.f85866d;
        MessageBubbleCell a11 = a10.mo122724a(new C33329a(dVar5, iVar3, iVar3)).mo122729a();
        if (!DesktopUtil.m144301a((Context) this.f85864b.mo122543g()) || this.f85864b.mo122549m()) {
            aVar2 = new FileMessageCell(this.f85864b, this.f85867e);
        } else {
            aVar2 = new DesktopFileMessageCell(this.f85864b, this.f85867e);
        }
        MessageBubbleCell a12 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(aVar2).mo122725a(this.f85868f).mo122726a(this.f85873k).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33331c(this.f85864b)).mo122729a();
        MessageBubbleCell a13 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new FolderMessageCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(this.f85873k).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new FolderContextMenuHandler(this.f85864b)).mo122729a();
        MessageBubbleCell a14 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new GroupMessageCell(this.f85864b)).mo122725a(this.f85868f).mo122726a(this.f85874l).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33332d(this.f85864b)).mo122729a();
        MessageBubbleCell a15 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new MergeForwardMessageCell(this.f85864b)).mo122725a(this.f85868f).mo122726a(this.f85869g).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33336g(this.f85864b, this.f85866d)).mo122729a();
        MessageBubbleCell a16 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new ThreadMergeForwardMessageCell(this.f85864b, this.f85867e)).mo122725a(this.f85868f).mo122726a(new C33359i(this.f85864b)).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33341l(this.f85864b, this.f85866d)).mo122729a();
        SystemMessageCell systemMessageCell = new SystemMessageCell(this.f85864b, this.f85867e);
        RedPacketSystemMessageCell redPacketSystemMessageCell = new RedPacketSystemMessageCell(this.f85864b);
        PhoneSystemMessageCell2 phoneSystemMessageCell2 = new PhoneSystemMessageCell2(this.f85864b, this.f85867e);
        MessageBubbleCell a17 = new MessageBubbleCell.C33273a().mo122723a(this.f85864b).mo122722a(new UnKnownMessageCell(this.f85864b)).mo122725a(this.f85868f).mo122726a(this.f85869g).mo122728a(this.f85865c).mo122721a(this.f85867e).mo122724a(new C33330b(this.f85864b, true)).mo122729a();
        aVar.mo200122a($$Lambda$c$rNIw5OSgyoVpB19i8J4p1Jaw5bU.INSTANCE);
        aVar.mo200126a(AudioContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a(a11) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$4kR9_B1Uh17So4ZSOrsn7z4g_Zs */
            public final /* synthetic */ MessageBubbleCell f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C33328c.m129035a(MessageBubbleCell.this, this.f$1, (ChatMessageVO) obj);
            }
        });
        aVar.mo200126a(SystemContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a(redPacketSystemMessageCell, systemMessageCell) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$Xn1nL79skKe51_B_IqX5GmmA5E */
            public final /* synthetic */ AbstractC59004b f$1;
            public final /* synthetic */ AbstractC59004b f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C33328c.m129037a(AbstractC59004b.this, this.f$1, this.f$2, (ChatMessageVO) obj);
            }
        });
        m129039a(aVar, TextContentVO.class, a3);
        m129039a(aVar, PostContentVO.class, a5);
        m129039a(aVar, ImageContentVO.class, a6);
        m129039a(aVar, StickerContentVO.class, a7);
        m129039a(aVar, MediaContentVO.class, a8);
        m129039a(aVar, FileContentVO.class, a12);
        m129039a(aVar, ShareGroupChatContentVO.class, a14);
        m129039a(aVar, MergeForwardContentVO.class, a15);
        m129039a(aVar, ThreadMergeForwardContentVO.class, a16);
        m129039a(aVar, FolderContentVO.class, a13);
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$ijwQPKW8bPnZjrhP2KdnQRlc4t0 */

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C33328c.m129041b(MessageBubbleCell.this, (ChatMessageVO) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC59004b m129036a(MessageBubbleCell messageBubbleCell, ChatMessageVO cVar) {
        if (cVar.ag()) {
            return messageBubbleCell.mo122719d();
        }
        return messageBubbleCell;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ AbstractC59004b m129041b(MessageBubbleCell messageBubbleCell, ChatMessageVO cVar) {
        if (cVar.ag()) {
            return messageBubbleCell.mo122719d();
        }
        return messageBubbleCell;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC59004b m129042c(MessageBubbleCell messageBubbleCell, ChatMessageVO cVar) {
        if (cVar.ag()) {
            return messageBubbleCell.mo122719d();
        }
        return messageBubbleCell;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC59004b m129043d(MessageBubbleCell messageBubbleCell, ChatMessageVO cVar) {
        if (!cVar.mo121698f() && !cVar.mo124251X()) {
            return null;
        }
        if (cVar.ag()) {
            return messageBubbleCell.mo122719d();
        }
        return messageBubbleCell;
    }

    /* renamed from: a */
    public void mo122820a(AbstractView$OnClickListenerC58999a aVar, C57865c.AbstractC57871b<AbstractView$OnClickListenerC58999a> bVar) {
        C57865c.m224574a(new C57865c.AbstractC57873d(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$P7i0Z90TV655x5ohYvSzZRCwMcI */
            public final /* synthetic */ AbstractView$OnClickListenerC58999a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C33328c.this.m129040b(this.f$1);
            }
        }, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC59004b m129035a(MessageBubbleCell messageBubbleCell, MessageBubbleCell messageBubbleCell2, ChatMessageVO cVar) {
        boolean ag = cVar.ag();
        if (((AudioContentVO) cVar.mo121699g()).mo121815j() != AudioContent.AudioState.RECORDING) {
            messageBubbleCell = messageBubbleCell2;
        }
        if (ag) {
            return messageBubbleCell.mo122719d();
        }
        return messageBubbleCell;
    }

    /* renamed from: a */
    private void m129039a(AbstractView$OnClickListenerC58999a aVar, Class<? extends ContentVO<?>> cls, MessageBubbleCell messageBubbleCell) {
        aVar.mo200126a(cls, new AbstractView$OnClickListenerC58999a.AbstractC59001a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$c$PhIjUQpeeom08bFSlclblxHEoZQ */

            @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a.AbstractC59001a
            public final AbstractC59004b mapToCell(Object obj) {
                return C33328c.m129036a(MessageBubbleCell.this, (ChatMessageVO) obj);
            }
        });
    }

    /* renamed from: a */
    public static C33328c m129034a(AbstractC33342d dVar, AbstractC59012g<ChatMessageVO> gVar, AbstractC33120i iVar, AbstractC33296f fVar) {
        return new C33328c(dVar, gVar, iVar, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC59004b m129037a(AbstractC59004b bVar, AbstractC59004b bVar2, AbstractC59004b bVar3, ChatMessageVO cVar) {
        SystemContent systemContent = (SystemContent) ((SystemContentVO) cVar.mo121699g()).mo126168z();
        String str = systemContent.getContents().get("caller_id");
        String str2 = systemContent.getContents().get("callee_id");
        if (systemContent.getType() != null && str != null && str2 != null) {
            return bVar;
        }
        if (systemContent.isRedPackSystemMessage()) {
            return bVar2;
        }
        return bVar3;
    }

    public C33328c(AbstractC33342d dVar, AbstractC59012g<ChatMessageVO> gVar, AbstractC33120i iVar, AbstractC33296f fVar) {
        this.f85864b = dVar;
        this.f85865c = gVar;
        this.f85866d = iVar;
        this.f85867e = fVar;
    }
}
