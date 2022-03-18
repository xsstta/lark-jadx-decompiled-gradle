package com.ss.android.lark.notification.setting.impl.zen;

import android.content.DialogInterface;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.notification.dto.C48444c;

/* renamed from: com.ss.android.lark.notification.setting.impl.zen.a */
public class C48675a {

    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.a$a */
    public interface AbstractC48676a extends IModel {

        /* renamed from: com.ss.android.lark.notification.setting.impl.zen.a$a$a */
        public interface AbstractC48677a {
            /* renamed from: a */
            void mo169895a(C48444c cVar);
        }

        /* renamed from: a */
        C48444c mo169888a();

        /* renamed from: a */
        void mo169889a(long j, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169890a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169891a(AbstractC48677a aVar);

        /* renamed from: b */
        boolean mo169892b();

        /* renamed from: c */
        boolean mo169893c();

        /* renamed from: d */
        void mo169894d();
    }

    /* renamed from: com.ss.android.lark.notification.setting.impl.zen.a$b */
    public interface AbstractC48678b extends IView<AbstractC48679a> {

        /* renamed from: com.ss.android.lark.notification.setting.impl.zen.a$b$a */
        public interface AbstractC48679a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo169896a();

            /* renamed from: a */
            void mo169897a(long j, String str);
        }

        /* renamed from: a */
        void mo169866a();

        /* renamed from: a */
        void mo169868a(DialogInterface.OnClickListener onClickListener);

        /* renamed from: a */
        void mo169870a(C48444c cVar);

        /* renamed from: a */
        void mo169872a(String str);

        /* renamed from: b */
        void mo169873b();

        /* renamed from: c */
        void mo169875c();
    }
}
