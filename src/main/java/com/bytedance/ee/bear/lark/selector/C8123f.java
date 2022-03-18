package com.bytedance.ee.bear.lark.selector;

import android.content.Context;
import com.bytedance.ee.bear.lark.selector.base.AbstractC8101b;
import com.larksuite.framework.mvp.BasePresenter;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.lark.selector.f */
public class C8123f extends BasePresenter<C8122e, DocsConfirmView, AbstractC8101b.AbstractC8102a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC8101b.AbstractC8102a createViewDelegate() {
        return new C8125a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((DocsConfirmView) getView()).mo31206a(((C8122e) getModel()).mo31298a());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.lark.selector.f$a */
    public class C8125a implements AbstractC8101b.AbstractC8102a {
        private C8125a() {
        }
    }

    public C8123f(Context context, List<DocSelectorViewData> list, AbstractC8101b.AbstractC8103b bVar) {
        DocsConfirmView docsConfirmView = new DocsConfirmView(context, bVar);
        setModel(new C8122e(list));
        setView(docsConfirmView);
        docsConfirmView.setViewDelegate(createViewDelegate());
    }
}
