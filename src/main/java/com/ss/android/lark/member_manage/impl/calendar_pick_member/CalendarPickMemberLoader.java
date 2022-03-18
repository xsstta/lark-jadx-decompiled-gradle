package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45082a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H\u0014J,\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberLoader;", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "initData", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "(Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "getInitData", "()Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "preSelectedIds", "", "", "compose", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "selectBeans", "filter", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatters", "initSelectedMembers", "selectedChatChatters", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "searchChatChatters", "", "chatId", "key", "Lcom/ss/android/lark/member_manage/dto/GroupManageChatChatterResponse;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.d */
public final class CalendarPickMemberLoader extends AbstractRunnableC45034a {

    /* renamed from: i */
    private final Set<String> f114183i;

    /* renamed from: j */
    private final SelectMemberInitData f114184j;

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        Intrinsics.checkParameterIsNotNull(list, "chatters");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getType() == Chatter.ChatterType.USER) {
                arrayList.add(t);
            }
        }
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        ArrayList arrayList2 = arrayList;
        a.getChatterNameDependency().mo143790a(arrayList2);
        return arrayList2;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<? extends C45084c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                if (this.f114183i.contains(t.mo159513h())) {
                    t.mo159503b(true);
                }
                arrayList.add(new C45082a(t));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public List<C45084c> mo159308a(List<ChatChatter> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedChatChatters");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        Map<String, ChatChatter> a2 = a.getChatterDependency().mo143781a(this.f114031b.getId(), this.f114184j.getSelectedIds());
        ArrayList arrayList = new ArrayList(this.f114184j.getSelectedIds().size());
        Iterator<String> it = this.f114184j.getSelectedIds().iterator();
        while (true) {
            ChatChatter chatChatter = null;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (a2 != null) {
                chatChatter = a2.get(next);
            }
            if (chatChatter != null) {
                arrayList.add(chatChatter);
            }
        }
        List<C45084c> a3 = C45086f.m178890a(this.f114031b, arrayList, null, null, null);
        Intrinsics.checkExpressionValueIsNotNull(a3, "SelectChatterInfoParser.…, list, null, null, null)");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = a3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C45082a(it2.next()));
        }
        return arrayList2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarPickMemberLoader(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat(), true);
        Intrinsics.checkParameterIsNotNull(selectMemberInitData, "initData");
        this.f114184j = selectMemberInitData;
        this.f114183i = new HashSet(selectMemberInitData.getSelectedIds());
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143752a(str, str2, iGetDataCallback);
    }
}
