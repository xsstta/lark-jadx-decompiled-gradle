package com.ss.android.lark.contact.impl.contacts_email.mvp;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29583s;
import com.ss.android.lark.contact.dto.C35392a;
import com.ss.android.lark.contact.entity.EmailContact;
import com.ss.android.lark.contact.impl.contacts_email.entity.BusinessCardViewData;
import com.ss.android.lark.contact.impl.contacts_email.entity.GetBusinessCardResult;
import com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 !2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002!\"B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0016J\u0014\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100 R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IModel;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView$Delegage;", "model", "view", "(Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IModel;Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView;)V", "mOnItemSelectedListener", "Lcom/ss/android/lark/biz/core/api/IEmailContactController$IOnItemSelectedListener;", "getMOnItemSelectedListener", "()Lcom/ss/android/lark/biz/core/api/IEmailContactController$IOnItemSelectedListener;", "setMOnItemSelectedListener", "(Lcom/ss/android/lark/biz/core/api/IEmailContactController$IOnItemSelectedListener;)V", "mSelectedMemberList", "", "", "getMSelectedMemberList", "()Ljava/util/List;", "setMSelectedMemberList", "(Ljava/util/List;)V", "create", "", "createViewDelegate", "init", "parseViewData", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "businessCardsResponse", "Lcom/ss/android/lark/contact/dto/BusinessCardsResponse;", "refershCardList", "setSelectedView", "values", "", "Companion", "ViewDelegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.b */
public final class BusinessCardsPresenter extends BasePresenter<IBusinessCardsContract.IModel, IBusinessCardsContract.IView, IBusinessCardsContract.IView.Delegage> {

    /* renamed from: a */
    public static final Companion f91990a = new Companion(null);

    /* renamed from: b */
    private AbstractC29583s.AbstractC29584a f91991b;

