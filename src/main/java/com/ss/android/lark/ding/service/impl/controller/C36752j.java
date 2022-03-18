package com.ss.android.lark.ding.service.impl.controller;

import android.content.DialogInterface;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.ding.entity.DingStatus;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.j */
public class C36752j {

    /* renamed from: com.ss.android.lark.ding.service.impl.controller.j$a */
    public interface AbstractC36753a extends IModel {

        /* renamed from: com.ss.android.lark.ding.service.impl.controller.j$a$a */
        public interface AbstractC36754a {
            /* renamed from: a */
            void mo135409a();

            /* renamed from: a */
            void mo135410a(DingStatus dingStatus);

            /* renamed from: a */
            void mo135411a(String str);

            /* renamed from: a */
            void mo135412a(boolean z);

            /* renamed from: b */
            void mo135413b();

            /* renamed from: b */
            void mo135414b(String str);

            /* renamed from: b */
            void mo135415b(boolean z);

            /* renamed from: c */
            void mo135416c(String str);

            /* renamed from: d */
            void mo135417d(String str);
        }

        /* renamed from: a */
        void mo135386a(int i, List<Chatter> list, List<Chatter> list2, boolean z);

        /* renamed from: a */
        void mo135387a(int i, boolean z);

        /* renamed from: a */
        void mo135388a(IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo135390a(String str, IGetDataCallback iGetDataCallback);

        /* renamed from: a */
        boolean mo135392a(Chatter chatter);

        /* renamed from: b */
        String mo135393b();

        /* renamed from: b */
        String mo135394b(Chatter chatter);

        /* renamed from: b */
        void mo135395b(IGetDataCallback iGetDataCallback);

        /* renamed from: c */
        Message mo135396c();

        /* renamed from: d */
        List<Chatter> mo135398d();

        /* renamed from: e */
        boolean mo135399e();
    }

    /* renamed from: com.ss.android.lark.ding.service.impl.controller.j$b */
    public interface AbstractC36755b extends IView<AbstractC36756a> {

        /* renamed from: com.ss.android.lark.ding.service.impl.controller.j$b$a */
        public interface AbstractC36756a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo135428a(int i, boolean z, List<Chatter> list, List<Chatter> list2);

            /* renamed from: b */
            void mo135429b(int i, boolean z, List<Chatter> list, List<Chatter> list2);
        }

        /* renamed from: a */
        void mo135330a();

        /* renamed from: a */
        void mo135332a(Message message, DingStatus dingStatus);

        /* renamed from: a */
        void mo135333a(Message message, List<Chatter> list, boolean z);

        /* renamed from: a */
        void mo135335a(String str);

        /* renamed from: a */
        void mo135336a(String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2);

        /* renamed from: a */
        void mo135337a(List<Chatter> list);

        /* renamed from: a */
        void mo135338a(List<Contact> list, int i);

        /* renamed from: a */
        void mo135339a(boolean z);

        /* renamed from: b */
        void mo135342b(String str);

        /* renamed from: b */
        void mo135343b(boolean z);

        /* renamed from: c */
        void mo135345c(String str);

        /* renamed from: c */
        void mo135346c(boolean z);

        /* renamed from: d */
        void mo135347d(boolean z);
    }
}
