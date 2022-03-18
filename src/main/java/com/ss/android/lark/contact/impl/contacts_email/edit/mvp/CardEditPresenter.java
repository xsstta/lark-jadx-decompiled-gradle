package com.ss.android.lark.contact.impl.contacts_email.edit.mvp;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.contacts_email.edit.CardEditItemFactory;
import com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003\u0012\u0013\u0014B\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0014J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView$Delegage;", "model", "view", "(Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel;Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView;)V", "checkValid", "", "create", "", "createViewDelegate", "init", "processContentInvalid", "itemIndex", "", "quit", "Companion", "ModelDelegate", "ViewDelegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.b */
public final class CardEditPresenter extends BasePresenter<ICardEditContract.IModel, ICardEditContract.IView, ICardEditContract.IView.Delegage> {

    /* renamed from: a */
    public static final Companion f91954a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter$Companion;", "", "()V", "EMAIL_INVALID", "", "PHONE_INVALID", "SOURCE_CONTACT", "", "SOURCE_PROFILE", "TAG", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ICardEditContract.IView.Delegage createViewDelegate() {
        return new ViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter$ViewDelegate;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView$Delegage;", "(Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter;)V", "getEnterMode", "", "hasEditedContent", "", "initData", "", "list", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "onConfirmBtnClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.b$c */
    public final class ViewDelegate implements ICardEditContract.IView.Delegage {
        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView.Delegage
        /* renamed from: b */
        public String mo131117b() {
            return ((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131102b();
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView.Delegage
        /* renamed from: c */
        public boolean mo131118c() {
            for (T t : ((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131107d()) {
                if (!((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131098a().get(t.mo131082f()).equals(t)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView.Delegage
        /* renamed from: a */
        public void mo131115a() {
            ((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131105c();
            if (!CardEditPresenter.this.mo131132b()) {
                ((ICardEditContract.IView) CardEditPresenter.this.getView()).mo131109a();
                return;
            }
            ((ICardEditContract.IView) CardEditPresenter.this.getView()).mo131109a();
            ((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131103b(new UIGetDataCallback(new C35553a(this)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter$ViewDelegate$onConfirmBtnClick$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "cardId", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.b$c$a */
        public static final class C35553a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f91957a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35553a(ViewDelegate cVar) {
                this.f91957a = cVar;
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                String b = ((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131102b();
                int hashCode = b.hashCode();
                if (hashCode != -2022147290) {
                    if (hashCode == -2002790632 && b.equals("mode_create")) {
                        ContactHitPoint.m140792b("contact");
                    }
                } else if (b.equals("mode_edit")) {
                    ContactHitPoint.m140792b("profile");
                }
                String string = UIHelper.getString(R.string.Lark_Contacts_SavedToast);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Lark_Contacts_SavedToast)");
                ((ICardEditContract.IView) CardEditPresenter.this.getView()).mo131111a(string);
                ((ICardEditContract.IView) CardEditPresenter.this.getView()).mo131113a(true);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String string = UIHelper.getString(R.string.Lark_Contacts_UnableToSaveToast);
                int errorCode = errorResult.getErrorCode();
                if (errorCode == 370000) {
                    CardEditPresenter.this.mo131131a(4);
                } else if (errorCode != 370002) {
                    ICardEditContract.IView bVar = (ICardEditContract.IView) CardEditPresenter.this.getView();
                    String displayMsg = errorResult.getDisplayMsg();
                    if (displayMsg != null) {
                        string = displayMsg;
                    } else {
                        Intrinsics.checkExpressionValueIsNotNull(string, "defaultMsg");
                    }
                    bVar.mo131111a(string);
                } else {
                    CardEditPresenter.this.mo131131a(3);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IView.Delegage
        /* renamed from: a */
        public void mo131116a(List<CardEditItemFactory.CardEditItemData> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            ((ICardEditContract.IModel) CardEditPresenter.this.getModel()).mo131101a(list);
        }
    }

    /* renamed from: c */
    public final void mo131133c() {
        ((ICardEditContract.IView) getView()).mo131114b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ICardEditContract.IModel) getModel()).mo131100a(new ModelDelegate());
        m139150d();
    }

    /* renamed from: d */
    private final void m139150d() {
        if (!Intrinsics.areEqual(((ICardEditContract.IModel) getModel()).mo131102b(), "mode_create")) {
            ((ICardEditContract.IModel) getModel()).mo131099a(new UIGetDataCallback(new C35554d(this)));
        }
    }

    /* renamed from: b */
    public final boolean mo131132b() {
        String str;
        boolean z;
        List<CardEditItemFactory.CardEditItemData> a = ((ICardEditContract.IModel) getModel()).mo131098a();
        CardEditItemFactory.CardEditItemData bVar = a.get(0);
        CardEditItemFactory.CardEditItemData bVar2 = a.get(4);
        CardEditItemFactory.CardEditItemData bVar3 = a.get(3);
        String a2 = bVar.mo131071a();
        if (a2 == null) {
            str = null;
        } else if (a2 != null) {
            str = StringsKt.trim((CharSequence) a2).toString();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        bVar.mo131073a(!TextUtils.isEmpty(str));
        CardEditItemFactory.Companion dVar = CardEditItemFactory.f91903a;
        String a3 = bVar2.mo131071a();
        if (a3 == null) {
            a3 = "";
        }
        bVar2.mo131073a(dVar.mo131096a((CharSequence) a3));
        if (Intrinsics.areEqual(bVar3.mo131074b(), "+86")) {
            z = CardEditItemFactory.f91903a.mo131097a(bVar3.mo131071a());
        } else {
            z = true;
        }
        bVar3.mo131073a(z);
        if (!bVar.mo131077c() || !bVar2.mo131077c() || !bVar3.mo131077c()) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter$ModelDelegate;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel$Delegate;", "(Lcom/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter;)V", "updatePhonePrefixView", "", "countryBean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.b$b */
    public final class ModelDelegate implements ICardEditContract.IModel.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ModelDelegate() {
        }

        @Override // com.ss.android.lark.contact.impl.contacts_email.edit.ICardEditContract.IModel.Delegate
        /* renamed from: a */
        public void mo131108a(CountryBean countryBean) {
            ((ICardEditContract.IView) CardEditPresenter.this.getView()).mo131110a(countryBean);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/impl/contacts_email/edit/mvp/CardEditPresenter$init$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "list", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.mvp.b$d */
    public static final class C35554d implements IGetDataCallback<List<CardEditItemFactory.CardEditItemData>> {

        /* renamed from: a */
        final /* synthetic */ CardEditPresenter f91958a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35554d(CardEditPresenter bVar) {
            this.f91958a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CardEditPresenter", "getCardDataById failed: " + errorResult.getDisplayMsg());
        }

        /* renamed from: a */
        public void onSuccess(List<CardEditItemFactory.CardEditItemData> list) {
            if (list != null) {
                ((ICardEditContract.IModel) this.f91958a.getModel()).mo131106c(list);
                ((ICardEditContract.IModel) this.f91958a.getModel()).mo131104b(list);
                ((ICardEditContract.IView) this.f91958a.getView()).mo131112a(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo131131a(int i) {
        ((ICardEditContract.IModel) getModel()).mo131098a().get(i).mo131073a(false);
        ((ICardEditContract.IView) getView()).mo131109a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardEditPresenter(ICardEditContract.IModel aVar, ICardEditContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
    }
}
