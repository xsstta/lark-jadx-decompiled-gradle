package com.bytedance.ee.android.file.picker.lib.base;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/base/FragmentInfo;", "", "fragment", "Landroidx/fragment/app/Fragment;", "title", "", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.base.c */
public final class FragmentInfo {

    /* renamed from: a */
    private final Fragment f12273a;

    /* renamed from: b */
    private final String f12274b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentInfo)) {
            return false;
        }
        FragmentInfo cVar = (FragmentInfo) obj;
        return Intrinsics.areEqual(this.f12273a, cVar.f12273a) && Intrinsics.areEqual(this.f12274b, cVar.f12274b);
    }

    public int hashCode() {
        Fragment fragment = this.f12273a;
        int i = 0;
        int hashCode = (fragment != null ? fragment.hashCode() : 0) * 31;
        String str = this.f12274b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "FragmentInfo(fragment=" + this.f12273a + ", title=" + this.f12274b + ")";
    }

    /* renamed from: a */
    public final Fragment mo15849a() {
        return this.f12273a;
    }

    /* renamed from: b */
    public final String mo15850b() {
        return this.f12274b;
    }

    public FragmentInfo(Fragment fragment, String str) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f12273a = fragment;
        this.f12274b = str;
    }
}
