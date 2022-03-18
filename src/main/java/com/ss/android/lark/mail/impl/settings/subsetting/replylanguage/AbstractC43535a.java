package com.ss.android.lark.mail.impl.settings.subsetting.replylanguage;

import androidx.lifecycle.LiveData;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.ReplyLanguage;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.a */
public interface AbstractC43535a {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.a$a */
    public interface AbstractC43536a extends IModel {
        /* renamed from: a */
        LiveData<Integer> mo155435a();

        /* renamed from: a */
        void mo155436a(ReplyLanguage replyLanguage);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.a$b */
    public interface AbstractC43537b extends IView<AbstractC43538a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.a$b$a */
        public interface AbstractC43538a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155437a(ReplyLanguage replyLanguage);
        }
    }
}
