package com.ss.android.lark.member_manage.impl.show_member.common_group;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.team.entity.Team;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.b */
public class C45190b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.b$a */
    public interface AbstractC45191a extends IGroupMemberBaseContract.AbstractC45065a {

        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.b$a$a */
        public interface AbstractC45192a {
        }

        /* renamed from: a */
        void mo159745a(long j, IGetDataCallback<Team> iGetDataCallback);

        /* renamed from: a */
        void mo159746a(Chat chat);

        /* renamed from: a */
        void mo159747a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo159748a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo159749a(List<String> list, IGetDataCallback<Chat> iGetDataCallback);

        void aT_();

        /* renamed from: b */
        void mo159751b(String str, IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: b */
        void mo159752b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

        /* renamed from: c */
        void mo159753c(List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback);

        /* renamed from: j */
        void mo159754j();

        /* renamed from: k */
        void mo159755k();

        /* renamed from: l */
        Chat mo159756l();
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.b$b */
    interface AbstractC45193b extends IGroupMemberBaseContract.AbstractC45066b<AbstractC45194a> {

        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.b$b$a */
        public interface AbstractC45194a extends IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a {
            /* renamed from: a */
            void mo159769a(Chat chat, IGetDataCallback<SelectBeansResult> iGetDataCallback);

            /* renamed from: a */
            void mo159770a(String str, IGetDataCallback<Chat> iGetDataCallback);

            /* renamed from: a */
            void mo159771a(List<String> list);

            /* renamed from: g */
            void mo159772g();
        }

        /* renamed from: a */
        void mo159757a(ErrorResult errorResult);

        /* renamed from: a */
        void mo159758a(SelectBeansResult dVar);

        /* renamed from: a */
        void mo159759a(Team team);

        /* renamed from: a */
        void mo159760a(List<String> list);

        /* renamed from: a */
        void mo159761a(boolean z);

        void aU_();

        void aV_();

        void aW_();

        /* renamed from: c */
        void mo159765c(SelectBeansResult dVar);

        /* renamed from: c */
        void mo159766c(List<ChatChatter> list);

        void e_(int i);

        /* renamed from: i */
        boolean mo159768i();
    }
}