    /* renamed from: c */
    private List<String> f91992c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter$Companion;", "", "()V", "INITIAL_OFFSET", "", "TAG", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC29583s.AbstractC29584a mo131169a() {
        return this.f91991b;
    }

    /* renamed from: b */
    public final List<String> mo131173b() {
        return this.f91992c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public IBusinessCardsContract.IView.Delegage createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m139205e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter$ViewDelegate;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView$Delegage;", "(Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter;)V", "canLoadMore", "", "deleteSingleNamecard", "", "card", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "onItemClicked", "checked", "position", "", "onLoadMore", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.b$b */
    public final class ViewDelegate implements IBusinessCardsContract.IView.Delegage {
        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView.Delegage
        /* renamed from: a */
        public boolean mo131178a() {
            return ((IBusinessCardsContract.IModel) BusinessCardsPresenter.this.getModel()).mo131165a();
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView.Delegage
        /* renamed from: b */
        public void mo131180b() {
            ((IBusinessCardsContract.IModel) BusinessCardsPresenter.this.getModel()).mo131161a(new UIGetDataCallback(new C35566b(this)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter$ViewDelegate$onLoadMore$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/BusinessCardsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.b$b$b */
        public static final class C35566b implements IGetDataCallback<C35392a> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f91996a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35566b(ViewDelegate bVar) {
                this.f91996a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(C35392a aVar) {
                if (aVar != null) {
                    ((IBusinessCardsContract.IModel) BusinessCardsPresenter.this.getModel()).mo131162a(aVar);
                    ((IBusinessCardsContract.IView) BusinessCardsPresenter.this.getView()).mo131154c();
                    ((IBusinessCardsContract.IView) BusinessCardsPresenter.this.getView()).mo131155c(BusinessCardsPresenter.this.mo131170a(aVar));
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IBusinessCardsContract.IView) BusinessCardsPresenter.this.getView()).mo131154c();
                Log.m165383e("BusinessCardsPresenter", "business card load more failed: " + errorResult);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter$ViewDelegate$deleteSingleNamecard$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.b$b$a */
        public static final class C35565a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f91994a;

            /* renamed from: b */
            final /* synthetic */ BusinessCardViewData f91995b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                String string = UIHelper.getString(R.string.Lark_Contacts_DeletedToast);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…rk_Contacts_DeletedToast)");
                ((IBusinessCardsContract.IView) BusinessCardsPresenter.this.getView()).mo131149a(string);
                ((IBusinessCardsContract.IView) BusinessCardsPresenter.this.getView()).mo131152b(this.f91995b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String string = UIHelper.getString(R.string.Lark_Contacts_UnableToDeleteToast);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…acts_UnableToDeleteToast)");
                ((IBusinessCardsContract.IView) BusinessCardsPresenter.this.getView()).mo131149a(string);
                Log.m165397w("BusinessCardsPresenter", "deleteSingleNamecard failed, errCode: " + errorResult.getErrorCode() + ", tip: " + errorResult.getDisplayMsg());
            }

            C35565a(ViewDelegate bVar, BusinessCardViewData aVar) {
                this.f91994a = bVar;
                this.f91995b = aVar;
            }
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView.Delegage
        /* renamed from: a */
        public void mo131177a(BusinessCardViewData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "card");
            ((IBusinessCardsContract.IModel) BusinessCardsPresenter.this.getModel()).mo131164a(aVar.mo130995a(), new UIGetDataCallback(new C35565a(this, aVar)));
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IView.Delegage
        /* renamed from: a */
        public boolean mo131179a(BusinessCardViewData aVar, boolean z, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "card");
            AbstractC29583s.AbstractC29584a a = BusinessCardsPresenter.this.mo131169a();
            if (a != null) {
                return a.mo102945a(new EmailContact(aVar.mo130995a(), aVar.mo131002d(), aVar.mo130998b(), aVar.mo131004e()), z, i);
            }
            return false;
        }
    }

    /* renamed from: d */
    public final void mo131176d() {
        ((IBusinessCardsContract.IModel) getModel()).mo131163a("0");
        m139205e();
    }

    /* renamed from: e */
    private final void m139205e() {
        ((IBusinessCardsContract.IModel) getModel()).mo131161a(new UIGetDataCallback(new C35567c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsPresenter$init$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/BusinessCardsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.b$c */
    public static final class C35567c implements IGetDataCallback<C35392a> {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsPresenter f91997a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35567c(BusinessCardsPresenter bVar) {
            this.f91997a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(C35392a aVar) {
            if (aVar != null) {
                ((IBusinessCardsContract.IModel) this.f91997a.getModel()).mo131162a(aVar);
                if (!"0".equals(((IBusinessCardsContract.IModel) this.f91997a.getModel()).mo131166b()) || !CollectionUtils.isEmpty(aVar.mo130365a())) {
                    ((IBusinessCardsContract.IView) this.f91997a.getView()).mo131153b(this.f91997a.mo131170a(aVar));
                } else {
                    ((IBusinessCardsContract.IView) this.f91997a.getView()).mo131156d();
                }
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IBusinessCardsContract.IView) this.f91997a.getView()).mo131156d();
            String string = UIHelper.getString(R.string.Lark_Legacy_FailedtoLoadTryLater);
            IBusinessCardsContract.IView bVar = (IBusinessCardsContract.IView) this.f91997a.getView();
            String displayMsg = errorResult.getDisplayMsg();
            if (displayMsg != null) {
                string = displayMsg;
            } else {
                Intrinsics.checkExpressionValueIsNotNull(string, "defaultTip");
            }
            bVar.mo131149a(string);
            Log.m165383e("BusinessCardsPresenter", "business cards init failed: " + errorResult.getDisplayMsg());
        }
    }

    /* renamed from: a */
    public final void mo131171a(AbstractC29583s.AbstractC29584a aVar) {
        this.f91991b = aVar;
    }

    /* renamed from: a */
    public final void mo131172a(List<String> list) {
        this.f91992c = list;
    }

    /* renamed from: b */
    public final void mo131174b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        this.f91992c = list;
        ((IBusinessCardsContract.IView) getView()).mo131150a(this.f91992c);
    }

    /* renamed from: a */
    public final List<BusinessCardViewData> mo131170a(C35392a aVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<GetBusinessCardResult> a = aVar.mo130365a();
        if (a != null) {
            for (T t : a) {
                BusinessCardViewData aVar2 = new BusinessCardViewData();
                String a2 = t.mo131007a();
                if (a2 == null) {
                    a2 = t.mo131019f();
                }
                String str = "";
                if (a2 == null) {
                    a2 = str;
                }
                aVar2.mo130996a(a2);
                String b = t.mo131011b();
                if (b == null) {
                    b = str;
                }
                aVar2.mo130999b(b);
                aVar2.mo131001c(t.mo131013c());
                String i = t.mo131025i();
                if (i == null) {
                    i = str;
                }
                aVar2.mo131003d(i);
                String f = t.mo131019f();
                if (f != null) {
                    str = f;
                }
                aVar2.mo131005e(str);
                List<String> list = this.f91992c;
                if (list != null) {
                    z = list.contains(aVar2.mo130995a());
                } else {
                    z = false;
                }
                aVar2.mo130997a(z);
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessCardsPresenter(IBusinessCardsContract.IModel aVar, IBusinessCardsContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
    }
}
