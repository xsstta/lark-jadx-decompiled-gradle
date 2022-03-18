package com.ss.android.lark.feed.app.menu;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import com.ss.android.lark.feed.app.menu.AbstractC37663e;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.lark.feed.app.menu.b */
public class C37651b extends BasePresenter<AbstractC37663e.AbstractC37664a, AbstractC37663e.AbstractC37666b, AbstractC37663e.AbstractC37666b.AbstractC37667a> {

    /* renamed from: a */
    private ConcurrentSkipListSet<Future> f96544a = new ConcurrentSkipListSet<>(new Comparator<Future>() {
        /* class com.ss.android.lark.feed.app.menu.C37651b.C376521 */

        /* renamed from: a */
        public int compare(Future future, Future future2) {
            return 0;
        }
    });

    /* renamed from: com.ss.android.lark.feed.app.menu.b$b */
    public class C37658b implements AbstractC37663e.AbstractC37666b.AbstractC37667a {
        @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37666b.AbstractC37667a
        /* renamed from: a */
        public void mo138093a() {
            C37651b.this.mo138084b();
        }

        public C37658b() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC37663e.AbstractC37666b.AbstractC37667a createViewDelegate() {
        return new C37658b();
    }

    /* renamed from: com.ss.android.lark.feed.app.menu.b$a */
    public class C37655a implements AbstractC37663e.AbstractC37664a.AbstractC37665a {
        @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37664a.AbstractC37665a
        /* renamed from: a */
        public void mo138089a() {
            final AbstractC37663e.AbstractC37666b bVar = (AbstractC37663e.AbstractC37666b) C37651b.this.getView();
            if (bVar != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.menu.C37651b.C37655a.RunnableC376561 */

                    public void run() {
                        bVar.mo138065a();
                    }
                });
            }
        }

        public C37655a() {
        }

        @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37664a.AbstractC37665a
        /* renamed from: a */
        public void mo138090a(final Map<Integer, Integer> map) {
            final AbstractC37663e.AbstractC37666b bVar = (AbstractC37663e.AbstractC37666b) C37651b.this.getView();
            if (bVar != null) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.menu.C37651b.C37655a.RunnableC376572 */

                    public void run() {
                        Map<Integer, Integer> map = map;
                        if (map != null) {
                            bVar.mo138068a(map);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public void mo138084b() {
        this.f96544a.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.feed.app.menu.C37651b.C376532 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                AbstractC37663e.AbstractC37664a aVar = (AbstractC37663e.AbstractC37664a) C37651b.this.getModel();
                if (aVar == null) {
                    return false;
                }
                aVar.mo138078a(new IGetDataCallback<Map<Integer, Integer>>() {
                    /* class com.ss.android.lark.feed.app.menu.C37651b.C376532.C376541 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<Integer, Integer> map) {
                        AbstractC37663e.AbstractC37666b bVar = (AbstractC37663e.AbstractC37666b) C37651b.this.getView();
                        if (bVar != null && map != null) {
                            bVar.mo138068a(map);
                        }
                    }
                });
                return true;
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC37663e.AbstractC37664a aVar = (AbstractC37663e.AbstractC37664a) getModel();
        AbstractC37663e.AbstractC37666b bVar = (AbstractC37663e.AbstractC37666b) getView();
        if (aVar != null && bVar != null) {
            aVar.mo138079a(new C37655a());
            mo138084b();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        Iterator<Future> it = this.f96544a.iterator();
        while (it.hasNext()) {
            it.next().cancel(false);
        }
        this.f96544a.clear();
    }

    public C37651b(AbstractC37663e.AbstractC37664a aVar, AbstractC37663e.AbstractC37666b bVar) {
        super(aVar, bVar);
    }
}
