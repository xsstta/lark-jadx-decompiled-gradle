package com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c;
import com.ss.android.lark.member_manage.impl.base.p2259b.C45051a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J(\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u001aH\u0016J:\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190 2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\"0\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminModel;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageModel;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IModel;", "()V", "chatAdminCount", "", "curSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ChatChatterSearcher;", "getChatAdminCount", "getCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getInitData", "", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "getLoader", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "getSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearcher;", "search", "key", "", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearchResultCallback;", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "updateChatAdmin", "chatId", "toAddUserIds", "", "toDelUserIds", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.d */
public final class AddChatAdminModel extends AbstractC45068a implements IAddChatAdminContract.IModel {

    /* renamed from: h */
    private final C45051a f114241h = new C45051a();

    /* renamed from: i */
    private int f114242i;

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract.IModel
    /* renamed from: k */
    public int mo159616k() {
        return this.f114242i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: f */
    public AbstractC45054c mo159467f() {
        return this.f114241h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.d$a */
    static final class C45122a<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ String f114243a;

        C45122a(String str) {
            this.f114243a = str;
        }

        /* renamed from: a */
        public final SelectMemberInitData produce() {
            SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            selectMemberInitData.setChat(a.getChatDependency().mo143743a(this.f114243a));
            return selectMemberInitData;
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract.IModel
    /* renamed from: j */
    public Chat mo159615j() {
        SelectMemberInitData selectMemberInitData = this.f114103a;
        Intrinsics.checkExpressionValueIsNotNull(selectMemberInitData, "mInitData");
        Chat chat = selectMemberInitData.getChat();
        Intrinsics.checkExpressionValueIsNotNull(chat, "mInitData.chat");
        return chat;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.d$b */
    static final class C45123b<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ AddChatAdminModel f114244a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f114245b;

        C45123b(AddChatAdminModel dVar, IGetDataCallback iGetDataCallback) {
            this.f114244a = dVar;
            this.f114245b = iGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(SelectMemberInitData selectMemberInitData) {
            this.f114244a.f114103a = selectMemberInitData;
            IGetDataCallback iGetDataCallback = this.f114245b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(selectMemberInitData);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: c */
    public AbstractRunnableC45034a mo159465c(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        SelectMemberInitData selectMemberInitData = this.f114103a;
        Intrinsics.checkExpressionValueIsNotNull(selectMemberInitData, "mInitData");
        IGetDataCallback<SelectBeansResult> b = mo159464b(iGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(b, "getDataCallback(callback)");
        return new AddChatAdminLoader(selectMemberInitData, b);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar) {
        this.f114241h.mo159374a(this.f114109g, mo159466d(), str, mo159462a(bVar));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159434a(Bundle bundle, IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        String string = bundle.getString("key_chat_id");
        this.f114242i = bundle.getInt("key_chat_admin_count", 0);
        C57865c.m224574a(new C45122a(string), new C45123b(this, iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract.IModel
    /* renamed from: a */
    public void mo159614a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "toAddUserIds");
        Intrinsics.checkParameterIsNotNull(list2, "toDelUserIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143759a(str, list, list2, new UIGetDataCallback(iGetDataCallback));
    }
}
