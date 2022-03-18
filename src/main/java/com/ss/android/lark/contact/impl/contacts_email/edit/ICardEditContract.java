package com.ss.android.lark.contact.impl.contacts_email.edit;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.impl.contacts_email.edit.CardEditItemFactory;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract;", "", "IModel", "IView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.c */
public interface ICardEditContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0019J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H&J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getCardDataFromNet", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "getEnterMode", "", "getItemList", "", "getOriginalItemList", "initData", "list", "initPhonePrefix", "onConfirmBtnClick", "parseViewData2Card", "saveCardData", "setModelDelegate", "delegate", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel$Delegate;", "updatePhone", "countryBean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IModel$Delegate;", "", "updatePhonePrefixView", "", "countryBean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.c$a$a */
        public interface Delegate {
            /* renamed from: a */
            void mo131108a(CountryBean countryBean);
        }

        /* renamed from: a */
        List<CardEditItemFactory.CardEditItemData> mo131098a();

        /* renamed from: a */
        void mo131099a(IGetDataCallback<List<CardEditItemFactory.CardEditItemData>> iGetDataCallback);

        /* renamed from: a */
        void mo131100a(Delegate aVar);

        /* renamed from: a */
        void mo131101a(List<CardEditItemFactory.CardEditItemData> list);

        /* renamed from: b */
        String mo131102b();

        /* renamed from: b */
        void mo131103b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo131104b(List<CardEditItemFactory.CardEditItemData> list);

        /* renamed from: c */
        void mo131105c();

        /* renamed from: c */
        void mo131106c(List<CardEditItemFactory.CardEditItemData> list);

        /* renamed from: d */
        List<CardEditItemFactory.CardEditItemData> mo131107d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView$Delegage;", "finish", "", "cardEdited", "", "quit", "resetAll", "itemList", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "showToast", "message", "", "updateItemsError", "updatePhonePrefixView", "countryBean", "Lcom/ss/android/lark/passport/signinsdk_api/country/CountryBean;", "Delegage", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegage> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/ICardEditContract$IView$Delegage;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "getEnterMode", "", "hasEditedContent", "", "initData", "", "list", "", "Lcom/ss/android/lark/contact/impl/contacts_email/edit/CardEditItemFactory$CardEditItemData;", "onConfirmBtnClick", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.c$b$a */
        public interface Delegage extends IView.IViewDelegate {
            /* renamed from: a */
            void mo131115a();

            /* renamed from: a */
            void mo131116a(List<CardEditItemFactory.CardEditItemData> list);

            /* renamed from: b */
            String mo131117b();

            /* renamed from: c */
            boolean mo131118c();
        }

        /* renamed from: a */
        void mo131109a();

        /* renamed from: a */
        void mo131110a(CountryBean countryBean);

        /* renamed from: a */
        void mo131111a(String str);

        /* renamed from: a */
        void mo131112a(List<CardEditItemFactory.CardEditItemData> list);

        /* renamed from: a */
        void mo131113a(boolean z);

        /* renamed from: b */
        void mo131114b();
    }
}
