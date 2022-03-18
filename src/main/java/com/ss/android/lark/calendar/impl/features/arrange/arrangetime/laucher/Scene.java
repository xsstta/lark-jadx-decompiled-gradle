package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "EDIT", "FREEBUSY", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum Scene {
    EDIT(1),
    FREEBUSY(2);
    
    public static final Companion Companion = new Companion(null);
    private final int number;

    @JvmStatic
    public static final Scene forNumber(int i) {
        return Companion.mo108971b(i);
    }

    @JvmStatic
    public static final Scene valueOf(int i) {
        return Companion.mo108970a(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/laucher/Scene;", "value", "", "valueOf", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.Scene$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Scene mo108970a(int i) {
            return mo108971b(i);
        }

        @JvmStatic
        /* renamed from: b */
        public final Scene mo108971b(int i) {
            if (i == 1) {
                return Scene.EDIT;
            }
            if (i != 2) {
                return Scene.EDIT;
            }
            return Scene.FREEBUSY;
        }
    }

    public final int getNumber() {
        return this.number;
    }

    private Scene(int i) {
        this.number = i;
    }
}
