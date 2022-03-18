package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import androidx.lifecycle.LiveData;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.h */
public interface AbstractC43585h {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.h$a */
    public interface AbstractC43586a extends IModel {
        /* renamed from: a */
        LiveData<EmailSignature> mo155580a(boolean z);

        /* renamed from: a */
        String mo155581a();

        /* renamed from: a */
        void mo155582a(EmailSignature emailSignature);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.h$b */
    public interface AbstractC43587b extends IView<AbstractC43588a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.h$b$a */
        public interface AbstractC43588a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155583a();

            /* renamed from: a */
            void mo155584a(EmailSignature emailSignature);
        }
    }
}
