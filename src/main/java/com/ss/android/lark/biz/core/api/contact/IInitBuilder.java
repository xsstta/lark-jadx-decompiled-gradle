package com.ss.android.lark.biz.core.api.contact;

import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0003\b\t\nJ\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder;", "T", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;", "", "init", "", "builder", "(Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;)V", "IApplyCollabDialogBuilder", "IBlockTipBuilder", "IDialogBuilder", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.a.a */
public interface IInitBuilder<T extends IDialogBuilder<?>> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IApplyCollabDialogBuilder;", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;", "confirmText", "", "contact", "Lcom/ss/android/lark/contact/entity/Contact;", "contactList", "", "contactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "requestCode", "", "sourceFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.a.a$a */
    public interface IApplyCollabDialogBuilder extends IDialogBuilder<IApplyCollabDialogBuilder> {
        /* renamed from: a */
        IApplyCollabDialogBuilder mo105546a(int i);

        /* renamed from: a */
        IApplyCollabDialogBuilder mo105547a(ContactSource contactSource);

        /* renamed from: a */
        IApplyCollabDialogBuilder mo105548a(Contact contact);

        /* renamed from: a */
        IApplyCollabDialogBuilder mo105549a(C36516a<?> aVar);

        /* renamed from: a */
        IApplyCollabDialogBuilder mo105550a(List<? extends Contact> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IBlockTipBuilder;", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.a.a$b */
    public interface IBlockTipBuilder extends IDialogBuilder<IBlockTipBuilder> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002:\u0001\u000eJ\u0017\u0010\u0003\u001a\u00028\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u0017\u0010\n\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH&J\u0017\u0010\r\u001a\u00028\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;", "T", "", "callback", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder$IDialogCallback;", "(Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder$IDialogCallback;)Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;", "cancelText", "", "(Ljava/lang/String;)Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder;", "content", "fromTag", "show", "", "title", "IDialogCallback", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.a.a$c */
    public interface IDialogBuilder<T extends IDialogBuilder<T>> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder$IDialogCallback;", "", "onCancel", "", "onConfirm", "succeeded", "", "message", "", "onDismiss", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.biz.core.api.a.a$c$a */
        public interface IDialogCallback {
            /* renamed from: a */
            void mo105556a();

            /* renamed from: a */
            void mo105557a(boolean z, String str);

            /* renamed from: b */
            void mo105558b();
        }

        /* renamed from: a */
        T mo105551a(IDialogCallback aVar);

        /* renamed from: a */
        T mo105552a(String str);

        /* renamed from: b */
        T mo105553b(String str);

        /* renamed from: c */
        T mo105554c(String str);

        /* renamed from: d */
        T mo105555d(String str);
    }

    void init(T t);
}
