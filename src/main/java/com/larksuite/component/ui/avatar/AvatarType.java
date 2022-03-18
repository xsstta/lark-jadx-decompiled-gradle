package com.larksuite.component.ui.avatar;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CHAT", "THRED", "TOPIC", "DOC", "CHATTER", "MICROAPP", "Companion", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum AvatarType {
    UNKNOWN(0),
    CHAT(1),
    THRED(2),
    TOPIC(3),
    DOC(4),
    CHATTER(5),
    MICROAPP(6);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final AvatarType valueOf(int i) {
        return Companion.mo88979a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarType$Companion;", "", "()V", "valueOf", "Lcom/larksuite/component/ui/avatar/AvatarType;", "value", "", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.avatar.AvatarType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final AvatarType mo88979a(int i) {
            boolean z;
            AvatarType[] values = AvatarType.values();
            for (AvatarType avatarType : values) {
                if (avatarType.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return avatarType;
                }
            }
            return null;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private AvatarType(int i) {
        this.value = i;
    }
}
