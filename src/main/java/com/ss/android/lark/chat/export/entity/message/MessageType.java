package com.ss.android.lark.chat.export.entity.message;

import com.google.android.gms.stats.CodePackage;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "TEXT_IMAGE", "POST", "FILE", "TEXT", "IMAGE", "SYSTEM", "AUDIO", "EMAIL", "SHARE_GROUP_CHAT", "STICKER", "MERGE_FORWARD", "CALENDAR", "CARD", "MEDIA", "SHARE_CALENDAR_EVENT", "RED_PACKET", "GENERAL_CALENDAR", "VIDEO_CHAT", CodePackage.LOCATION, "COMMERCIALIZED_HONGBAO", "PROFILE", "TODO", "FOLDER", "Companion", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MessageType {
    UNKNOWN(-1),
    TEXT_IMAGE(1),
    POST(2),
    FILE(3),
    TEXT(4),
    IMAGE(5),
    SYSTEM(6),
    AUDIO(7),
    EMAIL(8),
    SHARE_GROUP_CHAT(9),
    STICKER(10),
    MERGE_FORWARD(11),
    CALENDAR(12),
    CARD(13),
    MEDIA(15),
    SHARE_CALENDAR_EVENT(16),
    RED_PACKET(17),
    GENERAL_CALENDAR(18),
    VIDEO_CHAT(19),
    LOCATION(20),
    COMMERCIALIZED_HONGBAO(22),
    PROFILE(23),
    TODO(24),
    FOLDER(25);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/MessageType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "value", "", "valueOf", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.export.entity.message.MessageType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MessageType mo126090a(int i) {
            switch (i) {
                case 1:
                    return MessageType.TEXT_IMAGE;
                case 2:
                    return MessageType.POST;
                case 3:
                    return MessageType.FILE;
                case 4:
                    return MessageType.TEXT;
                case 5:
                    return MessageType.IMAGE;
                case 6:
                    return MessageType.SYSTEM;
                case 7:
                    return MessageType.AUDIO;
                case 8:
                    return MessageType.EMAIL;
                case 9:
                    return MessageType.SHARE_GROUP_CHAT;
                case 10:
                    return MessageType.STICKER;
                case 11:
                    return MessageType.MERGE_FORWARD;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return MessageType.CALENDAR;
                case 13:
                    return MessageType.CARD;
                case 14:
                case 21:
                case 24:
                default:
                    return MessageType.UNKNOWN;
                case 15:
                    return MessageType.MEDIA;
                case 16:
                    return MessageType.SHARE_CALENDAR_EVENT;
                case 17:
                    return MessageType.RED_PACKET;
                case 18:
                    return MessageType.GENERAL_CALENDAR;
                case 19:
                    return MessageType.VIDEO_CHAT;
                case 20:
                    return MessageType.LOCATION;
                case 22:
                    return MessageType.COMMERCIALIZED_HONGBAO;
                case 23:
                    return MessageType.PROFILE;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return MessageType.FOLDER;
            }
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private MessageType(int i) {
        this.number = i;
    }
}
