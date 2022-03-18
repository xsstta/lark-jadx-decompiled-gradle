package com.ss.android.lark.contact.impl.invite;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.dto.GetInactiveParentsResponse;
import com.ss.android.lark.contact.entity.InactiveParent;
import com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0018B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IModel;", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView;", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;", "departmentId", "", BottomDialog.f17198f, "model", "view", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IModel;Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView;)V", "getChatterId", "()Ljava/lang/String;", "getDepartmentId", "limit", "", "offset", "create", "", "createViewDelegate", "onActivityResult", "requestCode", "resultCode", "showData", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.invite.d */
public final class InviteInactiveParentListPresenter extends BasePresenter<IInviteInactiveParentListContract.IModel, IInviteInactiveParentListContract.IView, IInviteInactiveParentListContract.IView.Delegate> {

    /* renamed from: b */
    public static final Companion f92946b = new Companion(null);

    /* renamed from: a */
    public int f92947a;

    /* renamed from: c */
    private int f92948c = 20;

    /* renamed from: d */
    private final String f92949d;

    /* renamed from: e */
    private final String f92950e;

    /* renamed from: a */
    public final void mo132273a(int i, int i2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo132275c() {
        return this.f92949d;
    }

    /* renamed from: d */
    public final String mo132276d() {
        return this.f92950e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter$createViewDelegate$1", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;", "isHasMore", "", "onLoadMore", "", "onNotifyAll", "departmentId", "", "chatId", "onNotifySingle", "id", "onReloadData", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.d$b */
    public static final class C35944b implements IInviteInactiveParentListContract.IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListPresenter f92951a;

        @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView.Delegate
        /* renamed from: a */
        public void mo132250a() {
            this.f92951a.mo132272a();
        }

        @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView.Delegate
        /* renamed from: c */
        public void mo132254c() {
            this.f92951a.mo132272a();
        }

        @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView.Delegate
        /* renamed from: b */
        public boolean mo132253b() {
            return ((IInviteInactiveParentListContract.IModel) this.f92951a.getModel()).mo132245a();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter$createViewDelegate$1$onNotifyAll$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "boolean", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.invite.d$b$a */
        public static final class C35945a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C35944b f92952a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35945a(C35944b bVar) {
                this.f92952a = bVar;
            }

            /* renamed from: a */
            public void mo132277a(boolean z) {
                ((IInviteInactiveParentListContract.IView) this.f92952a.f92951a.getView()).mo132249c(true);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo132277a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IInviteInactiveParentListContract.IView) this.f92952a.f92951a.getView()).mo132249c(false);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter$createViewDelegate$1$onNotifySingle$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "boolean", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.invite.d$b$b */
        public static final class C35946b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C35944b f92953a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35946b(C35944b bVar) {
                this.f92953a = bVar;
            }

            /* renamed from: a */
            public void mo132278a(boolean z) {
                ((IInviteInactiveParentListContract.IView) this.f92953a.f92951a.getView()).mo132249c(true);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo132278a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IInviteInactiveParentListContract.IView) this.f92953a.f92951a.getView()).mo132249c(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35944b(InviteInactiveParentListPresenter dVar) {
            this.f92951a = dVar;
        }

        @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView.Delegate
        /* renamed from: a */
        public void mo132251a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            ((IInviteInactiveParentListContract.IModel) this.f92951a.getModel()).mo132244a(this.f92951a.mo132275c(), this.f92951a.mo132276d(), str, new C35946b(this));
        }

        @Override // com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract.IView.Delegate
        /* renamed from: a */
        public void mo132252a(String str, String str2) {
            ((IInviteInactiveParentListContract.IModel) this.f92951a.getModel()).mo132243a(str, str2, new C35945a(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IInviteInactiveParentListContract.IView.Delegate createViewDelegate() {
        return new C35944b(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo132272a();
    }

    /* renamed from: a */
    public final void mo132272a() {
        ((IInviteInactiveParentListContract.IModel) getModel()).mo132242a(this.f92949d, this.f92950e, this.f92948c, this.f92947a, new C35947c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/invite/InviteInactiveParentListPresenter$showData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.d$c */
    public static final class C35947c implements IGetDataCallback<GetInactiveParentsResponse> {

        /* renamed from: a */
        final /* synthetic */ InviteInactiveParentListPresenter f92954a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35947c(InviteInactiveParentListPresenter dVar) {
            this.f92954a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IInviteInactiveParentListContract.IView bVar = (IInviteInactiveParentListContract.IView) this.f92954a.getView();
            if (this.f92954a.f92947a == 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo132247a(z);
        }

        /* renamed from: a */
        public void onSuccess(GetInactiveParentsResponse cVar) {
            boolean z;
            boolean z2 = true;
            if (cVar != null) {
                List<InactiveParent> b = cVar.mo130380b();
                if (b != null && (!b.isEmpty())) {
                    this.f92954a.f92947a += b.size();
                    IInviteInactiveParentListContract.IModel aVar = (IInviteInactiveParentListContract.IModel) this.f92954a.getModel();
                    int i = this.f92954a.f92947a;
                    Boolean a = cVar.mo130379a();
                    if (a != null) {
                        z = a.booleanValue();
                    } else {
                        z = false;
                    }
                    aVar.mo132241a(i, z);
                    IInviteInactiveParentListContract.IView bVar = (IInviteInactiveParentListContract.IView) this.f92954a.getView();
                    if (this.f92954a.f92947a != 0) {
                        z2 = false;
                    }
                    bVar.mo132246a(b, z2);
                    return;
                }
                return;
            }
            IInviteInactiveParentListContract.IView bVar2 = (IInviteInactiveParentListContract.IView) this.f92954a.getView();
            if (this.f92954a.f92947a != 0) {
                z2 = false;
            }
            bVar2.mo132248b(z2);
        }
    }

    public InviteInactiveParentListPresenter(String str, String str2, IInviteInactiveParentListContract.IModel aVar, IInviteInactiveParentListContract.IView bVar) {
        super(aVar, bVar);
        this.f92949d = str;
        this.f92950e = str2;
    }
}
