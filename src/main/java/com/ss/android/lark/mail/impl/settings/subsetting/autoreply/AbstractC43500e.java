package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import androidx.lifecycle.LiveData;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.e */
public interface AbstractC43500e {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.e$a */
    public interface AbstractC43501a extends IModel {
        /* renamed from: a */
        LiveData<EmailAutoReply> mo155348a(boolean z);

        /* renamed from: a */
        String mo155349a();

        /* renamed from: a */
        void mo155350a(EmailAutoReply emailAutoReply);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.e$b */
    public interface AbstractC43502b extends IView<AbstractC43503a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.e$b$a */
        public interface AbstractC43503a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155353a();

            /* renamed from: a */
            void mo155354a(EmailAutoReply emailAutoReply);
        }
    }
}
