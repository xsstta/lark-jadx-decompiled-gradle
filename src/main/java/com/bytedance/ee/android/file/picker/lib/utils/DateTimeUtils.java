package com.bytedance.ee.android.file.picker.lib.utils;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/DateTimeUtils;", "", "()V", "buildDisplayDigit", "", "time", "", "getDisplayDuration", "durationMs", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.d */
public final class DateTimeUtils {

    /* renamed from: a */
    public static final DateTimeUtils f12470a = new DateTimeUtils();

    private DateTimeUtils() {
    }

    /* renamed from: b */
    private final String m17123b(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('0');
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo16096a(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        return m17123b(i4 / 60) + ":" + m17123b(i4 % 60) + ":" + m17123b(i3);
    }
}
