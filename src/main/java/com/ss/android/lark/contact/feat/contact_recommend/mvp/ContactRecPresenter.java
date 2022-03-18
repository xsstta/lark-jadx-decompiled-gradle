package com.ss.android.lark.contact.feat.contact_recommend.mvp;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u000f\u0010B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0014J\u0006\u0010\u000e\u001a\u00020\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IModel;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView$IViewDelegate;", "model", "view", "(Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IModel;Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView;)V", "changItemToApplied", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "create", "createViewDelegate", "loadData", "Companion", "ViewDelegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.b */
public final class ContactRecPresenter extends BasePresenter<IContactRecContact.IModel, IContactRecContact.IView, IContactRecContact.IView.IViewDelegate> {

    /* renamed from: a */
    public static final Companion f91553a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecPresenter$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecPresenter$ViewDelegate;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IView$IViewDelegate;", "(Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecPresenter;)V", "reloadData", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.b$b */
    public final class ViewDelegate implements IContactRecContact.IView.IViewDelegate {
        @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact.IView.IViewDelegate
        /* renamed from: a */
        public void mo130713a() {
            ContactRecPresenter.this.mo130712b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IContactRecContact.IView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo130712b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecPresenter$loadData$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", "contactAddData", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.b$c */
    public static final class C35420c extends UIGetDataCallback<List<? extends ContactRecData>> {

        /* renamed from: a */
        final /* synthetic */ ContactRecPresenter f91555a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.feat.a.b.b$c$a */
        static final class RunnableC35421a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35420c f91556a;

            RunnableC35421a(C35420c cVar) {
                this.f91556a = cVar;
            }

            public final void run() {
                IContactRecContact.IView bVar = (IContactRecContact.IView) this.f91556a.f91555a.getView();
                if (bVar != null) {
                    bVar.mo130721d();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.feat.a.b.b$c$b */
        public static final class RunnableC35422b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35420c f91557a;

            /* renamed from: b */
            final /* synthetic */ List f91558b;

            RunnableC35422b(C35420c cVar, List list) {
                this.f91557a = cVar;
                this.f91558b = list;
            }

            public final void run() {
                IContactRecContact.IView bVar = (IContactRecContact.IView) this.f91557a.f91555a.getView();
                if (bVar != null) {
                    bVar.mo130719a(this.f91558b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35420c(ContactRecPresenter bVar) {
            this.f91555a = bVar;
        }

        /* renamed from: a */
        public void onSuccessed(List<ContactRecData> list) {
            UICallbackExecutor.executeDelayed(new RunnableC35422b(this, list), 660);
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            UICallbackExecutor.executeDelayed(new RunnableC35421a(this), 660);
            Log.m165384e("ContactRecPresenter", "loadData error", errorResult);
        }
    }

    /* renamed from: b */
    public final void mo130712b() {
        IContactRecContact.IView bVar = (IContactRecContact.IView) getView();
        if (bVar != null) {
            bVar.mo130717a();
        }
        IContactRecContact.IModel aVar = (IContactRecContact.IModel) getModel();
        if (aVar != null) {
            aVar.mo130682a(new C35420c(this));
        }
    }

    /* renamed from: a */
    public final void mo130711a(ContactRecData aVar) {
        if (aVar != null) {
            aVar.mo130671a(true);
            IContactRecContact.IView bVar = (IContactRecContact.IView) getView();
            if (bVar != null) {
                bVar.mo130718a(aVar);
            }
        }
    }

    public ContactRecPresenter(IContactRecContact.IModel aVar, IContactRecContact.IView bVar) {
        super(aVar, bVar);
    }
}
