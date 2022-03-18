package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\b\"\u0004\b'\u0010\n¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment;", "Ljava/io/Serializable;", "()V", "other", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment;)V", "fileSize", "", "getFileSize", "()Ljava/lang/String;", "setFileSize", "(Ljava/lang/String;)V", "fileToken", "getFileToken", "setFileToken", "isDeleted", "", "()Z", "setDeleted", "(Z)V", "localPath", "getLocalPath", "setLocalPath", "name", "getName", "setName", "position", "", "getPosition", "()I", "setPosition", "(I)V", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "getType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "setType", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;)V", "uploaderUserId", "getUploaderUserId", "setUploaderUserId", "Type", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarEventAttachment implements Serializable {
    private String fileSize = "";
    private String fileToken = "";
    private boolean isDeleted;
    private String localPath = "";
    private String name = "";
    private int position;
    private Type type = Type.UNKNOWN;
    private String uploaderUserId = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "LOCAL", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        UNKNOWN(0),
        LOCAL(1);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @JvmStatic
        public static final Type forNumber(int i) {
            return Companion.mo119398a(i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "value", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final Type mo119398a(int i) {
                if (i == 0) {
                    return Type.UNKNOWN;
                }
                if (i != 1) {
                    return Type.UNKNOWN;
                }
                return Type.LOCAL;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private Type(int i) {
            this.number = i;
        }
    }

    public final String getFileSize() {
        return this.fileSize;
    }

    public final String getFileToken() {
        return this.fileToken;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getUploaderUserId() {
        return this.uploaderUserId;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public CalendarEventAttachment() {
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setFileSize(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.fileSize = str;
    }

    public final void setFileToken(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.fileToken = str;
    }

    public final void setLocalPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.localPath = str;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setType(Type type2) {
        Intrinsics.checkParameterIsNotNull(type2, "<set-?>");
        this.type = type2;
    }

    public final void setUploaderUserId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uploaderUserId = str;
    }

    public CalendarEventAttachment(CalendarEventAttachment calendarEventAttachment) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttachment, "other");
        this.fileToken = calendarEventAttachment.fileToken;
        this.fileSize = calendarEventAttachment.fileSize;
        this.name = calendarEventAttachment.name;
        this.localPath = calendarEventAttachment.localPath;
        this.uploaderUserId = calendarEventAttachment.uploaderUserId;
        this.isDeleted = calendarEventAttachment.isDeleted;
        this.type = calendarEventAttachment.type;
        this.position = calendarEventAttachment.position;
    }
}
