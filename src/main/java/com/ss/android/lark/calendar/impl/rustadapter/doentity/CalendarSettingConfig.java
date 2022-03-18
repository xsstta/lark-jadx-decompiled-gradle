package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSettingConfig;", "Ljava/io/Serializable;", "langAlternateCalendarMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;", "(Ljava/util/Map;)V", "getLangAlternateCalendarMap", "()Ljava/util/Map;", "setLangAlternateCalendarMap", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSettingConfig implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private Map<String, ? extends CalendarSetting.AlternateCalendar> langAlternateCalendarMap;

    public CalendarSettingConfig() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSettingConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarSettingConfig copy$default(CalendarSettingConfig calendarSettingConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = calendarSettingConfig.langAlternateCalendarMap;
        }
        return calendarSettingConfig.copy(map);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar>, java.util.Map<java.lang.String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar> */
    public final Map<String, CalendarSetting.AlternateCalendar> component1() {
        return this.langAlternateCalendarMap;
    }

    public final CalendarSettingConfig copy(Map<String, ? extends CalendarSetting.AlternateCalendar> map) {
        return new CalendarSettingConfig(map);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CalendarSettingConfig) && Intrinsics.areEqual(this.langAlternateCalendarMap, ((CalendarSettingConfig) obj).langAlternateCalendarMap);
        }
        return true;
    }

    public int hashCode() {
        Map<String, ? extends CalendarSetting.AlternateCalendar> map = this.langAlternateCalendarMap;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CalendarSettingConfig(langAlternateCalendarMap=" + this.langAlternateCalendarMap + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSettingConfig$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSettingConfig$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar>, java.util.Map<java.lang.String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$AlternateCalendar> */
    public final Map<String, CalendarSetting.AlternateCalendar> getLangAlternateCalendarMap() {
        return this.langAlternateCalendarMap;
    }

    public final void setLangAlternateCalendarMap(Map<String, ? extends CalendarSetting.AlternateCalendar> map) {
        this.langAlternateCalendarMap = map;
    }

    public CalendarSettingConfig(Map<String, ? extends CalendarSetting.AlternateCalendar> map) {
        this.langAlternateCalendarMap = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarSettingConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
