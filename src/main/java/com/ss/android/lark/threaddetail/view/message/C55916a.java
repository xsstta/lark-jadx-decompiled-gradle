package com.ss.android.lark.threaddetail.view.message;

import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
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
import com.ss.android.lark.chat.base.view.vo.message.ThreadMergeForwardContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.GroupMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.ImageMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.MediaMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.MergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.StickerMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.ThreadMergeForwardMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1626c.C33337h;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33343a;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33346c;
import com.ss.android.lark.chat.chatwindow.chat.view.message.FolderMessageCell;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threaddetail.view.callback.IThreadDetailCallbackHub;
import com.ss.android.lark.threaddetail.view.message.ThreadDetailBubbleCell;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55926a;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55928b;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55929c;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55930d;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55931e;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55932f;
import com.ss.android.lark.threaddetail.view.message.p2756a.C55933g;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55897p;
import com.ss.android.lark.threadwindow.view.message.C56199a;
import com.ss.android.lark.threadwindow.view.message.C56212d;
import com.ss.android.lark.threadwindow.view.message.C56213e;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59012g;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.view.message.a */
public class C55916a {

    /* renamed from: a */
    private final C55934b f138164a;

    /* renamed from: b */
    private final IThreadDetailCallbackHub f138165b;

    /* renamed from: c */
    private final AbstractC59012g<ChatMessageVO> f138166c;

    /* renamed from: d */
    private final AbstractC55897p f138167d;

    /* renamed from: e */
    private final List<IOpenMessageCellFactory> f138168e = C29990c.m110930b().mo134507F().mo134430c();

    /* renamed from: a */
    public boolean mo190656a(ChatMessageVO cVar) {
        return true;
    }

    /* renamed from: a */
    private boolean m217237a(AbstractC33342d dVar) {
        return !DesktopUtil.m144301a((Context) dVar.mo122543g());
    }

