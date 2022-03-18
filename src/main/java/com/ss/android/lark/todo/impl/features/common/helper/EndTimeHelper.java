package com.ss.android.lark.todo.impl.features.common.helper;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.todo.impl.features.common.entity.EndTimeTextAttribute;
import com.ss.android.lark.todo.impl.utils.DayCompareUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J2\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eJ0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/helper/EndTimeHelper;", "", "()V", "getCorrectTimeStamp", "", "timeStamp", "timeZone", "Ljava/util/TimeZone;", "getEndTimeTextAttribute", "Lcom/ss/android/lark/todo/impl/features/common/entity/EndTimeTextAttribute;", "context", "Landroid/content/Context;", "endTimeStamp", "isAllDay", "", "isTwentyFourHour", "isFromOptionCard", "getTimeColor", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.helper.b */
public final class EndTimeHelper {

    /* renamed from: a */
    public static final EndTimeHelper f139399a = new EndTimeHelper();

    private EndTimeHelper() {
    }

    /* renamed from: a */
    private final long m219790a(long j, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), 0, 0, 0).getTimeInMillis();
    }

    /* renamed from: a */
    private final int m219789a(Context context, long j, boolean z, TimeZone timeZone, boolean z2) {
        int i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(new Date(j));
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
        int a = DayCompareUtil.f139259a.mo191763a(gregorianCalendar) - DayCompareUtil.f139259a.mo191763a(gregorianCalendar2);
        if (a == 0) {
            if (!z && gregorianCalendar.getTimeInMillis() < gregorianCalendar2.getTimeInMillis()) {
                return C57582a.m223616d(context, R.color.function_danger_500);
            }
            if (z2) {
                return C57582a.m223616d(context, R.color.text_link_normal);
            }
            return C57582a.m223616d(context, R.color.primary_pri_500);
        } else if (a <= 0) {
            return C57582a.m223616d(context, R.color.function_danger_500);
        } else {
            if (z2) {
                i = R.color.text_title;
            } else {
                i = R.color.text_placeholder;
            }
            return C57582a.m223616d(context, i);
        }
    }

    /* renamed from: a */
    public final EndTimeTextAttribute mo191999a(Context context, long j, boolean z, boolean z2, boolean z3) {
        String h;
        long j2 = j;
        if (context == null || j2 <= 0) {
            return new EndTimeTextAttribute("", ResUtil.f139261a.mo191775a(R.color.lkui_N500));
        }
        TimeZone timeZone = TimeZone.getDefault();
        if (z) {
            TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
            Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getTimeZone(\"UTC\")");
            j2 = m219790a(j2, timeZone2);
            Date date = new Date(j2);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
            String id = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id, "timeZone.id");
            h = TimeFormatUtils.m219291f(context, date, new Options(id, DisplayPattern.RELATIVE, LengthType.LONG, null, null, false, false, false, false, 504, null));
        } else {
            Date date2 = new Date(j2);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
            String id2 = timeZone.getID();
            Intrinsics.checkExpressionValueIsNotNull(id2, "timeZone.id");
            h = TimeFormatUtils.m219293h(context, date2, new Options(id2, DisplayPattern.RELATIVE, null, null, TimePreciseness.MINUTE, false, !z2, false, false, 268, null));
        }
        return new EndTimeTextAttribute(h, m219789a(context, j2, z, timeZone, z3));
    }

    /* renamed from: a */
    public static /* synthetic */ EndTimeTextAttribute m219791a(EndTimeHelper bVar, Context context, long j, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        if ((i & 16) != 0) {
            z4 = false;
        } else {
            z4 = z3;
        }
        return bVar.mo191999a(context, j, z, z2, z4);
    }
}
