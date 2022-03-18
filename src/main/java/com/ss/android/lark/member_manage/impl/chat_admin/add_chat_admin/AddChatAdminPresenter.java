package com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.C45085e;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u000f\u0010B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IModel;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView$Delegate;", "model", "view", "bundle", "Landroid/os/Bundle;", "(Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IModel;Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView;Landroid/os/Bundle;)V", "viewDelegate", "create", "", "createViewDelegate", "loadMembers", "AddChatAdminViewDelegate", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e */
public final class AddChatAdminPresenter extends BasePresenter<IAddChatAdminContract.IModel, IAddChatAdminContract.IView, IAddChatAdminContract.IView.Delegate> {

    /* renamed from: a */
    public static final Companion f114246a = new Companion(null);

    /* renamed from: b */
    private IAddChatAdminContract.IView.Delegate f114247b;

    /* renamed from: c */
    private final Bundle f114248c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter$Companion;", "", "()V", "CHAT_MEMBER_COUNT_THRESHOLD", "", "MAX_LARGE_CHAT_ADMIN_COUNT", "MAX_NORMAL_CHAT_ADMIN_COUNT", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter$loadMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "members", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e$d */
    public static final class C45125d implements IGetDataCallback<SelectBeansResult> {

        /* renamed from: a */
        final /* synthetic */ AddChatAdminPresenter f114253a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e$d$b */
        public static final class RunnableC45127b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45125d f114256a;

            /* renamed from: b */
            final /* synthetic */ SelectBeansResult f114257b;

            RunnableC45127b(C45125d dVar, SelectBeansResult dVar2) {
                this.f114256a = dVar;
                this.f114257b = dVar2;
            }

            public final void run() {
                ((IAddChatAdminContract.IView) this.f114256a.f114253a.getView()).mo159449d(this.f114257b);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e$d$a */
        public static final class RunnableC45126a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45125d f114254a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f114255b;

            RunnableC45126a(C45125d dVar, ErrorResult errorResult) {
                this.f114254a = dVar;
                this.f114255b = errorResult;
            }

            public final void run() {
                ((IAddChatAdminContract.IView) this.f114254a.f114253a.getView()).mo159393a(this.f114255b.getDisplayMsg());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45125d(AddChatAdminPresenter eVar) {
            this.f114253a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectBeansResult dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "members");
            UICallbackExecutor.execute(new RunnableC45127b(this, dVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC45126a(this, errorResult));
        }
    }

    /* renamed from: b */
    public final void mo159620b() {
        ((IAddChatAdminContract.IModel) getModel()).mo159435a(new C45125d(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IAddChatAdminContract.IModel) getModel()).mo159434a(this.f114248c, new C45124c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IAddChatAdminContract.IView.Delegate createViewDelegate() {
        IAddChatAdminContract.IView bVar = (IAddChatAdminContract.IView) getView();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "view");
        IAddChatAdminContract.IModel aVar = (IAddChatAdminContract.IModel) getModel();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
        AddChatAdminViewDelegate aVar2 = new AddChatAdminViewDelegate(this, bVar, aVar);
        this.f114247b = aVar2;
        if (aVar2 != null) {
            return aVar2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.AddChatAdminPresenter.AddChatAdminViewDelegate");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J:\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter$AddChatAdminViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseViewDelegate;", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView$Delegate;", "view", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView;", "model", "Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IModel;", "(Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter;Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IView;Lcom/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/IAddChatAdminContract$IModel;)V", "onChatAdminUpdated", "", "chatId", "", "toAddUserIds", "", "toDelUserIds", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onConfirmButtonClicked", "onMultiItemSelected", "selectBean", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "isSelected", "onSingleItemClick", "onTitleRightButtonClick", "onUnSelectableItemClick", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e$a */
    public final class AddChatAdminViewDelegate extends AbstractC45074b implements IAddChatAdminContract.IView.Delegate {

        /* renamed from: c */
        final /* synthetic */ AddChatAdminPresenter f114249c;

        /* renamed from: d */
        private final IAddChatAdminContract.IView f114250d;

        /* renamed from: e */
        private final IAddChatAdminContract.IModel f114251e;

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: c */
        public void mo159456c(C45084c cVar) {
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: d */
        public void mo159458d(C45084c cVar) {
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: f */
        public void mo159461f() {
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a
        /* renamed from: e */
        public void mo159460e() {
            String str;
            ArrayList arrayList = new ArrayList();
            for (T t : this.f114251e.mo159441c().values()) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                C45085e g = t.mo159512g();
                if (g != null) {
                    str = g.mo159522a();
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            this.f114250d.mo159626a(arrayList, CollectionsKt.emptyList());
        }

        @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a, com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45074b
        /* renamed from: a */
        public void mo159452a(C45084c cVar, boolean z) {
            int i;
            if (this.f114251e.mo159615j().getMemberCount() <= 5000) {
                i = 10;
            } else {
                i = 20;
            }
            if (!z || this.f114251e.mo159616k() + this.f114251e.mo159441c().size() < i) {
                super.mo159452a(cVar, z);
                return;
            }
            this.f114250d.mo159410d(UIHelper.getQuantityString(R.plurals.Lark_Legacy_MaxGroupAdmins, i));
            super.mo159452a(cVar, false);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddChatAdminViewDelegate(AddChatAdminPresenter eVar, IAddChatAdminContract.IView bVar, IAddChatAdminContract.IModel aVar) {
            super(bVar, aVar);
            Intrinsics.checkParameterIsNotNull(bVar, "view");
            Intrinsics.checkParameterIsNotNull(aVar, "model");
            this.f114249c = eVar;
            this.f114250d = bVar;
            this.f114251e = aVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.IAddChatAdminContract.IView.Delegate
        /* renamed from: a */
        public void mo159621a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(list, "toAddUserIds");
            Intrinsics.checkParameterIsNotNull(list2, "toDelUserIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f114251e.mo159614a(str, list, list2, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/chat_admin/add_chat_admin/AddChatAdminPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "selectMemberInitData", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.chat_admin.add_chat_admin.e$c */
    public static final class C45124c implements IGetDataCallback<SelectMemberInitData> {

        /* renamed from: a */
        final /* synthetic */ AddChatAdminPresenter f114252a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45124c(AddChatAdminPresenter eVar) {
            this.f114252a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectMemberInitData selectMemberInitData) {
            Intrinsics.checkParameterIsNotNull(selectMemberInitData, "selectMemberInitData");
            ((IAddChatAdminContract.IView) this.f114252a.getView()).mo159447a(selectMemberInitData.getChat());
            this.f114252a.mo159620b();
        }
    }

    public AddChatAdminPresenter(IAddChatAdminContract.IModel aVar, IAddChatAdminContract.IView bVar, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        this.f114248c = bundle;
        setModel(aVar);
        setView(bVar);
        ((IAddChatAdminContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
