package org.apache.commons.lang3.time;

import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.util.Date;
import java.util.TimeZone;

/* access modifiers changed from: package-private */
/* renamed from: org.apache.commons.lang3.time.c */
public class C69934c extends TimeZone {
    static final long serialVersionUID = 1;
    private final int offset;
    private final String zoneId;

    public boolean inDaylightTime(Date date) {
        return false;
    }

    public boolean useDaylightTime() {
        return false;
    }

    public String getID() {
        return this.zoneId;
    }

    public int getRawOffset() {
        return this.offset;
    }

    public int hashCode() {
        return this.offset;
    }

    public String toString() {
        return "[GmtTimeZone id=\"" + this.zoneId + "\",offset=" + this.offset + ']';
    }

    public void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C69934c) && this.zoneId == ((C69934c) obj).zoneId) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static StringBuilder m268313a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        return sb;
    }

    C69934c(boolean z, int i, int i2) {
        char c;
        if (i >= 24) {
            throw new IllegalArgumentException(i + " hours out of range");
        } else if (i2 < 60) {
            int i3 = ((i * 60) + i2) * CalendarSearchResultRv.f82652c;
            this.offset = z ? -i3 : i3;
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            if (z) {
                c = '-';
            } else {
                c = '+';
            }
            sb.append(c);
            StringBuilder a = m268313a(sb, i);
            a.append(':');
            this.zoneId = m268313a(a, i2).toString();
        } else {
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
    }

    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.offset;
    }
}
