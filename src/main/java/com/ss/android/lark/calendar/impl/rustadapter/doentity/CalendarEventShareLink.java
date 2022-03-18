package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventShareLink;", "", "url", "", "shareCopy", "imageData", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getImageData", "()Landroid/graphics/Bitmap;", "setImageData", "(Landroid/graphics/Bitmap;)V", "getShareCopy", "()Ljava/lang/String;", "setShareCopy", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.a */
public final class CalendarEventShareLink {

    /* renamed from: a */
    private String f83580a;

    /* renamed from: b */
    private String f83581b;

    /* renamed from: c */
    private Bitmap f83582c;

    public CalendarEventShareLink() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarEventShareLink)) {
            return false;
        }
        CalendarEventShareLink aVar = (CalendarEventShareLink) obj;
        return Intrinsics.areEqual(this.f83580a, aVar.f83580a) && Intrinsics.areEqual(this.f83581b, aVar.f83581b) && Intrinsics.areEqual(this.f83582c, aVar.f83582c);
    }

    public int hashCode() {
        String str = this.f83580a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83581b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Bitmap bitmap = this.f83582c;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CalendarEventShareLink(url=" + this.f83580a + ", shareCopy=" + this.f83581b + ", imageData=" + this.f83582c + ")";
    }

    /* renamed from: a */
    public final String mo120035a() {
        return this.f83580a;
    }

    /* renamed from: b */
    public final String mo120038b() {
        return this.f83581b;
    }

    /* renamed from: c */
    public final Bitmap mo120040c() {
        return this.f83582c;
    }

    /* renamed from: a */
    public final void mo120036a(Bitmap bitmap) {
        this.f83582c = bitmap;
    }

    /* renamed from: b */
    public final void mo120039b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83581b = str;
    }

    /* renamed from: a */
    public final void mo120037a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83580a = str;
    }

    public CalendarEventShareLink(String str, String str2, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "shareCopy");
        this.f83580a = str;
        this.f83581b = str2;
        this.f83582c = bitmap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarEventShareLink(String str, String str2, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bitmap);
    }
}
