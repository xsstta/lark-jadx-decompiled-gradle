package com.ss.android.lark.chat.entity.chat;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TEAM_CHAT_TYPE_UNKNOWN", "TEAM_CHAT_TYPE_DEFAULT", "TEAM_CHAT_TYPE_PUBLIC", "TEAM_CHAT_TYPE_PRIVATE", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TeamChatType {
    TEAM_CHAT_TYPE_UNKNOWN(0),
    TEAM_CHAT_TYPE_DEFAULT(1),
    TEAM_CHAT_TYPE_PUBLIC(2),
    TEAM_CHAT_TYPE_PRIVATE(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @JvmStatic
    public static final TeamChatType fromValue(int i) {
        return Companion.mo124703a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/TeamChatType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "value", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.chat.TeamChatType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TeamChatType mo124703a(int i) {
            if (i == TeamChatType.TEAM_CHAT_TYPE_DEFAULT.getValue()) {
                return TeamChatType.TEAM_CHAT_TYPE_DEFAULT;
            }
            if (i == TeamChatType.TEAM_CHAT_TYPE_PUBLIC.getValue()) {
                return TeamChatType.TEAM_CHAT_TYPE_PUBLIC;
            }
            if (i == TeamChatType.TEAM_CHAT_TYPE_PRIVATE.getValue()) {
                return TeamChatType.TEAM_CHAT_TYPE_PRIVATE;
            }
            return TeamChatType.TEAM_CHAT_TYPE_UNKNOWN;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private TeamChatType(int i) {
        this.value = i;
    }
}
