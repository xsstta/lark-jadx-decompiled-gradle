package com.ss.android.lark.member_manage.impl.select_ding_member;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TagType;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.widget.richtext.C59031e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.select_ding_member.d */
public class C45163d extends AbstractRunnableC45034a {

    /* renamed from: i */
    MessageInfo f114346i;

    /* renamed from: j */
    IGroupMemberManageModuleDependency f114347j = GroupMemberManageModule.m177902a();

    /* renamed from: k */
    private final IGroupMemberManageModuleDependency.AbstractC44878a f114348k = GroupMemberManageModule.m177902a().getAccountDependency();

    /* renamed from: f */
    private List<String> m179253f(List<ChatChatter> list) {
        ArrayList arrayList = new ArrayList();
        for (ChatChatter chatChatter : list) {
            arrayList.add(chatChatter.getId());
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C45084c> m179251d(List<C45084c> list) {
        for (C45084c cVar : list) {
            if (this.f114032c.containsKey(cVar.mo159513h())) {
                cVar.mo159503b(true);
            }
        }
        return list;
    }

    /* renamed from: e */
    private List<String> m179252e(List<ChatChatter> list) {
        ArrayList arrayList = new ArrayList();
        for (ChatChatter chatChatter : list) {
            if (chatChatter.getAccessInfo().isInacessUrgentByExecutives()) {
                arrayList.add(chatChatter.getId());
            }
        }
        arrayList.add(this.f114348k.mo143795b());
        return arrayList;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter : list) {
            if (chatter.getType() != Chatter.ChatterType.BOT && !chatter.isDimission() && !this.f114348k.mo143793a(chatter.getId())) {
                arrayList.add(chatter);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        for (C45084c cVar : list) {
            ArrayList arrayList = new ArrayList();
            for (TagInfo tagInfo : cVar.mo159512g().mo159542p()) {
                if (tagInfo.getType() != TagType.ADMIN_USER) {
                    arrayList.add(tagInfo);
                }
            }
            cVar.mo159512g().mo159524a(arrayList);
        }
        if (this.f114346i == null) {
            return list;
        }
        return m179251d(list);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public List<C45084c> mo159308a(List<ChatChatter> list) {
        ArrayList<String> arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        }
        if (this.f114346i.getDingStatus() != null) {
            arrayList.addAll(this.f114346i.getDingStatus().getUnconfirmedChatterIds());
            arrayList.addAll(this.f114346i.getDingStatus().getConfirmedChatterIds());
        }
        Message message = this.f114346i.getMessage();
        ArrayList arrayList2 = new ArrayList();
        if (message != null) {
            Message.Type type = message.getType();
            if (type == Message.Type.POST) {
                arrayList2.addAll(C59031e.m229178a(GroupMemberManageModule.m177902a().getMessageDependency().mo143797a(message), false));
            } else if (type == Message.Type.TEXT) {
                arrayList2.addAll(GroupMemberManageModule.m177902a().getMessageDependency().mo143798a(this.f114031b.isSecret(), message));
            }
            if (CollectionUtils.isNotEmpty(arrayList2)) {
                arrayList2.removeAll(message.getReadAtChatterIds());
                arrayList.addAll(arrayList2);
            }
        }
        arrayList.removeAll(m179252e(list));
        arrayList.retainAll(m179253f(list));
        if (CollectionUtils.isNotEmpty(arrayList)) {
            Map<String, ChatChatter> a = this.f114347j.getChatDependency().mo143746a(this.f114030a, arrayList);
            if (CollectionUtils.isNotEmpty(a)) {
                Collections.sort(arrayList);
                ArrayList arrayList3 = new ArrayList(a.size());
                for (String str : arrayList) {
                    ChatChatter chatChatter = a.get(str);
                    if (chatChatter != null && chatChatter.getType() == Chatter.ChatterType.USER) {
                        arrayList3.add(chatChatter);
                    }
                }
                return C45086f.m178890a(this.f114031b, arrayList3, null, null, null);
            }
        }
        return new ArrayList();
    }

    public C45163d(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat(), true);
        this.f114346i = selectMemberInitData.getMessageInfo();
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        GroupMemberManageModule.m177902a().getChatDependency().mo143752a(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public List<C45084c> mo159309a(List<Chatter> list, Map<String, String> map, Map<String, String> map2, Chatter chatter) {
        ArrayList arrayList = new ArrayList();
        for (Chatter chatter2 : list) {
            if (chatter2.getType() != Chatter.ChatterType.BOT && !chatter2.isDimission() && !this.f114348k.mo143793a(chatter2.getId())) {
                arrayList.add(chatter2);
            }
        }
        return super.mo159309a(arrayList, map, map2, chatter);
    }
}
