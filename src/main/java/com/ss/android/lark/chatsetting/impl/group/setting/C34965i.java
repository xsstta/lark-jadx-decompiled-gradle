package com.ss.android.lark.chatsetting.impl.group.setting;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chatsetting.dto.Shortcut;
import com.ss.android.lark.chatsetting.impl.group.setting.C34947f;
import com.ss.android.lark.team.entity.Team;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.i */
public class C34965i {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.i$a */
    public interface AbstractC34966a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.i$a$a */
        public interface AbstractC34967a {
            /* renamed from: a */
            void mo128912a();

            /* renamed from: a */
            void mo128913a(Chat chat);

            /* renamed from: a */
            void mo128914a(Chat chat, Chat chat2, List<ChatChatter> list);

            /* renamed from: a */
            void mo128915a(Chat chat, Team team);

            /* renamed from: a */
            void mo128916a(List<ChatChatter> list);

            /* renamed from: a */
            void mo128917a(boolean z);

            /* renamed from: b */
            void mo128918b(boolean z);
        }

        /* renamed from: a */
        Chat mo128744a();

        /* renamed from: a */
        C34947f.C34949a mo128745a(String str);

        /* renamed from: a */
        void mo128746a(IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback);

        /* renamed from: a */
        void mo128747a(Chat.MessagePosition messagePosition, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128748a(Chat chat);

        /* renamed from: a */
        void mo128751a(Chatter chatter, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128753a(C34947f.C34949a aVar);

        /* renamed from: a */
        void mo128755a(String str, IGetDataCallback<C34947f.C34949a> iGetDataCallback, IGetDataCallback<C34947f.C34949a> iGetDataCallback2);

        /* renamed from: a */
        void mo128756a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo128757a(List<ChatChatter> list);

        /* renamed from: a */
        void mo128758a(boolean z, IGetDataCallback<Shortcut> iGetDataCallback);

        /* renamed from: b */
        Team mo128759b();

        /* renamed from: b */
        void mo128760b(IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: b */
        void mo128763b(boolean z, IGetDataCallback iGetDataCallback);

        /* renamed from: c */
        void mo128764c(IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: c */
        void mo128766c(boolean z, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: c */
        boolean mo128767c();

        /* renamed from: d */
        int mo128768d();

        /* renamed from: d */
        void mo128769d(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: d */
        void mo128770d(boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: e */
        boolean mo128771e();

        /* renamed from: f */
        boolean mo128772f();

        /* renamed from: g */
        boolean mo128773g();

        /* renamed from: h */
        ChatChatter mo128774h();

        /* renamed from: i */
        boolean mo128775i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.i$b */
    public interface AbstractC34968b extends IView<AbstractC34969a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.i$b$a */
        public interface AbstractC34969a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo128886a();

            /* renamed from: a */
            void mo128887a(Chat.MessagePosition messagePosition);

            /* renamed from: a */
            void mo128888a(boolean z);

            /* renamed from: b */
            void mo128889b();

            /* renamed from: b */
            void mo128890b(boolean z);

            /* renamed from: c */
            void mo128891c();

            /* renamed from: c */
            void mo128892c(boolean z);

            /* renamed from: d */
            void mo128893d();

            /* renamed from: d */
            void mo128894d(boolean z);

            /* renamed from: e */
            void mo128895e();

            /* renamed from: e */
            void mo128896e(boolean z);

            /* renamed from: f */
            void mo128897f(boolean z);

            /* renamed from: f */
            boolean mo128898f();

            /* renamed from: g */
            void mo128899g();

            /* renamed from: h */
            boolean mo128900h();

            /* renamed from: i */
            void mo128901i();

            /* renamed from: j */
            void mo128902j();

            /* renamed from: k */
            boolean mo128903k();

            /* renamed from: l */
            Team mo128904l();

            /* renamed from: m */
            boolean mo128905m();

            /* renamed from: n */
            boolean mo128906n();
        }

        /* renamed from: a */
        void mo128785a();

        /* renamed from: a */
        void mo128786a(int i);

        /* renamed from: a */
        void mo128787a(int i, int i2);

        /* renamed from: a */
        void mo128788a(Chat chat, int i, int i2);

        /* renamed from: a */
        void mo128789a(Chat chat, Chat.MessagePosition messagePosition);

        /* renamed from: a */
        void mo128790a(Chat chat, Chat chat2, List<ChatChatter> list);

        /* renamed from: a */
        void mo128791a(Chat chat, ChatSetting chatSetting, boolean z, String str, ChatChatter chatChatter, boolean z2, TopicGroup topicGroup);

        /* renamed from: a */
        void mo128792a(Chat chat, Team team);

        /* renamed from: a */
        void mo128793a(Chat chat, String str);

        /* renamed from: a */
        void mo128794a(Chat chat, List<ChatChatter> list);

        /* renamed from: a */
        void mo128795a(Chat chat, boolean z);

        /* renamed from: a */
        void mo128797a(Team team, Chat chat);

        /* renamed from: a */
        void mo128798a(String str);

        /* renamed from: a */
        void mo128799a(boolean z);

        /* renamed from: b */
        void mo128801b();

        /* renamed from: b */
        void mo128802b(Chat chat);

        /* renamed from: b */
        void mo128804b(Chat chat, List<ChatChatter> list);

        /* renamed from: b */
        void mo128805b(Chat chat, boolean z);

        /* renamed from: b */
        void mo128806b(String str);

        /* renamed from: b */
        void mo128807b(boolean z);

        /* renamed from: c */
        void mo128809c(Chat chat);

        /* renamed from: c */
        void mo128810c(boolean z);

        /* renamed from: d */
        void mo128813d(boolean z);

        /* renamed from: e */
        void mo128814e(Chat chat);

        /* renamed from: f */
        void mo128818f(Chat chat);

        /* renamed from: f */
        void mo128819f(boolean z);

        /* renamed from: g */
        void mo128820g(Chat chat);

        /* renamed from: g */
        void mo128821g(boolean z);

        /* renamed from: h */
        void mo128822h(Chat chat);
    }
}
