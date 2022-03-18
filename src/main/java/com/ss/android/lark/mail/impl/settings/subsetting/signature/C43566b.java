package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.b */
public class C43566b extends BasePresenter<AbstractC43573e.AbstractC43574a, EditSignatureView, AbstractC43573e.AbstractC43575b.AbstractC43576a> {
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
    public AbstractC43573e.AbstractC43575b.AbstractC43576a createViewDelegate() {
        return new AbstractC43573e.AbstractC43575b.AbstractC43576a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.C43566b.C435671 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e.AbstractC43575b.AbstractC43576a
            /* renamed from: a */
            public EmailSignature mo155556a() {
                return ((AbstractC43573e.AbstractC43574a) C43566b.this.getModel()).mo155552a();
            }

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.signature.AbstractC43573e.AbstractC43575b.AbstractC43576a
            /* renamed from: a */
            public void mo155557a(EmailSignature emailSignature, AbstractC41870b<MailUpdateAccountResponse> bVar) {
                ((AbstractC43573e.AbstractC43574a) C43566b.this.getModel()).mo155553a(emailSignature, bVar);
            }
        };
    }

    /* renamed from: b */
    public void mo155555b() {
        if (getView() != null) {
            ((EditSignatureView) getView()).mo155459a();
        }
    }

    public C43566b(AbstractC43573e.AbstractC43574a aVar, EditSignatureView editSignatureView) {
        super(aVar, editSignatureView);
    }
}
