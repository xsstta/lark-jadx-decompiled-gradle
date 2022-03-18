package com.ss.android.lark.member_manage.impl.chat_admin;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J,\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0005H\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminLoader;", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "initData", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "(Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "chatService", "Lcom/ss/android/lark/member_manage/dependency/IGroupMemberManageModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "getInitData", "()Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "compose", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "selectBeans", "filter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatters", "load", "", "searchChatChatters", "chatId", "", "key", "Lcom/ss/android/lark/member_manage/dto/GroupManageChatChatterResponse;", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.b */
public final class ChatAdminLoader extends AbstractRunnableC45034a {

    /* renamed from: i */
    public static final Companion f114263i = new Companion(null);

    /* renamed from: j */
    private final IGroupMemberManageModuleDependency.IChatDependency f114264j;

    /* renamed from: k */
    private final SelectMemberInitData f114265k;

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159313a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminLoader$Companion;", "", "()V", "LOG_TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a
    /* renamed from: a */
    public void mo159310a() {
        this.f114264j.mo143769c(this.f114031b.getId(), new C45130b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/ChatAdminLoader$load$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.b$b */
    public static final class C45130b implements IGetDataCallback<List<? extends Chatter>> {

        /* renamed from: a */
        final /* synthetic */ ChatAdminLoader f114266a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45130b(ChatAdminLoader bVar) {
            this.f114266a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("ChatAdminLoader", "load chat admin error");
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Chatter> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ChatAdminLoader bVar = this.f114266a;
            int size = list.size();
            List<? extends Chatter> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                ChatChatter chatChatter = new ChatChatter(it.next());
                chatChatter.setChatId(this.f114266a.f114031b.getId());
                arrayList.add(chatChatter);
            }
            bVar.mo159318c(new GroupManageChatChatterResponse(size, false, null, arrayList, null, null));
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: b */
    public List<Chatter> mo159323b(List<Chatter> list) {
        if (list != null) {
            return list;
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
    }

    @Override // com.ss.android.lark.member_manage.impl.base.p2258a.AbstractC45037b
    /* renamed from: c */
    public List<C45084c> mo159324c(List<C45084c> list) {
        if (list != null) {
            return list;
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatAdminLoader(SelectMemberInitData selectMemberInitData, IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        super(iGetDataCallback, selectMemberInitData.getChat().getId(), selectMemberInitData.getChat());
        Intrinsics.checkParameterIsNotNull(selectMemberInitData, "initData");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f114265k = selectMemberInitData;
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        this.f114264j = a.getChatDependency();
    }
}
