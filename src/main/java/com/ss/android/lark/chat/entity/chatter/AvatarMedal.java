package com.ss.android.lark.chat.entity.chatter;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/AvatarMedal;", "Ljava/io/Serializable;", "key", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarMedal implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 8256572785760276698L;
    private final String key;
    private final String name;

    public static /* synthetic */ AvatarMedal copy$default(AvatarMedal avatarMedal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarMedal.key;
        }
        if ((i & 2) != 0) {
            str2 = avatarMedal.name;
        }
        return avatarMedal.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.name;
    }

    public final AvatarMedal copy(String str, String str2) {
        return new AvatarMedal(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarMedal)) {
            return false;
        }
        AvatarMedal avatarMedal = (AvatarMedal) obj;
        return Intrinsics.areEqual(this.key, avatarMedal.key) && Intrinsics.areEqual(this.name, avatarMedal.name);
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AvatarMedal(key=" + this.key + ", name=" + this.name + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/AvatarMedal$Companion;", "", "()V", "serialVersionUID", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chatter.AvatarMedal$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public AvatarMedal(String str, String str2) {
        this.key = str;
        this.name = str2;
    }
}
