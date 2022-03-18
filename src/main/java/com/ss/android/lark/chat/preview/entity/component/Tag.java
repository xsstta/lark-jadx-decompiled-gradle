package com.ss.android.lark.chat.preview.entity.component;

import com.huawei.hms.android.HwBuildEx;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001eB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/Tag;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "UNKNOWN_TAG", "OFFICIAL", "ONCALL", "BOT", "MEETING", "APPROVAL", "SECRET_CHAT", "WHOLE", "DEPARTMENT", "EXTERNAL", "PUBLIC", "GROUP_ADMIN", "SUPERVISOR", "STOPPED", "OFFLINE", "DELETED", "UNACTIVATED", "EDU", "FROZEN", "ONCALL_OFFLINE", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Tag implements Serializable {
    UNKNOWN_TAG(0),
    OFFICIAL(1),
    ONCALL(2),
    BOT(3),
    MEETING(4),
    APPROVAL(5),
    SECRET_CHAT(6),
    WHOLE(7),
    DEPARTMENT(8),
    EXTERNAL(9),
    PUBLIC(10),
    GROUP_ADMIN(11),
    SUPERVISOR(12),
    STOPPED(13),
    OFFLINE(14),
    DELETED(15),
    UNACTIVATED(16),
    EDU(17),
    FROZEN(18),
    ONCALL_OFFLINE(100);
    
    public static final Companion Companion = new Companion(null);
    private int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/Tag$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/preview/entity/component/Tag;", "value", "", "valueOf", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.entity.component.Tag$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Tag mo126433a(int i) {
            return m132480b(i);
        }

        /* renamed from: b */
        private final Tag m132480b(int i) {
            if (i == 100) {
                return Tag.ONCALL_OFFLINE;
            }
            switch (i) {
                case 0:
                default:
                    return null;
                case 1:
                    return Tag.OFFICIAL;
                case 2:
                    return Tag.ONCALL;
                case 3:
                    return Tag.BOT;
                case 4:
                    return Tag.MEETING;
                case 5:
                    return Tag.APPROVAL;
                case 6:
                    return Tag.SECRET_CHAT;
                case 7:
                    return Tag.WHOLE;
                case 8:
                    return Tag.DEPARTMENT;
                case 9:
                    return Tag.EXTERNAL;
                case 10:
                    return Tag.PUBLIC;
                case 11:
                    return Tag.GROUP_ADMIN;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return Tag.SUPERVISOR;
                case 13:
                    return Tag.STOPPED;
                case 14:
                    return Tag.OFFLINE;
                case 15:
                    return Tag.DELETED;
                case 16:
                    return Tag.UNACTIVATED;
                case 17:
                    return Tag.EDU;
                case 18:
                    return Tag.FROZEN;
            }
        }
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    private Tag(int i) {
        this.value = i;
    }
}
