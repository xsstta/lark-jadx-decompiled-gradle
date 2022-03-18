package com.ss.android.lark.contact.impl.contacts_email.mvp;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.contact.dto.C35392a;
import com.ss.android.lark.contact.impl.contacts_email.entity.GetBusinessCardResult;
import com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0016\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IModel;", "()V", "PAGE_SIZE", "", "contactService", "Lcom/ss/android/lark/contact/impl/service/ContactService;", "kotlin.jvm.PlatformType", "currentCursorId", "", "hasMore", "", "isLodingMore", "deleteSingleNamecard", "", "cardId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getCardsFromNet", "Lcom/ss/android/lark/contact/dto/BusinessCardsResponse;", "getCurrentOffset", "initCurOffset", "initialOffset", "updateCursor", "cardList", "", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/GetBusinessCardResult;", "updateHasMore", "isHasMore", "updateTracker", "response", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.a */
public final class BusinessCardsModel extends BaseModel implements IBusinessCardsContract.IModel {

    /* renamed from: a */
    public boolean f91982a;

    /* renamed from: b */
    private final int f91983b = 50;

    /* renamed from: c */
    private boolean f91984c;

    /* renamed from: d */
    private String f91985d = "0";

    /* renamed from: e */
    private final C35906e f91986e = C35906e.m140678a();

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IModel
    /* renamed from: b */
    public String mo131166b() {
        return this.f91985d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IModel
    /* renamed from: a */
    public boolean mo131165a() {
        return this.f91984c;
    }

    /* renamed from: a */
    private final void m139196a(boolean z) {
        this.f91984c = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsModel$deleteSingleNamecard$resultCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.a$a */
    public static final class C35563a implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f91987a;

        C35563a(IGetDataCallback iGetDataCallback) {
            this.f91987a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f91987a.onSuccess(bool);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f91987a.onError(errorResult);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IModel
    /* renamed from: a */
    public void mo131163a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "initialOffset");
        this.f91985d = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/mvp/BusinessCardsModel$getCardsFromNet$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/BusinessCardsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.a$b */
    public static final class C35564b implements IGetDataCallback<C35392a> {

        /* renamed from: a */
        final /* synthetic */ BusinessCardsModel f91988a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f91989b;

        /* renamed from: a */
        public void onSuccess(C35392a aVar) {
            this.f91988a.f91982a = false;
            this.f91989b.onSuccess(aVar);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f91988a.f91982a = false;
            this.f91989b.onError(errorResult);
        }

        C35564b(BusinessCardsModel aVar, IGetDataCallback iGetDataCallback) {
            this.f91988a = aVar;
            this.f91989b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IModel
    /* renamed from: a */
    public void mo131162a(C35392a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "response");
        m139196a(aVar.mo130369b());
        List<GetBusinessCardResult> a = aVar.mo130365a();
        Intrinsics.checkExpressionValueIsNotNull(a, "response.businessCards");
        m139195a(a);
    }

    /* renamed from: a */
    private final void m139195a(List<GetBusinessCardResult> list) {
        if (!CollectionUtils.isEmpty(list)) {
            String a = ((GetBusinessCardResult) CollectionsKt.last((List) list)).mo131007a();
            if (!TextUtils.isEmpty(a)) {
                if (a == null) {
                    a = this.f91985d;
                }
                this.f91985d = a;
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IModel
    /* renamed from: a */
    public void mo131161a(IGetDataCallback<C35392a> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (!this.f91982a) {
            this.f91982a = true;
            this.f91986e.mo132152b(this.f91985d, this.f91983b, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C35564b(this, iGetDataCallback)));
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.mvp.IBusinessCardsContract.IModel
    /* renamed from: a */
    public void mo131164a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "cardId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ICallback wrapAndAddCallback = getCallbackManager().wrapAndAddCallback(new C35563a(iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndA…            }\n\n        })");
        this.f91986e.mo130282b(str, (IGetDataCallback) wrapAndAddCallback);
    }
}
