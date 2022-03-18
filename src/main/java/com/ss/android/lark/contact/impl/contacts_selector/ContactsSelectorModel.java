package com.ss.android.lark.contact.impl.contacts_selector;

import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract;
import com.ss.android.lark.contact.impl.entity.ContactEntriesResult;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorModel;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel;", "()V", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mContactService", "Lcom/ss/android/lark/contact/impl/interfaces/IContactServiceInternal;", "getMContactService", "()Lcom/ss/android/lark/contact/impl/interfaces/IContactServiceInternal;", "setMContactService", "(Lcom/ss/android/lark/contact/impl/interfaces/IContactServiceInternal;)V", "modelDelegate", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel$Delegate;", "create", "", "destroy", "invokeCallbackUIThread", "result", "Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "isFromServer", "", "requestContactEntryList", "syncDataStrategy", "Lcom/bytedance/lark/pb/basic/v1/SyncDataStrategy;", "requestContactEntryListFromLocal", "requestContactEntryListFromServer", "setModelDelegate", "delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.d */
public final class ContactsSelectorModel implements IContactsSelectorContract.IModel {

    /* renamed from: a */
    public IContactsSelectorContract.IModel.Delegate f92462a;

    /* renamed from: b */
    private AbstractC35936a f92463b;

    /* renamed from: c */
    private final CallbackManager f92464c = new CallbackManager();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IModel
    /* renamed from: a */
    public void mo131636a() {
        m139971a(SyncDataStrategy.LOCAL);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IModel
    /* renamed from: b */
    public void mo131639b() {
        m139971a(SyncDataStrategy.FORCE_SERVER);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f92464c.cancelCallbacks();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.d$a */
    public static final class RunnableC35765a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ContactsSelectorModel f92465a;

        /* renamed from: b */
        final /* synthetic */ boolean f92466b;

        /* renamed from: c */
        final /* synthetic */ ContactEntriesResult f92467c;

        RunnableC35765a(ContactsSelectorModel dVar, boolean z, ContactEntriesResult aVar) {
            this.f92465a = dVar;
            this.f92466b = z;
            this.f92467c = aVar;
        }

        public final void run() {
            if (this.f92466b) {
                IContactsSelectorContract.IModel.Delegate aVar = this.f92465a.f92462a;
                if (aVar != null) {
                    aVar.mo131648b(this.f92467c);
                    return;
                }
                return;
            }
            IContactsSelectorContract.IModel.Delegate aVar2 = this.f92465a.f92462a;
            if (aVar2 != null) {
                aVar2.mo131647a(this.f92467c);
            }
        }
    }

    public ContactsSelectorModel() {
        C35906e a = C35906e.m140678a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactService.inst()");
        this.f92463b = a;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract.IModel
    /* renamed from: a */
    public void mo131637a(IContactsSelectorContract.IModel.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f92462a = aVar;
    }

    /* renamed from: a */
    private final void m139971a(SyncDataStrategy syncDataStrategy) {
        ICallback wrapAndAddCallback = this.f92464c.wrapAndAddCallback(new C35766b(this, syncDataStrategy));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "mCallbackManager.wrapAnd…}\n            }\n        )");
        this.f92463b.mo132141a((IGetDataCallback) wrapAndAddCallback, syncDataStrategy);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorModel$requestContactEntryList$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.d$b */
    public static final class C35766b implements IGetDataCallback<ContactEntriesResult> {

        /* renamed from: a */
        final /* synthetic */ ContactsSelectorModel f92468a;

        /* renamed from: b */
        final /* synthetic */ SyncDataStrategy f92469b;

        /* renamed from: a */
        public void onSuccess(ContactEntriesResult aVar) {
            boolean z;
            Log.m165389i("ContactModule_ContactsSelectorFragment2", "onSuccess : " + this.f92469b);
            ContactsSelectorModel dVar = this.f92468a;
            if (aVar == null) {
                aVar = ContactEntriesResult.f92804a.mo132098a();
            }
            if (this.f92469b == SyncDataStrategy.FORCE_SERVER) {
                z = true;
            } else {
                z = false;
            }
            dVar.mo131638a(aVar, z);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("ContactModule_ContactsSelectorFragment2", "request contact entries error : " + errorResult + "   request from server : " + this.f92469b + ' ');
            ContactsSelectorModel dVar = this.f92468a;
            ContactEntriesResult a = ContactEntriesResult.f92804a.mo132098a();
            if (this.f92469b == SyncDataStrategy.FORCE_SERVER) {
                z = true;
            } else {
                z = false;
            }
            dVar.mo131638a(a, z);
        }

        C35766b(ContactsSelectorModel dVar, SyncDataStrategy syncDataStrategy) {
            this.f92468a = dVar;
            this.f92469b = syncDataStrategy;
        }
    }

    /* renamed from: a */
    public final void mo131638a(ContactEntriesResult aVar, boolean z) {
        UICallbackExecutor.execute(new RunnableC35765a(this, z, aVar));
    }
}
