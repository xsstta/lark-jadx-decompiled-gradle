package com.ss.android.lark.moments.impl.categoryedit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "", "id", "", "name", "iconKey", "enableMove", "", "state", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryState;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/lark/moments/impl/categoryedit/CategoryState;)V", "getEnableMove", "()Z", "getIconKey", "()Ljava/lang/String;", "getId", "getName", "getState", "()Lcom/ss/android/lark/moments/impl/categoryedit/CategoryState;", "setState", "(Lcom/ss/android/lark/moments/impl/categoryedit/CategoryState;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categoryedit.h */
public final class TabData {

    /* renamed from: a */
    private final String f119241a;

    /* renamed from: b */
    private final String f119242b;

    /* renamed from: c */
    private final String f119243c;

    /* renamed from: d */
    private final boolean f119244d;

    /* renamed from: e */
    private CategoryState f119245e;

    /* renamed from: a */
    public final String mo166160a() {
        return this.f119241a;
    }

    /* renamed from: b */
    public final String mo166161b() {
        return this.f119242b;
    }

    /* renamed from: c */
    public final String mo166162c() {
        return this.f119243c;
    }

    /* renamed from: d */
    public final boolean mo166163d() {
        return this.f119244d;
    }

    /* renamed from: e */
    public final CategoryState mo166164e() {
        return this.f119245e;
    }

    public TabData(String str, String str2, String str3, boolean z, CategoryState categoryState) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "iconKey");
        Intrinsics.checkParameterIsNotNull(categoryState, "state");
        this.f119241a = str;
        this.f119242b = str2;
        this.f119243c = str3;
        this.f119244d = z;
        this.f119245e = categoryState;
    }
}
