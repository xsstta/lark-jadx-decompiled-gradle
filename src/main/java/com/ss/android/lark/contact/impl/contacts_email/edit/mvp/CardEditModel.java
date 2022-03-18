package com.ss.android.lark.contact.impl.contacts_email.edit.mvp;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.contact.impl.contacts_email.edit.CardEditItemFactory;
import com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract;
import com.ss.android.lark.contact.impl.contacts_email.entity.GetBusinessCardResult;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010#\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010%\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010&\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0016J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010)\u001a\u00020\u001aH\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0016\u0010,\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0016H\u0016J\u0012\u0010/\u001a\u00020\u001a2\b\u00100\u001a\u0004\u0018\u000101H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel;", "cardId", "", "cardEnterMode", "name", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardEnterMode", "()Ljava/lang/String;", "getCardId", "contactService", "Lcom/ss/android/lark/contact/impl/service/ContactService;", "kotlin.jvm.PlatformType", "currentCard", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/GetBusinessCardResult;", "getEmail", "itemList", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "modelDelegate", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel$Delegate;", "getName", "originalItemList", "create", "", "destroy", "getCardDataFromNet", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getEnterMode", "getItemList", "", "getOriginalItemList", "initData", "list", "initPhonePrefix", "onConfirmBtnClick", "parseCardToViewData", "card", "parseViewData2Card", "parseViewData2Phone", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/GetBusinessCardResult$Phone;", "saveCardData", "setModelDelegate", "delegate", "updatePhone", "countryBean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.a */
public final class CardEditModel extends BaseModel implements ICardEditContract.IModel {

    /* renamed from: b */
    public static final Companion f91941b = new Companion(null);

    /* renamed from: a */
    public GetBusinessCardResult f91942a;

    /* renamed from: c */
    private final C35906e f91943c = C35906e.m140678a();

    /* renamed from: d */
    private List<CardEditItemFactory.CardEditItemData> f91944d = new ArrayList();

    /* renamed from: e */
    private List<CardEditItemFactory.CardEditItemData> f91945e = new ArrayList();

    /* renamed from: f */
    private ICardEditContract.IModel.Delegate f91946f;

    /* renamed from: g */
    private final String f91947g;

    /* renamed from: h */
    private final String f91948h;

    /* renamed from: i */
    private final String f91949i;

