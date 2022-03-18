package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneUtils;", "", "()V", "getShortDispalyNameByOffset", "", "offset", "", "getSplitedTimeZoneText", "timeZoneText", "needSplitLen", "getTimeZoneWithoutExtraZore", "timeZoneStr", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.n */
public final class TimeZoneUtils {

    /* renamed from: a */
    public static final TimeZoneUtils f112068a = new TimeZoneUtils();

    private TimeZoneUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m174942a(int i) {
        String str;
        String str2;
        int i2 = i / 60;
        int i3 = i2 / 60;
        int abs = Math.abs(i2 % 60);
        if (i3 >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(i3);
            str = sb.toString();
        } else {
            str = String.valueOf(i3);
        }
        if (abs < 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(abs);
            str2 = sb2.toString();
        } else {
            str2 = String.valueOf(abs);
        }
        return "GMT" + str + ':' + str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    @kotlin.jvm.JvmStatic
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m174943a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.time.multitimezone.TimeZoneUtils.m174943a(java.lang.String):java.lang.String");
    }
}
