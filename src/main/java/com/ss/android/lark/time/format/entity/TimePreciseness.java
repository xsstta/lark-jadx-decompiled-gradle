package com.ss.android.lark.time.format.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/time/format/entity/TimePreciseness;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "HOUR", "MINUTE", "SECOND", "Companion", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TimePreciseness {
    HOUR(0),
    MINUTE(1),
    SECOND(2);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @JvmStatic
    public static final TimePreciseness forNumber(int i) {
        return Companion.mo191648b(i);
    }

    @JvmStatic
    public static final TimePreciseness valueOf(int i) {
        return Companion.mo191647a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/time/format/entity/TimePreciseness$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/time/format/entity/TimePreciseness;", "value", "", "valueOf", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.time.format.entity.TimePreciseness$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final TimePreciseness mo191647a(int i) {
            return mo191648b(i);
        }

        @JvmStatic
        /* renamed from: b */
        public final TimePreciseness mo191648b(int i) {
            if (i == 0) {
                return TimePreciseness.HOUR;
            }
            if (i == 1) {
                return TimePreciseness.MINUTE;
            }
            if (i != 2) {
                return TimePreciseness.MINUTE;
            }
            return TimePreciseness.SECOND;
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private TimePreciseness(int i) {
        this.number = i;
    }
}
