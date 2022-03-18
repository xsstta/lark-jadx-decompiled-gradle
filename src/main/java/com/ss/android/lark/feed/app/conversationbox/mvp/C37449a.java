package com.ss.android.lark.feed.app.conversationbox.mvp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.feed.app.conversationbox.C37429a;
import com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.AbstractC37773h;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.DataLoader;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.p1862b.C37702h;
import com.ss.android.lark.feed.app.model.p1862b.C37707j;
import com.ss.android.lark.feed.app.model.p1864d.C37746f;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.interfaces.AbstractC38095f;
import com.ss.android.lark.feed.interfaces.AbstractC38106o;
import com.ss.android.lark.feed.interfaces.AbstractC38107p;
import com.ss.android.lark.feed.interfaces.AbstractC38114x;
import com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener;
import com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38126b;
import com.ss.android.lark.feed.service.impl.C38128e;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.impl.C38166k;
import com.ss.android.lark.feed.service.impl.PullType;
import com.ss.android.lark.feed.service.impl.Scene;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.mvp.a */
public class C37449a implements AbstractC37475c.AbstractC37476a {

    /* renamed from: g */
    private static final Long f96071g = Long.MAX_VALUE;

    /* renamed from: a */
    public AbstractC37475c.AbstractC37476a.AbstractC37477a f96072a;

    /* renamed from: b */
    public C37429a f96073b;

    /* renamed from: c */
    public C37746f f96074c;

    /* renamed from: d */
    public volatile boolean f96075d;

    /* renamed from: e */
    public AbstractC38037a.AbstractC38062v f96076e;

    /* renamed from: f */
    public volatile long f96077f;

    /* renamed from: h */
    private AbstractC37773h f96078h;

    /* renamed from: i */
    private CallbackManager f96079i = new CallbackManager();

    /* renamed from: j */
    private String f96080j;

    /* renamed from: k */
    private AbstractC38118b f96081k;

    /* renamed from: l */
    private AbstractC38037a.AbstractC38047g f96082l;

    /* renamed from: m */
    private AbstractC38114x f96083m;

    /* renamed from: n */
    private AbstractC38095f f96084n;

    /* renamed from: o */
    private ExecutorService f96085o;

