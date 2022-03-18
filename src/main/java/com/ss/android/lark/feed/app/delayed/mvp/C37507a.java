package com.ss.android.lark.feed.app.delayed.mvp;

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
import com.ss.android.lark.feed.app.delayed.C37491b;
import com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.AbstractC37773h;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.p1864d.C37746f;
import com.ss.android.lark.feed.interfaces.AbstractC38087ab;
import com.ss.android.lark.feed.interfaces.AbstractC38095f;
import com.ss.android.lark.feed.interfaces.AbstractC38106o;
import com.ss.android.lark.feed.interfaces.AbstractC38112v;
import com.ss.android.lark.feed.interfaces.AbstractC38114x;
import com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.feed.service.impl.C38128e;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.feed.service.impl.C38166k;
import com.ss.android.lark.feed.service.impl.Scene;
import com.ss.android.lark.feed.service.p1884a.AbstractC38118b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.delayed.mvp.a */
public class C37507a implements AbstractC37532c.AbstractC37533a {

    /* renamed from: a */
    public C37746f f96190a;

    /* renamed from: b */
    public AbstractC38037a.AbstractC38062v f96191b;

    /* renamed from: c */
    public AbstractC37532c.AbstractC37533a.AbstractC37534a f96192c;

    /* renamed from: d */
    public C37491b f96193d;

    /* renamed from: e */
    private AbstractC37773h f96194e;

    /* renamed from: f */
    private CallbackManager f96195f = new CallbackManager();

    /* renamed from: g */
    private AbstractC38118b f96196g;

    /* renamed from: h */
    private AbstractC38095f f96197h;

    /* renamed from: i */
    private AbstractC38037a.AbstractC38047g f96198i;

    /* renamed from: j */
    private AbstractC38114x f96199j;

    /* renamed from: k */
    private AbstractC38106o f96200k = new AbstractC38106o() {
        /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375081 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38106o
        /* renamed from: a */
        public void mo137401a(JSONObject jSONObject) {
            C37507a.this.mo137508a(jSONObject);
        }
    };

    /* renamed from: l */
    private C37491b.AbstractC37492a f96201l = new C37491b.AbstractC37492a() {
        /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375145 */

        @Override // com.ss.android.lark.feed.app.delayed.C37491b.AbstractC37492a
        /* renamed from: a */
        public void mo137479a(UpdateRecord updateRecord) {
            C37507a.this.f96192c.mo137540a(updateRecord);
        }
    };

    /* renamed from: m */
    private C37731d.AbstractC37734b f96202m = new C37731d.AbstractC37734b() {
        /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375156 */

        @Override // com.ss.android.lark.feed.app.model.C37731d.AbstractC37734b
        /* renamed from: a */
        public void mo137402a(Map<Integer, Integer> map) {
            super.mo137402a(map);
            C37507a.this.f96192c.mo137541a(map);
        }
    };

