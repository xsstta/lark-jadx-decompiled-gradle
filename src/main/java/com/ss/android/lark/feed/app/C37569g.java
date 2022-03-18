package com.ss.android.lark.feed.app;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.C37623j;
import com.ss.android.lark.feed.app.binder.C37394h;
import com.ss.android.lark.feed.app.delayed.statistics.DelayedHitPoint;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.hitpoint.FeedShortcutHitPoint;
import com.ss.android.lark.feed.app.model.common.LoadState;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.model.p1863c.C37712c;
import com.ss.android.lark.feed.app.p1848a.C37289c;
import com.ss.android.lark.feed.app.p1848a.C37290d;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.interfaces.AbstractC38115y;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.p1873d.C38074a;
import com.ss.android.lark.feed.service.impl.C38173m;
import com.ss.android.lark.feed.service.p1884a.AbstractC38121c;
import com.ss.android.lark.feed.statistics.chat.ChatHitPoint;
import com.ss.android.lark.feed.statistics.group.GroupHitPoint;
import com.ss.android.lark.feed.statistics.shortcut.ShortcutHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.lark.feed.app.g */
public class C37569g extends BasePresenter<C37623j.AbstractC37624a, C37623j.AbstractC37626b, C37623j.AbstractC37626b.AbstractC37627a> {

    /* renamed from: a */
    AbstractC38037a.AbstractC38050j f96344a = C37268c.m146766b().mo139204w();

    /* renamed from: b */
    AbstractC38121c f96345b = C38173m.m150043b();

    /* renamed from: c */
    public final AbstractC37582a f96346c;

    /* renamed from: d */
    public C37593c f96347d;

    /* renamed from: e */
    public final ConcurrentSkipListSet<Future> f96348e = new ConcurrentSkipListSet<>(new Comparator<Future>() {
        /* class com.ss.android.lark.feed.app.C37569g.C375701 */

        /* renamed from: a */
        public int compare(Future future, Future future2) {
            return 0;
        }
    });

    /* renamed from: f */
    public boolean f96349f = false;

    /* renamed from: g */
    public FeedCard.FeedType f96350g;

    /* renamed from: h */
    public boolean f96351h;

    /* renamed from: i */
    public boolean f96352i;

    /* renamed from: j */
    public boolean f96353j;

    /* renamed from: k */
    public final AbstractC38037a.AbstractC38059s f96354k = new AbstractC38037a.AbstractC38059s() {
        /* class com.ss.android.lark.feed.app.C37569g.C375733 */

        @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38059s
        /* renamed from: a */
        public void mo137914a(Locale locale, Locale locale2) {
            C37712c.m148280b();
            C37394h.m147187a();
        }
    };

    /* renamed from: l */
    public final AbstractC38115y f96355l = new AbstractC38115y() {
        /* class com.ss.android.lark.feed.app.C37569g.C375744 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38115y
        /* renamed from: a */
        public void mo137915a() {
            EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.TENANT_CHANGE));
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38115y
        /* renamed from: b */
        public void mo137917b() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C375744.RunnableC375751 */

