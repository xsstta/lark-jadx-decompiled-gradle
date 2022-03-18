package com.ss.android.lark.keyboard.widget.emoji;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator;", "", "onBackSpace", "", "onSelectEmoji", "emojiResult", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator$EmojiResult;", "EmojiResult", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.b */
public interface EmojiOperator {
    /* renamed from: a */
    void mo147520a();

    /* renamed from: a */
    void mo147521a(EmojiResult aVar);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator$EmojiResult;", "", "reactionKey", "", "drawable", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "getReactionKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.keyboard.widget.emoji.b$a */
    public static final class EmojiResult {

        /* renamed from: a */
        private final String f104815a;

        /* renamed from: b */
        private final Drawable f104816b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmojiResult)) {
                return false;
            }
            EmojiResult aVar = (EmojiResult) obj;
            return Intrinsics.areEqual(this.f104815a, aVar.f104815a) && Intrinsics.areEqual(this.f104816b, aVar.f104816b);
        }

        public int hashCode() {
            String str = this.f104815a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Drawable drawable = this.f104816b;
            if (drawable != null) {
                i = drawable.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "EmojiResult(reactionKey=" + this.f104815a + ", drawable=" + this.f104816b + ")";
        }

        /* renamed from: a */
        public final String mo148250a() {
            return this.f104815a;
        }

        public EmojiResult(String str, Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(drawable, "drawable");
            this.f104815a = str;
            this.f104816b = drawable;
        }
    }
}