    /* renamed from: j */
    private final String f91950j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditModel$Companion;", "", "()V", "COMPANY_INDEX", "", "DEFAULT_CHINA_PHONE_PREFIX", "", "DEFAULT_CHINA_PHONE_REGION_CODE", "EMAIL_INDEX", "EXTRA_INDEX", "GROUP_INDEX", "NAME_INDEX", "PHONE_NUMBER_INDEX", "TAG", "TITLE_INDEX", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: a */
    public List<CardEditItemFactory.CardEditItemData> mo131098a() {
        return this.f91944d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: b */
    public String mo131102b() {
        return this.f91948h;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: d */
    public List<CardEditItemFactory.CardEditItemData> mo131107d() {
        return this.f91945e;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f91946f = null;
        super.destroy();
    }

    /* renamed from: e */
    private final GetBusinessCardResult.Phone m139135e() {
        String str;
        String str2 = null;
        if (!TextUtils.isEmpty(this.f91944d.get(3).mo131071a())) {
            String b = this.f91944d.get(3).mo131074b();
            if (b == null) {
                str = null;
            } else if (b != null) {
                str = StringsKt.trim((CharSequence) b).toString();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String a = this.f91944d.get(3).mo131071a();
            String e = this.f91944d.get(3).mo131080e();
            if (e != null) {
                if (e != null) {
                    str2 = StringsKt.trim((CharSequence) e).toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return new GetBusinessCardResult.Phone(str, a, str2);
        }
        GetBusinessCardResult.Phone aVar = null;
        if (!Intrinsics.areEqual(this.f91948h, "mode_edit") || TextUtils.isEmpty(this.f91945e.get(3).mo131071a())) {
            return aVar;
        }
        return new GetBusinessCardResult.Phone("", "", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r2 != null) goto L_0x002c;
     */
    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131105c() {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.CardEditModel.mo131105c():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditModel$onConfirmBtnClick$resultCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.a$c */
    public static final class C35552c implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f91953a;

        C35552c(IGetDataCallback iGetDataCallback) {
            this.f91953a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f91953a.onSuccess(str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f91953a.onError(errorResult);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: a */
    public void mo131100a(ICardEditContract.IModel.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f91946f = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditModel$getCardDataFromNet$resultCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/GetBusinessCardResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "card", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.a$b */
    public static final class C35551b implements IGetDataCallback<GetBusinessCardResult> {

        /* renamed from: a */
        final /* synthetic */ CardEditModel f91951a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f91952b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f91952b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(GetBusinessCardResult bVar) {
            this.f91951a.f91942a = bVar;
            IGetDataCallback iGetDataCallback = this.f91952b;
            CardEditModel aVar = this.f91951a;
            iGetDataCallback.onSuccess(aVar.mo131126a(aVar.f91942a));
        }

        C35551b(CardEditModel aVar, IGetDataCallback iGetDataCallback) {
            this.f91951a = aVar;
            this.f91952b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: a */
    public void mo131099a(IGetDataCallback<List<CardEditItemFactory.CardEditItemData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ICallback wrapAndAddCallback = getCallbackManager().wrapAndAddCallback(new C35551b(this, iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndA…\n            }\n        })");
        this.f91943c.mo132148a(Collections.singletonList(this.f91947g), (IGetDataCallback) wrapAndAddCallback);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: b */
    public void mo131104b(List<CardEditItemFactory.CardEditItemData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f91945e.clear();
        for (T t : list) {
            CardEditItemFactory.CardEditItemData a = CardEditItemFactory.CardEditItemData.m139068a(t, 0, null, false, 0, 15, null);
            a.mo131072a(t.mo131071a());
            a.mo131076c(t.mo131080e());
            this.f91945e.add(a);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: c */
    public void mo131106c(List<CardEditItemFactory.CardEditItemData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (TextUtils.isEmpty(list.get(3).mo131074b())) {
            list.get(3).mo131075b("+86");
            list.get(3).mo131076c("CN");
        }
    }

    /* renamed from: a */
    public void mo131127a(CountryBean countryBean) {
        if (countryBean == null) {
            Log.m165397w("CardEditModel", "coutryBean is null when updatePhonePrefix");
            return;
        }
        this.f91944d.get(3).mo131075b(countryBean.getCode());
        this.f91944d.get(3).mo131076c(countryBean.getKey());
        ICardEditContract.IModel.Delegate aVar = this.f91946f;
        if (aVar != null) {
            aVar.mo131108a(countryBean);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: b */
    public void mo131103b(IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ICallback wrapAndAddCallback = getCallbackManager().wrapAndAddCallback(new C35552c(iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndA…\n            }\n        })");
        IGetDataCallback<String> iGetDataCallback2 = (IGetDataCallback) wrapAndAddCallback;
        if (TextUtils.isEmpty(this.f91948h) || this.f91942a == null) {
            return;
        }
        if (Intrinsics.areEqual(mo131102b(), "mode_create")) {
            this.f91943c.mo132142a(this.f91942a, iGetDataCallback2);
        } else if (Intrinsics.areEqual(mo131102b(), "mode_edit")) {
            this.f91943c.mo132151b(this.f91942a, iGetDataCallback2);
        }
    }

    /* renamed from: a */
    public final List<CardEditItemFactory.CardEditItemData> mo131126a(GetBusinessCardResult bVar) {
        String str;
        String str2;
        if (bVar != null) {
            this.f91944d.get(0).mo131072a(bVar.mo131011b());
            this.f91944d.get(1).mo131072a(bVar.mo131013c());
            this.f91944d.get(2).mo131072a(bVar.mo131015d());
            CardEditItemFactory.CardEditItemData bVar2 = this.f91944d.get(3);
            GetBusinessCardResult.Phone e = bVar.mo131017e();
            if (e == null || (str = e.mo131027a()) == null) {
                str = "+86";
            }
            bVar2.mo131075b(str);
            CardEditItemFactory.CardEditItemData bVar3 = this.f91944d.get(3);
            GetBusinessCardResult.Phone e2 = bVar.mo131017e();
            String str3 = null;
            if (e2 != null) {
                str2 = e2.mo131028b();
            } else {
                str2 = null;
            }
            bVar3.mo131072a(str2);
            CardEditItemFactory.CardEditItemData bVar4 = this.f91944d.get(3);
            GetBusinessCardResult.Phone e3 = bVar.mo131017e();
            if (e3 != null) {
                str3 = e3.mo131029c();
            }
            bVar4.mo131076c(str3);
            this.f91944d.get(4).mo131072a(bVar.mo131019f());
            this.f91944d.get(5).mo131072a(bVar.mo131021g());
            this.f91944d.get(6).mo131072a(bVar.mo131023h());
        }
        return this.f91944d;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel
    /* renamed from: a */
    public void mo131101a(List<CardEditItemFactory.CardEditItemData> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f91944d = list;
        if (Intrinsics.areEqual(this.f91948h, "mode_create")) {
            this.f91942a = new GetBusinessCardResult();
            this.f91944d.get(0).mo131072a(this.f91949i);
            this.f91944d.get(4).mo131072a(this.f91950j);
            mo131106c(this.f91944d);
        }
        mo131104b(this.f91944d);
    }

    public CardEditModel(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "cardId");
        Intrinsics.checkParameterIsNotNull(str2, "cardEnterMode");
        this.f91947g = str;
        this.f91948h = str2;
        this.f91949i = str3;
        this.f91950j = str4;
    }
}
