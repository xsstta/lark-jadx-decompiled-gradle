package com.ss.android.lark.moments.impl.categorydetail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminData;", "Lcom/ss/android/lark/moments/impl/categorydetail/ICategoryAdminRvData;", "userId", "", "name", "avatarKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "getName", "getUserId", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.b */
public final class CategoryAdminData {

    /* renamed from: a */
    private final String f119117a;

    /* renamed from: b */
    private final String f119118b;

    /* renamed from: c */
    private final String f119119c;

    /* renamed from: a */
    public final String mo165989a() {
        return this.f119117a;
    }

    /* renamed from: b */
    public final String mo165990b() {
        return this.f119118b;
    }

    /* renamed from: c */
    public final String mo165991c() {
        return this.f119119c;
    }

    public CategoryAdminData(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        this.f119117a = str;
        this.f119118b = str2;
        this.f119119c = str3;
    }
}
