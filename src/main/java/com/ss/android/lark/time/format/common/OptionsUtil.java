package com.ss.android.lark.time.format.common;

import android.text.TextUtils;
import com.ss.android.lark.time.format.Options;
import com.ss.ttm.player.MediaPlayer;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/time/format/common/OptionsUtil;", "", "()V", "generateOptionsIfEmpty", "Lcom/ss/android/lark/time/format/Options;", "options", "getTimezoneById", "Ljava/util/TimeZone;", "timeZoneId", "", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a.d */
public final class OptionsUtil {

    /* renamed from: a */
    public static final OptionsUtil f139149a = new OptionsUtil();

    private OptionsUtil() {
    }

    /* renamed from: a */
    public final Options mo191618a(Options aVar) {
        if (aVar == null) {
            return new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        }
        return aVar;
    }

    /* renamed from: a */
    public final TimeZone mo191619a(String str) {
        if (TextUtils.isEmpty(str)) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            return timeZone;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str);
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getTimeZone(timeZoneId)");
        return timeZone2;
    }
}
