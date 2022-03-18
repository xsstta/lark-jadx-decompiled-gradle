package com.ss.android.lark.keyboard.widget.emoji.v2;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/v2/EmojiViewData;", "", "content", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.v2.d */
public final class EmojiViewData {

    /* renamed from: a */
    private final String f104867a;

    /* renamed from: b */
    private final int f104868b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmojiViewData) {
                EmojiViewData dVar = (EmojiViewData) obj;
                if (Intrinsics.areEqual(this.f104867a, dVar.f104867a)) {
                    if (this.f104868b == dVar.f104868b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f104867a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f104868b;
    }

    public String toString() {
        return "EmojiViewData(content=" + this.f104867a + ", type=" + this.f104868b + ")";
    }

    /* renamed from: a */
    public final String mo148274a() {
        return this.f104867a;
    }

    /* renamed from: b */
    public final int mo148275b() {
        return this.f104868b;
    }

    public EmojiViewData(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        this.f104867a = str;
        this.f104868b = i;
    }
}
