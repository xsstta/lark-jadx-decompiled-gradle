package com.ss.android.lark.chatsetting.impl.group.ownership.v1;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.team.entity.Team;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.e */
public interface AbstractC34860e {

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.e$a */
    public interface AbstractC34861a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.e$a$a */
        public interface AbstractC34862a {
            /* renamed from: a */
            void mo128617a(Chat chat);

            /* renamed from: a */
            void mo128618a(String str);

            /* renamed from: a */
            boolean mo128619a();

            /* renamed from: b */
            void mo128620b(String str);
        }

        /* renamed from: a */
        Chat mo128579a();

        /* renamed from: a */
        void mo128580a(IGetDataCallback<Long> iGetDataCallback);

        /* renamed from: a */
        void mo128581a(Chat.BuzzPermissionSetting buzzPermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128582a(Chat.CreateVideoConferenceSetting createVideoConferenceSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128583a(Chat.PinPermissionSetting pinPermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128584a(Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128585a(Chat.TopNoticePermissionSetting topNoticePermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128586a(Chat chat);

        /* renamed from: a */
        void mo128587a(Chat chat, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo128589a(Chatter chatter, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128590a(AbstractC34862a aVar);

        /* renamed from: a */
        void mo128591a(String str, IGetDataCallback<List<Chatter>> iGetDataCallback);

        /* renamed from: a */
        void mo128592a(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128593a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        Team mo128594b();

        /* renamed from: b */
        void mo128595b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo128596b(Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo128597b(Chat chat);

        /* renamed from: b */
        void mo128598b(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: c */
        void mo128600c(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: d */
        void mo128602d(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: e */
        void mo128603e(boolean z, IGetDataCallback<Chat> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.e$b */
    public interface AbstractC34863b extends IView<AbstractC34864a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v1.e$b$a */
        public interface AbstractC34864a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128621a();

            /* renamed from: a */
            void mo128622a(Chat.SystemMessageVisible systemMessageVisible);

            /* renamed from: a */
            void mo128623a(boolean z);

            /* renamed from: a */
            void mo128624a(boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType);

            /* renamed from: b */
            void mo128625b();

            /* renamed from: b */
            void mo128626b(Chat.SystemMessageVisible systemMessageVisible);

            /* renamed from: b */
            void mo128627b(boolean z);

            /* renamed from: c */
            void mo128628c();

            /* renamed from: c */
            void mo128629c(boolean z);

            /* renamed from: d */
            void mo128630d();

            /* renamed from: d */
            void mo128631d(boolean z);

            /* renamed from: e */
            void mo128632e();

            /* renamed from: e */
            void mo128633e(boolean z);

            /* renamed from: f */
            void mo128634f();

            /* renamed from: f */
            void mo128635f(boolean z);

            /* renamed from: g */
            void mo128636g();

            /* renamed from: g */
            void mo128637g(boolean z);

            /* renamed from: h */
            Chat mo128638h();

            /* renamed from: h */
            void mo128639h(boolean z);

            /* renamed from: i */
            Team mo128640i();

            /* renamed from: i */
            void mo128641i(boolean z);

            /* renamed from: j */
            void mo128642j();
        }

        /* renamed from: a */
        void mo128531a(int i, int i2);

        /* renamed from: a */
        void mo128532a(Chat chat);

        /* renamed from: a */
        void mo128533a(Chat chat, Long l);

        /* renamed from: a */
        void mo128534a(Chat chat, List<Chatter> list);

        /* renamed from: a */
        void mo128536a(String str);

        /* renamed from: a */
        void mo128537a(String str, String str2, Chat.PostType postType, boolean z);

        /* renamed from: a */
        void mo128538a(String str, boolean z);

        /* renamed from: a */
        void mo128539a(boolean z);

        /* renamed from: b */
        void mo128540b(Chat chat);

        /* renamed from: b */
        void mo128541b(String str);

        /* renamed from: b */
        void mo128542b(String str, boolean z);

        /* renamed from: b */
        void mo128543b(boolean z);

        /* renamed from: b */
        boolean mo128544b();

        /* renamed from: c */
        void mo128545c();

        /* renamed from: c */
        void mo128546c(Chat chat);

        /* renamed from: c */
        void mo128547c(String str);

        /* renamed from: c */
        void mo128548c(String str, boolean z);

        /* renamed from: d */
        void mo128549d(Chat chat);

        /* renamed from: d */
        void mo128550d(String str, boolean z);

        /* renamed from: e */
        void mo128551e(Chat chat);

        /* renamed from: f */
        void mo128552f(Chat chat);

        /* renamed from: g */
        void mo128553g(Chat chat);

        /* renamed from: h */
        void mo128554h(Chat chat);

        /* renamed from: i */
        void mo128555i(Chat chat);

        /* renamed from: j */
        void mo128556j(Chat chat);

        /* renamed from: k */
        void mo128557k(Chat chat);

        /* renamed from: l */
        void mo128558l(Chat chat);
    }
}
