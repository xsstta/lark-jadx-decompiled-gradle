package com.ss.android.lark.contact.impl.contacts_selector;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorFragment;
import com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract;
import com.ss.android.lark.contact.impl.entity.ContactEntriesResult;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView$Delegate;", "model", "view", "params", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "(Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel;Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView;Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;)V", "hasInitView", "", "changeSingleContactItemVisibility", "", "mask", "", "visible", "createModelDelegate", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel$Delegate;", "createViewDelegate", "getFlagBits", ShareHitPoint.f121869d, "isNeedUpdateDefaultContact", "result", "Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "isNeedUpdateDepartment", "setFlagBits", "value", "updateFlagValue", "updateItemFlag", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.e */
public final class ContactsSelectorPresenter extends BasePresenter<IContactsSelectorContract.IModel, IContactsSelectorContract.IView, IContactsSelectorContract.IView.Delegate> {

    /* renamed from: a */
    public boolean f92470a;

    /* renamed from: b */
    public final ContactsSelectorFragment.Builder f92471b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IContactsSelectorContract.IView.Delegate createViewDelegate() {
        return null;
    }

    /* renamed from: b */
    private final IContactsSelectorContract.IModel.Delegate m139978b() {
        return new C35767a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorPresenter$createModelDelegate$1", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel$Delegate;", "onGetLocalContactEntryResult", "", "result", "Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "onGetServerContactEntryResult", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.e$a */
    public static final class C35767a implements IContactsSelectorContract.IModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ ContactsSelectorPresenter f92472a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35767a(ContactsSelectorPresenter eVar) {
            this.f92472a = eVar;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IModel.Delegate
        /* renamed from: a */
        public void mo131647a(ContactEntriesResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            if (!this.f92472a.f92470a) {
                this.f92472a.f92470a = true;
                if (aVar.mo132089a()) {
                    this.f92472a.mo131644a(aVar);
                }
                IContactsSelectorContract.IView cVar = (IContactsSelectorContract.IView) this.f92472a.getView();
                if (cVar != null) {
                    cVar.mo131539a(this.f92472a.f92471b, aVar.mo132089a());
                }
            }
        }

        @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IModel.Delegate
        /* renamed from: b */
        public void mo131648b(ContactEntriesResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            if (!this.f92472a.f92470a) {
                this.f92472a.f92470a = true;
                if (aVar.mo132089a()) {
                    this.f92472a.mo131644a(aVar);
                }
                IContactsSelectorContract.IView cVar = (IContactsSelectorContract.IView) this.f92472a.getView();
                if (cVar != null) {
                    cVar.mo131539a(this.f92472a.f92471b, aVar.mo132089a());
                }
            } else if (aVar.mo132089a()) {
                boolean b = this.f92472a.mo131645b(aVar);
                boolean c = this.f92472a.mo131646c(aVar);
                if (c || b) {
                    this.f92472a.mo131644a(aVar);
                    IContactsSelectorContract.IView cVar2 = (IContactsSelectorContract.IView) this.f92472a.getView();
                    if (cVar2 != null) {
                        cVar2.mo131540a(this.f92472a.f92471b, b, c);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m139977a(int i) {
        if ((this.f92471b.mo131577b() & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo131646c(ContactEntriesResult aVar) {
        if (this.f92471b.mo131585d() && !aVar.mo132094f()) {
            return true;
        }
        if (this.f92471b.mo131587e() && !aVar.mo132095g()) {
            return true;
        }
        if (!this.f92471b.mo131589f() || aVar.mo132096h()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo131644a(ContactEntriesResult aVar) {
        boolean z;
        boolean z2;
        ContactsSelectorFragment.Builder aVar2 = this.f92471b;
        boolean z3 = false;
        if (!aVar2.mo131585d() || !aVar.mo132094f()) {
            z = false;
        } else {
            z = true;
        }
        aVar2.mo131595i(z);
        ContactsSelectorFragment.Builder aVar3 = this.f92471b;
        if (!aVar3.mo131587e() || !aVar.mo132095g()) {
            z2 = false;
        } else {
            z2 = true;
        }
        aVar3.mo131596j(z2);
        ContactsSelectorFragment.Builder aVar4 = this.f92471b;
        if (aVar4.mo131589f() && aVar.mo132096h()) {
            z3 = true;
        }
        aVar4.mo131598k(z3);
        m139979b(16, aVar.mo132093e());
        m139979b(1, aVar.mo132090b());
        m139979b(2, aVar.mo132091c());
        m139979b(8, aVar.mo132092d());
        m139979b(DynamicModule.f58006b, aVar.mo132097i());
    }

    /* renamed from: b */
    public final boolean mo131645b(ContactEntriesResult aVar) {
        if (m139977a(16) && !aVar.mo132093e()) {
            return true;
        }
        if (m139977a(1) && !aVar.mo132090b()) {
            return true;
        }
        if (m139977a(2) && !aVar.mo132091c()) {
            return true;
        }
        if (m139977a(8) && !aVar.mo132092d()) {
            return true;
        }
        if (!m139977a(DynamicModule.f58006b) || aVar.mo132097i()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m139980c(int i, boolean z) {
        int i2;
        ContactsSelectorFragment.Builder aVar = this.f92471b;
        if (z) {
            i2 = i | aVar.mo131577b();
        } else {
            i2 = (~i) & aVar.mo131577b();
        }
        aVar.mo131574a(i2);
    }

    /* renamed from: a */
    public final void mo131643a(int i, boolean z) {
        m139980c(i, z);
        this.f92471b.mo131598k(z);
        IContactsSelectorContract.IView cVar = (IContactsSelectorContract.IView) getView();
        if (cVar != null) {
            cVar.mo131540a(this.f92471b, true, true);
        }
    }

    /* renamed from: b */
    private final void m139979b(int i, boolean z) {
        if (!z && m139977a(i)) {
            if (i == 1) {
                this.f92471b.mo131573a(false);
            } else if (i == 2) {
                this.f92471b.mo131579b(false);
            } else if (i == 8) {
                this.f92471b.mo131582c(false);
            } else if (i == 16) {
                this.f92471b.mo131586e(false);
            } else if (i == 256) {
                this.f92471b.mo131591g(false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactsSelectorPresenter(IContactsSelectorContract.IModel bVar, IContactsSelectorContract.IView cVar, ContactsSelectorFragment.Builder aVar) {
        super(bVar, cVar);
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        this.f92471b = aVar;
        bVar.mo131637a(m139978b());
        IContactsSelectorContract.IModel bVar2 = (IContactsSelectorContract.IModel) getModel();
        if (bVar2 != null) {
            bVar2.mo131636a();
        }
        IContactsSelectorContract.IModel bVar3 = (IContactsSelectorContract.IModel) getModel();
        if (bVar3 != null) {
            bVar3.mo131639b();
        }
    }
}
