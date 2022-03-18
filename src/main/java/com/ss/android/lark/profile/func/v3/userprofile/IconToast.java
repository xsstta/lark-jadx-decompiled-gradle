package com.ss.android.lark.profile.func.v3.userprofile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/IconToast;", "", "toastStr", "", "iconRes", "", "(Ljava/lang/String;I)V", "getIconRes", "()I", "getToastStr", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.c */
public final class IconToast {

    /* renamed from: a */
    private final String f130446a;

    /* renamed from: b */
    private final int f130447b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconToast)) {
            return false;
        }
        IconToast cVar = (IconToast) obj;
        return Intrinsics.areEqual(this.f130446a, cVar.f130446a) && this.f130447b == cVar.f130447b;
    }

    public int hashCode() {
        String str = this.f130446a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f130447b;
    }

    public String toString() {
        return "IconToast(toastStr=" + this.f130446a + ", iconRes=" + this.f130447b + ")";
    }

    /* renamed from: a */
    public final String mo180187a() {
        return this.f130446a;
    }

    /* renamed from: b */
    public final int mo180188b() {
        return this.f130447b;
    }

    public IconToast(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "toastStr");
        this.f130446a = str;
        this.f130447b = i;
    }
}
