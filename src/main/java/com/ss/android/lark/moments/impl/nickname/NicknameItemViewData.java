package com.ss.android.lark.moments.impl.nickname;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/nickname/NicknameItemViewData;", "", "nameId", "", "name", "nameIndex", "", "selected", "", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getName", "()Ljava/lang/String;", "getNameId", "getNameIndex", "()I", "getSelected", "()Z", "setSelected", "(Z)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.nickname.d */
public final class NicknameItemViewData {

    /* renamed from: a */
    private final String f120364a;

    /* renamed from: b */
    private final String f120365b;

    /* renamed from: c */
    private final int f120366c;

    /* renamed from: d */
    private boolean f120367d;

    /* renamed from: a */
    public final String mo167501a() {
        return this.f120364a;
    }

    /* renamed from: b */
    public final String mo167503b() {
        return this.f120365b;
    }

    /* renamed from: c */
    public final int mo167504c() {
        return this.f120366c;
    }

    /* renamed from: d */
    public final boolean mo167505d() {
        return this.f120367d;
    }

    /* renamed from: a */
    public final void mo167502a(boolean z) {
        this.f120367d = z;
    }

    public NicknameItemViewData(String str, String str2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "nameId");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.f120364a = str;
        this.f120365b = str2;
        this.f120366c = i;
        this.f120367d = z;
    }
}
