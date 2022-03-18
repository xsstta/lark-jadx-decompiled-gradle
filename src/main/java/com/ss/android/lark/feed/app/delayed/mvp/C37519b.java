package com.ss.android.lark.feed.app.delayed.mvp;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c;
import com.ss.android.lark.feed.app.delayed.mvp.DelayedFeedView;
import com.ss.android.lark.feed.app.delayed.statistics.DelayedHitPoint;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.delayed.mvp.b */
public class C37519b extends BasePresenter<AbstractC37532c.AbstractC37533a, AbstractC37532c.AbstractC37535b, AbstractC37532c.AbstractC37535b.AbstractC37536a> {
    /* renamed from: b */
    private AbstractC37532c.AbstractC37533a.AbstractC37534a m147567b() {
        return new AbstractC37532c.AbstractC37533a.AbstractC37534a() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375273 */

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a.AbstractC37534a
            /* renamed from: a */
            public void mo137538a() {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375273.RunnableC375292 */

                    public void run() {
                        AbstractC37532c.AbstractC37535b bVar = (AbstractC37532c.AbstractC37535b) C37519b.this.getView();
                        if (bVar != null) {
                            bVar.mo137497c();
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a.AbstractC37534a
            /* renamed from: a */
            public void mo137539a(final int i) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375273.RunnableC375314 */

                    public void run() {
                        ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137496b(i);
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a.AbstractC37534a
            /* renamed from: a */
            public void mo137540a(final UpdateRecord updateRecord) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375273.RunnableC375281 */

                    public void run() {
                        if (CollectionUtils.isEmpty(updateRecord.mo138376c())) {
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137488a();
                        } else {
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137492a(updateRecord);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a.AbstractC37534a
            /* renamed from: a */
            public void mo137541a(final Map<Integer, Integer> map) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375273.RunnableC375303 */

                    public void run() {
                        ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137494a(map);
                    }
                });
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC37532c.AbstractC37535b.AbstractC37536a createViewDelegate() {
        return new AbstractC37532c.AbstractC37535b.AbstractC37536a() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375212 */

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b.AbstractC37536a
            /* renamed from: a */
            public void mo137529a(ChatFeedPreview chatFeedPreview) {
                ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137493a(chatFeedPreview.getId(), chatFeedPreview, new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375212.C375221 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        if (chat != null && chat.getRole() != Chat.Role.MEMBER) {
                            ((AbstractC37532c.AbstractC37533a) C37519b.this.getModel()).mo137513a(chat.getId());
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137489a(R.string.Lark_Legacy_OutOfGroup);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b.AbstractC37536a
            /* renamed from: a */
            public void mo137531a(final UIFeedCard uIFeedCard) {
                ((AbstractC37532c.AbstractC37533a) C37519b.this.getModel()).mo137512a(uIFeedCard, FeedCard.FeedType.DONE, new IGetDataCallback<List<FeedCard>>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375212.C375265 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(List<FeedCard> list) {
                        C375212.this.mo137530a((FeedPreview) uIFeedCard, false);
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b.AbstractC37536a
            /* renamed from: b */
            public void mo137532b(final FeedPreview feedPreview, final boolean z) {
                ((AbstractC37532c.AbstractC37533a) C37519b.this.getModel()).mo137516b(feedPreview, z, new IGetDataCallback<Shortcut>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375212.C375243 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (z) {
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137489a(R.string.Lark_Feed_AddQuickSwitcherFail);
                        } else {
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137489a(R.string.Lark_Feed_RemoveQuickSwitcherFail);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(Shortcut shortcut) {
                        feedPreview.setSwipedLeftPinned(false);
                        feedPreview.setShortCut(z);
                        ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137495b();
                        ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137491a(feedPreview);
                        if (z) {
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137489a(R.string.Lark_Chat_QuickswitcherPinClickToasts);
                        } else {
                            ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137489a(R.string.Lark_Chat_QuickswitcherUnpinClickToasts);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b.AbstractC37536a
            /* renamed from: c */
            public void mo137533c(final FeedPreview feedPreview, final boolean z) {
                ((AbstractC37532c.AbstractC37533a) C37519b.this.getModel()).mo137514a(z, feedPreview, new IGetDataCallback<Object>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375212.C375254 */

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
                        Log.m165389i("DelayedFeedPresenter", sb.toString());
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37535b.AbstractC37536a
            /* renamed from: a */
            public void mo137530a(final FeedPreview feedPreview, final boolean z) {
                ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137495b();
                String a = C37519b.this.mo137527a(feedPreview);
                if (z) {
                    if (!TextUtils.isEmpty(a)) {
                        DelayedHitPoint.f96156a.mo137474a("chat_later", a, feedPreview.getId());
                    }
                } else if (!TextUtils.isEmpty(a)) {
                    DelayedHitPoint.f96156a.mo137474a("chat_later_cancel", a, feedPreview.getId());
                }
                ((AbstractC37532c.AbstractC37533a) C37519b.this.getModel()).mo137511a(feedPreview, z, new IGetDataCallback<FeedPreviewInfo>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375212.C375232 */

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
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC37532c.AbstractC37533a) getModel()).mo137509a(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37519b.C375201 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(Integer num) {
                ((AbstractC37532c.AbstractC37535b) C37519b.this.getView()).mo137496b(num.intValue());
            }
        });
    }

    /* renamed from: a */
    public String mo137527a(FeedPreview feedPreview) {
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

    public C37519b(Activity activity, DelayedFeedView.AbstractC37506a aVar) {
        DelayedFeedView delayedFeedView = new DelayedFeedView(activity, aVar);
        C37507a aVar2 = new C37507a(C37731d.m148488a());
        delayedFeedView.setViewDelegate(createViewDelegate());
        aVar2.mo137510a(m147567b());
        setView(delayedFeedView);
        setModel(aVar2);
    }
}