    /* renamed from: b */
    private ThreadDetailBubbleCell m217238b(boolean z) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new GroupMessageCell(this.f138164a, UIHelper.dp2px(0.5f), R.drawable.thread_item_white_bg)).mo190648a(z).mo190647a(this.f138166c).mo190649a();
    }

    /* renamed from: d */
    private ThreadDetailBubbleCell m217240d(boolean z) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new FolderMessageCell(this.f138164a, this.f138165b)).mo190648a(z).mo190647a(this.f138166c).mo190649a();
    }

    /* renamed from: e */
    private ThreadDetailBubbleCell m217241e(boolean z) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new StickerMessageCell(this.f138164a, 4.0f, 0.5f, true, null)).mo190648a(z).mo190647a(this.f138166c).mo190644a(new C55932f(this.f138164a, this.f138167d)).mo190649a();
    }

    /* renamed from: f */
    private ThreadDetailBubbleCell m217242f(boolean z) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new MediaMessageCell(this.f138164a, 4.0f, 0.5f, true, this.f138165b)).mo190648a(z).mo190647a(this.f138166c).mo190644a(new C55929c(this.f138164a, this.f138165b)).mo190649a();
    }

    /* renamed from: g */
    private ThreadDetailBubbleCell m217243g(boolean z) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new ImageMessageCell(this.f138164a, 4.0f, 0.5f, true, this.f138165b)).mo190648a(z).mo190644a(new C55928b(this.f138164a, this.f138167d)).mo190647a(this.f138166c).mo190649a();
    }

    /* renamed from: h */
    private ThreadDetailBubbleCell m217244h(boolean z) {
        ThreadDetailBubbleCell.C55913a a = new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new C56199a(this.f138164a, this.f138165b)).mo190648a(z).mo190647a(this.f138166c);
        C55934b bVar = this.f138164a;
        AbstractC55897p pVar = this.f138167d;
        return a.mo190644a(new C55926a(bVar, pVar, pVar)).mo190649a();
    }

    /* renamed from: a */
    private ThreadDetailBubbleCell m217234a(boolean z) {
        ThreadDetailBubbleCell.C55913a a = new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b);
        C55934b bVar = this.f138164a;
        return a.mo190643a(new MergeForwardMessageCell(bVar, UIUtils.dp2px(bVar.mo122543g(), 12.0f), R.drawable.thread_item_white_bg)).mo190648a(z).mo190647a(this.f138166c).mo190644a(new C55930d(this.f138164a, this.f138167d)).mo190649a();
    }

    /* renamed from: c */
    private ThreadDetailBubbleCell m217239c(boolean z) {
        AbstractC33290a aVar;
        if (DesktopUtil.m144301a((Context) this.f138164a.mo122543g())) {
            aVar = new C56212d(this.f138164a, this.f138165b);
        } else {
            aVar = new C56213e(this.f138164a, this.f138165b);
        }
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(aVar).mo190648a(z).mo190647a(this.f138166c).mo190649a();
    }

    /* renamed from: i */
    private ThreadDetailBubbleCell m217245i(boolean z) {
        AbstractC33290a aVar;
        if (m217237a(this.f138164a)) {
            aVar = new C55938e(this.f138164a, this.f138165b, z);
        } else {
            aVar = new C55937d(this.f138164a, this.f138165b, z);
        }
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(aVar).mo190648a(z).mo190647a(this.f138166c).mo190644a(new C55931e(this.f138164a, this.f138167d)).mo190649a();
    }

    /* renamed from: a */
    public void mo190655a(AbstractView$OnClickListenerC58999a<ChatMessageVO> aVar) {
        if (!CollectionUtils.isEmpty(this.f138168e)) {
            for (IOpenMessageCellFactory dVar : this.f138168e) {
                C33346c cVar = new C33346c(this.f138165b);
                final ThreadDetailBubbleCell a = m217233a(cVar, dVar.mo120404b(this.f138164a, cVar), true);
                C33346c cVar2 = new C33346c(this.f138165b);
                IOpenMessageCell b = dVar.mo120404b(this.f138164a, cVar2);
                final ThreadDetailBubbleCell a2 = m217233a(cVar2, b, false);
                aVar.mo200126a(b.mo120409a(), new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
                    /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559171 */

                    /* renamed from: a */
                    public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                        if (cVar.mo124243P()) {
                            return a;
                        }
                        return a2;
                    }
                });
            }
        }
        final ThreadDetailBubbleCell h = m217244h(true);
        final ThreadDetailBubbleCell h2 = m217244h(false);
        final ThreadDetailBubbleCell g = m217243g(true);
        final ThreadDetailBubbleCell g2 = m217243g(false);
        final ThreadDetailBubbleCell f = m217242f(true);
        final ThreadDetailBubbleCell f2 = m217242f(false);
        final ThreadDetailBubbleCell e = m217241e(true);
        final ThreadDetailBubbleCell e2 = m217241e(false);
        final ThreadDetailBubbleCell i = m217245i(true);
        final ThreadDetailBubbleCell i2 = m217245i(false);
        final ThreadDetailBubbleCell c = m217239c(true);
        final ThreadDetailBubbleCell c2 = m217239c(false);
        final ThreadDetailBubbleCell b2 = m217238b(true);
        final ThreadDetailBubbleCell b3 = m217238b(false);
        final ThreadDetailBubbleCell a3 = m217234a(true);
        final ThreadDetailBubbleCell a4 = m217234a(false);
        final ThreadDetailBubbleCell a5 = m217235a(true, this.f138165b);
        final ThreadDetailBubbleCell a6 = m217235a(false, this.f138165b);
        final ThreadDetailBubbleCell d = m217240d(true);
        final ThreadDetailBubbleCell d2 = m217240d(false);
        ThreadDetailSystemCell threadDetailSystemCell = new ThreadDetailSystemCell(this.f138164a);
        final ThreadDetailRecallCell threadDetailRecallCell = new ThreadDetailRecallCell(this.f138164a, this.f138165b);
        final ThreadDetailDividerCell cVar3 = new ThreadDetailDividerCell(this.f138164a);
        final ThreadMergeForwardBottomCell fVar = new ThreadMergeForwardBottomCell(this.f138164a);
        aVar.mo200122a(new AbstractView$OnClickListenerC58999a.AbstractC59002b<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559259 */

            /* renamed from: a */
            public Class typeOf(ChatMessageVO cVar) {
                if (C55916a.this.mo190656a(cVar)) {
                    return cVar.mo121699g().getClass();
                }
                return PostContentVO.class;
            }
        });
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass10 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124237J()) {
                    return cVar3;
                }
                return null;
            }
        });
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass11 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo121698f()) {
                    return threadDetailRecallCell;
                }
                return null;
            }
        });
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass12 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124235H()) {
                    return i2;
                }
                return null;
            }
        });
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass13 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124236I()) {
                    return fVar;
                }
                return null;
            }
        });
        aVar.mo200126a(AudioContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass14 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return h;
                }
                return h2;
            }
        });
        aVar.mo200126a(ImageContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass15 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return g;
                }
                return g2;
            }
        });
        aVar.mo200126a(MediaContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.AnonymousClass16 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return f;
                }
                return f2;
            }
        });
        aVar.mo200126a(StickerContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559182 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return e;
                }
                return e2;
            }
        });
        aVar.mo200126a(FileContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559193 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return c;
                }
                return c2;
            }
        });
        aVar.mo200126a(FolderContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559204 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return d;
                }
                return d2;
            }
        });
        aVar.mo200126a(ShareGroupChatContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559215 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return b2;
                }
                return b3;
            }
        });
        aVar.mo200126a(MergeForwardContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559226 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return a3;
                }
                return a4;
            }
        });
        aVar.mo200126a(ThreadMergeForwardContentVO.class, new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559237 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return a5;
                }
                return a6;
            }
        });
        aVar.mo200123a(threadDetailSystemCell);
        aVar.mo200121a(new AbstractView$OnClickListenerC58999a.AbstractC59001a<ChatMessageVO>() {
            /* class com.ss.android.lark.threaddetail.view.message.C55916a.C559248 */

            /* renamed from: a */
            public AbstractC59004b mapToCell(ChatMessageVO cVar) {
                if (cVar.mo124243P()) {
                    return i;
                }
                return i2;
            }
        });
    }

    /* renamed from: a */
    private ThreadDetailBubbleCell m217235a(boolean z, IThreadDetailCallbackHub aVar) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(aVar).mo190643a(new ThreadMergeForwardMessageCell(this.f138164a, 0, R.drawable.thread_item_white_bg, aVar)).mo190648a(z).mo190647a(this.f138166c).mo190644a(new C55933g(this.f138167d)).mo190649a();
    }

    /* renamed from: a */
    private ThreadDetailBubbleCell m217233a(C33346c cVar, IOpenMessageCell cVar2, boolean z) {
        return new ThreadDetailBubbleCell.C55913a().mo190646a(this.f138164a).mo190645a(this.f138165b).mo190643a(new C33343a(this.f138164a, cVar2, cVar)).mo190647a(this.f138166c).mo190644a(new C33337h(this.f138164a, cVar2)).mo190648a(z).mo190649a();
    }

    /* renamed from: a */
    public static C55916a m217236a(C55934b bVar, IThreadDetailCallbackHub aVar, AbstractC59012g<ChatMessageVO> gVar, AbstractC55897p pVar) {
        return new C55916a(bVar, aVar, gVar, pVar);
    }

    private C55916a(C55934b bVar, IThreadDetailCallbackHub aVar, AbstractC59012g<ChatMessageVO> gVar, AbstractC55897p pVar) {
        this.f138164a = bVar;
        this.f138165b = aVar;
        this.f138166c = gVar;
        this.f138167d = pVar;
    }
}
