package com.ss.android.lark.chatsetting.impl.p2p;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.dto.C34495a;
import com.ss.android.lark.chatsetting.dto.Profile;

/* renamed from: com.ss.android.lark.chatsetting.impl.p2p.b */
public interface AbstractC35020b {

    /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.b$a */
    public interface AbstractC35021a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.b$a$a */
        public interface AbstractC35022a {
            /* renamed from: a */
            void mo129066a(Chat chat, Chat chat2);

            /* renamed from: a */
            void mo129067a(Chatter chatter);

            /* renamed from: a */
            void mo129068a(boolean z);

            /* renamed from: b */
            void mo129069b(Chatter chatter);

            /* renamed from: b */
            void mo129070b(boolean z);

            /* renamed from: c */
            void mo129071c(boolean z);
        }

        /* renamed from: a */
        Chatter mo129049a();

        /* renamed from: a */
        void mo129050a(int i, String str, String str2, IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: a */
        void mo129051a(IGetDataCallback<Profile> iGetDataCallback);

        /* renamed from: a */
        void mo129052a(AbstractC35022a aVar);

        /* renamed from: a */
        void mo129053a(boolean z);

        /* renamed from: a */
        void mo129054a(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        Chat mo129055b();

        /* renamed from: b */
        void mo129056b(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo129057b(boolean z);

        /* renamed from: c */
        ChatChatter mo129058c();

        /* renamed from: c */
        void mo129059c(IGetDataCallback<C34495a> iGetDataCallback);

        /* renamed from: c */
        void mo129060c(boolean z);

        /* renamed from: d */
        ChatChatter mo129061d();

        /* renamed from: e */
        void mo129062e();

        /* renamed from: f */
        boolean mo129063f();

        /* renamed from: g */
        boolean mo129064g();

        /* renamed from: h */
        boolean mo129065h();
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.b$b */
    public interface AbstractC35023b extends IView<AbstractC35024a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.p2p.b$b$a */
        public interface AbstractC35024a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo129072a();

            /* renamed from: a */
            void mo129073a(boolean z);

            /* renamed from: b */
            void mo129074b();

            /* renamed from: b */
            void mo129075b(boolean z);

            /* renamed from: c */
            void mo129076c();

            /* renamed from: c */
            void mo129077c(boolean z);

            /* renamed from: d */
            void mo129078d(boolean z);

            /* renamed from: d */
            boolean mo129079d();

            /* renamed from: e */
            boolean mo129080e();

            /* renamed from: f */
            void mo129081f();

            /* renamed from: g */
            void mo129082g();
        }

        /* renamed from: a */
        void mo129013a();

        /* renamed from: a */
        void mo129014a(int i);

        /* renamed from: a */
        void mo129015a(Chat chat, Chat chat2);

        /* renamed from: a */
        void mo129016a(Chat chat, Chatter chatter, Profile profile);

        /* renamed from: a */
        void mo129017a(Chatter chatter);

        /* renamed from: a */
        void mo129018a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo129020a(C35053e eVar);

        /* renamed from: a */
        void mo129021a(String str);

        /* renamed from: a */
        void mo129022a(boolean z);

        /* renamed from: b */
        void mo129023b();

        /* renamed from: b */
        void mo129024b(Chatter chatter);

        /* renamed from: b */
        void mo129025b(String str);

        /* renamed from: b */
        void mo129026b(boolean z);

        /* renamed from: c */
        void mo129027c();

        /* renamed from: c */
        void mo129028c(Chatter chatter);

        /* renamed from: c */
        void mo129029c(String str);

        /* renamed from: c */
        void mo129030c(boolean z);

        /* renamed from: d */
        void mo129032d(String str);

        /* renamed from: d */
        void mo129033d(boolean z);
    }
}
