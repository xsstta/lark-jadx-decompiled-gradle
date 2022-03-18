package com.ss.android.lark.chat.preview.entity.component;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/Justify;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "START", "CENTER", "END", "SPACE_BETWEEN", "SPACE_AROUND", "SPACE_EVENLY", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Justify implements Serializable {
    START(0),
    CENTER(1),
    END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);
    
    public static final Companion Companion = new Companion(null);
    private int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/Justify$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/preview/entity/component/Justify;", "value", "", "valueOf", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.entity.component.Justify$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Justify mo126427a(int i) {
            return m132476b(i);
        }

        /* renamed from: b */
        private final Justify m132476b(int i) {
            if (i == 0) {
                return Justify.START;
            }
            if (i == 1) {
                return Justify.CENTER;
            }
            if (i == 2) {
                return Justify.END;
            }
            if (i == 3) {
                return Justify.SPACE_BETWEEN;
            }
            if (i == 4) {
                return Justify.SPACE_AROUND;
            }
            if (i != 5) {
                return Justify.START;
            }
            return Justify.SPACE_EVENLY;
        }
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    private Justify(int i) {
        this.value = i;
    }
}
