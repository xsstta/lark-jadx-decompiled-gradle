package com.ss.android.lark.mail.impl.settings.subsetting.conversationmode;

import androidx.lifecycle.LiveData;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.c */
public interface AbstractC43514c {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.c$a */
    public interface AbstractC43515a extends IModel {
        /* renamed from: a */
        LiveData<Boolean> mo155386a();

        /* renamed from: a */
        void mo155387a(boolean z);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.c$b */
    public interface AbstractC43516b extends IView<AbstractC43517a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.conversationmode.c$b$a */
        public interface AbstractC43517a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155390a(boolean z);
        }
    }
}
