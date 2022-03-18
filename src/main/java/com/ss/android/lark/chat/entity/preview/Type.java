package com.ss.android.lark.chat.entity.preview;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Type;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "EMPTY", "LINEAR_LAYOUT", "HEADER", "RICHTEXT", "IMAGE", "CHATTERS_PREVIEW", "BUTTON", "ICON_BUTTON", "TEXT_BUTTON", "TIME", "TEXT", "TAG_LIST", "SPIN_BUTTON", "AVATAR", "VIDEO", "CARD_CONTAINER", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Type implements Serializable {
    UNKNOWN(-1),
    EMPTY(0),
    LINEAR_LAYOUT(1),
    HEADER(501),
    RICHTEXT(502),
    IMAGE(503),
    CHATTERS_PREVIEW(504),
    BUTTON(505),
    ICON_BUTTON(506),
    TEXT_BUTTON(507),
    TIME(508),
    TEXT(509),
    TAG_LIST(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR),
    SPIN_BUTTON(MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME),
    AVATAR(MediaPlayer.MEDIA_PLAYER_OPTION_APPID),
    VIDEO(MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID),
    CARD_CONTAINER(MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE);
    
    public static final Companion Companion = new Companion(null);
    private int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/preview/Type;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.preview.Type$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Type mo125798a(int i) {
            return m131882b(i);
        }

        /* renamed from: b */
        private final Type m131882b(int i) {
            if (i == 0) {
                return Type.EMPTY;
            }
            if (i == 1) {
                return Type.LINEAR_LAYOUT;
            }
            switch (i) {
                case 501:
                    return Type.HEADER;
                case 502:
                    return Type.RICHTEXT;
                case 503:
                    return Type.IMAGE;
                case 504:
                    return Type.CHATTERS_PREVIEW;
                case 505:
                    return Type.BUTTON;
                case 506:
                    return Type.ICON_BUTTON;
                case 507:
                    return Type.TEXT_BUTTON;
                case 508:
                    return Type.TIME;
                case 509:
                    return Type.TEXT;
                case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR /*{ENCODED_INT: 510}*/:
                    return Type.TAG_LIST;
                case MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME /*{ENCODED_INT: 511}*/:
                    return Type.SPIN_BUTTON;
                case MediaPlayer.MEDIA_PLAYER_OPTION_APPID /*{ENCODED_INT: 512}*/:
                    return Type.AVATAR;
                case MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID /*{ENCODED_INT: 513}*/:
                    return Type.VIDEO;
                case MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE /*{ENCODED_INT: 514}*/:
                    return Type.CARD_CONTAINER;
                default:
                    return Type.UNKNOWN;
            }
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
