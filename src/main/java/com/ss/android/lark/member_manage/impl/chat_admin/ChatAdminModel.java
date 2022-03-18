package com.ss.android.lark.member_manage.impl.chat_admin;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
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
import com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J(\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017H\u0016J:\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u001f0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminModel;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageModel;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IModel;", "()V", "curSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ChatChatterSearcher;", "getCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getInitData", "", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "getLoader", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "getSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearcher;", "search", "key", "", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearchResultCallback;", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "updateChatAdmin", "chatId", "toAddUserIds", "", "toDelUserIds", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.c */
public final class ChatAdminModel extends AbstractC45068a implements IChatAdminContract.IModel {

    /* renamed from: h */
    private final C45051a f114267h = new C45051a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: f */
    public AbstractC45054c mo159467f() {
        return this.f114267h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.c$a */
    static final class C45131a<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ String f114268a;

        C45131a(String str) {
            this.f114268a = str;
        }

        /* renamed from: a */
        public final SelectMemberInitData produce() {
            SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            selectMemberInitData.setChat(a.getChatDependency().mo143743a(this.f114268a));
            return selectMemberInitData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.c$b */
    static final class C45132b<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ ChatAdminModel f114269a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f114270b;

        C45132b(ChatAdminModel cVar, IGetDataCallback iGetDataCallback) {
            this.f114269a = cVar;
            this.f114270b = iGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(SelectMemberInitData selectMemberInitData) {
            this.f114269a.f114103a = selectMemberInitData;
            IGetDataCallback iGetDataCallback = this.f114270b;
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
        return new ChatAdminLoader(selectMemberInitData, b);
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar) {
        this.f114267h.mo159374a(this.f114109g, mo159466d(), str, mo159462a(bVar));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159434a(Bundle bundle, IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        C57865c.m224574a(new C45131a(bundle.getString("key_chat_id")), new C45132b(this, iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract.IModel
    /* renamed from: a */
    public void mo159630a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(list, "toAddUserIds");
        Intrinsics.checkParameterIsNotNull(list2, "toDelUserIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        a.getChatDependency().mo143759a(str, list, list2, new UIGetDataCallback(iGetDataCallback));
    }
}