    /* renamed from: n */
    private AbstractC38087ab f96203n = new AbstractC38087ab() {
        /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375167 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137283a(boolean z) {
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38087ab
        /* renamed from: a */
        public void mo137282a() {
            if (C37507a.this.f96192c != null) {
                C37507a.this.f96192c.mo137538a();
            }
        }
    };

    /* renamed from: o */
    private ITimeFormatSettingObserver f96204o = new ITimeFormatSettingObserver() {
        /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375178 */

        @Override // com.ss.android.lark.feed.interfaces.ITimeFormatSettingObserver
        /* renamed from: a */
        public void mo137403a(int i) {
            if (C37507a.this.f96192c != null) {
                C37507a.this.f96192c.mo137539a(i);
            }
        }
    };

    /* renamed from: p */
    private AbstractC38112v f96205p = new AbstractC38112v() {
        /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375189 */

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38112v
        /* renamed from: a */
        public void mo137525a(JSONObject jSONObject) {
            C37507a.this.mo137515b(jSONObject);
        }
    };

    /* renamed from: a */
    private void m147543a() {
        this.f96196g.mo139441a(new IGetDataCallback<List<FeedPreviewInfo>>() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.C375112 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<FeedPreviewInfo> list) {
                C37507a.this.f96193d.mo137477a(C37507a.this.f96190a.mo138449a(list, false));
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C37491b bVar = new C37491b();
        this.f96193d = bVar;
        bVar.mo137475a(this.f96201l);
        C37268c.m146767c().mo139330a(this.f96203n);
        C37268c.m146767c().mo139328a(this.f96204o);
        this.f96194e.mo138402a(this.f96202m);
        this.f96192c.mo137541a(this.f96194e.mo138425p());
        C38128e.m149952a().mo139474a(this.f96200k);
        if (C37268c.m146766b().mo139198q().mo139256a("lark.feed.thread.avatar.change")) {
            C38128e.m149952a().mo139479a(this.f96205p);
        }
        m147543a();
        C38146f.m149976a().mo139501a(Scene.DELAY, (IGetDataCallback<Boolean>) null);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C38146f.m149976a().mo139504b(Scene.DELAY, (IGetDataCallback<Boolean>) null);
        this.f96195f.cancelCallbacks();
        C37268c.m146767c().mo139343b(this.f96203n);
        C37268c.m146767c().mo139341b(this.f96204o);
        this.f96194e.mo138408b(this.f96202m);
        this.f96193d.mo137478b(this.f96201l);
        C38128e.m149952a().mo139483b(this.f96200k);
        if (C37268c.m146766b().mo139198q().mo139256a("lark.feed.thread.avatar.change")) {
            C38128e.m149952a().mo139488b(this.f96205p);
        }
    }

    /* renamed from: a */
    public void mo137510a(AbstractC37532c.AbstractC37533a.AbstractC37534a aVar) {
        this.f96192c = aVar;
    }

    /* renamed from: b */
    public void mo137515b(final JSONObject jSONObject) {
        if (jSONObject != null) {
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.RunnableC375134 */

                public void run() {
                    String str = (String) jSONObject.get("key_param_thread_feed_avatar_key");
                    String str2 = (String) jSONObject.get("key_param_thread_feed_chat_id");
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        C37507a.this.f96193d.mo137476a(str, str2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo137508a(final JSONObject jSONObject) {
        if (jSONObject != null) {
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.RunnableC375123 */

                public void run() {
                    C37507a.this.f96193d.mo137477a(C37507a.this.f96190a.mo138449a(((C38166k) jSONObject.get("params_feed_preview_update_info")).f97854a, false));
                }
            });
        }
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a
    /* renamed from: a */
    public void mo137509a(final IGetDataCallback<Integer> iGetDataCallback) {
        this.f96191b.mo139294a(this.f96195f.wrapAndAddGetDataCallback(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.AnonymousClass12 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                iGetDataCallback.onSuccess(num);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e(errorResult.toString());
                C57865c.m224574a(new C57865c.AbstractC57873d<Integer>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.AnonymousClass12.C375091 */

                    /* renamed from: a */
                    public Integer produce() {
                        return Integer.valueOf(C37507a.this.f96191b.mo139302e());
                    }
                }, new C57865c.AbstractC57871b<Integer>() {
                    /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.AnonymousClass12.C375102 */

                    /* renamed from: a */
                    public void consume(Integer num) {
                        iGetDataCallback.onSuccess(num);
                    }
                });
            }
        }));
    }

    public C37507a(AbstractC37773h hVar) {
        this.f96194e = hVar;
        this.f96190a = new C37746f();
        this.f96196g = C38146f.m149976a();
        this.f96197h = C37268c.m146763a().mo136980d();
        this.f96191b = C37268c.m146766b().mo139203v();
        this.f96199j = C37268c.m146763a().mo136982f();
        this.f96198i = C37268c.m146766b().mo139154A();
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a
    /* renamed from: a */
    public void mo137513a(String str) {
        this.f96196g.mo139432a(new Channel(Channel.Type.CHAT, str));
    }

    /* renamed from: b */
    private void m147544b(UIFeedCard uIFeedCard, FeedCard.FeedType feedType, final IGetDataCallback<List<FeedCard>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        FeedCard feedCard = new FeedCard();
        feedCard.setId(uIFeedCard.getId());
        feedCard.setType(uIFeedCard.getType());
        feedCard.setFeedType(uIFeedCard.getFeedType());
        arrayList.add(feedCard);
        this.f96196g.mo139444a(arrayList, feedType, this.f96195f.wrapAndAddGetDataCallback(new IGetDataCallback<List<FeedCard>>() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.AnonymousClass10 */

            /* renamed from: a */
            public void onSuccess(List<FeedCard> list) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(list);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }));
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a
    /* renamed from: a */
    public void mo137511a(FeedPreview feedPreview, final boolean z, final IGetDataCallback<FeedPreviewInfo> iGetDataCallback) {
        this.f96196g.mo139445a(z, feedPreview.getId(), this.f96195f.wrapAndAddGetDataCallback(new IGetDataCallback<FeedPreviewInfo>() {
            /* class com.ss.android.lark.feed.app.delayed.mvp.C37507a.AnonymousClass11 */

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

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a
    /* renamed from: b */
    public void mo137516b(FeedPreview feedPreview, boolean z, IGetDataCallback<Shortcut> iGetDataCallback) {
        Shortcut shortcut = new Shortcut(Channel.Type.fromFeedType(feedPreview.getType().getNumber()), feedPreview.getId());
        if (z) {
            this.f96199j.mo139427a(shortcut, iGetDataCallback);
        } else {
            this.f96199j.mo139429b(shortcut, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a
    /* renamed from: a */
    public void mo137512a(UIFeedCard uIFeedCard, FeedCard.FeedType feedType, IGetDataCallback<List<FeedCard>> iGetDataCallback) {
        AbstractC37773h hVar = this.f96194e;
        if (hVar != null) {
            hVar.mo138401a(uIFeedCard, feedType);
        }
        m147544b(uIFeedCard, feedType, iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.app.delayed.mvp.AbstractC37532c.AbstractC37533a
    /* renamed from: a */
    public void mo137514a(boolean z, FeedPreview feedPreview, IGetDataCallback<Object> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(feedPreview.getId());
        if (z) {
            this.f96197h.mo139420a(arrayList, this.f96195f.wrapAndAddGetDataCallback(iGetDataCallback));
        } else {
            this.f96197h.mo139421a(arrayList, feedPreview.isRemind(), this.f96195f.wrapAndAddGetDataCallback(iGetDataCallback));
        }
    }
}
