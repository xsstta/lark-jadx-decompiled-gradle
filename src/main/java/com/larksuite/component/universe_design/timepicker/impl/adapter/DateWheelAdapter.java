package com.larksuite.component.universe_design.timepicker.impl.adapter;

import android.content.Context;
import com.huawei.hms.site.ActivityC23764o;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.DateTimeUtils;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u0014\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u0000H\u0016R\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DateWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DateWheelAdapter$DateWheelData;", "context", "Landroid/content/Context;", "beginDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "minValue", "", "maxValue", "weekStringArray", "", "", "(Landroid/content/Context;Lcom/larksuite/component/universe_design/util/CalendarDate;II[Ljava/lang/String;)V", "beginCalendarDate", "[Ljava/lang/String;", "getItem", "index", "getItemsCount", "indexOf", ActivityC23764o.f58839a, "DateWheelData", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.c */
public final class DateWheelAdapter implements BaseWheelAdapter<DateWheelData> {

    /* renamed from: a */
    public final CalendarDate f63688a;

    /* renamed from: b */
    public final Context f63689b;

    /* renamed from: c */
    public final String[] f63690c;

    /* renamed from: d */
    private final int f63691d;

    /* renamed from: e */
    private final int f63692e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DateWheelAdapter$DateWheelData;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/IPickerViewData;", "index", "", "(Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DateWheelAdapter;I)V", "getIndex", "()I", "setIndex", "(I)V", "getPickerViewText", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.c$a */
    public final class DateWheelData implements IPickerViewData {

        /* renamed from: b */
        private int f63694b;

        /* renamed from: b */
        public final int mo91460b() {
            return this.f63694b;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData
        /* renamed from: a */
        public String mo91459a() {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            CalendarDate calendarDate = new CalendarDate(DateWheelAdapter.this.f63688a, timeZone);
            calendarDate.add(5, this.f63694b);
            StringBuilder sb = new StringBuilder();
            Context context = DateWheelAdapter.this.f63689b;
            Date date = calendarDate.getDate();
            Intrinsics.checkExpressionValueIsNotNull(date, "tempCalendar.date");
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "utcTimeZone");
            sb.append(DateTimeUtils.m93291a(context, date, timeZone));
            sb.append(" ");
            sb.append(DateWheelAdapter.this.f63690c[calendarDate.getWeekDay() - 1]);
            return sb.toString();
        }

        public DateWheelData(int i) {
            this.f63694b = i;
        }
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public int mo91448a() {
        return (this.f63692e - this.f63691d) + 1;
    }

    /* renamed from: a */
    public int mo91449a(DateWheelData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, ActivityC23764o.f58839a);
        return aVar.mo91460b();
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: b */
    public int mo91452b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return BaseWheelAdapter.C25793a.m93151a(this, obj);
    }

    /* renamed from: a */
    public DateWheelData mo91453b(int i) {
        return new DateWheelData(i);
    }

    public DateWheelAdapter(Context context, CalendarDate calendarDate, int i, int i2, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(calendarDate, "beginDate");
        Intrinsics.checkParameterIsNotNull(strArr, "weekStringArray");
        this.f63689b = context;
        this.f63691d = i;
        this.f63692e = i2;
        this.f63690c = strArr;
        this.f63688a = new CalendarDate(calendarDate);
    }
}
