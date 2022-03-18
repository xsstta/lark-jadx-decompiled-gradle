package com.ss.android.lark.setting.page.v1.mvp;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.setting.page.v1.p2672a.C54554a;

/* renamed from: com.ss.android.lark.setting.page.v1.mvp.a */
interface AbstractC54566a {

    /* renamed from: com.ss.android.lark.setting.page.v1.mvp.a$a */
    public interface AbstractC54567a extends IModel {

        /* renamed from: com.ss.android.lark.setting.page.v1.mvp.a$a$a */
        public interface AbstractC54568a {
            /* renamed from: a */
            void mo186469a(boolean z);
        }

        /* renamed from: a */
        C54554a mo186462a();

        /* renamed from: a */
        void mo186463a(Context context, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo186464a(AbstractC54568a aVar);

        /* renamed from: a */
        boolean mo186465a(Context context);

        /* renamed from: b */
        void mo186466b();

        /* renamed from: b */
        void mo186467b(Context context, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        boolean mo186468c();
    }

    /* renamed from: com.ss.android.lark.setting.page.v1.mvp.a$b */
    public interface AbstractC54569b extends IView<AbstractC54570a> {

        /* renamed from: com.ss.android.lark.setting.page.v1.mvp.a$b$a */
        public interface AbstractC54570a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo186470a();

            /* renamed from: a */
            void mo186471a(Context context);
        }

        /* renamed from: a */
        void mo186428a();

        /* renamed from: a */
        void mo186430a(C54554a aVar);

        /* renamed from: a */
        void mo186432a(boolean z);

        /* renamed from: b */
        void mo186433b();

        /* renamed from: b */
        void mo186434b(boolean z);

        /* renamed from: c */
        void mo186435c();

        /* renamed from: d */
        void mo186436d();

        /* renamed from: e */
        void mo186437e();

        /* renamed from: f */
        void mo186438f();
    }
}
