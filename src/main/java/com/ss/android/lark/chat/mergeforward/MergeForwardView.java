package com.ss.android.lark.chat.mergeforward;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.C33086b;
import com.ss.android.lark.chat.chatwindow.chat.C33423r;
import com.ss.android.lark.chat.chatwindow.chat.message.C33328c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33296f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33120i;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.mergeforward.C34051a;
import com.ss.android.lark.chat.mergeforward.MergeForwardView;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.utils.C34378x;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatwindow.view.C35252a;
import com.ss.android.lark.chatwindow.view.photo_preview.DialogMenuClickListenerImpl;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mergeforward.AbstractC45276d;
import com.ss.android.lark.mergeforward.C45272a;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardLauncher;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.C58984d;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import com.ss.android.lark.widget.richtext.Image;
import java.util.ArrayList;
import java.util.List;

public class MergeForwardView implements C34051a.AbstractC34054b {

    /* renamed from: a */
    public C33086b f88008a;

    /* renamed from: b */
    public C34051a.AbstractC34054b.AbstractC34055a f88009b;

    /* renamed from: c */
    public final FragmentActivity f88010c;

    /* renamed from: d */
    public final int f88011d;

    /* renamed from: e */
    public C45272a f88012e;

    /* renamed from: f */
    public C35252a f88013f;

    /* renamed from: g */
    public final AbstractC36505s f88014g = C29990c.m110930b().mo134520S();

    /* renamed from: h */
    public final IBrowserDependency f88015h = C29990c.m110930b().mo134593u();

    /* renamed from: i */
    private final AbstractC45276d f88016i;

    /* renamed from: j */
    private C34058c f88017j;

