package com.ss.android.lark.calendar.impl.features.calendars.share.picker.data;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 '2\u00020\u0001:\u0002&'B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "Ljava/io/Serializable;", "builder", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;)V", "getBuilder", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;", "calendarShareExtraParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "getCalendarShareExtraParam", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "setCalendarShareExtraParam", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;)V", "disableSelectIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisableSelectIds", "()Ljava/util/ArrayList;", "setDisableSelectIds", "(Ljava/util/ArrayList;)V", "isFromCalendarCreate", "", "()Z", "pickerSubTitle", "getPickerSubTitle", "()Ljava/lang/String;", "setPickerSubTitle", "(Ljava/lang/String;)V", "pickerTitle", "getPickerTitle", "setPickerTitle", "showLeftSkipIcon", "getShowLeftSkipIcon", "setShowLeftSkipIcon", "(Z)V", "shownNextActionAtTop", "getShownNextActionAtTop", "Builder", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarMemberPickerData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final Builder builder;
    private CalendarShareExtraParam calendarShareExtraParam;
    private ArrayList<String> disableSelectIds;
    private final boolean isFromCalendarCreate;
    private String pickerSubTitle;
    private String pickerTitle;
    private boolean showLeftSkipIcon;
    private final boolean shownNextActionAtTop;

    @JvmStatic
    public static final CalendarMemberPickerData build(Function1<? super Builder, Unit> function1) {
        return Companion.mo110154a(function1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001a\u0010!\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;", "Ljava/io/Serializable;", "()V", "calendarShareExtraParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "getCalendarShareExtraParam", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "setCalendarShareExtraParam", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;)V", "disableSelectIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisableSelectIds", "()Ljava/util/ArrayList;", "setDisableSelectIds", "(Ljava/util/ArrayList;)V", "isFromCalendarCreate", "", "()Z", "setFromCalendarCreate", "(Z)V", "pickerSubTitle", "getPickerSubTitle", "()Ljava/lang/String;", "setPickerSubTitle", "(Ljava/lang/String;)V", "pickerTitle", "getPickerTitle", "setPickerTitle", "showLeftSkipIcon", "getShowLeftSkipIcon", "setShowLeftSkipIcon", "showNextAtTop", "getShowNextAtTop", "setShowNextAtTop", "build", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Builder implements Serializable {
        private CalendarShareExtraParam calendarShareExtraParam;
        private ArrayList<String> disableSelectIds;
        private boolean isFromCalendarCreate;
        private String pickerSubTitle = "";
        private String pickerTitle = "";
        private boolean showLeftSkipIcon;
        private boolean showNextAtTop;

        public final CalendarShareExtraParam getCalendarShareExtraParam() {
            return this.calendarShareExtraParam;
        }

        public final ArrayList<String> getDisableSelectIds() {
            return this.disableSelectIds;
        }

        public final String getPickerSubTitle() {
            return this.pickerSubTitle;
        }

        public final String getPickerTitle() {
            return this.pickerTitle;
        }

        public final boolean getShowLeftSkipIcon() {
            return this.showLeftSkipIcon;
        }

        public final boolean getShowNextAtTop() {
            return this.showNextAtTop;
        }

        public final boolean isFromCalendarCreate() {
            return this.isFromCalendarCreate;
        }

        public final CalendarMemberPickerData build() {
            return new CalendarMemberPickerData(this, null);
        }

        public final void setCalendarShareExtraParam(CalendarShareExtraParam calendarShareExtraParam2) {
            this.calendarShareExtraParam = calendarShareExtraParam2;
        }

        public final void setDisableSelectIds(ArrayList<String> arrayList) {
            this.disableSelectIds = arrayList;
        }

        public final void setFromCalendarCreate(boolean z) {
            this.isFromCalendarCreate = z;
        }

        public final void setShowLeftSkipIcon(boolean z) {
            this.showLeftSkipIcon = z;
        }

        public final void setShowNextAtTop(boolean z) {
            this.showNextAtTop = z;
        }

        public final void setPickerSubTitle(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pickerSubTitle = str;
        }

        public final void setPickerTitle(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.pickerTitle = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007J\f\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u0004¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Companion;", "", "()V", "build", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "block", "Lkotlin/Function1;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData$Builder;", "", "Lkotlin/ExtensionFunctionType;", "getFullTitle", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CalendarMemberPickerData mo110154a(Function1<? super Builder, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "block");
            Builder builder = new Builder();
            function1.invoke(builder);
            return builder.build();
        }

        /* renamed from: a */
        public final String mo110155a(CalendarMemberPickerData calendarMemberPickerData) {
            String str;
            boolean z;
            String str2;
            String str3 = null;
            if (calendarMemberPickerData != null) {
                str = calendarMemberPickerData.getPickerTitle();
            } else {
                str = null;
            }
            if (calendarMemberPickerData != null) {
                str3 = calendarMemberPickerData.getPickerSubTitle();
            }
            StringBuilder sb = new StringBuilder();
            String str4 = str;
            boolean z2 = false;
            if (str4 == null || str4.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = C32634ae.m125182b(R.string.Calendar_Common_ShareCalendar);
            }
            sb.append(str);
            String str5 = str3;
            if (str5 == null || str5.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str2 = "";
            } else {
                str2 = '\n' + str3;
            }
            sb.append(str2);
            return sb.toString();
        }
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final CalendarShareExtraParam getCalendarShareExtraParam() {
        return this.calendarShareExtraParam;
    }

    public final ArrayList<String> getDisableSelectIds() {
        return this.disableSelectIds;
    }

    public final String getPickerSubTitle() {
        return this.pickerSubTitle;
    }

    public final String getPickerTitle() {
        return this.pickerTitle;
    }

    public final boolean getShowLeftSkipIcon() {
        return this.showLeftSkipIcon;
    }

    public final boolean getShownNextActionAtTop() {
        return this.shownNextActionAtTop;
    }

    public final boolean isFromCalendarCreate() {
        return this.isFromCalendarCreate;
    }

    public final void setCalendarShareExtraParam(CalendarShareExtraParam calendarShareExtraParam2) {
        this.calendarShareExtraParam = calendarShareExtraParam2;
    }

    public final void setDisableSelectIds(ArrayList<String> arrayList) {
        this.disableSelectIds = arrayList;
    }

    public final void setShowLeftSkipIcon(boolean z) {
        this.showLeftSkipIcon = z;
    }

    public final void setPickerSubTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pickerSubTitle = str;
    }

    public final void setPickerTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pickerTitle = str;
    }

    private CalendarMemberPickerData(Builder builder2) {
        this.builder = builder2;
        this.calendarShareExtraParam = builder2.getCalendarShareExtraParam();
        this.pickerTitle = builder2.getPickerTitle();
        this.pickerSubTitle = builder2.getPickerSubTitle();
        this.showLeftSkipIcon = builder2.getShowLeftSkipIcon();
        this.disableSelectIds = builder2.getDisableSelectIds();
        this.shownNextActionAtTop = builder2.getShowNextAtTop();
        this.isFromCalendarCreate = builder2.isFromCalendarCreate();
    }

    public /* synthetic */ CalendarMemberPickerData(Builder builder2, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder2);
    }
}
