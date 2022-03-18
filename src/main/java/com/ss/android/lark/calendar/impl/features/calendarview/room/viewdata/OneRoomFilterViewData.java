package com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneRoomFilterViewData;", "", "id", "", "logo", "Landroid/graphics/drawable/Drawable;", "name", "", "isSelected", "", "(ILandroid/graphics/drawable/Drawable;Ljava/lang/String;Z)V", "getId", "()I", "()Z", "setSelected", "(Z)V", "getLogo", "()Landroid/graphics/drawable/Drawable;", "setLogo", "(Landroid/graphics/drawable/Drawable;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.e.i */
public final class OneRoomFilterViewData {

    /* renamed from: a */
    private final int f78278a;

    /* renamed from: b */
    private Drawable f78279b;

    /* renamed from: c */
    private String f78280c;

    /* renamed from: d */
    private boolean f78281d;

    /* renamed from: a */
    public final int mo112392a() {
        return this.f78278a;
    }

    /* renamed from: b */
    public final Drawable mo112393b() {
        return this.f78279b;
    }

    /* renamed from: c */
    public final String mo112394c() {
        return this.f78280c;
    }

    /* renamed from: d */
    public final boolean mo112395d() {
        return this.f78281d;
    }

    public OneRoomFilterViewData(int i, Drawable drawable, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f78278a = i;
        this.f78279b = drawable;
        this.f78280c = str;
        this.f78281d = z;
    }
}
