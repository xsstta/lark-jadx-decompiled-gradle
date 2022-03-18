package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "Ljava/io/Serializable;", "()V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "avatarUrl", "getAvatarUrl", "setAvatarUrl", BottomDialog.f17198f, "getChatterId", "setChatterId", "department", "getDepartment", "setDepartment", "hasResigned", "", "getHasResigned", "()Z", "setHasResigned", "(Z)V", "name", "getName", "setName", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Type;", "getType", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Type;", "setType", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Type;)V", "Companion", "Type", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarEventCreator implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    public String avatarKey;
    public String avatarUrl;
    public String chatterId;
    public String department;
    private boolean hasResigned;
    public String name;
    public Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Type;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "CHATTER", "GOOGLE", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Type {
        CHATTER(1),
        GOOGLE(2);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @JvmStatic
        public static final Type forNumber(int i) {
            return Companion.mo119492b(i);
        }

        @JvmStatic
        public static final Type valueOf(int i) {
            return Companion.mo119491a(i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Type$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Type;", "value", "", "valueOf", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator$Type$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final Type mo119491a(int i) {
                return mo119492b(i);
            }

            @JvmStatic
            /* renamed from: b */
            public final Type mo119492b(int i) {
                if (i == 1) {
                    return Type.CHATTER;
                }
                if (i != 2) {
                    return null;
                }
                return Type.GOOGLE;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private Type(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getHasResigned() {
        return this.hasResigned;
    }

    public final String getAvatarKey() {
        String str = this.avatarKey;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarKey");
        }
        return str;
    }

    public final String getAvatarUrl() {
        String str = this.avatarUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatarUrl");
        }
        return str;
    }

    public final String getChatterId() {
        String str = this.chatterId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BottomDialog.f17198f);
        }
        return str;
    }

    public final String getDepartment() {
        String str = this.department;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("department");
        }
        return str;
    }

    public final String getName() {
        String str = this.name;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("name");
        }
        return str;
    }

    public final Type getType() {
        Type type2 = this.type;
        if (type2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareHitPoint.f121869d);
        }
        return type2;
    }

    public final void setHasResigned(boolean z) {
        this.hasResigned = z;
    }

    public final void setAvatarKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.avatarKey = str;
    }

    public final void setAvatarUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.avatarUrl = str;
    }

    public final void setChatterId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.chatterId = str;
    }

    public final void setDepartment(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.department = str;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setType(Type type2) {
        Intrinsics.checkParameterIsNotNull(type2, "<set-?>");
        this.type = type2;
    }
}
