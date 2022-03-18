package com.ss.android.lark.chat.export.entity.chatter;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/ChatterType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "USER", "BOT", "Companion", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum ChatterType {
    UNKNOWN(0),
    USER(1),
    BOT(2);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/ChatterType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/export/entity/chatter/ChatterType;", "value", "", "valueOf", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.export.entity.chatter.ChatterType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private ChatterType(int i) {
        this.number = i;
    }
}
