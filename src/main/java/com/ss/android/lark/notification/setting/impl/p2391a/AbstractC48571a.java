package com.ss.android.lark.notification.setting.impl.p2391a;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.notification.p2379c.C48432a;

/* renamed from: com.ss.android.lark.notification.setting.impl.a.a */
public interface AbstractC48571a {

    /* renamed from: com.ss.android.lark.notification.setting.impl.a.a$a */
    public interface AbstractC48572a extends IModel {
        /* renamed from: a */
        C48432a mo169652a();

        /* renamed from: a */
        boolean mo169653a(Context context);
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.a.a$b */
    public interface AbstractC48573b extends IView<AbstractC48574a> {

        /* renamed from: com.ss.android.lark.notification.setting.impl.a.a$b$a */
        public interface AbstractC48574a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo169658a();

            /* renamed from: a */
            void mo169659a(String str);

            /* renamed from: b */
            void mo169660b();
        }

        /* renamed from: a */
        View mo169654a();

        /* renamed from: a */
        void mo169655a(C48432a aVar);

        /* renamed from: a */
        void mo169656a(boolean z);

        /* renamed from: b */
        void mo169657b();
    }
}
