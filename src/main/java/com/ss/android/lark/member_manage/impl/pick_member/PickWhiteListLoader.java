package com.ss.android.lark.member_manage.impl.pick_member;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45086f;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0014J,\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/PickWhiteListLoader;", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "initData", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "(Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "getInitData", "()Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "preSelectedIds", "", "", "getPreSelectedIds", "()Ljava/util/Set;", "compose", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "selectBeans", "filter", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatters", "initSelectedMembers", "selectedChatChatters", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "searchChatChatters", "", "chatId", "key", "Lcom/ss/android/lark/member_manage/dto/GroupManageChatChatterResponse;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.pick_member.d */
public final class PickWhiteListLoader extends AbstractRunnableC45034a {

    /* renamed from: i */
    private final Set<String> f114307i;

    /* renamed from: j */
    private final SelectMemberInitData f114308j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public List<C45084c> mo159308a(List<ChatChatter> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedChatChatters");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        Map<String, ChatChatter> a2 = a.getChatterDependency().mo143781a(this.f114031b.getId(), this.f114308j.getSelectedIds());
        ArrayList arrayList = new ArrayList(this.f114308j.getSelectedIds().size());
        Iterator<String> it = this.f114308j.getSelectedIds().iterator();
        while (true) {
            ChatChatter chatChatter = null;
            if (it.hasNext()) {
                String next = it.next();
                if (a2 != null) {
                    chatChatter = a2.get(next);
                }
                if (chatChatter != null) {
                    arrayList.add(chatChatter);
                }
            } else {
                List<C45084c> a3 = C45086f.m178890a(mo159316b(), arrayList, null, null, null);
                Intrinsics.checkExpressionValueIsNotNull(a3, "SelectChatterInfoParser.…, list, null, null, null)");
                return a3;
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        Chatter chatter = null;
        if (list != null) {
            for (Chatter chatter2 : list) {
                String id = chatter2.getId();
                Chat chat = this.f114031b;
                Intrinsics.checkExpressionValueIsNotNull(chat, "mChat");
                if (Intrinsics.areEqual(id, chat.getOwnerId())) {
                    chatter = chatter2;
                } else {
                    arrayList.add(chatter2);
                }
            }
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            a.getChatterNameDependency().mo143790a(arrayList);
            if (chatter != null) {
                arrayList.add(0, chatter);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<? extends C45084c> list) {
        if (list == null) {
            return new ArrayList(0);
        }
        C45084c cVar = null;
        List<? extends C45084c> list2 = list;
        for (T t : list2) {
            if (this.f114307i.contains(t.mo159513h())) {
                t.mo159503b(true);
            }
            String h = t.mo159513h();
            Chat chat = this.f114031b;
            Intrinsics.checkExpressionValueIsNotNull(chat, "mChat");
            if (Intrinsics.areEqual(h, chat.getOwnerId())) {
                t.mo159507d(true);
                t.mo159503b(false);
                cVar = t;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : list2) {
            String h2 = t2.mo159513h();
            Chat chat2 = this.f114031b;
            Intrinsics.checkExpressionValueIsNotNull(chat2, "mChat");
            if (!Intrinsics.areEqual(h2, chat2.getOwnerId())) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C45084c) obj).mo159511f()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List<C45084c> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.plus((Collection) ((List) pair.component1()), (Iterable) ((List) pair.component2())));
        if (cVar != null) {
            mutableList.add(0, cVar);
        }
        return mutableList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickWhiteListLoader(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat());
        Intrinsics.checkParameterIsNotNull(selectMemberInitData, "initData");
        this.f114308j = selectMemberInitData;
        this.f114307i = new HashSet(selectMemberInitData.getSelectedIds());
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143752a(str, str2, iGetDataCallback);
    }
}
