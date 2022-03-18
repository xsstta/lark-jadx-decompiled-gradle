package com.ss.android.lark.contact.impl.contacts_selector;

import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorFragment;
import com.ss.android.lark.contact.impl.entity.ContactEntriesResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract;", "", "()V", "IContactsSelectorFragmentDelegate", "IModel", "IView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.f */
public final class IContactsSelectorContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IContactsSelectorFragmentDelegate;", "", "changeEmailContactVisibility", "", "isVisible", "", "changeExternalContactVisibility", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.f$a */
    public interface IContactsSelectorFragmentDelegate {
        /* renamed from: a */
        void mo131568a(boolean z);

        /* renamed from: b */
        void mo131570b(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "requestContactEntryListFromLocal", "", "requestContactEntryListFromServer", "setModelDelegate", "delegate", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel$Delegate;", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.f$b */
    public interface IModel extends com.larksuite.framework.mvp.IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IModel$Delegate;", "", "onGetLocalContactEntryResult", "", "result", "Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "onGetServerContactEntryResult", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.f$b$a */
        public interface Delegate {
            /* renamed from: a */
            void mo131647a(ContactEntriesResult aVar);

            /* renamed from: b */
            void mo131648b(ContactEntriesResult aVar);
        }

        /* renamed from: a */
        void mo131636a();

        /* renamed from: a */
        void mo131637a(Delegate aVar);

        /* renamed from: b */
        void mo131639b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\fJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView$Delegate;", "onGetContactEntryResult", "", "newParams", "Lcom/ss/android/lark/contact/impl/contacts_selector/ContactsSelectorFragment$Builder;", "needUpdate", "", "onUpdateContactEntry", "needUpdateDefaultContact", "needUpdateDepartment", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.f$c */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/IContactsSelectorContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.f$c$a */
        public interface Delegate extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo131539a(ContactsSelectorFragment.Builder aVar, boolean z);

        /* renamed from: a */
        void mo131540a(ContactsSelectorFragment.Builder aVar, boolean z, boolean z2);
    }
}
