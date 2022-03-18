package com.ss.android.lark.search.impl.func.detail;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53569a;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53576c;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53579e;
import com.ss.android.lark.search.impl.func.detail.base.AbstractC53584f;
import com.ss.android.lark.search.impl.func.detail.base.BaseSearchView;
import com.ss.android.lark.search.impl.p2592b.p2595c.C53345b;
import com.ss.android.lark.searchcommon.dto.Scene;

/* renamed from: com.ss.android.lark.search.impl.func.detail.f */
public class C53622f extends BasePresenter<AbstractC53579e.AbstractC53580a, AbstractC53584f.AbstractC53585a, AbstractC53584f.AbstractC53585a.AbstractC53586a> {

    /* renamed from: a */
    public BaseSearchView f132377a;

    /* renamed from: b */
    private Scene.Type f132378b;

    /* renamed from: c */
    private int f132379c;

    /* renamed from: d */
    private AbstractC53569a f132380d;

    /* renamed from: e */
    private AbstractC53584f.AbstractC53585a.AbstractC53586a f132381e;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f132381e = null;
    }

    /* renamed from: c */
    public void mo182914c() {
        ((AbstractC53584f.AbstractC53585a) getView()).mo182826p();
    }

    /* renamed from: d */
    public void mo182915d() {
        ((AbstractC53584f.AbstractC53585a) getView()).mo182827r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC53584f.AbstractC53585a.AbstractC53586a createViewDelegate() {
        AbstractC53576c a = C53624h.m207582a(this.f132379c, this.f132380d, this.f132377a);
        this.f132381e = a;
        if (a == null) {
            Log.m165383e("SearchDetailPresenter", "create view delegate failed: scene type is unknown");
        }
        return this.f132381e;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC53579e.AbstractC53580a) getModel()).mo182835a(new UIGetDataCallback(new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.search.impl.func.detail.C53622f.C536231 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                C53622f.this.f132377a.mo182819a(C53345b.m206465a(num.intValue()));
                C53622f.this.mo182912a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SearchDetailPresenter", "loadTimeFormat failed: " + errorResult.getDebugMsg());
                C53622f.this.f132377a.mo182819a(true);
                C53622f.this.mo182912a();
            }
        }));
    }

    /* renamed from: a */
    public void mo182912a() {
        this.f132377a.mo182815a(this.f132380d.mo182846e());
        if ("search_detail".equals(this.f132380d.mo182832a())) {
            this.f132377a.mo182817a(this.f132380d.mo182843b(), this.f132380d.mo182844c());
            return;
        }
        this.f132377a.mo182821k();
        this.f132377a.mo182816a(this.f132380d.mo182843b());
    }

    public C53622f(AbstractC53569a aVar, BaseSearchView baseSearchView, Scene.Type type, int i) {
        this.f132380d = aVar;
        this.f132377a = baseSearchView;
        this.f132378b = type;
        this.f132379c = i;
        setModel(aVar);
        setView(baseSearchView);
        this.f132377a.setViewDelegate(createViewDelegate());
    }
}
