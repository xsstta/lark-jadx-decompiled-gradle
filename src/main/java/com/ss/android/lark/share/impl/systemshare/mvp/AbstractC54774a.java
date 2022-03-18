package com.ss.android.lark.share.impl.systemshare.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.share.impl.systemshare.mvp.C54783c;

/* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.a */
public interface AbstractC54774a {

    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.a$a */
    public interface AbstractC54775a extends IModel {
        /* renamed from: a */
        void mo186941a(IGetDataCallback<CommonShareData> iGetDataCallback);

        /* renamed from: a */
        void mo186942a(CommonShareData commonShareData, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo186943a(boolean z);

        /* renamed from: a */
        boolean mo186944a();
    }

    /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.a$b */
    public interface AbstractC54776b extends IView<AbstractC54777a> {

        /* renamed from: com.ss.android.lark.share.impl.systemshare.mvp.a$b$a */
        public interface AbstractC54777a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo186945a(C54783c.AbstractC54789d dVar);

            /* renamed from: b */
            void mo186946b(C54783c.AbstractC54789d dVar);

            /* renamed from: c */
            void mo186947c(C54783c.AbstractC54789d dVar);
        }

        /* renamed from: a */
        void mo186930a();

        /* renamed from: a */
        void mo186931a(CommonShareData commonShareData);

        /* renamed from: b */
        void mo186933b();

        /* renamed from: c */
        void mo186934c();
    }
}
