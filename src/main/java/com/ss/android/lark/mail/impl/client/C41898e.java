package com.ss.android.lark.mail.impl.client;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.client.AbstractC41891b;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.client.e */
public class C41898e extends BasePresenter<AbstractC41891b.AbstractC41892a, MigrationView, AbstractC41891b.AbstractC41893b.AbstractC41894a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC41891b.AbstractC41893b.AbstractC41894a createViewDelegate() {
        return new AbstractC41891b.AbstractC41893b.AbstractC41894a() {
            /* class com.ss.android.lark.mail.impl.client.C41898e.C418991 */

            @Override // com.ss.android.lark.mail.impl.client.AbstractC41891b.AbstractC41893b.AbstractC41894a
            /* renamed from: a */
            public C1177w<List<MigrationFailureDetail>> mo150477a() {
                return ((AbstractC41891b.AbstractC41892a) C41898e.this.getModel()).mo150476a();
            }
        };
    }

    public C41898e(AbstractC41891b.AbstractC41892a aVar, MigrationView migrationView) {
        super(aVar, migrationView);
    }
}
