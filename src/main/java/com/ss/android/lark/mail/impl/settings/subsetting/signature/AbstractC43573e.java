package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.e */
public interface AbstractC43573e {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.e$a */
    public interface AbstractC43574a extends IModel {
        /* renamed from: a */
        EmailSignature mo155552a();

        /* renamed from: a */
        void mo155553a(EmailSignature emailSignature, AbstractC41870b<MailUpdateAccountResponse> bVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.e$b */
    public interface AbstractC43575b extends IView<AbstractC43576a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.e$b$a */
        public interface AbstractC43576a extends IView.IViewDelegate {
            /* renamed from: a */
            EmailSignature mo155556a();

            /* renamed from: a */
            void mo155557a(EmailSignature emailSignature, AbstractC41870b<MailUpdateAccountResponse> bVar);
        }
    }
}
