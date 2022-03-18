package com.ss.android.lark.member_manage.impl.change_owner;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.change_owner.c */
public class C45101c extends AbstractRunnableC45034a {
    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        return list;
    }

    /* renamed from: d */
    private Chatter m178992d(List<Chatter> list) {
        for (Chatter chatter : list) {
            if (this.f114031b.getOwnerId().equals(chatter.getId())) {
                return chatter;
            }
        }
        return null;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        Chatter d = m178992d(list);
        for (Chatter chatter : list) {
            if (!m178991a(chatter, d)) {
                arrayList.add(chatter);
            }
        }
        GroupMemberManageModule.m177902a().getChatterNameDependency();
        return arrayList;
    }

    public C45101c(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat());
    }

    /* renamed from: a */
    private boolean m178991a(Chatter chatter, Chatter chatter2) {
        if (chatter.getType() != Chatter.ChatterType.BOT && !chatter.isDimission() && !GroupMemberManageModule.m177902a().getAccountDependency().mo143793a(chatter.getId()) && !this.f114031b.getOwnerId().equals(chatter.getId())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        GroupMemberManageModule.m177902a().getChatDependency().mo143752a(str, str2, iGetDataCallback);
    }
}
