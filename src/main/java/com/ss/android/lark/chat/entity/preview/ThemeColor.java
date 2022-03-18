package com.ss.android.lark.chat.entity.preview;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "Ljava/io/Serializable;", "token", "", "value", "", "key", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor$Key;", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ss/android/lark/chat/entity/preview/ThemeColor$Key;)V", "getKey", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor$Key;", "getToken", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/ss/android/lark/chat/entity/preview/ThemeColor$Key;)Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "equals", "", "other", "", "hashCode", "toString", "Key", "KeyType", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ThemeColor implements Serializable {
    private final Key key;
    private final String token;
    private final Integer value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;", "", "value", "", "(Ljava/lang/String;II)V", "N", "B", "W", "T", "G", "L", "Y", "S", "O", "R", "C", "V", "P", "I", "STATIC_WHITE", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum KeyType {
        N(0),
        B(1),
        W(2),
        T(3),
        G(4),
        L(5),
        Y(6),
        S(7),
        O(8),
        R(9),
        C(10),
        V(11),
        P(12),
        I(13),
        STATIC_WHITE(14);
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;", "value", "", "(Ljava/lang/Integer;)Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.preview.ThemeColor$KeyType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final KeyType mo125795a(Integer num) {
                if (num != null && num.intValue() == 0) {
                    return KeyType.N;
                }
                if (num != null && num.intValue() == 1) {
                    return KeyType.B;
                }
                if (num != null && num.intValue() == 2) {
                    return KeyType.W;
                }
                if (num != null && num.intValue() == 3) {
                    return KeyType.T;
                }
                if (num != null && num.intValue() == 4) {
                    return KeyType.G;
                }
                if (num != null && num.intValue() == 5) {
                    return KeyType.L;
                }
                if (num != null && num.intValue() == 6) {
                    return KeyType.Y;
                }
                if (num != null && num.intValue() == 7) {
                    return KeyType.S;
                }
                if (num != null && num.intValue() == 8) {
                    return KeyType.O;
                }
                if (num != null && num.intValue() == 9) {
                    return KeyType.R;
                }
                if (num != null && num.intValue() == 10) {
                    return KeyType.C;
                }
                if (num != null && num.intValue() == 11) {
                    return KeyType.V;
                }
                if (num != null && num.intValue() == 12) {
                    return KeyType.P;
                }
                if (num != null && num.intValue() == 13) {
                    return KeyType.I;
                }
                if (num != null && num.intValue() == 14) {
                    return KeyType.STATIC_WHITE;
                }
                return null;
            }
        }

        private KeyType(int i) {
        }
    }

    public static /* synthetic */ ThemeColor copy$default(ThemeColor themeColor, String str, Integer num, Key key2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeColor.token;
        }
        if ((i & 2) != 0) {
            num = themeColor.value;
        }
        if ((i & 4) != 0) {
            key2 = themeColor.key;
        }
        return themeColor.copy(str, num, key2);
    }

    public final String component1() {
        return this.token;
    }

    public final Integer component2() {
        return this.value;
    }

    public final Key component3() {
        return this.key;
    }

    public final ThemeColor copy(String str, Integer num, Key key2) {
        Intrinsics.checkParameterIsNotNull(key2, "key");
        return new ThemeColor(str, num, key2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeColor)) {
            return false;
        }
        ThemeColor themeColor = (ThemeColor) obj;
        return Intrinsics.areEqual(this.token, themeColor.token) && Intrinsics.areEqual(this.value, themeColor.value) && Intrinsics.areEqual(this.key, themeColor.key);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.value;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Key key2 = this.key;
        if (key2 != null) {
            i = key2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ThemeColor(token=" + this.token + ", value=" + this.value + ", key=" + this.key + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/ThemeColor$Key;", "Ljava/io/Serializable;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;", "value", "", "alpha", "(Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;Ljava/lang/Integer;I)V", "getAlpha", "()I", "getType", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/ss/android/lark/chat/entity/preview/ThemeColor$KeyType;Ljava/lang/Integer;I)Lcom/ss/android/lark/chat/entity/preview/ThemeColor$Key;", "equals", "", "other", "", "hashCode", "toString", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Key implements Serializable {
        private final int alpha;
        private final KeyType type;
        private final Integer value;

        public Key() {
            this(null, null, 0, 7, null);
        }

        public static /* synthetic */ Key copy$default(Key key, KeyType keyType, Integer num, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                keyType = key.type;
            }
            if ((i2 & 2) != 0) {
                num = key.value;
            }
            if ((i2 & 4) != 0) {
                i = key.alpha;
            }
            return key.copy(keyType, num, i);
        }

        public final KeyType component1() {
            return this.type;
        }

        public final Integer component2() {
            return this.value;
        }

        public final int component3() {
            return this.alpha;
        }

        public final Key copy(KeyType keyType, Integer num, int i) {
            return new Key(keyType, num, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.areEqual(this.type, key.type) && Intrinsics.areEqual(this.value, key.value) && this.alpha == key.alpha;
        }

        public int hashCode() {
            KeyType keyType = this.type;
            int i = 0;
            int hashCode = (keyType != null ? keyType.hashCode() : 0) * 31;
            Integer num = this.value;
            if (num != null) {
                i = num.hashCode();
            }
            return ((hashCode + i) * 31) + this.alpha;
        }

        public String toString() {
            return "Key(type=" + this.type + ", value=" + this.value + ", alpha=" + this.alpha + ")";
        }

        public final int getAlpha() {
            return this.alpha;
        }

        public final KeyType getType() {
            return this.type;
        }

        public final Integer getValue() {
            return this.value;
        }

        public Key(KeyType keyType, Integer num, int i) {
            this.type = keyType;
            this.value = num;
            this.alpha = i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Key(KeyType keyType, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : keyType, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? 100 : i);
        }
    }

    public final Key getKey() {
        return this.key;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getValue() {
        return this.value;
    }

    public ThemeColor(String str, Integer num, Key key2) {
        Intrinsics.checkParameterIsNotNull(key2, "key");
        this.token = str;
        this.value = num;
        this.key = key2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThemeColor(String str, Integer num, Key key2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new Key(null, null, 0, 7, null) : key2);
    }
}
