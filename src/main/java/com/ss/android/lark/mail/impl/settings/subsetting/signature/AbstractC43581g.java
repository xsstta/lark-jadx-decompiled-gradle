package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.g */
public interface AbstractC43581g {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.g$a */
    public interface AbstractC43582a extends IModel {
        /* renamed from: a */
        void mo155572a(MailEntSignature mailEntSignature);

        /* renamed from: a */
        boolean mo155573a();

        /* renamed from: b */
        String mo155574b();

        /* renamed from: c */
        String mo155575c();

        /* renamed from: d */
        String mo155576d();

        /* renamed from: e */
        String mo155577e();

        /* renamed from: f */
        List<MailEntSignature> mo155578f();
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.g$b */
    public interface AbstractC43583b extends IView<AbstractC43584a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.g$b$a */
        public interface AbstractC43584a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155579a(MailEntSignature mailEntSignature);
        }
    }
}
