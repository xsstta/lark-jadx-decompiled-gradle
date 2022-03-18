package com.ss.android.lark.pin.impl.v3;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.impl.v3.c */
public interface AbstractC51629c {

    /* renamed from: com.ss.android.lark.pin.impl.v3.c$a */
    public interface AbstractC51630a extends IModel {

        /* renamed from: com.ss.android.lark.pin.impl.v3.c$a$a */
        public interface AbstractC51631a {
            /* renamed from: a */
            void mo177500a();

            /* renamed from: a */
            void mo177501a(int i);

            /* renamed from: a */
            void mo177502a(Boolean bool);

            /* renamed from: a */
            void mo177503a(String str);

            /* renamed from: a */
            void mo177504a(List<PinInfo> list, boolean z, boolean z2);

            /* renamed from: a */
            void mo177505a(boolean z);

            /* renamed from: b */
            void mo177506b();

            /* renamed from: c */
            int mo177507c();
        }

        /* renamed from: a */
        void mo177471a(Message message, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo177473a(String str);

        /* renamed from: a */
        void mo177474a(boolean z);

        /* renamed from: a */
        boolean mo177475a();

        /* renamed from: a */
        boolean mo177476a(Message message);

        /* renamed from: b */
        Chatter mo177477b();

        /* renamed from: b */
        void mo177479b(boolean z);

        /* renamed from: c */
        Chat mo177480c();

        /* renamed from: d */
        String mo177481d();

        /* renamed from: e */
        String mo177482e();

        /* renamed from: f */
        long mo177483f();

        /* renamed from: g */
        boolean mo177484g();

        /* renamed from: h */
        void mo177485h();
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.c$b */
    public interface AbstractC51632b extends IView<AbstractC51633a> {

        /* renamed from: com.ss.android.lark.pin.impl.v3.c$b$a */
        public interface AbstractC51633a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo177491a();

            /* renamed from: a */
            void mo177492a(Message message);

            /* renamed from: a */
            void mo177493a(PinInfo bVar);

            /* renamed from: a */
            void mo177494a(String str);

            /* renamed from: a */
            void mo177495a(boolean z);

            /* renamed from: b */
            boolean mo177496b();

            /* renamed from: b */
            boolean mo177497b(Message message);

            /* renamed from: c */
            boolean mo177498c();

            /* renamed from: d */
            Chat mo177499d();
        }

        /* renamed from: a */
        void mo177449a();

        /* renamed from: a */
        void mo177454a(Boolean bool);

        /* renamed from: a */
        void mo177455a(String str);

        /* renamed from: a */
        void mo177456a(String str, String str2, PinInfo bVar, Chatter chatter);

        /* renamed from: a */
        void mo177457a(List<PinInfo> list, long j, boolean z, boolean z2);

        /* renamed from: a */
        void mo177458a(boolean z);

        /* renamed from: b */
        void mo177460b();

        /* renamed from: b */
        void mo177461b(int i);

        /* renamed from: c */
        int mo177464c();
    }
}