                public void run() {
                    ((C37623j.AbstractC37626b) C37569g.this.getView()).mo136998a();
                }
            });
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38115y
        /* renamed from: a */
        public void mo137916a(boolean z) {
            EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.TENANT_CHANGE));
        }
    };

    /* renamed from: m */
    private C37583b f96356m;

    /* renamed from: com.ss.android.lark.feed.app.g$a */
    public interface AbstractC37582a {
        /* renamed from: a */
        void mo137773a();

        /* renamed from: a */
        void mo137774a(int i);

        /* renamed from: a */
        void mo137775a(boolean z);

        /* renamed from: b */
        void mo137776b();

        /* renamed from: b */
        void mo137777b(int i);

        /* renamed from: c */
        void mo137778c();

        /* renamed from: d */
        void mo137779d();
    }

    /* renamed from: com.ss.android.lark.feed.app.g$c */
    public class C37593c implements C37623j.AbstractC37626b.AbstractC37627a {
        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137960a(UIFeedCard uIFeedCard, int i) {
            Log.m165379d("FeedModule_FeedListPresenter", "Presenter onShortcutItemMove " + uIFeedCard.getId() + " " + i);
            Shortcut shortcut = new Shortcut(Channel.Type.fromFeedType(uIFeedCard.getType().getNumber()), uIFeedCard.getId());
            shortcut.setPosition(i);
            C37569g.this.f96345b.mo139449c(shortcut, null);
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137961a(final List<UIFeedCard> list) {
            C37569g.this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.C375995 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                    if (aVar == null || CollectionUtils.isEmpty(list)) {
                        return false;
                    }
                    aVar.mo138022a(list);
                    return true;
                }
            }));
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137951a() {
            C37569g.this.f96344a.mo139251e();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: j */
        public void mo137972j() {
            C37569g.this.f96346c.mo137778c();
        }

        /* renamed from: m */
        private void m147812m() {
            C37262a.m146726a().mo139166M().mo139285b("conversation");
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: b */
        public void mo137962b() {
            UICallbackExecutor.executeDelayed(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.RunnableC376006 */

                public void run() {
                    C37569g.this.f96347d.mo137970h();
                }
            }, 64);
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: d */
        public void mo137966d() {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137040p();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: e */
        public void mo137967e() {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137032h();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: f */
        public void mo137968f() {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137033i();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: g */
        public void mo137969g() {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137034j();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: k */
        public boolean mo137973k() {
            return ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138032c();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: c */
        public void mo137964c() {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137031g();
            GroupHitPoint.f97735a.mo139413a();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: i */
        public void mo137971i() {
            C37262a.m146726a().mo139166M().mo139287d("conversation");
            C37262a.m146726a().mo139166M().mo139286c("conversation");
            C37569g.this.f96346c.mo137776b();
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: l */
        public void mo137974l() {
            C37569g.this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.C375973 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    ChatHitPoint.f97732a.mo139407a();
                    C37290d.m146907a().mo137118b();
                    return true;
                }
            }));
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: h */
        public void mo137970h() {
            C37569g.this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.AnonymousClass11 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                    if (aVar != null) {
                        aVar.mo138013a();
                    }
                    return true;
                }
            }));
            C37569g.this.f96349f = true;
            m147812m();
        }

        public C37593c() {
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137956a(FeedFilter feedFilter) {
            ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138016a(feedFilter);
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137954a(BannerPreview bannerPreview) {
            if (C37569g.this.getModel() != null) {
                ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138025b();
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137955a(DocFeedPreview docFeedPreview) {
            if (docFeedPreview.getBadgeCount() > 0) {
                ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138028b(docFeedPreview.getId());
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137957a(FeedPreview feedPreview) {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137018b(feedPreview);
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137959a(final UIFeedCard uIFeedCard) {
            C37569g.this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.C375941 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                    if (aVar == null) {
                        return false;
                    }
                    aVar.mo138019a(uIFeedCard, FeedCard.FeedType.DONE, new IGetDataCallback<List<FeedCard>>() {
                        /* class com.ss.android.lark.feed.app.C37569g.C37593c.C375941.C375951 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        /* renamed from: a */
                        public void onSuccess(List<FeedCard> list) {
                            C37569g.this.mo137899a(uIFeedCard);
                        }
                    });
                    return true;
                }
            }));
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: b */
        public void mo137963b(final FeedPreview feedPreview, final boolean z) {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137038n();
            if (z) {
                ShortcutHitPoint.m149835a(0, feedPreview);
            } else {
                ShortcutHitPoint.m149840b(0, feedPreview);
            }
            ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138027b(feedPreview, z, new IGetDataCallback<Shortcut>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.AnonymousClass10 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (z) {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137011a(UIHelper.getString(R.string.Lark_Feed_AddQuickSwitcherFail));
                    } else {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137011a(UIHelper.getString(R.string.Lark_Feed_RemoveQuickSwitcherFail));
                    }
                    FeedShortcutHitPoint.f95785a.mo137123a(errorResult.getErrorCode(), z);
                }

                /* renamed from: a */
                public void onSuccess(Shortcut shortcut) {
                    feedPreview.setSwipedLeftPinned(false);
                    feedPreview.setShortCut(z);
                    ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137006a(feedPreview);
                    if (z) {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137011a(UIHelper.getString(R.string.Lark_Chat_QuickswitcherPinClickToasts));
                    } else {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137011a(UIHelper.getString(R.string.Lark_Chat_QuickswitcherUnpinClickToasts));
                    }
                    FeedShortcutHitPoint.f95785a.mo137122a();
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: c */
        public void mo137965c(final FeedPreview feedPreview, final boolean z) {
            ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138024a(z, feedPreview, new IGetDataCallback<Object>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.C375984 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    sb.append("change conversation box fail : ");
                    sb.append(errorResult.toString());
                    sb.append(" id = ");
                    sb.append(feedPreview.getId());
                    sb.append(" operation : ");
                    if (z) {
                        str = "add";
                    } else {
                        str = "remove";
                    }
                    sb.append(str);
                    Log.m165382e(sb.toString());
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
                public void onSuccess(Object obj) {
                    String str;
                    StringBuilder sb = new StringBuilder();
                    sb.append("change conversation box: id = ");
                    sb.append(feedPreview.getId());
                    sb.append(" operation : ");
                    if (z) {
                        str = "add";
                    } else {
                        str = "remove";
                    }
                    sb.append(str);
                    Log.m165389i("FeedModule_FeedListPresenter", sb.toString());
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137958a(final FeedPreview feedPreview, final boolean z) {
            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137038n();
            String a = C37569g.this.mo137896a(feedPreview);
            if (z) {
                if (!TextUtils.isEmpty(a)) {
                    DelayedHitPoint.f96156a.mo137474a("chat_later", a, feedPreview.getId());
                }
            } else if (!TextUtils.isEmpty(a)) {
                DelayedHitPoint.f96156a.mo137474a("chat_later_cancel", a, feedPreview.getId());
            }
            ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138017a(feedPreview, z, new IGetDataCallback<FeedPreviewInfo>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.C376039 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(FeedPreviewInfo feedPreviewInfo) {
                    feedPreview.setSwipedLeftPinned(false);
                    feedPreview.setDelayed(feedPreviewInfo.mo105982F());
                    ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137006a(feedPreview);
                    if (C37268c.m146766b().mo139198q().mo139256a("lark.core.mark_guide") && z) {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137037m();
                    }
                    Log.m165378d("set Delayed  my :" + z);
                    Log.m165378d("set Delayed  from Service : " + feedPreviewInfo.mo105982F());
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137953a(final FeedCard.FeedType feedType, final int i, final FeedPreview feedPreview) {
            C37569g.this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.C37569g.C37593c.C375962 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                    if (aVar != null) {
                        aVar.mo138015a(feedType, i, feedPreview);
                    }
                    return true;
                }
            }));
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37626b.AbstractC37627a
        /* renamed from: a */
        public void mo137952a(final View view, ChatFeedPreview chatFeedPreview, boolean z) {
            if (((C37623j.AbstractC37624a) C37569g.this.getModel()) != null) {
                if (C37262a.m146726a().mo139198q().mo139256a("lark.feed.item.selected.delay") && !DesktopUtil.m144307b() && view != null) {
                    view.setSelected(true);
                    view.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.feed.app.C37569g.C37593c.RunnableC376017 */

                        public void run() {
                            view.setSelected(false);
                        }
                    }, 350);
                }
                ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137012a(chatFeedPreview.getId(), chatFeedPreview, z, new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.feed.app.C37569g.C37593c.C376028 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        if (chat != null && chat.getRole() != Chat.Role.MEMBER) {
                            ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138021a(chat.getId());
                            ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137011a(C37268c.m146766b().mo139170a().getString(R.string.Lark_Legacy_OutOfGroup));
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C37623j.AbstractC37626b.AbstractC37627a createViewDelegate() {
        C37593c cVar = new C37593c();
        this.f96347d = cVar;
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.app.g$b */
    public class C37583b implements C37623j.AbstractC37624a.AbstractC37625a {
        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137931a(Map<Integer, Integer> map) {
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137925a() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375918 */

                public void run() {
                    C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                    if (bVar != null) {
                        bVar.mo137014a(true);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: b */
        public void mo137933b() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375929 */

                public void run() {
                    C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                    if (bVar != null) {
                        bVar.mo137014a(false);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: c */
        public void mo137937c() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37583b.AnonymousClass11 */

                public void run() {
                    if (C37569g.this.f96346c != null) {
                        C37569g.this.f96346c.mo137773a();
                    }
                    C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                    if (bVar != null) {
                        bVar.mo137036l();
                    }
                }
            });
        }

        private C37583b() {
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: d */
        public void mo137939d(final UpdateRecord updateRecord) {
            if (updateRecord != null) {
                C38074a.m149792a("onFilterDataChanged", new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375896 */

                    public void run() {
                        C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                        if (bVar != null) {
                            bVar.mo137027d(updateRecord);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137926a(final int i) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375907 */

                public void run() {
                    C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                    if (bVar != null) {
                        bVar.mo137016b(i);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: b */
        public void mo137934b(final int i) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375863 */

                public void run() {
                    C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                    if (bVar != null) {
                        bVar.mo137022c(i);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: c */
        public void mo137938c(final UpdateRecord updateRecord) {
            if (updateRecord != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375885 */

                    public void run() {
                        C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                        if (bVar != null) {
                            bVar.mo137024c(updateRecord);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: b */
        public void mo137935b(final UpdateRecord updateRecord) {
            LoadState loadState;
            if (updateRecord != null) {
                final boolean e = updateRecord.mo138378e();
                final boolean z = false;
                if (e) {
                    if (C37569g.this.getModel() == null) {
                        loadState = null;
                    } else {
                        loadState = ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138012a(FeedCard.FeedType.DONE);
                    }
                    if (loadState != null && (loadState.mo138363c() || loadState.mo138362b())) {
                        z = true;
                    }
                }
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375874 */

                    public void run() {
                        C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                        if (bVar != null) {
                            bVar.mo137019b(updateRecord);
                            C37569g.this.mo137900a(bVar, FeedCard.FeedType.DONE, z, e);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137929a(final UpdateRecord updateRecord) {
            LoadState loadState;
            if (updateRecord != null) {
                final boolean e = updateRecord.mo138378e();
                boolean f = updateRecord.mo138379f();
                final boolean z = false;
                if (e && !f) {
                    if (C37569g.this.getModel() == null) {
                        loadState = null;
                    } else {
                        loadState = ((C37623j.AbstractC37624a) C37569g.this.getModel()).mo138012a(FeedCard.FeedType.INBOX);
                    }
                    if (loadState != null && (loadState.mo138363c() || loadState.mo138362b())) {
                        z = true;
                    }
                }
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375841 */

                    public void run() {
                        C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                        if (bVar != null) {
                            bVar.mo137009a(updateRecord);
                            C37569g.this.mo137900a(bVar, FeedCard.FeedType.INBOX, z, e);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: b */
        public void mo137936b(final boolean z) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37569g.C37583b.RunnableC375852 */

                public void run() {
                    if (C37569g.this.f96346c != null) {
                        C37569g.this.f96346c.mo137775a(z);
                    }
                    if (C37569g.this.getView() != null) {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137028d(z);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137932a(boolean z) {
            C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
            if (bVar != null) {
                bVar.mo137020b(z);
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137928a(LoadState loadState, FeedCard.FeedType feedType) {
            C37569g.this.mo137898a(feedType);
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137927a(FeedCard.FeedType feedType, LoadState.LoadType loadType) {
            C37623j.AbstractC37626b bVar;
            if (feedType == FeedCard.FeedType.INBOX && loadType == LoadState.LoadType.LOCAL && (bVar = (C37623j.AbstractC37626b) C37569g.this.getView()) != null) {
                bVar.mo137039o();
            }
        }

        @Override // com.ss.android.lark.feed.app.C37623j.AbstractC37624a.AbstractC37625a
        /* renamed from: a */
        public void mo137930a(final List<TenantInfo> list, final List<TenantInfo.PendingUser> list2) {
            C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
            final C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
            if (aVar != null && bVar != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37569g.C37583b.AnonymousClass10 */

                    public void run() {
                        List<TenantInfo> list = list;
                        if (list != null) {
                            bVar.mo137013a(list, list2);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: f */
    private void m147754f() {
        ((C37623j.AbstractC37624a) getModel()).mo138026b(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.feed.app.C37569g.C375765 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(Integer num) {
                ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137022c(num.intValue());
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C37623j.AbstractC37624a.AbstractC37625a mo137903b() {
        C37583b bVar = new C37583b();
        this.f96356m = bVar;
        return bVar;
    }

    /* renamed from: e */
    public ITitleInfo mo137908e() {
        C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) getView();
        if (bVar != null) {
            return bVar.mo137041q();
        }
        return null;
    }

    /* renamed from: g */
    private void m147755g() {
        if (getModel() != null) {
            ((C37623j.AbstractC37624a) getModel()).mo138030c(new IGetDataCallback<StrongGuideInfo>() {
                /* class com.ss.android.lark.feed.app.C37569g.C375776 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("FeedModule_FeedListPresenter", errorResult.getDebugMsg());
                }

                /* renamed from: a */
                public void onSuccess(StrongGuideInfo dVar) {
                    if (dVar.mo139397a()) {
                        ((C37623j.AbstractC37626b) C37569g.this.getView()).mo137010a(dVar);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    private void m147756h() {
        this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.C37569g.C375808 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37268c.m146766b().mo139200s().mo139318a(C37569g.this.f96355l);
                C37268c.m146766b().mo139203v().mo139296a(C37569g.this.f96354k);
                return true;
            }
        }));
    }

    /* renamed from: i */
    private void m147757i() {
        this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.C37569g.C375712 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                if (aVar == null) {
                    return false;
                }
                aVar.mo138014a(new IGetDataCallback<Map<Integer, Integer>>() {
                    /* class com.ss.android.lark.feed.app.C37569g.C375712.C375721 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<Integer, Integer> map) {
                        C37569g.this.mo137901a(map);
                    }
                });
                return true;
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo137898a(FeedCard.FeedType.INBOX);
        m147757i();
        m147754f();
        m147756h();
        m147755g();
    }

    /* renamed from: c */
    public void mo137905c() {
        if (getView() != null) {
            ((C37623j.AbstractC37626b) getView()).mo137035k();
        }
        C37480d.m147447a().mo137455d();
        AbstractC37582a aVar = this.f96346c;
        if (aVar != null) {
            aVar.mo137779d();
        }
        this.f96350g = null;
        this.f96352i = false;
        this.f96351h = false;
        this.f96353j = false;
        m147755g();
    }

    /* renamed from: d */
    public void mo137907d() {
        final UIFeedCard uIFeedCard;
        C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) getView();
        if (bVar != null) {
            uIFeedCard = bVar.mo137015b();
        } else {
            uIFeedCard = null;
        }
        this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.C37569g.AnonymousClass10 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                if (aVar == null) {
                    return false;
                }
                aVar.mo138018a(uIFeedCard);
                return true;
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        C37268c.m146766b().mo139200s().mo139323b(this.f96355l);
        C37268c.m146766b().mo139203v().mo139298b(this.f96354k);
        Iterator<Future> it = this.f96348e.iterator();
        while (it.hasNext()) {
            it.next().cancel(false);
        }
        this.f96348e.clear();
    }

    /* renamed from: a */
    public void mo137899a(UIFeedCard uIFeedCard) {
        C37289c.m146905a(uIFeedCard);
    }

    /* renamed from: a */
    public void mo137897a(int i) {
        ((C37623j.AbstractC37626b) getView()).mo136999a(i);
    }

    /* renamed from: c */
    public void mo137906c(FeedCard.FeedType feedType) {
        C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) getModel();
        if (aVar != null) {
            aVar.mo138033d(feedType);
        }
    }

    /* renamed from: a */
    public void mo137898a(final FeedCard.FeedType feedType) {
        this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.C37569g.C375787 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                final boolean z;
                C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                final C37623j.AbstractC37626b bVar = (C37623j.AbstractC37626b) C37569g.this.getView();
                if (aVar == null || bVar == null) {
                    return false;
                }
                LoadState a = aVar.mo138012a(feedType);
                final boolean c = a.mo138363c();
                final boolean b = aVar.mo138029b(feedType);
                if (a.mo138363c() || a.mo138362b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (C37569g.this.f96350g == feedType && C37569g.this.f96351h == c && C37569g.this.f96352i == a.mo138361a() && C37569g.this.f96353j == b) {
                    return true;
                }
                C37569g.this.f96350g = feedType;
                C37569g.this.f96351h = c;
                C37569g.this.f96352i = a.mo138361a();
                C37569g.this.f96353j = b;
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.C37569g.C375787.RunnableC375791 */

                    public void run() {
                        bVar.mo137005a(feedType, c, C37569g.this.f96352i);
                        if (C37548b.m147657a().mo137792b() == FeedFilter.INBOX || C37548b.m147657a().mo137792b() == FeedFilter.DONE) {
                            C37569g.this.mo137900a(bVar, feedType, z, b);
                        }
                    }
                });
                return true;
            }
        }));
    }

    /* renamed from: b */
    public void mo137904b(FeedCard.FeedType feedType) {
        C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) getModel();
        if (aVar != null) {
            aVar.mo138031c(feedType);
        }
    }

    /* renamed from: a */
    public String mo137896a(FeedPreview feedPreview) {
        String str;
        FeedCard.Type type = feedPreview.getType();
        if (type == FeedCard.Type.CHAT) {
            ChatFeedPreview chatFeedPreview = (ChatFeedPreview) feedPreview;
            if (chatFeedPreview.getChatType() == Chat.Type.P2P) {
                str = "single";
            } else if (chatFeedPreview.isMeeting()) {
                str = "meeting";
            } else {
                str = "group";
            }
            if (chatFeedPreview.isBotChat()) {
                return "single_bot";
            }
            return str;
        } else if (type == FeedCard.Type.DOC) {
            return "doc";
        } else {
            return "";
        }
    }

    /* renamed from: a */
    public void mo137901a(Map<Integer, Integer> map) {
        if (((C37623j.AbstractC37626b) getView()) != null && map != null) {
            int intValue = map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue();
            AbstractC37582a aVar = this.f96346c;
            if (aVar != null) {
                aVar.mo137774a(intValue);
                this.f96346c.mo137777b(intValue);
            }
        }
    }

    /* renamed from: a */
    public void mo137902a(final boolean z) {
        this.f96348e.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.C37569g.C375819 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C37623j.AbstractC37624a aVar = (C37623j.AbstractC37624a) C37569g.this.getModel();
                if (aVar == null) {
                    return false;
                }
                aVar.mo138023a(z);
                return true;
            }
        }));
    }

    public C37569g(C37623j.AbstractC37626b bVar, C37623j.AbstractC37624a aVar, AbstractC37582a aVar2) {
        super(aVar, bVar);
        this.f96346c = aVar2;
        aVar.mo138020a(mo137903b());
    }

    /* renamed from: a */
    public void mo137900a(C37623j.AbstractC37626b bVar, FeedCard.FeedType feedType, boolean z, boolean z2) {
        if (!z2) {
            bVar.mo137017b(feedType);
        } else if (z) {
            bVar.mo137003a(feedType);
        } else {
            bVar.mo137004a(feedType, true);
        }
    }
}
