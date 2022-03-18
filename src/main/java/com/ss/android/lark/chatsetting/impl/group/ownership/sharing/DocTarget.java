package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import com.ss.android.lark.doc.entity.DocType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/DocTarget;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingTarget;", "name", "", "url", "docType", "Lcom/ss/android/lark/doc/entity/DocType;", "unauthorized", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/doc/entity/DocType;Z)V", "getDocType", "()Lcom/ss/android/lark/doc/entity/DocType;", "setDocType", "(Lcom/ss/android/lark/doc/entity/DocType;)V", "getUnauthorized", "()Z", "setUnauthorized", "(Z)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.c */
public final class DocTarget extends SharingTarget {

    /* renamed from: a */
    private String f89855a;

    /* renamed from: b */
    private DocType f89856b;

    /* renamed from: c */
    private boolean f89857c;

    /* renamed from: a */
    public final String mo128423a() {
        return this.f89855a;
    }

    /* renamed from: b */
    public final DocType mo128424b() {
        return this.f89856b;
    }

    /* renamed from: c */
    public final boolean mo128425c() {
        return this.f89857c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocTarget(String str, String str2, DocType docType, boolean z) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(docType, "docType");
        this.f89855a = str2;
        this.f89856b = docType;
        this.f89857c = z;
    }
}
