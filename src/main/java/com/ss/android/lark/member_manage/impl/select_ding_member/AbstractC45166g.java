package com.ss.android.lark.member_manage.impl.select_ding_member;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.g */
public interface AbstractC45166g {

    /* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.g$b */
    public interface AbstractC45169b extends IGroupMemberBaseContract.AbstractC45066b<IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a> {
        /* renamed from: a */
        void mo159697a(Message message, List<String> list);

        /* renamed from: a */
        void mo159698a(MessageUnReadInfo cVar);
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.g$a */
    public interface AbstractC45167a extends IGroupMemberBaseContract.AbstractC45065a {
        /* renamed from: a */
        boolean mo159692a(long j);

        /* renamed from: b */
        void mo159693b(String str, String str2, IGetDataCallback<MessageUnReadInfo> iGetDataCallback);

        /* renamed from: j */
        C45168a mo159694j();

        /* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.g$a$a */
        public static class C45168a {

            /* renamed from: a */
            public Message f114352a;

            /* renamed from: b */
            public List<String> f114353b;

            public C45168a(Message message, List<String> list) {
                this.f114352a = message;
                this.f114353b = list;
            }
        }
    }
}
