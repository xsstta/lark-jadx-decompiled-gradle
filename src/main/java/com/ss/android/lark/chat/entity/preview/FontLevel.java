package com.ss.android.lark.chat.entity.preview;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/FontLevel;", "Ljava/io/Serializable;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/FontType;", "level", "", "(Lcom/ss/android/lark/chat/entity/preview/FontType;I)V", "getLevel", "()I", "getType", "()Lcom/ss/android/lark/chat/entity/preview/FontType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FontLevel implements Serializable {
    private final int level;
    private final FontType type;

    public FontLevel() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ FontLevel copy$default(FontLevel fontLevel, FontType fontType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fontType = fontLevel.type;
        }
        if ((i2 & 2) != 0) {
            i = fontLevel.level;
        }
        return fontLevel.copy(fontType, i);
    }

    public final FontType component1() {
        return this.type;
    }

    public final int component2() {
        return this.level;
    }

    public final FontLevel copy(FontType fontType, int i) {
        Intrinsics.checkParameterIsNotNull(fontType, ShareHitPoint.f121869d);
        return new FontLevel(fontType, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontLevel)) {
            return false;
        }
        FontLevel fontLevel = (FontLevel) obj;
        return Intrinsics.areEqual(this.type, fontLevel.type) && this.level == fontLevel.level;
    }

    public int hashCode() {
        FontType fontType = this.type;
        return ((fontType != null ? fontType.hashCode() : 0) * 31) + this.level;
    }

    public String toString() {
        return "FontLevel(type=" + this.type + ", level=" + this.level + ")";
    }

    public final int getLevel() {
        return this.level;
    }

    public final FontType getType() {
        return this.type;
    }

    public FontLevel(FontType fontType, int i) {
        Intrinsics.checkParameterIsNotNull(fontType, ShareHitPoint.f121869d);
        this.type = fontType;
        this.level = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontLevel(FontType fontType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? FontType.CAPTION : fontType, (i2 & 2) != 0 ? 0 : i);
    }
}
