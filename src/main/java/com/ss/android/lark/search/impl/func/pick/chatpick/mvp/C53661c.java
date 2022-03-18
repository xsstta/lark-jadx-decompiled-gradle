package com.ss.android.lark.search.impl.func.pick.chatpick.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.c */
public class C53661c extends BasePresenter<AbstractC53655a.AbstractC53656a, AbstractC53655a.AbstractC53657b, AbstractC53655a.AbstractC53657b.AbstractC53658a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC53655a.AbstractC53657b.AbstractC53658a createViewDelegate() {
        return new C53663a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m207715b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatpick.mvp.c$a */
    public class C53663a implements AbstractC53655a.AbstractC53657b.AbstractC53658a {
        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b.AbstractC53658a
        /* renamed from: a */
        public int mo182984a() {
            return ((AbstractC53655a.AbstractC53656a) C53661c.this.getModel()).mo182983b();
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b.AbstractC53658a
        /* renamed from: b */
        public List<BasePickViewData> mo182989b() {
            return ((AbstractC53655a.AbstractC53656a) C53661c.this.getModel()).mo182980a();
        }

        private C53663a() {
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b.AbstractC53658a
        /* renamed from: a */
        public void mo182986a(IGetDataCallback<List<BasePickViewData>> iGetDataCallback) {
            ((AbstractC53655a.AbstractC53656a) C53661c.this.getModel()).mo182981a(iGetDataCallback);
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b.AbstractC53658a
        /* renamed from: a */
        public void mo182985a(int i) {
            List<BasePickViewData> a = ((AbstractC53655a.AbstractC53656a) C53661c.this.getModel()).mo182980a();
            if (i == 1) {
                ((AbstractC53655a.AbstractC53657b) C53661c.this.getView()).mo182974b(a);
                return;
            }
            ((AbstractC53655a.AbstractC53657b) C53661c.this.getView()).mo182970a();
            ((AbstractC53655a.AbstractC53657b) C53661c.this.getView()).mo182972a(a);
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b.AbstractC53658a
        /* renamed from: a */
        public void mo182987a(BasePickViewData basePickViewData) {
            basePickViewData.setSelected(true);
            ((AbstractC53655a.AbstractC53657b) C53661c.this.getView()).mo182974b(Collections.singletonList(basePickViewData));
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatpick.mvp.AbstractC53655a.AbstractC53657b.AbstractC53658a
        /* renamed from: a */
        public void mo182988a(BasePickViewData basePickViewData, boolean z) {
            ((AbstractC53655a.AbstractC53656a) C53661c.this.getModel()).mo182982a(basePickViewData, z);
            ((AbstractC53655a.AbstractC53657b) C53661c.this.getView()).mo182972a(((AbstractC53655a.AbstractC53656a) C53661c.this.getModel()).mo182980a());
        }
    }

    /* renamed from: b */
    private void m207715b() {
        List<BasePickViewData> a = ((AbstractC53655a.AbstractC53656a) getModel()).mo182980a();
        ((AbstractC53655a.AbstractC53657b) getView()).mo182973a(CollectionUtils.isEmpty(a));
        if (!CollectionUtils.isEmpty(a)) {
            ((AbstractC53655a.AbstractC53657b) getView()).mo182970a();
        }
        ((AbstractC53655a.AbstractC53657b) getView()).mo182972a(a);
    }

    public C53661c(AbstractC53655a.AbstractC53656a aVar, AbstractC53655a.AbstractC53657b bVar) {
        super(aVar, bVar);
    }
}
