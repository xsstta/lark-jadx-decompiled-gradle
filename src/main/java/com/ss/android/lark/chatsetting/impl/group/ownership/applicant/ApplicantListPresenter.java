package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.app.Activity;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListView;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0013B-\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView$Delegate;", "chatId", "", "activity", "Landroid/app/Activity;", "rootView", "Landroid/view/View;", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$ViewDependency;", "isThread", "", "(Ljava/lang/String;Landroid/app/Activity;Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListView$ViewDependency;Z)V", "create", "", "createViewDelegate", "ViewDelegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e */
public final class ApplicantListPresenter extends BasePresenter<IApplicantListContract.IModel, IApplicantListContract.IView, IApplicantListContract.IView.Delegate> {

    /* renamed from: a */
    public final String f89574a;

    /* renamed from: b */
    private final Activity f89575b;

    /* renamed from: c */
    private final View f89576c;

    /* renamed from: d */
    private final ApplicantListView.ViewDependency f89577d;

    /* renamed from: e */
    private final boolean f89578e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IApplicantListContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter$ViewDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/IApplicantListContract$IView$Delegate;", "(Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter;)V", "hasMore", "", "onCloseBtnClick", "", "position", "", "id", "", "onDoneBtnClick", "onLoadMoreData", "onSwitchBtnCheckedChange", "isChecked", "onUserClick", "userId", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e$a */
    public final class ViewDelegate implements IApplicantListContract.IView.Delegate {
        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView.Delegate
        /* renamed from: a */
        public boolean mo128112a() {
            return ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128102c();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView.Delegate
        /* renamed from: b */
        public void mo128113b() {
            ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128101b(new C34697c(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter$ViewDelegate$onLoadMoreData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e$a$c */
        public static final class C34697c implements IGetDataCallback<List<? extends ApplicantViewData>> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89584a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C34697c(ViewDelegate aVar) {
                this.f89584a = aVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165382e(errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(List<ApplicantViewData> list) {
                Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128126a(list);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter$ViewDelegate$onSwitchBtnCheckedChange$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e$a$d */
        public static final class C34698d implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89585a;

            /* renamed from: b */
            final /* synthetic */ boolean f89586b;

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128120a();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128127a(!this.f89586b);
                Log.m165382e(errorResult.toString());
            }

            C34698d(ViewDelegate aVar, boolean z) {
                this.f89585a = aVar;
                this.f89586b = z;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter$ViewDelegate$onCloseBtnClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e$a$a */
        public static final class C34695a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89580a;

            /* renamed from: b */
            final /* synthetic */ String f89581b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128124a(this.f89581b);
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128121a(R.string.Lark_Group_DeclineJoinGroupRequestToast);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165382e(errorResult.toString());
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128121a(R.string.Lark_Legacy_MembershipRequestAlreadyDone);
            }

            C34695a(ViewDelegate aVar, String str) {
                this.f89580a = aVar;
                this.f89581b = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter$ViewDelegate$onDoneBtnClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e$a$b */
        public static final class C34696b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f89582a;

            /* renamed from: b */
            final /* synthetic */ String f89583b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128124a(this.f89583b);
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128121a(R.string.Lark_Group_ApproveJoinGroupRequestToast);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165382e(errorResult.toString());
                ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128121a(R.string.Lark_Legacy_MembershipRequestAlreadyDone);
            }

            C34696b(ViewDelegate aVar, String str) {
                this.f89582a = aVar;
                this.f89583b = str;
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView.Delegate
        /* renamed from: a */
        public void mo128110a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            ((IApplicantListContract.IView) ApplicantListPresenter.this.getView()).mo128125a(str, ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128096a());
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView.Delegate
        /* renamed from: a */
        public void mo128111a(boolean z) {
            OwnershipHitPoint.f90525a.mo129287a(z);
            Chat b = ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128100b();
            if (b != null) {
                OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
                int memberCount = b.getMemberCount();
                String id = b.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "it.getId()");
                aVar.mo129283a(3, z, memberCount, id);
            }
            ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128099a(z, new C34698d(this, z));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView.Delegate
        /* renamed from: a */
        public void mo128109a(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            OwnershipHitPoint.f90525a.mo129293c();
            ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128098a(ApplicantListPresenter.this.f89574a, str, false, new C34695a(this, str));
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.ownership.applicant.IApplicantListContract.IView.Delegate
        /* renamed from: b */
        public void mo128114b(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            OwnershipHitPoint.f90525a.mo129290b();
            ((IApplicantListContract.IModel) ApplicantListPresenter.this.getModel()).mo128098a(ApplicantListPresenter.this.f89574a, str, true, new C34696b(this, str));
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IApplicantListContract.IModel) getModel()).mo128097a(new C34699b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplicantListPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/InitData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.e$b */
    public static final class C34699b implements IGetDataCallback<InitData> {

        /* renamed from: a */
        final /* synthetic */ ApplicantListPresenter f89587a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34699b(ApplicantListPresenter eVar) {
            this.f89587a = eVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e(errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(InitData kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((IApplicantListContract.IView) this.f89587a.getView()).mo128123a(kVar);
        }
    }

    public ApplicantListPresenter(String str, Activity activity, View view, ApplicantListView.ViewDependency aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f89574a = str;
        this.f89575b = activity;
        this.f89576c = view;
        this.f89577d = aVar;
        this.f89578e = z;
        setModel(new ApplicantListModel(str));
        setView(new ApplicantListView(activity, view, aVar, z));
        ((IApplicantListContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
