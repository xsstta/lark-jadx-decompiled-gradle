package com.ss.android.lark.contact.feat.contact_external.view;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_external/view/IndexDataOwner;", "", "isIndexEnable", "", "()Z", "setIndexEnable", "(Z)V", "getIndices", "", "", "", "registerDataObserver", "", "observer", "Lcom/ss/android/lark/contact/feat/contact_external/view/IndexDataOwner$IndexDataObserver;", "unregisterDataObserver", "IndexDataObserver", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.contact_external.view.c */
public interface IndexDataOwner {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_external/view/IndexDataOwner$IndexDataObserver;", "", "onDataSetChanged", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.contact_external.view.c$a */
    public interface IndexDataObserver {
        void onDataSetChanged();
    }
}
