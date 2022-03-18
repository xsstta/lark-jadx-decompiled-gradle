package com.ss.android.lark.widget.searchfilter;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/widget/searchfilter/FilterData;", "", "id", "", "(Ljava/lang/String;)V", "avatarList", "", "Landroid/graphics/Bitmap;", "getAvatarList", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "isSelected", "", "()Z", "setSelected", "(Z)V", "wording", "getWording", "setWording", "equals", "other", "hashCode", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.searchfilter.b */
public class FilterData {

    /* renamed from: a */
    private boolean f146623a;

    /* renamed from: b */
    private String f146624b = "";

    /* renamed from: c */
    private final List<Bitmap> f146625c = new ArrayList();

    /* renamed from: d */
    private final String f146626d;

    /* renamed from: e */
    public final boolean mo200845e() {
        return this.f146623a;
    }

    /* renamed from: f */
    public final String mo200847f() {
        return this.f146624b;
    }

    /* renamed from: g */
    public final List<Bitmap> mo200848g() {
        return this.f146625c;
    }

    /* renamed from: h */
    public final String mo200849h() {
        return this.f146626d;
    }

    public int hashCode() {
        return Objects.hash(this.f146626d);
    }

    /* renamed from: b */
    public final void mo200844b(boolean z) {
        this.f146623a = z;
    }

    /* renamed from: a */
    public final void mo200843a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f146624b = str;
    }

    public FilterData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f146626d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!Intrinsics.areEqual(getClass(), obj.getClass()))) {
            return false;
        }
        return Intrinsics.areEqual(this.f146626d, ((FilterData) obj).f146626d);
    }
}
