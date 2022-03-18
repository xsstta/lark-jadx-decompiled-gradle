package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001a¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit;", "Ljava/io/Serializable;", "()V", "conflictColor", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit$ConflictColor;", "getConflictColor", "()Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit$ConflictColor;", "setConflictColor", "(Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit$ConflictColor;)V", "conflictGuestNum", "", "getConflictGuestNum", "()I", "setConflictGuestNum", "(I)V", "conflictStr", "", "getConflictStr", "()Ljava/lang/String;", "setConflictStr", "(Ljava/lang/String;)V", "hasBusyAttendee", "", "getHasBusyAttendee", "()Z", "setHasBusyAttendee", "(Z)V", "hasOutWorkHourAttendee", "getHasOutWorkHourAttendee", "setHasOutWorkHourAttendee", "isShowInWorkHourFormat", "setShowInWorkHourFormat", "ConflictColor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ArrangeConflictUnit implements Serializable {
    public ConflictColor conflictColor;
    private int conflictGuestNum;
    public String conflictStr;
    private boolean hasBusyAttendee;
    private boolean hasOutWorkHourAttendee;
    private boolean isShowInWorkHourFormat;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit$ConflictColor;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "GRAY", "BLUE", "RED", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ConflictColor {
        GRAY(0),
        BLUE(1),
        RED(2);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit$ConflictColor$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit$ConflictColor;", "value", "", "valueOf", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.ArrangeConflictUnit$ConflictColor$a */
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

        private ConflictColor(int i) {
            this.number = i;
        }
    }

    public final int getConflictGuestNum() {
        return this.conflictGuestNum;
    }

    public final boolean getHasBusyAttendee() {
        return this.hasBusyAttendee;
    }

    public final boolean getHasOutWorkHourAttendee() {
        return this.hasOutWorkHourAttendee;
    }

    public final boolean isShowInWorkHourFormat() {
        return this.isShowInWorkHourFormat;
    }

    public final ConflictColor getConflictColor() {
        ConflictColor conflictColor2 = this.conflictColor;
        if (conflictColor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conflictColor");
        }
        return conflictColor2;
    }

    public final String getConflictStr() {
        String str = this.conflictStr;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conflictStr");
        }
        return str;
    }

    public final void setConflictGuestNum(int i) {
        this.conflictGuestNum = i;
    }

    public final void setHasBusyAttendee(boolean z) {
        this.hasBusyAttendee = z;
    }

    public final void setHasOutWorkHourAttendee(boolean z) {
        this.hasOutWorkHourAttendee = z;
    }

    public final void setShowInWorkHourFormat(boolean z) {
        this.isShowInWorkHourFormat = z;
    }

    public final void setConflictColor(ConflictColor conflictColor2) {
        Intrinsics.checkParameterIsNotNull(conflictColor2, "<set-?>");
        this.conflictColor = conflictColor2;
    }

    public final void setConflictStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.conflictStr = str;
    }
}
