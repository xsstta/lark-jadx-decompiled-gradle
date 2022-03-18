package com.ss.android.lark.member_manage.impl.base.adapter;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.C45088a;
import com.ss.android.lark.member_manage.impl.change_owner.C45098a;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.AddChatAdminBinder;
import com.ss.android.lark.member_manage.impl.pick_member.C45147b;
import com.ss.android.lark.member_manage.impl.select_ding_member.C45156a;
import com.ss.android.lark.member_manage.impl.show_member.common.ReduceMemberBinder;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45189a;
import com.ss.android.lark.member_manage.impl.show_member.p2260a.C45188b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.base.adapter.c */
public class C45043c {

    /* renamed from: a */
    Map<Integer, IFuncBinder<C45047e, C45084c>> f114050a;

    /* renamed from: a */
    public IFuncBinder<C45047e, C45084c> mo159347a(int i) {
        if (this.f114050a.containsKey(Integer.valueOf(i))) {
            return this.f114050a.get(Integer.valueOf(i));
        }
        throw new RuntimeException("binder is not Found!");
    }

    public C45043c(Chat chat) {
        HashMap hashMap = new HashMap();
        this.f114050a = hashMap;
        hashMap.put(5, new C45098a());
        this.f114050a.put(3, new C45156a());
        this.f114050a.put(1, new ReduceMemberBinder(chat));
        this.f114050a.put(6, new C45147b(chat));
        this.f114050a.put(2, new C45188b(chat));
        this.f114050a.put(7, new C45189a());
        this.f114050a.put(8, new C45088a());
        this.f114050a.put(10, new AddChatAdminBinder());
        this.f114050a.put(11, new C45188b(chat));
    }
}