    /* renamed from: p */
    private AbstractC38106o f96086p = new AbstractC38106o() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374501 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38106o
        /* renamed from: a */
        public void mo137401a(JSONObject jSONObject) {
            C37449a.this.mo137387a(jSONObject);
        }
    };

    /* renamed from: q */
    private IPushFeedEntityPreviewListener f96087q = new IPushFeedEntityPreviewListener() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374598 */

        @Override // com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener
        /* renamed from: a */
        public void mo137415a(JSONObject jSONObject) {
            C37449a.this.mo137397b(jSONObject);
        }
    };

    /* renamed from: r */
    private AbstractC38107p f96088r = new AbstractC38107p() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374609 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38107p
        /* renamed from: a */
        public void mo137416a(JSONObject jSONObject) {
            C37449a.this.mo137399c(jSONObject);
        }
    };

    /* renamed from: s */
    private C37731d.AbstractC37734b f96089s = new C37731d.AbstractC37734b() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.AnonymousClass10 */

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo137402a(Map<Integer, Integer> map) {
            super.mo137402a(map);
            C37449a.this.f96072a.mo137434a(map);
        }
    };

    /* renamed from: t */
    private C37429a.AbstractC37430a f96090t = new C37429a.AbstractC37430a() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.AnonymousClass11 */

        @Override // com.ss.android.lark.feed.app.conversationbox.C37429a.AbstractC37430a
        /* renamed from: a */
        public void mo137347a(UpdateRecord updateRecord) {
            C37449a.this.f96072a.mo137433a(updateRecord);
        }
    };

    /* renamed from: u */
    private AbstractC38087ab f96091u = new AbstractC38087ab() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.AnonymousClass12 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137283a(boolean z) {
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137282a() {
            if (C37449a.this.f96072a != null) {
                C37449a.this.f96072a.mo137435b();
            }
        }
    };

    /* renamed from: v */
    private ITimeFormatSettingObserver f96092v = new ITimeFormatSettingObserver() {
        /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.AnonymousClass13 */

        @Override // com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver
        /* renamed from: a */
        public void mo137403a(int i) {
            if (C37449a.this.f96072a != null) {
                C37449a.this.f96072a.mo137432a(i);
            }
        }
    };

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: a */
    public boolean mo137394a() {
        return this.f96073b.mo137344a();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: b */
    public void mo137396b() {
        m147361a(this.f96085o, new Runnable() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.AnonymousClass15 */

            public void run() {
                if (!C37449a.this.f96075d) {
                    C37449a aVar = C37449a.this;
                    aVar.mo137386a(aVar.f96077f, 50);
                }
            }
        });
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: c */
    public boolean mo137400c() {
        if (this.f96077f > 0) {
            return true;
        }
        return false;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f96085o = CoreThreadPool.getDefault().newSerialIODensityThreadPool("box_load_executor");
        this.f96078h.mo138402a(this.f96089s);
        this.f96073b.mo137342a(this.f96090t);
        this.f96072a.mo137434a(this.f96078h.mo138425p());
        C37268c.m146767c().mo139330a(this.f96091u);
        C37268c.m146767c().mo139328a(this.f96092v);
        C38128e.m149952a().mo139474a(this.f96086p);
        C38128e.m149952a().mo139475a(this.f96088r);
        C38128e.m149952a().mo139476a(this.f96087q);
        C38146f.m149976a().mo139501a(Scene.BOX, (IGetDataCallback<Boolean>) null);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C38146f.m149976a().mo139504b(Scene.BOX, (IGetDataCallback<Boolean>) null);
        this.f96079i.cancelCallbacks();
        C38128e.m149952a().mo139483b(this.f96086p);
        C38128e.m149952a().mo139484b(this.f96088r);
        C38128e.m149952a().mo139485b(this.f96087q);
        C37268c.m146767c().mo139343b(this.f96091u);
        C37268c.m146767c().mo139341b(this.f96092v);
        this.f96078h.mo138408b(this.f96089s);
        this.f96073b.mo137345b(this.f96090t);
        this.f96085o.shutdown();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: a */
    public void mo137389a(AbstractC37475c.AbstractC37476a.AbstractC37477a aVar) {
        this.f96072a = aVar;
    }

    /* renamed from: a */
    public void mo137387a(final JSONObject jSONObject) {
        if (jSONObject != null) {
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.RunnableC374565 */

                public void run() {
                    List<UIFeedCard> a = C37449a.this.f96074c.mo138449a(((C38166k) jSONObject.get("params_feed_preview_update_info")).f97854a, true);
                    C37449a.this.f96073b.mo137346b(a);
                    C37449a.this.f96073b.mo137343a(C37449a.this.mo137395b(a));
                }
            });
        }
    }

    /* renamed from: b */
    public void mo137397b(final JSONObject jSONObject) {
        if (jSONObject != null) {
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.RunnableC374576 */

                public void run() {
                    List<UIFeedCard> a = C37449a.this.f96074c.mo138449a(((C38166k) jSONObject.get("params_feed_preview_update_info")).f97854a, true);
                    C37449a.this.f96073b.mo137346b(a);
                    C37449a.this.f96073b.mo137343a(C37449a.this.mo137395b(a));
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: a */
    public void mo137388a(final IGetDataCallback<Integer> iGetDataCallback) {
        this.f96076e.mo139294a(this.f96079i.wrapAndAddGetDataCallback(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374512 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                iGetDataCallback.onSuccess(num);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
                C57865c.m224574a(new C57865c.AbstractC57873d<Integer>() {
                    /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374512.C374521 */

                    /* renamed from: a */
                    public Integer produce() {
                        return Integer.valueOf(C37449a.this.f96076e.mo139302e());
                    }
                }, new C57865c.AbstractC57871b<Integer>() {
                    /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374512.C374532 */

                    /* renamed from: a */
                    public void consume(Integer num) {
                        iGetDataCallback.onSuccess(num);
                    }
                });
            }
        }));
    }

    /* renamed from: b */
    public List<UIFeedCard> mo137395b(List<UIFeedCard> list) {
        ArrayList arrayList = new ArrayList();
        for (UIFeedCard uIFeedCard : list) {
            Log.m165389i("BoxFeedCard", "filterBoxData : id = " + uIFeedCard.getId() + ", parentId = " + uIFeedCard.getParentCardId());
            if (!TextUtils.isEmpty(uIFeedCard.getParentCardId()) && uIFeedCard.getParentCardId().equals(this.f96080j)) {
                arrayList.add(uIFeedCard);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: a */
    public void mo137390a(final FeedPreview feedPreview) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(feedPreview.getId());
        this.f96084n.mo139421a(arrayList, feedPreview.isRemind(), this.f96079i.wrapAndAddGetDataCallback(new IGetDataCallback<Object>() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374543 */

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                Log.m165389i("FeedModule_ConversationBoxModel", "delete conversation box: id = " + feedPreview.getId());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("delete conversation box fail : " + errorResult.toString() + " id = " + feedPreview.getId());
            }
        }));
    }

    /* renamed from: c */
    public void mo137399c(JSONObject jSONObject) {
        if (jSONObject != null) {
            C38126b bVar = (C38126b) jSONObject.get("key_param_feed_cursor_load_cursor");
            int intValue = ((Integer) jSONObject.get("key_param_feed_cursor_load_count")).intValue();
            String str = (String) jSONObject.get("key_param_feed_cursor_load_box_id");
            Log.m165389i("FeedModule_ConversationBoxModel", "onPushFeedCursor:" + ((FeedCard.FeedType) jSONObject.get("params_feed_type")) + " (" + bVar.f97759a + "," + bVar.f97760b + "), id=" + str + " loadCount=" + intValue);
            if (TextUtils.equals(this.f96080j, str)) {
                new C37707j(FeedCard.FeedType.INBOX).mo138219a(new C37702h.C37703a().mo138202a(bVar.f97760b).mo138207b(bVar.f97759a).mo138204a(PullType.BETWEEN_CURSOR).mo138206b(intValue).mo138208b(str).mo138209b(), new DataLoader.AbstractC37726a<AbstractC38118b.C38119a>() {
                    /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374587 */

                    @Override // com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a
                    /* renamed from: a */
                    public void mo137409a(ErrorResult errorResult) {
                        Log.m165389i("FeedModule_ConversationBoxModel", "onLoadError" + errorResult.toString());
                    }

                    /* renamed from: a */
                    public void mo137411a(AbstractC38118b.C38119a aVar) {
                        C37449a.this.f96073b.mo137343a(C37449a.this.f96074c.mo138449a(aVar.f97745f, true));
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: a */
    public void mo137392a(String str) {
        this.f96081k.mo139432a(new Channel(Channel.Type.CHAT, str));
    }

    /* renamed from: a */
    public void mo137393a(List<UIFeedCard> list) {
        StringBuilder sb = new StringBuilder();
        for (UIFeedCard uIFeedCard : list) {
            sb.append("[feedId = ");
            sb.append(uIFeedCard.getId());
            sb.append(" , parentId = ");
            sb.append(uIFeedCard.getParentCardId());
            sb.append("] ");
        }
        Log.m165389i("BoxFeedCard", "logLoadBoxFeedCards -> " + sb.toString());
    }

    /* renamed from: a */
    private void m147361a(ExecutorService executorService, Runnable runnable) {
        if (executorService != null && !executorService.isShutdown()) {
            executorService.execute(runnable);
        }
    }

    /* renamed from: a */
    public void mo137386a(long j, int i) {
        PullType pullType;
        this.f96075d = true;
        C37707j jVar = new C37707j(FeedCard.FeedType.INBOX);
        C37702h.C37703a a = new C37702h.C37703a().mo138202a(j);
        if (j == f96071g.longValue()) {
            pullType = PullType.REFRESH;
        } else {
            pullType = PullType.LOAD_MORE;
        }
        jVar.mo138219a(a.mo138204a(pullType).mo138203a(FeedFilter.BOX).mo138206b(i).mo138208b(this.f96080j).mo138209b(), new DataLoader.AbstractC37726a<AbstractC38118b.C38119a>() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.C374554 */

            @Override // com.ss.android.lark.feed.app.model.common.DataLoader.AbstractC37726a
            /* renamed from: a */
            public void mo137409a(ErrorResult errorResult) {
                Log.m165389i("FeedModule_ConversationBoxModel", "onLoadError" + errorResult.toString());
                C37449a.this.f96075d = false;
                C37449a.this.f96072a.mo137431a();
            }

            /* renamed from: a */
            public void mo137411a(AbstractC38118b.C38119a aVar) {
                C37449a.this.f96077f = aVar.f97740a;
                C37449a.this.f96075d = false;
                List<UIFeedCard> a = C37449a.this.f96074c.mo138449a(aVar.f97745f, false);
                C37449a.this.mo137393a(a);
                C37449a.this.f96073b.mo137343a(a);
            }
        });
    }

    public C37449a(AbstractC37773h hVar, String str) {
        this.f96078h = hVar;
        this.f96080j = str;
        this.f96075d = false;
        this.f96077f = f96071g.longValue();
        this.f96073b = new C37429a(this.f96080j);
        this.f96074c = new C37746f();
        this.f96081k = C38146f.m149976a();
        this.f96082l = C37268c.m146766b().mo139154A();
        this.f96083m = C37268c.m146763a().mo136982f();
        this.f96084n = C37268c.m146763a().mo136980d();
        this.f96076e = C37268c.m146766b().mo139203v();
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: b */
    public void mo137398b(FeedPreview feedPreview, boolean z, IGetDataCallback<Shortcut> iGetDataCallback) {
        Shortcut shortcut = new Shortcut(Channel.Type.fromFeedType(feedPreview.getType().getNumber()), feedPreview.getId());
        if (z) {
            this.f96083m.mo139427a(shortcut, iGetDataCallback);
        } else {
            this.f96083m.mo139429b(shortcut, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.feed.app.conversationbox.mvp.AbstractC37475c.AbstractC37476a
    /* renamed from: a */
    public void mo137391a(FeedPreview feedPreview, final boolean z, final IGetDataCallback<FeedPreviewInfo> iGetDataCallback) {
        this.f96081k.mo139445a(z, feedPreview.getId(), this.f96079i.wrapAndAddGetDataCallback(new IGetDataCallback<FeedPreviewInfo>() {
            /* class com.ss.android.lark.feed.app.conversationbox.mvp.C37449a.AnonymousClass14 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("set Feed Delayed error : " + errorResult);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(FeedPreviewInfo feedPreviewInfo) {
                Log.m165388i("set Feed Delayed to " + z + ", response = " + feedPreviewInfo.toString());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(feedPreviewInfo);
                }
            }
        }));
    }
}
