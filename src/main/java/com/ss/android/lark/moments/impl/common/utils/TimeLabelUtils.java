package com.ss.android.lark.moments.impl.common.utils;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/TimeLabelUtils;", "", "()V", "getBroadcastDateLabel", "", "context", "Landroid/content/Context;", "timeMillis", "", "getCurrentDateAfter", "Ljava/util/Calendar;", "day", "", "getTimeLabelText", "targetTime", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.j */
public final class TimeLabelUtils {

    /* renamed from: a */
    public static final TimeLabelUtils f119256a = new TimeLabelUtils();

    private TimeLabelUtils() {
    }

    /* renamed from: a */
    public final Calendar mo166219a(int i) {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(5, instance.get(5) + i);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return instance;
    }

    /* renamed from: a */
    public final String mo166217a(long j) {
        LengthType lengthType;
        long currentTimeMillis = System.currentTimeMillis();
        int i = (int) ((currentTimeMillis - j) / ((long) CalendarSearchResultRv.f82652c));
        int i2 = i / 60;
        if (i2 >= 24) {
            Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(currentTimeMillis));
            int i3 = instance.get(1);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(new Date(j));
            if (i3 == instance2.get(1)) {
                lengthType = LengthType.SHORT;
            } else {
                lengthType = LengthType.LONG;
            }
            aVar.mo191593a(lengthType);
            Context context = UIHelper.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "UIHelper.getContext()");
            return TimeFormatUtils.m219289e(context, new Date(j), aVar);
        } else if (i2 >= 1) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Community_PastHours, "pastHour", String.valueOf(i2));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…ur\", durHours.toString())");
            return mustacheFormat;
        } else if (i >= 1) {
            String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Community_PastMinutes, "pastMinute", String.valueOf(i));
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…\", durMinutes.toString())");
            return mustacheFormat2;
        } else {
            String string = UIHelper.getString(R.string.Lark_Community_JustNow);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Community_JustNow)");
            return string;
        }
    }

    /* renamed from: a */
    public final String mo166218a(Context context, long j) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Date date = new Date(j);
        TimePreciseness timePreciseness = TimePreciseness.MINUTE;
        return TimeFormatUtils.m219292g(context, date, new Options(null, DisplayPattern.ABSOLUTE, LengthType.LONG, null, timePreciseness, false, false, false, false, 425, null));
    }
}
