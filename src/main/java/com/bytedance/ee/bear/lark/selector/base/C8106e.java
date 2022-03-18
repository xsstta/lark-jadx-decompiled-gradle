package com.bytedance.ee.bear.lark.selector.base;

import android.text.TextUtils;
import com.bytedance.ee.bear.lark.selector.base.ISelectorView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.lark.selector.base.e */
public class C8106e<Value> extends BasePresenter<AbstractC8104c<Value>, SelectorView<Value>, ISelectorView.AbstractC8088a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ISelectorView.AbstractC8088a createViewDelegate() {
        return new C8108a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo31280b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.selector.base.e$a */
    public class C8108a implements ISelectorView.AbstractC8088a {
        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8088a
        /* renamed from: a */
        public boolean mo31243a() {
            return ((AbstractC8104c) C8106e.this.getModel()).mo31274a();
        }

        private C8108a() {
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8088a
        /* renamed from: b */
        public void mo31244b(String str) {
            ((AbstractC8104c) C8106e.this.getModel()).mo31272a(new UIGetDataCallback<>(new IGetDataCallback<List<Value>>() {
                /* class com.bytedance.ee.bear.lark.selector.base.C8106e.C8108a.C81102 */

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<Value> */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void onSuccess(List<Value> list) {
                    if (!((AbstractC8104c) C8106e.this.getModel()).mo31274a()) {
                        list.add(((AbstractC8104c) C8106e.this.getModel()).mo31275c());
                    }
                    ((SelectorView) C8106e.this.getView()).mo31252c(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C13479a.m54758a("SelectorPresenter", "onLoadMore() onError=" + errorResult);
                    ((SelectorView) C8106e.this.getView()).mo31254e();
                }
            }));
        }

        @Override // com.bytedance.ee.bear.lark.selector.base.ISelectorView.AbstractC8088a
        /* renamed from: a */
        public void mo31242a(String str) {
            if (TextUtils.isEmpty(str.trim())) {
                C8106e.this.mo31280b();
            } else {
                ((AbstractC8104c) C8106e.this.getModel()).mo31273a(str, new UIGetDataCallback<>(new IGetDataCallback<List<Value>>() {
                    /* class com.bytedance.ee.bear.lark.selector.base.C8106e.C8108a.C81091 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((SelectorView) C8106e.this.getView()).mo31254e();
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<Value> */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: a */
                    public void onSuccess(List<Value> list) {
                        if (!list.isEmpty()) {
                            if (!((AbstractC8104c) C8106e.this.getModel()).mo31274a()) {
                                list.add(((AbstractC8104c) C8106e.this.getModel()).mo31275c());
                            }
                            ((SelectorView) C8106e.this.getView()).mo31250b(list);
                            return;
                        }
                        ((SelectorView) C8106e.this.getView()).mo31253d();
                    }
                }));
            }
        }
    }

    /* renamed from: b */
    public void mo31280b() {
        ((AbstractC8104c) getModel()).mo31271a(new C8111f<>(new IGetDataCallback<List<Value>>() {
            /* class com.bytedance.ee.bear.lark.selector.base.C8106e.C81071 */

            /* renamed from: a */
            public void onSuccess(List<Value> list) {
                if (!list.isEmpty()) {
                    ((SelectorView) C8106e.this.getView()).mo31250b(list);
                } else {
                    ((SelectorView) C8106e.this.getView()).mo31251c();
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C13479a.m54758a("SelectorPresenter", "getRecommendDataAndShow() onError=" + errorResult);
                ((SelectorView) C8106e.this.getView()).mo31254e();
            }
        }));
    }

    public C8106e(SelectorView selectorView, AbstractC8104c<Value> cVar) {
        super(cVar, selectorView);
        ((SelectorView) getView()).setViewDelegate(createViewDelegate());
    }
}
