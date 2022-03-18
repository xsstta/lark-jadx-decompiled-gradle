package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.f */
public class C45199f extends AbstractRunnableC45034a {

    /* renamed from: i */
    Chatter f114392i;

    /* renamed from: j */
    List<String> f114393j = new ArrayList();

    /* renamed from: k */
    private SelectMemberInitData f114394k;

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        for (C45084c cVar : list) {
            if (this.f114393j.contains(cVar.mo159513h())) {
                cVar.mo159503b(true);
            }
            if (this.f114392i != null && cVar.mo159513h().equals(this.f114392i.getId())) {
                cVar.mo159507d(true);
            }
        }
        return list;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter : list) {
            if (TextUtils.equals(chatter.getId(), this.f114031b.getOwnerId())) {
                this.f114392i = chatter;
            } else {
                SelectMemberInitData selectMemberInitData = this.f114394k;
                if (selectMemberInitData == null || selectMemberInitData.getMemberFilter() == null || !this.f114394k.getMemberFilter().mo159774a(chatter)) {
                    arrayList.add(chatter);
                }
            }
        }
        Chatter chatter2 = this.f114392i;
        if (chatter2 != null) {
            arrayList.add(0, chatter2);
        }
        return arrayList;
    }

    public C45199f(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat());
        this.f114394k = selectMemberInitData;
        if (CollectionUtils.isNotEmpty(selectMemberInitData.getSelectedIds())) {
            this.f114393j.addAll(selectMemberInitData.getSelectedIds());
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        GroupMemberManageModule.m177902a().getChatDependency().mo143752a(str, str2, iGetDataCallback);
    }
}
