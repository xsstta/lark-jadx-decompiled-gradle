package com.ss.android.lark.chat.entity.preview;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Border;", "Ljava/io/Serializable;", "width", "", "cornerRadius", "themeColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "(Ljava/lang/Float;Ljava/lang/Float;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;)V", "getCornerRadius", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getThemeColor", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "getWidth", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;)Lcom/ss/android/lark/chat/entity/preview/Border;", "equals", "", "other", "", "hashCode", "", "toString", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Border implements Serializable {
    private final Float cornerRadius;
    private final ThemeColor themeColor;
    private final Float width;

    public static /* synthetic */ Border copy$default(Border border, Float f, Float f2, ThemeColor themeColor2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = border.width;
        }
        if ((i & 2) != 0) {
            f2 = border.cornerRadius;
        }
        if ((i & 4) != 0) {
            themeColor2 = border.themeColor;
        }
        return border.copy(f, f2, themeColor2);
    }

    public final Float component1() {
        return this.width;
    }

    public final Float component2() {
        return this.cornerRadius;
    }

    public final ThemeColor component3() {
        return this.themeColor;
    }

    public final Border copy(Float f, Float f2, ThemeColor themeColor2) {
        return new Border(f, f2, themeColor2);
    }

    public String toString() {
        return "Border(width=" + this.width + ", cornerRadius=" + this.cornerRadius + ", themeColor=" + this.themeColor + ")";
    }

    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final ThemeColor getThemeColor() {
        return this.themeColor;
    }

    public final Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        Float f = this.width;
        int i3 = 0;
        if (f != null) {
            i = f.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Float f2 = this.cornerRadius;
        if (f2 != null) {
            i2 = f2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        ThemeColor themeColor2 = this.themeColor;
        if (themeColor2 != null) {
            i3 = themeColor2.hashCode();
        }
        return i5 + i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Border)) {
            return false;
        }
        Border border = (Border) obj;
        if (!(!Intrinsics.areEqual(this.width, border.width)) && !(!Intrinsics.areEqual(this.cornerRadius, border.cornerRadius)) && !(!Intrinsics.areEqual(this.themeColor, border.themeColor))) {
            return true;
        }
        return false;
    }

    public Border(Float f, Float f2, ThemeColor themeColor2) {
        this.width = f;
        this.cornerRadius = f2;
        this.themeColor = themeColor2;
    }
}
