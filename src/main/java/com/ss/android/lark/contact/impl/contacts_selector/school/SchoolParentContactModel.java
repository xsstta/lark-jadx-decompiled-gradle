package com.ss.android.lark.contact.impl.contacts_selector.school;

import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.contact.dto.SchoolContactStructureResponse;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactModel;", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactModel;", "()V", "mCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mSchoolService", "Lcom/ss/android/lark/contact/impl/interfaces/IContactServiceInternal;", "getMSchoolService", "()Lcom/ss/android/lark/contact/impl/interfaces/IContactServiceInternal;", "setMSchoolService", "(Lcom/ss/android/lark/contact/impl/interfaces/IContactServiceInternal;)V", "cancel", "", "fetch", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/SchoolContactStructureResponse;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.e */
public final class SchoolParentContactModel implements ISchoolParentContactModel {

    /* renamed from: a */
    private AbstractC35936a f92493a = C35906e.m140678a();

    /* renamed from: b */
    private final CallbackManager f92494b = new CallbackManager();

    @Override // com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactModel
    /* renamed from: a */
    public void mo131657a() {
        this.f92494b.cancelCallbacks();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_selector/school/SchoolParentContactModel$fetch$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/SchoolContactStructureResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "subordinateDepartmentResponse", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.e$a */
    public static final class C35771a implements IGetDataCallback<SchoolContactStructureResponse> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f92495a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.school.e$a$a */
        public static final class RunnableC35772a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C35771a f92496a;

            /* renamed from: b */
            final /* synthetic */ SchoolContactStructureResponse f92497b;

            RunnableC35772a(C35771a aVar, SchoolContactStructureResponse fVar) {
                this.f92496a = aVar;
                this.f92497b = fVar;
            }

            public final void run() {
                this.f92496a.f92495a.onSuccess(this.f92497b);
            }
        }

        C35771a(IGetDataCallback iGetDataCallback) {
            this.f92495a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(SchoolContactStructureResponse fVar) {
            UICallbackExecutor.execute(new RunnableC35772a(this, fVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f92495a.onError(errorResult);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.school.ISchoolParentContactModel
    /* renamed from: a */
    public void mo131658a(IGetDataCallback<SchoolContactStructureResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ICallback wrapAndAddCallback = this.f92494b.wrapAndAddCallback(new C35771a(iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "mCallbackManager.wrapAnd…     }\n                })");
        IGetDataCallback<SchoolContactStructureResponse> iGetDataCallback2 = (IGetDataCallback) wrapAndAddCallback;
        AbstractC35936a aVar = this.f92493a;
        if (aVar != null) {
            aVar.mo132149a(true, iGetDataCallback2);
        }
    }
}
