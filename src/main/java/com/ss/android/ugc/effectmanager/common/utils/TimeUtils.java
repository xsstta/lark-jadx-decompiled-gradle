package com.ss.android.ugc.effectmanager.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/TimeUtils;", "", "()V", "currentTime", "", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.t */
public final class TimeUtils {

    /* renamed from: a */
    public static final TimeUtils f151364a = new TimeUtils();

    private TimeUtils() {
    }

    /* renamed from: a */
    public final String mo207280a() {
        String format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS").format(new Date());
        Intrinsics.checkExpressionValueIsNotNull(format, "simpleDateFormat.format(Date())");
        return format;
    }
}
