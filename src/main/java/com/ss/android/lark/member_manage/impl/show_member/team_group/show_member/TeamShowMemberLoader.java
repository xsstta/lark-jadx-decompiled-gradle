package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import android.text.TextUtils;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.show_member.team_group.DataManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0016J,\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/TeamShowMemberLoader;", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "channelId", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isForceNet", "", "(Lcom/larksuite/framework/callback/IGetDataCallback;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/Chat;Z)V", "mOwner", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "compose", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "selectBeans", "filter", "chatters", "searchChatChatters", "", "chatId", "key", "Lcom/ss/android/lark/member_manage/dto/GroupManageChatChatterResponse;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.h */
public final class TeamShowMemberLoader extends AbstractRunnableC45034a {

    /* renamed from: i */
    private Chatter f114587i;

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Chatter chatter : list) {
            Chat chat = this.f114031b;
            Intrinsics.checkExpressionValueIsNotNull(chat, "mChat");
            if (TextUtils.equals(chatter.getId(), chat.getOwnerId())) {
                this.f114587i = chatter;
            } else if (!chatter.isBot()) {
                arrayList.add(chatter);
            }
        }
        Chatter chatter2 = this.f114587i;
        if (chatter2 != null) {
            arrayList.add(0, chatter2);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        String str;
        if (list == null) {
            return new ArrayList();
        }
        for (C45084c cVar : list) {
            String h = cVar.mo159513h();
            Chatter chatter = this.f114587i;
            if (chatter != null) {
                str = chatter.getId();
            } else {
                str = null;
            }
            if (TextUtils.equals(h, str)) {
                cVar.mo159507d(true);
            }
            cVar.mo159503b(DataManager.f114488b.mo159839a().mo159833a().contains(cVar.mo159513h()));
        }
        return list;
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143751a(str, str2, this.f114037h, iGetDataCallback);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamShowMemberLoader(IGetDataCallback<SelectBeansResult> iGetDataCallback, String str, Chat chat, boolean z) {
        super(iGetDataCallback, str, chat, z);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Intrinsics.checkParameterIsNotNull(str, "channelId");
        Intrinsics.checkParameterIsNotNull(chat, "chat");
    }
}
