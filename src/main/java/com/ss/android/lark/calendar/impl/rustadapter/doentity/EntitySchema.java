package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema;", "Ljava/io/Serializable;", "()V", "appLink", "", "getAppLink", "()Ljava/lang/String;", "setAppLink", "(Ljava/lang/String;)V", "uiLevel", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema$ItemUILevel;", "getUiLevel", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema$ItemUILevel;", "setUiLevel", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema$ItemUILevel;)V", "uniqueName", "getUniqueName", "setUniqueName", "toString", "ItemUILevel", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EntitySchema implements Serializable {
    private String appLink = "";
    private ItemUILevel uiLevel = ItemUILevel.EDITABLE;
    private String uniqueName = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema$ItemUILevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "HIDE", "READONLY", "EDITABLE", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ItemUILevel {
        HIDE(1),
        READONLY(2),
        EDITABLE(3);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @JvmStatic
        public static final ItemUILevel valueOf(int i) {
            return Companion.mo119833a(i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema$ItemUILevel$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/EntitySchema$ItemUILevel;", "value", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema$ItemUILevel$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final ItemUILevel mo119833a(int i) {
                if (i == 1) {
                    return ItemUILevel.HIDE;
                }
                if (i == 2) {
                    return ItemUILevel.READONLY;
                }
                if (i != 3) {
                    return ItemUILevel.HIDE;
                }
                return ItemUILevel.EDITABLE;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ItemUILevel(int i) {
            this.value = i;
        }
    }

    public final String getAppLink() {
        return this.appLink;
    }

    public final ItemUILevel getUiLevel() {
        return this.uiLevel;
    }

    public final String getUniqueName() {
        return this.uniqueName;
    }

    public String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{\"unique_name\":\"" + this.uniqueName + "\", \"ui_level\": " + this.uiLevel.getValue());
        if (this.appLink.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "}";
        } else {
            str = ",\"app_link\":\"" + this.appLink + "\"}";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void setAppLink(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.appLink = str;
    }

    public final void setUiLevel(ItemUILevel itemUILevel) {
        Intrinsics.checkParameterIsNotNull(itemUILevel, "<set-?>");
        this.uiLevel = itemUILevel;
    }

    public final void setUniqueName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uniqueName = str;
    }
}
