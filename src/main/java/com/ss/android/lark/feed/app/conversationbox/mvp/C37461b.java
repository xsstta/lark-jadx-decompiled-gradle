package com.ss.android.lark.feed.app.conversationbox.mvp;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c;
import com.ss.android.lark.feed.app.conversationbox.mvp.ConversationBoxView;
import com.ss.android.lark.feed.app.delayed.statistics.DelayedHitPoint;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.b */
public class C37461b extends BasePresenter<AbstractC37475c.AbstractC37476a, AbstractC37475c.AbstractC37478b, AbstractC37475c.AbstractC37478b.AbstractC37479a> {

    /* renamed from: a */
    public ConcurrentSkipListSet<Future> f96116a = new ConcurrentSkipListSet<>(new Comparator<Future>() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374621 */

        /* renamed from: a */
        public int compare(Future future, Future future2) {
            return 0;
        }
    });

    /* renamed from: b */
    private AbstractC37475c.AbstractC37478b.AbstractC37479a f96117b = new AbstractC37475c.AbstractC37478b.AbstractC37479a() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374632 */

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b.AbstractC37479a
        /* renamed from: a */
        public boolean mo137424a() {
            return ((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137400c();
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b.AbstractC37479a
        /* renamed from: b */
        public void mo137425b() {
            if (((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137394a()) {
                ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137365b();
                ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137368e();
            }
            ((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137396b();
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b.AbstractC37479a
        /* renamed from: a */
        public void mo137421a(final ChatFeedPreview chatFeedPreview) {
            C37461b.this.f96116a.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374632.C374641 */

                /* renamed from: a */
                public Boolean mo102726b() throws Exception {
                    if (((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()) == null) {
                        return false;
                    }
                    ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137363a(chatFeedPreview.getId(), chatFeedPreview, new IGetDataCallback<Chat>() {
                        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374632.C374641.C374651 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }

                        /* renamed from: a */
                        public void onSuccess(Chat chat) {
                            if (chat != null && chat.getRole() != Chat.Role.MEMBER) {
                                ((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137392a(chat.getId());
                                ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137362a(UIHelper.getString(R.string.Lark_Legacy_OutOfGroup));
                            }
                        }
                    });
                    return true;
                }
            }));
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b.AbstractC37479a
        /* renamed from: a */
        public void mo137422a(FeedPreview feedPreview) {
            if (feedPreview.isInChatBox()) {
                ((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137390a(feedPreview);
            }
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b.AbstractC37479a
        /* renamed from: b */
        public void mo137426b(final FeedPreview feedPreview, final boolean z) {
            ((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137398b(feedPreview, z, new IGetDataCallback<Shortcut>() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374632.C374673 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (z) {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137362a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Feed_AddQuickSwitcherFail)));
                    } else {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137362a(UIHelper.getString(R.string.Lark_Feed_RemoveQuickSwitcherFail));
                    }
                }

                /* renamed from: a */
                public void onSuccess(Shortcut shortcut) {
                    feedPreview.setSwipedLeftPinned(false);
                    feedPreview.setShortCut(z);
                    ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137370g();
                    ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137360a(feedPreview);
                    if (z) {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137362a(UIHelper.getString(R.string.Lark_Chat_QuickswitcherPinClickToasts));
                    } else {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137362a(UIHelper.getString(R.string.Lark_Chat_QuickswitcherUnpinClickToasts));
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37478b.AbstractC37479a
        /* renamed from: a */
        public void mo137423a(final FeedPreview feedPreview, final boolean z) {
            ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137370g();
            String a = C37461b.this.mo137418a(feedPreview);
            if (z) {
                if (!TextUtils.isEmpty(a)) {
                    DelayedHitPoint.f96156a.mo137474a("chat_later", a, feedPreview.getId());
                }
            } else if (!TextUtils.isEmpty(a)) {
                DelayedHitPoint.f96156a.mo137474a("chat_later_cancel", a, feedPreview.getId());
            }
            ((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137391a(feedPreview, z, new IGetDataCallback<FeedPreviewInfo>() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374632.C374662 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(FeedPreviewInfo feedPreviewInfo) {
                    feedPreview.setSwipedLeftPinned(false);
                    Log.m165378d("set Delayed  my :" + z);
                    Log.m165378d("set Delayed  from Service : " + feedPreviewInfo.mo105982F());
                }
            });
        }
    };

    /* renamed from: c */
    private AbstractC37475c.AbstractC37476a.AbstractC37477a f96118c = new AbstractC37475c.AbstractC37476a.AbstractC37477a() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374683 */

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a.AbstractC37477a
        /* renamed from: a */
        public void mo137431a() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374683.RunnableC374713 */

                public void run() {
                    ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137366c();
                    if (((AbstractC37475c.AbstractC37476a) C37461b.this.getModel()).mo137394a()) {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137367d();
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a.AbstractC37477a
        /* renamed from: b */
        public void mo137435b() {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374683.RunnableC374724 */

                public void run() {
                    AbstractC37475c.AbstractC37478b bVar = (AbstractC37475c.AbstractC37478b) C37461b.this.getView();
                    if (bVar != null) {
                        bVar.mo137369f();
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a.AbstractC37477a
        /* renamed from: a */
        public void mo137432a(final int i) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374683.RunnableC374735 */

                public void run() {
                    AbstractC37475c.AbstractC37478b bVar = (AbstractC37475c.AbstractC37478b) C37461b.this.getView();
                    if (bVar != null) {
                        bVar.mo137358a(i);
                    }
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a.AbstractC37477a
        /* renamed from: a */
        public void mo137433a(final UpdateRecord updateRecord) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374683.RunnableC374691 */

                public void run() {
                    if (updateRecord.mo138376c() == null || updateRecord.mo138376c().size() == 0) {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137366c();
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137367d();
                    } else {
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137366c();
                        ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137368e();
                    }
                    ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137361a(updateRecord);
                }
            });
        }

        @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a.AbstractC37477a
        /* renamed from: a */
        public void mo137434a(final Map<Integer, Integer> map) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374683.RunnableC374702 */

                public void run() {
                    ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137364a(map);
                }
            });
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC37475c.AbstractC37478b.AbstractC37479a createViewDelegate() {
        return this.f96117b;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Iterator<Future> it = this.f96116a.iterator();
        while (it.hasNext()) {
            it.next().cancel(false);
        }
        this.f96116a.clear();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (((AbstractC37475c.AbstractC37476a) getModel()).mo137394a()) {
            ((AbstractC37475c.AbstractC37478b) getView()).mo137365b();
            ((AbstractC37475c.AbstractC37478b) getView()).mo137368e();
        }
        ((AbstractC37475c.AbstractC37476a) getModel()).mo137396b();
        ((AbstractC37475c.AbstractC37476a) getModel()).mo137388a(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37461b.C374744 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(Integer num) {
                ((AbstractC37475c.AbstractC37478b) C37461b.this.getView()).mo137358a(num.intValue());
            }
        });
    }

    /* renamed from: a */
    public String mo137418a(FeedPreview feedPreview) {
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

    public C37461b(Context context, ConversationBoxView.AbstractC37448a aVar, String str) {
        ConversationBoxView conversationBoxView = new ConversationBoxView(context, aVar);
        C37449a aVar2 = new C37449a(C37731d.m148488a(), str);
        conversationBoxView.setViewDelegate(createViewDelegate());
        aVar2.mo137389a(this.f96118c);
        setView(conversationBoxView);
        setModel(aVar2);
    }
}
