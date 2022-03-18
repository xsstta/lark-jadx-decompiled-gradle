package com.ss.android.lark.member_manage.impl.chat_admin;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0015\u0016B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0006\u0010\u0014\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IModel;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView$Delegate;", "model", "view", "bundle", "Landroid/os/Bundle;", "(Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IModel;Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView;Landroid/os/Bundle;)V", "functionType", "", "functionType$annotations", "()V", "isRemove", "", "viewDelegate", "create", "", "createViewDelegate", "loadMembers", "ChatAdminViewDelegate", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d */
public final class ChatAdminPresenter extends BasePresenter<IChatAdminContract.IModel, IChatAdminContract.IView, IChatAdminContract.IView.Delegate> {

    /* renamed from: c */
    public static final Companion f114271c = new Companion(null);

    /* renamed from: a */
    public final boolean f114272a;

    /* renamed from: b */
    public int f114273b = 2;

    /* renamed from: d */
    private IChatAdminContract.IView.Delegate f114274d;

    /* renamed from: e */
    private final Bundle f114275e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter$Companion;", "", "()V", "LOG_TAG", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter$loadMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "members", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d$d */
    public static final class C45134d implements IGetDataCallback<SelectBeansResult> {

        /* renamed from: a */
        final /* synthetic */ ChatAdminPresenter f114280a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d$d$a */
        public static final class RunnableC45135a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45134d f114281a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f114282b;

            RunnableC45135a(C45134d dVar, ErrorResult errorResult) {
                this.f114281a = dVar;
                this.f114282b = errorResult;
            }

            public final void run() {
                ((IChatAdminContract.IView) this.f114281a.f114280a.getView()).mo159393a(this.f114282b.getDisplayMsg());
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d$d$b */
        public static final class RunnableC45136b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45134d f114283a;

            /* renamed from: b */
            final /* synthetic */ SelectBeansResult f114284b;

            RunnableC45136b(C45134d dVar, SelectBeansResult dVar2) {
                this.f114283a = dVar;
                this.f114284b = dVar2;
            }

            public final void run() {
                ((IChatAdminContract.IView) this.f114283a.f114280a.getView()).mo159449d(this.f114284b);
                if (this.f114283a.f114280a.f114272a) {
                    ((IChatAdminContract.IView) this.f114283a.f114280a.getView()).mo159643l();
                    this.f114283a.f114280a.f114273b = 1;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45134d(ChatAdminPresenter dVar) {
            this.f114280a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectBeansResult dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "members");
            UICallbackExecutor.execute(new RunnableC45136b(this, dVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC45135a(this, errorResult));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter$ChatAdminViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView$Delegate;", "view", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView;", "model", "Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IModel;", "(Lcom/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter;Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IView;Lcom/ss/android/lark/member_manage/impl/chat_admin/IChatAdminContract$IModel;)V", "onChatAdminUpdated", "", "chatId", "", "toAddUserIds", "", "toDelUserIds", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onConfirmButtonClicked", "onSingleItemClick", "selectBean", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onTitleRightButtonClick", "onUnSelectableItemClick", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d$a */
    public final class ChatAdminViewDelegate extends AbstractC45074b implements IChatAdminContract.IView.Delegate {

        /* renamed from: c */
        final /* synthetic */ ChatAdminPresenter f114276c;

        /* renamed from: d */
        private final IChatAdminContract.IView f114277d;

        /* renamed from: e */
        private final IChatAdminContract.IModel f114278e;

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: d */
        public void mo159458d(C45084c cVar) {
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: f */
        public void mo159461f() {
            if (this.f114276c.f114273b == 2) {
                this.f114276c.f114273b = 1;
                this.f114277d.mo159643l();
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: e */
        public void mo159460e() {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f114278e.mo159441c().values()) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                C45085e g = t.mo159512g();
                Intrinsics.checkExpressionValueIsNotNull(g, "it.chatterInfo");
                String a = g.mo159522a();
                if (a != null) {
                    arrayList.add(a);
                }
            }
            this.f114277d.mo159641a(CollectionsKt.emptyList(), arrayList);
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: c */
        public void mo159456c(C45084c cVar) {
            boolean z;
            if (cVar != null && cVar.mo159513h() != null && this.f114276c.f114273b == 2) {
                IChatAdminContract.IView bVar = this.f114277d;
                Chatter chatter = new Chatter();
                chatter.setId(cVar.mo159513h());
                C45085e g = cVar.mo159512g();
                if (g != null) {
                    z = g.mo159540n();
                } else {
                    z = false;
                }
                chatter.setAnonymous(z);
                bVar.mo159388a(chatter);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChatAdminViewDelegate(ChatAdminPresenter dVar, IChatAdminContract.IView bVar, IChatAdminContract.IModel aVar) {
            super(bVar, aVar);
            Intrinsics.checkParameterIsNotNull(bVar, "view");
            Intrinsics.checkParameterIsNotNull(aVar, "model");
            this.f114276c = dVar;
            this.f114277d = bVar;
            this.f114278e = aVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.chat_admin.IChatAdminContract.IView.Delegate
        /* renamed from: a */
        public void mo159635a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(list, "toAddUserIds");
            Intrinsics.checkParameterIsNotNull(list2, "toDelUserIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f114278e.mo159630a(str, list, list2, iGetDataCallback);
        }
    }

    /* renamed from: b */
    public final void mo159634b() {
        ((IChatAdminContract.IModel) getModel()).mo159435a(new C45134d(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IChatAdminContract.IModel) getModel()).mo159434a(this.f114275e, new C45133c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IChatAdminContract.IView.Delegate createViewDelegate() {
        IChatAdminContract.IView bVar = (IChatAdminContract.IView) getView();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "view");
        IChatAdminContract.IModel aVar = (IChatAdminContract.IModel) getModel();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
        ChatAdminViewDelegate aVar2 = new ChatAdminViewDelegate(this, bVar, aVar);
        this.f114274d = aVar2;
        if (aVar2 != null) {
            return aVar2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.member_manage.impl.chat_admin.ChatAdminPresenter.ChatAdminViewDelegate");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/ChatAdminPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "selectMemberInitData", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.d$c */
    public static final class C45133c implements IGetDataCallback<SelectMemberInitData> {

        /* renamed from: a */
        final /* synthetic */ ChatAdminPresenter f114279a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45133c(ChatAdminPresenter dVar) {
            this.f114279a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectMemberInitData selectMemberInitData) {
            Intrinsics.checkParameterIsNotNull(selectMemberInitData, "selectMemberInitData");
            ((IChatAdminContract.IView) this.f114279a.getView()).mo159447a(selectMemberInitData.getChat());
            this.f114279a.mo159634b();
        }
    }

    public ChatAdminPresenter(IChatAdminContract.IModel aVar, IChatAdminContract.IView bVar, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        this.f114275e = bundle;
        this.f114272a = bundle.getBoolean("keu.is.remove", false);
        setModel(aVar);
        setView(bVar);
        ((IChatAdminContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
