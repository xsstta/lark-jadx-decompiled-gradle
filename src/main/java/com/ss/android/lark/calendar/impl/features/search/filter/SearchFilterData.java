package com.ss.android.lark.calendar.impl.features.search.filter;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u000fR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/filter/SearchFilterData;", "", "tagName", "", "onItemClick", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "isSelected", "", "selectedCount", "", "avatarBitmaps", "", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;ZILjava/util/List;Lkotlin/jvm/functions/Function0;)V", "getAvatarBitmaps", "()Ljava/util/List;", "setAvatarBitmaps", "(Ljava/util/List;)V", "()Z", "setSelected", "(Z)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function0;", "getSelectedCount", "()I", "setSelectedCount", "(I)V", "getTagName", "()Ljava/lang/String;", "setTagName", "(Ljava/lang/String;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.filter.b */
public final class SearchFilterData {

    /* renamed from: a */
    private String f82890a;

    /* renamed from: b */
    private boolean f82891b;

    /* renamed from: c */
    private int f82892c;

    /* renamed from: d */
    private List<Bitmap> f82893d;

    /* renamed from: e */
    private final Function0<Unit> f82894e;

    /* renamed from: a */
    public final String mo118200a() {
        return this.f82890a;
    }

    /* renamed from: b */
    public final boolean mo118204b() {
        return this.f82891b;
    }

    /* renamed from: c */
    public final int mo118205c() {
        return this.f82892c;
    }

    /* renamed from: d */
    public final List<Bitmap> mo118206d() {
        return this.f82893d;
    }

    /* renamed from: e */
    public final Function0<Unit> mo118207e() {
        return this.f82894e;
    }

    /* renamed from: a */
    public final void mo118201a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82890a = str;
    }

    /* renamed from: a */
    public final void mo118202a(List<Bitmap> list) {
        this.f82893d = list;
    }

    /* renamed from: a */
    public final void mo118203a(boolean z) {
        this.f82891b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchFilterData(String str, Function0<Unit> function0) {
        this(str, false, -1, new ArrayList(), function0);
        Intrinsics.checkParameterIsNotNull(str, "tagName");
        Intrinsics.checkParameterIsNotNull(function0, "onItemClick");
    }

    public SearchFilterData(String str, boolean z, int i, List<Bitmap> list, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "tagName");
        Intrinsics.checkParameterIsNotNull(function0, "onItemClick");
        this.f82890a = str;
        this.f82891b = z;
        this.f82892c = i;
        this.f82893d = list;
        this.f82894e = function0;
    }
}
