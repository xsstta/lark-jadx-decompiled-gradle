package com.ss.android.lark.post;

import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.post.AbstractC52159a;
import com.ss.android.lark.post.PostMessageView;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import java.util.List;

/* renamed from: com.ss.android.lark.post.f */
public class C52207f extends BasePresenter<AbstractC52159a.AbstractC52160a, AbstractC52159a.AbstractC52161b, AbstractC52159a.AbstractC52161b.AbstractC52162a> {

    /* renamed from: a */
    public C52219g f129530a;

    /* renamed from: f */
    private C52213a m202534f() {
        return new C52213a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m202535g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AbstractC52159a.AbstractC52161b.AbstractC52162a createViewDelegate() {
        return new C52214b();
    }

    /* renamed from: com.ss.android.lark.post.f$b */
    public class C52214b implements AbstractC52159a.AbstractC52161b.AbstractC52162a {
        @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b.AbstractC52162a
        /* renamed from: b */
        public Boolean mo178679b() {
            return ((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178670a();
        }

        @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b.AbstractC52162a
        /* renamed from: a */
        public void mo178677a() {
            ((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178675b(new UIGetDataCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.post.C52207f.C52214b.C522151 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178641d();
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178640c();
                    } else {
                        ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178641d();
                    }
                }
            }));
        }

        @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b.AbstractC52162a
        /* renamed from: c */
        public void mo178680c() {
            ((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178672a(new UIGetDataCallback(new IGetDataCallback<List<C29607af>>() {
                /* class com.ss.android.lark.post.C52207f.C52214b.C522162 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(List<C29607af> list) {
                    ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178639b(list);
                }
            }), true);
        }

        @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b.AbstractC52162a
        /* renamed from: d */
        public void mo178681d() {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.post.C52207f.C52214b.RunnableC522173 */

                public void run() {
                    ChatChatter b = ((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178674b();
                    if (b != null) {
                        C52207f.this.f129530a.mo178777a(b);
                    }
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.post.C52207f.C52214b.RunnableC522173.RunnableC522181 */

                        public void run() {
                            ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178636a((Boolean) false);
                            ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178638b();
                        }
                    });
                }
            });
        }

        public C52214b() {
        }

        @Override // com.ss.android.lark.post.AbstractC52159a.AbstractC52161b.AbstractC52162a
        /* renamed from: a */
        public void mo178678a(IGetDataCallback<Long> iGetDataCallback) {
            ((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178676c(iGetDataCallback);
        }
    }

    /* renamed from: b */
    public void mo178762b() {
        ((AbstractC52159a.AbstractC52160a) getModel()).mo178672a(new IGetDataCallback<List<C29607af>>() {
            /* class com.ss.android.lark.post.C52207f.C522113 */

            /* renamed from: a */
            public void onSuccess(List<C29607af> list) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        }, false);
    }

    /* renamed from: c */
    public void mo178763c() {
        ((AbstractC52159a.AbstractC52161b) getView()).mo178643f();
    }

    /* renamed from: d */
    public boolean mo178764d() {
        return ((AbstractC52159a.AbstractC52161b) getView()).mo178642e();
    }

    /* renamed from: h */
    private void m202536h() {
        ((AbstractC52159a.AbstractC52160a) getModel()).mo178672a(new UIGetDataCallback(new IGetDataCallback<List<C29607af>>() {
            /* class com.ss.android.lark.post.C52207f.C522124 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<C29607af> list) {
                ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178637a(list);
            }
        }), true);
    }

    /* renamed from: a */
    public void mo178759a() {
        ((AbstractC52159a.AbstractC52161b) getView()).mo178632a();
        m202536h();
        ThreadTopicHitPoint.f135906a.mo187737h("select_group");
    }

    /* renamed from: g */
    private void m202535g() {
        if (!this.f129530a.mo178789f().booleanValue()) {
            mo178761a(true);
        } else if (!TextUtils.isEmpty(this.f129530a.mo178790g())) {
            ((AbstractC52159a.AbstractC52160a) getModel()).mo178671a(new UIGetDataCallback(new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.post.C52207f.C522081 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C52207f.this.mo178759a();
                }

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat == null || !((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178673a(chat)) {
                        C52207f.this.mo178759a();
                        return;
                    }
                    C52207f.this.f129530a.mo178776a(chat);
                    C52207f.this.mo178761a(true);
                    C52207f.this.mo178762b();
                    ThreadTopicHitPoint.f135906a.mo187737h("draft");
                    ThreadTopicHitPoint.f135906a.mo187739i("skip");
                }
            }));
        } else {
            mo178759a();
        }
    }

    /* renamed from: com.ss.android.lark.post.f$a */
    public class C52213a {
        public C52213a() {
        }
    }

    /* renamed from: a */
    private void m202533a(C52202d dVar) {
        C52219g gVar = new C52219g();
        this.f129530a = gVar;
        gVar.mo178776a(dVar.f129512a);
        this.f129530a.mo178780a(dVar.f129513b);
        this.f129530a.mo178778a(dVar.f129514c);
        this.f129530a.mo178779a(Boolean.valueOf(dVar.f129515d));
        this.f129530a.mo178784b(dVar.f129516e);
        this.f129530a.mo178783b(dVar.f129517f);
    }

    /* renamed from: a */
    public void mo178761a(final boolean z) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.post.C52207f.RunnableC522092 */

            public void run() {
                ChatChatter b = ((AbstractC52159a.AbstractC52160a) C52207f.this.getModel()).mo178674b();
                if (b != null) {
                    C52207f.this.f129530a.mo178777a(b);
                }
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.post.C52207f.RunnableC522092.RunnableC522101 */

                    public void run() {
                        ((AbstractC52159a.AbstractC52161b) C52207f.this.getView()).mo178636a(Boolean.valueOf(z));
                    }
                });
            }
        });
    }

    C52207f(PostMessageView.AbstractC52158a aVar, C52202d dVar) {
        m202533a(dVar);
        C52203e eVar = new C52203e(this.f129530a);
        PostMessageView postMessageView = new PostMessageView(aVar);
        setModel(eVar);
        setView(postMessageView);
        postMessageView.setViewDelegate(createViewDelegate());
        ((AbstractC52159a.AbstractC52161b) getView()).mo178635a(this.f129530a);
        eVar.mo178755a(m202534f());
    }

    /* renamed from: a */
    public void mo178760a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            ((AbstractC52159a.AbstractC52161b) getView()).mo178633a(i, i2, intent);
        }
    }
}
