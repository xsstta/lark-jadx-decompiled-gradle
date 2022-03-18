package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import androidx.lifecycle.LiveData;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.C42088b;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.a */
public interface AbstractC43522a {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.a$a */
    public interface AbstractC43523a extends IModel {
        /* renamed from: a */
        LiveData<Integer> mo155416a();

        /* renamed from: a */
        void mo155417a(int i);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.a$b */
    public interface AbstractC43524b extends IView<AbstractC43525a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.a$b$a */
        public interface AbstractC43525a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155418a(int i);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.a$c */
    public interface AbstractC43526c {
        /* renamed from: a */
        void mo155400a();

        /* renamed from: a */
        void mo155401a(C42088b bVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.notification.a$d */
    public interface AbstractC43527d {
        /* renamed from: b */
        void mo155404b();
    }
}
