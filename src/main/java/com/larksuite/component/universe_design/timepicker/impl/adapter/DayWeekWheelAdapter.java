package com.larksuite.component.universe_design.timepicker.impl.adapter;

import android.content.Context;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.component.universe_design.util.ResUtil;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cBI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0014\u0010\u001a\u001a\u00020\u00062\n\u0010\u001b\u001a\u00060\u0002R\u00020\u0000H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DayWeekWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DayWeekWheelAdapter$DayWeek;", "context", "Landroid/content/Context;", "mYearNum", "", "mMonthNum", "mWeeks", "", "", "minValue", "showDayInfo", "", "maxValue", "(Landroid/content/Context;II[Ljava/lang/String;IZI)V", "getContext", "()Landroid/content/Context;", "[Ljava/lang/String;", "getMinValue", "()I", "getShowDayInfo", "()Z", "getItem", "index", "getItemsCount", "indexOf", "dayWeek", "DayWeek", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.d */
public final class DayWeekWheelAdapter implements BaseWheelAdapter<DayWeek> {

    /* renamed from: a */
    public final int f63695a;

    /* renamed from: b */
    public final int f63696b;

    /* renamed from: c */
    public final String[] f63697c;

    /* renamed from: d */
    private final Context f63698d;

    /* renamed from: e */
    private final int f63699e;

    /* renamed from: f */
    private final boolean f63700f;

    /* renamed from: g */
    private final int f63701g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DayWeekWheelAdapter$DayWeek;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/IPickerViewData;", "index", "", "(Lcom/larksuite/component/universe_design/timepicker/impl/adapter/DayWeekWheelAdapter;I)V", "getIndex", "()I", "setIndex", "(I)V", "getPickerViewText", "", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.a.d$a */
    public final class DayWeek implements IPickerViewData {

        /* renamed from: b */
        private int f63703b;

        /* renamed from: b */
        public final int mo91466b() {
            return this.f63703b;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData
        /* renamed from: a */
        public String mo91459a() {
            int i = this.f63703b;
            if (i < 0 || i >= DayWeekWheelAdapter.this.mo91448a()) {
                return "";
            }
            int c = DayWeekWheelAdapter.this.mo91464c() + this.f63703b;
            CalendarDate calendarDate = new CalendarDate(DayWeekWheelAdapter.this.f63695a, DayWeekWheelAdapter.this.f63696b, c, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(ResUtil.m93300a(DayWeekWheelAdapter.this.mo91463b(), R.string.Calendar_StandardTime_DayOnlyString, "numberDay", String.valueOf(c)));
            Intrinsics.checkExpressionValueIsNotNull(sb, "StringBuilder()\n        …       value.toString()))");
            if (DayWeekWheelAdapter.this.mo91465d()) {
                sb.append("(");
                sb.append(DayWeekWheelAdapter.this.f63697c[calendarDate.getWeekDay() - 1]);
                sb.append(")");
            }
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "showStrBuilder.toString()");
            return sb2;
        }

        public DayWeek(int i) {
            this.f63703b = i;
        }
    }

    /* renamed from: b */
    public final Context mo91463b() {
        return this.f63698d;
    }

    /* renamed from: c */
    public final int mo91464c() {
        return this.f63699e;
    }

    /* renamed from: d */
    public final boolean mo91465d() {
        return this.f63700f;
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: a */
    public int mo91448a() {
        return (this.f63701g - this.f63699e) + 1;
    }

    /* renamed from: a */
    public int mo91449a(DayWeek aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dayWeek");
        return aVar.mo91466b();
    }

    @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
    /* renamed from: b */
    public int mo91452b(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return BaseWheelAdapter.C25793a.m93151a(this, obj);
    }

    /* renamed from: a */
    public DayWeek mo91453b(int i) {
        return new DayWeek(i);
    }

    public DayWeekWheelAdapter(Context context, int i, int i2, String[] strArr, int i3, boolean z, int i4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(strArr, "mWeeks");
        this.f63698d = context;
        this.f63695a = i;
        this.f63696b = i2;
        this.f63697c = strArr;
        this.f63699e = i3;
        this.f63700f = z;
        this.f63701g = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DayWeekWheelAdapter(android.content.Context r11, int r12, int r13, java.lang.String[] r14, int r15, boolean r16, int r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 16
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r7 = 1
            goto L_0x0008
        L_0x0007:
            r7 = r15
        L_0x0008:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x000e
            r8 = 1
            goto L_0x0010
        L_0x000e:
            r8 = r16
        L_0x0010:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x001a
            int r0 = com.larksuite.component.universe_design.util.DateTimeUtils.m93290a(r12, r13)
            r9 = r0
            goto L_0x001c
        L_0x001a:
            r9 = r17
        L_0x001c:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.timepicker.impl.adapter.DayWeekWheelAdapter.<init>(android.content.Context, int, int, java.lang.String[], int, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
