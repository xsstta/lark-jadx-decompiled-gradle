package com.ss.android.lark.search.impl.func.pick.chatterpick.mvp;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.service.parser.DtoTransParser;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.c */
public class C53677c extends BasePresenter<AbstractC53672a.AbstractC53673a, AbstractC53672a.AbstractC53674b, AbstractC53672a.AbstractC53674b.AbstractC53675a> {

    /* renamed from: a */
    private final DtoTransParser f132464a = new DtoTransParser();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC53672a.AbstractC53674b.AbstractC53675a createViewDelegate() {
        return new C53679a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m207793d();
    }

    /* renamed from: c */
    public boolean mo183024c() {
        return ((AbstractC53672a.AbstractC53674b) getView()).mo183016c();
    }

    /* renamed from: e */
    private void m207794e() {
        this.f132464a.mo184287a(((AbstractC53672a.AbstractC53673a) getModel()).mo183019b(), new IGetDataCallback<List<SearchChatterInfo>>() {
            /* class com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.C53677c.C536781 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(List<SearchChatterInfo> list) {
                ((AbstractC53672a.AbstractC53674b) C53677c.this.getView()).mo183015c(list);
            }
        });
    }

    /* renamed from: b */
    public void mo183023b() {
        ((AbstractC53672a.AbstractC53674b) getView()).mo183010a(((AbstractC53672a.AbstractC53673a) getModel()).mo183017a());
    }

    /* renamed from: d */
    private void m207793d() {
        boolean z = true;
        boolean z2 = !CollectionUtils.isEmpty(((AbstractC53672a.AbstractC53673a) getModel()).mo183017a());
        AbstractC53672a.AbstractC53674b bVar = (AbstractC53672a.AbstractC53674b) getView();
        if (!((AbstractC53672a.AbstractC53674b) getView()).mo183014b() && !z2) {
            z = false;
        }
        bVar.mo183011a(z);
        ((AbstractC53672a.AbstractC53674b) getView()).mo183013b(z2);
        mo183023b();
        m207794e();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.c$a */
    public class C53679a implements AbstractC53672a.AbstractC53674b.AbstractC53675a {
        private C53679a() {
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b.AbstractC53675a
        /* renamed from: a */
        public void mo183020a(int i) {
            List<PickChatterViewData> a = ((AbstractC53672a.AbstractC53673a) C53677c.this.getModel()).mo183017a();
            if (i == 1) {
                ((AbstractC53672a.AbstractC53674b) C53677c.this.getView()).mo183012b(a);
                return;
            }
            ((AbstractC53672a.AbstractC53674b) C53677c.this.getView()).mo183008a();
            ((AbstractC53672a.AbstractC53674b) C53677c.this.getView()).mo183010a(a);
        }

        @Override // com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.AbstractC53672a.AbstractC53674b.AbstractC53675a
        /* renamed from: a */
        public void mo183021a(PickChatterViewData pickChatterViewData, boolean z) {
            ((AbstractC53672a.AbstractC53673a) C53677c.this.getModel()).mo183018a(pickChatterViewData, z);
            C53677c.this.mo183023b();
        }
    }

    public C53677c(AbstractC53672a.AbstractC53673a aVar, AbstractC53672a.AbstractC53674b bVar) {
        super(aVar, bVar);
    }
}
