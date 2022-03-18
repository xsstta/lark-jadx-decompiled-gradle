package com.ss.android.lark.post;

import android.content.Intent;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.im.api.C29607af;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.List;

/* renamed from: com.ss.android.lark.post.a */
public interface AbstractC52159a {

    /* renamed from: com.ss.android.lark.post.a$a */
    public interface AbstractC52160a extends IModel {
        /* renamed from: a */
        Boolean mo178670a();

        /* renamed from: a */
        void mo178671a(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo178672a(IGetDataCallback<List<C29607af>> iGetDataCallback, boolean z);

        /* renamed from: a */
        boolean mo178673a(Chat chat);

        /* renamed from: b */
        ChatChatter mo178674b();

        /* renamed from: b */
        void mo178675b(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo178676c(IGetDataCallback<Long> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.post.a$b */
    public interface AbstractC52161b extends IView<AbstractC52162a> {

        /* renamed from: com.ss.android.lark.post.a$b$a */
        public interface AbstractC52162a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo178677a();

            /* renamed from: a */
            void mo178678a(IGetDataCallback<Long> iGetDataCallback);

            /* renamed from: b */
            Boolean mo178679b();

            /* renamed from: c */
            void mo178680c();

            /* renamed from: d */
            void mo178681d();
        }

        /* renamed from: a */
        void mo178632a();

        /* renamed from: a */
        void mo178633a(int i, int i2, Intent intent);

        /* renamed from: a */
        void mo178635a(C52219g gVar);

        /* renamed from: a */
        void mo178636a(Boolean bool);

        /* renamed from: a */
        void mo178637a(List<C29607af> list);

        /* renamed from: b */
        void mo178638b();

        /* renamed from: b */
        void mo178639b(List<C29607af> list);

        /* renamed from: c */
        void mo178640c();

        /* renamed from: d */
        void mo178641d();

        /* renamed from: e */
        boolean mo178642e();

        /* renamed from: f */
        void mo178643f();
    }
}
