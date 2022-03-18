package com.ss.android.lark.setting.page.content.common.mvp;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.AlignMode;

/* renamed from: com.ss.android.lark.setting.page.content.common.mvp.a */
interface AbstractC54411a {

    /* renamed from: com.ss.android.lark.setting.page.content.common.mvp.a$a */
    public interface AbstractC54412a extends IModel {
        /* renamed from: a */
        void mo186045a(IGetDataCallback<InitData> iGetDataCallback);

        /* renamed from: a */
        void mo186046a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo186047b(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo186048c(IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.mvp.a$b */
    public interface AbstractC54413b extends IView<AbstractC54414a> {

        /* renamed from: com.ss.android.lark.setting.page.content.common.mvp.a$b$a */
        public interface AbstractC54414a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo186049a(Context context);

            /* renamed from: a */
            void mo186050a(boolean z);
        }

        /* renamed from: a */
        void mo186031a();

        /* renamed from: a */
        void mo186032a(InitData initData);

        /* renamed from: a */
        void mo186034a(AlignMode alignMode);

        /* renamed from: a */
        void mo186035a(String str);

        /* renamed from: a */
        void mo186036a(boolean z);

        /* renamed from: b */
        void mo186038b(String str);
    }
}
