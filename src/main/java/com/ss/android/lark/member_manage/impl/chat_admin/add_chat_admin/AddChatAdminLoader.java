package com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bH\u0016J,\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminLoader;", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "initData", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "(Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "getInitData", "()Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "compose", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "selectBeans", "filter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatters", "searchChatChatters", "", "chatId", "", "key", "Lcom/ss/android/lark/member_manage/dto/GroupManageChatChatterResponse;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.c */
public final class AddChatAdminLoader extends AbstractRunnableC45034a {

    /* renamed from: i */
    private final SelectMemberInitData f114240i;

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        ArrayList arrayList;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : list) {
                if (!t.isBot()) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        if (list == null) {
            return CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
        }
        for (T t : list) {
            String h = t.mo159513h();
            Chat chat = this.f114031b;
            Intrinsics.checkExpressionValueIsNotNull(chat, "mChat");
            if (Intrinsics.areEqual(h, chat.getOwnerId())) {
                t.mo159507d(true);
                t.mo159503b(true);
            } else if (t.mo159511f()) {
                t.mo159503b(true);
            }
        }
        return list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddChatAdminLoader(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat());
        Intrinsics.checkParameterIsNotNull(selectMemberInitData, "initData");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f114240i = selectMemberInitData;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143752a(str, str2, iGetDataCallback);
    }
}
