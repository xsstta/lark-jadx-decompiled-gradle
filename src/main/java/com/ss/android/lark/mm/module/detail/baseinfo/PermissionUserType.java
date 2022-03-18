package com.ss.android.lark.mm.module.detail.baseinfo;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/PermissionUserType;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Unknown", "LarkUser", "Room", "DocUser", "NeoUser", "NeoGuestUser", "PSTN", "SIP", "ShareBoxUser", "OpenPlatformAPP", "MeetingBot", "Says", "Guest", "AutoDetect", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum PermissionUserType implements Serializable {
    Unknown(0),
    LarkUser(1),
    Room(2),
    DocUser(3),
    NeoUser(4),
    NeoGuestUser(5),
    PSTN(6),
    SIP(7),
    ShareBoxUser(8),
    OpenPlatformAPP(9),
    MeetingBot(10),
    Says(59),
    Guest(99),
    AutoDetect(100);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/PermissionUserType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/mm/module/detail/baseinfo/PermissionUserType;", "value", "", "toBaseUserType", "Lcom/ss/android/lark/mm/module/detail/baseinfo/BaseUserType;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.PermissionUserType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BaseUserType mo161614a(int i) {
            if (i != 1) {
                return BaseUserType.UNKNOWN;
            }
            return BaseUserType.USER;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private PermissionUserType(int i) {
        this.value = i;
    }
}
