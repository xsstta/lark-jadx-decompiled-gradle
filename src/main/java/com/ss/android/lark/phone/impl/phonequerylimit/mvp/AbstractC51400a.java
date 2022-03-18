package com.ss.android.lark.phone.impl.phonequerylimit.mvp;

import android.app.Activity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.phone.impl.phonequerylimit.p2461a.C51385a;
import com.ss.android.lark.phone.impl.service.entity.PhoneQueryControlInfo;

/* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.a */
public interface AbstractC51400a {

    /* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.a$a */
    public interface AbstractC51401a extends IModel {
        /* renamed from: a */
        PhoneQueryControlInfo mo177024a();

        /* renamed from: a */
        void mo177025a(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        String mo177026b();

        /* renamed from: b */
        void mo177027b(IGetDataCallback<Message> iGetDataCallback);

        /* renamed from: c */
        String mo177028c();

        /* renamed from: d */
        String mo177029d();
    }

    /* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.a$b */
    public interface AbstractC51402b extends IView<AbstractC51403a> {

        /* renamed from: com.ss.android.lark.phone.impl.phonequerylimit.mvp.a$b$a */
        public interface AbstractC51403a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo177030a();

            /* renamed from: a */
            void mo177031a(Activity activity);

            /* renamed from: b */
            void mo177032b();

            /* renamed from: b */
            void mo177033b(Activity activity);

            /* renamed from: c */
            void mo177034c();
        }

        /* renamed from: a */
        void mo177010a(int i);

        /* renamed from: a */
        void mo177011a(C51385a aVar);

        /* renamed from: a */
        void mo177013a(String str);

        /* renamed from: a */
        void mo177014a(String str, int i);
    }
}
