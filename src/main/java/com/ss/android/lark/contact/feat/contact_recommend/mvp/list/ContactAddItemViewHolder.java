package com.ss.android.lark.contact.feat.contact_recommend.mvp.list;

import com.ss.android.lark.contact.feat.common.ContactSimpleItemView;
import com.ss.android.lark.contact.feat.common.ItemViewHolder;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ContactAddItemViewHolder;", "Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "contactItemView", "Lcom/ss/android/lark/contact/feat/common/ContactSimpleItemView;", "(Lcom/ss/android/lark/contact/feat/common/ContactSimpleItemView;)V", "getContactItemView", "()Lcom/ss/android/lark/contact/feat/common/ContactSimpleItemView;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a.c */
public final class ContactAddItemViewHolder extends ItemViewHolder<ContactRecData> {

    /* renamed from: a */
    private final ContactSimpleItemView f91532a;

    /* renamed from: b */
    public final ContactSimpleItemView mo130690b() {
        return this.f91532a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactAddItemViewHolder(ContactSimpleItemView contactSimpleItemView) {
        super(contactSimpleItemView);
        Intrinsics.checkParameterIsNotNull(contactSimpleItemView, "contactItemView");
        this.f91532a = contactSimpleItemView;
    }
}
