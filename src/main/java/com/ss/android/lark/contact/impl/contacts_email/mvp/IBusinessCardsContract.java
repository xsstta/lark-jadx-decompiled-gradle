package com.ss.android.lark.contact.impl.contacts_email.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.dto.C35392a;
import com.ss.android.lark.contact.impl.contacts_email.entity.BusinessCardViewData;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract;", "", "IModel", "IView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.c */
public interface IBusinessCardsContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "deleteSingleNamecard", "", "cardId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getCardsFromNet", "Lcom/ss/android/lark/contact/dto/BusinessCardsResponse;", "getCurrentOffset", "hasMore", "initCurOffset", "initialOffset", "updateTracker", "response", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.c$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo131161a(IGetDataCallback<C35392a> iGetDataCallback);

        /* renamed from: a */
        void mo131162a(C35392a aVar);

        /* renamed from: a */
        void mo131163a(String str);

        /* renamed from: a */
        void mo131164a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo131165a();

        /* renamed from: b */
        String mo131166b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\b\u0010\f\u001a\u00020\u0004H&J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView$Delegage;", "closeAllItems", "", "finishLoadMore", "removeCard", "card", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "showBusinessCardsView", "list", "", "showEmptyView", "showLoadedCards", "showToast", "msg", "", "updateSelectedMember", "mSelectedMemberList", "Delegage", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.c$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegage> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/mvp/IBusinessCardsContract$IView$Delegage;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "canLoadMore", "", "deleteSingleNamecard", "", "card", "Lcom/ss/android/lark/contact/impl/contacts_email/entity/BusinessCardViewData;", "onItemClicked", "checked", "position", "", "onLoadMore", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_email.mvp.c$b$a */
        public interface Delegage extends IView.IViewDelegate {
            /* renamed from: a */
            void mo131177a(BusinessCardViewData aVar);

            /* renamed from: a */
            boolean mo131178a();

            /* renamed from: a */
            boolean mo131179a(BusinessCardViewData aVar, boolean z, int i);

            /* renamed from: b */
            void mo131180b();
        }

        /* renamed from: a */
        void mo131149a(String str);

        /* renamed from: a */
        void mo131150a(List<String> list);

        /* renamed from: b */
        void mo131152b(BusinessCardViewData aVar);

        /* renamed from: b */
        void mo131153b(List<BusinessCardViewData> list);

        /* renamed from: c */
        void mo131154c();

        /* renamed from: c */
        void mo131155c(List<BusinessCardViewData> list);

        /* renamed from: d */
        void mo131156d();
    }
}
