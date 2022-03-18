package com.ss.android.lark.chat.entity.preview;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Gradient;", "Ljava/io/Serializable;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/Gradient$Type;", "content", "Lcom/ss/android/lark/chat/entity/preview/Gradient$Content;", "(Lcom/ss/android/lark/chat/entity/preview/Gradient$Type;Lcom/ss/android/lark/chat/entity/preview/Gradient$Content;)V", "getContent", "()Lcom/ss/android/lark/chat/entity/preview/Gradient$Content;", "getType", "()Lcom/ss/android/lark/chat/entity/preview/Gradient$Type;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Content", "Linear", "Type", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Gradient implements Serializable {
    private final Content content;
    private final Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Gradient$Content;", "Ljava/io/Serializable;", "()V", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static class Content implements Serializable {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Gradient$Type;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "LINEAR", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type implements Serializable {
        LINEAR(0);
        
        public static final Companion Companion = new Companion(null);
        private int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Gradient$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/preview/Gradient$Type;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.preview.Gradient$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: b */
            private final Type m131875b(int i) {
                if (i != 0) {
                    return Type.LINEAR;
                }
                return Type.LINEAR;
            }

            /* renamed from: a */
            public final Type mo125715a(int i) {
                return m131875b(i);
            }
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i) {
            this.value = i;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static /* synthetic */ Gradient copy$default(Gradient gradient, Type type2, Content content2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = gradient.type;
        }
        if ((i & 2) != 0) {
            content2 = gradient.content;
        }
        return gradient.copy(type2, content2);
    }

    public final Type component1() {
        return this.type;
    }

    public final Content component2() {
        return this.content;
    }

    public final Gradient copy(Type type2, Content content2) {
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(content2, "content");
        return new Gradient(type2, content2);
    }

    public String toString() {
        return "Gradient(type=" + this.type + ", content=" + this.content + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Gradient$Linear;", "Ljava/io/Serializable;", "Lcom/ss/android/lark/chat/entity/preview/Gradient$Content;", "deg", "", "themeColors", "", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "(Ljava/lang/Integer;Ljava/util/List;)V", "getDeg", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getThemeColors", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/ss/android/lark/chat/entity/preview/Gradient$Linear;", "equals", "", "other", "", "hashCode", "toString", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Linear extends Content implements Serializable {
        private final Integer deg;
        private final List<ThemeColor> themeColors;

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.entity.preview.Gradient$Linear */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Linear copy$default(Linear linear, Integer num, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                num = linear.deg;
            }
            if ((i & 2) != 0) {
                list = linear.themeColors;
            }
            return linear.copy(num, list);
        }

        public final Integer component1() {
            return this.deg;
        }

        public final List<ThemeColor> component2() {
            return this.themeColors;
        }

        public final Linear copy(Integer num, List<ThemeColor> list) {
            return new Linear(num, list);
        }

        public String toString() {
            return "Linear(deg=" + this.deg + ", themeColors=" + this.themeColors + ")";
        }

        public final Integer getDeg() {
            return this.deg;
        }

        public final List<ThemeColor> getThemeColors() {
            return this.themeColors;
        }

        public int hashCode() {
            int i;
            Integer num = this.deg;
            int i2 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            List<ThemeColor> list = this.themeColors;
            if (list != null) {
                i2 = list.hashCode();
            }
            return i3 + i2;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                Linear linear = (Linear) obj;
                if (!(!Intrinsics.areEqual(this.deg, linear.deg)) && !(!Intrinsics.areEqual(this.themeColors, linear.themeColors))) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Gradient.Linear");
        }

        public Linear(Integer num, List<ThemeColor> list) {
            this.deg = num;
            this.themeColors = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Linear(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, list);
        }
    }

    public final Content getContent() {
        return this.content;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.content.hashCode();
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            Gradient gradient = (Gradient) obj;
            if (this.type == gradient.type && !(!Intrinsics.areEqual(this.content, gradient.content))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Gradient");
    }

    public Gradient(Type type2, Content content2) {
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(content2, "content");
        this.type = type2;
        this.content = content2;
    }
}
