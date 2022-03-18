package com.ss.android.lark.chatsetting.impl.group.info;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.team.entity.Team;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.c */
public class C34619c {

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.c$a */
    interface AbstractC34620a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.c$a$a */
        public interface AbstractC34621a {
            /* renamed from: a */
            void mo127904a(Chat chat, Team team);

            /* renamed from: a */
            void mo127905a(Chat chat, boolean z, String str);
        }

        /* renamed from: a */
        Chat mo127886a();

        /* renamed from: a */
        String mo127887a(Context context);

        /* renamed from: a */
        void mo127888a(Context context, C36516a<?> aVar);

        /* renamed from: a */
        void mo127889a(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127890a(Chat chat);

        /* renamed from: a */
        void mo127893a(Team team);

        /* renamed from: b */
        String mo127894b();

        /* renamed from: c */
        void mo127896c(Chat chat);

        /* renamed from: c */
        boolean mo127897c();
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.c$b */
    interface AbstractC34622b extends IView<AbstractC34623a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.c$b$a */
        public interface AbstractC34623a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo127901a();

            /* renamed from: b */
            void mo127902b();
        }

        /* renamed from: a */
        void mo127859a(Chat chat, Team team);

        /* renamed from: a */
        void mo127861a(Chat chat, boolean z, String str);

        /* renamed from: a */
        void mo127863a(String str);

        /* renamed from: a */
        void mo127864a(boolean z, Chat chat, List<String> list);

        /* renamed from: b */
        void mo127866b(Chat chat, boolean z, String str);

        /* renamed from: b */
        void mo127867b(String str);

        /* renamed from: c */
        void mo127869c(String str);
    }
}