    /* renamed from: k */
    private final AbstractC33120i f88018k = new AbstractC33120i() {
        /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340458 */

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j
        /* renamed from: a */
        public void mo121935a(int i) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q
        /* renamed from: a */
        public <M extends AbsMessageVO<?>> void mo122318a(View view, M m) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v
        /* renamed from: a */
        public void mo122321a(View view, AbstractC59010e eVar, AbsMessageVO aVar) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler
        /* renamed from: a */
        public void mo121937a(PhotoItem photoItem, boolean z) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o
        /* renamed from: a */
        public void mo121938a(String str, int i) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l
        /* renamed from: a */
        public void mo121939a(String str, boolean z) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e
        /* renamed from: b */
        public void mo121940b(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33130s
        /* renamed from: b */
        public void mo122319b(String str, int i) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
        /* renamed from: b */
        public void mo121941b(String str, boolean z) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f
        /* renamed from: c */
        public void mo121942c(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IViewInChatMenuHandler
        /* renamed from: c */
        public void mo123352c(String str, int i) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m
        /* renamed from: d */
        public void mo121943d(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p
        /* renamed from: e */
        public void mo121944e(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b
        public void e_(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r
        /* renamed from: f */
        public void mo121946f(String str) {
        }
    };

    /* renamed from: l */
    private final AbstractC33296f f88019l = new AbstractC33296f() {
        /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340469 */

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
        /* renamed from: a */
        public void mo122778a(View view, ChatMessageVO<TranslatableContentVO<?>> cVar) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
        /* renamed from: a */
        public void mo122773a(View view, PhotoItem photoItem, boolean z) {
        }

        @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
        /* renamed from: a */
        public void mo122830a(View view, List<Image> list, Image image) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33295e
        /* renamed from: a */
        public void mo122761a(AbsMessageVO aVar) {
        }

        @Override // com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a
        /* renamed from: a */
        public void mo122832a(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.text.C33377a.AbstractC33380a
        /* renamed from: a */
        public void mo122890a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h
        /* renamed from: a */
        public void mo122763a(String str, Message.Type type) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageUserInfoBlock.AbstractC33319a
        /* renamed from: a */
        public void mo122810a(String str, String str2) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: a */
        public void mo122765a(String str, String str2, Message.SourceType sourceType) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: a */
        public void mo122766a(String str, String str2, String str3, Message.SourceType sourceType) {
        }

        @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
        /* renamed from: a */
        public void mo123349a(String str, List<GroupRecallEntity> list) {
        }

        @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
        /* renamed from: a */
        public void mo123350a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33303m
        /* renamed from: a */
        public void mo122775a(boolean z) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33297g
        /* renamed from: a */
        public boolean mo122762a(C33973b bVar) {
            return false;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33298h
        /* renamed from: b */
        public void mo122764b(String str, Message.Type type) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33306p
        /* renamed from: f */
        public void mo122777f(String str) {
        }

        @Override // com.ss.android.lark.chat.utils.C34365w.AbstractC34377a
        public void f_(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
        /* renamed from: g */
        public void mo122797g(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.block.MessageStatusBlock.AbstractC33313a
        /* renamed from: h */
        public void mo122798h(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33291a
        /* renamed from: i */
        public void mo122756i(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33294d
        /* renamed from: j */
        public void mo122760j(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: l */
        public void mo122768l(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: m */
        public void mo122769m(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: n */
        public void mo122770n(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33302l
        /* renamed from: p */
        public void mo122774p(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33305o
        /* renamed from: q */
        public void mo122776q(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
        /* renamed from: r */
        public void mo122779r(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q
        /* renamed from: s */
        public void mo122780s(String str) {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i
        /* renamed from: k */
        public void mo122767k(String str) {
            MergeForwardView.this.f88009b.mo126219b(str, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340469.C340493 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e(errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    MergeForwardView.this.f88015h.mo134330a(MergeForwardView.this.f88010c, str);
                }
            });
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33300j
        /* renamed from: o */
        public void mo122771o(String str) {
            MergeForwardView.this.f88009b.mo126215a(str, new IGetDataCallback<MessageInfo>() {
                /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340469.C340482 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e(errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(MessageInfo messageInfo) {
                    int i;
                    if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.FILE) {
                        Message message = messageInfo.getMessage();
                        if (MergeForwardView.this.f88011d == 1) {
                            i = 2;
                        } else if (MergeForwardView.this.f88011d == 3) {
                            i = 3;
                        } else {
                            i = -99;
                        }
                        MergeForwardView.this.f88014g.mo134703a(MergeForwardView.this.f88010c, message, false, MergeForwardView.this.f88009b.mo126220c(), MergeForwardView.this.f88009b.mo126221d(), i);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnThreadMergeForwardClickListener
        /* renamed from: u */
        public void mo123362u(String str) {
            MergeForwardView.this.f88009b.mo126215a(str, new UIGetDataCallback(new IGetDataCallback<MessageInfo>() {
                /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340469.C340471 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165386e("MergeForwardView2", errorResult);
                }

                /* renamed from: a */
                public void onSuccess(MessageInfo messageInfo) {
                    if (messageInfo != null) {
                        ThreadMergeForwardLauncher.f138288a.mo190745a(MergeForwardView.this.f88010c, MergeForwardView.this.f88009b.mo126220c(), messageInfo.getMessage());
                    } else {
                        Log.m165383e("MergeForwardView2", "messageInfo is null");
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
        /* renamed from: b */
        public List<String> mo122758b(int i) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(MergeForwardView.this.f88008a.mo122242a());
            if (!CollectionUtils.isEmpty(arrayList2)) {
                int size = arrayList2.size();
                while (true) {
                    i++;
                    if (i >= size) {
                        break;
                    }
                    ChatMessageVO cVar = (ChatMessageVO) arrayList2.get(i);
                    if ((cVar.mo121699g() instanceof AudioContentVO) && cVar.mo121702j() < 2 && !cVar.mo121695c()) {
                        String d = cVar.mo121696d();
                        if (!TextUtils.isEmpty(d)) {
                            arrayList.add(d);
                        }
                    }
                }
            }
            return arrayList;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c
        /* renamed from: b */
        public void mo122759b(String str, String str2) {
            MergeForwardView.this.f88009b.mo126216a(str, str2);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.view.message.callbacks.OnFolderClickListener
        /* renamed from: d */
        public void mo123355d(String str, int i) {
            MergeForwardView.this.f88009b.mo126215a(str, new IGetDataCallback<MessageInfo>() {
                /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340469.C340504 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("MergeForwardView2", errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(MessageInfo messageInfo) {
                    int i;
                    if (messageInfo != null && messageInfo.getMessage().getType() == Message.Type.FOLDER) {
                        Message message = messageInfo.getMessage();
                        if (MergeForwardView.this.f88011d == 1) {
                            i = 2;
                        } else if (MergeForwardView.this.f88011d == 3) {
                            i = 3;
                        } else {
                            i = -99;
                        }
                        MergeForwardView.this.f88014g.mo134699a(MergeForwardView.this.f88010c, message, MergeForwardView.this.f88009b.mo126220c(), MergeForwardView.this.f88009b.mo126221d(), i);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33301k
        /* renamed from: a */
        public void mo122772a(View view, ActivityTransitionLauncher.LocationInfo locationInfo, PhotoItem photoItem, boolean z, boolean z2, int i) {
            MergeForwardView.this.f88009b.mo126213a(view, photoItem, z2);
        }
    };
    public PointRecoderRecyclerView mMessageRV;
    public View mRootView;
    public CommonTitleBar mTitleBar;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f88009b = null;
    }

    /* renamed from: b */
    private void m132024b() {
        m132025c();
        m132026d();
        m132027e();
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m132028f() {
        C34051a.AbstractC34054b.AbstractC34055a aVar = this.f88009b;
        if (aVar != null) {
            aVar.mo126217a(m132022a(this.mMessageRV));
        }
    }

    /* renamed from: a */
    public void mo126181a() {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.chat.mergeforward.$$Lambda$MergeForwardView$BzLSfWH3ZzjdR7GTQifBo5Vez08 */

            public final void run() {
                MergeForwardView.lambda$BzLSfWH3ZzjdR7GTQifBo5Vez08(MergeForwardView.this);
            }
        }, 200);
    }

    /* renamed from: c */
    private void m132025c() {
        if (this.f88011d == 1) {
            if (DesktopUtil.m144307b()) {
                this.mTitleBar.setLeftImageDrawable(null);
                this.mTitleBar.setLeftClickListener(null);
                return;
            }
            this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.ud_icon_forward_outlined, R.color.icon_n1) {
                /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340382 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    MergeForwardView.this.f88012e.mo159975a();
                }
            });
            this.mTitleBar.addAction(new IActionTitlebar.C57573a(R.drawable.ud_icon_delete_trash_outlined, R.color.icon_n1) {
                /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340393 */

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    MergeForwardView.this.f88012e.mo159976b();
                }
            });
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f88016i.mo159971a(this);
        this.f88012e = new C45272a(this.f88016i, new C45272a.AbstractC45273a() {
            /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340371 */

            @Override // com.ss.android.lark.mergeforward.C45272a.AbstractC45273a
            /* renamed from: a */
            public void mo126189a() {
                MergeForwardView.this.f88009b.mo126218b();
            }

            @Override // com.ss.android.lark.mergeforward.C45272a.AbstractC45273a
            /* renamed from: b */
            public void mo126190b() {
                MergeForwardView.this.f88009b.mo126212a();
            }
        }, this.f88010c);
        this.f88017j = new C34058c(this.f88010c);
        m132024b();
    }

    /* renamed from: d */
    private void m132026d() {
        this.mMessageRV.setLayoutManager(new LinearLayoutManager(this.f88010c, 1, false));
        ((SimpleItemAnimator) this.mMessageRV.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mMessageRV.setTouchViewListener(new PointRecoderRecyclerView.AbstractC58964a() {
            /* class com.ss.android.lark.chat.mergeforward.$$Lambda$MergeForwardView$u8vKwUirNPoCDInUaxe55j0ko_M */

            @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
            public final void onTouchiew(float f, float f2) {
                MergeForwardView.lambda$u8vKwUirNPoCDInUaxe55j0ko_M(MergeForwardView.this, f, f2);
            }
        });
        C48211b.m190251a().mo168687a(this.mMessageRV);
        this.mMessageRV.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340404 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
                MergeForwardView.this.mo126181a();
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
                MergeForwardView.this.mo126181a();
            }
        });
        C35252a aVar = new C35252a(this.mRootView);
        this.f88013f = aVar;
        aVar.mo129729a((ViewTreeObserver.OnGlobalLayoutListener) new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.ViewTreeObserver$OnGlobalLayoutListenerC340415 */

            public void onGlobalLayout() {
                MergeForwardView.this.f88013f.mo129730b((ViewTreeObserver.OnGlobalLayoutListener) this);
                MergeForwardView.this.mo126181a();
            }
        });
    }

    /* renamed from: e */
    private void m132027e() {
        C33086b bVar = new C33086b();
        this.f88008a = bVar;
        bVar.mo200127a(C57852m.m224554a(this.f88010c));
        this.f88017j.mo126226a(new C58984d<ChatMessageVO, C33086b>(this.f88008a) {
            /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340426 */

            /* renamed from: a */
            public boolean mo123399a(ChatMessageVO cVar) {
                super.mo123399a((Object) cVar);
                return false;
            }
        });
        C33328c.m129034a(this.f88017j, new AbstractC34056b(this.mMessageRV, this.f88017j) {
            /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340437 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m132041a(ChatMessageVO cVar, int i) {
                if (i == 1) {
                    Log.m165389i("MergeForwardView2", "click :" + cVar.mo121681a());
                } else if (i == 3) {
                    MergeForwardView.this.f88009b.mo126215a(cVar.mo121681a(), new IGetDataCallback<MessageInfo>() {
                        /* class com.ss.android.lark.chat.mergeforward.MergeForwardView.C340437.C340441 */

                        /* renamed from: a */
                        public void onSuccess(MessageInfo messageInfo) {
                            Log.m165389i("MergeForwardView2", "click 3:" + messageInfo.toString());
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165389i("MergeForwardView2", "click 3: " + errorResult.toString());
                        }
                    });
                }
            }

            /* renamed from: b */
            public void mo123401e(AbstractC59004b bVar, AbstractC59010e eVar, ChatMessageVO cVar) {
                MergeForwardView.this.f88009b.mo126214a(cVar.mo121681a());
                C34378x.m133309a().mo126949a(new C34378x.AbstractC34379a(cVar) {
                    /* class com.ss.android.lark.chat.mergeforward.$$Lambda$MergeForwardView$7$d53gvX7Irf8nE9rSR0PANAbwCQc */
                    public final /* synthetic */ ChatMessageVO f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.chat.utils.C34378x.AbstractC34379a
                    public final void onTick(int i) {
                        MergeForwardView.C340437.lambda$d53gvX7Irf8nE9rSR0PANAbwCQc(MergeForwardView.C340437.this, this.f$1, i);
                    }
                });
            }
        }, this.f88018k, this.f88019l).mo122819a(this.f88008a);
        this.mMessageRV.setAdapter(this.f88008a);
        this.mMessageRV.addItemDecoration(new C33423r(this.f88008a));
    }

    /* renamed from: a */
    public void setViewDelegate(C34051a.AbstractC34054b.AbstractC34055a aVar) {
        this.f88009b = aVar;
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b
    /* renamed from: b */
    public void mo126187b(String str) {
        this.f88016i.mo159973a(str);
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b
    /* renamed from: c */
    public void mo126188c(String str) {
        this.f88016i.mo159974b(str);
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b
    /* renamed from: a */
    public void mo126183a(FavoriteMessageInfo favoriteMessageInfo) {
        this.f88016i.mo159972a(favoriteMessageInfo);
    }

    /* renamed from: a */
    private List<String> m132022a(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        List<ChatMessageVO> a = this.f88008a.mo122243a(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), true);
        ArrayList arrayList = new ArrayList();
        for (ChatMessageVO cVar : a) {
            arrayList.add(cVar.mo121681a());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b
    /* renamed from: a */
    public void mo126185a(String str) {
        if (this.f88011d == 1) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_Detail));
        } else {
            this.mTitleBar.setTitle(str);
        }
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b
    /* renamed from: a */
    public void mo126186a(List<ChatMessageVO> list) {
        this.f88008a.mo122244a(list);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m132023a(float f, float f2) {
        this.f88017j.mo126225a((int) f2);
    }

    public MergeForwardView(AbstractC45276d dVar, FragmentActivity fragmentActivity, int i) {
        this.f88016i = dVar;
        this.f88010c = fragmentActivity;
        this.f88011d = i;
    }

    @Override // com.ss.android.lark.chat.mergeforward.C34051a.AbstractC34054b
    /* renamed from: a */
    public void mo126182a(int i, List<PhotoItem> list, View view) {
        DialogMenuClickListenerImpl dialogMenuClickListenerImpl = new DialogMenuClickListenerImpl("");
        C29990c.m110930b().mo134542a(this.f88010c, list, i, view, null, true, false, true, false, true, C29990c.m110930b().mo134586n().mo134685a("translate.message.image.viewer.enable"), false, false, dialogMenuClickListenerImpl, null, null, Scene.Forward, 1);
    }
}
